package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GiftBoxInfo {

    @InterfaceC65349Pkn("capacity")
    public long capacity;

    @InterfaceC65349Pkn("is_primary_box")
    public boolean isPrimaryBox;

    @InterfaceC65349Pkn("scheme_url")
    public String schemeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftBoxInfo() {
        this(0L, false, null, 7, 0 == true ? 1 : 0);
    }

    public GiftBoxInfo(long j, boolean z, String str) {
        this.capacity = j;
        this.isPrimaryBox = z;
        this.schemeUrl = str;
    }

    public /* synthetic */ GiftBoxInfo(long j, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }
}
