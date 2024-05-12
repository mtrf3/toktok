package com.ss.android.ugc.aweme.innerpush.settings;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import X.YBO;
import X.YBP;
import X.YBQ;
import X.YBR;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class InnerPushConfig {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(YBP.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(YBR.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(YBO.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(YBQ.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("ban_max_records")
        public final int banMaxRecords;

        @InterfaceC65349Pkn("display_id_max_records")
        public final int displayIdMaxRecord;

        @InterfaceC65349Pkn("popup_max_records")
        public final int popupMaxRecords;

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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.popupMaxRecords == metaData.popupMaxRecords && this.banMaxRecords == metaData.banMaxRecords && this.displayIdMaxRecord == metaData.displayIdMaxRecord;
        }

        public final int hashCode() {
            return (((this.popupMaxRecords * 31) + this.banMaxRecords) * 31) + this.displayIdMaxRecord;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(popupMaxRecords=");
            LIZ.append(this.popupMaxRecords);
            LIZ.append(", banMaxRecords=");
            LIZ.append(this.banMaxRecords);
            LIZ.append(", displayIdMaxRecord=");
            return b0.LIZJ(LIZ, this.displayIdMaxRecord, ')', LIZ);
        }

        public MetaData(int i, int i2, int i3) {
            this.popupMaxRecords = i;
            this.banMaxRecords = i2;
            this.displayIdMaxRecord = i3;
        }

        public /* synthetic */ MetaData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 50 : i, (i4 & 2) != 0 ? 50 : i2, (i4 & 4) != 0 ? 50 : i3);
        }
    }

    static {
        int i = 0;
        LIZ = new MetaData(i, i, i, 7, null);
    }
}
