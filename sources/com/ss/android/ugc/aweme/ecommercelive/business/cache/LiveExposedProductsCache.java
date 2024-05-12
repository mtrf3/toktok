package com.ss.android.ugc.aweme.ecommercelive.business.cache;

import X.C00F;
import X.C221108m2;
import X.C62822Ol8;
import X.C71394S0g;
import X.InterfaceC65349Pkn;
import X.InterfaceC88472Yns;
import X.J76;
import X.X1D;
import android.util.LruCache;
import com.google.gson.g;
import com.google.gson.m;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LiveExposedProductsCache {
    public static final LiveExposedProductsCache LIZ = new LiveExposedProductsCache();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C71394S0g.LJLIL);

    public static m LIZIZ(String roomId, String str) {
        o.LJIIIZ(roomId, "roomId");
        if (str != null) {
            roomId = C00F.LIZIZ(roomId, '_', str);
        }
        RelatedProductInfo relatedProductInfo = (RelatedProductInfo) ((LruCache) LIZIZ.getValue()).get(roomId);
        if (relatedProductInfo != null) {
            m mVar = new m();
            mVar.LJJIIZ("room_id", relatedProductInfo.roomId);
            mVar.LJJIIZ("author_id", relatedProductInfo.authorId);
            g gVar = new g();
            Iterator<String> it = relatedProductInfo.expoProductIdList.iterator();
            while (it.hasNext()) {
                gVar.LJJIIJ(it.next());
            }
            mVar.LJJII("expo_product_id_list", gVar);
            g gVar2 = new g();
            Iterator<String> it2 = relatedProductInfo.clickProductIdList.iterator();
            while (it2.hasNext()) {
                gVar2.LJJIIJ(it2.next());
            }
            mVar.LJJII("click_product_id_list", gVar2);
            return mVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String str, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        String LIZIZ2;
        if (str2 == null) {
            LIZIZ2 = str;
        } else {
            LIZIZ2 = C00F.LIZIZ(str, '_', str2);
        }
        C62822Ol8 c62822Ol8 = LIZIZ;
        Object obj = ((LruCache) c62822Ol8.getValue()).get(LIZIZ2);
        if (obj != null) {
            interfaceC88472Yns.invoke(obj);
            return;
        }
        RelatedProductInfo relatedProductInfo = new RelatedProductInfo(str, str2, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
        interfaceC88472Yns.invoke(relatedProductInfo);
        ((LruCache) c62822Ol8.getValue()).put(LIZIZ2, relatedProductInfo);
    }

    /* loaded from: classes13.dex */
    public static final class RelatedProductInfo {

        @InterfaceC65349Pkn("author_id")
        public final String authorId;

        @InterfaceC65349Pkn("click_product_id_list")
        public final J76<String> clickProductIdList;

        @InterfaceC65349Pkn("expo_product_id_list")
        public final J76<String> expoProductIdList;

        @InterfaceC65349Pkn("room_id")
        public final String roomId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelatedProductInfo)) {
                return false;
            }
            RelatedProductInfo relatedProductInfo = (RelatedProductInfo) obj;
            return o.LJ(this.roomId, relatedProductInfo.roomId) && o.LJ(this.authorId, relatedProductInfo.authorId) && o.LJ(this.expoProductIdList, relatedProductInfo.expoProductIdList) && o.LJ(this.clickProductIdList, relatedProductInfo.clickProductIdList);
        }

        public final int hashCode() {
            int hashCode = this.roomId.hashCode() * 31;
            String str = this.authorId;
            return this.clickProductIdList.hashCode() + ((this.expoProductIdList.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RelatedProductInfo(roomId=");
            LIZ.append(this.roomId);
            LIZ.append(", authorId=");
            LIZ.append(this.authorId);
            LIZ.append(", expoProductIdList=");
            LIZ.append(this.expoProductIdList);
            LIZ.append(", clickProductIdList=");
            LIZ.append(this.clickProductIdList);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public RelatedProductInfo(String roomId, String str, J76<String> expoProductIdList, J76<String> clickProductIdList) {
            o.LJIIIZ(roomId, "roomId");
            o.LJIIIZ(expoProductIdList, "expoProductIdList");
            o.LJIIIZ(clickProductIdList, "clickProductIdList");
            this.roomId = roomId;
            this.authorId = str;
            this.expoProductIdList = expoProductIdList;
            this.clickProductIdList = clickProductIdList;
        }

        public /* synthetic */ RelatedProductInfo(String str, String str2, J76 j76, J76 j762, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new J76(50) : j76, (i & 8) != 0 ? new J76(50) : j762);
        }
    }
}
