package com.ss.android.ugc.aweme.ecommerce.ug.util;

import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QuickPurchaseUtil {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("source_page_type", "entrance_form", "source_content_id", "product_source", "product_id", "author_id", "is_ad", "enter_from_info", "action_type", "rec_content_id", "rec_content_type", "request_id", "track_id", "mall_list_name", "purchase_path", "source_module");

    /* loaded from: classes7.dex */
    public static final class OrderRequestParams {

        @InterfaceC65349Pkn("one_step_order_type")
        public final int oneStepOrderType;

        @InterfaceC65349Pkn("order_shop")
        public final List<OrderShop> orderShopList;

        /* loaded from: classes7.dex */
        public static final class OrderShop {

            @InterfaceC65349Pkn("order_sku")
            public final List<OrderSku> orderSkuList;

            @InterfaceC65349Pkn("seller_id")
            public final String sellerId;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OrderShop copy$default(OrderShop orderShop, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = orderShop.sellerId;
                }
                if ((i & 2) != 0) {
                    list = orderShop.orderSkuList;
                }
                return orderShop.copy(str, list);
            }

            public final OrderShop copy(String str, List<OrderSku> orderSkuList) {
                o.LJIIIZ(orderSkuList, "orderSkuList");
                return new OrderShop(str, orderSkuList);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OrderShop)) {
                    return false;
                }
                OrderShop orderShop = (OrderShop) obj;
                return o.LJ(this.sellerId, orderShop.sellerId) && o.LJ(this.orderSkuList, orderShop.orderSkuList);
            }

            public int hashCode() {
                String str = this.sellerId;
                return this.orderSkuList.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            /* loaded from: classes13.dex */
            public static final class OrderSku {

                @InterfaceC65349Pkn("chain_key")
                public final String chainKey;

                @InterfaceC65349Pkn("entrance_info")
                public final String entranceInfo;

                @InterfaceC65349Pkn("kol_id")
                public final String kolId;

                @InterfaceC65349Pkn("product_id")
                public final String productId;

                @InterfaceC65349Pkn("quantity")
                public final int quantity;

                @InterfaceC65349Pkn("sku_id")
                public final String skuId;

                @InterfaceC65349Pkn("source")
                public final Integer source;

                public static /* synthetic */ OrderSku copy$default(OrderSku orderSku, String str, String str2, int i, Integer num, String str3, String str4, String str5, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = orderSku.productId;
                    }
                    if ((i2 & 2) != 0) {
                        str2 = orderSku.skuId;
                    }
                    if ((i2 & 4) != 0) {
                        i = orderSku.quantity;
                    }
                    if ((i2 & 8) != 0) {
                        num = orderSku.source;
                    }
                    if ((i2 & 16) != 0) {
                        str3 = orderSku.entranceInfo;
                    }
                    if ((i2 & 32) != 0) {
                        str4 = orderSku.chainKey;
                    }
                    if ((i2 & 64) != 0) {
                        str5 = orderSku.kolId;
                    }
                    return orderSku.copy(str, str2, i, num, str3, str4, str5);
                }

                public final OrderSku copy(String str, String str2, int i, Integer num, String str3, String str4, String str5) {
                    return new OrderSku(str, str2, i, num, str3, str4, str5);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OrderSku)) {
                        return false;
                    }
                    OrderSku orderSku = (OrderSku) obj;
                    return o.LJ(this.productId, orderSku.productId) && o.LJ(this.skuId, orderSku.skuId) && this.quantity == orderSku.quantity && o.LJ(this.source, orderSku.source) && o.LJ(this.entranceInfo, orderSku.entranceInfo) && o.LJ(this.chainKey, orderSku.chainKey) && o.LJ(this.kolId, orderSku.kolId);
                }

                public int hashCode() {
                    String str = this.productId;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.skuId;
                    int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.quantity) * 31;
                    Integer num = this.source;
                    int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                    String str3 = this.entranceInfo;
                    int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.chainKey;
                    int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.kolId;
                    return hashCode5 + (str5 != null ? str5.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("OrderSku(productId=");
                    LIZ.append(this.productId);
                    LIZ.append(", skuId=");
                    LIZ.append(this.skuId);
                    LIZ.append(", quantity=");
                    LIZ.append(this.quantity);
                    LIZ.append(", source=");
                    LIZ.append(this.source);
                    LIZ.append(", entranceInfo=");
                    LIZ.append(this.entranceInfo);
                    LIZ.append(", chainKey=");
                    LIZ.append(this.chainKey);
                    LIZ.append(", kolId=");
                    return q.LIZIZ(LIZ, this.kolId, ')', LIZ);
                }

                public final String getChainKey() {
                    return this.chainKey;
                }

                public final String getEntranceInfo() {
                    return this.entranceInfo;
                }

                public final String getKolId() {
                    return this.kolId;
                }

                public final String getProductId() {
                    return this.productId;
                }

                public final int getQuantity() {
                    return this.quantity;
                }

                public final String getSkuId() {
                    return this.skuId;
                }

                public final Integer getSource() {
                    return this.source;
                }

                public OrderSku(String str, String str2, int i, Integer num, String str3, String str4, String str5) {
                    this.productId = str;
                    this.skuId = str2;
                    this.quantity = i;
                    this.source = num;
                    this.entranceInfo = str3;
                    this.chainKey = str4;
                    this.kolId = str5;
                }

                public /* synthetic */ OrderSku(String str, String str2, int i, Integer num, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i2 & 4) != 0 ? 1 : i, num, str3, str4, str5);
                }
            }

            public String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OrderShop(sellerId=");
                LIZ.append(this.sellerId);
                LIZ.append(", orderSkuList=");
                return C1NE.LIZIZ(LIZ, this.orderSkuList, ')', LIZ);
            }

            public final List<OrderSku> getOrderSkuList() {
                return this.orderSkuList;
            }

            public final String getSellerId() {
                return this.sellerId;
            }

            public OrderShop(String str, List<OrderSku> orderSkuList) {
                o.LJIIIZ(orderSkuList, "orderSkuList");
                this.sellerId = str;
                this.orderSkuList = orderSkuList;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OrderRequestParams copy$default(OrderRequestParams orderRequestParams, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = orderRequestParams.orderShopList;
            }
            if ((i2 & 2) != 0) {
                i = orderRequestParams.oneStepOrderType;
            }
            return orderRequestParams.copy(list, i);
        }

        public final OrderRequestParams copy(List<OrderShop> orderShopList, int i) {
            o.LJIIIZ(orderShopList, "orderShopList");
            return new OrderRequestParams(orderShopList, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderRequestParams)) {
                return false;
            }
            OrderRequestParams orderRequestParams = (OrderRequestParams) obj;
            return o.LJ(this.orderShopList, orderRequestParams.orderShopList) && this.oneStepOrderType == orderRequestParams.oneStepOrderType;
        }

        public int hashCode() {
            return (this.orderShopList.hashCode() * 31) + this.oneStepOrderType;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OrderRequestParams(orderShopList=");
            LIZ.append(this.orderShopList);
            LIZ.append(", oneStepOrderType=");
            return b0.LIZJ(LIZ, this.oneStepOrderType, ')', LIZ);
        }

        public final int getOneStepOrderType() {
            return this.oneStepOrderType;
        }

        public final List<OrderShop> getOrderShopList() {
            return this.orderShopList;
        }

        public OrderRequestParams(List<OrderShop> orderShopList, int i) {
            o.LJIIIZ(orderShopList, "orderShopList");
            this.orderShopList = orderShopList;
            this.oneStepOrderType = i;
        }
    }
}
