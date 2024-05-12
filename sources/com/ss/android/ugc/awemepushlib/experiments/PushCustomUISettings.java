package com.ss.android.ugc.awemepushlib.experiments;

import X.C221108m2;
import X.C35717E0b;
import X.C48339Iy7;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PushCustomUISettings {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35717E0b.LJLIL);

    /* loaded from: classes7.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("can_add_video_play_icon")
        public final boolean canAddVideoPlayIcon;

        @InterfaceC65349Pkn("can_custom_group_msg")
        public final boolean canCustomGroup;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MetaData() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.experiments.PushCustomUISettings.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.canAddVideoPlayIcon == metaData.canAddVideoPlayIcon && this.canCustomGroup == metaData.canCustomGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.canAddVideoPlayIcon;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.canCustomGroup ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(canAddVideoPlayIcon=");
            LIZ.append(this.canAddVideoPlayIcon);
            LIZ.append(", canCustomGroup=");
            return C48339Iy7.LIZJ(LIZ, this.canCustomGroup, ')', LIZ);
        }

        public MetaData(boolean z, boolean z2) {
            this.canAddVideoPlayIcon = z;
            this.canCustomGroup = z2;
        }

        public /* synthetic */ MetaData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
        }
    }

    static {
        boolean z = false;
        LIZ = new MetaData(z, z, 3, null);
    }

    public static final boolean LIZ() {
        return ((MetaData) LIZIZ.getValue()).canAddVideoPlayIcon;
    }

    public static final boolean LIZIZ() {
        return ((MetaData) LIZIZ.getValue()).canCustomGroup;
    }
}
