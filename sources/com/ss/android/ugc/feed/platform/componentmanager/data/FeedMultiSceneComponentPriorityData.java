package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedMultiSceneComponentPriorityData {
    public Map<String, GlobalComponentData> componentMap;
    public Map<String, ComponentContainerData> containerMap;

    @InterfaceC65349Pkn("component_list")
    public List<String> globalComponentList;

    @InterfaceC65349Pkn("scene_show_limit")
    public int globalShowLimit;

    @InterfaceC65349Pkn("component_update")
    public Map<String, GlobalComponentData> updateComponentMap;

    @InterfaceC65349Pkn("container_update")
    public Map<String, ComponentContainerData> updateContainerMap;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedMultiSceneComponentPriorityData() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedMultiSceneComponentPriorityData)) {
            return false;
        }
        FeedMultiSceneComponentPriorityData feedMultiSceneComponentPriorityData = (FeedMultiSceneComponentPriorityData) obj;
        return o.LJ(this.globalComponentList, feedMultiSceneComponentPriorityData.globalComponentList) && this.globalShowLimit == feedMultiSceneComponentPriorityData.globalShowLimit && o.LJ(this.updateComponentMap, feedMultiSceneComponentPriorityData.updateComponentMap) && o.LJ(this.updateContainerMap, feedMultiSceneComponentPriorityData.updateContainerMap) && o.LJ(this.containerMap, feedMultiSceneComponentPriorityData.containerMap) && o.LJ(this.componentMap, feedMultiSceneComponentPriorityData.componentMap);
    }

    public final int hashCode() {
        List<String> list = this.globalComponentList;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.globalShowLimit) * 31;
        Map<String, GlobalComponentData> map = this.updateComponentMap;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComponentContainerData> map2 = this.updateContainerMap;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, ComponentContainerData> map3 = this.containerMap;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, GlobalComponentData> map4 = this.componentMap;
        return hashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedMultiSceneComponentPriorityData(globalComponentList=");
        LIZ.append(this.globalComponentList);
        LIZ.append(", globalShowLimit=");
        LIZ.append(this.globalShowLimit);
        LIZ.append(", updateComponentMap=");
        LIZ.append(this.updateComponentMap);
        LIZ.append(", updateContainerMap=");
        LIZ.append(this.updateContainerMap);
        LIZ.append(", containerMap=");
        LIZ.append(this.containerMap);
        LIZ.append(", componentMap=");
        return C15890jp.LIZ(LIZ, this.componentMap, ')', LIZ);
    }

    public FeedMultiSceneComponentPriorityData(List<String> list, int i, Map<String, GlobalComponentData> map, Map<String, ComponentContainerData> map2, Map<String, ComponentContainerData> map3, Map<String, GlobalComponentData> map4) {
        this.globalComponentList = list;
        this.globalShowLimit = i;
        this.updateComponentMap = map;
        this.updateContainerMap = map2;
        this.containerMap = map3;
        this.componentMap = map4;
    }

    public /* synthetic */ FeedMultiSceneComponentPriorityData(List list, int i, Map map, Map map2, Map map3, Map map4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? null : map2, (i2 & 16) != 0 ? null : map3, (i2 & 32) == 0 ? map4 : null);
    }
}
