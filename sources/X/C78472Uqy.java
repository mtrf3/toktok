package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.wallet.WalletConfig;

/* renamed from: X.Uqy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78472Uqy {
    public static WalletConfig LIZ;

    public static boolean LIZLLL() {
        if (LiveOuterService.LJJJLL() != null) {
            return true;
        }
        return false;
    }

    public static String LIZ(String str) {
        String str2;
        String str3;
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
        if (queryParameter == null) {
            return str;
        }
        WalletCenter walletCenter = (WalletCenter) LiveOuterService.LJJJLL().LJJIJIL().LJJLI().walletCenter();
        String str4 = "1";
        if (walletCenter.LJLJJI.hasIncomeBefore) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (!walletCenter.LJIIIZ()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        if (walletCenter.LJIIIIZZ()) {
            str3 = "setting_panel";
        } else {
            str3 = "settings_privacy";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("&display_balance=");
        LIZ2.append(str4);
        String concat = queryParameter.concat(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("&entrance=");
        LIZ3.append(str3);
        String concat2 = concat.concat(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("&has_income_before=");
        LIZ4.append(str2);
        String concat3 = concat2.concat(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("&total_balance=");
        LIZ5.append(walletCenter.LIZLLL());
        return str.replace(android.net.Uri.encode(queryParameter), android.net.Uri.encode(concat3.concat(X1D.LIZIZ(LIZ5))));
    }

    public static void LIZIZ(Activity activity) {
        if (LiveOuterService.LJJJLL() != null) {
            LiveOuterService.LJJJLL().LJJJJI(activity, "page_index");
        }
    }

    public static void LIZJ(WalletConfig walletConfig) {
        if (walletConfig == null) {
            return;
        }
        LIZ = walletConfig;
        SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
        edit.putString("page_charge", walletConfig.pageChargeUrl);
        edit.putString("page_index", walletConfig.pageIndexUrl);
    }
}
