package com.ss.android.ugc.aweme.property;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SmartCompileModelV2 extends SmartCompileBaseModel {

    @InterfaceC65349Pkn("enable")
    public final List<String> enable;

    public SmartCompileModelV2() {
        this(null, 0, null, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCompileModelV2(String scene, int i, String packageUrl, List<String> enable) {
        super(scene, i, packageUrl);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(packageUrl, "packageUrl");
        o.LJIIIZ(enable, "enable");
        this.enable = enable;
    }

    public SmartCompileModelV2(String str, int i, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? C61878OQg.INSTANCE : list);
    }
}
