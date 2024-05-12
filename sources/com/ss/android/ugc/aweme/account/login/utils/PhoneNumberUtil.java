package com.ss.android.ugc.aweme.account.login.utils;

import X.C16880lQ;
import X.C39399FdD;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class PhoneNumberUtil {

    /* loaded from: classes12.dex */
    public static class PhoneNumber implements Serializable {

        @InterfaceC65349Pkn("countryIso_")
        public String countryIso_ = C39399FdD.LIZ(Locale.CHINA);

        @InterfaceC65349Pkn("rawInput_")
        public String rawInput_ = "";

        @InterfaceC65349Pkn("countryCode_")
        public int countryCode_ = 86;

        @InterfaceC65349Pkn("nationalNumber_")
        public String nationalNumber_ = "";

        public int getCountryCode() {
            return this.countryCode_;
        }

        public String getCountryIso() {
            return this.countryIso_;
        }

        public String getNationalNumber() {
            return this.nationalNumber_;
        }

        public String getRawInput() {
            return this.rawInput_;
        }

        public PhoneNumber setCountryCode(int i) {
            this.countryCode_ = i;
            return this;
        }

        public void setCountryIso(String str) {
            this.countryIso_ = str;
        }

        public PhoneNumber setNationalNumber(String str) {
            this.nationalNumber_ = str;
            return this;
        }

        public PhoneNumber setRawInput(String str) {
            this.rawInput_ = str;
            return this;
        }

        public static PhoneNumber create(int i, String str) {
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.setCountryCode(i);
            phoneNumber.setNationalNumber(str);
            return phoneNumber;
        }
    }

    public static String LIZ(PhoneNumber phoneNumber) {
        if (phoneNumber == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("+");
        LIZ.append(phoneNumber.getCountryCode());
        LIZ.append(" ");
        LIZ.append(phoneNumber.getNationalNumber());
        return X1D.LIZIZ(LIZ);
    }

    public static boolean LIZIZ(String str, String str2) {
        int parseInt;
        long j;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str != null) {
            try {
                parseInt = CastIntegerProtector.parseInt(str);
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            parseInt = 0;
        }
        if (str2 != null) {
            CastLongProtector.parseLong(str2);
        }
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(parseInt);
        phoneNumber.setNationalNumber(str2);
        if (phoneNumber.getCountryCode() == 86) {
            if (String.valueOf(phoneNumber.getNationalNumber()).length() != 11) {
                return false;
            }
        } else {
            try {
                j = CastLongProtector.parseLong(phoneNumber.getNationalNumber());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                j = 0;
            }
            if (phoneNumber.getCountryCode() == 0 || j < 0) {
                return false;
            }
        }
        return true;
    }
}
