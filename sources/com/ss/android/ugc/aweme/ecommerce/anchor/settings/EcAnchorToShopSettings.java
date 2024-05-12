package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.AnonymousClass391;
import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcAnchorToShopSettings {
    public static final EcAnchorToShopModel LIZ = new EcAnchorToShopModel(false, C47261Igj.LJJIJIL("snssdk1180.onelink.me"), C47261Igj.LJJIJIL("new_user_deal_page.js"));

    /* loaded from: classes7.dex */
    public static final class EcAnchorToShopModel {

        @InterfaceC65349Pkn("enable_anchor_to_shop")
        public final boolean enableAnchorToShop;

        @InterfaceC65349Pkn("host_white_list")
        public final List<String> hostWhiteList;

        @InterfaceC65349Pkn("path_white_list")
        public final List<String> pathWhiteList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcAnchorToShopModel)) {
                return false;
            }
            EcAnchorToShopModel ecAnchorToShopModel = (EcAnchorToShopModel) obj;
            return this.enableAnchorToShop == ecAnchorToShopModel.enableAnchorToShop && o.LJ(this.hostWhiteList, ecAnchorToShopModel.hostWhiteList) && o.LJ(this.pathWhiteList, ecAnchorToShopModel.pathWhiteList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enableAnchorToShop;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.pathWhiteList.hashCode() + AnonymousClass391.LIZIZ(this.hostWhiteList, r0 * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcAnchorToShopModel(enableAnchorToShop=");
            LIZ.append(this.enableAnchorToShop);
            LIZ.append(", hostWhiteList=");
            LIZ.append(this.hostWhiteList);
            LIZ.append(", pathWhiteList=");
            return C1NE.LIZIZ(LIZ, this.pathWhiteList, ')', LIZ);
        }

        public EcAnchorToShopModel(boolean z, List<String> hostWhiteList, List<String> pathWhiteList) {
            o.LJIIIZ(hostWhiteList, "hostWhiteList");
            o.LJIIIZ(pathWhiteList, "pathWhiteList");
            this.enableAnchorToShop = z;
            this.hostWhiteList = hostWhiteList;
            this.pathWhiteList = pathWhiteList;
        }
    }
}
