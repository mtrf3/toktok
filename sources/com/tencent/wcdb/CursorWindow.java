package com.tencent.wcdb;

import X.AbstractC84314X7e;
import X.C84322X7m;
import X.X1D;
import Y.IDCreatorS57S0000000_15;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class CursorWindow extends AbstractC84314X7e implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR;
    public static int sCursorWindowSize;
    public final String mName;
    public int mStartPos;
    public long mWindowPtr;

    public static native boolean nativeAllocRow(long j);

    public static native void nativeClear(long j);

    public static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    public static native long nativeCreate(String str, int i);

    public static native void nativeDispose(long j);

    public static native void nativeFreeLastRow(long j);

    public static native byte[] nativeGetBlob(long j, int i, int i2);

    public static native double nativeGetDouble(long j, int i, int i2);

    public static native long nativeGetLong(long j, int i, int i2);

    public static native int nativeGetNumRows(long j);

    public static native String nativeGetString(long j, int i, int i2);

    public static native int nativeGetType(long j, int i, int i2);

    public static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    public static native boolean nativePutDouble(long j, double d, int i, int i2);

    public static native boolean nativePutLong(long j, long j2, int i, int i2);

    public static native boolean nativePutNull(long j, int i, int i2);

    public static native boolean nativePutString(long j, String str, int i, int i2);

    public static native boolean nativeSetNumColumns(long j, int i);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.AbstractC84314X7e
    public final void LIZIZ() {
        long j = this.mWindowPtr;
        if (j != 0) {
            nativeDispose(j);
            this.mWindowPtr = 0L;
        }
    }

    public final void finalize() {
        try {
            long j = this.mWindowPtr;
            if (j != 0) {
                nativeDispose(j);
                this.mWindowPtr = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    static {
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            sCursorWindowSize = Resources.getSystem().getInteger(identifier) * 1024;
        } else {
            sCursorWindowSize = 2097152;
        }
        CREATOR = new IDCreatorS57S0000000_15(20);
    }

    public CursorWindow() {
        throw new UnsupportedOperationException();
    }

    public final void LJ() {
        LIZ();
        try {
            this.mStartPos = 0;
            nativeClear(this.mWindowPtr);
        } finally {
            LIZLLL();
        }
    }

    public final int LJIILIIL() {
        LIZ();
        try {
            return nativeGetNumRows(this.mWindowPtr);
        } finally {
            LIZLLL();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mName);
        LIZ.append(" {");
        LIZ.append(Long.toHexString(this.mWindowPtr));
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public CursorWindow(String str) {
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.mName = str;
        long nativeCreate = nativeCreate(str, sCursorWindowSize);
        this.mWindowPtr = nativeCreate;
        if (nativeCreate != 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cursor window allocation of ");
        LIZ.append(sCursorWindowSize / 1024);
        LIZ.append(" kb failed. ");
        throw new C84322X7m(X1D.LIZIZ(LIZ));
    }

    public final byte[] LJIIJ(int i, int i2) {
        LIZ();
        try {
            return nativeGetBlob(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            LIZLLL();
        }
    }

    public final double LJIIJJI(int i, int i2) {
        LIZ();
        try {
            return nativeGetDouble(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            LIZLLL();
        }
    }

    public final long LJIIL(int i, int i2) {
        LIZ();
        try {
            return nativeGetLong(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            LIZLLL();
        }
    }

    public final String LJIILL(int i, int i2) {
        LIZ();
        try {
            return nativeGetString(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            LIZLLL();
        }
    }

    public final int LJIJ(int i, int i2) {
        LIZ();
        try {
            return nativeGetType(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            LIZLLL();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    public final void LJI(int i, int i2, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            LIZ();
            try {
                nativeCopyStringToBuffer(this.mWindowPtr, i - this.mStartPos, i2, charArrayBuffer);
                return;
            } finally {
                LIZLLL();
            }
        }
        throw new IllegalArgumentException("CharArrayBuffer should not be null");
    }
}
