package X;

import com.ss.android.ttve.nativePort.NativeCallbacks;

/* renamed from: X.WzZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84101WzZ implements NativeCallbacks.ILensCallback {
    public final /* synthetic */ C84092WzQ LIZ;

    public C84101WzZ(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ILensCallback
    public final void onError(int i, int i2, String str) {
        X03 x03 = (X03) this.LIZ.callbackMap.get(Integer.valueOf(i));
        if (x03 != null) {
            x03.onError();
        }
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ILensCallback
    public final void onSuccess(int i, float f, int i2) {
        X03 x03 = (X03) this.LIZ.callbackMap.get(Integer.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("luma detect scene is ");
        LIZ.append(f);
        C63922P6w.LIZ("TAG", X1D.LIZIZ(LIZ));
        if (x03 != null) {
            x03.onSuccess(i, f, i2);
        }
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ILensCallback
    public final void onInfo(int i, int i2, int i3, String str) {
        X03 x03 = (X03) this.LIZ.callbackMap.get(Integer.valueOf(i));
        if (x03 != null) {
            x03.LIZ(str);
        }
    }
}
