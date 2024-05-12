package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Control extends F9E {

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("match_setting_task_key")
    public String taskName;

    @InterfaceC65349Pkn("time")
    public int time;

    @InterfaceC65349Pkn("type")
    public int type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), Integer.valueOf(this.time), Integer.valueOf(this.count), this.taskName};
    }

    public Control(int i, int i2, int i3, String str) {
        this.type = i;
        this.time = i2;
        this.count = i3;
        this.taskName = str;
    }

    public /* synthetic */ Control(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, i2, i3, str);
    }
}
