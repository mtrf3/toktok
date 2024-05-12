package com.lynx.canvas.loader;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public class CanvasResourceResolver {
    public final long LIZ;

    private native void nativeReject(String str, long j);

    private native void nativeResolveBytes(byte[] bArr, int i, int i2, long j);

    private native void nativeResolveImage(Bitmap bitmap, long j);

    private native void nativeResolveStreamLoadData(byte[] bArr, int i, int i2, long j);

    private native void nativeResolveStreamLoadEnd(boolean z, String str, long j);

    private native void nativeResolveStreamLoadStart(int i, long j);

    private native void nativeResolveText(String str, long j);

    public CanvasResourceResolver(long j) {
        this.LIZ = j;
    }

    public final void LIZ(String str) {
        nativeReject(str, this.LIZ);
    }

    public final void LIZIZ(Bitmap bitmap) {
        nativeResolveImage(bitmap, this.LIZ);
    }

    public final void LJFF(int i) {
        nativeResolveStreamLoadStart(i, this.LIZ);
    }

    public final void LIZJ(byte[] bArr, int i) {
        nativeResolveBytes(bArr, 0, i, this.LIZ);
    }

    public final void LIZLLL(byte[] bArr, int i) {
        nativeResolveStreamLoadData(bArr, 0, i, this.LIZ);
    }

    public final void LJ(String str, boolean z) {
        nativeResolveStreamLoadEnd(z, str, this.LIZ);
    }
}
