package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TabConfig {

    @InterfaceC65349Pkn("bottom_tab")
    public final Map<String, List<BottomTab>> bottomTab;

    @InterfaceC65349Pkn("is_json_illegal")
    public Boolean isJsonIllegal;

    @InterfaceC65349Pkn("left_entrance")
    public final Entrance leftEntrance;

    @InterfaceC65349Pkn("right_entrance")
    public final Entrance rightEntrance;

    @InterfaceC65349Pkn("top_tab")
    public final TopTab topTab;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabConfig)) {
            return false;
        }
        TabConfig tabConfig = (TabConfig) obj;
        return o.LJ(this.isJsonIllegal, tabConfig.isJsonIllegal) && o.LJ(this.leftEntrance, tabConfig.leftEntrance) && o.LJ(this.rightEntrance, tabConfig.rightEntrance) && o.LJ(this.bottomTab, tabConfig.bottomTab) && o.LJ(this.topTab, tabConfig.topTab);
    }

    public final int hashCode() {
        Boolean bool = this.isJsonIllegal;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Entrance entrance = this.leftEntrance;
        int hashCode2 = (hashCode + (entrance == null ? 0 : entrance.hashCode())) * 31;
        Entrance entrance2 = this.rightEntrance;
        int hashCode3 = (hashCode2 + (entrance2 == null ? 0 : entrance2.hashCode())) * 31;
        Map<String, List<BottomTab>> map = this.bottomTab;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TopTab topTab = this.topTab;
        return hashCode4 + (topTab != null ? topTab.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TabConfig(isJsonIllegal=");
        LIZ.append(this.isJsonIllegal);
        LIZ.append(", leftEntrance=");
        LIZ.append(this.leftEntrance);
        LIZ.append(", rightEntrance=");
        LIZ.append(this.rightEntrance);
        LIZ.append(", bottomTab=");
        LIZ.append(this.bottomTab);
        LIZ.append(", topTab=");
        LIZ.append(this.topTab);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabConfig(Boolean bool, Entrance entrance, Entrance entrance2, Map<String, ? extends List<BottomTab>> map, TopTab topTab) {
        this.isJsonIllegal = bool;
        this.leftEntrance = entrance;
        this.rightEntrance = entrance2;
        this.bottomTab = map;
        this.topTab = topTab;
    }

    public /* synthetic */ TabConfig(Boolean bool, Entrance entrance, Entrance entrance2, Map map, TopTab topTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, entrance, entrance2, map, topTab);
    }
}
