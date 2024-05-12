package com.ss.android.ugc.aweme.plugin.personalizednuj;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PersonalizedNUJV2Data {

    @InterfaceC65349Pkn("enable_unlogin_time_limit")
    public final boolean enableUnloginTimeLimit;

    @InterfaceC65349Pkn("login_time_limit_min")
    public final int loginTimeLimitMin;

    @InterfaceC65349Pkn("need_nuj_in_age_gate_flow")
    public final Boolean needNUJInAgeGateFlow;

    @InterfaceC65349Pkn("need_nuj_quick_login_flow")
    public final Boolean needNUJInQuickLoginFlow;

    @InterfaceC65349Pkn("personalized_nuj_label")
    public final int personalizedNUJLabel;

    @InterfaceC65349Pkn("should_try_age_gate")
    public final Boolean shouldTryAgeGate;

    @InterfaceC65349Pkn("should_try_push_popup")
    public final Boolean shouldTryPushPopup;

    @InterfaceC65349Pkn("should_try_smart_lock")
    public final Boolean shouldTrySmartLock;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PersonalizedNUJV2Data() {
        /*
            r11 = this;
            r1 = 0
            r6 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r6
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizedNUJV2Data)) {
            return false;
        }
        PersonalizedNUJV2Data personalizedNUJV2Data = (PersonalizedNUJV2Data) obj;
        return o.LJ(this.shouldTrySmartLock, personalizedNUJV2Data.shouldTrySmartLock) && o.LJ(this.shouldTryAgeGate, personalizedNUJV2Data.shouldTryAgeGate) && o.LJ(this.shouldTryPushPopup, personalizedNUJV2Data.shouldTryPushPopup) && o.LJ(this.needNUJInAgeGateFlow, personalizedNUJV2Data.needNUJInAgeGateFlow) && o.LJ(this.needNUJInQuickLoginFlow, personalizedNUJV2Data.needNUJInQuickLoginFlow) && this.personalizedNUJLabel == personalizedNUJV2Data.personalizedNUJLabel && this.enableUnloginTimeLimit == personalizedNUJV2Data.enableUnloginTimeLimit && this.loginTimeLimitMin == personalizedNUJV2Data.loginTimeLimitMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Boolean bool = this.shouldTrySmartLock;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.shouldTryAgeGate;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shouldTryPushPopup;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.needNUJInAgeGateFlow;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.needNUJInQuickLoginFlow;
        int hashCode5 = (((hashCode4 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.personalizedNUJLabel) * 31;
        boolean z = this.enableUnloginTimeLimit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode5 + i) * 31) + this.loginTimeLimitMin;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PersonalizedNUJV2Data(shouldTrySmartLock=");
        LIZ.append(this.shouldTrySmartLock);
        LIZ.append(", shouldTryAgeGate=");
        LIZ.append(this.shouldTryAgeGate);
        LIZ.append(", shouldTryPushPopup=");
        LIZ.append(this.shouldTryPushPopup);
        LIZ.append(", needNUJInAgeGateFlow=");
        LIZ.append(this.needNUJInAgeGateFlow);
        LIZ.append(", needNUJInQuickLoginFlow=");
        LIZ.append(this.needNUJInQuickLoginFlow);
        LIZ.append(", personalizedNUJLabel=");
        LIZ.append(this.personalizedNUJLabel);
        LIZ.append(", enableUnloginTimeLimit=");
        LIZ.append(this.enableUnloginTimeLimit);
        LIZ.append(", loginTimeLimitMin=");
        return b0.LIZJ(LIZ, this.loginTimeLimitMin, ')', LIZ);
    }

    public PersonalizedNUJV2Data(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, boolean z, int i2) {
        this.shouldTrySmartLock = bool;
        this.shouldTryAgeGate = bool2;
        this.shouldTryPushPopup = bool3;
        this.needNUJInAgeGateFlow = bool4;
        this.needNUJInQuickLoginFlow = bool5;
        this.personalizedNUJLabel = i;
        this.enableUnloginTimeLimit = z;
        this.loginTimeLimitMin = i2;
    }

    public /* synthetic */ PersonalizedNUJV2Data(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Boolean.FALSE : bool, (i3 & 2) != 0 ? Boolean.FALSE : bool2, (i3 & 4) != 0 ? Boolean.FALSE : bool3, (i3 & 8) != 0 ? Boolean.TRUE : bool4, (i3 & 16) != 0 ? Boolean.FALSE : bool5, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? false : z, (i3 & 128) == 0 ? i2 : 0);
    }
}
