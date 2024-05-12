package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C00F;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkMicALogToAppLogRegularBean {

    @InterfaceC65349Pkn("block_list")
    public List<String> blockList;

    @InterfaceC65349Pkn("level_allow_list")
    public List<String> levelAllowList;

    @InterfaceC65349Pkn("tag_module_allow_list")
    public List<String> tagModuleAllowList;

    public LinkMicALogToAppLogRegularBean() {
        this(null, null, null, 7, null);
    }

    public LinkMicALogToAppLogRegularBean(List<String> list, List<String> list2, List<String> list3) {
        C00F.LJ(list, "tagModuleAllowList", list2, "blockList", list3, "levelAllowList");
        this.tagModuleAllowList = list;
        this.blockList = list2;
        this.levelAllowList = list3;
    }

    public LinkMicALogToAppLogRegularBean(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
