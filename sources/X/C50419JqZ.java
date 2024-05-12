package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JqZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50419JqZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        int LIZ2 = C00F.LIZ(31744, 0, "follow_feed_type", true);
        if ((LIZ2 == 0 || LIZ2 < 0 || LIZ2 > 2 || 2 != LIZ2 || !TextUtils.equals(str, "from_follow_tab")) && !TextUtils.equals("from_nearby", str) && !TextUtils.equals("from_search", str) && !TextUtils.equals("from_search_similar_aweme", str) && !C79043V0l.LJJII(str)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() != 502 && aweme.getAwemeType() != 501) {
            return false;
        }
        return true;
    }

    public static void LIZJ(Aweme aweme, String str, int i, String str2, long j, boolean z, int i2, M89 m89) {
        String str3;
        if (aweme == null) {
            return;
        }
        if (LIZ(str) || TextUtils.equals("from_search_jedi", str) || TextUtils.equals("potential_friends", str) || TextUtils.equals("from_no_request", str) || TextUtils.equals("from_commerce_seed", str) || TextUtils.equals("from_commerce_bill_share", str) || TextUtils.equals("from_anchor_video", str) || TextUtils.equals("from_profile_self", str) || TextUtils.equals("from_profile_other", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_visual_search_result", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_channel", str) || TextUtils.equals("from_search_commodity", str) || TextUtils.equals("from_mix_detail", str) || TextUtils.equals("from_trending_inflow", str) || TextUtils.equals("from_search_live", str) || TextUtils.equals("from_follow_often_watch", str) || TextUtils.equals("from_search_continuous_loading_card", str)) {
            C50420Jqa c50420Jqa = new C50420Jqa(21, aweme);
            c50420Jqa.LJLJJI = str;
            c50420Jqa.LJLJL = i;
            c50420Jqa.LJLLI = z;
            if (C79043V0l.LJJII(str)) {
                c50420Jqa.LJLJLLL = IWF.LJJLIIIIJ().getCurrentPosition();
                c50420Jqa.LJLL = IWF.LJJLIIIIJ().isPlaying();
                c50420Jqa.LJLJJL = str2;
            }
            c50420Jqa.LJLJJLL = j;
            c50420Jqa.LJLJLJ = i2;
            Bundle bundle = new Bundle();
            if (m89 != null) {
                str3 = m89.getSearchType();
            } else {
                str3 = null;
            }
            bundle.putString("key_search_type", str3);
            c50420Jqa.LJLJI = bundle;
            C2U8.LIZ(c50420Jqa);
        }
    }
}
