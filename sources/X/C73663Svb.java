package X;

import Y.IDhS105S0100000_12;
import com.ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Svb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73663Svb extends AbstractC73941T0f<C73284SpU, DiscoverSectionList> {
    public final DiscoverApiNew LIZJ;
    public volatile int LIZLLL;
    public volatile boolean LJ;
    public long LJFF;

    public C73663Svb() {
        DiscoverApiNew.LIZ.getClass();
        this.LIZJ = C37226EjG.LIZIZ;
        this.LJ = true;
    }

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        boolean z;
        AbstractC73672Svk LJIIIZ;
        AbstractC73430Srq LJJL;
        C73428Sro LJJL2;
        C73284SpU req = (C73284SpU) obj;
        o.LJIIIZ(req, "req");
        ArrayList arrayList = new ArrayList();
        if (req.getCursor() == -1) {
            z = true;
        } else {
            z = false;
        }
        int LIZ = C00F.LIZ(31744, 10, "discovery_change_request_num", true);
        if (LIZ == 0) {
            LIZ = 10;
        }
        if (z) {
            this.LIZLLL = 0;
            this.LJ = true;
            Integer valueOf = Integer.valueOf(a.LJIIJ().LJIILIIL());
            DiscoverApiNew.LIZ.getClass();
            InterfaceC115714gR LJJIIJZLJL = C37226EjG.LIZIZ.getBannerList(1, valueOf, a.LJIIZILJ().LIZJ()).LJIILL(C38901fq.LJLILLLLZI).LJIJI(C55457Lpd.LJLIL).LJJIIJZLJL();
            o.LJIIIIZZ(LJJIIJZLJL, "DiscoverApiNew.INSTANCE.…          .toObservable()");
            arrayList.add(LJJIIJZLJL);
            arrayList.add(LJIIIIZZ(0, LIZ));
        } else {
            arrayList.add(LJIIIIZZ(req.getCursor(), 10));
        }
        if (C00F.LIZ(31744, 0, "discover_async_request_fix", true) == 2) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC73672Svk abstractC73672Svk = (AbstractC73672Svk) it.next();
                if (z) {
                    LJJL2 = abstractC73672Svk.LJJJIL(C73536StY.LJLIL).LJJL(T16.LIZ());
                } else {
                    LJJL2 = abstractC73672Svk.LJJL(T16.LIZ());
                }
                arrayList2.add(LJJL2);
            }
            LJIIIZ = AbstractC73672Svk.LJJIJLIJ(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC73672Svk abstractC73672Svk2 = (AbstractC73672Svk) it2.next();
                if (z) {
                    LJJL = abstractC73672Svk2.LJJJIL(C73536StY.LJLIL);
                } else {
                    LJJL = abstractC73672Svk2.LJJL(T16.LIZ());
                }
                arrayList3.add(LJJL);
            }
            LJIIIZ = AbstractC73672Svk.LJIIIZ(arrayList3);
        }
        return LJIIIZ.LJJLIL().LJIJI(new C73289SpZ(z, this)).LJJIIJZLJL().LJJL(T16.LIZ());
    }

    public final C73805Sxt LJIIIIZZ(int i, int i2) {
        int i3;
        Integer valueOf = Integer.valueOf(a.LJIIJ().LJIILIIL());
        String LIZJ = a.LJIIZILJ().LIZJ();
        if (this.LJFF == 0) {
            this.LJFF = System.currentTimeMillis();
        }
        DiscoverApiNew discoverApiNew = this.LIZJ;
        if (MH6.LIZ() && !MH6.LIZ) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        AbstractC73638SvC<TrendingTopicList> trendingTopicsV2 = discoverApiNew.getTrendingTopicsV2(i, i2, Integer.valueOf(i3), valueOf, LIZJ);
        if (MH6.LIZ() && i == 0) {
            trendingTopicsV2 = trendingTopicsV2.LJIJJLI(new C73664Svc(this, 0, i2, valueOf, LIZJ));
        }
        o.LJIIIZ(trendingTopicsV2, "<this>");
        return new C73494Sss(trendingTopicsV2.LJIJI(C54840Lfg.LJLIL), new IDhS105S0100000_12(this, 1)).LJJIJL(C78605Ut7.LJLIL).LJJIJL(C32044Chs.LJLIL);
    }
}
