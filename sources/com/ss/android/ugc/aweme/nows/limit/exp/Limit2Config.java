package com.ss.android.ugc.aweme.nows.limit.exp;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Limit2Config {

    @InterfaceC65349Pkn("avatar_diversion_banner")
    public final Integer avatarDiversionBanner;

    @InterfaceC65349Pkn("distributed_in_friends_tab_enabled")
    public final Integer distributedInFriendsTabEnabled;

    @InterfaceC65349Pkn("guide_red_dot_enabled")
    public final Integer guideRedDotEnabled;

    @InterfaceC65349Pkn("introductions_enabled")
    public final Integer introductionsEnabled;

    @InterfaceC65349Pkn("trial_then_never_guide")
    public final Integer trialDaysThenNeverGuide;

    /* JADX WARN: Multi-variable type inference failed */
    public Limit2Config() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Limit2Config)) {
            return false;
        }
        Limit2Config limit2Config = (Limit2Config) obj;
        return o.LJ(this.introductionsEnabled, limit2Config.introductionsEnabled) && o.LJ(this.guideRedDotEnabled, limit2Config.guideRedDotEnabled) && o.LJ(this.distributedInFriendsTabEnabled, limit2Config.distributedInFriendsTabEnabled) && o.LJ(this.trialDaysThenNeverGuide, limit2Config.trialDaysThenNeverGuide) && o.LJ(this.avatarDiversionBanner, limit2Config.avatarDiversionBanner);
    }

    public final int hashCode() {
        Integer num = this.introductionsEnabled;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.guideRedDotEnabled;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.distributedInFriendsTabEnabled;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.trialDaysThenNeverGuide;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.avatarDiversionBanner;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Limit2Config(introductionsEnabled=");
        LIZ.append(this.introductionsEnabled);
        LIZ.append(", guideRedDotEnabled=");
        LIZ.append(this.guideRedDotEnabled);
        LIZ.append(", distributedInFriendsTabEnabled=");
        LIZ.append(this.distributedInFriendsTabEnabled);
        LIZ.append(", trialDaysThenNeverGuide=");
        LIZ.append(this.trialDaysThenNeverGuide);
        LIZ.append(", avatarDiversionBanner=");
        return s0.LIZJ(LIZ, this.avatarDiversionBanner, ')', LIZ);
    }

    public Limit2Config(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.introductionsEnabled = num;
        this.guideRedDotEnabled = num2;
        this.distributedInFriendsTabEnabled = num3;
        this.trialDaysThenNeverGuide = num4;
        this.avatarDiversionBanner = num5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Limit2Config(java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r5 = r11
            r4 = r10
            r2 = r8
            r3 = r9
            r1 = r13 & 1
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Le
            r2 = r6
        Le:
            r0 = r13 & 2
            if (r0 == 0) goto L13
            r3 = r6
        L13:
            r0 = r13 & 4
            if (r0 == 0) goto L18
            r4 = r6
        L18:
            r0 = r13 & 8
            if (r0 == 0) goto L1d
            r5 = r6
        L1d:
            r0 = r13 & 16
            if (r0 == 0) goto L26
        L21:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L26:
            r6 = r12
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.limit.exp.Limit2Config.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
