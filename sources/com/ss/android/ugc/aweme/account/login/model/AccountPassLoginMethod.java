package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AccountPassLoginMethod extends BaseLoginMethod {
    public String name;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPassLoginMethod(String uid, LoginMethodName loginMethodName, String name) {
        this(uid, loginMethodName, name, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, LiveTryModeCountDownThresholdSetting.DEFAULT, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(name, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPassLoginMethod(String uid, LoginMethodName loginMethodName, String name, CommonUserInfo commonUserInfo) {
        this(uid, loginMethodName, name, commonUserInfo, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 112, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPassLoginMethod(String uid, LoginMethodName loginMethodName, String name, CommonUserInfo commonUserInfo, Long l) {
        this(uid, loginMethodName, name, commonUserInfo, l, null, 0 == true ? 1 : 0, 96, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPassLoginMethod(String uid, LoginMethodName loginMethodName, String name, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(uid, loginMethodName, name, commonUserInfo, l, l2, null, 64, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPassLoginMethod(String uid, String name) {
        this(uid, null, name, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 122, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(name, "name");
    }

    @Override // com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return !o.LJ(isHistoryOff(), Boolean.TRUE);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPassLoginMethod(String uid, LoginMethodName loginMethodName, String name, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        super(uid, loginMethodName, commonUserInfo, null, l, l2, bool, null, null, null, null, null, null, 8072, null);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
        this.name = name;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AccountPassLoginMethod(java.lang.String r4, com.ss.android.ugc.aweme.account.login.model.LoginMethodName r5, java.lang.String r6, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r7, java.lang.Long r8, java.lang.Long r9, java.lang.Boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r3 = this;
            r0 = r11 & 2
            if (r0 == 0) goto L6
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r5 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.EMAIL_PASS
        L6:
            r0 = r11 & 8
            if (r0 == 0) goto L13
            X.Qus r0 = com.ss.android.ugc.aweme.account.login.model.CommonUserInfo.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r7 = X.C68522Qus.LIZ()
        L13:
            r0 = r11 & 16
            r1 = -1
            if (r0 == 0) goto L1d
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
        L1d:
            r0 = r11 & 32
            if (r0 == 0) goto L25
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
        L25:
            r0 = r11 & 64
            if (r0 == 0) goto L2b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
        L2b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod.<init>(java.lang.String, com.ss.android.ugc.aweme.account.login.model.LoginMethodName, java.lang.String, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo, java.lang.Long, java.lang.Long, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
