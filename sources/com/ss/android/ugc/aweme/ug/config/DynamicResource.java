package com.ss.android.ugc.aweme.ug.config;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class DynamicResource extends F9E {

    @InterfaceC65349Pkn("cdnUrl")
    public final String cdnUrl;

    @InterfaceC65349Pkn("hash")
    public final String hash;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("size")
    public final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.key, this.cdnUrl, this.hash, Integer.valueOf(this.size)};
    }

    public DynamicResource(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "key", str2, "cdnUrl", str3, "hash");
        this.key = str;
        this.cdnUrl = str2;
        this.hash = str3;
        this.size = i;
    }

    public /* synthetic */ DynamicResource(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
