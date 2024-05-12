package com.lynx.react.bridge;

import X.EnumC37729ErN;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class PiperData {
    public EnumC37729ErN LIZ = EnumC37729ErN.Empty;

    public static native long nativeParseStringData(String str);

    public static native void nativeReleaseData(long j);

    private boolean recycleIfIsDisposable() {
        return false;
    }

    public ByteBuffer getBuffer() {
        return null;
    }

    public int getBufferPosition() {
        return 0;
    }

    public long getNativePtr() {
        return 0L;
    }

    public int getDataType() {
        return this.LIZ.ordinal();
    }

    public final void finalize() {
        super.finalize();
        this.LIZ = EnumC37729ErN.Empty;
    }
}
