package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AutoTriggerConfig {

    @InterfaceC65349Pkn("default_trigger_name")
    public String defaultTriggerName;

    @InterfaceC65349Pkn("delay_second")
    public int delaySecond;

    @InterfaceC65349Pkn("ignore_pitaya_package")
    public int ignorePitayaPackage;

    @InterfaceC65349Pkn("is_same_room")
    public int isSameRoom;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoTriggerConfig() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r3 = r1
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.AutoTriggerConfig.<init>():void");
    }

    public AutoTriggerConfig(int i, int i2, int i3, String defaultTriggerName) {
        o.LJIIIZ(defaultTriggerName, "defaultTriggerName");
        this.delaySecond = i;
        this.isSameRoom = i2;
        this.ignorePitayaPackage = i3;
        this.defaultTriggerName = defaultTriggerName;
    }

    public /* synthetic */ AutoTriggerConfig(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 1 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? "" : str);
    }
}
