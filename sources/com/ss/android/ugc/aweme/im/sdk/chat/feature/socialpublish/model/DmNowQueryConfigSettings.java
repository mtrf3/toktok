package com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DmNowQueryConfigSettings {
    public static final DmNowQueryConfigModel LIZ = new DmNowQueryConfigModel(500, 50);

    /* loaded from: classes2.dex */
    public static final class DmNowQueryConfigModel {

        @InterfaceC65349Pkn("now_query_check_interval")
        public final long nowQueryCheckInterval;

        @InterfaceC65349Pkn("now_query_once_max_size")
        public final int nowQueryOnceMaxSize;

        public DmNowQueryConfigModel() {
            this(0L, 0, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DmNowQueryConfigModel)) {
                return false;
            }
            DmNowQueryConfigModel dmNowQueryConfigModel = (DmNowQueryConfigModel) obj;
            return this.nowQueryCheckInterval == dmNowQueryConfigModel.nowQueryCheckInterval && this.nowQueryOnceMaxSize == dmNowQueryConfigModel.nowQueryOnceMaxSize;
        }

        public final int hashCode() {
            return (C16880lQ.LLJIJIL(this.nowQueryCheckInterval) * 31) + this.nowQueryOnceMaxSize;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DmNowQueryConfigModel(nowQueryCheckInterval=");
            LIZ.append(this.nowQueryCheckInterval);
            LIZ.append(", nowQueryOnceMaxSize=");
            return b0.LIZJ(LIZ, this.nowQueryOnceMaxSize, ')', LIZ);
        }

        public DmNowQueryConfigModel(long j, int i) {
            this.nowQueryCheckInterval = j;
            this.nowQueryOnceMaxSize = i;
        }

        public /* synthetic */ DmNowQueryConfigModel(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 500L : j, (i2 & 2) != 0 ? 50 : i);
        }
    }
}
