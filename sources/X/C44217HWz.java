package X;

import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;

/* renamed from: X.HWz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44217HWz implements IC5 {
    public final /* synthetic */ FTCVideoRecordNewActivity LIZ;

    @Override // X.IC5
    public final void LIZ() {
        this.LIZ.LLIIJLIL.nZ("ftc sticker stop record");
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
        C45849Hz3 c45849Hz3 = this.LIZ.LLFZ;
        if (c45849Hz3 == null) {
            return true;
        }
        if (c45849Hz3.LJLIL == null) {
            c45849Hz3.LJLIL = (ShortVideoContextViewModel) C165706es.LJIIIIZZ(c45849Hz3, null, null, 6).get(ShortVideoContextViewModel.class);
        }
        if (c45849Hz3.LJLIL == null || (i3x = this.LIZ.LLIIJLIL) == null) {
            return true;
        }
        return i3x.Ue0().LIZ().booleanValue();
    }

    public C44217HWz(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.LIZ = fTCVideoRecordNewActivity;
    }
}
