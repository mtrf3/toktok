package com.bytedance.apm.agent.instrumentation.io;

import X.C09970aH;
import X.C16880lQ;
import X.C64028PAy;
import X.X1D;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class CInputStreamParent extends CInputStreamPParent {
    private boolean isEmpty() {
        return !this.buf.hasRemaining();
    }

    public void callComplete() {
        if (!this.callback.isComplete()) {
            this.callback.notifyStreamComplete(new StreamCompleteEvent(this, this.c));
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.impl.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.cac) {
            synchronized (this.buf) {
                if (bufLT(1L)) {
                    int rb = rb();
                    if (rb >= 0) {
                        this.c++;
                    }
                    return rb;
                }
            }
        }
        try {
            int read = this.impl.read();
            if (read >= 0) {
                this.c++;
            } else {
                callComplete();
            }
            return read;
        } catch (IOException e) {
            callError(e);
            throw e;
        }
    }

    public int rb() {
        if (isEmpty()) {
            return -1;
        }
        return this.buf.get();
    }

    public CInputStreamParent(InputStream inputStream) {
        this(inputStream, false);
    }

    private int rb(byte[] bArr) {
        return rb(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.callback.addStreamCompleteListener(streamCompleteListener);
    }

    public boolean bufLT(long j) {
        if (this.buf.remaining() >= j) {
            return true;
        }
        return false;
    }

    public void callError(Exception exc) {
        if (!this.callback.isComplete()) {
            this.callback.notifyStreamError(new StreamCompleteEvent(this, this.c, exc));
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        if (this.cac) {
            synchronized (this.buf) {
                if (bufLT(length)) {
                    int rb = rb(bArr);
                    if (rb >= 0) {
                        this.c += rb;
                        return rb;
                    }
                    throw new IOException("CountingInputStream wrong");
                }
                int remaining = this.buf.remaining();
                if (remaining > 0) {
                    i = rb(bArr, 0, remaining);
                    if (i >= 0) {
                        length -= i;
                        this.c += i;
                    } else {
                        throw new IOException("CountingInputStream wrong2");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i, length);
            if (read >= 0) {
                this.c += read;
                return read + i;
            }
            if (i <= 0) {
                callComplete();
                return read;
            }
            return i;
        } catch (IOException e) {
            CInputStreamPParent.sLog.error(e.toString());
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("notify system err: ");
                LIZ.append(e);
                C64028PAy.LIZLLL("APM-Counting", X1D.LIZIZ(LIZ));
                C16880lQ.LLLLIIL(e);
            }
            callError(e);
            throw e;
        }
    }

    public void setBufferingEnabled(boolean z) {
        this.cac = z;
    }

    public CInputStreamParent(InputStream inputStream, boolean z) {
        super(inputStream, z);
    }

    private int rb(byte[] bArr, int i, int i2) {
        if (isEmpty()) {
            return -1;
        }
        int remaining = this.buf.remaining();
        this.buf.get(bArr, i, i2);
        return remaining - this.buf.remaining();
    }
}
