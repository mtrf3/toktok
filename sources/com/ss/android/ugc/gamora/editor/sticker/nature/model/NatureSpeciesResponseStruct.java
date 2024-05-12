package com.ss.android.ugc.gamora.editor.sticker.nature.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NatureSpeciesResponseStruct {

    @InterfaceC65349Pkn("extra")
    public final Map<String, String> extra;

    @InterfaceC65349Pkn("has_nature")
    public final boolean hasNature;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NatureSpeciesResponseStruct)) {
            return false;
        }
        NatureSpeciesResponseStruct natureSpeciesResponseStruct = (NatureSpeciesResponseStruct) obj;
        return this.hasNature == natureSpeciesResponseStruct.hasNature && o.LJ(this.extra, natureSpeciesResponseStruct.extra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.hasNature;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Map<String, String> map = this.extra;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NatureSpeciesResponseStruct(hasNature=");
        LIZ.append(this.hasNature);
        LIZ.append(", extra=");
        return C15890jp.LIZ(LIZ, this.extra, ')', LIZ);
    }

    public NatureSpeciesResponseStruct(boolean z, Map<String, String> map) {
        this.hasNature = z;
        this.extra = map;
    }

    public /* synthetic */ NatureSpeciesResponseStruct(boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : map);
    }
}
