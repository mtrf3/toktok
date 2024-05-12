package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YVs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87500YVs implements InterfaceC102233zn {
    public C102283zs LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C87496YVo LIZJ;

    public C87500YVs(C87496YVo c87496YVo) {
        this.LIZJ = c87496YVo;
    }

    @Override // X.InterfaceC102233zn
    public final void LIZ(C102283zs c102283zs) {
        C87496YVo c87496YVo;
        KQA kqa;
        LIZLLL(c102283zs);
        if (c102283zs.LIZ.isEmpty() && (kqa = (c87496YVo = this.LIZJ).LJLJLLL) != null) {
            List<Aweme> list = c87496YVo.LJLLJ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            kqa.jh(arrayList, c102283zs.LIZIZ);
        }
    }

    @Override // X.InterfaceC102233zn
    public final void LIZIZ(C102283zs c102283zs) {
        String LLD;
        this.LIZ = c102283zs;
        this.LIZIZ = false;
        if (c102283zs.LIZ.isEmpty()) {
            this.LIZJ.LJLLJ.clear();
            KQA kqa = this.LIZJ.LJLJLLL;
            if (kqa != null) {
                kqa.J5(new ArrayList(), c102283zs.LIZIZ);
                return;
            }
            return;
        }
        C50908JyS LIZ = this.LIZJ.LIZ();
        Object[] objArr = new Object[3];
        List<C4J7> list = c102283zs.LIZ;
        if (list.isEmpty()) {
            LLD = "";
        } else {
            LLD = ORZ.LLD(list, ",", "[", "]", C4J8.LJLIL, 24);
        }
        objArr[0] = LLD;
        objArr[1] = "";
        objArr[2] = "";
        LIZ.LJIILL(objArr);
    }

    @Override // X.InterfaceC102233zn
    public final void LIZJ(C102283zs c102283zs) {
        C87496YVo c87496YVo;
        KQA kqa;
        LIZLLL(c102283zs);
        if (c102283zs.LIZ.isEmpty() && (kqa = (c87496YVo = this.LIZJ).LJLJLLL) != null) {
            List<Aweme> list = c87496YVo.LJLLJ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            kqa.j0(arrayList, c102283zs.LIZIZ);
        }
    }

    public final void LIZLLL(C102283zs c102283zs) {
        String LLD;
        this.LIZ = c102283zs;
        this.LIZIZ = false;
        if (c102283zs.LIZ.isEmpty()) {
            C87496YVo c87496YVo = this.LIZJ;
            KQA kqa = c87496YVo.LJLJLLL;
            if (kqa != null) {
                kqa.c0(c87496YVo.LJLJI);
            }
            this.LIZJ.LJLJI = false;
            return;
        }
        C50908JyS LIZ = this.LIZJ.LIZ();
        Object[] objArr = new Object[3];
        List<C4J7> list = c102283zs.LIZ;
        if (list.isEmpty()) {
            LLD = "";
        } else {
            LLD = ORZ.LLD(list, ",", "[", "]", C4J8.LJLIL, 24);
        }
        objArr[0] = LLD;
        objArr[1] = "";
        objArr[2] = "";
        LIZ.LJIILL(objArr);
    }
}
