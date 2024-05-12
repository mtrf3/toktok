package com.ss.android.ugc.aweme.input;

import X.ActivityC45651qj;
import X.AnonymousClass723;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C214788bq;
import X.C214928c4;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C55096Ljo;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72D;
import X.C72T;
import X.C76800UCe;
import X.C78926UyI;
import X.C7EL;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC214798br;
import X.EnumC214808bs;
import X.InterfaceC178146yw;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LRD;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import Y.ACListenerS23S0100000_3;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DanmakuInputFragment extends BaseDialogFragment implements InterfaceC178146yw, KPL {
    public static final /* synthetic */ int LJLL = 0;
    public final DanmakuViewModel LJLJI;
    public final C214928c4 LJLJJI;
    public final InterfaceC55235Lm3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public C72T LJLJL;
    public View LJLJLJ;
    public final Map<Integer, View> LJLJLLL;

    public DanmakuInputFragment() {
        this(null, null, null);
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final DanmakuInputVM vl() {
        return (DanmakuInputVM) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC178146yw
    public final void LLIIJLIL() {
        vl().gv0(0, false);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.InterfaceC178146yw
    public final void Yc(int i) {
        vl().gv0(i, true);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a6m);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
            window.setSoftInputMode(48);
            window.setGravity(80);
        }
        return onCreateDialog;
    }

    @Override // X.InterfaceC178146yw
    public final void y1(int i) {
        AnonymousClass723.LIZ().LIZ(i);
        vl().gv0(i, true);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        VideoItemParams gv0;
        Window window;
        View decorView;
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DanmakuInputVM vl = vl();
        C214928c4 c214928c4 = this.LJLJJI;
        DanmakuViewModel danmakuViewModel = this.LJLJI;
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJJL;
        vl.LJLIL = c214928c4;
        vl.LJLILLLLZI = danmakuViewModel;
        vl.LJLJI = interfaceC55235Lm3;
        Aweme aweme = null;
        if (interfaceC55235Lm3 != null && (landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C55096Ljo.LIZ(interfaceC55235Lm3, LandscapeEntrancesControlAbility.class, null)) != null) {
            landscapeEntrancesControlAbility.Fp0(false);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            LRD.LIZ(mo49getActivity).LJIIJ("input_danmaku", true, null);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 94));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 88), view.findViewById(R.id.e5_));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 89), view.findViewById(R.id.hej));
        C8YN.LJII(this, vl(), new TBT() { // from class: X.72Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass724) obj).LJLJJL;
            }
        }, null, new AqS166S0200000_3(this, view, 7), 6);
        C214928c4 c214928c42 = this.LJLJJI;
        if (c214928c42 != null) {
            aweme = c214928c42.LJLIL;
        }
        DanmakuViewModel danmakuViewModel2 = this.LJLJI;
        if (danmakuViewModel2 == null || (gv0 = danmakuViewModel2.gv0()) == null || (str = gv0.mEventType) == null) {
            str = "";
        }
        C214788bq.LIZIZ(aweme, str, EnumC214808bs.HIDE, EnumC214798br.KEYBOARD);
    }

    public DanmakuInputFragment(InterfaceC55235Lm3 interfaceC55235Lm3, DanmakuViewModel danmakuViewModel, C214928c4 c214928c4) {
        C214298b3 c214298b3;
        this.LJLJLLL = new LinkedHashMap();
        this.LJLJI = danmakuViewModel;
        this.LJLJJI = c214928c4;
        this.LJLJJL = interfaceC55235Lm3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DanmakuInputVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1498);
        C72D c72d = C72D.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c72d, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c72d, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJLL = c214298b3;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ajw, viewGroup, false);
        this.LJLJLJ = LLLLIILL;
        C7EL LIZIZ = AnonymousClass723.LIZ().LIZIZ(getContext(), this.LJLJLJ);
        this.LJLJL = LIZIZ;
        if (LIZIZ != null) {
            LIZIZ.LJLJLLL = this;
        }
        if (LIZIZ != null) {
            LIZIZ.show();
        }
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
