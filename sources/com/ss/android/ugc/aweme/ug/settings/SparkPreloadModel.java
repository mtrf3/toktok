package com.ss.android.ugc.aweme.ug.settings;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SparkPreloadModel extends F9E {

    @InterfaceC65349Pkn("allowSchemaList")
    public final List<String> allowSchemaList;

    @InterfaceC65349Pkn("biz")
    public final String biz;

    @InterfaceC65349Pkn("denySchemaList")
    public final List<String> denySchemaList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("enableJSBOpt")
    public final boolean enableJSBOpt;

    @InterfaceC65349Pkn("expiredTimeInSeconds")
    public final int expiredTimeInSeconds;

    @InterfaceC65349Pkn("preloadDelayInSeconds")
    public final int preloadDelayInSeconds;

    @InterfaceC65349Pkn("splitWebviewInit")
    public final boolean splitWebviewInit;

    @InterfaceC65349Pkn("volumn")
    public final int volumn;

    public SparkPreloadModel() {
        this(false, 0, 0, null, null, null, false, 0, false, 511, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.volumn), Integer.valueOf(this.expiredTimeInSeconds), this.biz, this.allowSchemaList, this.denySchemaList, Boolean.valueOf(this.splitWebviewInit), Integer.valueOf(this.preloadDelayInSeconds), Boolean.valueOf(this.enableJSBOpt)};
    }

    public SparkPreloadModel(boolean z, int i, int i2, String biz, List<String> allowSchemaList, List<String> denySchemaList, boolean z2, int i3, boolean z3) {
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(allowSchemaList, "allowSchemaList");
        o.LJIIIZ(denySchemaList, "denySchemaList");
        this.enable = z;
        this.volumn = i;
        this.expiredTimeInSeconds = i2;
        this.biz = biz;
        this.allowSchemaList = allowSchemaList;
        this.denySchemaList = denySchemaList;
        this.splitWebviewInit = z2;
        this.preloadDelayInSeconds = i3;
        this.enableJSBOpt = z3;
    }

    public SparkPreloadModel(boolean z, int i, int i2, String str, List list, List list2, boolean z2, int i3, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? Integer.MAX_VALUE : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? C61878OQg.INSTANCE : list, (i4 & 32) != 0 ? C61878OQg.INSTANCE : list2, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) == 0 ? z3 : false);
    }
}
