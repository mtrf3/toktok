package X;

import Y.ACListenerS37S0300000_12;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1T extends HSS {
    public final C51556KLg LJLJLJ;
    public final S1U LJLJLLL;
    public final String LJLL;
    public boolean LJLLI;
    public S1Y LJLLILLLL;

    @Override // X.HSS, X.S1E
    public final CharSequence LIZJ() {
        S1U s1u = this.LJLJLLL;
        if (s1u != null) {
            return s1u.LIZJ();
        }
        return null;
    }

    @Override // X.S1E
    public final S1E clone() {
        return new S1T();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.POI.getTYPE();
    }

    public S1T() {
        S1U s1u;
        C51556KLg c51556KLg = C51556KLg.LIZ;
        this.LJLJLJ = c51556KLg;
        if (c51556KLg != null) {
            s1u = C51556KLg.LIZ().LJJLIIIJLJLI();
        } else {
            s1u = null;
        }
        this.LJLJLLL = s1u;
        this.LJLL = "video_anchor";
    }

    public final String LJJJJJL() {
        String LJJIIZ = LJJIIZ();
        if (!C78857UxB.LJJJIL(LJJIIZ) || LJJIIZ == null) {
            return this.LJLL;
        }
        return LJJIIZ;
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        S1Y s1y = this.LJLLILLLL;
        if (s1y != null) {
            s1y.LIZLLL(eventMapBuilder, LJJII(), LJJJJJL(), LJJIIZI());
        } else {
            o.LJIJI("makerBehavior");
            throw null;
        }
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        S1U s1u = this.LJLJLLL;
        if (s1u != null && s1u.enable()) {
            return super.LJFF(list);
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AnchorCommonStruct) next).getType() == type()) {
                if (next != null) {
                    arrayList.remove(next);
                }
            }
        }
        return EnumC26289ATl.NOT_FOUND;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        S1Y s1y = this.LJLLILLLL;
        if (s1y != null) {
            s1y.LIZIZ(c188727au, LJJII(), LJJJJJL(), LJJIIZI());
        } else {
            o.LJIJI("makerBehavior");
            throw null;
        }
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        S1Y s1y = this.LJLLILLLL;
        if (s1y != null) {
            s1y.LIZ(eventMapBuilder, LJJII(), LJJJJJL(), LJJIIZI());
        } else {
            o.LJIJI("makerBehavior");
            throw null;
        }
    }

    @Override // X.HSW, X.S1E
    public final void LJIIJJI(C7F9 c7f9) {
        S1Y s1x;
        this.LJLIL = c7f9;
        S1U s1u = this.LJLJLLL;
        if (s1u != null) {
            s1u.LJJI(c7f9.LIZ);
        }
        if (LJJII().getAnchors().size() > 1) {
            s1x = new S1W(this.LJLJLLL, LJIIIZ(), this.LJLJLJ);
        } else {
            s1x = new S1X(this.LJLJLLL, LJIIIZ(), this.LJLJLJ);
        }
        this.LJLLILLLL = s1x;
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        View view;
        o.LJIIIZ(dialog, "dialog");
        S1U s1u = this.LJLJLLL;
        if (s1u != null && s1u.enable()) {
            if (this.LJLJLJ != null) {
                view = C51556KLg.LIZ().LJJLIL(LJIIIZ().LIZ(), LJJII());
                if (view != null) {
                    C16880lQ.LJIIJ(new ACListenerS37S0300000_12(dialog, this, c188727au, 2), view);
                }
            } else {
                view = null;
            }
            viewGroup.addView(view);
        }
    }

    public final void LJJJJJ(int i, int i2, int i3, int i4, int i5, int i6) {
        S1U s1u = this.LJLJLLL;
        if (s1u != null) {
            s1u.LJJJJZI(i, i2, 0, i4, i5, 0);
        }
        if (i4 > 0 || i5 > 0) {
            this.LJLLI = true;
        }
    }
}
