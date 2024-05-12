package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS69S0100000_1;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS13S0101000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDCListenerS300S0100000_9;
import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mj4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57598Mj4 implements C2MA, IZ2, InterfaceC222408o8 {
    public final C222588oQ LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public Aweme LJLJJL;
    public final C57596Mj2 LJLJJLL;
    public final C57604MjA LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // X.C2MA
    public final void A7(String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void A8() {
    }

    @Override // X.C2MA
    public final void B7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void C7(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void D7(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean D8() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void E8(int i, Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void F8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void G7(boolean z) {
    }

    @Override // X.C2MA
    public final void H8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean I8() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void J7(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void J8(int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean K7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void L5(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void L8(int i, String str) {
    }

    public final void LJFF() {
        int LIZ;
        if (C57092Lx.LIZ.LJFF) {
            LIZ = 0;
        } else {
            LIZ = C61447O9r.LIZ();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tryDoAdaptation bottomMargin = ");
        LIZ2.append(LIZ);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ2));
        ViewGroup.LayoutParams layoutParams = this.LJLJJLL.LIZ(R.id.j76).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = LIZ;
        this.LJLJJLL.LIZ(R.id.j76).setLayoutParams(layoutParams2);
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJII(C56682Ki c56682Ki) {
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final InterfaceC57312Mt LJIIIIZZ() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJIIJJI() {
        throw null;
    }

    @Override // X.C2MA
    public final /* synthetic */ InterfaceC222698ob LLJJIJIL() {
        return null;
    }

    @Override // X.C2MA
    public final InterfaceC222708oc LLLJ() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void N8(long j, long j2, int i, long j3, long j4, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void O7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean O8() {
        return false;
    }

    @Override // X.C2MA
    public final void P7(C9BZ c9bz) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void P8(int i, String str) {
    }

    @Override // X.C2MA
    public final void Q7(String enterMethodValue) {
        o.LJIIIZ(enterMethodValue, "enterMethodValue");
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean R7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean S7() {
        return false;
    }

    @Override // X.C2MA
    public final void T7(C187227Wk c187227Wk) {
    }

    @Override // X.C2MA
    public final void U7(C232629Ba c232629Ba) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void U8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void V7(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ View V8(String str, boolean z) {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2067689o X8() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2MA Y6() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void Y7(C174036sJ c174036sJ) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean Y8() {
        return false;
    }

    @Override // X.C2MA
    public final void Z1(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z6(C209108Io c209108Io) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a7(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a8() {
    }

    @Override // X.C2MA
    public final void b2(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void b7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void b8(String str) {
    }

    @Override // X.C2MA
    public final void c7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void c8(Aweme aweme) {
    }

    @Override // X.C2MA
    public final void c9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void checkViewHolderState() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean d7() {
        return true;
    }

    @Override // X.C2MA
    public final void d8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void d9() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean e7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void e8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void e9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void f7(int i, int i2, String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void f8(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean f9() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void g7(java.util.Map map) {
    }

    @Override // X.C2MA
    public final int getAwemeType() {
        return 4003;
    }

    @Override // X.IZ2
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2MA getViewHolderByAwemeId(String str) {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean i7() {
        return true;
    }

    @Override // X.C2MA
    public final AnonymousClass901 j3() {
        return null;
    }

    @Override // X.C2MA
    public final void j5(C107794Kx c107794Kx) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j8() {
    }

    @Override // X.C2MA
    public final void m6(Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void m7(C108814Ov c108814Ov) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void n8(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o6(C2QN c2qn) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o8(int i, String str, boolean z) {
    }

    @Override // X.C2MA
    public final void onPageSelected(int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void p8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean q7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void r5(int i, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ ImageView s7() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void s8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final void t8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean u7() {
        return true;
    }

    @Override // X.C2MA
    public final void u8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void v7(boolean z) {
    }

    @Override // X.C2MA
    public final void w1() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void w8(boolean z) {
        throw null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void x7(float f, float f2, int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void x8(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void y8(int i, String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ View.OnTouchListener z() {
        return null;
    }

    public final void LIZ() {
        C221018lt.LIZ("TTRecUserBigCardViewHolder", "[doOnPause]");
        LJ().LIZ(EnumC57602Mj8.PAUSE);
        C57604MjA c57604MjA = this.LJLJL;
        c57604MjA.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[pauseTimeCalculator] isCalculating = ");
        U26.LIZLLL(LIZ, c57604MjA.LIZIZ, LIZ, "TTRecUserActionMgr");
        if (c57604MjA.LIZIZ) {
            c57604MjA.LIZIZ = false;
            c57604MjA.LIZJ = (System.currentTimeMillis() - c57604MjA.LIZLLL) + c57604MjA.LIZJ;
        }
        this.LJLJJLL.LJ(false);
    }

    public final InterfaceC48031It9 LJ() {
        return (InterfaceC48031It9) this.LJLJLJ.getValue();
    }

    @Override // X.IZ2
    public final FrameLayout LJJLIIIJLJLI() {
        View findViewById = this.LJLIL.LIZ.findViewById(R.id.al9);
        o.LJIIIIZZ(findViewById, "params.view.findViewById…big_card_video_container)");
        return (FrameLayout) findViewById;
    }

    @Override // X.IZ2
    public final void Q2() {
        boolean z;
        if (((Number) C53027KrX.LIZ.getValue()).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C221018lt.LIZ("TTRecUserBigCardViewHolder", "isUseTextureViewDirectly = true");
        } else {
            C221018lt.LIZ("TTRecUserBigCardViewHolder", "call super isUseTextureViewDirectly");
        }
    }

    @Override // X.C2MA
    public final void onDestroyView() {
        C221018lt.LIZ("TTRecUserBigCardViewHolder", "[onDestroyView]");
        C54960Lhc.LIZ.LIZLLL();
    }

    @Override // X.C2MA
    public final void onPause() {
        C221018lt.LIZ("TTRecUserBigCardViewHolder", "[onPause]");
        LIZ();
    }

    @Override // X.C2MA
    public final void unBind() {
        C221018lt.LIZ("TTRecUserBigCardViewHolder", "[unbind]");
        LJ().LIZ(EnumC57602Mj8.STOP);
        this.LJLJJLL.LJFF();
    }

    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[doOnResume] pageResumed = ");
        LIZ.append(this.LJLJJI);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
        LJ().LIZ(EnumC57602Mj8.RESUME);
        C57604MjA c57604MjA = this.LJLJL;
        c57604MjA.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[resumeTimeCalculator] isCalculating = ");
        U26.LIZLLL(LIZ2, c57604MjA.LIZIZ, LIZ2, "TTRecUserActionMgr");
        if (!c57604MjA.LIZIZ) {
            c57604MjA.LIZIZ = true;
            c57604MjA.LIZLLL = System.currentTimeMillis();
        }
        this.LJLJJLL.LJ(true);
    }

    @Override // X.C2MA
    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onPageResume] pageResumed = ");
        U26.LIZLLL(LIZ, this.LJLJJI, LIZ, "TTRecUserBigCardViewHolder");
    }

    @Override // X.InterfaceC222408o8
    public final void LJJJJLL() {
        Object LIZ;
        try {
            LJFF();
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("TTRecUserBigCardViewHolder", "doAdaption", m10exceptionOrNullimpl);
        }
    }

    @Override // X.C2MA
    public final Aweme O1() {
        return getAweme();
    }

    @Override // X.C2MA
    public final void Z8() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onPanelHandlePageResume] pageResumed = ");
        U26.LIZLLL(LIZ, this.LJLJJI, LIZ, "TTRecUserBigCardViewHolder");
        this.LJLJJI = true;
        LIZIZ();
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final Aweme getCurrentAweme() {
        return getAweme();
    }

    @Override // X.C2MA
    public final void onResume() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onResume] pageResumed = ");
        U26.LIZLLL(LIZ, this.LJLJJI, LIZ, "TTRecUserBigCardViewHolder");
        if (this.LJLJJI) {
            LIZIZ();
        }
    }

    @Override // X.C2MA
    public final IQE I7() {
        return IQE.INITIALIZED;
    }

    @Override // X.C2MA
    public final Aweme getAweme() {
        return this.LJLJJL;
    }

    public C57598Mj4(C222588oQ params) {
        int i;
        int LIZIZ;
        int LIZIZ2;
        TuxIconView tuxIconView;
        float f;
        RecUser iv0;
        o.LJIIIZ(params, "params");
        this.LJLIL = params;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 975));
        this.LJLJI = C221108m2.LIZIZ(C53377KxB.LJLIL);
        View view = params.LIZ;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardView");
        C57596Mj2 c57596Mj2 = (C57596Mj2) view;
        C221018lt.LIZ("TTRecUserBigCardViewHolder", "[bigCardView] TTRecUserBigCardViewHolder init}");
        Context context = c57596Mj2.getContext();
        o.LJIIIIZZ(context, "context");
        c57596Mj2.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, context));
        String eventType = params.LJIIIZ;
        o.LJIIIZ(eventType, "eventType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[init] context is ");
        LIZ.append(C16880lQ.LJLLJ(c57596Mj2.getContext().getClass()));
        LIZ.append(", eventType = ");
        LIZ.append(eventType);
        C221018lt.LIZ("TTRecUserBigCardView", X1D.LIZIZ(LIZ));
        c57596Mj2.LJLJI = eventType;
        Context context2 = c57596Mj2.getContext();
        o.LJIIIIZZ(context2, "context");
        ViewModelStoreOwner LIZJ = C57434MgQ.LIZJ(context2);
        if (LIZJ != null) {
            c57596Mj2.LJLILLLLZI = (TTRecUserBigCardViewModel) new ViewModelProvider(LIZJ).get(TTRecUserBigCardViewModel.class);
        }
        Context context3 = c57596Mj2.getContext();
        o.LJIIIIZZ(context3, "context");
        LifecycleOwner LIZIZ3 = C57434MgQ.LIZIZ(context3);
        if (LIZIZ3 != null) {
            C77266UUc.LIZIZ.getRelationService().LJFF().observe(LIZIZ3, new AObserverS69S0100000_1(c57596Mj2, 142));
            UserService.LIZ().LJII().observe(LIZIZ3, new AObserverS69S0100000_1(c57596Mj2, 143));
        }
        if (C57626MjW.LIZIZ()) {
            if (C99W.LIZ) {
                i = R.drawable.a5t;
            } else {
                i = R.drawable.a5s;
            }
        } else if (C99W.LIZ) {
            i = R.drawable.a5r;
        } else {
            i = R.drawable.a5q;
        }
        c57596Mj2.LIZ(R.id.akp).setBackgroundResource(i);
        C61447O9r c61447O9r = C57092Lx.LIZ;
        if (!c61447O9r.LJFF) {
            LIZIZ = C7MY.LIZIZ(2);
        } else {
            LIZIZ = C7MY.LIZIZ(12);
        }
        c57596Mj2.LIZ(R.id.j76).setPadding(C7MY.LIZIZ(16), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), LIZIZ);
        if (!c61447O9r.LJFF) {
            LIZIZ2 = C7MY.LIZIZ(8);
        } else {
            LIZIZ2 = C7MY.LIZIZ(30);
        }
        View big_card_btn_not_interested = c57596Mj2.LIZ(R.id.akk);
        o.LJIIIIZZ(big_card_btn_not_interested, "big_card_btn_not_interested");
        C26338AVi.LJI(big_card_btn_not_interested, 0, Integer.valueOf(LIZIZ2), 0, 0, false, 16);
        c57596Mj2.post(new ARunnableS13S0101000_9(LIZIZ2, c57596Mj2, 8));
        ((LongPressLayout) c57596Mj2.LIZ(R.id.akx)).setListener(new C57609MjF(c57596Mj2));
        C16880lQ.LJIL((ConstraintLayout) c57596Mj2.LIZ(R.id.akm), new ACListenerS29S0100000_9(c57596Mj2, 158));
        c57596Mj2.LIZ(R.id.akm).setOnLongClickListener(new IDCListenerS300S0100000_9(c57596Mj2, 8));
        if (C57626MjW.LIZIZ()) {
            View LIZ2 = c57596Mj2.LIZ(R.id.akr);
            LIZ2.setVisibility(0);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
            c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            Context context4 = LIZ2.getContext();
            o.LJIIIIZZ(context4, "this.context");
            LIZ2.setBackground(c110614Vt.LIZ(context4));
            tuxIconView = (TuxIconView) c57596Mj2.LIZ(R.id.akq);
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            tuxIconView.setTintColorRes(R.attr.dj);
        } else {
            c57596Mj2.LIZ(R.id.akr).setVisibility(8);
            tuxIconView = (TuxIconView) c57596Mj2.LIZ(R.id.akq);
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            tuxIconView.setTintColorRes(R.attr.go);
        }
        C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(c57596Mj2, 160));
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII((ConstraintLayout) c57596Mj2.LIZ(R.id.j76));
        if (C57626MjW.LIZIZ()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        anonymousClass064.LJIILL(R.id.akk).LIZLLL.LJIJJLI = f;
        anonymousClass064.LIZIZ((ConstraintLayout) c57596Mj2.LIZ(R.id.j76));
        if (C99W.LIZ) {
            c57596Mj2.LIZ(R.id.akk).getClass();
        }
        C16880lQ.LJJIZ((SY4) c57596Mj2.LIZ(R.id.akk), new ACListenerS29S0100000_9(c57596Mj2, 159));
        Context context5 = c57596Mj2.getContext();
        o.LJII(context5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) context5;
        ScrollSwitchStateManager LIZ3 = C84193Sd.LIZ(activityC45651qj);
        LIZ3.qv0(activityC45651qj, new AObserverS77S0100000_9(c57596Mj2, 100));
        c57596Mj2.LJLLI = LIZ3;
        TTRecUserBigCardViewModel tTRecUserBigCardViewModel = c57596Mj2.LJLILLLLZI;
        if (tTRecUserBigCardViewModel != null && (iv0 = tTRecUserBigCardViewModel.iv0(false)) != null) {
            c57596Mj2.LJLJJI = iv0;
            if (C76800UCe.LIZ != null) {
                c57596Mj2.LIZJ(iv0);
                c57596Mj2.LJLZ.clear();
                this.LJLJJLL = c57596Mj2;
                this.LJLJL = new C57604MjA(params.LJIIIZ);
                this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 974));
            }
        }
        C221018lt.LJFF("TTRecUserBigCardView", "current user is null");
        c57596Mj2.LJLZ.clear();
        this.LJLJJLL = c57596Mj2;
        this.LJLJL = new C57604MjA(params.LJIIIZ);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 974));
    }

    @Override // X.C2MA
    public final void B8(boolean z) {
        LJJIJIIJIL(2);
    }

    @Override // X.C2MA
    public final void LIZLLL(Aweme aweme) {
        Integer num;
        Object LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[bind] \n aweme type is ");
        String str = null;
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append("\n aweme id   is ");
        if (aweme != null) {
            str = aweme.getAid();
        }
        LIZ2.append(str);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ2));
        LJ().LIZ(EnumC57602Mj8.INIT);
        this.LJLJJL = aweme;
        this.LJLJJLL.setBigCardAweme(aweme);
        try {
            LJFF();
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("TTRecUserBigCardViewHolder", "bind", m10exceptionOrNullimpl);
        }
        C38995FSd.LIZLLL().execute(new ARunnableS45S0100000_9(this, 212));
    }

    @Override // X.C2MA
    public final void LJJIII(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onHolderPause] mode is ");
        LIZ.append(i);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
        if (i == 1 || i == 4 || i == 5) {
            this.LJLJJI = false;
        }
        LIZ();
    }

    @Override // X.C2MA
    public final void LJJIJIIJIL(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onHolderResume] pageResumed = ");
        U26.LIZLLL(LIZ, this.LJLJJI, LIZ, "TTRecUserBigCardViewHolder");
        if (this.LJLJJI) {
            LIZIZ();
        }
    }

    @Override // X.C2MA
    public final void c2(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onViewHolderUnSelectedDelay] timeMills = ");
        LIZ.append(j);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
    }

    @Override // X.C2MA
    public final void k7(View view) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onCreateItemView] view type is ");
        LIZ.append(C16880lQ.LJLLJ(view.getClass()));
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
    }

    @Override // X.C2MA
    public final void l8(int i) {
        User user;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onViewHolderSelected] position = ");
        LIZ.append(i);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
        C2U8.LIZ(new C9CI(this.LJLJJL));
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(this.LJLIL.LJIIIZ);
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
        c57362MfG.LJJIIZ(this.LJLJJL);
        Aweme aweme = this.LJLJJL;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJLI = true;
        c57362MfG.LJIILIIL();
        this.LJLJJI = true;
        LJ().LIZ(EnumC57602Mj8.START);
        this.LJLJJLL.LJFF();
        String str = this.LJLIL.LJIIIZ;
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (o.LJ(str, "homepage_hot")) {
            C60952aJ.LIZ().storeLong("timestamp_of_card_impression", System.currentTimeMillis());
            C57600Mj6.LIZJ("homepage_hot");
            if (C57626MjW.LIZJ()) {
                java.util.Map<String, Boolean> map = C57620MjQ.LIZLLL;
                o.LJIIIIZZ(uid, "uid");
                map.put(uid, Boolean.TRUE);
            }
        } else if (o.LJ(str, "homepage_friends")) {
            C60942aI.LIZ().storeLong("timestamp_of_card_impression", System.currentTimeMillis());
            C57600Mj6.LIZJ("homepage_friends");
            if (C57626MjW.LIZJ()) {
                java.util.Map<String, Boolean> map2 = C57619MjP.LJII;
                o.LJIIIIZZ(uid, "uid");
                map2.put(uid, Boolean.TRUE);
            }
        }
        C57604MjA c57604MjA = this.LJLJL;
        c57604MjA.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[startTimeCalculator] isCalculating = ");
        U26.LIZLLL(LIZ2, c57604MjA.LIZIZ, LIZ2, "TTRecUserActionMgr");
        if (c57604MjA.LIZIZ) {
            return;
        }
        c57604MjA.LIZIZ = true;
        c57604MjA.LIZJ = 0L;
        c57604MjA.LIZLLL = System.currentTimeMillis();
    }

    @Override // X.C2MA
    public final void t7(boolean z) {
        int i;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onViewHolderUnSelected] pageDown = ");
        LIZ.append(z);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
        LJ().LIZ(EnumC57602Mj8.PAUSE);
        C57596Mj2 c57596Mj2 = this.LJLJJLL;
        c57596Mj2.LJLJJLL = false;
        C57604MjA c57604MjA = this.LJLJL;
        boolean isEmpty = c57596Mj2.LJLZ.isEmpty();
        ArrayList<EnumC57597Mj3> arrayList = this.LJLJJLL.LJLZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<EnumC57597Mj3> it = arrayList.iterator();
        while (it.hasNext()) {
            EnumC57597Mj3 next = it.next();
            if (next != EnumC57597Mj3.CLICK_CLOSE && next != EnumC57597Mj3.CLICK_LONG_PRESS_DISLIKE) {
                arrayList2.add(next);
            }
        }
        int i3 = !arrayList2.isEmpty() ? 1 : 0;
        boolean contains = this.LJLJJLL.LJLZ.contains(EnumC57597Mj3.CLICK_CLOSE);
        boolean contains2 = this.LJLJJLL.LJLZ.contains(EnumC57597Mj3.CLICK_LONG_PRESS_DISLIKE);
        c57604MjA.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[stopTimeCalculator] isCalculating = ");
        LIZ2.append(c57604MjA.LIZIZ);
        LIZ2.append(" , marked = ");
        U26.LIZLLL(LIZ2, c57604MjA.LIZ, LIZ2, "TTRecUserActionMgr");
        if (!c57604MjA.LIZIZ) {
            return;
        }
        c57604MjA.LIZIZ = false;
        long currentTimeMillis = (System.currentTimeMillis() - c57604MjA.LIZLLL) + c57604MjA.LIZJ;
        c57604MjA.LIZJ = currentTimeMillis;
        if (c57604MjA.LIZ) {
            return;
        }
        c57604MjA.LIZ = true;
        if (isEmpty && currentTimeMillis < 2000) {
            i = 1;
        } else {
            i = 0;
        }
        int i4 = C57600Mj6.LIZIZ().getInt("negative_action_times", 0);
        if (i != 0) {
            i4++;
        }
        long j = c57604MjA.LIZJ;
        if (i4 >= C57626MjW.LIZ().negativeBehaviorThreshold) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C188727au LIZJ = C0RN.LIZJ(i, "passive_flag", i4, "passive_accu_cnt");
        LIZJ.LJ(j, "stay_time");
        LIZJ.LIZLLL(i3, "action_flag");
        LIZJ.LIZLLL(contains ? 1 : 0, "click_x_button");
        LIZJ.LIZLLL(contains2 ? 1 : 0, "click_fewer_accounts");
        LIZJ.LIZLLL(i2, "trigger_frequency_control");
        FMX.LJIIL("big_card_passive_react", LIZJ.LIZ);
        if (i != 0) {
            C57600Mj6.LIZLLL(true);
        } else {
            C57600Mj6.LIZLLL(false);
        }
    }

    @Override // X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        LIZLLL(aweme);
    }

    @Override // X.C2MA
    public final void h7(int i, long j) {
        C221018lt.LIZ("TTRecUserBigCardViewHolder", C00F.LIZJ("[onViewHolderSelectedDelay] position = ", i, " , timeMills = ", j));
    }
}
