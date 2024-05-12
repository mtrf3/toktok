package X;

import Y.ACListenerS34S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.AUListenerS93S0100000_4;
import Y.IDTListenerS122S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Iterator;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WKb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82101WKb extends C82102WKc {
    public static final /* synthetic */ int LLFF = 0;
    public final boolean LJLLJ;
    public int LJLLLL;
    public View LJZI;
    public XKQ LJZL;
    public final long LJLLL = 250;
    public int LJLLLLLL = 2;
    public final AnimatorSet LJLZ = new AnimatorSet();
    public int LJZ = 4;
    public final int LL = SFS.LJI(52.0d);
    public boolean LLD = true;
    public boolean LLF = true;

    @Override // X.C82102WKc
    public final void LLJJJJ() {
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJIIIIZZ;
            }
        }, null, new AqS180S0100000_14(this, 271), 2, null);
    }

    @Override // X.C82102WKc
    public final int LLJILJILJ() {
        int LJI = SFS.LJI(40.0d);
        int LIZLLL = getUiStates().LJ.LIZIZ.LIZLLL();
        int i = (this.LL * LIZLLL) + LJI;
        if (LIZLLL > 0) {
            return i + SFS.LJI(18.0d);
        }
        return i;
    }

    public final void LLJLILLLLZIIL() {
        LLJJIJIL().setOverScrollMode(2);
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        new C61995OUt(requireSceneContext).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
        View view = this.LJZI;
        if (view != null) {
            view.setBackground(null);
        }
        LLJJIJIL().LLLF = false;
        Iterator<WI1> it = getUiStates().LJ.LIZIZ.LJIIJ().iterator();
        while (it.hasNext()) {
            it.next().LJ = false;
        }
        getUiActions().LJLJJL.invoke(Boolean.FALSE);
        getUiStates().LJ.LIZIZ.LJIILJJIL(false);
        getUiStates().LJ.LIZIZ.LJIIJJI();
        this.LJLLLLLL = 2;
        int height = LLJJIJIL().getHeight();
        int LLJLIL = LLJLIL(getUiStates().LJ.LIZIZ.getItemCount(), true);
        this.LJLZ.cancel();
        LLJJIJIL();
        if (this.LJLLLLLL == 1) {
            LLJJIJIIJIL().setRotation(180.0f);
        } else {
            LLJJIJIIJIL().setRotation(0.0f);
        }
        this.LJLZ.playTogether(LLJJLIIIJLLLLLLLZ(height, LLJLIL, LLJJIJIL()));
        this.LJLZ.start();
    }

    @Override // X.C82102WKc, X.WM7
    public final void onDestroy() {
        super.onDestroy();
        this.LJLZ.cancel();
        XKQ xkq = this.LJZL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
        if (ORY.LJJIJIIJIL(Integer.valueOf(getUiStates().LJ.LIZ.getPanelType()), new Integer[]{1, 4}) && this.LLF) {
            Iterator<WI1> it = getUiStates().LJ.LIZIZ.LJIIJ().iterator();
            while (it.hasNext()) {
                it.next().LJ = true;
            }
            getUiActions().LJLJJL.invoke(Boolean.TRUE);
            XKQ xkq = this.LJZL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJZL = XKX.LIZLLL(C780334l.LJLIL, null, null, new C66152ih(this, null), 3);
            this.LLF = false;
        }
        Iterator<WI1> it2 = getUiStates().LJ.LIZIZ.LJIIJ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            WI1 next = it2.next();
            WI1 wi1 = next;
            if (wi1.LIZJ().LJLIL == VLL.FIXED && !wi1.LIZJ().LJLJI) {
                if (next != null) {
                    LLJJI().setVisibility(0);
                    LLJJIII().setVisibility(0);
                    return;
                }
            }
        }
        LLJJI().setVisibility(8);
        LLJJIII().setVisibility(8);
    }

    public C82101WKb(boolean z) {
        this.LJLLJ = z;
    }

    @Override // X.C82102WKc, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        FrameLayout.LayoutParams layoutParams;
        boolean z;
        boolean z2;
        View view;
        super.onActivityCreated(bundle);
        int i = 4;
        if (getUiStates().LJ.LIZ.getPanelType() != 1) {
            i = 7;
        }
        this.LJZ = i;
        AbstractC030109x itemAnimator = LLJJIJIL().getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        ViewGroup.LayoutParams layoutParams2 = LLJJIJIIJIL().getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            layoutParams.topMargin = (int) C74275TDb.LIZIZ(requireSceneContext, 12.0f);
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            layoutParams.leftMargin = (int) C74275TDb.LIZIZ(requireSceneContext2, 10.0f);
            Context requireSceneContext3 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
            layoutParams.bottomMargin = (int) C74275TDb.LIZIZ(requireSceneContext3, 10.0f);
        }
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            LLJJIJIIJIL().setVisibility(0);
            LLJJIII().setVisibility(0);
            LLJJI().setVisibility(0);
        } else if (getUiStates().LJ.LIZ.getPanelType() == 2) {
            LLJJIII().setVisibility(8);
            LLJJIJIIJIL().setVisibility(0);
        } else if (ORY.LJJIJIIJIL(Integer.valueOf(getUiStates().LJ.LIZ.getPanelType()), new Integer[]{4, 5})) {
            LLJJIJIIJIL().setVisibility(8);
            LLJJIII().setVisibility(0);
            LLJJI().setVisibility(0);
        }
        LLJJI().setOverScrollMode(2);
        View requireView = requireView();
        o.LJII(requireView, "null cannot be cast to non-null type android.widget.FrameLayout");
        requireView.setOnTouchListener(new IDTListenerS122S0100000_14(this, 5));
        getUiStates().LJ.LIZIZ.LJII().observe(this, new AObserverS82S0100000_14(this, 51));
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJ;
            }
        }, null, new AqS180S0100000_14(this, 278), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WKp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82105WKf) obj).LIZLLL);
            }
        }, null, new AqS180S0100000_14(this, 279), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJI;
            }
        }, null, new AqS180S0100000_14(this, 280), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WL1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJII;
            }
        }, null, new AqS180S0100000_14(this, 274), 2, null);
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS34S0100000_14(this, 67));
            C57185McP LLJJIJIL = LLJJIJIL();
            requireSceneContext();
            LLJJIJIL.setLayoutManager(new LinearLayoutManager(1, false));
            Context requireSceneContext4 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext4, "requireSceneContext()");
            WJA wja = getUiStates().LJ.LIZIZ;
            C82091WJr uiActions = getUiActions();
            if (ORY.LJJIJIIJIL(Integer.valueOf(getUiStates().LJ.LIZ.getPanelType()), new Integer[]{4, 5}) || C52533KjZ.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJL = new C82036WHo(requireSceneContext4, wja, uiActions, z);
            LLJJIJIL().setAdapter(LLJILJIL());
            if (e1.LIZ(31744, "judge_toolbar_item_animator_crash", true, true) && this.LJLLJ) {
                LLJJI().setItemAnimator(new C87000YCm(VLL.FIXED, getUiStates().LJ.LIZIZ));
                LLJJIJIL().setItemAnimator(new C87000YCm(VLL.SLIDE, getUiStates().LJ.LIZIZ));
            }
            C57185McP LLJJI = LLJJI();
            requireSceneContext();
            LLJJI.setLayoutManager(new LinearLayoutManager(1, false));
            Context requireSceneContext5 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext5, "requireSceneContext()");
            WJA wja2 = getUiStates().LJ.LIZIZ;
            C82091WJr uiActions2 = getUiActions();
            if (ORY.LJJIJIIJIL(Integer.valueOf(getUiStates().LJ.LIZ.getPanelType()), new Integer[]{4, 5}) || C52533KjZ.LIZJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJLJ = new C82037WHp(requireSceneContext5, wja2, uiActions2, z2);
            LLJJI().setAdapter(LLJJ());
            LLJJI().LLLF = false;
            if (ORY.LJJIJIIJIL(Integer.valueOf(getUiStates().LJ.LIZ.getPanelType()), new Integer[]{4, 5}) && (view = this.LJZI) != null) {
                C26338AVi.LJI(view, null, null, Integer.valueOf((int) C32151Nz.LJIIZILJ(7)), null, false, 27);
            }
            LLJJJIL();
            return;
        }
        o.LJIJI("loadMoreContainer");
        throw null;
    }

    public final int LLJLIL(int i, boolean z) {
        int i2;
        int LLJJIJI = LLJJIJI();
        int i3 = LLJJIJI / this.LL;
        if (z) {
            if (getUiStates().LJ.LIZ.getPanelType() == 1) {
                i2 = 4;
            } else {
                i2 = 7;
            }
        } else if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            i2 = 6;
        } else {
            i2 = 9;
        }
        if (i - i2 <= 1) {
            i2 = i;
        }
        int min = Math.min(i2, i3);
        int i4 = this.LL;
        int i5 = min * i4;
        if (!z && min < i) {
            i5 += i4 / 2;
        }
        return Math.min(i5, LLJJIJI);
    }

    public final ValueAnimator LLJJLIIIJLLLLLLLZ(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.LJLLL);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4((C57185McP) view, 18));
        return ofInt;
    }

    @Override // X.C82102WKc, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.crv, container, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cs7, container, false);
        }
        View findViewById = LLLLIILL.findViewById(R.id.g7k);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.load_more_container)");
        this.LJLJJI = (FrameLayout) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.k4h);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.slide_region)");
        this.LJLIL = (C57185McP) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.dbj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.fixed_region)");
        this.LJLILLLLZI = (C57185McP) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.fs0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.line_between)");
        this.LJLJJLL = findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.ldk);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.toolbar_more_icon)");
        this.LJLJJL = (ImageView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.lcv);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.toolbar_container)");
        this.LJLJI = (LinearLayout) findViewById6;
        this.LJZI = LLLLIILL.findViewById(R.id.ld3);
        return (ViewGroup) LLLLIILL;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
