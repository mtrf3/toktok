package X;

import android.graphics.Bitmap;

/* renamed from: X.Xx2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86492Xx2 implements InterfaceC78660Uu0 {
    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        C86478Xwo.LIZ("InnerPushViewPreload", "InnerPushImageLoadListener onCanceled");
    }

    @Override // X.InterfaceC78660Uu0
    public void LIZIZ(Bitmap bitmap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerPushImageLoadListener onCompleted bitmap:");
        LIZ.append(bitmap);
        C86478Xwo.LIZ("InnerPushViewPreload", X1D.LIZIZ(LIZ));
    }
}
