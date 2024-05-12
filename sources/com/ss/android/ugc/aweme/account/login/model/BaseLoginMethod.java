package com.ss.android.ugc.aweme.account.login.model;

import X.C68522Qus;
import X.C68710Qxu;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class BaseLoginMethod {
    public Boolean allowOneKeyLogin;
    public CommonUserInfo commonUserInfo;
    public String displayPlatform;
    public Date expires;
    public Boolean isFromReInstallNet;
    public Boolean isHistoryOff;
    public Boolean isOneClickLogin;
    public Boolean isTransToNormal;
    public Long lastActiveTime;
    public LoginMethodName loginMethodName;
    public Long loginTime;
    public transient String oneClickLoginToken;
    public String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLoginMethod() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public boolean isHistoryLogin() {
        return false;
    }

    public String findPlatform() {
        String str = this.displayPlatform;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean isExpired() {
        return new Date().after(getExpires());
    }

    /* renamed from: isOneClickLogin, reason: collision with other method in class */
    public boolean m102isOneClickLogin() {
        boolean contains;
        if (o.LJ(this.isOneClickLogin, Boolean.TRUE)) {
            C68710Qxu c68710Qxu = C68710Qxu.LIZ;
            String uid = this.uid;
            synchronized (c68710Qxu) {
                o.LJIIIZ(uid, "uid");
                contains = C68710Qxu.LIZJ.contains(uid);
            }
            if (!contains) {
                return true;
            }
        }
        return false;
    }

    public final Boolean getAllowOneKeyLogin() {
        return this.allowOneKeyLogin;
    }

    public final CommonUserInfo getCommonUserInfo() {
        return this.commonUserInfo;
    }

    public final String getDisplayPlatform() {
        return this.displayPlatform;
    }

    public Date getExpires() {
        return this.expires;
    }

    public final Long getLastActiveTime() {
        return this.lastActiveTime;
    }

    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    public final Long getLoginTime() {
        return this.loginTime;
    }

    public final String getOneClickLoginToken() {
        return this.oneClickLoginToken;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Boolean isFromReInstallNet() {
        return this.isFromReInstallNet;
    }

    public final Boolean isHistoryOff() {
        return this.isHistoryOff;
    }

    public final Boolean isTransToNormal() {
        return this.isTransToNormal;
    }

    public final Boolean isOneClickLogin() {
        return this.isOneClickLogin;
    }

    public final void allowOneKeyLogin(boolean z) {
        this.allowOneKeyLogin = Boolean.valueOf(z);
    }

    public final void setAllowOneKeyLogin(Boolean bool) {
        this.allowOneKeyLogin = bool;
    }

    public final void setCommonUserInfo(CommonUserInfo commonUserInfo) {
        this.commonUserInfo = commonUserInfo;
    }

    public final void setDisplayPlatform(String str) {
        this.displayPlatform = str;
    }

    public void setExpires(Date date) {
        o.LJIIIZ(date, "<set-?>");
        this.expires = date;
    }

    public final void setFromReInstallNet(Boolean bool) {
        this.isFromReInstallNet = bool;
    }

    public final void setHistoryOff(Boolean bool) {
        this.isHistoryOff = bool;
    }

    public final void setLastActiveTime(Long l) {
        this.lastActiveTime = l;
    }

    public void setLoginMethodName(LoginMethodName loginMethodName) {
        o.LJIIIZ(loginMethodName, "<set-?>");
        this.loginMethodName = loginMethodName;
    }

    public final void setLoginTime(Long l) {
        this.loginTime = l;
    }

    public final void setOneClickLogin(Boolean bool) {
        this.isOneClickLogin = bool;
    }

    public final void setOneClickLoginToken(String str) {
        this.oneClickLoginToken = str;
    }

    public final void setTransToNormal(Boolean bool) {
        this.isTransToNormal = bool;
    }

    public final void setUid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uid = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateUserInfo(SignificantUserInfo user) {
        String str;
        o.LJIIIZ(user, "user");
        if (!o.LJ(user.uid, this.uid)) {
            return;
        }
        String str2 = user.nickname;
        String str3 = user.avatarUrl;
        CommonUserInfo commonUserInfo = this.commonUserInfo;
        if (commonUserInfo != null) {
            str = commonUserInfo.getSecUid();
        } else {
            str = null;
        }
        this.commonUserInfo = new CommonUserInfo(str2, str3, str, null, 8, 0 == true ? 1 : 0);
    }

    public void updateUserInfo(User user) {
        o.LJIIIZ(user, "user");
        if (!o.LJ(user.getUid(), this.uid)) {
            return;
        }
        CommonUserInfo.Companion.getClass();
        this.commonUserInfo = C68522Qus.LIZIZ(user);
    }

    public BaseLoginMethod(String uid, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo, Date expires, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, Boolean bool5) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(expires, "expires");
        this.uid = uid;
        this.loginMethodName = loginMethodName;
        this.commonUserInfo = commonUserInfo;
        this.expires = expires;
        this.loginTime = l;
        this.lastActiveTime = l2;
        this.allowOneKeyLogin = bool;
        this.isFromReInstallNet = bool2;
        this.isTransToNormal = bool3;
        this.isOneClickLogin = bool4;
        this.oneClickLoginToken = str;
        this.displayPlatform = str2;
        this.isHistoryOff = bool5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BaseLoginMethod(java.lang.String r19, com.ss.android.ugc.aweme.account.login.model.LoginMethodName r20, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r21, java.util.Date r22, java.lang.Long r23, java.lang.Long r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.String r29, java.lang.String r30, java.lang.Boolean r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r18 = this;
            r2 = r32
            r17 = r31
            r15 = r29
            r14 = r28
            r13 = r27
            r12 = r26
            r11 = r25
            r6 = r20
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r0 = r2 & 1
            if (r0 == 0) goto L20
            java.lang.String r5 = ""
        L20:
            r0 = r2 & 2
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r6 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.DEFAULT
        L26:
            r0 = r2 & 4
            if (r0 == 0) goto L33
            X.Qus r0 = com.ss.android.ugc.aweme.account.login.model.CommonUserInfo.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r7 = X.C68522Qus.LIZ()
        L33:
            r0 = r2 & 8
            if (r0 == 0) goto L46
            java.util.Date r8 = new java.util.Date
            long r0 = java.lang.System.currentTimeMillis()
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r0 = r0 + r3
            r8.<init>(r0)
        L46:
            r0 = r2 & 16
            r3 = -1
            if (r0 == 0) goto L50
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
        L50:
            r0 = r2 & 32
            if (r0 == 0) goto L58
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
        L58:
            r0 = r2 & 64
            if (r0 == 0) goto L5e
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L5e:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L64
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L64:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L6a
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
        L6a:
            r0 = r2 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L70
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
        L70:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            r16 = 0
            if (r0 == 0) goto L78
            r15 = r16
        L78:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L88
        L7c:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L82
            java.lang.Boolean r17 = java.lang.Boolean.FALSE
        L82:
            r4 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L88:
            r16 = r30
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod.<init>(java.lang.String, com.ss.android.ugc.aweme.account.login.model.LoginMethodName, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo, java.util.Date, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
