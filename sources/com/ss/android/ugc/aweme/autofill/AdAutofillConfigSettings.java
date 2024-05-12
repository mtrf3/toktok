package com.ss.android.ugc.aweme.autofill;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AdAutofillConfigSettings {
    public static final AdAutofillConfig LIZ = new AdAutofillConfig(null, null, null, null, null, null, null, null, 255, null);

    public static final AdAutofillConfig LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            AdAutofillConfig adAutofillConfig = LIZ;
            AdAutofillConfig adAutofillConfig2 = (AdAutofillConfig) LIZLLL.LJIIIIZZ("ad_autofill_config", AdAutofillConfig.class, adAutofillConfig);
            if (adAutofillConfig2 != null) {
                adAutofillConfig = adAutofillConfig2;
            }
            o.LJIIIIZZ(adAutofillConfig, "{\n            SettingsMa…ava) ?: DEFAULT\n        }");
            return adAutofillConfig;
        } catch (Exception unused) {
            return LIZ;
        }
    }

    /* loaded from: classes11.dex */
    public static final class AdAutofillConfig {

        @InterfaceC65349Pkn("autofill_iv")
        public final String autofillIv;

        @InterfaceC65349Pkn("autofill_key")
        public final String autofillKey;

        @InterfaceC65349Pkn("autofill_popup_schema_android")
        public final String autofillPopupSchema;

        @InterfaceC65349Pkn("channel_list")
        public final List<String> channelList;

        @InterfaceC65349Pkn("javascript_cdn")
        public final String javascriptCDN;

        @InterfaceC65349Pkn("learn_more_link")
        public final String learnMoreLink;

        @InterfaceC65349Pkn("save_popup_schema_android")
        public final String savePopupSchema;

        @InterfaceC65349Pkn("setting_lynx_schema")
        public final String settingLynxSchema;

        public AdAutofillConfig() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public AdAutofillConfig(String autofillPopupSchema, String savePopupSchema, String settingLynxSchema, String learnMoreLink, String javascriptCDN, List<String> channelList, String autofillKey, String autofillIv) {
            o.LJIIIZ(autofillPopupSchema, "autofillPopupSchema");
            o.LJIIIZ(savePopupSchema, "savePopupSchema");
            o.LJIIIZ(settingLynxSchema, "settingLynxSchema");
            o.LJIIIZ(learnMoreLink, "learnMoreLink");
            o.LJIIIZ(javascriptCDN, "javascriptCDN");
            o.LJIIIZ(channelList, "channelList");
            o.LJIIIZ(autofillKey, "autofillKey");
            o.LJIIIZ(autofillIv, "autofillIv");
            this.autofillPopupSchema = autofillPopupSchema;
            this.savePopupSchema = savePopupSchema;
            this.settingLynxSchema = settingLynxSchema;
            this.learnMoreLink = learnMoreLink;
            this.javascriptCDN = javascriptCDN;
            this.channelList = channelList;
            this.autofillKey = autofillKey;
            this.autofillIv = autofillIv;
        }

        public AdAutofillConfig(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? C61878OQg.INSTANCE : list, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
        }
    }
}
