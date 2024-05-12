package com.ss.android.ugc.aweme.ecommerce.core.engine;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BizParserInfo {

    @InterfaceC65349Pkn("biz_line")
    public final String biz_line;

    @InterfaceC65349Pkn("page_name")
    public final String page_name;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("template")
    public final Integer template;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizParserInfo)) {
            return false;
        }
        BizParserInfo bizParserInfo = (BizParserInfo) obj;
        return o.LJ(this.region, bizParserInfo.region) && o.LJ(this.biz_line, bizParserInfo.biz_line) && o.LJ(this.page_name, bizParserInfo.page_name) && o.LJ(this.template, bizParserInfo.template);
    }

    public final int hashCode() {
        String str = this.region;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biz_line;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.page_name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.template;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BizParserInfo(region=");
        LIZ.append(this.region);
        LIZ.append(", biz_line=");
        LIZ.append(this.biz_line);
        LIZ.append(", page_name=");
        LIZ.append(this.page_name);
        LIZ.append(", template=");
        return s0.LIZJ(LIZ, this.template, ')', LIZ);
    }

    public BizParserInfo(String str, String str2, String str3, Integer num) {
        this.region = str;
        this.biz_line = str2;
        this.page_name = str3;
        this.template = num;
    }
}
