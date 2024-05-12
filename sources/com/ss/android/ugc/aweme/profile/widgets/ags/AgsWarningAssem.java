package com.ss.android.ugc.aweme.profile.widgets.ags;

import X.C16880lQ;
import X.C188727au;
import X.C47704Ins;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C8VC;
import X.C9AC;
import X.C9AE;
import X.C9ID;
import X.C9KV;
import X.F67;
import X.FMX;
import X.InterfaceC235069Kk;
import X.TBT;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS40S0100000_4;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.profile.ui.v2.MyProfileAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class AgsWarningAssem extends UIContentAssem implements F67 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    public AgsWarningAssem() {
        new LinkedHashMap();
        checkSupervisorPrepared();
        C47704Ins.LJ(this, C9ID.class, null);
    }

    @Override // X.F67
    public final void onChanged() {
        getContainerView().post(new ARunnableS40S0100000_4(this, 71));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        SettingsManager.LIZLLL().LJIIJ(this);
        super.onDestroy();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJI = false;
        this.LJLJJI = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (this.LJLILLLLZI && !this.LJLJI && v3()) {
            x3();
        } else {
            if (!this.LJLILLLLZI || !this.LJLIL || this.LJLJJI) {
                return;
            }
            FMX.onEventV3("tns_profile_page_ags_warning_tag_show");
            this.LJLJJI = true;
        }
    }

    public final boolean v3() {
        MyProfileAbility myProfileAbility = (MyProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MyProfileAbility.class, null);
        if (myProfileAbility == null || !myProfileAbility.isFromMain() || !a.LJ().LIZLLL()) {
            return false;
        }
        return true;
    }

    public final void x3() {
        Integer num;
        AgsWarningInfo LJI = a.LJ().LJI();
        C188727au c188727au = new C188727au();
        if (LJI != null) {
            num = Integer.valueOf(LJI.getWarningLevel());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "warning_level");
        FMX.LJIIL("tns_profile_page_ags_warning_tag_show", c188727au.LIZ);
        this.LJLJI = true;
    }

    public final void A3(View view) {
        String str;
        if (this.LJLIL) {
            return;
        }
        if (v3()) {
            view.setVisibility(0);
            AgsWarningInfo LJI = a.LJ().LJI();
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.zh);
            C9AE.LIZ(linearLayout, C9AC.ALPHA, 0.0f);
            TextView textView = (TextView) view.findViewById(R.id.zi);
            if (LJI != null) {
                str = LJI.getWarningTitle();
            } else {
                str = null;
            }
            textView.setText(str);
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS39S0200000_4(LJI, linearLayout, 29));
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SettingsManager.LIZLLL().LJIIIZ(this);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9IS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZJ;
            }
        }, new AqS170S0100000_4(this, 671));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9IQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZ;
            }
        }, new AqS135S0200000_4(this, view, 86));
    }
}
