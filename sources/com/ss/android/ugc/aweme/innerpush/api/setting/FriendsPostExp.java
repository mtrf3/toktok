package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C221108m2;
import X.C62822Ol8;
import X.E1G;
import X.E1H;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class FriendsPostExp {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(E1H.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(E1G.LJLIL);

    /* loaded from: classes7.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("enable")
        public final int enable;

        @InterfaceC65349Pkn("high_activity_only")
        public final int highActivityOnly;

        @InterfaceC65349Pkn("high_affinity_only")
        public final int highAffinityOnly;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MetaData() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.setting.FriendsPostExp.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.enable == metaData.enable && this.highActivityOnly == metaData.highActivityOnly && this.highAffinityOnly == metaData.highAffinityOnly;
        }

        public final int hashCode() {
            return (((this.enable * 31) + this.highActivityOnly) * 31) + this.highAffinityOnly;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(enable=");
            LIZ.append(this.enable);
            LIZ.append(", highActivityOnly=");
            LIZ.append(this.highActivityOnly);
            LIZ.append(", highAffinityOnly=");
            return b0.LIZJ(LIZ, this.highAffinityOnly, ')', LIZ);
        }

        public MetaData(int i, int i2, int i3) {
            this.enable = i;
            this.highActivityOnly = i2;
            this.highAffinityOnly = i3;
        }

        public /* synthetic */ MetaData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    static {
        int i = 0;
        LIZ = new MetaData(i, i, i, 7, null);
    }
}
