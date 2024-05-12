package com.ss.android.ugc.aweme.creatortools;

import X.A85;
import X.A98;
import X.AD8;
import X.AD9;
import X.ADB;
import X.ADE;
import X.ADF;
import X.ADG;
import X.ADI;
import X.ADJ;
import X.ADK;
import X.ADM;
import X.ADU;
import X.AEB;
import X.AEG;
import X.AV1;
import X.ActivityC86117Xqz;
import X.AnonymousClass028;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C221108m2;
import X.C251929ue;
import X.C25729A7x;
import X.C25750A8s;
import X.C25751A8t;
import X.C25848ACm;
import X.C25849ACn;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C36922EeM;
import X.C44423Hc3;
import X.C55888Lwa;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C68312mB;
import X.C69372nt;
import X.C73098SmU;
import X.C73318Sq2;
import X.C75;
import X.C85990Xow;
import X.C86393XvR;
import X.C9NE;
import X.EnumC42934Gt8;
import X.FMX;
import X.HG3;
import X.QD3;
import X.RBX;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.creatortools.tiktokseries.SeriesSetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import com.ss.android.ugc.aweme.services.IArticleModeRssService;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class CreatorToolsActivity extends ActivityC86117Xqz {
    public boolean LJLJI;
    public C75 LJLJJL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final String LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public C25860ACy LJLLILLLL;
    public C25860ACy LJLLJ;
    public C25860ACy LJLLL;
    public C25860ACy LJLLLL;
    public C25860ACy LJLLLLLL;
    public C25860ACy LJLZ;
    public AEG LJZ;
    public AEG LJZI;
    public C25860ACy LJZL;
    public C25860ACy LL;
    public C25860ACy LLD;
    public C25860ACy LLF;
    public C25849ACn LLFF;
    public C25849ACn LLFFF;
    public C25849ACn LLFII;
    public C25860ACy LLFZ;
    public A85 LLI;
    public C25860ACy LLIFFJFJJ;
    public C25860ACy LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public String LJLIL = "";
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public boolean LJLJJI = true;
    public final Map<String, String> LJLJJLL = new LinkedHashMap();

    public final void LLII() {
        boolean adAuthorization = ((RBX) HG3.LJIILL()).getCurUser().getAdAuthorization();
        C25851ACp LLFZ = LLFZ();
        String string = getString(R.string.hvy);
        String string2 = getString(R.string.hvz);
        ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 43);
        o.LJIIIIZZ(string, "getString(R.string.location_change_ad_setting)");
        C25849ACn c25849ACn = new C25849ACn(new C25848ACm(adAuthorization, string, aCListenerS24S0100000_4, true, null, null, null, string2, false, false, false, null, 64496));
        this.LLFF = c25849ACn;
        LLFZ.LIZ(c25849ACn);
    }

    public final void LLIIJI() {
        boolean z;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || curUser.shoutoutsStatus / 100 <= 0) {
            z = false;
        } else {
            z = true;
        }
        C25851ACp LLFZ = LLFZ();
        String string = getString(R.string.rbv);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_shoutouts_fill;
        ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 45);
        o.LJIIIIZZ(string, "getString(R.string.shout…refund_feature_shoutouts)");
        LLFZ.LIZ(new C25860ACy(new C25859ACx(string, c2068389v, aCListenerS24S0100000_4, null, z, null, null, null, false, false, null, null, false, false, null, null, null, 8388584)));
        if (z) {
            this.LJLJJI = false;
            LLILIL("tiktok_shoutouts_show");
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public CreatorToolsActivity() {
        boolean z;
        String LJJIL;
        C86393XvR LJJIJIL;
        C86393XvR LJJIJIL2;
        String str = "";
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        boolean z2 = false;
        if (LJJJLL != null && (LJJIJIL2 = LJJJLL.LJJIJIL()) != null) {
            z = o.LJ(LJJIJIL2.LJLJL(), Boolean.TRUE);
        } else {
            z = false;
        }
        this.LJLJL = z;
        ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
        if (LJJJLL2 != null && (LJJIJIL = LJJJLL2.LJJIJIL()) != null) {
            z2 = o.LJ(LJJIJIL.LJ(), Boolean.TRUE);
        }
        this.LJLJLJ = z2;
        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
        if (LJJJLL3 != null && (LJJIL = LJJJLL3.LJJIL()) != null) {
            str = LJJIL;
        }
        this.LJLJLLL = str;
        this.LJLL = C221108m2.LIZIZ(ADU.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 102));
    }

    public final C25851ACp LLFZ() {
        return (C25851ACp) this.LJLLI.getValue();
    }

    public final void LLIIIJ() {
        C25851ACp LLFZ = LLFZ();
        String string = getString(R.string.eb7);
        C2068389v LIZ = C251929ue.LIZ(string, "getString(R.string.creator_fund)");
        LIZ.LIZ = R.raw.icon_dollar_sign_fill;
        C25860ACy c25860ACy = new C25860ACy(new C25859ACx(string, LIZ, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388604));
        this.LL = c25860ACy;
        LLFZ.LIZ(c25860ACy);
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("creator_fund_setting_entry_schema", "");
            o.LJIIIIZZ(LJI, "{\n            SettingsMa…ng::class.java)\n        }");
            str = LJI;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("creator_fund_investigate action = creator_fund_setting_entry_schema_error, throwable = ");
            LIZ2.append(th.getMessage());
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        }
        C36922EeM.LJ("creator_fund_investigate action = creator_fund_setting_entry_schema, content = ".concat(str));
        C69372nt LIZ3 = C68312mB.LIZ(str);
        if (!AV1.LJIIJJI() && !TextUtils.isEmpty(str)) {
            C25860ACy c25860ACy2 = this.LL;
            if (c25860ACy2 != null) {
                c25860ACy2.LJIIJ(new AqS135S0200000_4(LIZ3, this, 7));
            }
            this.LJLJJI = false;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "creator_account");
            c188727au.LJIIIZ("process_id", this.LJLIL);
            FMX.LJIIL("show_creator_fund_cell", c188727au.LIZ);
            LLILIL("creator_fund_show");
            return;
        }
        C25860ACy c25860ACy3 = this.LL;
        if (c25860ACy3 == null) {
            return;
        }
        c25860ACy3.LJIIJ(A98.LJLIL);
    }

    public final void LLIIIZ() {
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        if (!c55888Lwa.LJIIZILJ()) {
            return;
        }
        C25851ACp LLFZ = LLFZ();
        String string = getString(R.string.e_m);
        String string2 = getString(R.string.e_n);
        boolean LJJI = c55888Lwa.LJJI(false);
        ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 44);
        o.LJIIIIZZ(string, "getString(R.string.creat…orTools_setting_headline)");
        C25849ACn c25849ACn = new C25849ACn(new C25848ACm(LJJI, string, aCListenerS24S0100000_4, true, null, null, null, string2, false, false, false, null, 64496));
        this.LLFFF = c25849ACn;
        LLFZ.LIZ(c25849ACn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b1f, code lost:
    
        if (X.C268713r.LIZIZ((X.RBX) X.HG3.LJIILL(), r6, r6, r7, true) != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x07a8, code lost:
    
        if (r5 != null) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, X.8pd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIL() {
        /*
            Method dump skipped, instructions count: 3075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.LLIL():void");
    }

    public final void LLILLL() {
        if (this.LJLJJL == null) {
            this.LJLJJL = LiveOuterService.LJJJLL().LJJIJIL().LJLJJL();
        }
        AEG aeg = this.LJZ;
        if (aeg != null) {
            aeg.LJIIJ(ADF.LJLIL);
        }
        C25860ACy c25860ACy = this.LJLZ;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(ADG.LJLIL);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "creator_tools");
        HG3.LJIIL();
        c188727au.LJIIIZ("anchor_id", HG3.LJLJL.LJFF().getCurUserId());
        for (Map.Entry entry : ((LinkedHashMap) this.LJLJJLL).entrySet()) {
            c188727au.LJI((String) entry.getKey(), (String) entry.getValue());
        }
        FMX.LJIIL("livesdk_creator_subscription_icon_show", c188727au.LIZ);
    }

    public final void LLIIIILZ() {
        boolean LIZ;
        boolean LIZJ = AnchorListServiceImpl.LIZLLL().LIZJ(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE());
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ == null || !LJ.LJIIIZ() || !e1.LIZ(31744, "enable_sub_only_video", true, false)) {
            if (LIZJ) {
                LIZ = ECommerceAnchorService.LJJJJI().LJJIIZI();
            } else {
                LIZ = AutoSoundCheckService.LIZLLL().LIZ();
            }
            if (!LIZ) {
                return;
            }
        }
        C25851ACp LLFZ = LLFZ();
        String string = getString(R.string.igc);
        o.LJIIIIZZ(string, "getString(R.string.music…heck_subtitle_UI_privacy)");
        LLFZ.LIZ(new AEG(new AEB(string, true, true, false, false, null, null, null, null, null, null, 16376)));
        AutoSoundCheckService.LIZLLL().LIZJ(new AqS170S0100000_4(this, 167));
    }

    public final void LLIIJLIL() {
        boolean z;
        SeriesSetting LIZ = ADM.LIZ();
        if (LIZ == null) {
            return;
        }
        C25851ACp LLFZ = LLFZ();
        String string = getString(R.string.qk4);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_series_fill;
        if (!AD9.LIZ()) {
            z = false;
        } else {
            z = LIZ.showRedDot;
        }
        ACListenerS39S0200000_4 aCListenerS39S0200000_4 = new ACListenerS39S0200000_4(this, LIZ, 10);
        o.LJIIIIZZ(string, "getString(R.string.series_allseries_pagetitle)");
        C25860ACy c25860ACy = new C25860ACy(new C25859ACx(string, c2068389v, aCListenerS39S0200000_4, null, true, null, null, null, false, z, null, null, false, false, null, null, null, 8388072));
        this.LLIFFJFJJ = c25860ACy;
        LLFZ.LIZ(c25860ACy);
        this.LJLJJI = false;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        FMX.LJIIL("paid_content_tab_show", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0.allowVideoGift == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIILII() {
        /*
            r23 = this;
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "nlg_creators"
            java.lang.Class<com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings> r0 = com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings.class
            r2.getClass()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L19
            com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings r0 = (com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings) r0     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L19
            boolean r0 = r0.allowVideoGift
            r9 = 1
            if (r0 != r9) goto L19
            goto L1a
        L19:
            r9 = 0
        L1a:
            r3 = r23
            X.ACp r2 = r3.LLFZ()
            r0 = 2131848711(0x7f116e07, float:1.9330935E38)
            java.lang.String r5 = r3.getString(r0)
            X.89v r6 = new X.89v
            r6.<init>()
            r0 = 2131755869(0x7f10035d, float:1.914263E38)
            r6.LIZ = r0
            Y.ACListenerS24S0100000_4 r7 = new Y.ACListenerS24S0100000_4
            r0 = 46
            r7.<init>(r3, r0)
            X.ACx r4 = new X.ACx
            java.lang.String r0 = "getString(R.string.videogifts_proaccount)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r8 = 0
            r13 = 0
            r22 = 8388584(0x7fffe8, float:1.175491E-38)
            r1 = r4
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r13
            r15 = r8
            r16 = r8
            r17 = r13
            r18 = r13
            r19 = r8
            r20 = r8
            r21 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.ACy r0 = new X.ACy
            r0.<init>(r1)
            r3.LLF = r0
            r2.LIZ(r0)
            if (r9 == 0) goto L7a
            r3.LJLJJI = r13
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "settings"
            r2.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_gifts_for_creators"
            X.FMX.LJIIL(r0, r1)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.LLIILII():void");
    }

    public final boolean LLILLJJLI() {
        String str;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL == null || (str = LJJJLL.LJJJJ()) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(this.LJLJLLL) && !TextUtils.equals(str, this.LJLJLLL)) {
            return true;
        }
        return false;
    }

    public final String getEnterFrom() {
        String LLJJIJIIJIL;
        Intent intent = getIntent();
        if (intent == null || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "PRO_ENTER_FROM")) == null) {
            return "";
        }
        return LLJJIJIIJIL;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C75 c75 = this.LJLJJL;
        if (c75 != null) {
            c75.onDestroy();
        }
        this.LJLILLLLZI.LIZLLL();
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onResume", true);
        super.onResume();
        C25860ACy c25860ACy = this.LJZL;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(ADB.LJLIL);
        }
        C25860ACy c25860ACy2 = this.LJLLILLLL;
        if (c25860ACy2 != null) {
            c25860ACy2.LJIIJ(ADJ.LJLIL);
        }
        C25860ACy c25860ACy3 = this.LJLLJ;
        if (c25860ACy3 != null) {
            c25860ACy3.LJIIJ(ADI.LJLIL);
        }
        C25860ACy c25860ACy4 = this.LLF;
        if (c25860ACy4 != null) {
            c25860ACy4.LJIIJ(C25729A7x.LJLIL);
        }
        C25860ACy c25860ACy5 = this.LLFZ;
        if (c25860ACy5 != null) {
            c25860ACy5.LJIIJ(ADK.LJLIL);
        }
        A85 a85 = this.LLI;
        if (a85 != null) {
            a85.LIZ().gv0();
        }
        SeriesSetting LIZ = ADM.LIZ();
        if (LIZ != null) {
            if (!LIZ.showRedDot || !AD9.LIZ()) {
                z = false;
            }
            C25860ACy c25860ACy6 = this.LLIFFJFJJ;
            if (c25860ACy6 != null) {
                c25860ACy6.LJIIJ(new AqS9S0010000_4(z, 55));
            }
        }
        C25860ACy c25860ACy7 = this.LJLLL;
        if (c25860ACy7 != null) {
            c25860ACy7.LJIIJ(new AqS170S0100000_4(this, 1275));
        }
        if (this.LJLJL) {
            C25860ACy c25860ACy8 = this.LJLLLL;
            if (c25860ACy8 != null) {
                c25860ACy8.LJIIJ(AD8.LJLIL);
            }
            LLILLIZIL("show");
        }
        IArticleModeRssService articleRssService = ArticleModeService.INSTANCE.getArticleRssService();
        if (articleRssService.isArticleRssCreationEnabled()) {
            articleRssService.fetchRssUser(this, new AqS135S0200000_4(this, articleRssService, 237));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public static void LLILLIZIL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("livesdk_creator_hub_inapp", c188727au.LIZ);
    }

    public final void LLFII(ShowCaseModel showCaseModel) {
        String str;
        String str2;
        String str3;
        if (showCaseModel != null && showCaseModel.showEntrance) {
            LLILIL("creator_showcase_show");
            String LIZJ = AnonymousClass028.LIZJ("getDefault()", C85990Xow.LIZIZ(), "this as java.lang.String).toLowerCase(locale)");
            C25860ACy c25860ACy = this.LLD;
            if (c25860ACy != null) {
                c25860ACy.LJIIJ(new AqS47S1200000_4(this, showCaseModel, LIZJ, 1));
            }
            String str4 = "no";
            if (showCaseModel.showEntrance) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                c188727au.LJIIIZ("page_name", "creator_tools");
                c188727au.LJIIIZ("author_id", ((RBX) HG3.LJIILL()).getCurUserId());
                c188727au.LJIIIZ("country", LIZJ);
                c188727au.LJIIIZ("module_for", "tiktok_showcase");
                if (!showCaseModel.havePermission) {
                    str2 = "no";
                } else {
                    str2 = "yes";
                }
                c188727au.LJIIIZ("is_onboard_ecom", str2);
                if (!C25750A8s.LIZ()) {
                    str3 = "no";
                } else {
                    str3 = "yes";
                }
                c188727au.LJIIIZ("enable_showcase", str3);
                FMX.LJIIL("tiktokec_creator_tools_module_show", c188727au.LIZ);
            }
            if (!showCaseModel.havePermission) {
                str = "no";
            } else {
                str = "yes";
            }
            String LIZJ2 = AnonymousClass028.LIZJ("getDefault()", C85990Xow.LIZIZ(), "this as java.lang.String).toLowerCase(locale)");
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            c188727au2.LJIIIZ("page_name", "creator_tools");
            c188727au2.LJIIIZ("author_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au2.LJIIIZ("country", LIZJ2);
            c188727au2.LJIIIZ("is_onboard_ecom", str);
            if (C25750A8s.LIZ()) {
                str4 = "yes";
            }
            c188727au2.LJIIIZ("enable_showcase", str4);
            FMX.LJIIL("tiktokec_creator_tools_show", c188727au2.LIZ);
            return;
        }
        C25860ACy c25860ACy2 = this.LLD;
        if (c25860ACy2 == null) {
            return;
        }
        c25860ACy2.LJIIJ(C25751A8t.LJLIL);
    }

    public final void LLILIL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onCreate", true);
        activityConfiguration(ADE.LJLIL);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setTheme(R.style.kp);
        setContentView(R.layout.cjz);
        LLIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C9NE c9ne) {
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
