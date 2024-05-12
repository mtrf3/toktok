package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC76019TsV;
import X.B5G;
import X.BPP;
import X.C09;
import X.C15380j0;
import X.C16880lQ;
import X.C1YG;
import X.C1YH;
import X.C29306Beo;
import X.C30770C5u;
import X.C31413CUn;
import X.C44432HcC;
import X.C53734L7a;
import X.C73411SrX;
import X.C75597Tlh;
import X.C75633TmH;
import X.C75642TmQ;
import X.C75893TqT;
import X.C75975Trn;
import X.C75981Trt;
import X.C76014TsQ;
import X.C76020TsW;
import X.C76029Tsf;
import X.C76031Tsh;
import X.C76033Tsj;
import X.C76044Tsu;
import X.C76046Tsw;
import X.C76050Tt0;
import X.C76051Tt1;
import X.C76052Tt2;
import X.C76058Tt8;
import X.C76060TtA;
import X.C76061TtB;
import X.C76062TtC;
import X.C76063TtD;
import X.C76067TtH;
import X.C76068TtI;
import X.C76071TtL;
import X.C76072TtM;
import X.C76149Tub;
import X.C76150Tuc;
import X.C76151Tud;
import X.C76156Tui;
import X.C76187TvD;
import X.C76208TvY;
import X.CJ2;
import X.EnumC75614Tly;
import X.EnumC75725Tnl;
import X.EnumC76024Tsa;
import X.InterfaceC30442Bx8;
import X.InterfaceC76056Tt6;
import X.InterfaceC76066TtG;
import X.O6R;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS17S0101000_13;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTopicEntranceSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiHostInviteListUpgradeFragment extends BaseMultiHostInviteListFragment implements InterfaceC76056Tt6, InterfaceC76066TtG {
    public static final /* synthetic */ int LLII = 0;
    public boolean LLFFF;
    public boolean LLFII;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public String LLFZ = "call";
    public final long LLI = SystemClock.uptimeMillis();

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment, com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment, com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment
    public final void Pl() {
        this.LJLLILLLL.LJLZ(C76033Tsj.class, new C76208TvY(this, this, this, this.LJLLI));
        this.LJLLILLLL.LJLZ(C76014TsQ.class, new C76187TvD(this, this, this.LJLLI));
        this.LJLLILLLL.LJLZ(C76050Tt0.class, new C76020TsW());
        this.LJLLILLLL.LJLZ(C76067TtH.class, new C76071TtL(this));
        this.LJLLILLLL.LJLZ(C76068TtI.class, new C76072TtM(this));
        this.LJLLILLLL.LJLZ(C76060TtA.class, new C76062TtC(Ol(), this));
        this.LJLLILLLL.LJLZ(C76061TtB.class, new C76063TtD());
        this.LJLLILLLL.LJLZ(C76051Tt1.class, new C76052Tt2(this));
        this.LJLLILLLL.LJLZ(C76046Tsw.class, new C76044Tsu(this, this.LJLLI));
        Integer value = LiveCoHostTopicEntranceSetting.INSTANCE.getValue();
        if (value == null) {
            return;
        }
        if (value.intValue() == 0) {
            this.LJLLILLLL.LJLZ(C76149Tub.class, new C76156Tui());
        } else if (value.intValue() == 1) {
            this.LJLLILLLL.LJLZ(C76149Tub.class, new C76150Tuc());
        } else {
            if (value.intValue() != 2) {
                return;
            }
            this.LJLLILLLL.LJLZ(C76149Tub.class, new C76151Tud(this.LJLLI));
        }
    }

    @Override // X.InterfaceC76056Tt6
    public final int s7() {
        Integer valueOf;
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV != null && (valueOf = Integer.valueOf(abstractC76019TsV.LJII())) != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        ViewGroup viewGroup;
        C76029Tsf c76029Tsf = new C76029Tsf();
        c76029Tsf.LIZIZ = (int) (C15380j0.LJIJ(C15380j0.LJIIJJI()) * 0.7d);
        c76029Tsf.LJIIIZ = false;
        c76029Tsf.LJIIJ = true;
        c76029Tsf.LJIIJJI = new AqS163S0100000_13(this, 142);
        c76029Tsf.LIZJ = this.LLFII;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        View view = getView();
        View view2 = null;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.dkl, viewGroup, false);
        if (LLLLIILL != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 188), LLLLIILL);
            view2 = LLLLIILL;
        }
        c76029Tsf.LJ = view2;
        if (this.LJLJJI != 0) {
            Boolean LIZJ = InterfaceC30442Bx8.LLFF.LIZJ();
            o.LJIIIIZZ(LIZJ, "ANCHOR_IS_FIRST_TIME_ACC…I_HOST_NOTIFICATION.value");
            if (LIZJ.booleanValue()) {
                C1YG c1yg = new C1YG(view2);
                c1yg.LIZ(R.string.l_i);
                c1yg.LJIIL = new C76031Tsh(this);
                c1yg.LJI = 5000L;
                c1yg.LJII = true;
                c1yg.LJIILIIL = new C76058Tt8(this);
                C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_LIVING_NOTICE);
                C75642TmQ.LJJLIIIJ();
            }
        }
        c76029Tsf.LJI = new AqS163S0100000_13(this, 143);
        c76029Tsf.LJII = new AqS163S0100000_13(this, 144);
        return c76029Tsf;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        Map<String, String> map;
        CJ2 cj2;
        CJ2 cj22;
        CJ2 cj23;
        int i2;
        CJ2 cj24;
        C75981Trt c75981Trt;
        RivalExtraInfo rivalExtraInfo;
        RivalExtraInfo rivalExtraInfo2;
        super.onDestroy();
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV != null) {
            i = abstractC76019TsV.LJLLL;
        } else {
            i = 0;
        }
        String str = this.LLFZ;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LLI;
        C75975Trn c75975Trn = this.LJLLLLLL;
        Boolean bool = null;
        if (c75975Trn != null) {
            map = c75975Trn.LIZ();
        } else {
            map = null;
        }
        AbstractC76019TsV abstractC76019TsV2 = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV2 != null) {
            cj2 = abstractC76019TsV2.LJLLILLLL;
            cj22 = abstractC76019TsV2.LJLLJ;
            bool = Boolean.valueOf(abstractC76019TsV2.LJLLLLLL);
        } else {
            cj2 = null;
            cj22 = null;
        }
        AbstractC76019TsV abstractC76019TsV3 = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV3 == null || (cj23 = abstractC76019TsV3.LJLLILLLL) == null) {
            cj23 = new CJ2();
        }
        Iterator<Object> it = cj23.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && (next instanceof C76033Tsj) && (rivalExtraInfo2 = ((C75981Trt) next).LJLJJI) != null && rivalExtraInfo2.showPlayType == 2 && rivalExtraInfo2.reserveInfo == null) {
                i3++;
            }
        }
        AbstractC76019TsV abstractC76019TsV4 = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV4 != null && (cj24 = abstractC76019TsV4.LJLLILLLL) != null) {
            Iterator<Object> it2 = cj24.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 != null && (next2 instanceof C76033Tsj) && (rivalExtraInfo = (c75981Trt = (C75981Trt) next2).LJLJJI) != null && rivalExtraInfo.showPlayType == 2 && rivalExtraInfo.reserveInfo == null && c75981Trt.LJLJLLL) {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        C75642TmQ.LJJIJ(i, str, uptimeMillis, map, cj2, cj22, bool, i3, i2);
        if (C75633TmH.LJI) {
            C75642TmQ.LJJIJIIJIL(EnumC75725Tnl.QUIT_INVITE_LIST.getValue());
        }
        C75975Trn c75975Trn2 = this.LJLLLLLL;
        if (c75975Trn2 != null) {
            ((HashMap) c75975Trn2.LIZ()).get("mutual_actual_see_cnts");
        }
        C75975Trn c75975Trn3 = this.LJLLLLLL;
        if (c75975Trn3 != null) {
            ((HashMap) c75975Trn3.LIZ()).get("recommend_show_cnts");
        }
        O6R.LJJIIZ(((float) (System.currentTimeMillis() - C75642TmQ.LJII)) / 1000.0f);
        C75975Trn c75975Trn4 = this.LJLLLLLL;
        if (c75975Trn4 != null) {
            c75975Trn4.LJ.clear();
            c75975Trn4.LJFF.clear();
            c75975Trn4.LJI.clear();
            c75975Trn4.LJII.clear();
            c75975Trn4.LJIIIIZZ.clear();
        }
        C73411SrX c73411SrX = this.LJLLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        T t = this.LJLILLLLZI;
        if (t != 0) {
            t.LIZIZ();
        }
        C75597Tlh.LIZIZ();
        Ml().getVisibility();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Al(Throwable exception) {
        o.LJIIIZ(exception, "exception");
        if (this.LJLLLL) {
            Nl().LLFFF.run();
            this.LJLLLL = false;
        }
        Ll().setVisibility(8);
        if (!this.mStatusViewValid) {
            return;
        }
        C29306Beo.LJJLJLI(Kl());
        this.LJLLILLLL.LJLIL = new CJ2();
        Ol().setVisibility(8);
        BPP.LJ(getContext(), exception);
    }

    @Override // X.InterfaceC76056Tt6
    public final void T7(int i) {
        AbstractC76019TsV abstractC76019TsV;
        if (this.mStatusViewValid && (abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI) != null) {
            if (abstractC76019TsV.LJLL) {
                int i2 = i + 1;
                abstractC76019TsV.LJIILJJIL(i2);
                this.LJLLILLLL.notifyItemInserted(i2);
            } else {
                int i3 = i + 1;
                abstractC76019TsV.LJI(i3);
                this.LJLLILLLL.notifyItemRemoved(i3);
            }
        }
    }

    @Override // X.InterfaceC76066TtG
    public final void pd(int i) {
        AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV != null) {
            abstractC76019TsV.LJIIIZ(i);
            this.LJLLILLLL.notifyItemRemoved(i);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLLLLL = new C75975Trn(Ol(), (AbstractC76019TsV) this.LJLILLLLZI, true, true);
        B5G.LIZIZ();
        C75642TmQ.LJFF = this.LJLLLLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void Dl(boolean z, boolean z2, C75981Trt c75981Trt, int i, int i2, boolean z3) {
        boolean z4;
        CJ2 cj2;
        if (this.LJLLLL) {
            Nl().LLFFF.run();
            this.LJLLLL = false;
        }
        if (!this.mStatusViewValid) {
            return;
        }
        Ll().setVisibility(8);
        Nl().setVisibility(0);
        Ql();
        if (z) {
            C29306Beo.LJJLJLI(Ol());
            Kl().setVisibility(8);
            C31413CUn c31413CUn = this.LJLLILLLL;
            AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) this.LJLILLLLZI;
            if (abstractC76019TsV == null || (cj2 = abstractC76019TsV.LJLLILLLL) == null) {
                cj2 = new CJ2();
            }
            c31413CUn.LJLIL = cj2;
            C75975Trn c75975Trn = this.LJLLLLLL;
            if (c75975Trn != null) {
                c75975Trn.LJIIIZ.clear();
                c75975Trn.LJIIJ.clear();
                c75975Trn.LJIIJJI.clear();
            }
            if (z2) {
                C31413CUn c31413CUn2 = this.LJLLILLLL;
                c31413CUn2.notifyItemRangeChanged(0, c31413CUn2.LJLIL.size(), this.LJLLILLLL.LJLIL);
                return;
            }
            this.LJLLILLLL.notifyDataSetChanged();
        } else {
            this.LJLLILLLL.LJLIL = new CJ2();
            Ol().setVisibility(8);
            Kl().setVisibility(0);
            if (z2) {
                return;
            }
        }
        if (c75981Trt == null || i == -1 || !z3 || i < 0 || i >= this.LJLLILLLL.LJLIL.size()) {
            return;
        }
        if (c75981Trt.LJLJJLL == EnumC76024Tsa.TOP_LIVING_MAY_KNOW && !this.LJLJJLL && this.LJLJJL != 0 && this.mStatusViewValid && i2 >= 0 && i2 < this.LJLLILLLL.LJLIL.size()) {
            Ol().postDelayed(new ARunnableS17S0101000_13(i2, this, 23), 120L);
        }
        if (this.mStatusViewValid) {
            Ol().postDelayed(new ARunnableS16S0201000_13(i, this, c75981Trt, 10), 240L);
        }
        if (!c75981Trt.LJLJLJ) {
            c75981Trt.LJLJLJ = true;
            C53734L7a c53734L7a = (C53734L7a) ((LinkedHashMap) C75642TmQ.LIZIZ).get(Long.valueOf(c75981Trt.LJLIL.getId()));
            if (c53734L7a != null) {
                c53734L7a.LIZIZ = Boolean.TRUE;
            }
            String str = c75981Trt.LJLJJL;
            if (str == null) {
                str = "";
            }
            Room room = c75981Trt.LJLIL;
            EnumC75614Tly enumC75614Tly = c75981Trt.LJLJI;
            RivalExtraInfo rivalExtraInfo = c75981Trt.LJLJJI;
            if (c75981Trt.LJLJJLL != EnumC76024Tsa.IDLE) {
                z4 = true;
            } else {
                z4 = false;
            }
            C75642TmQ.LJJJLL(str, room, enumC75614Tly, rivalExtraInfo, z4, c75981Trt.LJLLILLLL, C44432HcC.LJIIIIZZ().getType());
        }
        C75893TqT.LJ = System.currentTimeMillis();
        AbstractC76019TsV abstractC76019TsV2 = (AbstractC76019TsV) this.LJLILLLLZI;
        if (abstractC76019TsV2 == null) {
            return;
        }
        abstractC76019TsV2.LJLLLL = false;
    }
}
