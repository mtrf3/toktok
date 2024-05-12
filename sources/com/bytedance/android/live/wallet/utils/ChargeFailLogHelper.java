package com.bytedance.android.live.wallet.utils;

import X.C09650Zl;
import X.C79062V1e;
import X.CN1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ChargeFailLogHelper {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public static final class ChargeFailEntity {

        @InterfaceC65349Pkn("detail_code")
        public final int detailCode;

        @InterfaceC65349Pkn("error_code")
        public final int errorCode;

        @InterfaceC65349Pkn("error_message")
        public final String msg;

        @InterfaceC65349Pkn("order_id")
        public final String orderId;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ChargeFailEntity() {
            /*
                r7 = this;
                r1 = 0
                r3 = 0
                r5 = 15
                r0 = r7
                r2 = r1
                r4 = r3
                r6 = r3
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.utils.ChargeFailLogHelper.ChargeFailEntity.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChargeFailEntity)) {
                return false;
            }
            ChargeFailEntity chargeFailEntity = (ChargeFailEntity) obj;
            return this.errorCode == chargeFailEntity.errorCode && this.detailCode == chargeFailEntity.detailCode && o.LJ(this.msg, chargeFailEntity.msg) && o.LJ(this.orderId, chargeFailEntity.orderId);
        }

        public final int hashCode() {
            return this.orderId.hashCode() + C79062V1e.LJ(this.msg, ((this.errorCode * 31) + this.detailCode) * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ChargeFailEntity(errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", detailCode=");
            LIZ.append(this.detailCode);
            LIZ.append(", msg=");
            LIZ.append(this.msg);
            LIZ.append(", orderId=");
            return q.LIZIZ(LIZ, this.orderId, ')', LIZ);
        }

        public ChargeFailEntity(int i, int i2, String msg, String orderId) {
            o.LJIIIZ(msg, "msg");
            o.LJIIIZ(orderId, "orderId");
            this.errorCode = i;
            this.detailCode = i2;
            this.msg = msg;
            this.orderId = orderId;
        }

        public /* synthetic */ ChargeFailEntity(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2);
        }
    }

    public static void LIZ(int i, int i2, String str, String orId) {
        o.LJIIIZ(orId, "orId");
        if (str == null) {
            str = "";
        }
        ChargeFailEntity chargeFailEntity = new ChargeFailEntity(i, i2, str, orId);
        IHostUser iHostUser = (IHostUser) CN1.LIZ(IHostUser.class);
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, chargeFailEntity);
        o.LJIIIIZZ(json, "get().toJson(this)");
        iHostUser.event("recharge_fail", json);
    }
}
