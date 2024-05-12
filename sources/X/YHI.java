package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHI {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final List<CandidateAdData> LIZLLL;
    public final int LJ;

    public YHI(int i, long j, long j2, String satiParamForPitaya, List candidateAdList) {
        o.LJIIIZ(satiParamForPitaya, "satiParamForPitaya");
        o.LJIIIZ(candidateAdList, "candidateAdList");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = satiParamForPitaya;
        this.LIZLLL = candidateAdList;
        this.LJ = i;
    }
}
