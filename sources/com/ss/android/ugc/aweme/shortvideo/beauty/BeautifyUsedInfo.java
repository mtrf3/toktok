package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BeautifyUsedInfo extends F9E {

    @InterfaceC65349Pkn("beautify_used_info")
    public final List<BeautifyUesTabInfo> info;

    /* JADX WARN: Multi-variable type inference failed */
    public BeautifyUsedInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.info};
    }

    public BeautifyUsedInfo(List<BeautifyUesTabInfo> info) {
        o.LJIIIZ(info, "info");
        this.info = info;
    }

    public /* synthetic */ BeautifyUsedInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CopyOnWriteArrayList() : list);
    }
}
