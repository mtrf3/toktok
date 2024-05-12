package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Amount extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("value")
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public Amount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Amount copy$default(Amount amount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amount.value;
        }
        if ((i & 2) != 0) {
            str2 = amount.currency;
        }
        return amount.copy(str, str2);
    }

    public final Amount copy(String value, String currency) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(currency, "currency");
        return new Amount(value, currency);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.value, this.currency};
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getValue() {
        return this.value;
    }

    public Amount(String value, String currency) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(currency, "currency");
        this.value = value;
        this.currency = currency;
    }

    public /* synthetic */ Amount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
