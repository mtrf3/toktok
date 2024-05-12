package X;

import com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment;

/* loaded from: classes11.dex */
public final class O68 implements InterfaceC73307Spr {
    public final /* synthetic */ AdsPreviewFragment LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        C223338pd c223338pd = this.LIZ.LJLJL;
        if (c223338pd != null) {
            c223338pd.LIZJ();
        }
        C223338pd c223338pd2 = this.LIZ.LJLJL;
        if (c223338pd2 == null) {
            return;
        }
        c223338pd2.setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        C223338pd c223338pd = this.LIZ.LJLJL;
        if (c223338pd != null) {
            c223338pd.LIZIZ();
        }
        C223338pd c223338pd2 = this.LIZ.LJLJL;
        if (c223338pd2 == null) {
            return;
        }
        c223338pd2.setVisibility(0);
    }

    public O68(AdsPreviewFragment adsPreviewFragment) {
        this.LIZ = adsPreviewFragment;
    }
}
