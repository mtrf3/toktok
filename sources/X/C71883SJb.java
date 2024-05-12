package X;

import android.graphics.Bitmap;

/* renamed from: X.SJb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71883SJb implements C0GM {
    public final /* synthetic */ C71884SJc LIZ;

    public C71883SJb(C71884SJc c71884SJc) {
        this.LIZ = c71884SJc;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        C71884SJc c71884SJc = this.LIZ;
        Bitmap bitmap = c71884SJc.LJLJJI;
        if (bitmap != null) {
            c71884SJc.updateBitmap("preview_image", bitmap);
        }
    }
}
