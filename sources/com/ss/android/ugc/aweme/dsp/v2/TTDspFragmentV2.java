package com.ss.android.ugc.aweme.dsp.v2;

import X.ActivityC45651qj;
import X.C10A;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C18000nE;
import X.C188787b0;
import X.C1DH;
import X.C221108m2;
import X.C29S;
import X.C2JO;
import X.C2U8;
import X.C36871EdX;
import X.C37247Ejb;
import X.C3C5;
import X.C42625Go9;
import X.C45804HyK;
import X.C52309Kfx;
import X.C57292Mr;
import X.C5H3;
import X.C60392Yp;
import X.C62822Ol8;
import X.C76800UCe;
import X.C84193Sd;
import X.C90903hW;
import X.C91136Zpk;
import X.C91154Zq2;
import X.C91155Zq3;
import X.C91173ZqL;
import X.C91189Zqb;
import X.C91197Zqj;
import X.C91198Zqk;
import X.C91203Zqp;
import X.C91211Zqx;
import X.C91215Zr1;
import X.C91220Zr6;
import X.C91249ZrZ;
import X.C91250Zra;
import X.C91251Zrb;
import X.C91252Zrc;
import X.C91257Zrh;
import X.C91279Zs3;
import X.C91318Zsg;
import X.C91411ZuB;
import X.C91412ZuC;
import X.C91481ZvJ;
import X.C91500Zvc;
import X.C91573Zwn;
import X.C91619ZxX;
import X.C91620ZxY;
import X.EnumC221088m0;
import X.EnumC91190Zqc;
import X.EnumC91191Zqd;
import X.InterfaceC34471Wx;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC91158Zq6;
import X.InterfaceC91174ZqM;
import X.InterfaceC91177ZqP;
import X.InterfaceC91212Zqy;
import X.InterfaceC91459Zux;
import X.KL2;
import X.LLE;
import X.LPU;
import X.QD3;
import X.TBU;
import X.X1D;
import X.YBK;
import X.YXW;
import Y.IDCListenerS137S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.XTabAbility;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.playerservice.NewDspPlayerService;
import com.ss.android.ugc.aweme.dsp.ui.tab.xtab.XTabMusicDspAbilityImpl;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS177S0200000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class TTDspFragmentV2 extends FeedFragment implements InterfaceC91158Zq6, InterfaceC91174ZqM, LLE, InterfaceC53896LDg, InterfaceC34471Wx, InterfaceC40408FtU {
    public static final /* synthetic */ int LLFF = 0;
    public TuxIconView LJLJL;
    public C91173ZqL LJLJLJ;
    public C91197Zqj LJLJLLL;
    public XTabMusicDspAbilityImpl LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public C91500Zvc LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public boolean LJLLJ = true;
    public boolean LJLLL = true;
    public boolean LJLLLL = true;
    public int LJZ = -1;
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 57));

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b7790";
    }

    @Override // X.InterfaceC40408FtU
    public final String og() {
        return "TTDspFragmentV2";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        return false;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    public TTDspFragmentV2() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LL = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 56));
        this.LLD = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 55));
    }

    public final LPU Jl() {
        return (LPU) this.LL.getValue();
    }

    public final String Gl() {
        InterfaceC91177ZqP interfaceC91177ZqP;
        String LJ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (interfaceC91177ZqP = Il(mo49getActivity).LJLIL) == null || (LJ = interfaceC91177ZqP.LJ()) == null) {
            return "track_reco";
        }
        return LJ;
    }

    public final NewDspPlayerService Hl() {
        return C91220Zr6.LIZIZ(getEnterMethod()).LIZ;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, X.InterfaceC91174ZqM
    public final String getEnterFrom() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("enter_from");
        }
        return null;
    }

    @Override // X.InterfaceC91174ZqM
    public final String getEnterMethod() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_method")) == null) {
            return "x_tab";
        }
        return string;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (o.LJ(this.LJLZ, C91220Zr6.LIZIZ(getEnterMethod()).LIZIZ)) {
            Hl().detach();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C116694i1.LIZ(mo49getActivity).qv0(this);
        }
        C91155Zq3.LIZ.remove(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C91198Zqk.LIZIZ = null;
        C91198Zqk.LJII = null;
        C42625Go9.LIZJ(this);
        InterfaceC91212Zqy interfaceC91212Zqy = C91215Zr1.LIZIZ;
        if (interfaceC91212Zqy != null) {
            interfaceC91212Zqy.dismiss();
        }
        C91215Zr1.LIZIZ = null;
        C91215Zr1.LIZJ.clear();
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        String path = C91318Zsg.LIZ();
        o.LJIIIZ(path, "path");
        try {
            C37247Ejb.LIZIZ.getClass();
            C36871EdX.LJ(path);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LJLLLL) {
            C91249ZrZ.LJIIJJI(Gl(), "other", getEnterMethod());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C91249ZrZ.LIZ = SystemClock.elapsedRealtime();
        InterfaceC91459Zux interfaceC91459Zux = Hl().getMainPlayerController().LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91481ZvJ.class);
        InterfaceC91459Zux interfaceC91459Zux2 = null;
        if (!(interfaceC91459Zux instanceof C91481ZvJ)) {
            interfaceC91459Zux = null;
        }
        C91481ZvJ c91481ZvJ = (C91481ZvJ) interfaceC91459Zux;
        if (c91481ZvJ != null) {
            c91481ZvJ.LJLJJL = System.currentTimeMillis();
        }
        InterfaceC91459Zux interfaceC91459Zux3 = Hl().getSubPlayerController().LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91481ZvJ.class);
        if (interfaceC91459Zux3 instanceof C91481ZvJ) {
            interfaceC91459Zux2 = interfaceC91459Zux3;
        }
        C91481ZvJ c91481ZvJ2 = (C91481ZvJ) interfaceC91459Zux2;
        if (c91481ZvJ2 != null) {
            c91481ZvJ2.LJLJJL = System.currentTimeMillis();
        }
        if (this.LJLLLL) {
            if (this.LJLLL) {
                C91249ZrZ.LJIIIZ(getEnterFrom(), getEnterMethod(), "default");
                this.LJLLL = false;
            } else {
                C91249ZrZ.LJIIIZ(getEnterFrom(), "", "default");
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            TTDspViewModelV2 Il = Il(mo49getActivity);
            String enterMethod = getEnterMethod();
            Il.getClass();
            if (Il.LJLJI) {
                Il.LJLJI = false;
                return;
            }
            InterfaceC91177ZqP interfaceC91177ZqP = Il.LJLIL;
            if (interfaceC91177ZqP == null) {
                return;
            }
            C91249ZrZ.LJFF(interfaceC91177ZqP.tag(), enterMethod);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final XTabAbility vl() {
        if (getContext() != null) {
            String enterFrom = getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            this.LJLL = new XTabMusicDspAbilityImpl(enterFrom, getEnterMethod(), new C91619ZxX(this), new C91620ZxY(this), C91573Zwn.LJLIL, new IDqS421S0100000_29(this, 54));
        }
        XTabMusicDspAbilityImpl xTabMusicDspAbilityImpl = this.LJLL;
        if (xTabMusicDspAbilityImpl != null) {
            return xTabMusicDspAbilityImpl;
        }
        return null;
    }

    public final TTDspViewModelV2 Il(ActivityC45651qj activityC45651qj) {
        return C91136Zpk.LIZ(activityC45651qj);
    }

    public final boolean Kl(ActivityC45651qj activityC45651qj) {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activityC45651qj);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        String str;
        this.LJLLLLLL = false;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && Kl(mo49getActivity)) {
            C91215Zr1.LIZ(false);
            InterfaceC91177ZqP interfaceC91177ZqP = Il(mo49getActivity).LJLIL;
            if (interfaceC91177ZqP == null || (str = interfaceC91177ZqP.tag()) == null) {
                str = "";
            }
            C2U8.LIZ(new C91411ZuB(this, str, false));
        }
        C91197Zqj c91197Zqj = this.LJLJLLL;
        if (c91197Zqj != null) {
            C91198Zqk.LIZIZ = c91197Zqj.LJIIZILJ;
            c91197Zqj.LIZIZ();
        }
        C91198Zqk.LIZLLL--;
        C91198Zqk.LJ = false;
        C91249ZrZ.LJIIJJI(Gl(), "shift", getEnterMethod());
        this.LJLLLL = false;
        C91249ZrZ.LIZIZ = 0L;
        if (!C91279Zs3.LIZ()) {
            return;
        }
        C91279Zs3.LIZIZ();
        C1DH.LIZJ(C91279Zs3.LIZIZ);
        C1DH.LIZJ(C91279Zs3.LIZJ);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        String str;
        o.LJIIIZ(args, "args");
        this.LJLLLLLL = true;
        String enterMethod = getEnterMethod();
        if (!C91251Zrb.LIZ) {
            C91251Zrb.LIZ = true;
            C91249ZrZ.LJIIIZ("", enterMethod, "on_node_show");
        }
        C12460eI.LJIIIIZZ(this, null);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && Kl(mo49getActivity)) {
            C84193Sd.LIZ(mo49getActivity).tv0(false);
            IXTabPanelAbility iXTabPanelAbility = (IXTabPanelAbility) this.LJZI.getValue();
            if (iXTabPanelAbility == null || !iXTabPanelAbility.nf()) {
                C91215Zr1.LIZ(true);
            }
            InterfaceC91177ZqP interfaceC91177ZqP = Il(mo49getActivity).LJLIL;
            if (interfaceC91177ZqP == null || (str = interfaceC91177ZqP.tag()) == null) {
                str = "";
            }
            C2U8.LIZ(new C91411ZuB(this, str, true));
        }
        C91198Zqk.LIZJ++;
        C91198Zqk.LIZLLL++;
        if (C52309Kfx.LIZ()) {
            IXTabPanelAbility iXTabPanelAbility2 = (IXTabPanelAbility) this.LJZI.getValue();
            if (iXTabPanelAbility2 != null) {
                C91203Zqp.LIZLLL(iXTabPanelAbility2);
            }
        } else {
            C91189Zqb.LIZ();
        }
        if (this.LJLLJ) {
            this.LJLLJ = false;
            return;
        }
        C91249ZrZ.LJIIIZ("", getEnterMethod(), "default");
        C91249ZrZ.LIZ = SystemClock.elapsedRealtime();
        this.LJLLLL = true;
    }

    public final void Ll(int i) {
        ViewGroup viewGroup;
        if (this.LJZ == i) {
            return;
        }
        this.LJZ = i;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            TTDspViewModelV2 Il = Il(mo49getActivity);
            String enterMethod = getEnterMethod();
            Il.getClass();
            InterfaceC91177ZqP interfaceC91177ZqP = (InterfaceC91177ZqP) ListProtector.get(Il.LJLILLLLZI, i);
            Il.LJLIL = interfaceC91177ZqP;
            if (interfaceC91177ZqP != null) {
                C91249ZrZ.LJFF(interfaceC91177ZqP.tag(), enterMethod);
            }
            if (Kl(mo49getActivity)) {
                MainPageFragmentImpl.LJI().t9(false);
            } else {
                C91257Zrh.LIZ(mo49getActivity, true);
                if (this.LJLJL == null) {
                    TuxIconView tuxIconView = new TuxIconView(mo49getActivity, null, 0, 6, null);
                    C16880lQ.LJJJ(tuxIconView, new IDCListenerS137S0100000_29(mo49getActivity, 10));
                    tuxIconView.setIconRes(R.raw.icon_arrow_left_ltr);
                    tuxIconView.setPadding((int) KL2.LIZJ(mo49getActivity, 16.0f), 0, (int) KL2.LIZJ(mo49getActivity, 16.0f), 0);
                    tuxIconView.setTintColorRes(R.attr.dj);
                    tuxIconView.setIconHeight((int) KL2.LIZJ(mo49getActivity, 24.0f));
                    tuxIconView.setIconWidth((int) KL2.LIZJ(mo49getActivity, 24.0f));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams.gravity = 8388627;
                    View view = getView();
                    if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.df5)) != null) {
                        viewGroup.addView(tuxIconView, layoutParams);
                    }
                    this.LJLJL = tuxIconView;
                }
            }
        }
        C91173ZqL c91173ZqL = this.LJLJLJ;
        if (c91173ZqL != null) {
            c91173ZqL.LJ.onPageSelected(i);
        }
    }

    public final void Ml(String str) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(mo49getActivity);
            C2U8.LIZ(new C2JO(str, Hl()));
        }
    }

    public final void Nl(String str) {
        Context context;
        ActivityC45651qj LJJIFFI;
        if (str == null || (context = getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        TTDspViewModelV2 LIZ = C91136Zpk.LIZ(LJJIFFI);
        LIZ.getClass();
        Iterator it = ((ArrayList) LIZ.LJLILLLLZI).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(((InterfaceC91177ZqP) it.next()).tag(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        LPU Jl = Jl();
        if (Jl == null) {
            return;
        }
        Jl.setCurrentItem(i, false);
    }

    public final void Ol(String str) {
        String str2 = null;
        if (o.LJ(str, "track_reco")) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                TTDspViewModelV2 Il = Il(mo49getActivity);
                Il.getClass();
                try {
                    str2 = ((InterfaceC91177ZqP) ListProtector.get(Il.LJLILLLLZI, 1)).tag();
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                Nl(str2);
                Ll(1);
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(mo49getActivity);
                C2U8.LIZ(new C2JO("Daily Mix V2", Hl()));
                return;
            }
            return;
        }
        if (o.LJ(str, "my_playlist")) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                TTDspViewModelV2 Il2 = Il(mo49getActivity2);
                Il2.getClass();
                try {
                    str2 = ((InterfaceC91177ZqP) ListProtector.get(Il2.LJLILLLLZI, 0)).tag();
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
                Nl(str2);
                Ll(0);
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(mo49getActivity2);
                NewDspPlayerService Hl = Hl();
                getContext();
                C2U8.LIZIZ(new C2JO("LIBRARY V2", Hl));
                return;
            }
            return;
        }
        if (mo49getActivity() != null) {
            Ol("track_reco");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (X.YBK.LIZJ().fixCrosstalkBug == false) goto L16;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = X.C91279Zs3.LIZ()
            r3 = 0
            if (r0 != 0) goto L7e
        Lc:
            X.1qj r0 = r4.mo49getActivity()
            if (r0 == 0) goto L22
            boolean r0 = r4.Kl(r0)
            if (r0 == 0) goto L22
        L19:
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C91249ZrZ.LIZIZ = r0
            X.C91252Zrc.LIZIZ(r3)
        L22:
            X.Zxr r1 = new X.Zxr
            X.Zra r0 = X.C91252Zrc.LIZ
            r1.<init>(r0)
            X.C91252Zrc.LIZJ(r1)
            super.onAttach(r5)
            java.lang.String r0 = r4.toString()
            r4.LJLZ = r0
            java.lang.String r1 = r4.getEnterMethod()
            java.lang.String r0 = r4.LJLZ
            X.C91220Zr6.LIZ(r1, r0)
            X.YXW r0 = X.YXW.LIZ
            r0.getClass()
            boolean r0 = X.YXW.LJ
            if (r0 == 0) goto L4c
            java.lang.String r0 = "music_dsp_guide_repo"
            com.bytedance.keva.Keva.getRepo(r0)
        L4c:
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.dsp.v2.TTDspActivityV2
            if (r0 == 0) goto L5d
            X.YBK r0 = X.YBK.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZJ()
            boolean r0 = r0.fixCrosstalkBug
            if (r0 != 0) goto L76
        L5d:
            boolean r0 = r4.LJLLLLLL
            if (r0 == 0) goto L7d
            X.YBK r0 = X.YBK.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZJ()
            boolean r0 = r0.fixCrosstalkBug
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZJ()
            boolean r0 = r0.fixAddNodeShow
            if (r0 == 0) goto L7d
        L76:
            com.ss.android.ugc.aweme.dsp.playerservice.NewDspPlayerService r0 = r4.Hl()
            r0.onDspNodeCreatedEvent()
        L7d:
            return
        L7e:
            java.util.HashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r2 = X.C91279Zs3.LIZ
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r3)
            java.lang.String r0 = "dsp_launch"
            r2.put(r0, r1)
            X.LjB r0 = X.C40443Fu3.LIZ(r0)
            r0.start()
            java.lang.Runnable r2 = X.C91279Zs3.LIZJ
            r0 = 30000(0x7530, double:1.4822E-319)
            X.C1DH.LJJIJIIJIL(r0, r2)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2.onAttach(android.content.Context):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Hl().attach();
        C91215Zr1.LIZ = true;
        C91155Zq3.LIZ.put(this, new C91154Zq2());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate() ");
        LIZ.append(this);
        C60392Yp.LIZ("LFeedPanel", X1D.LIZIZ(LIZ), 8);
        if (this.LJLLLLLL) {
            YBK.LIZ.getClass();
            if (YBK.LIZJ().fixCrosstalkBug && YBK.LIZJ().fixAddNodeShow) {
                Hl().onDspNodeCreatedEvent();
            }
        }
    }

    @QD3
    public final void onSongCollectEvent$music_dsp_release(C57292Mr event) {
        o.LJIIIZ(event, "event");
        if (event.LJLJJI && event.LJLJI == 1) {
            if (C52309Kfx.LIZ()) {
                IXTabPanelAbility iXTabPanelAbility = (IXTabPanelAbility) this.LJZI.getValue();
                if (iXTabPanelAbility == null) {
                    return;
                }
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("tryToShowXTabFromUserCollectAction ability is ");
                LIZ.append(iXTabPanelAbility);
                LIZ.append(",current collect count is");
                LIZ.append(C91211Zqx.LIZ());
                X1D.LIZIZ(LIZ);
                C91203Zqp.LIZJ(new IDqS177S0200000_29(iXTabPanelAbility, requireContext, 4));
                return;
            }
            C91197Zqj c91197Zqj = this.LJLJLLL;
            if (c91197Zqj != null) {
                if (c91197Zqj.LJIILL != 1 && C91198Zqk.LIZLLL > 0) {
                    Keva keva = C91198Zqk.LIZ;
                    if (!keva.getBoolean("show_xtab_menu_by_coolected_song", false) && c91197Zqj.LJI(EnumC91190Zqc.BY_FIRST_COLLECTED_SONG)) {
                        keva.storeBoolean("show_xtab_menu_by_coolected_song", true);
                        return;
                    }
                }
                C91189Zqb.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        super.onViewStateRestored(bundle);
        if (bundle != null && (mo49getActivity = mo49getActivity()) != null) {
            Nl(((InterfaceC91177ZqP) ListProtector.get(Il(mo49getActivity).LJLILLLLZI, 1)).tag());
        }
    }

    @QD3
    public final void onXTabButtonClickEvent$music_dsp_release(C91412ZuC event) {
        C91197Zqj c91197Zqj;
        boolean LIZIZ;
        o.LJIIIZ(event, "event");
        if (Kl(mo49getActivity())) {
            C188787b0 c188787b0 = Hox.LJLLI;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null || !c188787b0.LIZ(mo49getActivity).vv0("MUSIC_DSP_XTAB")) {
                return;
            }
        }
        if (C52309Kfx.LIZ() || C91211Zqx.LIZ() == 0 || (c91197Zqj = this.LJLJLLL) == null) {
            return;
        }
        EnumC91190Zqc scene = EnumC91190Zqc.BY_USER_CLICK;
        o.LJIIIZ(scene, "scene");
        if (c91197Zqj.LJIILL == 2) {
            LIZIZ = c91197Zqj.LJI(scene);
        } else {
            LIZIZ = c91197Zqj.LIZIZ();
        }
        if (!LIZIZ) {
            return;
        }
        if (C91198Zqk.LIZJ == 0) {
            C91197Zqj c91197Zqj2 = this.LJLJLLL;
            if (c91197Zqj2 == null) {
                return;
            }
            c91197Zqj2.LIZJ();
            return;
        }
        if (C91198Zqk.LJ) {
            return;
        }
        C91197Zqj c91197Zqj3 = this.LJLJLLL;
        if (c91197Zqj3 != null) {
            EnumC91191Zqd enumC91191Zqd = C91198Zqk.LIZIZ;
            if (enumC91191Zqd == EnumC91191Zqd.DAILY_MIX) {
                c91197Zqj3.LIZJ();
            } else if (enumC91191Zqd == EnumC91191Zqd.FAVORITES) {
                c91197Zqj3.LIZLLL();
            }
        }
        C91198Zqk.LJ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0357, code lost:
    
        if (r1 != false) goto L115;
     */
    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewCreated() ");
        LIZ.append(this);
        C60392Yp.LIZ("LFeedPanel", X1D.LIZIZ(LIZ), 8);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C29S c29s = null;
        if (mo49getActivity == null) {
            LLLLIILL = null;
        } else {
            YXW.LIZ.getClass();
            if (YXW.LJIIIZ) {
                LLLLIILL = C16970lZ.LIZJ(R.layout.bvh, mo49getActivity, viewGroup, false);
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bvh, viewGroup, false);
            }
            ViewGroup viewGroup2 = (ViewGroup) LLLLIILL.findViewById(R.id.j66);
            LPU lpu = new LPU(mo49getActivity);
            lpu.setId(R.id.gsz);
            viewGroup2.addView(lpu, new RelativeLayout.LayoutParams(-1, -1));
            final C91250Zra c91250Zra = C91252Zrc.LIZ;
            C91252Zrc.LIZJ(new TBU(c91250Zra) { // from class: X.Zxs
                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
                public final Object get() {
                    return Long.valueOf(((C91250Zra) this.receiver).LIZLLL);
                }

                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
                public final void set(Object obj) {
                    ((C91250Zra) this.receiver).LIZLLL = ((Number) obj).longValue();
                }
            });
        }
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (o.LJ(str2, "MUSIC_DSP")) {
            if (!this.LJLLILLLL) {
                C91249ZrZ.LJIIJJI(Gl(), "shift", getEnterMethod());
                this.LJLLILLLL = true;
            }
            this.LJLLI = false;
        } else if (o.LJ(str, "MUSIC_DSP")) {
            if (bundle != null && bundle.containsKey("target_tab")) {
                String string = bundle.getString("target_tab");
                bundle.getString("aid");
                bundle.getString("full_clip_id");
                Ol(string);
            }
            if (!this.LJLLI) {
                C91249ZrZ.LJIIIZ("", getEnterMethod(), "default");
                this.LJLLI = true;
            }
            this.LJLLILLLL = false;
            C91249ZrZ.LIZ = SystemClock.elapsedRealtime();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && Kl(mo49getActivity)) {
                C84193Sd.LIZ(mo49getActivity).tv0(false);
            }
        }
        if (!o.LJ(str, "MUSIC_DSP")) {
            C91249ZrZ.LIZIZ = 0L;
        }
    }
}
