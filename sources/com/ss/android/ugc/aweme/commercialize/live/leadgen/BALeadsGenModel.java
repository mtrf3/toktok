package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BALeadsGenModel {

    @InterfaceC65349Pkn("schema")
    public final String leadsGenSchema;

    @InterfaceC65349Pkn("cta_text")
    public final String leadsGenText;

    /* JADX WARN: Multi-variable type inference failed */
    public BALeadsGenModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BALeadsGenModel)) {
            return false;
        }
        BALeadsGenModel bALeadsGenModel = (BALeadsGenModel) obj;
        return o.LJ(this.leadsGenSchema, bALeadsGenModel.leadsGenSchema) && o.LJ(this.leadsGenText, bALeadsGenModel.leadsGenText);
    }

    public final int hashCode() {
        String str = this.leadsGenSchema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leadsGenText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BALeadsGenModel(leadsGenSchema=");
        LIZ.append(this.leadsGenSchema);
        LIZ.append(", leadsGenText=");
        return q.LIZIZ(LIZ, this.leadsGenText, ')', LIZ);
    }

    public BALeadsGenModel(String str, String str2) {
        this.leadsGenSchema = str;
        this.leadsGenText = str2;
    }

    public /* synthetic */ BALeadsGenModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
