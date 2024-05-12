package com.bytedance.android.live_settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.google.gson.j;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Group extends F9E {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("isDefault")
    public final boolean isDefault;

    @InterfaceC65349Pkn("value")
    public j value;

    public static /* synthetic */ Group copy$default(Group group, j jVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = group.value;
        }
        if ((i & 2) != 0) {
            str = group.desc;
        }
        if ((i & 4) != 0) {
            z = group.isDefault;
        }
        return group.copy(jVar, str, z);
    }

    public final Group copy(j value, String desc, boolean z) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(desc, "desc");
        return new Group(value, desc, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.value, this.desc, Boolean.valueOf(this.isDefault)};
    }

    public final String getDesc() {
        return this.desc;
    }

    public final j getValue() {
        return this.value;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final void setValue(j jVar) {
        o.LJIIIZ(jVar, "<set-?>");
        this.value = jVar;
    }

    public Group(j value, String desc, boolean z) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(desc, "desc");
        this.value = value;
        this.desc = desc;
        this.isDefault = z;
    }
}
