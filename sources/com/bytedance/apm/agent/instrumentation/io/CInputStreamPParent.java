package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class CInputStreamPParent extends InputStream implements StreamCompleteListenerSource {
    public static final AgentLog sLog = AgentLogManager.getAgentLog();
    public final ByteBuffer buf;
    public long c;
    public boolean cac;
    public final StreamCompleteListenerManager callback;
    public final InputStream impl;

    private boolean isBufferEmpty() {
        return !this.buf.hasRemaining();
    }

    private void notifyComplete() {
        if (!this.callback.isComplete()) {
            this.callback.notifyStreamComplete(new StreamCompleteEvent(this, this.c));
        }
    }

    @Override // java.io.InputStream
    public int available() {
        int i;
        try {
            if (this.cac) {
                i = this.buf.remaining();
            } else {
                i = 0;
            }
            return i + this.impl.available();
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.impl;
            if (inputStream != null) {
                inputStream.close();
            }
            notifyComplete();
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    public void fillBuffer() {
        int read;
        ByteBuffer byteBuffer = this.buf;
        if (byteBuffer != null && byteBuffer.hasArray()) {
            synchronized (this.buf) {
                try {
                    read = this.impl.read(this.buf.array(), 0, this.buf.capacity());
                } catch (IOException e) {
                    sLog.error(e.toString());
                }
                if (read > 0) {
                    if (read < this.buf.capacity()) {
                        this.buf.limit(read);
                    }
                } else {
                    this.buf.limit(0);
                }
            }
        }
    }

    public String getBufferAsString() {
        String str;
        ByteBuffer byteBuffer = this.buf;
        if (byteBuffer != null) {
            synchronized (byteBuffer) {
                byte[] bArr = new byte[this.buf.limit()];
                for (int i = 0; i < this.buf.limit(); i++) {
                    bArr[i] = this.buf.get(i);
                }
                str = new String(bArr);
            }
            return str;
        }
        return "";
    }

    private int readBuffer() {
        if (isBufferEmpty()) {
            return -1;
        }
        return this.buf.get();
    }

    @Override // java.io.InputStream
    public void reset() {
        if (!markSupported()) {
            return;
        }
        try {
            this.impl.reset();
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    public CInputStreamPParent(InputStream inputStream) {
        this(inputStream, false);
    }

    private boolean isBufferLargerThan(long j) {
        if (this.buf.remaining() >= j) {
            return true;
        }
        return false;
    }

    private void notifyError(Exception exc) {
        if (!this.callback.isComplete()) {
            this.callback.notifyStreamError(new StreamCompleteEvent(this, this.c, exc));
        }
    }

    private int readBuffer(byte[] bArr) {
        return readBuffer(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (!markSupported()) {
            return;
        }
        this.impl.mark(i);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.callback.removeStreamCompleteListener(streamCompleteListener);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (this.cac) {
            synchronized (this.buf) {
                if (isBufferLargerThan(j)) {
                    this.buf.position((int) j);
                    this.c += j;
                    return j;
                }
                j -= this.buf.remaining();
                if (j > 0) {
                    ByteBuffer byteBuffer = this.buf;
                    byteBuffer.position(byteBuffer.remaining());
                } else {
                    throw new IOException("Failed to partial read from buffer (skip)");
                }
            }
        }
        try {
            long skip = this.impl.skip(j);
            this.c += skip;
            return skip;
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    public CInputStreamPParent(InputStream inputStream, boolean z) {
        ByteBuffer allocate;
        this.callback = new StreamCompleteListenerManager();
        this.impl = inputStream;
        this.cac = z;
        if (!z) {
            allocate = null;
        } else {
            allocate = ByteBuffer.allocate(2048);
        }
        this.buf = allocate;
        fillBuffer();
    }

    private int readBuffer(byte[] bArr, int i, int i2) {
        if (isBufferEmpty()) {
            return -1;
        }
        int remaining = this.buf.remaining();
        this.buf.get(bArr, i, i2);
        return remaining - this.buf.remaining();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.cac) {
            synchronized (this.buf) {
                if (isBufferLargerThan(i2)) {
                    int readBuffer = readBuffer(bArr, i, i2);
                    if (readBuffer >= 0) {
                        this.c += readBuffer;
                        return readBuffer;
                    }
                    throw new IOException("Failed to readBuffer()");
                }
                int remaining = this.buf.remaining();
                if (remaining > 0) {
                    i3 = readBuffer(bArr, i, remaining);
                    if (i3 >= 0) {
                        i2 -= i3;
                        this.c += i3;
                    } else {
                        throw new IOException("Failed to partial read from buffer");
                    }
                } else {
                    i3 = 0;
                }
            }
        } else {
            i3 = 0;
        }
        try {
            InputStream inputStream = this.impl;
            if (inputStream != null && (i4 = inputStream.read(bArr, i + i3, i2)) < 0) {
                if (i3 <= 0) {
                    notifyComplete();
                    return i4;
                }
                return i3;
            }
            this.c += i4;
            return i4 + i3;
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }
}
