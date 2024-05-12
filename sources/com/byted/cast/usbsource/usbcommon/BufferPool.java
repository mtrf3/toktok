package com.byted.cast.usbsource.usbcommon;

import X.X1D;
import java.nio.ByteBuffer;

/* loaded from: classes29.dex */
public final class BufferPool {
    public int mAllocated;
    public int mAvailable;
    public final ByteBuffer[] mBuffers;
    public final int mInitialBufferSize;
    public final int mMaxBufferSize;

    public ByteBuffer acquire(int i) {
        synchronized (this) {
            while (true) {
                int i2 = this.mAvailable;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    this.mAvailable = i3;
                    return grow(this.mBuffers[i3], i);
                }
                int i4 = this.mAllocated;
                if (i4 < this.mBuffers.length) {
                    this.mAllocated = i4 + 1;
                    return ByteBuffer.allocate(chooseCapacity(this.mInitialBufferSize, i));
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void release(ByteBuffer byteBuffer) {
        synchronized (this) {
            byteBuffer.clear();
            ByteBuffer[] byteBufferArr = this.mBuffers;
            int i = this.mAvailable;
            this.mAvailable = i + 1;
            byteBufferArr[i] = byteBuffer;
            notifyAll();
        }
    }

    private int chooseCapacity(int i, int i2) {
        while (i < i2) {
            i *= 2;
        }
        int i3 = this.mMaxBufferSize;
        if (i > i3) {
            if (i2 <= i3) {
                return i3;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Requested size ");
            LIZ.append(i2);
            LIZ.append(" is larger than maximum buffer size ");
            LIZ.append(this.mMaxBufferSize);
            LIZ.append(".");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        return i;
    }

    public ByteBuffer grow(ByteBuffer byteBuffer, int i) {
        int capacity = byteBuffer.capacity();
        if (capacity < i) {
            ByteBuffer allocate = ByteBuffer.allocate(chooseCapacity(capacity, i));
            byteBuffer.flip();
            allocate.put(byteBuffer);
            return allocate;
        }
        return byteBuffer;
    }

    public BufferPool(int i, int i2, int i3) {
        this.mInitialBufferSize = i;
        this.mMaxBufferSize = i2;
        this.mBuffers = new ByteBuffer[i3];
    }
}
