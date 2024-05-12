package com.ss.android.ugc.aweme.live.notification;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NotificationLiveStatus extends F9E {

    @InterfaceC65349Pkn("data")
    public final DataBean data;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.data, Integer.valueOf(this.statusCode)};
    }

    /* loaded from: classes5.dex */
    public static final class DataBean {

        @InterfaceC65349Pkn("push_status")
        public final int pushStatus;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataBean) && this.pushStatus == ((DataBean) obj).pushStatus;
        }

        public final int hashCode() {
            return this.pushStatus;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DataBean(pushStatus=");
            return b0.LIZJ(LIZ, this.pushStatus, ')', LIZ);
        }

        public DataBean(int i) {
            this.pushStatus = i;
        }
    }

    public NotificationLiveStatus(DataBean data, int i) {
        o.LJIIIZ(data, "data");
        this.data = data;
        this.statusCode = i;
    }

    public /* synthetic */ NotificationLiveStatus(DataBean dataBean, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataBean, (i2 & 2) != 0 ? 0 : i);
    }
}
