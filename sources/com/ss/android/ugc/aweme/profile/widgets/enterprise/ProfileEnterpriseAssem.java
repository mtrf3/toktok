package com.ss.android.ugc.aweme.profile.widgets.enterprise;

import X.C119244m8;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C26175APb;
import X.C34466Dfq;
import X.C40342FsQ;
import X.C40343FsR;
import X.C47704Ins;
import X.C53191KuB;
import X.C55749LuL;
import X.C59784NdE;
import X.C60893Nv7;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8VC;
import X.C9AC;
import X.C9AE;
import X.C9ID;
import X.C9IE;
import X.C9KV;
import X.C9PL;
import X.C9PN;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.OKG;
import X.TBT;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.experiment.BioLinkReportConfig;
import com.ss.android.ugc.aweme.profile.model.ProfileUserExperiments;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public class ProfileEnterpriseAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public TextView LJLILLLLZI;
    public C119244m8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public LinearLayout LJLJJL;
    public long LJLJJLL;

    public ProfileEnterpriseAssem() {
        new LinkedHashMap();
        checkSupervisorPrepared();
        C47704Ins.LJ(this, C26175APb.class, null);
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
        this.LJLJJI = C221108m2.LIZIZ(C9IE.LJLIL);
    }

    public final boolean L7() {
        C9ID c9id = (C9ID) this.LJLIL.getValue();
        if (c9id != null) {
            return c9id.LJLJI;
        }
        return false;
    }

    public final Aweme getAweme() {
        Aweme aweme;
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn == null || (aweme = c9pn.LJI) == null) {
            C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
            if (c9pl != null) {
                return c9pl.LJII;
            }
            return null;
        }
        return aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // X.C8W0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r4 = this;
            super.onResume()
            java.lang.Class<X.9KV> r0 = X.C9KV.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r0 = X.C8VC.LJIIIIZZ(r4, r0)
            X.9PL r0 = (X.C9PL) r0
            if (r0 == 0) goto L4a
            boolean r0 = r0.LJ
            if (r0 == 0) goto L4a
            java.lang.Class<X.9Kk> r0 = X.InterfaceC235069Kk.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r0 = X.C8VC.LJIIIIZZ(r4, r0)
            X.9Kd r0 = (X.C234999Kd) r0
            r3 = 0
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.LIZ
            if (r2 == 0) goto L4c
            java.lang.String r0 = r2.getBioEmail()
        L2c:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "personal_homepage"
            if (r0 != 0) goto L39
            java.lang.String r0 = "email"
            X.C26335AVf.LJJIJ(r2, r1, r0)
        L39:
            if (r2 == 0) goto L3f
            java.lang.String r3 = r2.getBioUrl()
        L3f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "weblink"
            X.C26335AVf.LJJIJ(r2, r1, r0)
        L4a:
            return
        L4b:
            r2 = r3
        L4c:
            r0 = r3
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseAssem.onResume():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJJL = (LinearLayout) view.findViewById(R.id.myi);
        C119244m8 c119244m8 = (C119244m8) view.findViewById(R.id.n18);
        this.LJLJI = c119244m8;
        if (c119244m8 != null) {
            C16880lQ.LJJJIL(c119244m8, new ACListenerS24S0100000_4(this, 146));
        }
        TextView textView = (TextView) view.findViewById(R.id.m65);
        this.LJLILLLLZI = textView;
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS24S0100000_4(this, 147));
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9L2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 691));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Kz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 692));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9L1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS170S0100000_4(this, 693));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9L0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZJ;
            }
        }, new AqS170S0100000_4(this, 690));
        C119244m8 c119244m82 = this.LJLJI;
        C9AC c9ac = C9AC.ALPHA;
        C9AE.LIZ(c119244m82, c9ac, 0.0f);
        C9AE.LIZ(this.LJLILLLLZI, c9ac, 0.0f);
    }

    public final void v3(View view) {
        if (view == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJJLL < 3000) {
            return;
        }
        this.LJLJJLL = currentTimeMillis;
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LIZLLL(2000L);
        c26045AKb.LJIIIIZZ(R.string.ef9);
        c26045AKb.LJIIJ();
    }

    public final void x3(User user) {
        String bioSecureUrl;
        Context context;
        BioLinkReportConfig bioLinkReportConfig;
        boolean z;
        int i;
        String str;
        String str2;
        Aweme aweme;
        String aid;
        if (user != null && (bioSecureUrl = user.getBioSecureUrl()) != null && !TextUtils.isEmpty(bioSecureUrl) && (context = getContext()) != null) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://webview/?url=");
            LIZ.append(Uri.encode(bioSecureUrl));
            LIZ.append("&use_spark=1&bid=bio_link_scene&enable_runtime_switch=0&target_handler=crossPlatform");
            sparkContext.LJJIJLIJ(X1D.LIZIZ(LIZ));
            BioLinkReportConfig bioLinkReportConfig2 = null;
            try {
                SettingsManager.LIZLLL().getClass();
                bioLinkReportConfig = (BioLinkReportConfig) SettingsManager.LJII("bio_link_report_config", BioLinkReportConfig.class);
            } catch (Exception unused) {
                bioLinkReportConfig = null;
            }
            if (bioLinkReportConfig != null) {
                z = bioLinkReportConfig.isBioLinkReportShow();
            } else {
                z = true;
            }
            if (z) {
                C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
                if (c9pn != null && (aweme = c9pn.LJI) != null && (aid = aweme.getAid()) != null) {
                    sparkContext.LJJIIJ("aweme_id", aid);
                }
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                sparkContext.LJJIIJ("owner_id", uid);
                sparkContext.LJJIIJ("enter_from", "biolink_profile_page");
                sparkContext.LJJIIJ("report_type", "bio_link");
                try {
                    SettingsManager.LIZLLL().getClass();
                    bioLinkReportConfig2 = (BioLinkReportConfig) SettingsManager.LJII("bio_link_report_config", BioLinkReportConfig.class);
                } catch (Exception unused2) {
                }
                if (bioLinkReportConfig2 != null) {
                    i = bioLinkReportConfig2.getShowReportJumpTime();
                } else {
                    i = 0;
                }
                sparkContext.LJJIFFI(i, "page_depth_of_report_show");
                sparkContext.LJJIIJ("sec_link_scene", "bio_url");
                sparkContext.LJJIIJZLJL("need_sec_link", true);
                if (C53191KuB.LIZ()) {
                    str = "more";
                } else {
                    str = "report";
                }
                sparkContext.LJJIIJ("nav_btn_type", str);
                sparkContext.LJJIIJZLJL("need_report", true);
                if (C53191KuB.LIZ()) {
                    sparkContext.LJJIJL(new C59784NdE());
                    if (L7()) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    sparkContext.LJJIIJ("previous_page", str2);
                    String bioUrl = user.getBioUrl();
                    o.LJIIIIZZ(bioUrl, "user.bioUrl");
                    sparkContext.LJJIIJ("bio_url", bioUrl);
                }
            }
            if (user.getAccountType() != 3 && user.getBioUrl() != null) {
                IComplianceBusinessService LJFF = a.LJFF();
                String bioUrl2 = user.getBioUrl();
                o.LJIIIIZZ(bioUrl2, "user.bioUrl");
                if (LJFF.LIZLLL(bioUrl2)) {
                    ProfileUserExperiments profileUserExperiments = user.profileUserExperiments;
                    if (profileUserExperiments != null && profileUserExperiments.getCanShowEntrance() == 1) {
                        sparkContext.LJJ(new C60893Nv7(this));
                    } else if (((Boolean) C34466Dfq.LIZIZ.getValue()).booleanValue()) {
                        sparkContext.LJJ(new C60893Nv7(this));
                    }
                }
            }
            OKG.LIZLLL(c40342FsQ, context, sparkContext);
        }
    }
}
