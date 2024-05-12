package com.ss.android.ugc.aweme.toptab.ui;

import X.ActivityC45651qj;
import X.C0A2;
import X.C0A3;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188787b0;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C61447O9r;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C8DI;
import X.C8DJ;
import X.C8DK;
import X.C8DL;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.FT5;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.KUM;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SYL;
import X.TBT;
import X.TBW;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LiveDualFeedFragment extends FeedFragment implements KPL, InterfaceC53896LDg, InterfaceC40408FtU, C8DK {
    public final C214298b3 LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public SYL LJLL;
    public C8DL LJLLI;
    public long LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
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

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, X.InterfaceC91174ZqM
    public final String getEnterFrom() {
        return "homepage_live";
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

    @Override // X.InterfaceC40408FtU
    public final String og() {
        return "LiveFeedFragment";
    }

    public LiveDualFeedFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LiveDualFeedListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1120);
        C8DI c8di = C8DI.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c8di, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c8di, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b3;
    }

    public final boolean Gl() {
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        boolean vv0 = c188787b0.LIZ(requireActivity).vv0("HOME");
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        boolean LJ = o.LJ(c188787b0.LIZ(requireActivity2).ov0("HOME"), "Live");
        if (vv0 && LJ) {
            return true;
        }
        return false;
    }

    public final void Hl() {
        C0A2 c0a2;
        LinearLayoutManager linearLayoutManager;
        int i;
        RecyclerView.ViewHolder viewHolder;
        LiveDualFeedCell liveDualFeedCell;
        if (this.LJLLILLLL > 0) {
            if (System.currentTimeMillis() - this.LJLLILLLL > 60000) {
                ub(false);
            }
            this.LJLLILLLL = 0L;
        }
        SYL syl = this.LJLL;
        if (syl != null) {
            c0a2 = syl.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (c0a2 instanceof GridLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) c0a2;
        } else {
            linearLayoutManager = null;
        }
        int i2 = -1;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.LLILL();
            i2 = linearLayoutManager.LLILLJJLI();
            if (i > i2) {
                return;
            }
        } else {
            i = -1;
        }
        while (true) {
            SYL syl2 = this.LJLL;
            if (syl2 != null) {
                viewHolder = syl2.LJJJ(i, false);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof LiveDualFeedCell) && (liveDualFeedCell = (LiveDualFeedCell) viewHolder) != null) {
                liveDualFeedCell.L();
            }
            if (i != i2) {
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C8DL c8dl = this.LJLLI;
        if (c8dl != null) {
            c8dl.LJLILLLLZI = false;
            c8dl.LJLIL.LJJLL(c8dl);
            List<C0A3> list = c8dl.LJLIL.LLIFFJFJJ;
            if (list != null) {
                ((ArrayList) list).remove(c8dl);
            }
        }
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C8DJ c8dj;
        super.onPause();
        if (Gl()) {
            C8DL c8dl = this.LJLLI;
            if (c8dl != null && c8dl.LJLILLLLZI && (c8dj = c8dl.LJLJJLL) != null) {
                c8dj.LLLLLL();
            }
            this.LJLLILLLL = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r3 = this;
            super.onResume()
            boolean r0 = r3.Gl()
            if (r0 == 0) goto L14
            X.8DL r2 = r3.LJLLI
            if (r2 == 0) goto L11
            boolean r0 = r2.LJLILLLLZI
            if (r0 != 0) goto L15
        L11:
            r3.Hl()
        L14:
            return
        L15:
            X.8DJ r1 = r2.LJLJJLL
            if (r1 == 0) goto L22
            X.8DM r0 = r2.LJLJLJ
            r1.LLLZI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L11
        L22:
            r0 = 0
            r2.LJIIZILJ(r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedFragment.onResume():void");
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        C8DJ c8dj;
        KUM.LIZJ(this, bundle, "Live", new AqS169S0100000_3(this, 502));
        Dl();
        this.LJLLILLLL = System.currentTimeMillis();
        C8DL c8dl = this.LJLLI;
        if (c8dl == null || !c8dl.LJLILLLLZI || (c8dj = c8dl.LJLJJLL) == null) {
            return;
        }
        c8dj.LLLLLL();
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        KUM.LIZIZ(this, args, "Live", new AqS169S0100000_3(this, 503));
        Al();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = Hox.LJLLI;
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0(c188787b0.LIZ(mo49getActivity).sv0("homepage_explore"));
        if (o.LJ(string, "MainPage") || args.getBoolean(sv0)) {
            qQ(false);
        }
        Hl();
        C8DL c8dl = this.LJLLI;
        if (c8dl == null || !c8dl.LJLILLLLZI) {
            return;
        }
        C8DJ c8dj = c8dl.LJLJJLL;
        if (c8dj != null) {
            c8dj.LLLZI(c8dl.LJLJLJ);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        c8dl.LJIIZILJ(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        String str;
        LiveDualFeedListViewModel liveDualFeedListViewModel = (LiveDualFeedListViewModel) this.LJLJL.getValue();
        if (z) {
            str = "click_button_icon";
        } else {
            str = "click_top_icon";
        }
        liveDualFeedListViewModel.withState(new AqS57S1100000_3(liveDualFeedListViewModel, str, 11));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int LIZIZ;
        View findViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = "homepage_live";
        this.LJLJJI = 37;
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 504));
        View findViewById2 = view.findViewById(R.id.lgd);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.top_space)");
        this.LJLJLJ = findViewById2;
        View findViewById3 = view.findViewById(R.id.arj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.bottom_space)");
        this.LJLJLLL = findViewById3;
        this.LJLL = (SYL) view.findViewById(R.id.fwd);
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            View view3 = this.LJLJLJ;
            if (view3 != null) {
                Context context = view3.getContext();
                o.LJIIIIZZ(context, "vwTopSpace.context");
                int LJJJJLI = C63081OpJ.LJJJJLI(context);
                Activity LIZ = FT5.LIZ(view, "view.context");
                if (LIZ != null && (findViewById = LIZ.findViewById(R.id.j5x)) != null) {
                    LIZIZ = findViewById.getMeasuredHeight();
                } else {
                    LIZIZ = C7MY.LIZIZ(58);
                }
                layoutParams.height = LJJJJLI + LIZIZ;
                View view4 = this.LJLJLLL;
                if (view4 != null) {
                    view4.getLayoutParams().height = C61447O9r.LJIILJJIL;
                    C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.8Bb
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            C207148Ba c207148Ba = (C207148Ba) obj;
                            c207148Ba.getClass();
                            return C208708Ha.LIZLLL(c207148Ba);
                        }
                    }, null, new AqS185S0100000_3(this, 223), 6);
                    SYL syl = this.LJLL;
                    if (syl != null) {
                        C8DL c8dl = new C8DL(syl);
                        if (!c8dl.LJLILLLLZI) {
                            c8dl.LJLILLLLZI = true;
                            c8dl.LJLIL.LJIIJJI(c8dl);
                            c8dl.LJLIL.LJIIIZ(c8dl);
                        }
                        this.LJLLI = c8dl;
                        return;
                    }
                    return;
                }
                o.LJIJI("vwBottomSpace");
                throw null;
            }
            o.LJIJI("vwTopSpace");
            throw null;
        }
        o.LJIJI("vwTopSpace");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bqx, viewGroup, false);
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
