package com.bytedance.android.livesdk.livesetting.model;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RecentlyLogIdSettings implements Serializable {

    @InterfaceC65349Pkn("enable_get_recently_logId")
    public boolean enable;

    @InterfaceC65349Pkn("enable_get_recently_logId_list")
    public List<String> list;

    /* JADX WARN: Multi-variable type inference failed */
    public RecentlyLogIdSettings() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<String> getList() {
        return this.list;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setList(List<String> list) {
        this.list = list;
    }

    public RecentlyLogIdSettings(boolean z, List<String> list) {
        this.enable = z;
        this.list = list;
    }

    public /* synthetic */ RecentlyLogIdSettings(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C47261Igj.LJJIJIIJI("/webcast/room/enter/", "/webcast/feed/") : list);
    }
}
