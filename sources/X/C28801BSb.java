package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.portal.PortalAdLabelEnableSetting;

/* renamed from: X.BSb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28801BSb implements C0GM {
    public final /* synthetic */ Bitmap LIZ;
    public final /* synthetic */ Bitmap LIZIZ;
    public final /* synthetic */ Bitmap LIZJ;
    public final /* synthetic */ C68322mC<C29701Eo> LIZLLL;

    public C28801BSb(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C68322mC<C29701Eo> c68322mC) {
        this.LIZ = bitmap;
        this.LIZIZ = bitmap2;
        this.LIZJ = bitmap3;
        this.LIZLLL = c68322mC;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.LIZ;
        if (bitmap2 != null) {
            this.LIZLLL.element.updateBitmap("preview_image", bitmap2);
        }
        Bitmap bitmap3 = this.LIZIZ;
        if (bitmap3 != null) {
            this.LIZLLL.element.updateBitmap("preview_text", bitmap3);
        }
        if (PortalAdLabelEnableSetting.INSTANCE.getValue() && (bitmap = this.LIZJ) != null) {
            this.LIZLLL.element.updateBitmap("label", bitmap);
        }
    }
}
