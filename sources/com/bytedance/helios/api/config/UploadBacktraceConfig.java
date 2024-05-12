package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UploadBacktraceConfig extends F9E {

    /* renamed from: default, reason: not valid java name */
    @InterfaceC65349Pkn("default")
    public final Set<String> f11default;

    @InterfaceC65349Pkn("web_image")
    public final Set<String> webImage;

    public UploadBacktraceConfig() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.f11default, this.webImage};
    }

    public UploadBacktraceConfig(Set<String> set, Set<String> webImage) {
        o.LJIIIZ(set, "default");
        o.LJIIIZ(webImage, "webImage");
        this.f11default = set;
        this.webImage = webImage;
    }

    public UploadBacktraceConfig(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2);
    }
}
