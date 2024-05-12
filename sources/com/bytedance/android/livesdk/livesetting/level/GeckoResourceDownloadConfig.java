package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GeckoResourceDownloadConfig {

    @InterfaceC65349Pkn("client_resource_channels")
    public List<String> geckoResourceDownloadList;

    /* JADX WARN: Multi-variable type inference failed */
    public GeckoResourceDownloadConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GeckoResourceDownloadConfig(List<String> list) {
        this.geckoResourceDownloadList = list;
    }

    public /* synthetic */ GeckoResourceDownloadConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
