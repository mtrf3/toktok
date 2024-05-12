package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C221108m2;
import X.C57121MbN;
import X.C57122MbO;
import X.C57123MbP;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InnerPushReverseExp {
    public static final MetaData LIZ = new MetaData(false, null, 3, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C57122MbO.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C57123MbP.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C57121MbN.LJLIL);

    public static boolean LIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    /* loaded from: classes10.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("filter_types")
        public final int[] filterTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaData() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.enable == metaData.enable && o.LJ(this.filterTypes, metaData.filterTypes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Arrays.hashCode(this.filterTypes) + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(enable=");
            LIZ.append(this.enable);
            LIZ.append(", filterTypes=");
            LIZ.append(Arrays.toString(this.filterTypes));
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public MetaData(boolean z, int[] filterTypes) {
            o.LJIIIZ(filterTypes, "filterTypes");
            this.enable = z;
            this.filterTypes = filterTypes;
        }

        public /* synthetic */ MetaData(boolean z, int[] iArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new int[0] : iArr);
        }
    }
}
