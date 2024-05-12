package com.ss.android.ugc.now.interaction.ui;

import X.ActivityC45651qj;
import X.AnonymousClass733;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C177996yh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C218478hn;
import X.C221108m2;
import X.C29S;
import X.C2L4;
import X.C32151Nz;
import X.C33Q;
import X.C37179EiV;
import X.C3C5;
import X.C3C8;
import X.C47261Igj;
import X.C56412MCa;
import X.C62822Ol8;
import X.C71Y;
import X.C76800UCe;
import X.C76965UIn;
import X.C78496UrM;
import X.C79045V0n;
import X.C7GI;
import X.C80683VlX;
import X.C80684VlY;
import X.C80688Vlc;
import X.C8YZ;
import X.C90903hW;
import X.HG3;
import X.InterfaceC1802075k;
import X.InterfaceC1802475o;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC36571c5;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.RBX;
import X.SY9;
import X.TBW;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS10S0000000_3;
import Y.IDiS267S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.now.interaction.InteractionFragmentScope;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionFragment extends AbsFragment implements AnonymousClass733, KPL, C2L4 {
    public static long LLF;
    public static final /* synthetic */ int LLFF = 0;
    public C218478hn LJLIL;
    public Aweme LJLILLLLZI;
    public TuxIconView LJLJI;
    public View LJLJJI;
    public ViewGroup LJLJJL;
    public ViewPager LJLJJLL;
    public C80684VlY LJLJL;
    public View LJLJLJ;
    public List<AbsFragment> LJLJLLL;
    public List<Integer> LJLLI;
    public ViewGroup LJLLILLLL;
    public NowFeedMobHierarchyData LJLLJ;
    public Integer LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public Comment LJLZ;
    public String LJZ;
    public boolean LJZL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public int LJLL = -1;
    public boolean LJZI = true;
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1416));

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

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(InteractionFragmentScope.class);
    }

    public final void show() {
        try {
            Integer num = this.LJLLL;
            if (num != null) {
                int intValue = num.intValue();
                List<Integer> list = this.LJLLI;
                if (list != null) {
                    int indexOf = ((LinkedList) list).indexOf(Integer.valueOf(intValue));
                    this.LJLL = indexOf;
                    ViewPager viewPager = this.LJLJJLL;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(indexOf, false);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        List<AbsFragment> list2 = this.LJLJLLL;
        if (list2 != null) {
            for (InterfaceC36571c5 interfaceC36571c5 : list2) {
                if (interfaceC36571c5 instanceof InterfaceC1802075k) {
                    ((InterfaceC1802075k) interfaceC36571c5).nb(this.LJLLJ);
                }
            }
        }
        Dl();
        C218478hn c218478hn = this.LJLIL;
        if (c218478hn != null) {
            C218478hn.LIZIZ(c218478hn, true, true, null, 4);
        }
    }

    public final void Dl() {
        List<Integer> list;
        PagerAdapter adapter;
        Integer valueOf;
        if (wl() && (list = this.LJLLI) != null && ((LinkedList) list).contains(2) && C7GI.LIZIZ() != this.LJZL) {
            List<Integer> list2 = this.LJLLI;
            if (list2 != null && (valueOf = Integer.valueOf(((LinkedList) list2).indexOf(2))) != null && valueOf.intValue() != -1) {
                List<AbsFragment> list3 = this.LJLJLLL;
                if (list3 != null) {
                    ListProtector.remove(list3, valueOf.intValue());
                }
                List<Integer> list4 = this.LJLLI;
                if (list4 != null) {
                    ListProtector.remove(list4, valueOf.intValue());
                }
            }
            vl(new ViewerListFragment(), 2);
            ViewPager viewPager = this.LJLJJLL;
            if (viewPager != null && (adapter = viewPager.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dl();
    }

    public final boolean wl() {
        String str;
        String str2;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (!C7GI.LIZ()) {
            return false;
        }
        Aweme aweme = this.LJLILLLLZI;
        Long l = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        if (!o.LJ(str, curUserId)) {
            return false;
        }
        Aweme aweme2 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" isVideoWithin7Days createTime: ");
        if (aweme2 != null) {
            l = Long.valueOf(aweme2.getCreateTime());
        }
        LIZ.append(l);
        C71Y.LIZ("Now ViewerListUtils", X1D.LIZIZ(LIZ));
        if (aweme2 == null || System.currentTimeMillis() - (aweme2.getCreateTime() * 1000) > 604800000) {
            return false;
        }
        return true;
    }

    public final void Gl(int i) {
        int i2;
        C80688Vlc LJIIJ;
        Object obj;
        Long l;
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        List<Integer> list = this.LJLLI;
        if (list != null) {
            i2 = ((LinkedList) list).indexOf(Integer.valueOf(i));
        } else {
            i2 = 0;
        }
        C80684VlY c80684VlY = this.LJLJL;
        if (c80684VlY != null && c80684VlY.getTabCount() > i2) {
            Long l2 = null;
            if (1 != 0 && (LJIIJ = c80684VlY.LJIIJ(i2)) != null) {
                List<AbsFragment> list2 = this.LJLJLLL;
                if (list2 != null) {
                    obj = (AbsFragment) ListProtector.get(list2, i2);
                } else {
                    obj = null;
                }
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.interfaces.IInteractionListPageItem");
                InterfaceC1802075k interfaceC1802075k = (InterfaceC1802075k) obj;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Fragment getTabDisplayTitle ");
                LIZ.append(interfaceC1802075k);
                LIZ.append(' ');
                Aweme aweme = this.LJLILLLLZI;
                if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
                    l = Long.valueOf(statistics2.getCommentCount());
                } else {
                    l = null;
                }
                LIZ.append(l);
                LIZ.append(' ');
                Aweme aweme2 = this.LJLILLLLZI;
                if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
                    l2 = Long.valueOf(statistics.getDiggCount());
                }
                LIZ.append(l2);
                C177996yh.LIZIZ("interaction_page", X1D.LIZIZ(LIZ));
                LJIIJ.LIZIZ = interfaceC1802075k.Qf();
                LJIIJ.LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.ui.InteractionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vl(AbsFragment absFragment, int i) {
        InterfaceC1802075k interfaceC1802075k = (InterfaceC1802075k) absFragment;
        interfaceC1802075k.ch(this);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            interfaceC1802075k.setAid(aid);
            interfaceC1802075k.setData(aweme);
            interfaceC1802075k.nb(this.LJLLJ);
        }
        List<AbsFragment> list = this.LJLJLLL;
        if (list != null) {
            ((LinkedList) list).add(absFragment);
        }
        List<Integer> list2 = this.LJLLI;
        if (list2 != null) {
            ((LinkedList) list2).add(Integer.valueOf(i));
        }
    }

    public final void xl(C80688Vlc c80688Vlc, boolean z) {
        int i;
        Integer LJI;
        List<AbsFragment> list = this.LJLJLLL;
        if (list != null) {
            i = ((LinkedList) list).size();
        } else {
            i = 0;
        }
        if (!C7GI.LIZJ(i)) {
            return;
        }
        if (z) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            LJI = C79045V0n.LJI(R.attr.go, requireContext);
        } else {
            Context requireContext2 = requireContext();
            o.LJIIIIZZ(requireContext2, "requireContext()");
            LJI = C79045V0n.LJI(R.attr.gx, requireContext2);
        }
        if (c80688Vlc != null) {
            Drawable drawable = c80688Vlc.LIZ;
            if (drawable != null && (drawable instanceof SY9)) {
                SY9 sy9 = (SY9) drawable;
                if (LJI != null) {
                    sy9.LJ(LJI.intValue());
                }
                c80688Vlc.LIZ = sy9;
                c80688Vlc.LIZIZ();
            }
            C80683VlX c80683VlX = c80688Vlc.LJII;
            if (c80683VlX != null) {
                TextView customTextView = c80683VlX.getCustomTextView();
                o.LJII(customTextView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                if (LJI != null) {
                    customTextView.setTextColor(LJI.intValue());
                }
            }
        }
    }

    public final void Al(int i, int i2, String str) {
        if (i == i2) {
            C177996yh.LIZIZ("interaction_page", "tabVisibleChange  same position");
            return;
        }
        this.LJLL = i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tabVisibleChange  ");
        LIZ.append(i);
        LIZ.append("  ");
        LIZ.append(i2);
        C177996yh.LIZIZ("interaction_page", X1D.LIZIZ(LIZ));
        C37179EiV.LIZ().postDelayed(new ARunnableS10S0000000_3(1), 500L);
        List<AbsFragment> list = this.LJLJLLL;
        if (list != null && (!list.isEmpty())) {
            if (i == -1) {
                Object obj = ListProtector.get(list, i2);
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.interfaces.IInteractionListPageItem");
                ((InterfaceC1802075k) obj).f0(mo49getActivity(), this.LJZ);
                return;
            }
            if (i2 == -1) {
                Object obj2 = ListProtector.get(list, i);
                o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.interfaces.IInteractionListPageItem");
                mo49getActivity();
                ((InterfaceC1802075k) obj2).A7(str, this.LJZ);
                return;
            }
            int i3 = 0;
            for (InterfaceC36571c5 interfaceC36571c5 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    InterfaceC36571c5 interfaceC36571c52 = (AbsFragment) interfaceC36571c5;
                    if (i3 == i) {
                        o.LJII(interfaceC36571c52, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.interfaces.IInteractionListPageItem");
                        mo49getActivity();
                        ((InterfaceC1802075k) interfaceC36571c52).A7("change_tab", this.LJZ);
                    } else if (i3 == i2) {
                        o.LJII(interfaceC36571c52, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.interfaces.IInteractionListPageItem");
                        this.LJZ = "change_tab";
                        ((InterfaceC1802075k) interfaceC36571c52).f0(mo49getActivity(), "change_tab");
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C80684VlY c80684VlY;
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.bao, viewGroup, false, "inflater.inflate(R.layou…e_list, container, false)");
        this.LJLIL = (C218478hn) LIZIZ.findViewById(R.id.j7n);
        this.LJLJJLL = (ViewPager) LIZIZ.findViewById(R.id.j68);
        this.LJLJJL = (ViewGroup) LIZIZ.findViewById(R.id.dd5);
        this.LJLJLJ = LIZIZ.findViewById(R.id.ngg);
        this.LJLJI = (TuxIconView) LIZIZ.findViewById(R.id.aej);
        this.LJLJJI = LIZIZ.findViewById(R.id.bjq);
        o.LJIIIIZZ(LIZIZ.findViewById(R.id.k13), "rootView.findViewById(R.id.single_title)");
        this.LJLLILLLL = (ViewGroup) LIZIZ.findViewById(R.id.bsh);
        if (this.LJZI) {
            ((RBX) HG3.LJIILL()).getCurUserId();
            View view = this.LJLJLJ;
            if (view != null) {
                view.setVisibility(0);
            }
            c80684VlY = (C80684VlY) LIZIZ.findViewById(R.id.kyt);
        } else {
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            c80684VlY = (C80684VlY) LIZIZ.findViewById(R.id.k12);
        }
        this.LJLJL = c80684VlY;
        if (c80684VlY != null) {
            c80684VlY.setVisibility(0);
        }
        C218478hn c218478hn = this.LJLIL;
        if (c218478hn != null) {
            c218478hn.setCommentContainer(this.LJLJJLL);
        }
        C218478hn c218478hn2 = this.LJLIL;
        if (c218478hn2 != null) {
            c218478hn2.setScrollableContainer(new InterfaceC1802475o() { // from class: X.75j
                @Override // X.InterfaceC1802475o
                public final RecyclerView LJIJJ() {
                    Integer valueOf;
                    ViewPager viewPager = InteractionFragment.this.LJLJJLL;
                    Object obj = null;
                    if (viewPager == null || (valueOf = Integer.valueOf(viewPager.getCurrentItem())) == null) {
                        return null;
                    }
                    InteractionFragment interactionFragment = InteractionFragment.this;
                    int intValue = valueOf.intValue();
                    List<AbsFragment> list = interactionFragment.LJLJLLL;
                    if (list != null) {
                        obj = (AbsFragment) ListProtector.get(list, intValue);
                    }
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.interfaces.IInteractionListPageItem");
                    return ((InterfaceC1802075k) obj).LLIIIZ();
                }
            });
        }
        C218478hn c218478hn3 = this.LJLIL;
        if (c218478hn3 != null) {
            c218478hn3.setVisibleChangedListener(new AqS169S0100000_3(this, 822));
        }
        ViewPager viewPager = this.LJLJJLL;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(3);
            viewPager.addOnPageChangeListener(new IDiS267S0100000_3(this, 6));
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 259));
        }
        ViewGroup viewGroup2 = this.LJLJJL;
        if (viewGroup2 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
            c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(8));
            c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(8));
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            viewGroup2.setBackground(c110614Vt.LIZ(requireContext));
        }
        this.LJZL = C7GI.LIZIZ();
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
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
