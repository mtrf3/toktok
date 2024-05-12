package com.bytedance.realx.video;

import X.X1D;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class YuvHelper {
    public static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    public static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    public static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static native void nativeNV12Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public static void NV12Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4) {
        int i5 = (i3 + 1) / 2;
        int i6 = i3 * i4;
        int i7 = (((i4 + 1) / 2) * i5 * 2) + i6;
        if (byteBuffer3.capacity() >= i7) {
            byteBuffer3.position(0);
            ByteBuffer slice = byteBuffer3.slice();
            byteBuffer3.position(i6);
            nativeNV12Copy(byteBuffer, i, byteBuffer2, i2, slice, i3, byteBuffer3.slice(), i5 * 2, i3, i4);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected destination buffer capacity to be at least ");
        LIZ.append(i7);
        LIZ.append(" was ");
        LIZ.append(byteBuffer3.capacity());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null) {
            return;
        }
        int i6 = (i4 + 1) / 2;
        int i7 = i4 * i5;
        int i8 = ((i5 + 1) / 2) * i6;
        int i9 = (i8 * 2) + i7;
        if (byteBuffer4.capacity() >= i9) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i7);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i8 + i7);
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i4, slice2, i6, byteBuffer4.slice(), i6, i4, i5);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected destination buffer capacity to be at least ");
        LIZ.append(i9);
        LIZ.append(" was ");
        LIZ.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = (i4 + 1) / 2;
        int i7 = i4 * i5;
        int i8 = (((i5 + 1) / 2) * i6 * 2) + i7;
        if (byteBuffer4.capacity() >= i8) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i7);
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i4, byteBuffer4.slice(), i6 * 2, i4, i5);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected destination buffer capacity to be at least ");
        LIZ.append(i8);
        LIZ.append(" was ");
        LIZ.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i6 % 180 == 0) {
            i7 = i4;
            i8 = i5;
        } else {
            i7 = i5;
            i8 = i4;
        }
        int i9 = (i8 + 1) / 2;
        int i10 = (i7 + 1) / 2;
        int i11 = i8 * i7;
        int i12 = i9 * i10;
        int i13 = (i12 * 2) + i11;
        if (byteBuffer4.capacity() >= i13) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i11);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i12 + i11);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i7, slice2, i10, byteBuffer4.slice(), i10, i4, i5, i6);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected destination buffer capacity to be at least ");
        LIZ.append(i13);
        LIZ.append(" was ");
        LIZ.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }
}