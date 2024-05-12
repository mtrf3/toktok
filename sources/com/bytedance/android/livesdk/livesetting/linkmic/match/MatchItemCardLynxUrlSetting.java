package com.bytedance.android.livesdk.livesetting.linkmic.match;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("tiktok_live_lynx_match_url_list")
/* loaded from: classes6.dex */
public final class MatchItemCardLynxUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final MatchItemCardLynxUrlSetting INSTANCE;
    public static final String matchFaq;
    public static final String matchItemsGuide;
    public static final String matchItemsPanel;
    public static final String matchItemsShortTouch;

    static {
        MatchItemCardLynxUrlSetting matchItemCardLynxUrlSetting = new MatchItemCardLynxUrlSetting();
        INSTANCE = matchItemCardLynxUrlSetting;
        String optString = matchItemCardLynxUrlSetting.getValue().optString("match_faq", "");
        o.LJIIIIZZ(optString, "getValue().optString(\"match_faq\", \"\")");
        matchFaq = optString;
        String optString2 = matchItemCardLynxUrlSetting.getValue().optString("match_items_guide", "");
        o.LJIIIIZZ(optString2, "getValue().optString(\"match_items_guide\", \"\")");
        matchItemsGuide = optString2;
        String optString3 = matchItemCardLynxUrlSetting.getValue().optString("match_items_panel", "");
        o.LJIIIIZZ(optString3, "getValue().optString(\"match_items_panel\", \"\")");
        matchItemsPanel = optString3;
        String optString4 = matchItemCardLynxUrlSetting.getValue().optString("match_items_short_touch", "");
        o.LJIIIIZZ(optString4, "getValue().optString(\"ma…h_items_short_touch\", \"\")");
        matchItemsShortTouch = optString4;
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        if (TextUtils.isEmpty(settingsManager.getStringValue(MatchItemCardLynxUrlSetting.class))) {
            return new JSONObject();
        }
        return new JSONObject(settingsManager.getStringValue(MatchItemCardLynxUrlSetting.class));
    }

    public final String getMatchFaq() {
        return matchFaq;
    }

    public final String getMatchItemsGuide() {
        return matchItemsGuide;
    }

    public final String getMatchItemsPanel() {
        return matchItemsPanel;
    }

    public final String getMatchItemsShortTouch() {
        return matchItemsShortTouch;
    }
}
