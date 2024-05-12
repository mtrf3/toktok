package X;

import Y.ACallableS110S0100000_7;
import Y.AgS110S0200000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43765HFp extends AbstractC43762HFm {
    public final List<HFP> LIZLLL;

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        return HFQ.LIZLLL(this.LIZLLL);
    }

    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        super.LJFF(hgq);
        if (!AbstractC43762HFm.LIZJ()) {
            return;
        }
        C10K.LIZJ(new ACallableS110S0100000_7(this, 59)).LIZLLL(new AgS110S0200000_7((HGD) hgq, this, 22));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43765HFp(CreativeInfo creativeInfo, List<HFP> list) {
        super(creativeInfo);
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZLLL = list;
    }
}
