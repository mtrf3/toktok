package com.bytedance.android.livesdk.livesetting.other.subscribe;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscriptionConfig_OptTypeAdapter extends TypeAdapter<SubscriptionConfig> {
    public SubscriptionConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final SubscriptionConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SubscriptionConfig subscriptionConfig = new SubscriptionConfig(0, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -2056932997) {
                    if (hashCode != 1319146309) {
                        if (hashCode == 1486960557 && LJJ.equals("live_sub_emote_enable_edit")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                subscriptionConfig.emoteEditEnable = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_sub_emote_enable_preview")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            subscriptionConfig.emotePreviewEnable = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("subscription_community_enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        subscriptionConfig.communityEnable = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return subscriptionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SubscriptionConfig subscriptionConfig) {
        SubscriptionConfig subscriptionConfig2 = subscriptionConfig;
        o.LJIIIZ(writer, "writer");
        if (subscriptionConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("subscription_community_enable");
        C79062V1e.LJFF(subscriptionConfig2.communityEnable, writer, "live_sub_emote_enable_edit");
        C79062V1e.LJFF(subscriptionConfig2.emoteEditEnable, writer, "live_sub_emote_enable_preview");
        C77339UWx.LJFF(subscriptionConfig2.emotePreviewEnable, writer);
    }
}
