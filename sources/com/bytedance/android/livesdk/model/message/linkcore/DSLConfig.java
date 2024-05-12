package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class DSLConfig extends F9E {

    @InterfaceC65349Pkn("layout_id")
    public String layoutId;

    @InterfaceC65349Pkn("scene_version")
    public int sceneVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public DSLConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sceneVersion), this.layoutId};
    }

    public DSLConfig(int i, String str) {
        this.sceneVersion = i;
        this.layoutId = str;
    }

    public /* synthetic */ DSLConfig(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
