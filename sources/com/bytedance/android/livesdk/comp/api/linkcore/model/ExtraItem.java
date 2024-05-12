package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ExtraItem extends F9E {
    public final long key;
    public final String value;

    public static /* synthetic */ ExtraItem copy$default(ExtraItem extraItem, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = extraItem.key;
        }
        if ((i & 2) != 0) {
            str = extraItem.value;
        }
        return extraItem.copy(j, str);
    }

    public final ExtraItem copy(long j, String value) {
        o.LJIIIZ(value, "value");
        return new ExtraItem(j, value);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.key), this.value};
    }

    public final long getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public ExtraItem(long j, String value) {
        o.LJIIIZ(value, "value");
        this.key = j;
        this.value = value;
    }
}
