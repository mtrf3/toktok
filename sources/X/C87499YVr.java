package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YVr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87499YVr implements InterfaceC102233zn {
    public C102283zs LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C87497YVp LIZJ;

    public C87499YVr(C87497YVp c87497YVp) {
        this.LIZJ = c87497YVp;
    }

    public static final String LIZLLL(List<C4J7> list) {
        ArrayList arrayList = new ArrayList();
        for (C4J7 c4j7 : list) {
            if (c4j7.LIZ == null) {
                arrayList.add(c4j7);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        return ORZ.LLD(arrayList, ",", "[", "]", C87503YVv.LJLIL, 24);
    }

    @Override // X.InterfaceC102233zn
    public final void LIZ(C102283zs c102283zs) {
        LJ(c102283zs);
        if (c102283zs.LIZ.isEmpty()) {
            C87497YVp c87497YVp = this.LIZJ;
            KQA kqa = c87497YVp.LJLJLLL;
            if (kqa != null) {
                kqa.jh(c87497YVp.LJLL, c102283zs.LIZIZ);
            }
            this.LIZIZ = false;
        }
    }

    @Override // X.InterfaceC102233zn
    public final void LIZIZ(C102283zs c102283zs) {
        this.LIZ = c102283zs;
        if (c102283zs.LIZ.isEmpty()) {
            this.LIZJ.LJLL.clear();
            KQA kqa = this.LIZJ.LJLJLLL;
            if (kqa != null) {
                kqa.J5(new ArrayList(), c102283zs.LIZIZ);
            }
            this.LIZIZ = false;
            return;
        }
        if (IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZIZ()) {
            this.LIZJ.getClass();
            if (C87497YVp.LIZ(c102283zs)) {
                C87497YVp c87497YVp = this.LIZJ;
                List<C4J7> list = c102283zs.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<C4J7> it = list.iterator();
                while (it.hasNext()) {
                    Aweme aweme = it.next().LIZ;
                    if (aweme != null) {
                        arrayList.add(aweme);
                    }
                }
                c87497YVp.LIZJ(arrayList);
                return;
            }
        }
        this.LIZJ.LIZIZ().LJIILL(LIZLLL(c102283zs.LIZ), "", "");
    }

    @Override // X.InterfaceC102233zn
    public final void LIZJ(C102283zs c102283zs) {
        LJ(c102283zs);
        if (c102283zs.LIZ.isEmpty()) {
            C87497YVp c87497YVp = this.LIZJ;
            KQA kqa = c87497YVp.LJLJLLL;
            if (kqa != null) {
                kqa.j0(c87497YVp.LJLL, c102283zs.LIZIZ);
            }
            this.LIZIZ = false;
        }
    }

    public final void LJ(C102283zs c102283zs) {
        this.LIZ = c102283zs;
        if (IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZIZ()) {
            this.LIZJ.getClass();
            if (C87497YVp.LIZ(c102283zs) && (!c102283zs.LIZ.isEmpty())) {
                C87497YVp c87497YVp = this.LIZJ;
                List<C4J7> list = c102283zs.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<C4J7> it = list.iterator();
                while (it.hasNext()) {
                    Aweme aweme = it.next().LIZ;
                    if (aweme != null) {
                        arrayList.add(aweme);
                    }
                }
                c87497YVp.LIZJ(arrayList);
                return;
            }
        }
        if (c102283zs.LIZ.isEmpty()) {
            C87497YVp c87497YVp2 = this.LIZJ;
            KQA kqa = c87497YVp2.LJLJLLL;
            if (kqa != null) {
                kqa.c0(c87497YVp2.LJLJI);
            }
            this.LIZJ.LJLJI = false;
            this.LIZIZ = false;
            return;
        }
        this.LIZJ.LIZIZ().LJIILL(LIZLLL(c102283zs.LIZ), "", "");
    }
}
