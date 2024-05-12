package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PhoneLoginMethod extends BaseLoginMethod {
    public PhoneNumberUtil.PhoneNumber phoneNumber;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneLoginMethod(String uid, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber) {
        this(uid, loginMethodName, phoneNumber, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, LiveTryModeCountDownThresholdSetting.DEFAULT, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(phoneNumber, "phoneNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneLoginMethod(String uid, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo) {
        this(uid, loginMethodName, phoneNumber, commonUserInfo, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 112, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneLoginMethod(String uid, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l) {
        this(uid, loginMethodName, phoneNumber, commonUserInfo, l, null, 0 == true ? 1 : 0, 96, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneLoginMethod(String uid, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2) {
        this(uid, loginMethodName, phoneNumber, commonUserInfo, l, l2, null, 64, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneLoginMethod(String uid, PhoneNumberUtil.PhoneNumber phoneNumber) {
        this(uid, null, phoneNumber, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 122, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(phoneNumber, "phoneNumber");
    }

    @Override // com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public boolean isHistoryLogin() {
        return !o.LJ(isHistoryOff(), Boolean.TRUE);
    }

    public final PhoneNumberUtil.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    private final String parseNumber(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.digit(str.charAt(i), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
        }
        if (sb.length() == 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public final void setPhoneNumber(PhoneNumberUtil.PhoneNumber phoneNumber) {
        o.LJIIIZ(phoneNumber, "<set-?>");
        this.phoneNumber = phoneNumber;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneLoginMethod(String uid, LoginMethodName loginMethodName, String countryCodeName, String countryCode, String nationalNumber, Long l) {
        this(uid, loginMethodName, new PhoneNumberUtil.PhoneNumber(), null, l, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 104, 0 == true ? 1 : 0);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(countryCodeName, "countryCodeName");
        o.LJIIIZ(countryCode, "countryCode");
        o.LJIIIZ(nationalNumber, "nationalNumber");
        this.phoneNumber.setCountryIso(countryCodeName);
        this.phoneNumber.setCountryCode(CastIntegerProtector.parseInt(parseNumber(countryCode)));
        this.phoneNumber.setNationalNumber(nationalNumber);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(String uid, LoginMethodName loginMethodName, PhoneNumberUtil.PhoneNumber phoneNumber, CommonUserInfo commonUserInfo, Long l, Long l2, Boolean bool) {
        super(uid, loginMethodName, commonUserInfo, null, l, l2, bool, null, null, null, null, null, null, 8072, null);
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(loginMethodName, "loginMethodName");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(commonUserInfo, "commonUserInfo");
        this.phoneNumber = phoneNumber;
    }

    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, (i & 4) != 0 ? "" : str2, str3, str4, l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PhoneLoginMethod(java.lang.String r4, com.ss.android.ugc.aweme.account.login.model.LoginMethodName r5, com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber r6, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r7, java.lang.Long r8, java.lang.Long r9, java.lang.Boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r3 = this;
            r0 = r11 & 2
            if (r0 == 0) goto L6
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r5 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod.<init>(java.lang.String, com.ss.android.ugc.aweme.account.login.model.LoginMethodName, com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$PhoneNumber, com.ss.android.ugc.aweme.account.login.model.CommonUserInfo, java.lang.Long, java.lang.Long, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
