package com.ss.android.ugc.aweme.hybridkit.task;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SparkSettingInfo extends F9E {

    @InterfaceC65349Pkn("biz")
    public String biz;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("type")
    public final String type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.key, this.type, this.biz};
    }

    public SparkSettingInfo(String str, String str2, String str3) {
        HH1.LIZ(str, "key", str2, "type", str3, "biz");
        this.key = str;
        this.type = str2;
        this.biz = str3;
    }

    public /* synthetic */ SparkSettingInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }
}
