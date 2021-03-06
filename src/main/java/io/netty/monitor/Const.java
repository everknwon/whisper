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

public interface Const {

  Integer SERVER_PORT = 8080;
  Boolean SERVER_SSL = false;
  Boolean SERVER_CORS = false;
  Boolean SERVER_WEBSOCKET = false;
  Boolean SERVER_CONTENT_COMPRESSOR = false;
  Integer STRAP_LINE_SIZE = 10;
  String SERVER_ADDRESS = "localhost";
  String CRISPY_VERSION = "(v1.0.0 RELEASE)";
  String BANNER_TEXT = "NettyMonitor";
  String CRISPY_FRAMEWORK = " :: Netty Monitor :: ";
  String SPACE = " ";
  String SERVER_THREAD_NAME = "（'-'*)";
  String PATH_SERVER_PORT = "server.port";
  String PATH_SERVER_SSL = "server.ssl";
  String PATH_SERVER_ADDRESS = "server.address";
  String PATH_SERVER_CORS = "server.cors";
  String PATH_SERVER_WEBSOCKET = "server.websocket";
  String PATH_SERVER_WEBSOCKET_PATH = "server.websocketPath";
  String PATH_SERVER_CONTENT_COMPRESSOR = "server.autoCompression";
  String PATH_SERVER_PROFILE = "server.profile";
  String PATH_SERVER_BOOT_CONFIG = "server.boot.conf";
  String PATH_NEED_CLIENT_AUTH = "server.needClientAuth";

  // netty setting
  String PATH_SERVER_SSL_CERT = "server.ssl.cert-path";
  String PATH_SERVER_SSL_PRIVATE_KEY = "server.ssl.private-key-path";
  String PATH_SERVER_SSL_PRIVATE_KEY_PASS = "server.ssl.private-key-pass";
  String PATH_SERVER_NETTY_ACCEPT_THREAD_COUNT = "server.netty.accept-thread-count";
  String PATH_SERVER_NETTY_IO_THREAD_COUNT = "server.netty.io-thread-count";

  // netty default property
  Integer DEFAULT_ACCEPT_THREAD_COUNT = 1;
  Integer DEFAULT_IO_THREAD_COUNT = 0;

  // app setting
  String PATH_APP_BANNER_TEXT = "app.banner.text";
  String PATH_APP_BANNER_FONT = "app.banner.font";
  String PATH_APP_THREAD_NAME = "app.thread.name";

  String PATH_REDIS_PORT = "server.redis.port";
  String PATH_REDIS_HOST = "server.redis.host";

  // full property file name
  String PATH_CONFIG_PROPERTIES = "application.properties";
  String PATH_CONFIG_YAML = "application.yml";

  // setting prefix
  String PATH_PREFIX_ROOT = "PATH_PREFIX";
}
