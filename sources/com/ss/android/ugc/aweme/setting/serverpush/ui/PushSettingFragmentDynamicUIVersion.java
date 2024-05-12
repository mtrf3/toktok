package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AV9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C235119Kp;
import X.C252569vg;
import X.C252709vu;
import X.C25851ACp;
import X.C26037AJt;
import X.C26039AJv;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C40322Fs6;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C78840Uwu;
import X.C85895XnP;
import X.C85897XnR;
import X.C85910Xne;
import X.C85922Xnq;
import X.C85934Xo2;
import X.C85940Xo8;
import X.C85948XoG;
import X.C90903hW;
import X.FMX;
import X.InterfaceC26038AJu;
import X.InterfaceC85901XnV;
import X.InterfaceC85903XnX;
import X.InterfaceC85911Xnf;
import X.InterfaceC85949XoH;
import X.KL2;
import X.KNV;
import X.SYL;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.serverpush.service.PushSettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS70S0110000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PushSettingFragmentDynamicUIVersion extends AmeBaseFragment implements InterfaceC85911Xnf, InterfaceC85903XnX, InterfaceC26038AJu, InterfaceC85901XnV {
    public C252709vu LJLIL;
    public C25851ACp LJLILLLLZI;
    public final C85910Xne LJLJI;
    public final C85897XnR LJLJJI;
    public final C26039AJv LJLJJL;
    public final C85895XnP LJLJJLL;
    public final C85948XoG LJLJL;
    public String LJLJLJ;
    public final ArrayList<InterfaceC85949XoH> LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public PushSettingDynamicUI LJLLJ;
    public C73305Spp LJLLL;
    public final C85922Xnq LJLLLL;

    public PushSettingFragmentDynamicUIVersion() {
        new LinkedHashMap();
        this.LJLJI = new C85910Xne();
        this.LJLJJI = new C85897XnR();
        this.LJLJJL = new C26039AJv();
        this.LJLJJLL = new C85895XnP();
        this.LJLJL = new C85948XoG();
        this.LJLJLJ = "";
        this.LJLJLLL = new ArrayList<>();
        this.LJLLLL = new C85922Xnq(this);
    }

    @Override // X.InterfaceC26038AJu
    public final void CX() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean LIZJ = C40322Fs6.LIZJ(getContext());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sysNotificationEnable: ");
        LIZ.append(LIZJ);
        C85934Xo2.LIZ(X1D.LIZIZ(LIZ));
        Iterator<InterfaceC85949XoH> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(LIZJ);
        }
        Iterator<InterfaceC85949XoH> it2 = this.LJLJLLL.iterator();
        while (it2.hasNext()) {
            InterfaceC85949XoH next = it2.next();
            Context context = getContext();
            if (context != null) {
                next.LJ(context);
            }
        }
    }

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        C85940Xo8.LIZIZ.LIZJ(pushSettings);
        this.LJLL = true;
        PushSettingDynamicUI pushSettingDynamicUI = this.LJLLJ;
        if (pushSettingDynamicUI != null) {
            vl(pushSettingDynamicUI);
        }
    }

    @Override // X.InterfaceC85911Xnf
    public final void R20(PushSettingDynamicUI pushSettingDynamicUI) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushDynamicUISettings onFetchUISuccess, ");
        LIZ.append(pushSettingDynamicUI);
        C85934Xo2.LIZ(X1D.LIZIZ(LIZ));
        PushSettingServiceImpl.LIZLLL().LIZ(pushSettingDynamicUI);
        this.LJLLJ = pushSettingDynamicUI;
        this.LJLLI = true;
        vl(pushSettingDynamicUI);
    }

    @Override // X.InterfaceC85911Xnf
    public final void SL(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushDynamicUISettings onFetchUIFailed ");
        LIZ.append(exc);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        this.LJLJI.getClass();
        PushSettingDynamicUI LIZIZ = PushSettingServiceImpl.LIZLLL().LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = null;
        }
        this.LJLLJ = LIZIZ;
        if (LIZIZ != null) {
            this.LJLLI = true;
            vl(LIZIZ);
        } else {
            wl(true);
        }
    }

    @Override // X.InterfaceC26038AJu
    public final void fD(boolean z) {
        if (z) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(getString(R.string.iv8));
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(this);
        c26045AKb2.LJIIIIZZ(R.string.im9);
        c26045AKb2.LJIIJ();
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
        if (C85940Xo8.LIZIZ.LJ() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch push switch status fail ");
            LIZ.append(exc);
            LIZ.append(", show error page");
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            wl(false);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fetch push switch status fail ");
        LIZ2.append(exc);
        LIZ2.append(", use cached data");
        String msg2 = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg2, "msg");
        this.LJLL = true;
        PushSettingDynamicUI pushSettingDynamicUI = this.LJLLJ;
        if (pushSettingDynamicUI == null) {
            return;
        }
        vl(pushSettingDynamicUI);
    }

    @Override // X.InterfaceC26038AJu
    public final void uj0(FetchPushOffReasonsResp fetchPushOffReasonsResp) {
        PushOffReasonBottomSheetFragment LIZ;
        PushOffReasonsData pushOffReasonsData = fetchPushOffReasonsResp.data;
        if (pushOffReasonsData == null) {
            return;
        }
        this.LJLJL.LIZ.storeLong("key_next_push_off_dialog_showtime", System.currentTimeMillis() + (pushOffReasonsData.interval * 1000));
        String str = this.LJLJLJ;
        C188727au LIZLLL = KNV.LIZLLL(str, "label");
        LIZLLL.LJIIIZ("enter_from", "push_setting_page");
        LIZLLL.LJIIIZ("label", str);
        FMX.LJIIL("push_feedback_pop_up_show", LIZLLL.LIZ);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (LIZ = C26037AJt.LIZ(mo49getActivity, new AV9("settings_page", "manual", 24), this.LJLJLJ, pushOffReasonsData)) == null) {
            return;
        }
        LIZ.LJLJJI = new WeakReference<>(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (0 != 0) goto L40;
     */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.AEC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl(com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingFragmentDynamicUIVersion.vl(com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI):void");
    }

    public final void wl(boolean z) {
        String str;
        String str2;
        C73305Spp c73305Spp = this.LJLLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLLL;
        if (c73305Spp2 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            Context context = getContext();
            if (context == null || (str2 = context.getString(R.string.hve)) == null) {
                str2 = "";
            }
            c73306Spq.LJI = str2;
            c73305Spp2.setStatus(c73306Spq);
        }
        C73305Spp c73305Spp3 = this.LJLLL;
        if (c73305Spp3 != null) {
            C252569vg.LIZ(c73305Spp3, "push_settings", null, new AqS70S0110000_15(this, z, 0));
        }
        if (z) {
            str = "ui_error";
        } else {
            str = "status_error";
        }
        int i = this.LJLLILLLL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("reason", str);
        c188727au.LIZLLL(i, "retry_times");
        FMX.LJIIL("show_notification_setting_error_page", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C85895XnP c85895XnP = this.LJLJJLL;
        c85895XnP.LJLILLLLZI = this;
        c85895XnP.LJIILL(new Object[0]);
        super.onViewCreated(view, bundle);
        this.LJLIL = (C252709vu) view.findViewById(R.id.la4);
        this.LJLLL = (C73305Spp) view.findViewById(R.id.kf_);
        View findViewById = view.findViewById(R.id.igb);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.push_list)");
        SYL syl = (SYL) findViewById;
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        syl.setPadding(0, LIZJ, 0, LIZJ);
        this.LJLILLLLZI = new C25851ACp(syl);
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            String string = getString(R.string.hbf);
            o.LJIIIIZZ(string, "getString(R.string.in_ap…push_settings_page_title)");
            C78840Uwu.LJJIZ(c235119Kp, string, new AqS165S0100000_15(this, 817));
            c252709vu.setNavActions(c235119Kp);
        }
        C73305Spp c73305Spp = this.LJLLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLLL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        C85910Xne c85910Xne = this.LJLJI;
        c85910Xne.LJLILLLLZI = this;
        c85910Xne.LJIILL(new Object[0]);
        C85897XnR c85897XnR = this.LJLJJI;
        c85897XnR.LJLILLLLZI = this;
        c85897XnR.LJLJI = false;
        this.LJLJJL.LJLILLLLZI = this;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cku, viewGroup, false);
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
}
