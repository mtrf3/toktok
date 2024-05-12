package X;

import Y.ACallableS110S0100000_7;
import Y.AgS127S0100000_10;
import Y.IDCListenerS47S0200000_3;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public abstract class NO5 {
    public static final String[] LIZ = {"webcast_room"};

    public static boolean LIZLLL(int i) {
        return i == 11 || i == 14 || i == 12 || i == 13 || i == 15 || i == 20 || i == 19 || i == 21;
    }

    public static boolean LJ(android.net.Uri uri) {
        if (uri != null && (TextUtils.equals("http", uri.getScheme()) || TextUtils.equals("https", uri.getScheme()))) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(String str) {
        android.net.Uri parse;
        if (str == null) {
            return false;
        }
        try {
            parse = UriProtector.parse(str);
        } catch (Throwable unused) {
        }
        if (parse == null) {
            return false;
        }
        for (String str2 : LIZ) {
            if (TextUtils.equals(str2, parse.getHost())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILL(X.NOD r7) {
        /*
            android.content.Context r0 = r7.LIZ
            r5 = 0
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.LIZIZ
            if (r0 != 0) goto La
        L9:
            return r5
        La:
            java.lang.String r0 = r7.LJII
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.NPC.LIZJ(r0)
            r7.LJIIIIZZ = r0
            int r1 = r7.LIZLLL
            r0 = 7
            r2 = 1
            if (r1 == r0) goto L1c
            r0 = 8
            if (r1 != r0) goto L23
        L1c:
            boolean r0 = LJIILLIIL(r7, r5)
            if (r0 == 0) goto L23
            return r2
        L23:
            android.content.Context r0 = r7.LIZ
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r7.LIZIZ
            if (r3 != 0) goto L2c
            goto L9
        L2c:
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            java.lang.String r1 = r7.LJFF
            int r0 = r3.getWebviewType()
            if (r0 == r2) goto L39
            goto L9
        L39:
            java.lang.String r6 = "1"
            if (r1 != 0) goto L45
            java.lang.String r1 = r3.getWebUrl()
            if (r1 != 0) goto L45
            java.lang.String r1 = ""
        L45:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r0 = "parse(url ?: (awemeRawAd.webUrl ?: \"\"))"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "immersive_mode"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.UnsupportedOperationException -> L7f
            java.lang.Boolean r3 = r3.getUseOrdinaryWeb_()     // Catch: java.lang.UnsupportedOperationException -> L7f
            java.lang.String r0 = "topbar_type"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.UnsupportedOperationException -> L7f
            boolean r0 = android.text.TextUtils.equals(r1, r6)     // Catch: java.lang.UnsupportedOperationException -> L7f
            if (r0 == 0) goto L65
            goto L9
        L65:
            if (r1 == 0) goto L6f
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.UnsupportedOperationException -> L7f
            if (r0 == 0) goto L83
        L6f:
            if (r4 == 0) goto L78
            boolean r0 = android.text.TextUtils.equals(r4, r6)     // Catch: java.lang.UnsupportedOperationException -> L7f
            if (r0 != 0) goto L9
            goto L83
        L78:
            boolean r0 = r3.booleanValue()     // Catch: java.lang.UnsupportedOperationException -> L7f
            if (r0 != 0) goto L83
            goto L9
        L7f:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L83:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJIIIIZZ
            boolean r0 = X.C63081OpJ.LJJLIIIJJIZ(r0)
            if (r0 == 0) goto L9
            boolean r0 = X.C52471KiZ.LIZ()
            if (r0 == 0) goto La7
            int r1 = r7.LIZLLL
            r0 = 69
            if (r1 == r0) goto La7
            X.JHI r1 = X.JHI.LIZ()
            int r0 = r7.LIZLLL
            r1.LJIIIIZZ = r0
            android.content.Context r1 = r7.LIZ
            java.lang.String r0 = "click_ad_web"
            X.C224488rU.LIZIZ(r1, r0)
        La6:
            return r2
        La7:
            X.NO8 r1 = new X.NO8
            X.NOJ r0 = r7.LIZIZ()
            r1.<init>(r0)
            X.C2U8.LIZ(r1)
            X.6sv r0 = new X.6sv
            r0.<init>(r2)
            X.C2U8.LIZ(r0)
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NO5.LJIILL(X.NOD):boolean");
    }

    public static void LJIJI(N2X n2x) {
        C10K.LJII(5000L).LIZLLL(new AgS127S0100000_10(n2x, 2));
    }

    public static void LJIJJ(N2X n2x) {
        C10K.LJII(((Number) C33955DUh.LIZ.getValue()).intValue() * 1000).LIZLLL(new AgS127S0100000_10(n2x, 3));
    }

    public static void LIZIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        boolean z;
        boolean z2;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        if (awemeRawAd.getSplashInfo().isEnableSplashOpen()) {
            if (!LJIIIZ(context, aweme)) {
                IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
                if (LIZLLL == null || !LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.miniapp") || !C55447LpT.LIZ(context, aweme)) {
                    if (aweme == null || (aweme.isAd() && C78939UyV.LJJIZ(aweme.getAwemeRawAd()))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    NOP.LIZLLL(context, aweme, null, null, z2, 7, Boolean.TRUE, 61);
                    return;
                }
                return;
            }
            return;
        }
        if (aweme == null || (aweme.isAd() && C78939UyV.LJJIZ(aweme.getAwemeRawAd()))) {
            z = true;
        } else {
            z = false;
        }
        NOP.LIZLLL(context, aweme, null, null, z, 7, Boolean.TRUE, 61);
    }

    public static boolean LJIIIZ(Context context, Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return LJIIIIZZ(0, context, aweme, aweme.getAwemeRawAd().getOpenUrl());
    }

    public static boolean LJIIL(Context context, int i) {
        String LIZIZ = NV9.LIZIZ(i);
        if (context instanceof Activity) {
            Activity activity = C45804HyK.LJIJJ(context);
            o.LJIIIZ(activity, "activity");
            FrameLayout LIZ2 = C59242NMw.LIZ(activity);
            NVB nvb = null;
            if (LIZ2 != null) {
                nvb = (NVB) LIZ2.findViewById(R.id.sk);
            }
            if ((nvb instanceof NVB) && nvb != null && nvb.getMBottomSheet().LLFZ.getState() != 3) {
                FrameLayout LIZ3 = C59242NMw.LIZ(activity);
                if (LIZ3 != null) {
                    LIZ3.setVisibility(0);
                }
                nvb.LJFF(Boolean.FALSE, LIZIZ);
                C2U8.LIZ(new C174416sv(1));
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILLIIL(NOD nod, boolean z) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Activity LJIJJ;
        Reference reference;
        Runnable runnable;
        if (nod.LIZ != null && nod.LIZIZ != null) {
            String sessionId = UUID.randomUUID().toString();
            o.LJIIIZ(sessionId, "sessionId");
            nod.LJIIJJI = sessionId;
            nod.LIZLLL = 8;
            nod.LJIIIZ = z;
            if ((nod.LIZ instanceof Activity) && (aweme = nod.LJIIIIZZ) != null && (C63081OpJ.LLJLIL(aweme) || C63081OpJ.LLJL(aweme) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1))) {
                NOJ LIZIZ = nod.LIZIZ();
                Context context = LIZIZ.LIZ;
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                    String str = LIZIZ.LJII;
                    if (str != null && (reference = (Reference) ((HashMap) AdProfilePopUpWebPageWidget.LJZ).get(str)) != null && (runnable = (Runnable) reference.get()) != null) {
                        runnable.run();
                    }
                    NWF LIZ2 = NO7.LIZ(LJIJJ);
                    if (LIZ2 != null && !LIZ2.LJIIJJI()) {
                        FrameLayout LIZIZ2 = NO7.LIZIZ(LJIJJ);
                        if (LIZIZ2 != null) {
                            LIZIZ2.setVisibility(0);
                        }
                        LIZ2.setShouldStartAnimation(LIZIZ.LJIIIZ);
                        LIZ2.getActionMode().LJIIIIZZ = LIZIZ.LIZLLL;
                        LIZ2.LJIIIIZZ(new AqS157S0200000_10(LIZIZ, LIZ2, 6));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJ(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        intent.putExtra("pns.sandbox.dataflow_id", 1207964162);
        return LJIL(context, Intent.createChooser(intent, ""));
    }

    public static void LJIJJLI(final Context context, final Aweme aweme) {
        C62905OmT c62905OmT = new C62905OmT(context);
        c62905OmT.LIZ(R.string.b99);
        c62905OmT.LJIIJJI(R.string.dsg, new DialogInterface.OnClickListener() { // from class: X.8tL
            public final /* synthetic */ String LJLJI = "slide";

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Context context2 = context;
                Aweme aweme2 = aweme;
                String str = this.LJLJI;
                NO5.LJIIIZ(context2, aweme2);
                NN1.LJJJJI(context2, "click_open_url_window_confirm", aweme2, NN1.LJIIIZ(context2, aweme2));
                C58704N2e.LIZLLL("draw_ad", "click_open_url_window_confirm", aweme2.getAwemeRawAd()).LJII();
                NN1.LJJIII(context2, aweme2, str);
                dialogInterface.dismiss();
            }
        }, false);
        c62905OmT.LJIIIIZZ(R.string.cg_, new IDCListenerS47S0200000_3(context, aweme, 1), false);
        new C62906OmU(c62905OmT).LIZLLL();
        NN1.LJJJJI(context, "open_url_window_show", aweme, NN1.LJIIIZ(context, aweme));
        C58704N2e.LIZLLL("draw_ad", "open_url_window_show", aweme.getAwemeRawAd()).LJII();
    }

    public static boolean LJIL(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                C16880lQ.LIZJ(context, intent);
                return true;
            } catch (ActivityNotFoundException | SecurityException unused) {
            }
        }
        return false;
    }

    public static boolean LJJ(Context context, Aweme aweme) {
        if (context == null || C63081OpJ.LJL(aweme)) {
            return false;
        }
        String LIZ2 = NNT.LIZ(Integer.valueOf(JHI.LIZ().LJIIIIZZ));
        if (TextUtils.isEmpty(LIZ2)) {
            LIZ2 = JHI.LIZ().LJIIIZ;
        }
        if (OpenCCTUtils.LJFF().LIZLLL(aweme)) {
            return OpenCCTUtils.LJFF().LIZJ(context, aweme, LIZ2);
        }
        if (aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isOpenSystemBrowser()) {
            return false;
        }
        N1E LIZLLL = AdWebLogService.LJFF().LIZLLL();
        boolean LIZ3 = AdWebLogService.LJFF().LIZ();
        if (LIZLLL != null) {
            LIZLLL.LIZIZ(aweme.getAwemeRawAd().getCreativeIdStr(), aweme.getAwemeRawAd().getLogExtra(), LIZ2, aweme.getAwemeRawAd().getWebUrl());
        }
        if (!LIZ3) {
            C84763XOl.LJI().LJJJJZI(new C59661NbF(1, LIZLLL, aweme));
        }
        return LJIJ(context, aweme.getAwemeRawAd().getWebUrl());
    }

    public static void LIZ(C58655N0h c58655N0h, Aweme aweme, int i) {
        Integer num;
        String str = c58655N0h.LIZ;
        if (str != null && str.startsWith("result")) {
            String str2 = null;
            if (aweme.isSearchPreciseAd()) {
                num = 1;
            } else {
                num = null;
            }
            c58655N0h.LIZIZ(num, "precise_ads");
            if (i == 53) {
                str2 = "button";
            } else if (i == 54) {
                str2 = "bg_more_button";
            }
            c58655N0h.LIZJ(str2, "refer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r9 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(final android.content.Context r17, final com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NO5.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x004e, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(android.content.Context r5, java.lang.String r6, boolean r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r0 == 0) goto L8
            return r2
        L8:
            boolean r0 = X.C56209M4f.LIZ(r6)
            r4 = 1
            if (r0 == 0) goto L1f
        L10:
            X.OBC r0 = X.C38499F9b.LIZ
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r0.LIZIZ()
            X.8wz r0 = new X.8wz
            r0.<init>()
            r1.openMiniApp(r5, r6, r0)
            return r4
        L1f:
            java.lang.String r1 = "__back_url__"
            boolean r0 = r6.contains(r1)
            if (r0 == 0) goto L31
            java.lang.String r0 = X.NO2.LIZ
            java.lang.String r0 = android.net.Uri.encode(r0)
            java.lang.String r6 = r6.replace(r1, r0)
        L31:
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            java.lang.String r1 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L40
            return r2
        L40:
            java.lang.String r0 = "aweme/detaillist"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L5d
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L50
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L50
            if (r0 != 0) goto L5d
        L50:
            android.app.Activity r1 = X.C45804HyK.LJIJJ(r5)
            if (r1 == 0) goto L5c
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            X.AnonymousClass114.LIZ(r1, r0)
        L5c:
            return r2
        L5d:
            boolean r0 = X.NPC.LJ(r1)
            if (r0 == 0) goto L6b
            X.C224488rU.LIZJ(r6)
            r0 = 0
            X.C57422MgE.LIZIZ(r5, r6, r0, r2)
            return r4
        L6b:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L81
            java.lang.String r0 = "aweme://"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L81
            X.O0e r0 = X.C61200O0e.LIZLLL()
            r0.LJII(r6)
            return r4
        L81:
            if (r7 == 0) goto L84
            return r2
        L84:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto La6
            java.lang.String r0 = "mailto:"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto La6
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.SENDTO"
            r2.<init>(r0, r3)
            java.lang.String r1 = "pns.sandbox.dataflow_id"
            r0 = 1207964163(0x48001203, float:131144.05)
            r2.putExtra(r1, r0)
            boolean r0 = LJIL(r5, r2)
            return r0
        La6:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            r1.setData(r3)
            boolean r0 = X.FCD.LJ(r5, r1)
            if (r0 != 0) goto Lb7
            return r2
        Lb7:
            java.lang.String r0 = "open_url"
            r1.putExtra(r0, r6)
            boolean r0 = LJIL(r5, r1)
            if (r0 != 0) goto Lc3
            return r2
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NO5.LJI(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean LJII(Context context, String str, String str2) {
        return NOP.LIZJ(context, str, str2, false, null, true, null, 0);
    }

    public static boolean LJIILJJIL(Context context, Aweme aweme, int i) {
        if (context == null || aweme == null || NPC.LJII(context)) {
            return false;
        }
        String sessionId = UUID.randomUUID().toString();
        NOD nod = new NOD();
        nod.LIZ = context;
        nod.LIZIZ = aweme.getAwemeRawAd();
        nod.LIZLLL = i;
        o.LJIIIZ(sessionId, "sessionId");
        nod.LJIIJJI = sessionId;
        nod.LIZ(aweme.getAid());
        return LJIILL(nod);
    }

    public static void LJIIZILJ(Context context, Aweme aweme, int i) {
        boolean z;
        boolean z2;
        if (i == 53) {
            if (aweme == null || (aweme.isAd() && C78939UyV.LJJIZ(aweme.getAwemeRawAd()))) {
                z2 = true;
            } else {
                z2 = false;
            }
            NOP.LIZLLL(context, aweme, null, null, z2, 5, Boolean.FALSE, Integer.valueOf(i));
            return;
        }
        if (i == 54) {
            if (aweme == null || (aweme.isAd() && C78939UyV.LJJIZ(aweme.getAwemeRawAd()))) {
                z = true;
            } else {
                z = false;
            }
            NOP.LIZLLL(context, aweme, null, null, z, 8, Boolean.FALSE, Integer.valueOf(i));
            return;
        }
        if ((i != 56 && i != 55) || aweme.getAwemeRawAd() == null) {
            return;
        }
        LJII(context, aweme.getAwemeRawAd().getWebUrl(), aweme.getAwemeRawAd().getWebTitle());
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0206 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(final int r12, final android.content.Context r13, final com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NO5.LJIIIIZZ(int, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):boolean");
    }

    public static boolean LJIIJ(int i, Context context, Aweme aweme, String str) {
        boolean z;
        if (aweme == null || (aweme.isAd() && C78939UyV.LJJIZ(aweme.getAwemeRawAd()))) {
            z = true;
        } else {
            z = false;
        }
        return LJIIJJI(i, context, aweme, str, null, z);
    }

    public static void LJIILIIL(Context context, LinkData linkData, Aweme aweme, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (context == null || linkData == null) {
            return;
        }
        if (LJFF(linkData.openUrl) && aweme.getAwemeRawAd() != null) {
            linkData.openUrl = UriProtector.parse(linkData.openUrl).buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build().toString();
        }
        if (aweme == null) {
            return;
        }
        String str7 = linkData.creativeId;
        o.LJIIIIZZ(str7, "link.creativeId");
        String str8 = linkData.logExtra;
        long j = 0;
        try {
            if (CastLongProtector.parseLong(str7) > 0) {
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            Boolean enableAdRouter = C2YJ.LIZIZ.LIZ.getEnableAdRouter();
            o.LJIIIIZZ(enableAdRouter, "get().enableAdRouter");
            z2 = enableAdRouter.booleanValue();
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            z2 = false;
        }
        String str9 = null;
        if (z2) {
            NNS nns = new NNS();
            nns.LJIIIIZZ(linkData.openUrl);
            String str10 = linkData.mpUrl;
            N5R n5r = nns.LIZ.LIZLLL;
            if (str10 == null) {
                str10 = "";
            }
            n5r.getClass();
            n5r.LIZ = str10;
            C56209M4f.LIZ(linkData.openUrl);
            nns.LIZ.LIZLLL.LIZIZ = new C227898wz();
            nns.LJIIL(linkData.webUrl);
            nns.LJIIJJI(linkData.webTitle);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || (str5 = awemeRawAd.getDownloadUrl()) == null) {
                str5 = linkData.downloadUrl;
            }
            nns.LIZLLL(str5);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || (str6 = awemeRawAd2.getPackageName()) == null) {
                str6 = linkData.packageName;
            }
            nns.LJIIIZ(str6);
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str9 = awemeRawAd3.getAppName();
            }
            nns.LIZ(str9);
            nns.LIZIZ(aweme.getAwemeRawAd());
            try {
                nns.LIZ.LIZ.LIZJ = CastLongProtector.parseLong(str7);
            } catch (Exception e3) {
                C78983UzD.LJIIZILJ(e3);
            }
            nns.LJFF(str8);
            nns.LIZ.LIZ.LJIIIIZZ = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            NNR nnr = nns.LIZ;
            nnr.LIZ.LJIIIZ = authorUid;
            NNE nne = new NNE();
            NNF nnf = nne.LIZ;
            nnf.getClass();
            nnf.LIZ = context;
            nne.LIZIZ(nnr);
            nne.LIZ(new NNI());
            nne.LIZ(new C58779N5b(context, linkData, aweme, z));
            nne.LIZ(new NO6(context, linkData, aweme, z));
            nne.LIZ(new C59250NNe());
            nne.LIZ(new C59243NMx(context, linkData, aweme, z));
            nne.LIZ.LIZ();
            return;
        }
        String str11 = linkData.openUrl;
        if (!TextUtils.isEmpty(str11) && C56209M4f.LIZ(str11)) {
            String LJFF = i0.LJFF(str11, "&schema_from=ad_link");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJFF);
            if (z) {
                str4 = "&position=comment_page";
            } else {
                str4 = "&position=in_video_tag";
            }
            LIZ2.append(str4);
            str11 = X1D.LIZIZ(LIZ2);
        }
        if (str11 != null) {
            z3 = s.LJJJLZIJ(str11, "__back_url__", false);
        } else {
            z3 = false;
        }
        if (z3) {
            if (linkData.feedShowType == 3) {
                str3 = "comment_ad";
            } else {
                str3 = "draw_ad";
            }
            String builder = UriProtector.parse(NO2.LIZ).buildUpon().appendQueryParameter("tag", str3).toString();
            o.LJIIIIZZ(builder, "parse(CommercializeConst…              .toString()");
            if (str11 != null && s.LJJJLZIJ(str11, "__back_url__", false)) {
                if (str11 != null) {
                    String encode = android.net.Uri.encode(builder);
                    o.LJIIIIZZ(encode, "encode(backUrl)");
                    str11 = ujb.o.LJJJJZ(str11, "__back_url__", encode, false);
                } else {
                    str11 = null;
                }
            }
            C10K.LIZJ(new ACallableS110S0100000_7(aweme, 63));
        }
        if (LJI(context, str11, false)) {
            NN1.LJIJJ("open_url_app", context, linkData, aweme, z);
            LJIJI(new N5Z(context, linkData, aweme, z));
            return;
        }
        if (C56209M4f.LIZ(linkData.mpUrl) && C38499F9b.LIZ.LIZIZ().openMiniApp(context, linkData.mpUrl, new C227898wz())) {
            return;
        }
        if (TextUtils.equals(linkData.type, "app")) {
            NN1.LJIJJ("open_url_app", context, linkData, aweme, z);
            NOE.LJJIIZ(context, linkData.packageName, null);
            return;
        }
        try {
            j = CastLongProtector.parseLong(str7);
        } catch (Exception unused) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                str = awemeRawAd4.getDownloadUrl();
            } else {
                str = null;
            }
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 != null) {
                str2 = awemeRawAd5.getPackageName();
            } else {
                str2 = null;
            }
            AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
            if (awemeRawAd6 != null) {
                str9 = awemeRawAd6.getAppName();
            }
        } else if (linkData.feedShowType == 3) {
            str = linkData.downloadUrl;
            str2 = linkData.packageName;
            linkedHashMap.put("aweme_package_name", str2);
            linkedHashMap.put("bundle_app_ad_from", "6");
        } else {
            str = null;
            str2 = null;
        }
        if (!NOP.LIZJ(context, linkData.webUrl, linkData.webTitle, false, linkedHashMap, true, new C59272NOa(Long.valueOf(j), str8, str, str2, str9, linkData.type, 192), 0)) {
            return;
        }
        NN1.LJIJJ("open_url_h5", context, linkData, aweme, z);
    }

    public static boolean LJIIJJI(int i, Context context, Aweme aweme, String str, String str2, boolean z) {
        return NOP.LIZLLL(context, aweme, str, str2, z, 1, Boolean.FALSE, Integer.valueOf(i));
    }
}
