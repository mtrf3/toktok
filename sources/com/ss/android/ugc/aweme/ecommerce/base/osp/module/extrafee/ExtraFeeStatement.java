package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExtraFeeStatement {

    @InterfaceC65349Pkn("arguments")
    public final Map<String, ExtraFeeRichText> arguments;

    @InterfaceC65349Pkn("template")
    public final String template;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraFeeStatement)) {
            return false;
        }
        ExtraFeeStatement extraFeeStatement = (ExtraFeeStatement) obj;
        return o.LJ(this.template, extraFeeStatement.template) && o.LJ(this.arguments, extraFeeStatement.arguments);
    }

    public final int hashCode() {
        String str = this.template;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, ExtraFeeRichText> map = this.arguments;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraFeeStatement(template=");
        LIZ.append(this.template);
        LIZ.append(", arguments=");
        return C15890jp.LIZ(LIZ, this.arguments, ')', LIZ);
    }

    public ExtraFeeStatement(String str, Map<String, ExtraFeeRichText> map) {
        this.template = str;
        this.arguments = map;
    }

    public /* synthetic */ ExtraFeeStatement(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
