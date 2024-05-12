package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.newuser.WeakNetCountryGeckoNormalOptSettings;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;

/* renamed from: X.Dn0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34910Dn0 {
    public static final WeakNetCountryGeckoNormalOptSettings.GeckoxWeakCountryChannelWhitelistModel LIZ;

    static {
        String str;
        if (StrategyImpl.LIZIZ().getAppId() == 1233) {
            str = "{\n  \"enable\": true,\n  \"unloadDays\": 14,\n  \"whiteList\": [\n    \"gecko_hybrid_prefetch_config\",\n    \"tiktok_live_link_mic\",\n    \"tiktok_live_lynx_goal_indicator_container\",\n    \"roma_schema_config\",\n    \"resso-tt-lynx_full_song\",\n    \"tt_messaging_mt_emoji_zip\",\n    \"fe_tiktok_lynx_search_transfer\"\n  ]\n}";
        } else {
            str = "{\n  \"enable\": true,\n  \"unloadDays\": 14,\n  \"whiteList\": [\n    \"gecko_hybrid_prefetch_config\",\n    \"tiktok_live_link_mic\",\n    \"tiktok_live_lynx_goal_indicator_container\",\n    \"wallet\",\n    \"roma_schema_config\",\n    \"tt_messaging_mt_emoji_zip\",\n    \"resso-tt-lynx_full_song\",\n    \"tiktok_live_ecommerce_voucher_short_touch\",\n    \"fe_tiktok_lynx_search_transfer\"\n  ]\n}";
        }
        LIZ = (WeakNetCountryGeckoNormalOptSettings.GeckoxWeakCountryChannelWhitelistModel) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, WeakNetCountryGeckoNormalOptSettings.GeckoxWeakCountryChannelWhitelistModel.class);
    }
}
