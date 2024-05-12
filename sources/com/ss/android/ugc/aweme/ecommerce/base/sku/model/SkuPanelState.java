package com.ss.android.ugc.aweme.ecommerce.base.sku.model;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C63122Opy;
import X.InterfaceC65349Pkn;
import X.RVN;
import X.RXW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuPanelState implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SkuPanelState> CREATOR = new RVN();

    @InterfaceC65349Pkn("back_to_pdp")
    public boolean backToPdp;

    @InterfaceC65349Pkn("biz_type")
    public Integer bizType;

    @InterfaceC65349Pkn("cart_entry")
    public CartEntry cartEntry;

    @InterfaceC65349Pkn("checked_sku_ids")
    public String[] checkedSkuIds;

    @InterfaceC65349Pkn("click_image_source")
    public ImageSelectData clickImageSource;

    @InterfaceC65349Pkn("click_spec_group_ids")
    public ArrayList<Integer> clickSpecGroupIds;

    @InterfaceC65349Pkn("close_from")
    public int closeFrom;

    @InterfaceC65349Pkn("exception_ux")
    public ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("installment_plan")
    public InstallmentPlan installmentPlan;

    @InterfaceC65349Pkn("is_single_sku")
    public Boolean isSingleSku;

    @InterfaceC65349Pkn("link")
    public String link;

    @InterfaceC65349Pkn("need_open_third_app")
    public Boolean needOpenThirdApp;

    @InterfaceC65349Pkn("origin_price_value")
    public String originPriceValue;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("quantity")
    public Integer productQuantity;

    @InterfaceC65349Pkn("sale_price_value")
    public String salePriceValue;

    @InterfaceC65349Pkn("sku_id")
    public String skuId;

    @InterfaceC65349Pkn("start_buy_now_click_time")
    public Long startBuyNowClickTime;

    @InterfaceC65349Pkn("voucher_info")
    public SkuVoucher voucherInfo;

    @InterfaceC65349Pkn("warehouse_id")
    public String warehouseId;

    public static /* synthetic */ SkuPanelState copy$default(SkuPanelState skuPanelState, String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry, ExceptionUX exceptionUX, Boolean bool, String str4, Boolean bool2, String str5, String str6, ImageSelectData imageSelectData, ArrayList arrayList, Integer num2, Long l, InstallmentPlan installmentPlan, int i2, Object obj) {
        boolean z2 = z;
        String str7 = str2;
        String str8 = str;
        String str9 = str3;
        SkuVoucher skuVoucher2 = skuVoucher;
        String[] strArr2 = strArr;
        Integer num3 = num;
        String str10 = str5;
        CartEntry cartEntry2 = cartEntry;
        int i3 = i;
        ExceptionUX exceptionUX2 = exceptionUX;
        Boolean bool3 = bool;
        String str11 = str4;
        Boolean bool4 = bool2;
        InstallmentPlan installmentPlan2 = installmentPlan;
        ImageSelectData imageSelectData2 = imageSelectData;
        ArrayList arrayList2 = arrayList;
        String str12 = str6;
        Long l2 = l;
        Integer num4 = num2;
        if ((i2 & 1) != 0) {
            str8 = skuPanelState.productId;
        }
        if ((i2 & 2) != 0) {
            str7 = skuPanelState.skuId;
        }
        if ((i2 & 4) != 0) {
            str9 = skuPanelState.warehouseId;
        }
        if ((i2 & 8) != 0) {
            skuVoucher2 = skuPanelState.voucherInfo;
        }
        if ((i2 & 16) != 0) {
            strArr2 = skuPanelState.checkedSkuIds;
        }
        if ((i2 & 32) != 0) {
            num3 = skuPanelState.productQuantity;
        }
        if ((i2 & 64) != 0) {
            z2 = skuPanelState.backToPdp;
        }
        if ((i2 & 128) != 0) {
            i3 = skuPanelState.closeFrom;
        }
        if ((i2 & 256) != 0) {
            cartEntry2 = skuPanelState.cartEntry;
        }
        if ((i2 & 512) != 0) {
            exceptionUX2 = skuPanelState.exceptionUX;
        }
        if ((i2 & 1024) != 0) {
            bool3 = skuPanelState.isSingleSku;
        }
        if ((i2 & 2048) != 0) {
            str11 = skuPanelState.link;
        }
        if ((i2 & 4096) != 0) {
            bool4 = skuPanelState.needOpenThirdApp;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str10 = skuPanelState.salePriceValue;
        }
        if ((i2 & 16384) != 0) {
            str12 = skuPanelState.originPriceValue;
        }
        if ((32768 & i2) != 0) {
            imageSelectData2 = skuPanelState.clickImageSource;
        }
        if ((65536 & i2) != 0) {
            arrayList2 = skuPanelState.clickSpecGroupIds;
        }
        if ((131072 & i2) != 0) {
            num4 = skuPanelState.bizType;
        }
        if ((262144 & i2) != 0) {
            l2 = skuPanelState.startBuyNowClickTime;
        }
        if ((i2 & 524288) != 0) {
            installmentPlan2 = skuPanelState.installmentPlan;
        }
        return skuPanelState.copy(str8, str7, str9, skuVoucher2, strArr2, num3, z2, i3, cartEntry2, exceptionUX2, bool3, str11, bool4, str10, str12, imageSelectData2, arrayList2, num4, l2, installmentPlan2);
    }

    public final SkuPanelState copy(String productId, String str, String str2, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry, ExceptionUX exceptionUX, Boolean bool, String str3, Boolean bool2, String str4, String str5, ImageSelectData imageSelectData, ArrayList<Integer> arrayList, Integer num2, Long l, InstallmentPlan installmentPlan) {
        o.LJIIIZ(productId, "productId");
        return new SkuPanelState(productId, str, str2, skuVoucher, strArr, num, z, i, cartEntry, exceptionUX, bool, str3, bool2, str4, str5, imageSelectData, arrayList, num2, l, installmentPlan);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SkuPanelState(productId=" + this.productId + ", skuId=" + this.skuId + ", warehouseId=" + this.warehouseId + ", voucherInfo=" + this.voucherInfo + ", checkedSkuIds=" + Arrays.toString(this.checkedSkuIds) + ", productQuantity=" + this.productQuantity + ", backToPdp=" + this.backToPdp + ", closeFrom=" + this.closeFrom + ", cartEntry=" + this.cartEntry + ", exceptionUX=" + this.exceptionUX + ", isSingleSku=" + this.isSingleSku + ", link=" + this.link + ", needOpenThirdApp=" + this.needOpenThirdApp + ", salePriceValue=" + this.salePriceValue + ", originPriceValue=" + this.originPriceValue + ", clickImageSource=" + this.clickImageSource + ", clickSpecGroupIds=" + this.clickSpecGroupIds + ", bizType=" + this.bizType + ", startBuyNowClickTime=" + this.startBuyNowClickTime + ", installmentPlan=" + this.installmentPlan + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SkuPanelState m108clone() {
        String[] strArr;
        String str = this.productId;
        String str2 = this.skuId;
        String str3 = this.warehouseId;
        SkuVoucher skuVoucher = this.voucherInfo;
        String[] strArr2 = this.checkedSkuIds;
        if (strArr2 != null) {
            Object[] copyOf = Arrays.copyOf(strArr2, strArr2.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, size)");
            strArr = (String[]) copyOf;
        } else {
            strArr = null;
        }
        return new SkuPanelState(str, str2, str3, skuVoucher, strArr, this.productQuantity, this.backToPdp, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, this.link, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, this.clickImageSource, this.clickSpecGroupIds, 0 == true ? 1 : 0, 0 == true ? 1 : 0, this.installmentPlan, 423808, 0 == true ? 1 : 0);
    }

    public int hashCode() {
        int i;
        String[] strArr = this.checkedSkuIds;
        int i2 = 0;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Integer num = this.productQuantity;
        if (num != null) {
            i2 = num.intValue();
        }
        return this.productId.hashCode() + ((i3 + i2) * 31);
    }

    public final boolean getBackToPdp() {
        return this.backToPdp;
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final String[] getCheckedSkuIds() {
        return this.checkedSkuIds;
    }

    public final ImageSelectData getClickImageSource() {
        return this.clickImageSource;
    }

    public final ArrayList<Integer> getClickSpecGroupIds() {
        return this.clickSpecGroupIds;
    }

    public final int getCloseFrom() {
        return this.closeFrom;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final InstallmentPlan getInstallmentPlan() {
        return this.installmentPlan;
    }

    public final String getLink() {
        return this.link;
    }

    public final Boolean getNeedOpenThirdApp() {
        return this.needOpenThirdApp;
    }

    public final String getOriginPriceValue() {
        return this.originPriceValue;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Integer getProductQuantity() {
        return this.productQuantity;
    }

    public final String getSalePriceValue() {
        return this.salePriceValue;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final Long getStartBuyNowClickTime() {
        return this.startBuyNowClickTime;
    }

    public final SkuVoucher getVoucherInfo() {
        return this.voucherInfo;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public final Boolean isSingleSku() {
        return this.isSingleSku;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(SkuPanelState.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState");
        SkuPanelState skuPanelState = (SkuPanelState) obj;
        String[] strArr = this.checkedSkuIds;
        if (strArr != null) {
            if (skuPanelState.checkedSkuIds == null) {
                return false;
            }
            o.LJI(strArr);
            String[] strArr2 = skuPanelState.checkedSkuIds;
            o.LJI(strArr2);
            if (!Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (skuPanelState.checkedSkuIds != null) {
            return false;
        }
        if (o.LJ(this.productQuantity, skuPanelState.productQuantity) && o.LJ(this.productId, skuPanelState.productId)) {
            return true;
        }
        return false;
    }

    public final SkuItem getFullSkuItem(List<SkuItem> list) {
        String[] strArr;
        if (list == null || (strArr = this.checkedSkuIds) == null) {
            return null;
        }
        return RXW.LIZJ(C63122Opy.LIZ(strArr), list);
    }

    public final void setBackToPdp(boolean z) {
        this.backToPdp = z;
    }

    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    public final void setCartEntry(CartEntry cartEntry) {
        this.cartEntry = cartEntry;
    }

    public final void setCheckedSkuIds(String[] strArr) {
        this.checkedSkuIds = strArr;
    }

    public final void setClickImageSource(ImageSelectData imageSelectData) {
        this.clickImageSource = imageSelectData;
    }

    public final void setClickSpecGroupIds(ArrayList<Integer> arrayList) {
        this.clickSpecGroupIds = arrayList;
    }

    public final void setCloseFrom(int i) {
        this.closeFrom = i;
    }

    public final void setExceptionUX(ExceptionUX exceptionUX) {
        this.exceptionUX = exceptionUX;
    }

    public final void setInstallmentPlan(InstallmentPlan installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setNeedOpenThirdApp(Boolean bool) {
        this.needOpenThirdApp = bool;
    }

    public final void setOriginPriceValue(String str) {
        this.originPriceValue = str;
    }

    public final void setProductQuantity(Integer num) {
        this.productQuantity = num;
    }

    public final void setSalePriceValue(String str) {
        this.salePriceValue = str;
    }

    public final void setSingleSku(Boolean bool) {
        this.isSingleSku = bool;
    }

    public final void setSkuId(String str) {
        this.skuId = str;
    }

    public final void setStartBuyNowClickTime(Long l) {
        this.startBuyNowClickTime = l;
    }

    public final void setVoucherInfo(SkuVoucher skuVoucher) {
        this.voucherInfo = skuVoucher;
    }

    public final void setWarehouseId(String str) {
        this.warehouseId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
        out.writeString(this.skuId);
        out.writeString(this.warehouseId);
        SkuVoucher skuVoucher = this.voucherInfo;
        if (skuVoucher == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuVoucher.writeToParcel(out, i);
        }
        out.writeStringArray(this.checkedSkuIds);
        Integer num = this.productQuantity;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeInt(this.backToPdp ? 1 : 0);
        out.writeInt(this.closeFrom);
        out.writeParcelable(this.cartEntry, i);
        out.writeParcelable(this.exceptionUX, i);
        Boolean bool = this.isSingleSku;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.link);
        Boolean bool2 = this.needOpenThirdApp;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.salePriceValue);
        out.writeString(this.originPriceValue);
        ImageSelectData imageSelectData = this.clickImageSource;
        if (imageSelectData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageSelectData.writeToParcel(out, i);
        }
        ArrayList<Integer> arrayList = this.clickSpecGroupIds;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                out.writeInt(it.next().intValue());
            }
        }
        Integer num2 = this.bizType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Long l = this.startBuyNowClickTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        InstallmentPlan installmentPlan = this.installmentPlan;
        if (installmentPlan == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            installmentPlan.writeToParcel(out, i);
        }
    }

    public SkuPanelState(String productId, String str, String str2, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry, ExceptionUX exceptionUX, Boolean bool, String str3, Boolean bool2, String str4, String str5, ImageSelectData imageSelectData, ArrayList<Integer> arrayList, Integer num2, Long l, InstallmentPlan installmentPlan) {
        o.LJIIIZ(productId, "productId");
        this.productId = productId;
        this.skuId = str;
        this.warehouseId = str2;
        this.voucherInfo = skuVoucher;
        this.checkedSkuIds = strArr;
        this.productQuantity = num;
        this.backToPdp = z;
        this.closeFrom = i;
        this.cartEntry = cartEntry;
        this.exceptionUX = exceptionUX;
        this.isSingleSku = bool;
        this.link = str3;
        this.needOpenThirdApp = bool2;
        this.salePriceValue = str4;
        this.originPriceValue = str5;
        this.clickImageSource = imageSelectData;
        this.clickSpecGroupIds = arrayList;
        this.bizType = num2;
        this.startBuyNowClickTime = l;
        this.installmentPlan = installmentPlan;
    }

    public /* synthetic */ SkuPanelState(String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry, ExceptionUX exceptionUX, Boolean bool, String str4, Boolean bool2, String str5, String str6, ImageSelectData imageSelectData, ArrayList arrayList, Integer num2, Long l, InstallmentPlan installmentPlan, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, skuVoucher, strArr, num, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : cartEntry, (i2 & 512) != 0 ? null : exceptionUX, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : bool2, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : str5, (i2 & 16384) != 0 ? null : str6, (32768 & i2) != 0 ? null : imageSelectData, (65536 & i2) != 0 ? null : arrayList, (131072 & i2) != 0 ? null : num2, (262144 & i2) != 0 ? null : l, (i2 & 524288) == 0 ? installmentPlan : null);
    }
}
