package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong;

import X.C17N;
import X.C212428Vi;
import X.C214348b8;
import X.C241249dQ;
import X.C32151Nz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C91139Zpn;
import X.C91200Zqm;
import X.C91218Zr4;
import X.C91249ZrZ;
import X.C91264Zro;
import X.C91273Zrx;
import X.C91395Ztv;
import X.C91437Zub;
import X.C91559ZwZ;
import X.C91560Zwa;
import X.C9BD;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.IDCListenerS84S0200000_29;
import Y.IDObserverS226S0100000_29;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class PlayFullSongAssem extends BaseDspItemReusedAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIILZ;
    public C91395Ztv LLFII;
    public View LLFZ;
    public final InterfaceC115514g7 LLI;
    public C91139Zpn LLIFFJFJJ;
    public TuxTextView LLII;
    public final InterfaceC115514g7 LLIIII;

    static {
        TBT tbt = new TBT(PlayFullSongAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        TBT tbt2 = new TBT(PlayFullSongAssem.class, "s2sReportVM", "getS2sReportVM()Lcom/ss/android/ugc/aweme/dsp/playpage/s2s/S2SReportViewModel;", 0);
        c65351Pkp.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbt, tbt2};
    }

    public PlayFullSongAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 38), null, C91559ZwZ.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(S2SReportViewModel.class);
        this.LLIIII = C214348b8.LIZ(this, LIZ2, c241249dQ, new IDqS421S0100000_29(LIZ2, 39), null, C91560Zwa.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem, X.C8XO
    public final void unBind() {
        if (b4()) {
            ((S2SReportViewModel) this.LLIIII.LIZ(this, LLIIIILZ[1])).LJLIL.dispose();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        IAudioPlayerAbility Z3;
        C91437Zub FP;
        String str;
        C91437Zub FP2;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        if (!item.LJLJJLL) {
            InterfaceC115514g7 interfaceC115514g7 = this.LLI;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIIILZ;
            Object LIZ = interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[0]);
            String str2 = item.LJLJJL;
            boolean z = item.LJLJJLL;
            LIZ.getClass();
            if (ExpirePlayableVM.gv0(str2, z)) {
                View view = this.LLFZ;
                if (view != null) {
                    C17N.LJJLIIIJJI(view);
                    C17N.LJJLIIIJJI(this.LLIFFJFJJ);
                    Object LIZ2 = this.LLI.LIZ(this, interfaceC74236TBoArr[0]);
                    String str3 = item.LJLJJL;
                    LIZ2.getClass();
                    ExpirePlayableVM.hv0(str3, true);
                    if (b4()) {
                        IAudioPlayerAbility Z32 = Z3();
                        if (Z32 != null && (FP2 = Z32.FP()) != null) {
                            FP2.LJFF(true);
                        }
                        C91139Zpn c91139Zpn = this.LLIFFJFJJ;
                        if (c91139Zpn != null) {
                            c91139Zpn.LIZIZ();
                        }
                        C17N.LJJLIIIJJI(this.LLIFFJFJJ);
                        C91139Zpn c91139Zpn2 = this.LLIFFJFJJ;
                        if (c91139Zpn2 != null) {
                            c91139Zpn2.LJ();
                        }
                        Context context = getContext();
                        if (context != null) {
                            String str4 = item.LJLLI;
                            String str5 = item.LJLJJI.LJI;
                            if (C91218Zr4.LIZLLL(context)) {
                                str = "other_app";
                            } else {
                                str = "app_store";
                            }
                            C91249ZrZ.LJIIL("previous_song", null, str5, "resso", str4, str, 34);
                            S2SReportViewModel s2SReportViewModel = (S2SReportViewModel) this.LLIIII.LIZ(this, interfaceC74236TBoArr[1]);
                            Fragment LIZLLL = C212428Vi.LIZLLL(this);
                            String valueOf = String.valueOf(item.LJLILLLLZI);
                            if (valueOf == null) {
                                valueOf = "";
                            }
                            s2SReportViewModel.gv0(context, LIZLLL, valueOf, item.LJLJI, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o.LJIJI("contentView");
                throw null;
            }
            if (b4() && (Z3 = Z3()) != null && (FP = Z3.FP()) != null) {
                FP.LJFF(true);
            }
            View view2 = this.LLFZ;
            if (view2 != null) {
                C17N.LJJIIJZLJL(view2);
                C91139Zpn c91139Zpn3 = this.LLIFFJFJJ;
                if (c91139Zpn3 != null) {
                    c91139Zpn3.LIZIZ();
                }
                C91139Zpn c91139Zpn4 = this.LLIFFJFJJ;
                if (c91139Zpn4 != null) {
                    C17N.LJJIIJZLJL(c91139Zpn4);
                }
                if (item.LJZI.LJLIL) {
                    return;
                }
                Object LIZ3 = this.LLI.LIZ(this, interfaceC74236TBoArr[0]);
                String str6 = item.LJLJJL;
                LIZ3.getClass();
                ExpirePlayableVM.hv0(str6, false);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        View view3 = this.LLFZ;
        if (view3 != null) {
            C17N.LJJIIJZLJL(view3);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Fragment LIZLLL;
        IEventDispatchAbility iEventDispatchAbility;
        MutableLiveData XS;
        IEventDispatchAbility iEventDispatchAbility2;
        MutableLiveData V50;
        IXTabPanelAbility LJFF;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        this.LLFZ = view;
        this.LLIFFJFJJ = (C91139Zpn) view.findViewById(R.id.axw);
        View view2 = this.LLFZ;
        if (view2 != null) {
            this.LLII = (TuxTextView) view2.findViewById(R.id.jk);
            IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
            if (LIZ != null && (OO = LIZ.OO()) != null) {
                OO.observe(this, new IDObserverS226S0100000_29(this, 17));
            }
            C91139Zpn c91139Zpn = this.LLIFFJFJJ;
            if (c91139Zpn != null) {
                c91139Zpn.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS84S0200000_29(view, this, 0)));
            }
            if (b4() && (LJFF = C91264Zro.LJFF(this)) != null) {
                float F7 = LJFF.F7() - C32151Nz.LJIIZILJ(86);
                C91200Zqm.LIZJ(this.LLIFFJFJJ, C212428Vi.LIZLLL(this), LJFF, F7);
                C91200Zqm.LIZJ(this.LLII, C212428Vi.LIZLLL(this), LJFF, F7);
            }
            Context context = getContext();
            if (context == null || (LIZLLL = C212428Vi.LIZLLL(this)) == null || (iEventDispatchAbility = (IEventDispatchAbility) this.LLFFF.getValue()) == null || (XS = iEventDispatchAbility.XS()) == null || (iEventDispatchAbility2 = (IEventDispatchAbility) this.LLFFF.getValue()) == null || (V50 = iEventDispatchAbility2.V50()) == null) {
                return;
            }
            C91273Zrx.LIZ(context, LIZLLL, this, XS, V50, (S2SReportViewModel) this.LLIIII.LIZ(this, LLIIIILZ[1]), new IDqS421S0100000_29(this, 36), new IDqS421S0100000_29(this, 37), true);
            return;
        }
        o.LJIJI("contentView");
        throw null;
    }
}
