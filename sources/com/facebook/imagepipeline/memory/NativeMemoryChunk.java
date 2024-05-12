package com.facebook.imagepipeline.memory;

import X.C32151Nz;
import X.C77123UOp;
import X.C81713W5d;
import X.InterfaceC80631Vkh;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class NativeMemoryChunk implements InterfaceC80631Vkh, Closeable {
    public boolean mIsClosed;
    public final long mNativePtr;
    public final int mSize;

    public static native long nativeAllocate(int i);

    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeFree(long j);

    public static native void nativeMemcpy(long j, long j2, int i);

    public static native byte nativeReadByte(long j);

    @Override // X.InterfaceC80631Vkh, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    @Override // X.InterfaceC80631Vkh
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // X.InterfaceC80631Vkh
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    static {
        C81713W5d.LIZ("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    public void finalize() {
        if (isClosed()) {
            return;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // X.InterfaceC80631Vkh
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // X.InterfaceC80631Vkh
    public int getSize() {
        return this.mSize;
    }

    @Override // X.InterfaceC80631Vkh
    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    @Override // X.InterfaceC80631Vkh
    public synchronized byte read(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (i >= this.mSize) {
            z3 = false;
        }
        C32151Nz.LJI(z3);
        return nativeReadByte(this.mNativePtr + i);
    }

    private void doCopy(int i, InterfaceC80631Vkh interfaceC80631Vkh, int i2, int i3) {
        if (interfaceC80631Vkh instanceof NativeMemoryChunk) {
            C32151Nz.LJIIIZ(!isClosed());
            C32151Nz.LJIIIZ(!interfaceC80631Vkh.isClosed());
            C77123UOp.LJIJ(i, interfaceC80631Vkh.getSize(), i2, i3, this.mSize);
            nativeMemcpy(interfaceC80631Vkh.getNativePtr() + i2, this.mNativePtr + i, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // X.InterfaceC80631Vkh
    public void copy(int i, InterfaceC80631Vkh interfaceC80631Vkh, int i2, int i3) {
        interfaceC80631Vkh.getClass();
        if (interfaceC80631Vkh.getUniqueId() == getUniqueId()) {
            C32151Nz.LJI(false);
        }
        if (interfaceC80631Vkh.getUniqueId() < getUniqueId()) {
            synchronized (interfaceC80631Vkh) {
                synchronized (this) {
                    doCopy(i, interfaceC80631Vkh, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC80631Vkh) {
                    doCopy(i, interfaceC80631Vkh, i2, i3);
                }
            }
        }
    }

    @Override // X.InterfaceC80631Vkh
    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int min;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        min = Math.min(Math.max(0, this.mSize - i), i3);
        C77123UOp.LJIJ(i, bArr.length, i2, min, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + i, bArr, i2, min);
        return min;
    }

    @Override // X.InterfaceC80631Vkh
    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int min;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        min = Math.min(Math.max(0, this.mSize - i), i3);
        C77123UOp.LJIJ(i, bArr.length, i2, min, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + i, bArr, i2, min);
        return min;
    }
}
