package com.ss.android.ugc.aweme.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SurfaceViewConfig extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("settings")
    public final Map<String, Boolean> settings;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceViewConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.settings};
    }

    public SurfaceViewConfig(boolean z, Map<String, Boolean> settings) {
        o.LJIIIZ(settings, "settings");
        this.enable = z;
        this.settings = settings;
    }

    public /* synthetic */ SurfaceViewConfig(boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new HashMap() : map);
    }
}
