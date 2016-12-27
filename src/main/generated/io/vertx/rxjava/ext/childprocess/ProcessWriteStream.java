/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.childprocess;

import io.vertx.ext.childprocess.StreamOutput;
import io.vertx.rxjava.core.buffer.Buffer;
import io.vertx.rxjava.core.streams.WriteStream;
import io.vertx.core.Handler;

/**
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link StreamOutput original} non RX-ified interface using Vert.x codegen.
 */

public class ProcessWriteStream implements WriteStream<Buffer> {

  final StreamOutput delegate;

  public ProcessWriteStream(StreamOutput delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void end(Buffer t) { 
    delegate.end((io.vertx.core.buffer.Buffer)t.getDelegate());
  }

  public boolean writeQueueFull() { 
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  public ProcessWriteStream exceptionHandler(Handler<Throwable> handler) { 
    ((StreamOutput) delegate).exceptionHandler(handler);
    return this;
  }

  public ProcessWriteStream write(Buffer buffer) { 
    ((StreamOutput) delegate).write((io.vertx.core.buffer.Buffer)buffer.getDelegate());
    return this;
  }

  public ProcessWriteStream setWriteQueueMaxSize(int i) { 
    ((StreamOutput) delegate).setWriteQueueMaxSize(i);
    return this;
  }

  public ProcessWriteStream drainHandler(Handler<Void> handler) { 
    ((StreamOutput) delegate).drainHandler(handler);
    return this;
  }

  public void end() { 
    ((StreamOutput) delegate).end();
  }

  public void close() { 
    delegate.close();
  }


  public static ProcessWriteStream newInstance(StreamOutput arg) {
    return arg != null ? new ProcessWriteStream(arg) : null;
  }
}
