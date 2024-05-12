package X;

import Y.ACallableS79S0101000_7;
import Y.AgS110S0200000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* renamed from: X.HFu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43770HFu extends AbstractC43762HFm {
    public int LIZLLL;
    public final List<EditVideoSegment> LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_movie";
    }

    @Override // X.AbstractC43762HFm
    public final void LJ() {
        throw null;
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        return HFQ.LIZIZ(this.LJ);
    }

    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        super.LJFF(hgq);
        if (!AbstractC43762HFm.LIZJ()) {
            return;
        }
        C10K.LIZJ(new ACallableS79S0101000_7(1, this, 4)).LIZLLL(new AgS110S0200000_7(this, (HGD) hgq, 20));
    }

    public C43770HFu(CreativeInfo creativeInfo, List<EditVideoSegment> list) {
        super(creativeInfo);
        this.LJ = list;
    }

    public static void LJI(C43770HFu c43770HFu, HGQ hgq, C10K c10k) {
        c43770HFu.getClass();
        hgq.onFinish(c10k.LJIILIIL());
        C44422Hc2.LIZJ();
        super.LJ();
    }
}
