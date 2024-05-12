package X;

import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;

/* loaded from: classes8.dex */
public final class HX2 implements IC5 {
    public final /* synthetic */ TTEPEffectPreviewActivity LIZ;

    @Override // X.IC5
    public final void LIZ() {
        I3X i3x = this.LIZ.LLIIJLIL;
        if (i3x != null) {
            i3x.nZ("sticker stop record");
        }
    }

    @Override // X.IC5
    public final boolean LIZIZ() {
        if (this.LIZ.LJLLILLLL == null) {
            return false;
        }
        return !C77413UZt.LJIILL(r0.LJII());
    }

    @Override // X.IC5
    public final boolean LIZJ() {
        I3X i3x;
        C45848Hz2 c45848Hz2 = this.LIZ.LLFZ;
        if (c45848Hz2 == null || c45848Hz2.LLJILJILJ() == null || (i3x = this.LIZ.LLIIJLIL) == null) {
            return true;
        }
        return i3x.Ue0().LIZ().booleanValue();
    }

    public HX2(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.LIZ = tTEPEffectPreviewActivity;
    }
}
