package X;

import Y.ACallableS110S0100000_7;
import Y.AgS110S0200000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* renamed from: X.HFr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43767HFr extends AbstractC43762HFm {
    public int LIZLLL;
    public final List<EditVideoSegment> LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_upload";
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
        C10K.LIZJ(new ACallableS110S0100000_7(this, 60)).LIZLLL(new AgS110S0200000_7(this, (HGD) hgq, 24));
    }

    public C43767HFr(CreativeInfo creativeInfo, List<EditVideoSegment> list) {
        super(creativeInfo);
        this.LJ = list;
    }
}
