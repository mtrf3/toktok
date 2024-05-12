package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.C10K;
import X.C42935Gt9;
import X.C770830u;
import X.E4Q;
import X.EFJ;
import X.EnumC42934Gt8;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import Y.AgS124S0100000_7;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class BAProductAnchorStateApi {
    public static final Keva LIZ = KevaImpl.getRepo("ba_product_anchor", 0);

    /* loaded from: classes8.dex */
    public interface ProductLinkStateApi {
        public static final C42935Gt9 LIZ = C42935Gt9.LIZ;

        @E4Q("/aweme/v1/ad/ba/video/link/user/")
        C10K<ProductLinkStateResponse> getProductLinkState(@InterfaceC64989Pez("enter_from") int i);
    }

    /* loaded from: classes8.dex */
    public static final class ProductLinkStateResponse implements Serializable {

        @InterfaceC65349Pkn("user_status")
        public final int linkStatus;

        @InterfaceC65349Pkn("status_msg")
        public final String msg;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ProductLinkStateResponse() {
            /*
                r6 = this;
                r1 = 0
                r2 = 0
                r4 = 7
                r0 = r6
                r3 = r1
                r5 = r2
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAProductAnchorStateApi.ProductLinkStateResponse.<init>():void");
        }

        public final int getLinkStatus() {
            return this.linkStatus;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public ProductLinkStateResponse(int i, String str, int i2) {
            this.statusCode = i;
            this.msg = str;
            this.linkStatus = i2;
        }

        public /* synthetic */ ProductLinkStateResponse(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    public static void LIZ(Map map) {
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it.next()).getValue();
                if (anchorPublishStruct.type == EnumC42934Gt8.BA_PRODUCT_ANCHOR.getTYPE()) {
                    ProductLinkStateApi.LIZ.getClass();
                    IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                    String str = EFJ.LIZJ;
                    ((ProductLinkStateApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ProductLinkStateApi.class)).getProductLinkState(1).LIZLLL(new AgS124S0100000_7(anchorPublishStruct, 5));
                }
            }
        }
    }
}
