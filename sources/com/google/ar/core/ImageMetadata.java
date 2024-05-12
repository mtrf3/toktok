package com.google.ar.core;

import X.C16880lQ;
import X.C93530aSM;
import android.util.Rational;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public class ImageMetadata {
    public final long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;
    public final C93530aSM sketchEntry;

    public ImageMetadata() {
    }

    private native void nativeDestroyMetadataEntry(long j, long j2);

    private native long[] nativeGetAllKeys(long j, long j2);

    private native byte[] nativeGetByteArrayFromMetadataEntry(long j, long j2);

    private native byte nativeGetByteFromMetadataEntry(long j, long j2);

    private native double[] nativeGetDoubleArrayFromMetadataEntry(long j, long j2);

    private native double nativeGetDoubleFromMetadataEntry(long j, long j2);

    private native float[] nativeGetFloatArrayFromMetadataEntry(long j, long j2);

    private native float nativeGetFloatFromMetadataEntry(long j, long j2);

    private native int[] nativeGetIntArrayFromMetadataEntry(long j, long j2);

    private native int nativeGetIntFromMetadataEntry(long j, long j2);

    private native long[] nativeGetLongArrayFromMetadataEntry(long j, long j2);

    private native long nativeGetLongFromMetadataEntry(long j, long j2);

    private native long nativeGetMetadataEntry(long j, long j2, int i);

    private native int nativeGetMetadataEntryValueCount(long j, long j2);

    private native int nativeGetMetadataEntryValueType(long j, long j2);

    private native Rational[] nativeGetRationalArrayFromMetadataEntry(long j, long j2);

    private native Rational nativeGetRationalFromMetadataEntry(long j, long j2);

    public static native void nativeLoadSymbols();

    public static native void nativeReleaseImageMetadata(long j, long j2);

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseImageMetadata(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public long[] getKeys() {
        long[] nativeGetAllKeys = nativeGetAllKeys(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetAllKeys != null) {
            return nativeGetAllKeys;
        }
        throw new FatalException("Unknown error in ImageMetadata.getKeys().");
    }

    public byte getByte(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 0 && c93530aSM.LIZJ == 1) {
            byte nativeGetByteFromMetadataEntry = nativeGetByteFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetByteFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public byte[] getByteArray(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 0) {
            byte[] nativeGetByteArrayFromMetadataEntry = nativeGetByteArrayFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetByteArrayFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public double getDouble(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 4 && c93530aSM.LIZJ == 1) {
            double nativeGetDoubleFromMetadataEntry = nativeGetDoubleFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetDoubleFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public double[] getDoubleArray(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 4) {
            double[] nativeGetDoubleArrayFromMetadataEntry = nativeGetDoubleArrayFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetDoubleArrayFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public float getFloat(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 2 && c93530aSM.LIZJ == 1) {
            float nativeGetFloatFromMetadataEntry = nativeGetFloatFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetFloatFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public float[] getFloatArray(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 2) {
            float[] nativeGetFloatArrayFromMetadataEntry = nativeGetFloatArrayFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetFloatArrayFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public int getInt(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 1 && c93530aSM.LIZJ == 1) {
            int nativeGetIntFromMetadataEntry = nativeGetIntFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetIntFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public int[] getIntArray(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 1) {
            int[] nativeGetIntArrayFromMetadataEntry = nativeGetIntArrayFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetIntArrayFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public long getLong(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 3 && c93530aSM.LIZJ == 1) {
            long nativeGetLongFromMetadataEntry = nativeGetLongFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetLongFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d, type: %2$d, count: %3$d.", new Object[]{Integer.valueOf(i), Integer.valueOf(this.sketchEntry.LIZIZ), Integer.valueOf(this.sketchEntry.LIZJ)}));
    }

    public long[] getLongArray(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 3) {
            long[] nativeGetLongArrayFromMetadataEntry = nativeGetLongArrayFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetLongArrayFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public Rational getRational(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 5 && c93530aSM.LIZJ == 1) {
            Rational nativeGetRationalFromMetadataEntry = nativeGetRationalFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetRationalFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public Rational[] getRationalArray(int i) {
        getMetdataEntry(i, this.sketchEntry);
        C93530aSM c93530aSM = this.sketchEntry;
        if (c93530aSM.LIZIZ == 5) {
            Rational[] nativeGetRationalArrayFromMetadataEntry = nativeGetRationalArrayFromMetadataEntry(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.LIZ);
            return nativeGetRationalArrayFromMetadataEntry;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
    }

    public ImageMetadata(long j, Session session) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.sketchEntry = new C93530aSM();
    }

    private void getMetdataEntry(int i, C93530aSM c93530aSM) {
        long nativeGetMetadataEntry = nativeGetMetadataEntry(this.session.nativeWrapperHandle, this.nativeHandle, i);
        c93530aSM.LIZ = nativeGetMetadataEntry;
        if (nativeGetMetadataEntry != 0) {
            c93530aSM.LIZIZ = nativeGetMetadataEntryValueType(this.session.nativeWrapperHandle, nativeGetMetadataEntry);
            c93530aSM.LIZJ = nativeGetMetadataEntryValueCount(this.session.nativeWrapperHandle, c93530aSM.LIZ);
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Invalid ImageMetadata key: %1$d", new Object[]{Integer.valueOf(i)}));
    }
}
