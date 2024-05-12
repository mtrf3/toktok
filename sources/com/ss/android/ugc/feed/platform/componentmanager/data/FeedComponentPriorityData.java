package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedComponentPriorityData {

    @InterfaceC65349Pkn("container_map")
    public Map<String, ComponentContainerData> containerMap;

    @InterfaceC65349Pkn("global_component_list")
    public List<GlobalComponentData> globalComponentList;

    @InterfaceC65349Pkn("global_show_limit")
    public int globalShowLimit;
    public List<String> priorityList;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedComponentPriorityData() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedComponentPriorityData)) {
            return false;
        }
        FeedComponentPriorityData feedComponentPriorityData = (FeedComponentPriorityData) obj;
        return o.LJ(this.globalComponentList, feedComponentPriorityData.globalComponentList) && this.globalShowLimit == feedComponentPriorityData.globalShowLimit && o.LJ(this.containerMap, feedComponentPriorityData.containerMap) && o.LJ(this.priorityList, feedComponentPriorityData.priorityList);
    }

    public final int hashCode() {
        List<GlobalComponentData> list = this.globalComponentList;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.globalShowLimit) * 31;
        Map<String, ComponentContainerData> map = this.containerMap;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list2 = this.priorityList;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedComponentPriorityData(globalComponentList=");
        LIZ.append(this.globalComponentList);
        LIZ.append(", globalShowLimit=");
        LIZ.append(this.globalShowLimit);
        LIZ.append(", containerMap=");
        LIZ.append(this.containerMap);
        LIZ.append(", priorityList=");
        return C1NE.LIZIZ(LIZ, this.priorityList, ')', LIZ);
    }

    public FeedComponentPriorityData(List<GlobalComponentData> list, int i, Map<String, ComponentContainerData> map, List<String> list2) {
        this.globalComponentList = list;
        this.globalShowLimit = i;
        this.containerMap = map;
        this.priorityList = list2;
    }

    public /* synthetic */ FeedComponentPriorityData(List list, int i, Map map, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? null : list2);
    }
}
