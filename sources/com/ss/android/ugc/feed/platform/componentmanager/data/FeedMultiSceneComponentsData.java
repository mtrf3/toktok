package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedMultiSceneComponentsData {

    @InterfaceC65349Pkn("global_component_map")
    public Map<String, GlobalComponentData> globalComponentMap;

    @InterfaceC65349Pkn("global_container_map")
    public Map<String, ComponentContainerData> globalContainerMap;

    @InterfaceC65349Pkn("scenes")
    public Map<String, FeedMultiSceneComponentPriorityData> multiSceneComponentPriorityData;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedMultiSceneComponentsData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedMultiSceneComponentsData)) {
            return false;
        }
        FeedMultiSceneComponentsData feedMultiSceneComponentsData = (FeedMultiSceneComponentsData) obj;
        return o.LJ(this.globalComponentMap, feedMultiSceneComponentsData.globalComponentMap) && o.LJ(this.globalContainerMap, feedMultiSceneComponentsData.globalContainerMap) && o.LJ(this.multiSceneComponentPriorityData, feedMultiSceneComponentsData.multiSceneComponentPriorityData);
    }

    public final int hashCode() {
        Map<String, GlobalComponentData> map = this.globalComponentMap;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, ComponentContainerData> map2 = this.globalContainerMap;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, FeedMultiSceneComponentPriorityData> map3 = this.multiSceneComponentPriorityData;
        return hashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedMultiSceneComponentsData(globalComponentMap=");
        LIZ.append(this.globalComponentMap);
        LIZ.append(", globalContainerMap=");
        LIZ.append(this.globalContainerMap);
        LIZ.append(", multiSceneComponentPriorityData=");
        return C15890jp.LIZ(LIZ, this.multiSceneComponentPriorityData, ')', LIZ);
    }

    public FeedMultiSceneComponentsData(Map<String, GlobalComponentData> map, Map<String, ComponentContainerData> map2, Map<String, FeedMultiSceneComponentPriorityData> map3) {
        this.globalComponentMap = map;
        this.globalContainerMap = map2;
        this.multiSceneComponentPriorityData = map3;
    }

    public /* synthetic */ FeedMultiSceneComponentsData(Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3);
    }
}
