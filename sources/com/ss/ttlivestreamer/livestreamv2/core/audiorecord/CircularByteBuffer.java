package com.ss.ttlivestreamer.livestreamv2.core.audiorecord;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes3.dex */
public class CircularByteBuffer {
    public int available;
    public final byte[] buffer;
    public final int capacity;
    public int idxGet;
    public int idxPut;

    public synchronized int available() {
        return this.available;
    }

    public synchronized void clear() {
        this.available = 0;
        this.idxPut = 0;
        this.idxGet = 0;
    }

    public synchronized int free() {
        return this.capacity - this.available;
    }

    public synchronized int get() {
        int i = this.available;
        if (i == 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i2 = this.idxGet;
        byte b = bArr[i2];
        this.idxGet = (i2 + 1) % this.capacity;
        this.available = i - 1;
        return b;
    }

    public synchronized int peek() {
        byte b;
        if (this.available > 0) {
            b = this.buffer[this.idxGet];
        } else {
            b = -1;
        }
        return b;
    }

    public CircularByteBuffer() {
        this(FileUtils.BUFFER_SIZE);
    }

    public int capacity() {
        return this.capacity;
    }

    public CircularByteBuffer(int i) {
        this.capacity = i;
        this.buffer = new byte[i];
    }

    public int get(byte[] bArr) {
        return get(bArr, 0, bArr.length);
    }

    public synchronized boolean put(byte b) {
        int i = this.available;
        int i2 = this.capacity;
        if (i == i2) {
            return false;
        }
        byte[] bArr = this.buffer;
        int i3 = this.idxPut;
        bArr[i3] = b;
        this.idxPut = (i3 + 1) % i2;
        this.available = i + 1;
        return true;
    }

    public synchronized int skip(int i) {
        int i2 = this.available;
        if (i > i2) {
            i = i2;
        }
        this.idxGet = (this.idxGet + i) % this.capacity;
        this.available = i2 - i;
        return i;
    }

    public int put(byte[] bArr) {
        return put(bArr, 0, bArr.length);
    }

    public synchronized int get(byte[] bArr, int i, int i2) {
        if (this.available == 0) {
            return 0;
        }
        int i3 = this.idxGet;
        int i4 = this.idxPut;
        if (i3 >= i4) {
            i4 = this.capacity;
        }
        int min = Math.min(i4 - i3, i2);
        System.arraycopy(this.buffer, this.idxGet, bArr, i, min);
        int i5 = this.idxGet + min;
        this.idxGet = i5;
        if (i5 == this.capacity) {
            int min2 = Math.min(i2 - min, this.idxPut);
            if (min2 > 0) {
                System.arraycopy(this.buffer, 0, bArr, i + min, min2);
                this.idxGet = min2;
                min += min2;
            } else {
                this.idxGet = 0;
            }
        }
        this.available -= min;
        return min;
    }

    public synchronized int put(byte[] bArr, int i, int i2) {
        int i3 = this.available;
        int i4 = this.capacity;
        if (i3 == i4) {
            return 0;
        }
        int i5 = this.idxPut;
        int i6 = this.idxGet;
        if (i5 < i6) {
            i4 = i6;
        }
        int min = Math.min(i4 - i5, i2);
        System.arraycopy(bArr, i, this.buffer, this.idxPut, min);
        int i7 = this.idxPut + min;
        this.idxPut = i7;
        if (i7 == this.capacity) {
            int min2 = Math.min(i2 - min, this.idxGet);
            if (min2 > 0) {
                System.arraycopy(bArr, i + min, this.buffer, 0, min2);
                this.idxPut = min2;
                min += min2;
            } else {
                this.idxPut = 0;
            }
        }
        this.available += min;
        return min;
    }
}
