package com.ss.android.ugc.awemepushlib.experiments;

import X.C221108m2;
import X.C62822Ol8;
import X.E1I;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Build;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PushMsgGroupAndLimitExp {
    public static final MetaData LIZ = new MetaData(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(E1I.LJLIL);

    /* loaded from: classes7.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("enable_custom_push_group")
        public final boolean enableCustomGroup;

        @InterfaceC65349Pkn("push_custom_group_cnt_up_limit")
        public final int pushCustomGroupCntUpLimit;

        @InterfaceC65349Pkn("push_msg_cnt_up_limit")
        public final int pushMsgCntUpLimit;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaData() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.enable == metaData.enable && this.enableCustomGroup == metaData.enableCustomGroup && this.pushMsgCntUpLimit == metaData.pushMsgCntUpLimit && this.pushCustomGroupCntUpLimit == metaData.pushCustomGroupCntUpLimit;
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
            return (((((r0 * 31) + (this.enableCustomGroup ? 1 : 0)) * 31) + this.pushMsgCntUpLimit) * 31) + this.pushCustomGroupCntUpLimit;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(enable=");
            LIZ.append(this.enable);
            LIZ.append(", enableCustomGroup=");
            LIZ.append(this.enableCustomGroup);
            LIZ.append(", pushMsgCntUpLimit=");
            LIZ.append(this.pushMsgCntUpLimit);
            LIZ.append(", pushCustomGroupCntUpLimit=");
            return b0.LIZJ(LIZ, this.pushCustomGroupCntUpLimit, ')', LIZ);
        }

        public MetaData(boolean z, boolean z2, int i, int i2) {
            this.enable = z;
            this.enableCustomGroup = z2;
            this.pushMsgCntUpLimit = i;
            this.pushCustomGroupCntUpLimit = i2;
        }

        public /* synthetic */ MetaData(boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 20 : i, (i3 & 8) != 0 ? 10 : i2);
        }
    }

    public static final boolean LIZ() {
        if (((MetaData) LIZIZ.getValue()).enable && Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ() {
        if (LIZ() && ((MetaData) LIZIZ.getValue()).enableCustomGroup) {
            return true;
        }
        return false;
    }
}
