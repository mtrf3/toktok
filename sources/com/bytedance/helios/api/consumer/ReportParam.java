package com.bytedance.helios.api.consumer;

import X.C65950PuU;
import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ReportParam extends F9E {
    public static final C65950PuU Companion = new C65950PuU();
    public boolean isCheckConflict;
    public boolean isRemain;
    public String key;
    public String type;
    public Object value;

    public static /* synthetic */ ReportParam copy$default(ReportParam reportParam, String str, Object obj, String str2, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = reportParam.key;
        }
        if ((i & 2) != 0) {
            obj = reportParam.value;
        }
        if ((i & 4) != 0) {
            str2 = reportParam.type;
        }
        if ((i & 8) != 0) {
            z = reportParam.isRemain;
        }
        if ((i & 16) != 0) {
            z2 = reportParam.isCheckConflict;
        }
        return reportParam.copy(str, obj, str2, z, z2);
    }

    public final ReportParam copy(String key, Object obj, String type, boolean z, boolean z2) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(type, "type");
        return new ReportParam(key, obj, type, z, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.value, this.type, Boolean.valueOf(this.isRemain), Boolean.valueOf(this.isCheckConflict)};
    }

    public final String getKey() {
        return this.key;
    }

    public final String getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public final boolean isCheckConflict() {
        return this.isCheckConflict;
    }

    public final boolean isRemain() {
        return this.isRemain;
    }

    public final void setCheckConflict(boolean z) {
        this.isCheckConflict = z;
    }

    public final void setKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.key = str;
    }

    public final void setRemain(boolean z) {
        this.isRemain = z;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.type = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public ReportParam(String key, Object obj, String type, boolean z, boolean z2) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(type, "type");
        this.key = key;
        this.value = obj;
        this.type = type;
        this.isRemain = z;
        this.isCheckConflict = z2;
    }

    public /* synthetic */ ReportParam(String str, Object obj, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? "category" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }
}
