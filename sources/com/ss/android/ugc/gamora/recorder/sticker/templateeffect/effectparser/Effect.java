package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Effect {

    @InterfaceC65349Pkn("bgms")
    public final List<String> bgms;

    @InterfaceC65349Pkn("Link")
    public final List<Link> links;

    @InterfaceC65349Pkn("model_names")
    public final Map<String, List<String>> modelNames;

    @InterfaceC65349Pkn("requirement")
    public final Map<String, Boolean> requirement;

    /* JADX WARN: Multi-variable type inference failed */
    public Effect() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effect)) {
            return false;
        }
        Effect effect = (Effect) obj;
        return o.LJ(this.links, effect.links) && o.LJ(this.modelNames, effect.modelNames) && o.LJ(this.bgms, effect.bgms) && o.LJ(this.requirement, effect.requirement);
    }

    public final int hashCode() {
        List<Link> list = this.links;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, List<String>> map = this.modelNames;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list2 = this.bgms;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, Boolean> map2 = this.requirement;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect(links=");
        LIZ.append(this.links);
        LIZ.append(", modelNames=");
        LIZ.append(this.modelNames);
        LIZ.append(", bgms=");
        LIZ.append(this.bgms);
        LIZ.append(", requirement=");
        return C15890jp.LIZ(LIZ, this.requirement, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Effect(List<Link> list, Map<String, ? extends List<String>> map, List<String> list2, Map<String, Boolean> map2) {
        this.links = list;
        this.modelNames = map;
        this.bgms = list2;
        this.requirement = map2;
    }

    public /* synthetic */ Effect(List list, Map map, List list2, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : map2);
    }
}
