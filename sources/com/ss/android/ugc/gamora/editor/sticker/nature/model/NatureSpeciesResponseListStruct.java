package com.ss.android.ugc.gamora.editor.sticker.nature.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NatureSpeciesResponseListStruct {

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("nature_list")
    public final List<NatureSpeciesModel> natureList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NatureSpeciesResponseListStruct)) {
            return false;
        }
        NatureSpeciesResponseListStruct natureSpeciesResponseListStruct = (NatureSpeciesResponseListStruct) obj;
        return o.LJ(this.natureList, natureSpeciesResponseListStruct.natureList) && o.LJ(this.extra, natureSpeciesResponseListStruct.extra);
    }

    public final int hashCode() {
        int hashCode = this.natureList.hashCode() * 31;
        Map<String, String> map = this.extra;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NatureSpeciesResponseListStruct(natureList=");
        LIZ.append(this.natureList);
        LIZ.append(", extra=");
        return C15890jp.LIZ(LIZ, this.extra, ')', LIZ);
    }

    public NatureSpeciesResponseListStruct(List<NatureSpeciesModel> natureList, Map<String, String> map) {
        o.LJIIIZ(natureList, "natureList");
        this.natureList = natureList;
        this.extra = map;
    }

    public /* synthetic */ NatureSpeciesResponseListStruct(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : map);
    }
}
