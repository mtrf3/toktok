package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import X.AbstractC53892LDc;
import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C2NH;
import X.C45804HyK;
import X.C53890LDa;
import X.C53891LDb;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.L7P;
import X.LDY;
import X.LEF;
import X.LEG;
import X.LLQ;
import X.LOP;
import X.LOS;
import X.LOX;
import Y.ARunnableS15S0110000_9;
import Y.IDObjectS0S0101000;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hox.Hox;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopTabLayoutAbility implements TopTabAbility {
    public static final /* synthetic */ int LJLJJL = 0;
    public final LOS LJLIL;
    public final Context LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C53890LDa.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 258));

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void Of0() {
        LOP lop;
        LOX lox;
        LOS los = this.LJLIL;
        los.getClass();
        Iterator<LOP> it = los.LJLIL.iterator();
        while (true) {
            if (it.hasNext()) {
                lop = it.next();
                if (o.LJ(lop.LJ, "Shop")) {
                    break;
                }
            } else {
                lop = null;
                break;
            }
        }
        LOP lop2 = lop;
        if (lop2 != null && (lox = lop2.LIZLLL) != null) {
            lox.performClick();
        }
    }

    public TopTabLayoutAbility(LOS los) {
        this.LJLIL = los;
        this.LJLILLLLZI = los.getContext();
    }

    public final void LIZ(boolean z) {
        Context context = this.LJLILLLLZI;
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(LJJIFFI);
        if (z) {
            LIZJ.LJII(R.attr.cl);
            LIZJ.LJ(R.attr.cl);
            LIZJ.LIZ(true);
            LIZJ.LIZJ();
            return;
        }
        LIZJ.LJII(R.attr.d4);
        LIZJ.LJ(R.attr.d4);
        LIZJ.LIZ(true);
        LIZJ.LIZJ();
    }

    public final void LIZIZ(int i) {
        ViewGroup viewGroup;
        ViewParent parent = this.LJLIL.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        IDObjectS0S0101000 iDObjectS0S0101000 = new IDObjectS0S0101000(viewGroup, 2);
        while (iDObjectS0S0101000.hasNext()) {
            View view = (View) iDObjectS0S0101000.next();
            if (view.getId() == R.id.e6d && (view instanceof TuxIconView)) {
                ((TuxIconView) view).setTintColorRes(i);
                return;
            }
        }
    }

    public final void LIZJ(boolean z) {
        LLQ llq;
        LOS los = this.LJLIL;
        los.LJIJJLI(LEG.LJLIL);
        los.setSelectedTabIndicatorColor(los.getContext().getResources().getColor(R.color.bc));
        LIZIZ(R.attr.dj);
        if (z && (llq = (LLQ) this.LJLJJI.getValue()) != null) {
            llq.LJJIL(null, L7P.DARK);
        }
    }

    public final void LIZLLL(boolean z) {
        LLQ llq;
        LOS los = this.LJLIL;
        los.LJIJJLI(LEF.LJLIL);
        los.setSelectedTabIndicatorColor(los.getContext().getResources().getColor(R.color.bi));
        LIZIZ(R.attr.ed);
        if (z && (llq = (LLQ) this.LJLJJI.getValue()) != null) {
            llq.LJJIL(null, L7P.LIGHT);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void a2(LDY observer) {
        Object obj;
        o.LJIIIZ(observer, "observer");
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "borderTabLayout.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        Iterator it = ((List) this.LJLJI.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C53891LDb) obj).LJLIL, observer)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C53891LDb c53891LDb = (C53891LDb) obj;
        if (c53891LDb != null) {
            AbstractC53895LDf rv0 = Hox.LJLLI.LIZ(LJJIFFI).rv0("HOME");
            o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
            ((AbstractC53892LDc) rv0).LJIL(c53891LDb);
            ((List) this.LJLJI.getValue()).remove(c53891LDb);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void na(LDY observer) {
        o.LJIIIZ(observer, "observer");
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "borderTabLayout.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        AbstractC53895LDf rv0 = Hox.LJLLI.LIZ(LJJIFFI).rv0("HOME");
        o.LJII(rv0, "null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
        C53891LDb c53891LDb = new C53891LDb(observer);
        ((List) this.LJLJI.getValue()).add(c53891LDb);
        ((AbstractC53892LDc) rv0).LJIIZILJ(c53891LDb);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void Cg0(boolean z, boolean z2) {
        LIZ(false);
        if (z) {
            C2NH.LIZ.post(new ARunnableS15S0110000_9(this, z2, 3));
        } else {
            LIZJ(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void yh0(boolean z, boolean z2) {
        LIZ(true);
        if (z) {
            C2NH.LIZ.post(new ARunnableS15S0110000_9(this, z2, 4));
        } else {
            LIZLLL(z2);
        }
    }
}
