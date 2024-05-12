package com.ss.android.ugc.gamora.recorder.navi;

import X.ActivityC45651qj;
import X.C162476Zf;
import X.C16880lQ;
import X.C29S;
import X.C87275YNb;
import X.ERS;
import X.ESP;
import X.EnumC87274YNa;
import X.IDK;
import X.ORZ;
import X.T4Q;
import X.TGM;
import X.TGT;
import X.TK4;
import X.YNZ;
import Y.ACListenerS35S0100000_15;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DynamicSelectorHandler extends ESP implements GenericLifecycleObserver, TGM, TGT {
    public final List<TK4> LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public TK4 LJLJJI;
    public TK4 LJLJJL;
    public EnumC87274YNa LJLJJLL;
    public YNZ LJLJL;
    public LinearLayout LJLJLJ;
    public Effect LJLJLLL;
    public boolean LJLL;
    public final MutableLiveData<Boolean> LJLLI;
    public final MutableLiveData LJLLILLLL;

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        TK4 tk4;
        EnumC87274YNa enumC87274YNa = this.LJLJJLL;
        if (enumC87274YNa != null) {
            int i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
            if (i != 1) {
                if (i == 2 && (tk4 = this.LJLJJI) != null) {
                    tk4.LJIIJJI();
                }
            } else {
                LJIILJJIL();
                TK4 tk42 = this.LJLJJI;
                if (tk42 != null) {
                    tk42.LJIIJJI();
                }
                TK4 tk43 = this.LJLJJL;
                if (tk43 != null) {
                    tk43.LJIIJJI();
                }
            }
        }
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
        this.LJLJLLL = null;
    }

    public final YNZ LJIILIIL() {
        YNZ ynz = this.LJLJL;
        if (ynz != null) {
            return ynz;
        }
        YNZ ynz2 = new YNZ(this.LJLJI);
        this.LJLJL = ynz2;
        return ynz2;
    }

    public final void LJIILL() {
        TK4 tk4 = this.LJLJJI;
        if (tk4 == null || this.LJLJJL == null) {
            return;
        }
        if (this.LJLJL == null) {
            this.LJLL = true;
            return;
        }
        View LJIIIIZZ = tk4.LJIIIIZZ();
        TK4 tk42 = this.LJLJJL;
        o.LJI(tk42);
        View LJIIIIZZ2 = tk42.LJIIIIZZ();
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout != null) {
            C16880lQ.LJZI(linearLayout, LJIIIIZZ);
        }
        LinearLayout linearLayout2 = this.LJLJLJ;
        if (linearLayout2 != null) {
            C16880lQ.LJZI(linearLayout2, LJIIIIZZ2);
        }
        YNZ LJIILIIL = LJIILIIL();
        TK4 tk43 = this.LJLJJI;
        o.LJI(tk43);
        TK4 tk44 = this.LJLJJL;
        o.LJI(tk44);
        LJIILIIL.LJLJI = null;
        LJIILIIL.setVisibility(0);
        LJIILIIL.LJLIL = tk43;
        LJIILIIL.LJLILLLLZI = tk44;
        LJIILIIL.LJLJLJ = tk43.LJIIIIZZ();
        LJIILIIL.LJLJLLL = tk44.LJIIIIZZ();
        View LJIIIIZZ3 = tk43.LJIIIIZZ();
        if (LJIIIIZZ3 == null || LJIIIIZZ3.getParent() == null) {
            LJIILIIL.LJLLLLLL.addView(LJIILIIL.LJLJLJ);
        }
        View LJIIIIZZ4 = tk44.LJIIIIZZ();
        if (LJIIIIZZ4 == null || LJIIIIZZ4.getParent() == null) {
            LJIILIIL.LJLZ.addView(LJIILIIL.LJLJLLL);
        }
        View LJFF = tk43.LJFF();
        View LJFF2 = tk44.LJFF();
        ViewGroup viewGroup = LJIILIIL.LJLJJLL;
        viewGroup.removeAllViews();
        viewGroup.addView(LJFF);
        ViewGroup viewGroup2 = LJIILIIL.LJLJL;
        viewGroup2.removeAllViews();
        viewGroup2.addView(LJFF2);
        C16880lQ.LJIIL(LJIILIIL.LJLJJLL, new ACListenerS35S0100000_15(LJIILIIL, 301));
        C16880lQ.LJIIL(LJIILIIL.LJLJL, new ACListenerS35S0100000_15(LJIILIIL, 302));
        LJIILIIL.LIZJ();
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        int i;
        EnumC87274YNa enumC87274YNa = this.LJLJJLL;
        if (enumC87274YNa == null) {
            i = -1;
        } else {
            i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
        }
        if (i == -1) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                TK4 tk4 = this.LJLJJI;
                if (tk4 == null || !tk4.LLIIIJ()) {
                    return false;
                }
            } else {
                throw new C162476Zf();
            }
        } else {
            TK4 tk42 = this.LJLJJI;
            if (tk42 == null || this.LJLJJL == null) {
                return false;
            }
            o.LJI(tk42);
            if (!tk42.LLIIIJ()) {
                TK4 tk43 = this.LJLJJL;
                o.LJI(tk43);
                if (!tk43.LLIIIJ()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.TGT
    public final void LLIIIL() {
        EnumC87274YNa enumC87274YNa = this.LJLJJLL;
        if (enumC87274YNa == null) {
            return;
        }
        int i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            TK4 tk4 = this.LJLJJI;
            if (tk4 != null) {
                tk4.LLIIIL();
            }
            this.LJLLI.setValue(Boolean.FALSE);
            return;
        }
        YNZ ynz = this.LJLJL;
        if (ynz != null) {
            AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 201);
            Boolean bool = ynz.LJLJI;
            if (bool != null) {
                aqS181S0100000_15.invoke(Boolean.valueOf(bool.booleanValue()));
            }
        }
        YNZ ynz2 = this.LJLJL;
        if (ynz2 != null) {
            ynz2.setVisibility(8);
        }
        this.LJLLI.setValue(Boolean.FALSE);
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        EnumC87274YNa enumC87274YNa = this.LJLJJLL;
        if (enumC87274YNa == null) {
            return;
        }
        int i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            TK4 tk4 = this.LJLJJI;
            if (tk4 != null) {
                tk4.LLIIIZ();
            }
            this.LJLLI.setValue(Boolean.TRUE);
            return;
        }
        YNZ ynz = this.LJLJL;
        if (ynz != null) {
            AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 202);
            Boolean bool = ynz.LJLJI;
            if (bool != null) {
                aqS181S0100000_15.invoke(Boolean.valueOf(bool.booleanValue()));
            }
        }
        YNZ ynz2 = this.LJLJL;
        if (ynz2 != null) {
            ynz2.setVisibility(0);
        }
        this.LJLLI.setValue(Boolean.TRUE);
    }

    public final void LJIILJJIL() {
        ViewParent viewParent;
        ViewParent viewParent2;
        ValueAnimator valueAnimator;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View leftSelectorView = LJIILIIL().getLeftSelectorView();
        if (leftSelectorView != null) {
            viewParent = leftSelectorView.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(leftSelectorView, viewGroup2);
        }
        View rightSelectorView = LJIILIIL().getRightSelectorView();
        if (rightSelectorView != null) {
            viewParent2 = rightSelectorView.getParent();
        } else {
            viewParent2 = null;
        }
        if ((viewParent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent2) != null) {
            C16880lQ.LJLLL(rightSelectorView, viewGroup);
        }
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout != null) {
            linearLayout.addView(leftSelectorView);
        }
        LinearLayout linearLayout2 = this.LJLJLJ;
        if (linearLayout2 != null) {
            linearLayout2.addView(rightSelectorView);
        }
        YNZ LJIILIIL = LJIILIIL();
        ValueAnimator valueAnimator2 = LJIILIIL.LJLLJ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = LJIILIIL.LJLLJ) != null) {
            valueAnimator.end();
        }
        if (LJIILIIL.LJLLLL != 0 && LJIILIIL.LJLLL != 0) {
            LJIILIIL.LJLJJI.getLayoutParams().width = LJIILIIL.LJLLLL;
            LJIILIIL.LJLJJL.getLayoutParams().width = LJIILIIL.LJLLL;
        }
        LJIILIIL.LJLJLLL = null;
        LJIILIIL.LJLJLJ = null;
        LJIILIIL.LJLLI = null;
        LJIILIIL.LJLLILLLL = null;
        LJIILIIL().setVisibility(8);
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        Iterator<TK4> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(stickerView);
        }
        LinearLayout linearLayout = (LinearLayout) stickerView.findViewById(R.id.g4a);
        this.LJLJLJ = linearLayout;
        if (linearLayout != null) {
            linearLayout.addView(LJIILIIL());
        }
        if (this.LJLL) {
            LIZJ(IDK.AFTER_ANIMATE);
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        TK4 tk4;
        o.LJIIIZ(state, "state");
        EnumC87274YNa enumC87274YNa = this.LJLJJLL;
        if (enumC87274YNa == null) {
            return;
        }
        int i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
        if (i != 1) {
            if (i != 2 || (tk4 = this.LJLJJI) == null) {
                return;
            }
            tk4.LIZJ(state);
            return;
        }
        Iterator<TK4> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(state);
        }
        if (this.LJLL) {
            this.LJLL = false;
            LJIILL();
            return;
        }
        YNZ ynz = this.LJLJL;
        if (ynz != null) {
            ynz.setVisibility(0);
        }
        YNZ ynz2 = this.LJLJL;
        if (ynz2 == null) {
            return;
        }
        if (o.LJ(ynz2.LJLJI, Boolean.TRUE)) {
            ynz2.LIZIZ(ynz2.LJLJJL, ynz2.LJLJJI);
        } else {
            ynz2.LIZIZ(ynz2.LJLJJI, ynz2.LJLJJL);
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        TK4 tk4;
        o.LJIIIZ(state, "state");
        EnumC87274YNa enumC87274YNa = this.LJLJJLL;
        if (enumC87274YNa == null) {
            return;
        }
        int i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
        if (i != 1) {
            if (i != 2 || (tk4 = this.LJLJJI) == null) {
                return;
            }
            tk4.LJII(state);
            return;
        }
        Iterator<TK4> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJII(state);
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        Iterator<TK4> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            if (it.next().LJIIJ(session)) {
                if (!o.LJ(this.LJLJLLL, session.LIZ)) {
                    LJIIJJI();
                    return true;
                }
                if (this.LJLJJLL != EnumC87274YNa.Dynamic) {
                    return true;
                }
                LJIILJJIL();
                return true;
            }
        }
        return false;
    }

    public DynamicSelectorHandler(List list, C29S activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI = list;
        this.LJLJI = activity;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLLI = mutableLiveData;
        this.LJLLILLLL = mutableLiveData;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        TK4 tk4;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        EnumC87274YNa enumC87274YNa = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
        this.LJLJLLL = null;
        List<TK4> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (TK4 tk42 : list) {
            if (tk42.LJIIJ(session)) {
                arrayList.add(tk42);
            }
        }
        this.LJLJJI = (TK4) ORZ.LJLLLL(arrayList);
        this.LJLJJL = (TK4) ORZ.LJLLLLLL(1, arrayList);
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                enumC87274YNa = EnumC87274YNa.Dynamic;
            } else {
                enumC87274YNa = EnumC87274YNa.Single;
            }
        }
        this.LJLJJLL = enumC87274YNa;
        if (enumC87274YNa != null) {
            int i = C87275YNb.LIZ[enumC87274YNa.ordinal()];
            if (i != 1) {
                if (i == 2 && (tk4 = this.LJLJJI) != null) {
                    tk4.LJIIL(result, session);
                }
            } else {
                TK4 tk43 = this.LJLJJI;
                if (tk43 != null) {
                    tk43.LJIIL(result, session);
                }
                TK4 tk44 = this.LJLJJL;
                if (tk44 != null) {
                    tk44.LJIIL(result, session);
                }
                LJIILL();
            }
        }
        this.LJLJLLL = session.LIZ;
    }
}
