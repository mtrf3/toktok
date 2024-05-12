package com.bytedance.ies.im.core.exp;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.C87339YPn;
import X.C87340YPo;
import X.C87341YPp;
import X.C87342YPq;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class WsIMReconnectExp {
    public static final MetaData LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87342YPq.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87340YPo.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C87339YPn.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C87341YPp.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("enabled_reconnect_when_send_msg_ws_failed")
        public final boolean reconnectWhenSendMsgWsFailed;

        @InterfaceC65349Pkn("enabled_reconnect_when_send_msg_ws_unavailable")
        public final boolean reconnectWhenSendMsgWsUnavailable;

        @InterfaceC65349Pkn("enabled_reconnect_when_trigger_polling")
        public final boolean reconnectWhenTriggerPolling;

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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.exp.WsIMReconnectExp.MetaData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.reconnectWhenSendMsgWsUnavailable == metaData.reconnectWhenSendMsgWsUnavailable && this.reconnectWhenSendMsgWsFailed == metaData.reconnectWhenSendMsgWsFailed && this.reconnectWhenTriggerPolling == metaData.reconnectWhenTriggerPolling;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.reconnectWhenSendMsgWsUnavailable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.reconnectWhenSendMsgWsFailed;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            return ((i + i2) * 31) + (this.reconnectWhenTriggerPolling ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(reconnectWhenSendMsgWsUnavailable=");
            LIZ.append(this.reconnectWhenSendMsgWsUnavailable);
            LIZ.append(", reconnectWhenSendMsgWsFailed=");
            LIZ.append(this.reconnectWhenSendMsgWsFailed);
            LIZ.append(", reconnectWhenTriggerPolling=");
            return C48339Iy7.LIZJ(LIZ, this.reconnectWhenTriggerPolling, ')', LIZ);
        }

        public MetaData(boolean z, boolean z2, boolean z3) {
            this.reconnectWhenSendMsgWsUnavailable = z;
            this.reconnectWhenSendMsgWsFailed = z2;
            this.reconnectWhenTriggerPolling = z3;
        }

        public /* synthetic */ MetaData(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }

    static {
        boolean z = false;
        LIZ = new MetaData(z, z, z, 7, null);
    }
}
