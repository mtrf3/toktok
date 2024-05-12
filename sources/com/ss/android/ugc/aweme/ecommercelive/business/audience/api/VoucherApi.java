package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.C71117Rvd;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.ClaimInfo;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public interface VoucherApi {
    public static final C71117Rvd LIZ = C71117Rvd.LIZ;

    /* loaded from: classes5.dex */
    public static final class ClaimVoucherRequest {

        @InterfaceC65349Pkn("claim_scene")
        public final int claimScene;

        @InterfaceC65349Pkn("is_owner")
        public final boolean isOwner;

        @InterfaceC65349Pkn("reload_product")
        public final int reloadProduct;

        @InterfaceC65349Pkn("room_id")
        public final long roomId;

        @InterfaceC65349Pkn("source")
        public final int source;

        @InterfaceC65349Pkn("voucher_type_id")
        public final String voucherTypeId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClaimVoucherRequest)) {
                return false;
            }
            ClaimVoucherRequest claimVoucherRequest = (ClaimVoucherRequest) obj;
            return o.LJ(this.voucherTypeId, claimVoucherRequest.voucherTypeId) && this.roomId == claimVoucherRequest.roomId && this.reloadProduct == claimVoucherRequest.reloadProduct && this.isOwner == claimVoucherRequest.isOwner && this.source == claimVoucherRequest.source && this.claimScene == claimVoucherRequest.claimScene;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            String str = this.voucherTypeId;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int LIZJ = (JBR.LIZJ(this.roomId, hashCode * 31, 31) + this.reloadProduct) * 31;
            boolean z = this.isOwner;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((((LIZJ + i) * 31) + this.source) * 31) + this.claimScene;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ClaimVoucherRequest(voucherTypeId=");
            LIZ.append(this.voucherTypeId);
            LIZ.append(", roomId=");
            LIZ.append(this.roomId);
            LIZ.append(", reloadProduct=");
            LIZ.append(this.reloadProduct);
            LIZ.append(", isOwner=");
            LIZ.append(this.isOwner);
            LIZ.append(", source=");
            LIZ.append(this.source);
            LIZ.append(", claimScene=");
            return b0.LIZJ(LIZ, this.claimScene, ')', LIZ);
        }

        public ClaimVoucherRequest(String str, long j, int i, boolean z, int i2, int i3) {
            this.voucherTypeId = str;
            this.roomId = j;
            this.reloadProduct = i;
            this.isOwner = z;
            this.source = i2;
            this.claimScene = i3;
        }
    }

    @E8M("/aweme/v1/oec/live/voucher/claim")
    Object claimVoucher(@InterfaceC195727mC ClaimVoucherRequest claimVoucherRequest, InterfaceC67352kd<? super BaseResponse<ClaimInfo>> interfaceC67352kd);
}
