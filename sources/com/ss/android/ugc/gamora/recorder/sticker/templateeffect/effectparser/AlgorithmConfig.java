package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AlgorithmConfig {

    @InterfaceC65349Pkn("mode")
    public final Integer mode;

    @InterfaceC65349Pkn("model_names")
    public final Map<String, List<String>> modelNames;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("nodes")
    public final List<Node> nodes;

    @InterfaceC65349Pkn("version")
    public final String version;

    public AlgorithmConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgorithmConfig)) {
            return false;
        }
        AlgorithmConfig algorithmConfig = (AlgorithmConfig) obj;
        return o.LJ(this.version, algorithmConfig.version) && o.LJ(this.mode, algorithmConfig.mode) && o.LJ(this.name, algorithmConfig.name) && o.LJ(this.modelNames, algorithmConfig.modelNames) && o.LJ(this.nodes, algorithmConfig.nodes);
    }

    public final int hashCode() {
        String str = this.version;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.mode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, List<String>> map = this.modelNames;
        return this.nodes.hashCode() + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AlgorithmConfig(version=");
        LIZ.append(this.version);
        LIZ.append(", mode=");
        LIZ.append(this.mode);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", modelNames=");
        LIZ.append(this.modelNames);
        LIZ.append(", nodes=");
        return C1NE.LIZIZ(LIZ, this.nodes, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlgorithmConfig(String str, Integer num, String str2, Map<String, ? extends List<String>> map, List<Node> nodes) {
        o.LJIIIZ(nodes, "nodes");
        this.version = str;
        this.mode = num;
        this.name = str2;
        this.modelNames = map;
        this.nodes = nodes;
    }

    public AlgorithmConfig(String str, Integer num, String str2, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? map : null, (i & 16) != 0 ? C61878OQg.INSTANCE : list);
    }
}
