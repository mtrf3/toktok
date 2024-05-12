package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KeyValueHolder extends F9E {

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("value")
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyValueHolder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KeyValueHolder copy$default(KeyValueHolder keyValueHolder, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyValueHolder.key;
        }
        if ((i & 2) != 0) {
            str2 = keyValueHolder.value;
        }
        return keyValueHolder.copy(str, str2);
    }

    public final KeyValueHolder copy(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return new KeyValueHolder(key, value);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.value};
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public KeyValueHolder(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.key = key;
        this.value = value;
    }

    public /* synthetic */ KeyValueHolder(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
