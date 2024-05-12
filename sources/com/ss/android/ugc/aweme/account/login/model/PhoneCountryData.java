package com.ss.android.ugc.aweme.account.login.model;

import X.F9E;
import X.HH1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PhoneCountryData extends F9E {
    public final int code;
    public final String displayname;
    public final String en;
    public final String key;

    public static /* synthetic */ PhoneCountryData copy$default(PhoneCountryData phoneCountryData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneCountryData.key;
        }
        if ((i2 & 2) != 0) {
            str2 = phoneCountryData.en;
        }
        if ((i2 & 4) != 0) {
            i = phoneCountryData.code;
        }
        if ((i2 & 8) != 0) {
            str3 = phoneCountryData.displayname;
        }
        return phoneCountryData.copy(str, str2, i, str3);
    }

    public final PhoneCountryData copy(String key, String en, int i, String displayname) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(en, "en");
        o.LJIIIZ(displayname, "displayname");
        return new PhoneCountryData(key, en, i, displayname);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.en, Integer.valueOf(this.code), this.displayname};
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDisplayname() {
        return this.displayname;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getKey() {
        return this.key;
    }

    public PhoneCountryData(String str, String str2, int i, String str3) {
        HH1.LIZ(str, "key", str2, "en", str3, "displayname");
        this.key = str;
        this.en = str2;
        this.code = i;
        this.displayname = str3;
    }
}
