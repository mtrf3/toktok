package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.EnumC29596BjU;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

@SettingsKey("live_gift_tray_public_screen_translate_setting")
/* loaded from: classes6.dex */
public final class LiveGiftTrayPublicScreenTranslateSetting {

    @Group(isDefault = true, value = "default group")
    public static final LiveGiftTrayPublicScreenTranslateConfig DEFAULT;
    public static final LiveGiftTrayPublicScreenTranslateSetting INSTANCE = new LiveGiftTrayPublicScreenTranslateSetting();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        DEFAULT = new LiveGiftTrayPublicScreenTranslateConfig(null, z, z, 7, 0 == true ? 1 : 0);
    }

    public final LiveGiftTrayPublicScreenTranslateConfig getValue() {
        LiveGiftTrayPublicScreenTranslateConfig liveGiftTrayPublicScreenTranslateConfig = (LiveGiftTrayPublicScreenTranslateConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftTrayPublicScreenTranslateSetting.class);
        if (liveGiftTrayPublicScreenTranslateConfig == null) {
            return DEFAULT;
        }
        return liveGiftTrayPublicScreenTranslateConfig;
    }

    public static final boolean enable(EnumC29596BjU bizType) {
        o.LJIIIZ(bizType, "bizType");
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = INSTANCE;
        if ((liveGiftTrayPublicScreenTranslateSetting.getValue().translateGiftTray || liveGiftTrayPublicScreenTranslateSetting.getValue().translatePublishScreen) && liveGiftTrayPublicScreenTranslateSetting.getValue().bizTypes.contains(bizType.getBizName())) {
            return true;
        }
        return false;
    }

    public final boolean canCommonWidgetsAlphaXfer(EnumC29596BjU bizType) {
        o.LJIIIZ(bizType, "bizType");
        if ((getValue().translateGiftTray || getValue().translatePublishScreen) && getValue().bizTypes.contains(bizType.getBizName())) {
            return true;
        }
        return false;
    }

    public final boolean canGiftTrayTranslationXfer(EnumC29596BjU bizType) {
        o.LJIIIZ(bizType, "bizType");
        if (getValue().translateGiftTray && getValue().bizTypes.contains(bizType.getBizName())) {
            return true;
        }
        return false;
    }

    public final boolean canStatusWidgetsAlphaXfer(EnumC29596BjU bizType) {
        o.LJIIIZ(bizType, "bizType");
        if (getValue().translateGiftTray && !getValue().translatePublishScreen && getValue().bizTypes.contains(bizType.getBizName())) {
            return true;
        }
        return false;
    }

    public final boolean giftTrayTranslateWithPublicScreen(EnumC29596BjU bizType) {
        o.LJIIIZ(bizType, "bizType");
        if (getValue().translateGiftTray && getValue().translatePublishScreen && getValue().bizTypes.contains(bizType.getBizName())) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class LiveGiftTrayPublicScreenTranslateConfig {

        @InterfaceC65349Pkn("biz_types")
        public List<String> bizTypes;

        @InterfaceC65349Pkn("top_gift_message")
        public boolean translateGiftTray;

        @InterfaceC65349Pkn("top_public_screen")
        public boolean translatePublishScreen;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LiveGiftTrayPublicScreenTranslateConfig() {
            /*
                r6 = this;
                r1 = 0
                r2 = 0
                r4 = 7
                r0 = r6
                r3 = r2
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig.<init>():void");
        }

        public LiveGiftTrayPublicScreenTranslateConfig(List<String> bizTypes, boolean z, boolean z2) {
            o.LJIIIZ(bizTypes, "bizTypes");
            this.bizTypes = bizTypes;
            this.translateGiftTray = z;
            this.translatePublishScreen = z2;
        }

        public /* synthetic */ LiveGiftTrayPublicScreenTranslateConfig(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }
    }
}
