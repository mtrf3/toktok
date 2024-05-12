package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.portal.PortalAdLabelEnableSetting;

/* renamed from: X.BSc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28802BSc implements C0GM {
    public final /* synthetic */ C68322mC<Bitmap> LIZ;
    public final /* synthetic */ C68322mC<Bitmap> LIZIZ;
    public final /* synthetic */ C68322mC<Bitmap> LIZJ;
    public final /* synthetic */ C68322mC<Bitmap> LIZLLL;
    public final /* synthetic */ C68322mC<View> LJ;

    public C28802BSc(C68322mC<Bitmap> c68322mC, C68322mC<Bitmap> c68322mC2, C68322mC<Bitmap> c68322mC3, C68322mC<Bitmap> c68322mC4, C68322mC<View> c68322mC5) {
        this.LIZ = c68322mC;
        this.LIZIZ = c68322mC2;
        this.LIZJ = c68322mC3;
        this.LIZLLL = c68322mC4;
        this.LJ = c68322mC5;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.LIZ.element;
        if (bitmap2 != null) {
            ((C29701Eo) this.LJ.element).updateBitmap("preview_image", bitmap2);
        }
        Bitmap bitmap3 = this.LIZIZ.element;
        if (bitmap3 != null) {
            ((C29701Eo) this.LJ.element).updateBitmap("preview_text", bitmap3);
        }
        Bitmap bitmap4 = this.LIZJ.element;
        if (bitmap4 != null) {
            ((C29701Eo) this.LJ.element).updateBitmap("preview_avatar_image", bitmap4);
        }
        if (PortalAdLabelEnableSetting.INSTANCE.getValue() && (bitmap = this.LIZLLL.element) != null) {
            ((C29701Eo) this.LJ.element).updateBitmap("label", bitmap);
        }
    }
}
