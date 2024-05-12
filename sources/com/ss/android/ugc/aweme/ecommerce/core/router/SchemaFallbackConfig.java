package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SchemaFallbackConfig extends F9E {

    @InterfaceC65349Pkn("fallback")
    public final String fallback;

    @InterfaceC65349Pkn("key")
    public final String key;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemaFallbackConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SchemaFallbackConfig copy$default(SchemaFallbackConfig schemaFallbackConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaFallbackConfig.key;
        }
        if ((i & 2) != 0) {
            str2 = schemaFallbackConfig.fallback;
        }
        return schemaFallbackConfig.copy(str, str2);
    }

    public final SchemaFallbackConfig copy(String key, String fallback) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(fallback, "fallback");
        return new SchemaFallbackConfig(key, fallback);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.fallback};
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final String getKey() {
        return this.key;
    }

    public SchemaFallbackConfig(String key, String fallback) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(fallback, "fallback");
        this.key = key;
        this.fallback = fallback;
    }

    public /* synthetic */ SchemaFallbackConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
