package X;

import android.graphics.Bitmap;

/* renamed from: X.ByJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30515ByJ implements UCZ {
    public final /* synthetic */ C30514ByI LIZ;

    public C30515ByJ(C30514ByI c30514ByI) {
        this.LIZ = c30514ByI;
    }

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        Bitmap LIZ;
        InterfaceC21020s6 interfaceC21020s6;
        if (bitmap == null || bitmap.isRecycled() || (LIZ = C31573CaH.LIZ(bitmap, 0.74698794f)) == null || LIZ.isRecycled() || (interfaceC21020s6 = this.LIZ.LJLJJLL) == null || interfaceC21020s6.getLiveCore() == null) {
            return;
        }
        this.LIZ.LJLJJLL.getLiveCore().setBackGroundPhotoPath(LIZ);
    }
}
