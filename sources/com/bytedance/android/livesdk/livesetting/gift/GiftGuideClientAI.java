package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftGuideClientAI {

    @InterfaceC65349Pkn("auto_trigger_config")
    public Map<String, AutoTriggerConfig> autoTriggerConfigMap;

    @InterfaceC65349Pkn("business_name")
    public String businessName;

    @InterfaceC65349Pkn("collect_enable")
    public boolean enableCollect;

    @InterfaceC65349Pkn("frequency_control_business_name")
    public String frequencyControlBusinessName;

    @InterfaceC65349Pkn("frequency_control_task_delay")
    public long frequencyControlTaskDelay;

    @InterfaceC65349Pkn("gift_combo_count")
    public int giftComboCount;

    @InterfaceC65349Pkn("massive_comment_count")
    public int massiveCommentCount;

    @InterfaceC65349Pkn("massive_gifts_count")
    public int massiveGiftCount;

    @InterfaceC65349Pkn("native_trigger_config")
    public NativeTriggerConfig nativeTriggerConfig;

    @InterfaceC65349Pkn("polling_duration")
    public long pollingDuration;

    @InterfaceC65349Pkn("client_ai_task_timeout")
    public int taskTimeout;

    @InterfaceC65349Pkn("trigger_duration")
    public long triggerDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GiftGuideClientAI() {
        /*
            r18 = this;
            r1 = 0
            r3 = 0
            r7 = 0
            r16 = 4095(0xfff, float:5.738E-42)
            r0 = r18
            r2 = r1
            r5 = r3
            r8 = r3
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r1
            r15 = r1
            r17 = r1
            r0.<init>(r1, r2, r3, r5, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.GiftGuideClientAI.<init>():void");
    }

    public GiftGuideClientAI(String frequencyControlBusinessName, String businessName, long j, long j2, boolean z, long j3, int i, int i2, int i3, int i4, Map<String, AutoTriggerConfig> map, NativeTriggerConfig nativeTriggerConfig) {
        o.LJIIIZ(frequencyControlBusinessName, "frequencyControlBusinessName");
        o.LJIIIZ(businessName, "businessName");
        o.LJIIIZ(nativeTriggerConfig, "nativeTriggerConfig");
        this.frequencyControlBusinessName = frequencyControlBusinessName;
        this.businessName = businessName;
        this.frequencyControlTaskDelay = j;
        this.pollingDuration = j2;
        this.enableCollect = z;
        this.triggerDuration = j3;
        this.massiveCommentCount = i;
        this.massiveGiftCount = i2;
        this.giftComboCount = i3;
        this.taskTimeout = i4;
        this.autoTriggerConfigMap = map;
        this.nativeTriggerConfig = nativeTriggerConfig;
    }

    public /* synthetic */ GiftGuideClientAI(String str, String str2, long j, long j2, boolean z, long j3, int i, int i2, int i3, int i4, Map map, NativeTriggerConfig nativeTriggerConfig, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) == 0 ? str2 : "", (i5 & 4) != 0 ? 10000L : j, (i5 & 8) != 0 ? 30L : j2, (i5 & 16) != 0 ? false : z, (i5 & 32) == 0 ? j3 : 30L, (i5 & 64) != 0 ? 10 : i, (i5 & 128) != 0 ? 5 : i2, (i5 & 256) == 0 ? i3 : 5, (i5 & 512) != 0 ? 1000 : i4, (i5 & 1024) != 0 ? null : map, (i5 & 2048) != 0 ? new NativeTriggerConfig(null, null, 3, null) : nativeTriggerConfig);
    }
}
