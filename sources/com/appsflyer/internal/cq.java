package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class cq extends FilterInputStream {
    public final int AFInAppEventParameterName;
    public byte[] AFInAppEventType;
    public byte[] AFKeystoreWrapper;
    public int[] AFLogger$LogLevel;
    public int AFVersionDeclaration;
    public int AppsFlyer2dXConversionCallback;
    public int getLevel;
    public int init;
    public cn valueOf;
    public byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    private int AFInAppEventType() {
        if (this.AFVersionDeclaration == Integer.MAX_VALUE) {
            this.AFVersionDeclaration = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.init == 8) {
            byte[] bArr = this.AFInAppEventType;
            int i2 = this.AFVersionDeclaration;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.AFInAppEventType, i3, 8 - i3);
                    if (read > 0) {
                        i3 += read;
                    } else {
                        throw new IllegalStateException("unexpected block size");
                    }
                } while (i3 < 8);
                AFKeystoreWrapper();
                int read2 = ((FilterInputStream) this).in.read();
                this.AFVersionDeclaration = read2;
                this.init = 0;
                if (read2 < 0) {
                    i = 8 - (this.AFInAppEventType[7] & 255);
                }
                this.AppsFlyer2dXConversionCallback = i;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    private void AFKeystoreWrapper() {
        if (this.getLevel == 2) {
            byte[] bArr = this.AFInAppEventType;
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventType;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.AFInAppEventParameterName;
        cn cnVar = this.valueOf;
        cv.AFInAppEventParameterName(i, i2, false, i3, cnVar.valueOf, cnVar.values, this.AFLogger$LogLevel);
        int[] iArr = this.AFLogger$LogLevel;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.AFInAppEventType;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.getLevel == 2) {
            int i6 = 0;
            do {
                byte[] bArr4 = this.AFInAppEventType;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.values[i6]);
                i6++;
            } while (i6 < 8);
            byte[] bArr5 = this.AFKeystoreWrapper;
            System.arraycopy(bArr5, 0, this.values, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFInAppEventType();
        return this.AppsFlyer2dXConversionCallback - this.init;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFInAppEventType();
        int i = this.init;
        if (i >= this.AppsFlyer2dXConversionCallback) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventType;
        this.init = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.init;
            if (i5 >= this.AppsFlyer2dXConversionCallback) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFInAppEventType;
            this.init = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    public cq(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        super(inputStream);
        this.AFVersionDeclaration = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.AFInAppEventParameterName = min;
        this.AFInAppEventType = new byte[8];
        byte[] bArr2 = new byte[8];
        this.values = bArr2;
        this.AFKeystoreWrapper = new byte[8];
        this.AFLogger$LogLevel = new int[2];
        this.init = 8;
        this.AppsFlyer2dXConversionCallback = 8;
        this.getLevel = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new cn(iArr, min, true, false);
    }
}
