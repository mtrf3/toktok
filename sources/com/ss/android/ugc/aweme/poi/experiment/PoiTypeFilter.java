package com.ss.android.ugc.aweme.poi.experiment;

import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PoiTypeFilter {
    public static final TypeFilter LIZ = new TypeFilter(C47261Igj.LJII("19a3a0", "19a3a1", "19a3a2", "19a3a3", "19a3a4", "19a3a5", "19a3a6"), new ArrayList());

    /* loaded from: classes2.dex */
    public static final class TypeFilter {

        @InterfaceC65349Pkn("type_code_allow")
        public final List<String> typeCodeAllow;

        @InterfaceC65349Pkn("type_code_ban")
        public final List<String> typeCodeBan;

        /* JADX WARN: Multi-variable type inference failed */
        public TypeFilter() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeFilter)) {
                return false;
            }
            TypeFilter typeFilter = (TypeFilter) obj;
            return o.LJ(this.typeCodeAllow, typeFilter.typeCodeAllow) && o.LJ(this.typeCodeBan, typeFilter.typeCodeBan);
        }

        public final int hashCode() {
            List<String> list = this.typeCodeAllow;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.typeCodeBan;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TypeFilter(typeCodeAllow=");
            LIZ.append(this.typeCodeAllow);
            LIZ.append(", typeCodeBan=");
            return C1NE.LIZIZ(LIZ, this.typeCodeBan, ')', LIZ);
        }

        public TypeFilter(List<String> list, List<String> list2) {
            this.typeCodeAllow = list;
            this.typeCodeBan = list2;
        }

        public /* synthetic */ TypeFilter(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
        }
    }
}
