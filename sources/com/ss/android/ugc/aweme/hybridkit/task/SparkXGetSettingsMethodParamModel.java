package com.ss.android.ugc.aweme.hybridkit.task;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SparkXGetSettingsMethodParamModel extends F9E {

    @InterfaceC65349Pkn("keys")
    public List<SparkSettingInfo> keys;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.keys};
    }

    public SparkXGetSettingsMethodParamModel(List<SparkSettingInfo> keys) {
        o.LJIIIZ(keys, "keys");
        this.keys = keys;
    }
}
