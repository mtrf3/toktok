package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y9q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86926Y9q implements MEJ {
    public final ActivityC45651qj LIZ;
    public final C62822Ol8 LIZIZ;
    public List<? extends InterfaceC86931Y9v> LIZJ;
    public boolean LIZLLL;
    public Aweme LJ;
    public View LJFF;

    public final DescBottomViewModel LIZLLL() {
        return (DescBottomViewModel) this.LIZIZ.getValue();
    }

    public C86926Y9q(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 909));
        this.LIZJ = new ArrayList();
    }

    @Override // X.MEJ
    public final ME4 LIZIZ(C50420Jqa event) {
        C2KK c2kk;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if (!(obj instanceof C2KK) || (c2kk = (C2KK) obj) == null) {
            return ME4.NONE;
        }
        if (c2kk.LJLIL) {
            return ME4.IN;
        }
        return ME4.OUT;
    }

    @Override // X.MEJ
    public final View LIZJ(ActivityC45651qj context, ViewGroup container) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        if (AnonymousClass843.LIZ == 4) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aak, container, false);
            o.LJIIIIZZ(LLLLIILL, "from(context)\n          …t_area, container, false)");
            this.LJFF = LLLLIILL;
            this.LIZJ = C47261Igj.LJJIJIIJI(new C86928Y9s(this), new C86927Y9r(this), new C86929Y9t(this), new C86925Y9p(this), new C86930Y9u(this));
            return LLLLIILL;
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aaj, container, false);
        o.LJIIIIZZ(LLLLIILL2, "from(context)\n          …se_btn, container, false)");
        this.LJFF = LLLLIILL2;
        this.LIZJ = C47261Igj.LJJIJ(new C86929Y9t(this));
        return LLLLIILL2;
    }

    @Override // X.MEJ
    public final void LIZ(C50420Jqa event, Aweme aweme, boolean z) {
        C2KK c2kk;
        SY9 sy9;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if (!(obj instanceof C2KK) || (c2kk = (C2KK) obj) == null) {
            return;
        }
        if (z) {
            this.LJ = aweme;
            Iterator<? extends InterfaceC86931Y9v> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(aweme);
            }
            List<? extends InterfaceC86931Y9v> list = this.LIZJ;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC86931Y9v interfaceC86931Y9v : list) {
                if (interfaceC86931Y9v instanceof C86928Y9s) {
                    arrayList.add(interfaceC86931Y9v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C86928Y9s c86928Y9s = (C86928Y9s) it2.next();
                boolean z2 = c2kk.LJLJJI;
                C2314896q c2314896q = c86928Y9s.LIZ;
                if (c2314896q != null) {
                    c2314896q.LIZIZ(z2);
                }
            }
            List<? extends InterfaceC86931Y9v> list2 = this.LIZJ;
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC86931Y9v interfaceC86931Y9v2 : list2) {
                if (interfaceC86931Y9v2 instanceof C86927Y9r) {
                    arrayList2.add(interfaceC86931Y9v2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C86927Y9r c86927Y9r = (C86927Y9r) it3.next();
                boolean z3 = c2kk.LJLJJL;
                T5P t5p = c86927Y9r.LIZ;
                if (t5p != null) {
                    if (z3) {
                        sy9 = c86927Y9r.LIZIZ;
                    } else {
                        sy9 = c86927Y9r.LIZJ;
                    }
                    t5p.setImageDrawable(sy9);
                }
            }
            this.LIZLLL = true;
            LIZLLL().LJLJLLL = c2kk.LJLILLLLZI;
            LIZLLL().LJLJLJ = aweme;
            return;
        }
        this.LIZLLL = false;
        Iterator<? extends InterfaceC86931Y9v> it4 = this.LIZJ.iterator();
        while (it4.hasNext()) {
            it4.next().LIZ(this.LJ);
        }
    }
}
