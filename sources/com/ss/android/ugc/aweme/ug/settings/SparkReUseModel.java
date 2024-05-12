package com.ss.android.ugc.aweme.ug.settings;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SparkReUseModel extends F9E {

    @InterfaceC65349Pkn("allowSchemaList")
    public final List<String> allowSchemaList;

    @InterfaceC65349Pkn("biz")
    public final String biz;

    @InterfaceC65349Pkn("denySchemaList")
    public final List<String> denySchemaList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("expiredTimeInSeconds")
    public final int expiredTimeInSeconds;

    @InterfaceC65349Pkn("volumn")
    public final int volumn;

    public SparkReUseModel() {
        this(false, 0, 0, null, null, null, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.volumn), Integer.valueOf(this.expiredTimeInSeconds), this.biz, this.allowSchemaList, this.denySchemaList};
    }

    public SparkReUseModel(boolean z, int i, int i2, String biz, List<String> allowSchemaList, List<String> denySchemaList) {
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(allowSchemaList, "allowSchemaList");
        o.LJIIIZ(denySchemaList, "denySchemaList");
        this.enable = z;
        this.volumn = i;
        this.expiredTimeInSeconds = i2;
        this.biz = biz;
        this.allowSchemaList = allowSchemaList;
        this.denySchemaList = denySchemaList;
    }

    public SparkReUseModel(boolean z, int i, int i2, String str, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? Integer.MAX_VALUE : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? C61878OQg.INSTANCE : list, (i3 & 32) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
