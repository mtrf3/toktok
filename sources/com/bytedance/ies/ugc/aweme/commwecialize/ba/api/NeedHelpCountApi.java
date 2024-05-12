package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC36226EJq;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes2.dex */
public interface NeedHelpCountApi {
    @InterfaceC36226EJq({"Content-Type: application/json"})
    @E4T("/api/ticket/newest_reply")
    AbstractC73672Svk<Object> getNeedHelpRedPointCount(@InterfaceC27211Am7 NeedHelpRequestBody needHelpRequestBody);

    /* loaded from: classes2.dex */
    public static final class NeedHelpRequestBody {

        @InterfaceC65349Pkn("clientType")
        public final int clientType;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NeedHelpRequestBody) && this.clientType == ((NeedHelpRequestBody) obj).clientType;
        }

        public final int hashCode() {
            return this.clientType;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NeedHelpRequestBody(clientType=");
            return b0.LIZJ(LIZ, this.clientType, ')', LIZ);
        }

        public NeedHelpRequestBody(int i) {
            this.clientType = i;
        }
    }
}
