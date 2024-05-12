package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinRule extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("regex")
    public final String regex;

    public static /* synthetic */ PinRule copy$default(PinRule pinRule, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinRule.regex;
        }
        if ((i & 2) != 0) {
            str2 = pinRule.errorCode;
        }
        return pinRule.copy(str, str2);
    }

    public final PinRule copy(String regex, String errorCode) {
        o.LJIIIZ(regex, "regex");
        o.LJIIIZ(errorCode, "errorCode");
        return new PinRule(regex, errorCode);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.regex, this.errorCode};
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getRegex() {
        return this.regex;
    }

    public PinRule(String regex, String errorCode) {
        o.LJIIIZ(regex, "regex");
        o.LJIIIZ(errorCode, "errorCode");
        this.regex = regex;
        this.errorCode = errorCode;
    }
}
