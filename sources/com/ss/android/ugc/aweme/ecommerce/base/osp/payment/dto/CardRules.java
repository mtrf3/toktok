package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CardRules {

    @InterfaceC65349Pkn("payment_method_id")
    public final String id;

    @InterfaceC65349Pkn("sub_payment_card_rules")
    public final List<BankCardRule> rules;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRules)) {
            return false;
        }
        CardRules cardRules = (CardRules) obj;
        return o.LJ(this.id, cardRules.id) && o.LJ(this.rules, cardRules.rules);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BankCardRule> list = this.rules;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardRules(id=");
        LIZ.append(this.id);
        LIZ.append(", rules=");
        return C1NE.LIZIZ(LIZ, this.rules, ')', LIZ);
    }

    public CardRules(String str, List<BankCardRule> list) {
        this.id = str;
        this.rules = list;
    }
}
