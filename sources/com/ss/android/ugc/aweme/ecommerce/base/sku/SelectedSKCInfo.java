package com.ss.android.ugc.aweme.ecommerce.base.sku;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RVO;
import X.RVS;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SelectedSKCInfo implements Parcelable {

    @InterfaceC65349Pkn("cart_entry")
    public final CartEntry cartEntry;

    @InterfaceC65349Pkn("cart_item_id")
    public final String cartItemId;

    @InterfaceC65349Pkn("checked_spec_ids")
    public final List<String> checkedSpecIds;

    @InterfaceC65349Pkn("close_type")
    public final Integer closeType;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("post_sku_count")
    public final Integer postSkuCount;

    @InterfaceC65349Pkn("pre_sku_count")
    public final Integer preSkuCount;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("quantity")
    public final Integer quantity;
    public static final RVS Companion = new RVS();
    public static final Parcelable.Creator<SelectedSKCInfo> CREATOR = new RVO();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectedSKCInfo copy$default(SelectedSKCInfo selectedSKCInfo, List list, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, CartEntry cartEntry, ExceptionUX exceptionUX, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectedSKCInfo.checkedSpecIds;
        }
        if ((i & 2) != 0) {
            num = selectedSKCInfo.postSkuCount;
        }
        if ((i & 4) != 0) {
            num2 = selectedSKCInfo.quantity;
        }
        if ((i & 8) != 0) {
            num3 = selectedSKCInfo.preSkuCount;
        }
        if ((i & 16) != 0) {
            str = selectedSKCInfo.productId;
        }
        if ((i & 32) != 0) {
            str2 = selectedSKCInfo.cartItemId;
        }
        if ((i & 64) != 0) {
            num4 = selectedSKCInfo.closeType;
        }
        if ((i & 128) != 0) {
            cartEntry = selectedSKCInfo.cartEntry;
        }
        if ((i & 256) != 0) {
            exceptionUX = selectedSKCInfo.exceptionUX;
        }
        return selectedSKCInfo.copy(list, num, num2, num3, str, str2, num4, cartEntry, exceptionUX);
    }

    public final SelectedSKCInfo copy(List<String> list, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, CartEntry cartEntry, ExceptionUX exceptionUX) {
        return new SelectedSKCInfo(list, num, num2, num3, str, str2, num4, cartEntry, exceptionUX);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedSKCInfo)) {
            return false;
        }
        SelectedSKCInfo selectedSKCInfo = (SelectedSKCInfo) obj;
        return o.LJ(this.checkedSpecIds, selectedSKCInfo.checkedSpecIds) && o.LJ(this.postSkuCount, selectedSKCInfo.postSkuCount) && o.LJ(this.quantity, selectedSKCInfo.quantity) && o.LJ(this.preSkuCount, selectedSKCInfo.preSkuCount) && o.LJ(this.productId, selectedSKCInfo.productId) && o.LJ(this.cartItemId, selectedSKCInfo.cartItemId) && o.LJ(this.closeType, selectedSKCInfo.closeType) && o.LJ(this.cartEntry, selectedSKCInfo.cartEntry) && o.LJ(this.exceptionUX, selectedSKCInfo.exceptionUX);
    }

    public int hashCode() {
        List<String> list = this.checkedSpecIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.postSkuCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quantity;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.preSkuCount;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.productId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cartItemId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.closeType;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int hashCode8 = (hashCode7 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        return hashCode8 + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedSKCInfo(checkedSpecIds=");
        LIZ.append(this.checkedSpecIds);
        LIZ.append(", postSkuCount=");
        LIZ.append(this.postSkuCount);
        LIZ.append(", quantity=");
        LIZ.append(this.quantity);
        LIZ.append(", preSkuCount=");
        LIZ.append(this.preSkuCount);
        LIZ.append(", productId=");
        LIZ.append(this.productId);
        LIZ.append(", cartItemId=");
        LIZ.append(this.cartItemId);
        LIZ.append(", closeType=");
        LIZ.append(this.closeType);
        LIZ.append(", cartEntry=");
        LIZ.append(this.cartEntry);
        LIZ.append(", exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean isAddToCart() {
        Integer num = this.closeType;
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean isBuyNow() {
        Integer num = this.closeType;
        if (num == null || num.intValue() != 3) {
            return false;
        }
        return true;
    }

    public final boolean isCancel() {
        Integer num = this.closeType;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final String getCartItemId() {
        return this.cartItemId;
    }

    public final List<String> getCheckedSpecIds() {
        return this.checkedSpecIds;
    }

    public final Integer getCloseType() {
        return this.closeType;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final Integer getPostSkuCount() {
        return this.postSkuCount;
    }

    public final Integer getPreSkuCount() {
        return this.preSkuCount;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.checkedSpecIds);
        Integer num = this.postSkuCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.quantity;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.preSkuCount;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        out.writeString(this.productId);
        out.writeString(this.cartItemId);
        Integer num4 = this.closeType;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        out.writeParcelable(this.cartEntry, i);
        out.writeParcelable(this.exceptionUX, i);
    }

    public SelectedSKCInfo(List<String> list, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, CartEntry cartEntry, ExceptionUX exceptionUX) {
        this.checkedSpecIds = list;
        this.postSkuCount = num;
        this.quantity = num2;
        this.preSkuCount = num3;
        this.productId = str;
        this.cartItemId = str2;
        this.closeType = num4;
        this.cartEntry = cartEntry;
        this.exceptionUX = exceptionUX;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SelectedSKCInfo(java.util.List r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.Integer r18, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry r19, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r2 = r21
            r4 = r14
            r3 = r13
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r1 = r2 & 2
            r0 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L15
            r3 = r8
        L15:
            r0 = r2 & 4
            if (r0 == 0) goto L1e
            r0 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L1e:
            r0 = r2 & 8
            if (r0 == 0) goto L23
            r5 = r8
        L23:
            r0 = r2 & 16
            r10 = 0
            if (r0 == 0) goto L29
            r6 = r10
        L29:
            r0 = r2 & 32
            if (r0 == 0) goto L2e
            r7 = r10
        L2e:
            r0 = r2 & 64
            if (r0 == 0) goto L44
        L32:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L37
            r9 = r10
        L37:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L41
        L3b:
            r1 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L41:
            r10 = r20
            goto L3b
        L44:
            r8 = r18
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.SelectedSKCInfo.<init>(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
