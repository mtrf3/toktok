package com.ss.android.ugc.aweme.cct;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass008;
import X.C16880lQ;
import X.C1AT;
import X.C39020FTc;
import X.C58096Mr6;
import X.C58653N0f;
import X.C58675N1b;
import X.C58680N1g;
import X.C58681N1h;
import X.C58685N1l;
import X.C78983UzD;
import X.C84763XOl;
import X.N2H;
import X.X1D;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.cct.OpenNewCCTSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OpenCCTUtils implements IOpenCCTUtils {
    public String LIZ;
    public N2H LIZIZ;
    public AnonymousClass003 LIZJ;
    public long LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJJI;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public BrowserConfig LJIIZILJ;
    public String LJIJJ;
    public boolean LJIJJLI;
    public long LIZLLL = System.currentTimeMillis();
    public long LJ = System.currentTimeMillis();
    public long LJFF = System.currentTimeMillis();
    public String LJIIJ = "";
    public int LJIIL = 1;
    public String LJIJ = CardStruct.IStatusCode.DEFAULT;
    public String LJIJI = "";
    public boolean LJIL = true;

    public static IOpenCCTUtils LJFF() {
        Object LIZ = C58096Mr6.LIZ(IOpenCCTUtils.class, false);
        if (LIZ != null) {
            return (IOpenCCTUtils) LIZ;
        }
        if (C58096Mr6.LLJJL == null) {
            synchronized (IOpenCCTUtils.class) {
                if (C58096Mr6.LLJJL == null) {
                    C58096Mr6.LLJJL = new OpenCCTUtils();
                }
            }
        }
        return C58096Mr6.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final boolean LIZLLL(Aweme aweme) {
        String str;
        BrowserConfig browserConfig;
        String str2;
        BrowserConfig browserConfig2;
        Long l;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        StringBuilder LIZ = X1D.LIZ();
        String str3 = null;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd2.getWebUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("   ");
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            browserConfig = awemeRawAd.getBrowserConfig();
        } else {
            browserConfig = null;
        }
        LIZ.append(browserConfig);
        X1D.LIZIZ(LIZ);
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            str2 = awemeRawAd3.getWebUrl();
        } else {
            str2 = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            browserConfig2 = awemeRawAd4.getBrowserConfig();
        } else {
            browserConfig2 = null;
        }
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null) {
            l = awemeRawAd5.getCreativeId();
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
        if (awemeRawAd6 != null) {
            str3 = awemeRawAd6.getLogExtra();
        }
        return LIZIZ(str2, browserConfig2, valueOf, str3);
    }

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            N2H n2h = this.LIZIZ;
            if (n2h != null) {
                if (this.LJIILLIIL) {
                    context.unbindService(n2h);
                    this.LJIILLIIL = false;
                }
                this.LIZJ = null;
            }
        } catch (Exception unused) {
            C78983UzD.LJIILL("cct_unbindCustomTabsService");
        }
    }

    public final void LJI(Context context, String str) {
        AnonymousClass008 LIZIZ;
        int i;
        int i2;
        int i3;
        int i4;
        try {
            AnonymousClass003 anonymousClass003 = this.LIZJ;
            if (anonymousClass003 == null) {
                LIZIZ = null;
            } else {
                LIZIZ = anonymousClass003.LIZIZ(new C58675N1b(this));
            }
            AnonymousClass004 anonymousClass004 = new AnonymousClass004(LIZIZ);
            if (this.LJIL) {
                i = R.anim.fv;
                i2 = R.anim.g0;
            } else {
                i = R.anim.fq;
                i2 = R.anim.g4;
            }
            anonymousClass004.LIZJ = new C1AT(ActivityOptions.makeCustomAnimation(context, i, i2)).LIZLLL();
            if (this.LJIL) {
                i3 = R.anim.ft;
                i4 = R.anim.g2;
            } else {
                i3 = R.anim.fx;
                i4 = R.anim.fy;
            }
            anonymousClass004.LIZ.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", new C1AT(ActivityOptions.makeCustomAnimation(context, i3, i4)).LIZLLL());
            anonymousClass004.LIZ().LIZ(context, UriProtector.parse(str));
        } catch (Exception unused) {
            C78983UzD.LJIILL("cct_customTabsIntent_launchUrl");
            try {
                OpenNewCCTSettings.CCTModel cCTModel = (OpenNewCCTSettings.CCTModel) SettingsManager.LIZLLL().LJIIIIZZ("open_new_cct_settings", OpenNewCCTSettings.CCTModel.class, OpenNewCCTSettings.LIZ);
                if (cCTModel != null) {
                    if (cCTModel.getFallbackBrowser()) {
                        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
                        if (intent.resolveActivity(context.getPackageManager()) != null) {
                            if (!(context instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            try {
                                intent.putExtra("pns.sandbox.dataflow_id", 1207967489);
                                C16880lQ.LIZJ(context, intent);
                                AdACTEventLoger adACTEventLoger = new AdACTEventLoger(new Object[]{new AdCCTLogModel(this.LJIJJ, this.LJIJI, this.LJIJJLI)});
                                C58685N1l.LIZ.getClass();
                                C58653N0f c58653N0f = C58685N1l.LJIJI;
                                String str2 = this.LJIILIIL;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                adACTEventLoger.LIZJ(c58653N0f, str2, this.LJIILJJIL, null, C58680N1g.LJLIL);
                            } catch (Exception unused2) {
                                C78983UzD.LJIILL("cct_no_browser");
                            }
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r12 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r12 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r12 != null) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.content.Context r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            r2 = r11
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            r1 = r10
            boolean r0 = r1.LIZLLL(r12)
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r6 = 0
            if (r12 == 0) goto L48
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto L48
            java.lang.String r3 = r0.getWebUrl()
        L1c:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.BrowserConfig r4 = r0.getBrowserConfig()
        L26:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto L50
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 == 0) goto L50
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L36:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto L40
            java.lang.String r6 = r0.getLogExtra()
        L40:
            r8 = 0
            r9 = 1
            r7 = r13
            boolean r0 = r1.LIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L48:
            r3 = r6
            if (r12 == 0) goto L4c
            goto L1c
        L4c:
            r4 = r6
            if (r12 == 0) goto L50
            goto L26
        L50:
            r5 = r6
            if (r12 == 0) goto L40
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cct.OpenCCTUtils.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):boolean");
    }

    public final boolean LJII(String str, BrowserConfig browserConfig, String str2) {
        Integer useAndroidCustomTab;
        if (str == null || str.length() == 0 || TextUtils.isEmpty(str) || browserConfig == null || (useAndroidCustomTab = browserConfig.getUseAndroidCustomTab()) == null || useAndroidCustomTab.intValue() != 1) {
            return false;
        }
        Long actInternalTime = browserConfig.getActInternalTime();
        if (actInternalTime != null) {
            long longValue = actInternalTime.longValue();
            if (longValue > 0 && (Keva.getRepo("chrome_custom_tab_repo").getLong("openCCTLastTime", 0L) + longValue > System.currentTimeMillis() || o.LJ(this.LJIJ, str2))) {
                return false;
            }
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return false;
        }
        if (!TextUtils.isEmpty(C39020FTc.LIZIZ(LJIIIIZZ, str))) {
            return true;
        }
        if (!Keva.getRepo("chrome_custom_tab_repo").getBoolean("hadLogNoCCT", false)) {
            AdACTEventLoger adACTEventLoger = new AdACTEventLoger(new Object[]{new AdCCTLogModel(this.LJIJJ, this.LJIJI, this.LJIJJLI)});
            C58685N1l.LIZ.getClass();
            C58653N0f c58653N0f = C58685N1l.LJIJJ;
            String str3 = this.LJIILIIL;
            if (str3 == null) {
                str3 = "";
            }
            adACTEventLoger.LIZJ(c58653N0f, str3, this.LJIILJJIL, null, C58681N1h.LJLIL);
            Keva.getRepo("chrome_custom_tab_repo").storeBoolean("hadLogNoCCT", true);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final boolean LIZIZ(String str, BrowserConfig browserConfig, String str2, String str3) {
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        this.LJIILIIL = str2;
        this.LJIILJJIL = str3;
        return LJII(str, browserConfig, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r22, java.lang.String r23, com.ss.android.ugc.aweme.feed.model.BrowserConfig r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cct.OpenCCTUtils.LIZ(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.feed.model.BrowserConfig, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
