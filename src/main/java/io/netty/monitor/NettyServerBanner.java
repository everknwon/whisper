/*
 * MIT License
 *
 * Copyright (c) 2020 1619kHz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.netty.monitor;

import io.leego.banana.BananaUtils;
import io.netty.monitor.ansi.AnsiColor;
import io.netty.monitor.ansi.AnsiOutput;
import io.netty.monitor.banner.BannerTemplate;

import java.io.PrintStream;

/**
 * @author WangYi
 * @since 2019/5/13
 */
public class NettyServerBanner extends BannerTemplate {

  @Override
  public void prePrintBannerText(PrintStream printStream, String bannerText, String bannerFont) {
    printStream.println(BananaUtils.bananaify(Const.BANNER_TEXT, bannerFont));
  }

  @Override
  public String setUpPadding(Integer strapLineSize) {
    final StringBuilder padding = new StringBuilder();
    while (padding.length() < strapLineSize - (Const.CRISPY_VERSION.length() + Const.CRISPY_FRAMEWORK.length())) {
      padding.append(Const.SPACE);
    }
    return padding.toString();
  }

  @Override
  public void printTextAndVersion(PrintStream printStream, String padding) {
    printStream.println(AnsiOutput.toString(AnsiColor.GREEN, Const.CRISPY_FRAMEWORK,
            AnsiColor.RESET, padding, Const.CRISPY_VERSION));
    printStream.println();
  }
}
