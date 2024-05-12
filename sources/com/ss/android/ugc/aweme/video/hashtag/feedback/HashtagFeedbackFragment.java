package com.ss.android.ugc.aweme.video.hashtag.feedback;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C42834GrW;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC212848Wy;
import X.InterfaceC219588ja;
import X.InterfaceC222288nw;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.KSI;
import X.KSJ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY4;
import X.SYL;
import X.TBV;
import X.TBW;
import Y.ACListenerS27S0100000_7;
import Y.IDLListenerS194S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class HashtagFeedbackFragment extends Fragment implements InterfaceC219588ja, KPL {
    public final C214298b3 LJLIL;
    public SY4 LJLILLLLZI;
    public View LJLJI;
    public IDLListenerS194S0100000_7 LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

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

    public HashtagFeedbackFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(HashtagFeedbackViewModel.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 359);
        KSJ ksj = KSJ.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), ksj, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), ksj, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        this.LJLJJL = -1;
        this.LJLJJLL = "cancel";
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String str;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        vl().getClass();
        HashtagFeedbackValue LIZ = C42834GrW.LIZ();
        if (LIZ == null || (str = LIZ.sheetHeaderTitle) == null) {
            str = "Give feedback";
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 337));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    public final HashtagFeedbackViewModel vl() {
        return (HashtagFeedbackViewModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        View view = this.LJLJI;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLJJI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        View view = this.LJLJI;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.LJLJJI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        String str;
        FeedbackOptionValue[] feedbackOptionValueArr;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        View inflate = View.inflate(getContext(), R.layout.awm, null);
        this.LJLJI = inflate;
        if (inflate != null) {
            SYL syl = (SYL) inflate.findViewById(R.id.d8z);
            if (syl instanceof RecyclerView) {
                recyclerView = syl;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.LLJJIII(1);
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            syl.LLLF.LJZL(HashtagFeedbackCell.class);
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            vl().getClass();
            ArrayList arrayList = new ArrayList();
            HashtagFeedbackValue LIZ = C42834GrW.LIZ();
            if (LIZ != null && (feedbackOptionValueArr = LIZ.feedbackOptionValues) != null) {
                for (FeedbackOptionValue feedbackOptionValue : feedbackOptionValueArr) {
                    arrayList.add(new KSI(feedbackOptionValue));
                }
            }
            state.LJ(arrayList);
            SY4 sy4 = (SY4) inflate.findViewById(R.id.aw9);
            this.LJLILLLLZI = sy4;
            if (sy4 != null) {
                vl().getClass();
                HashtagFeedbackValue LIZ2 = C42834GrW.LIZ();
                if (LIZ2 == null || (str = LIZ2.submitBtnText) == null) {
                    str = "Submit";
                }
                sy4.setText(str);
            }
            SY4 sy42 = this.LJLILLLLZI;
            if (sy42 != null) {
                C16880lQ.LJJIZ(sy42, new ACListenerS27S0100000_7(this, 174));
            }
        }
        C8YN.LJII(this, vl(), new TBV() { // from class: X.KSK
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((KSM) obj).LJLILLLLZI);
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((KSM) obj).LJLILLLLZI = ((Boolean) obj2).booleanValue();
            }
        }, null, new AqS190S0100000_8(this, 87), 6);
        C8YN.LJII(this, vl(), new TBV() { // from class: X.KSL
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((KSM) obj).LJLIL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                KSM ksm = (KSM) obj;
                String str2 = (String) obj2;
                ksm.getClass();
                o.LJIIIZ(str2, "<set-?>");
                ksm.LJLIL = str2;
            }
        }, null, new AqS190S0100000_8(this, 88), 6);
        this.LJLJJI = new IDLListenerS194S0100000_7(this, 3);
        View view = this.LJLJI;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
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
