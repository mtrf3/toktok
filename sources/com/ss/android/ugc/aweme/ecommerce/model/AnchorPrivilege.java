package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class AnchorPrivilege implements Serializable {

    @InterfaceC65349Pkn("anchor_privilege_items")
    public final List<AnchorPrivilegeItem> anchorPrivilegeItems;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @InterfaceC65349Pkn("privilege_style")
    public final List<Integer> privilegeStyle;

    @InterfaceC65349Pkn("privilege_text")
    public final List<String> privilegeText;

    @InterfaceC65349Pkn("reviews_amount")
    public final Integer reviewsAmount;

    @InterfaceC65349Pkn("sold_amount")
    public final Integer soldAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorPrivilege() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final List<AnchorPrivilegeItem> getAnchorPrivilegeItems() {
        return this.anchorPrivilegeItems;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final List<Integer> getPrivilegeStyle() {
        return this.privilegeStyle;
    }

    public final List<String> getPrivilegeText() {
        return this.privilegeText;
    }

    public final Integer getReviewsAmount() {
        return this.reviewsAmount;
    }

    public final Integer getSoldAmount() {
        return this.soldAmount;
    }

    public AnchorPrivilege(List<Integer> list, String str, Integer num, Integer num2, List<String> list2, List<AnchorPrivilegeItem> list3) {
        this.privilegeStyle = list;
        this.discountText = str;
        this.soldAmount = num;
        this.reviewsAmount = num2;
        this.privilegeText = list2;
        this.anchorPrivilegeItems = list3;
    }

    public /* synthetic */ AnchorPrivilege(List list, String str, Integer num, Integer num2, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : list2, (i & 32) == 0 ? list3 : null);
    }
}
