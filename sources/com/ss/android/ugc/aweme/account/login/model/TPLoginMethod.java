package com.ss.android.ugc.aweme.account.login.model;

import X.C68537Qv7;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TPLoginMethod extends BaseLoginMethod {
    public boolean loginFromFeedPage;
    public final String platform;
    public TPUserInfo userInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TPLoginMethod(String uid, String platform, TPUserInfo userInfo) {
        this(uid, platform, userInfo, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 248, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(userInfo, "userInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TPLoginMethod(String uid, String platform, TPUserInfo userInfo, boolean z) {
        this(uid, platform, userInfo, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 240, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(userInfo, "userInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TPLoginMethod(String uid, String platform, TPUserInfo userInfo, boolean z, CommonUserInfo commonUserInfo) {
        this(uid, platform, userInfo, z, commonUserInfo, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 224, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(userInfo, "userInfo");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TPLoginMethod(String uid, String platform, TPUserInfo userInfo, boolean z, CommonUserInfo commonUserInfo, Long l) {
        this(uid, platform, userInfo, z, commonUserInfo, l, null, 0 == true ? 1 : 0, 192, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(userInfo, "userInfo");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TPLoginMethod(String uid, String platform, TPUserInfo userInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(uid, platform, userInfo, z, commonUserInfo, l, l2, null, 128, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(userInfo, "userInfo");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    @Override // com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return !o.LJ(isHistoryOff(), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public String findPlatform() {
        return this.platform;
    }

    public final boolean getLoginFromFeedPage() {
        return this.loginFromFeedPage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setLoginFromFeedPage(boolean z) {
        this.loginFromFeedPage = z;
    }

    public final void setUserInfo(TPUserInfo tPUserInfo) {
        o.LJIIIZ(tPUserInfo, "<set-?>");
        this.userInfo = tPUserInfo;
    }

    @Override // com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public void updateUserInfo(User user) {
        o.LJIIIZ(user, "user");
        super.updateUserInfo(user);
        if (!o.LJ(user.getUid(), getUid())) {
            return;
        }
        TPUserInfo.Companion.getClass();
        this.userInfo = C68537Qv7.LIZ(user);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TPLoginMethod(String uid, String platform, TPUserInfo userInfo, boolean z, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        super(uid, LoginMethodName.THIRD_PARTY, commonUserInfo, null, l, l2, bool, null, null, null, null, null, null, 8072, null);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(userInfo, "userInfo");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
        this.platform = platform;
        this.userInfo = userInfo;
        this.loginFromFeedPage = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TPLoginMethod(java.lang.String r4, java.lang.String r5, com.ss.android.ugc.aweme.account.login.model.TPUserInfo r6, boolean r7, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r8, java.lang.Long r9, java.lang.Long r10, java.lang.Boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r3 = this;
            r0 = r12 & 8
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            r0 = r12 & 16
            if (r0 == 0) goto L12
            X.Qus r0 = com.ss.android.ugc.aweme.account.login.model.CommonUserInfo.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r8 = X.C68522Qus.LIZ()
        L12:
            r0 = r12 & 32
            r1 = -1
            if (r0 == 0) goto L1c
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
        L1c:
            r0 = r12 & 64
            if (r0 == 0) goto L24
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
        L24:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L2a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod.<init>(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.login.model.TPUserInfo, boolean, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo, java.lang.Long, java.lang.Long, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
