package com.ss.android.ugc.aweme.autocut.sdk.data;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class RequestMusicMetaParam {

    @InterfaceC65349Pkn("meta_list")
    public List<RequestMusicMeta> metaList;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMusicMetaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RequestMusicMetaParam(List<RequestMusicMeta> list) {
        this.metaList = list;
    }

    public /* synthetic */ RequestMusicMetaParam(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
