package X;

import android.graphics.Bitmap;

/* renamed from: X.U1v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76531U1v implements UCZ {
    public final /* synthetic */ InterfaceC65052gv<Bitmap> LIZ;

    public C76531U1v(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            ((C73578SuE) this.LIZ).onError(new RuntimeException("Invalid bitmap"));
            return;
        }
        ((C73578SuE) this.LIZ).onSuccess(bitmap);
    }
}
