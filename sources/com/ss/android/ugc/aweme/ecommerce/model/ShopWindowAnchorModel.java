package com.ss.android.ugc.aweme.ecommerce.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShopWindowAnchorModel {
    public final ShopWindowExtraModel LIZ;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("platform")
    public final Integer platform;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public ShopWindowAnchorModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopWindowAnchorModel)) {
            return false;
        }
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) obj;
        return o.LJ(this.extra, shopWindowAnchorModel.extra) && o.LJ(this.LIZ, shopWindowAnchorModel.LIZ) && o.LJ(this.keyword, shopWindowAnchorModel.keyword) && o.LJ(this.id, shopWindowAnchorModel.id) && o.LJ(this.type, shopWindowAnchorModel.type) && o.LJ(this.platform, shopWindowAnchorModel.platform) && o.LJ(this.logExtra, shopWindowAnchorModel.logExtra) && o.LJ(this.schema, shopWindowAnchorModel.schema);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.id, C79062V1e.LJ(this.keyword, (this.LIZ.hashCode() + (this.extra.hashCode() * 31)) * 31, 31), 31);
        Integer num = this.type;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Integer num2 = this.platform;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return this.schema.hashCode() + C79062V1e.LJ(this.logExtra, (i2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopWindowAnchorModel(extra=");
        LIZ.append(this.extra);
        LIZ.append(", extraData=");
        LIZ.append(this.LIZ);
        LIZ.append(", keyword=");
        LIZ.append(this.keyword);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", platform=");
        LIZ.append(this.platform);
        LIZ.append(", logExtra=");
        LIZ.append(this.logExtra);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    public ShopWindowAnchorModel(String extra, ShopWindowExtraModel extraData, String keyword, String id, Integer num, Integer num2, String logExtra, String schema) {
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(extraData, "extraData");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(logExtra, "logExtra");
        o.LJIIIZ(schema, "schema");
        this.extra = extra;
        this.LIZ = extraData;
        this.keyword = keyword;
        this.id = id;
        this.type = num;
        this.platform = num2;
        this.logExtra = logExtra;
        this.schema = schema;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ShopWindowAnchorModel(String str, ShopWindowExtraModel shopWindowExtraModel, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ShopWindowExtraModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, 1, 0 == true ? 1 : 0) : shopWindowExtraModel, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? num2 : null, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? str5 : "");
    }
}
