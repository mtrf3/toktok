package com.ss.android.ugc.aweme.ecommerce.core.ecaction;

import X.C64797Pbt;
import X.C74542wE;
import X.E4Q;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface ECActionApi {
    public static final C74542wE LIZ = C74542wE.LIZ;

    @E4Q("api/v1/inbox/entrance/get")
    Object getInboxEntrance(InterfaceC67352kd<? super C64797Pbt<Response<InboxEntranceResponse>>> interfaceC67352kd);

    /* loaded from: classes2.dex */
    public static final class InboxEntranceResponse {

        @InterfaceC65349Pkn("cart_item_count")
        public final Integer cartItemCount;

        /* JADX WARN: Multi-variable type inference failed */
        public InboxEntranceResponse() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InboxEntranceResponse) && o.LJ(this.cartItemCount, ((InboxEntranceResponse) obj).cartItemCount);
        }

        public final int hashCode() {
            Integer num = this.cartItemCount;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InboxEntranceResponse(cartItemCount=");
            return s0.LIZJ(LIZ, this.cartItemCount, ')', LIZ);
        }

        public InboxEntranceResponse(Integer num) {
            this.cartItemCount = num;
        }

        public /* synthetic */ InboxEntranceResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }
}
