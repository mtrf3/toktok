package com.ss.android.ugc.aweme.feed.prompt.api;

import X.C16880lQ;
import X.C770830u;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Instruction implements Serializable {

    @InterfaceC65349Pkn("aweme_struct")
    public final Aweme aweme;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("related_item")
    public final Integer relatedItem;

    @InterfaceC65349Pkn("returned_query")
    public final String returnedQuery;

    /* JADX WARN: Multi-variable type inference failed */
    public Instruction() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Instruction copy$default(Instruction instruction, long j, String str, Integer num, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            j = instruction.id;
        }
        if ((i & 2) != 0) {
            str = instruction.returnedQuery;
        }
        if ((i & 4) != 0) {
            num = instruction.relatedItem;
        }
        if ((i & 8) != 0) {
            aweme = instruction.aweme;
        }
        return instruction.copy(j, str, num, aweme);
    }

    public final Instruction copy(long j, String returnedQuery, Integer num, Aweme aweme) {
        o.LJIIIZ(returnedQuery, "returnedQuery");
        return new Instruction(j, returnedQuery, num, aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instruction)) {
            return false;
        }
        Instruction instruction = (Instruction) obj;
        return this.id == instruction.id && o.LJ(this.returnedQuery, instruction.returnedQuery) && o.LJ(this.relatedItem, instruction.relatedItem) && o.LJ(this.aweme, instruction.aweme);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.returnedQuery, C16880lQ.LLJIJIL(this.id) * 31, 31);
        Integer num = this.relatedItem;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Aweme aweme = this.aweme;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Instruction(id=");
        LIZ.append(this.id);
        LIZ.append(", returnedQuery=");
        LIZ.append(this.returnedQuery);
        LIZ.append(", relatedItem=");
        LIZ.append(this.relatedItem);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.aweme, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final long getId() {
        return this.id;
    }

    public final Integer getRelatedItem() {
        return this.relatedItem;
    }

    public final String getReturnedQuery() {
        return this.returnedQuery;
    }

    public Instruction(long j, String returnedQuery, Integer num, Aweme aweme) {
        o.LJIIIZ(returnedQuery, "returnedQuery");
        this.id = j;
        this.returnedQuery = returnedQuery;
        this.relatedItem = num;
        this.aweme = aweme;
    }

    public /* synthetic */ Instruction(long j, String str, Integer num, Aweme aweme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num, (i & 8) == 0 ? aweme : null);
    }
}
