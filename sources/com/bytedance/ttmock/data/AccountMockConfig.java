package com.bytedance.ttmock.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AccountMockConfig extends F9E {

    @InterfaceC65349Pkn("country_code")
    public final int countryCode;

    @InterfaceC65349Pkn("email")
    public final String email;

    @InterfaceC65349Pkn("password")
    public final String password;

    @InterfaceC65349Pkn("phone_number")
    public final String phoneNumber;

    @InterfaceC65349Pkn("session")
    public final String session;

    @InterfaceC65349Pkn("sms_code")
    public final String smsCode;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountMockConfig() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccountMockConfig copy$default(AccountMockConfig accountMockConfig, String str, String str2, int i, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountMockConfig.phoneNumber;
        }
        if ((i2 & 2) != 0) {
            str2 = accountMockConfig.smsCode;
        }
        if ((i2 & 4) != 0) {
            i = accountMockConfig.countryCode;
        }
        if ((i2 & 8) != 0) {
            str3 = accountMockConfig.email;
        }
        if ((i2 & 16) != 0) {
            str4 = accountMockConfig.password;
        }
        if ((i2 & 32) != 0) {
            str5 = accountMockConfig.session;
        }
        return accountMockConfig.copy(str, str2, i, str3, str4, str5);
    }

    public final AccountMockConfig copy(String phoneNumber, String smsCode, int i, String email, String password, String session) {
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(smsCode, "smsCode");
        o.LJIIIZ(email, "email");
        o.LJIIIZ(password, "password");
        o.LJIIIZ(session, "session");
        return new AccountMockConfig(phoneNumber, smsCode, i, email, password, session);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.phoneNumber, this.smsCode, Integer.valueOf(this.countryCode), this.email, this.password, this.session};
    }

    public final int getCountryCode() {
        return this.countryCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getSmsCode() {
        return this.smsCode;
    }

    public AccountMockConfig(String phoneNumber, String smsCode, int i, String email, String password, String session) {
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(smsCode, "smsCode");
        o.LJIIIZ(email, "email");
        o.LJIIIZ(password, "password");
        o.LJIIIZ(session, "session");
        this.phoneNumber = phoneNumber;
        this.smsCode = smsCode;
        this.countryCode = i;
        this.email = email;
        this.password = password;
        this.session = session;
    }

    public /* synthetic */ AccountMockConfig(String str, String str2, int i, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 86 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "");
    }
}
