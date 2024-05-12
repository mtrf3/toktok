package com.bytedance.android.livesdk.livesetting.hybrid;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey(preciseExperiment = false, value = "tiktok_live_lynx_dynamic_pb_definition")
/* loaded from: classes6.dex */
public final class LiveDynamicPbDefinitionSetting {
    public static final LiveDynamicPbDefinitionSetting INSTANCE = new LiveDynamicPbDefinitionSetting();

    @Group(isDefault = true, value = "default group")
    public static final PbDefinitionItem[] DEFAULT = new PbDefinitionItem[0];

    public static final PbDefinitionItem[] getValue() {
        return (PbDefinitionItem[]) SettingsManager.INSTANCE.getValueSafely(LiveDynamicPbDefinitionSetting.class);
    }

    /* loaded from: classes6.dex */
    public static final class PbDefinitionItem {

        @InterfaceC65349Pkn("channel")
        public String channel;

        @InterfaceC65349Pkn("definition_url")
        public String url;

        /* JADX WARN: Multi-variable type inference failed */
        public PbDefinitionItem() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public PbDefinitionItem(String channel, String url) {
            o.LJIIIZ(channel, "channel");
            o.LJIIIZ(url, "url");
            this.channel = channel;
            this.url = url;
        }

        public /* synthetic */ PbDefinitionItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }
}
