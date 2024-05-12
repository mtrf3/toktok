package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BattleComboInfo extends F9E {

    @InterfaceC65349Pkn("combo_count")
    public long comboCount;

    @InterfaceC65349Pkn("combo_icon_url")
    public String comboIconUrl;

    @InterfaceC65349Pkn("combo_rule_guide_schema")
    public String comboRuleGuideSchema;

    @InterfaceC65349Pkn("combo_status")
    public long comboStatus;

    @InterfaceC65349Pkn("combo_type")
    public int comboType;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BattleComboInfo() {
        /*
            r12 = this;
            r1 = 0
            r7 = 0
            r8 = 0
            r10 = 63
            r0 = r12
            r3 = r1
            r5 = r1
            r9 = r7
            r11 = r7
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Long.valueOf(this.comboStatus), Long.valueOf(this.comboCount), this.comboIconUrl, Integer.valueOf(this.comboType), this.comboRuleGuideSchema};
    }

    public BattleComboInfo(long j, long j2, long j3, String str, int i, String str2) {
        this.userId = j;
        this.comboStatus = j2;
        this.comboCount = j3;
        this.comboIconUrl = str;
        this.comboType = i;
        this.comboRuleGuideSchema = str2;
    }

    public /* synthetic */ BattleComboInfo(long j, long j2, long j3, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) == 0 ? j3 : 0L, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? str2 : null);
    }
}
