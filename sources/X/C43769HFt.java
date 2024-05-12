package X;

import Y.ACallableS79S0101000_7;
import Y.AgS110S0200000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43769HFt extends AbstractC43762HFm {
    public final List<String> LIZLLL;
    public final HG7 LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_movie";
    }

    static {
        C16880lQ.LJLLJ(C43769HFt.class);
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        List<String> list = this.LIZLLL;
        if (C77413UZt.LJIILL(list)) {
            return null;
        }
        o.LJI(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            HFD hfd = new HFD();
            hfd.LIZ = str;
            arrayList.add(hfd);
        }
        return arrayList;
    }

    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        super.LJFF(hgq);
        if (!AbstractC43762HFm.LIZJ()) {
            return;
        }
        C10K.LIZJ(new ACallableS79S0101000_7(1, this, 2)).LIZLLL(new AgS110S0200000_7(this, (HGD) hgq, 23));
    }

    public C43769HFt(CreativeInfo creativeInfo, List<String> list, HG7 hg7) {
        super(creativeInfo);
        this.LIZLLL = list;
        this.LJ = hg7;
    }
}
