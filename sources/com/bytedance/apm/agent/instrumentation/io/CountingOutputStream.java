package com.bytedance.apm.agent.instrumentation.io;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CountingOutputStream extends OutputStream implements StreamCompleteListenerSource {
    public long mCount;
    public final StreamCompleteListenerManager mListenerManager = new StreamCompleteListenerManager();
    public final OutputStream mRealImpl;

    private void notifyComplete() {
        if (!this.mListenerManager.isComplete()) {
            this.mListenerManager.notifyStreamComplete(new StreamCompleteEvent(this, this.mCount));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.close();
            }
            notifyComplete();
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.flush();
            }
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    public long getCount() {
        return this.mCount;
    }

    public CountingOutputStream(OutputStream outputStream) {
        this.mRealImpl = outputStream;
    }

    private void notifyError(Exception exc) {
        if (!this.mListenerManager.isComplete()) {
            this.mListenerManager.notifyStreamError(new StreamCompleteEvent(this, this.mCount, exc));
        }
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.mListenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.mListenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                this.mCount++;
                outputStream.write(i);
            }
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.write(bArr);
                this.mCount += bArr.length;
            }
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.write(bArr, i, i2);
                this.mCount += i2;
            }
        } catch (IOException e) {
            notifyError(e);
            throw e;
        }
    }
}
