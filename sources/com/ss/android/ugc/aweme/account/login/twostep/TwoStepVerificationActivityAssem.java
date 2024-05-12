package com.ss.android.ugc.aweme.account.login.twostep;

import X.AI8;
import X.AIF;
import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C235119Kp;
import X.C239289aG;
import X.C252709vu;
import X.C26045AKb;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78840Uwu;
import X.C78926UyI;
import X.C85195Xc7;
import X.C85837XmT;
import X.C8YN;
import X.C9BD;
import X.DialogC25756A8y;
import X.InterfaceC26157AOj;
import X.R41;
import X.SY4;
import X.SYL;
import X.TBT;
import Y.ACListenerS35S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerificationActivityAssem extends UIListContentAssem<TwoStepVerificationActivityViewModel> {
    public static final /* synthetic */ int LJLZ = 0;
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C55749LuL LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final TwoStepVerificationService LJLLLLLL;

    public TwoStepVerificationActivityAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 139));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TwoStepVerificationActivityViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 41), C85195Xc7.INSTANCE, null);
        C221108m2.LIZIZ(new AqS165S0100000_15(this, 137));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 133));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 131));
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 134));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 144));
        this.LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 138));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 132));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, UserLevelGeckoUpdateSetting.DEFAULT));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 40));
        this.LJLLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 136));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 135));
        this.LJLLJ = new C55749LuL(C47704Ins.LIZJ(this, C239289aG.class, "two_step_verification_management_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 39));
        this.LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 38));
        InterfaceC26157AOj LJIIL = R41.LIZIZ.LJIIL();
        o.LJII(LJIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.LJLLLLLL = (TwoStepVerificationService) LJIIL;
    }

    public final Activity C3() {
        return (Activity) this.LJLLLL.getValue();
    }

    public final DialogC25756A8y E3() {
        return (DialogC25756A8y) this.LJLL.getValue();
    }

    public final C73305Spp F3() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final SY4 H3() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-turnOnButton>(...)");
        return (SY4) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public final TwoStepVerificationActivityViewModel A3() {
        return (TwoStepVerificationActivityViewModel) this.LJLILLLLZI.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LJLLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        return new C57939MoZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        E3().dismiss();
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        A3().iv0();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        getContainerView().getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-titleBar>(...)");
        C252709vu c252709vu = (C252709vu) value;
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, "", new AqS165S0100000_15(this, 141));
        c252709vu.setNavActions(c235119Kp);
        c252709vu.LJIILJJIL(false);
        A3().asyncSubscribe(new TBT() { // from class: X.Xbo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85167Xbf) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 35), new AqS165S0100000_15(this, 142), new AqS181S0100000_15(this, 36));
        A3().asyncSubscribe(new TBT() { // from class: X.Xbp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85167Xbf) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 37), new AqS165S0100000_15(this, 143), new AqS181S0100000_15(this, 38));
        C16880lQ.LJJIZ(H3(), new ACListenerS35S0100000_15(this, 35));
        C8YN.LJII(this, A3(), new TBT() { // from class: X.Xbm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C85167Xbf) obj).LJLJJI);
            }
        }, C213688a4.LIZLLL(), new AqS197S0100000_15(this, 12), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.Xbn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85167Xbf) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), new AqS197S0100000_15(this, 13), 4);
        Context context = getContext();
        if (context != null) {
            Object value2 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value2, "<get-description>(...)");
            C85837XmT.LIZJ(context, (TuxTextView) value2, 4, 2, new ACListenerS35S0100000_15(this, 36));
            Object value3 = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value3, "<get-trustDevice>(...)");
            AI8 ai8 = (AI8) value3;
            AIF aif = new AIF(context, null);
            aif.LJIILJJIL(new ACListenerS35S0100000_15(this, 37));
            ai8.setAccessory(aif);
            ai8.setTitle(context.getString(R.string.t8c));
        }
    }

    public final void K3(boolean z, boolean z2) {
        String str;
        Activity C3;
        String string;
        String str2;
        Activity C32;
        String string2;
        E3().dismiss();
        F3().setVisibility(8);
        String str3 = "";
        if (z) {
            Object value = this.LJLJJI.getValue();
            o.LJIIIIZZ(value, "<get-statusBar>(...)");
            TextView textView = (TextView) value;
            Context context = getContext();
            if (context == null || (str2 = context.getString(R.string.t8e)) == null) {
                str2 = "";
            }
            textView.setText(str2);
            Object value2 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value2, "<get-description>(...)");
            ((View) value2).setVisibility(0);
            Object value3 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value3, "<get-smallTitle>(...)");
            TextView textView2 = (TextView) value3;
            Context context2 = getContext();
            if (context2 != null && (string2 = context2.getString(R.string.t90)) != null) {
                str3 = string2;
            }
            textView2.setText(str3);
            if (z2 && H3().getVisibility() == 0 && (C32 = C3()) != null) {
                C26045AKb c26045AKb = new C26045AKb(C32);
                c26045AKb.LJIIIZ(C32.getString(R.string.t8f));
                c26045AKb.LJIIJ();
            }
            Object value4 = this.LJLLI.getValue();
            o.LJIIIIZZ(value4, "<get-trustDeviceTitle>(...)");
            ((View) value4).setVisibility(0);
            Object value5 = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value5, "<get-trustDevice>(...)");
            ((View) value5).setVisibility(0);
            H3().setVisibility(8);
        } else {
            Object value6 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value6, "<get-statusBar>(...)");
            TextView textView3 = (TextView) value6;
            Context context3 = getContext();
            if (context3 == null || (str = context3.getString(R.string.t8d)) == null) {
                str = "";
            }
            textView3.setText(str);
            Object value7 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value7, "<get-smallTitle>(...)");
            TextView textView4 = (TextView) value7;
            Context context4 = getContext();
            if (context4 != null && (string = context4.getString(R.string.t91)) != null) {
                str3 = string;
            }
            textView4.setText(str3);
            Object value8 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value8, "<get-description>(...)");
            ((View) value8).setVisibility(0);
            if (z2 && H3().getVisibility() != 0 && (C3 = C3()) != null) {
                C26045AKb c26045AKb2 = new C26045AKb(C3);
                c26045AKb2.LJIIIZ(C3.getString(R.string.t8x));
                c26045AKb2.LJIIJ();
            }
            Object value9 = this.LJLLI.getValue();
            o.LJIIIIZZ(value9, "<get-trustDeviceTitle>(...)");
            ((View) value9).setVisibility(8);
            Object value10 = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value10, "<get-trustDevice>(...)");
            ((View) value10).setVisibility(8);
            H3().setVisibility(0);
        }
        v3().setVisibility(0);
        Object value11 = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value11, "<get-twoStepVerificationContainer>(...)");
        ((View) value11).setVisibility(0);
    }
}
