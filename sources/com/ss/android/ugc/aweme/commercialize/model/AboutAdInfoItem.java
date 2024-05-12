package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AboutAdInfoItem implements Serializable {

    @InterfaceC65349Pkn("group_title")
    public String groupTitle;

    @InterfaceC65349Pkn("orientation_info")
    public List<OrientationInfo> orientationInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public AboutAdInfoItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getGroupTitle() {
        return this.groupTitle;
    }

    public final List<OrientationInfo> getOrientationInfo() {
        return this.orientationInfo;
    }

    public final void setGroupTitle(String str) {
        this.groupTitle = str;
    }

    public final void setOrientationInfo(List<OrientationInfo> list) {
        this.orientationInfo = list;
    }

    public AboutAdInfoItem(String str, List<OrientationInfo> list) {
        this.groupTitle = str;
        this.orientationInfo = list;
    }

    public /* synthetic */ AboutAdInfoItem(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
