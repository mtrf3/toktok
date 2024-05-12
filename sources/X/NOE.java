package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NOE extends NO5 {
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LJJII(Context context, Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return LJJIII(context, aweme.getAwemeRawAd().getWebUrl());
    }

    public static boolean LJJIII(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String path = UriProtector.parse(str).getPath();
        if (TextUtils.isEmpty(path) || !path.endsWith(".apk")) {
            return false;
        }
        String string = context.getString(R.string.bke);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C31811Ce7.LIZIZ(LJIJJ, string);
            return true;
        }
        return true;
    }

    public static boolean LJJIIJZLJL(Context context, Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (C63081OpJ.LLJJ(aweme)) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                AnonymousClass114.LIZ(LJIJJ, R.string.b95);
                return true;
            }
            return true;
        }
        return LJJIIZ(context, aweme.getAwemeRawAd().getPackageName(), aweme.getAwemeRawAd().getClickId());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x012f, code lost:
    
        if (r13.equals("counsel") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0138, code lost:
    
        if (r13.equals("redpacket") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        if (r0 != 5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02b8, code lost:
    
        r0 = com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl.LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02bc, code lost:
    
        if (r0 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02be, code lost:
    
        r0.LIZJ().LJJIJ(r16, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02c9, code lost:
    
        if (r17.isAd() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02d7, code lost:
    
        if (X.NO5.LJIIIIZZ(0, r16, r17, r17.getAwemeRawAd().getRedOpenUrl()) != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02d9, code lost:
    
        if (r16 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02db, code lost:
    
        X.NO5.LJIIJJI(9, r16, r17, r17.getAwemeRawAd().getRedUrl(), null, X.C78939UyV.LJJIZ(r17.getAwemeRawAd()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f7, code lost:
    
        if (r17.getAwemeRawAd() != null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02fa, code lost:
    
        r2 = r17.getAwemeRawAd().getRedMpUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0306, code lost:
    
        if (X.C56209M4f.LIZ(r2) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0309, code lost:
    
        X.C38499F9b.LIZ.LIZIZ().openMiniApp(r16, r2, new X.C227898wz());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02f2, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x00f7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJI(android.content.Context r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, int r18) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOE.LJJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    public static void LJJIFFI(Context context, Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (LJII != null) {
            LJII.LIZJ().LJJIJ(context, aweme, i);
        }
        if (i == 2 && C52213KeP.LIZ()) {
            String openUrl = aweme.getAwemeRawAd().getOpenUrl();
            if (context == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
                return;
            }
            NOA LIZ = NOU.LIZ(context, awemeRawAd);
            Bundle bundle = new Bundle();
            bundle.putString("open_url", openUrl);
            boolean z = false;
            LIZ.LIZJ(0, bundle);
            LIZ.LIZJ(1, NOU.LIZLLL(openUrl, aweme));
            LIZ.LIZJ(6, NOU.LIZIZ(i, aweme));
            Bundle bundle2 = new Bundle();
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                if (awemeRawAd2.getSplashInfo() != null && !TextUtils.isEmpty(awemeRawAd2.getSplashInfo().getAwesomeSplashId())) {
                    z = true;
                }
                bundle2.putBoolean("is_awesome_splash_ad", z);
                bundle2.putString("ad_type", awemeRawAd2.getType());
                bundle2.putString("aweme_package_name", awemeRawAd2.getPackageName());
            }
            LIZ.LIZJ(9, bundle2);
            LIZ.LIZIZ();
            return;
        }
        if ((C63081OpJ.LJJL(aweme) && NO5.LJIIIZ(context, aweme)) || C55447LpT.LIZ(context, aweme)) {
            return;
        }
        if (C63081OpJ.LLJILJILJ(aweme) && NO5.LJIIL(context, i)) {
            return;
        }
        LJJIIJZLJL(context, aweme);
    }

    public static boolean LJJIIZ(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!NP8.LIZ(context)) {
            return M53.LIZ(context, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("market://details?id=");
        LIZ.append(str);
        Uri.Builder buildUpon = UriProtector.parse(X1D.LIZIZ(LIZ)).buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("referrer", str2);
        }
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        return NO5.LJIL(context, intent);
    }

    public static boolean LJJIIJ(final Context context, final Aweme aweme, final int i, final C74R c74r) {
        User author;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        if (context == null || aweme == null) {
            return false;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            context = LJIJJ;
        }
        EcUgVSAService.LJIIJJI().LJIIJ(context, aweme, i);
        if (i == 2 && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && photoCarouselInfo.getEnableMultiCTAJump()) {
            IAdPhotoModeService LIZ = AdPhotoModeServiceImpl.LIZ();
            if (LIZ == null) {
                return false;
            }
            int e1 = LIZ.e1();
            NN1.LJJIII(context, aweme, "button");
            if (!LIZ.p1(e1, aweme, context) && ((!C63081OpJ.LJJLIIIJLLLLLLLZ(aweme) || !LJJIIJZLJL(context, aweme)) && !LIZ.l1(e1, aweme, context))) {
                return false;
            }
            return true;
        }
        if (AM0.LIZ(context, aweme, i, new InterfaceC59418NTq() { // from class: X.NOF
            @Override // X.InterfaceC59418NTq
            public final void LIZ() {
                NOE.LJJI(context, aweme, i);
            }
        })) {
            return true;
        }
        if (!C63081OpJ.LJLJJLL(aweme) && (!aweme.isAd() || !C1DF.LJIL(aweme) || (author = aweme.getAuthor()) == null || !author.isLive())) {
            return LJJI(context, aweme, i);
        }
        C59406NTe.LJIIIZ(context, aweme, i, null);
        return false;
    }
}
