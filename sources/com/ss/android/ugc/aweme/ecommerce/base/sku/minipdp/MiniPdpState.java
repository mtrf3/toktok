package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MiniPdpState implements InterfaceC61312at {
    public final Integer bottomNavBarStyle;
    public final List<String> currentSpecification;
    public final Boolean showCounter;
    public final SkuState skuStateSkuState;

    /* JADX WARN: Multi-variable type inference failed */
    public MiniPdpState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MiniPdpState copy$default(MiniPdpState miniPdpState, List list, Boolean bool, Integer num, SkuState skuState, int i, Object obj) {
        if ((i & 1) != 0) {
            list = miniPdpState.currentSpecification;
        }
        if ((i & 2) != 0) {
            bool = miniPdpState.showCounter;
        }
        if ((i & 4) != 0) {
            num = miniPdpState.bottomNavBarStyle;
        }
        if ((i & 8) != 0) {
            skuState = miniPdpState.skuStateSkuState;
        }
        return miniPdpState.copy(list, bool, num, skuState);
    }

    public final MiniPdpState copy(List<String> list, Boolean bool, Integer num, SkuState skuState) {
        return new MiniPdpState(list, bool, num, skuState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniPdpState)) {
            return false;
        }
        MiniPdpState miniPdpState = (MiniPdpState) obj;
        return o.LJ(this.currentSpecification, miniPdpState.currentSpecification) && o.LJ(this.showCounter, miniPdpState.showCounter) && o.LJ(this.bottomNavBarStyle, miniPdpState.bottomNavBarStyle) && o.LJ(this.skuStateSkuState, miniPdpState.skuStateSkuState);
    }

    public int hashCode() {
        List<String> list = this.currentSpecification;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.showCounter;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.bottomNavBarStyle;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SkuState skuState = this.skuStateSkuState;
        return hashCode3 + (skuState != null ? skuState.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MiniPdpState(currentSpecification=");
        LIZ.append(this.currentSpecification);
        LIZ.append(", showCounter=");
        LIZ.append(this.showCounter);
        LIZ.append(", bottomNavBarStyle=");
        LIZ.append(this.bottomNavBarStyle);
        LIZ.append(", skuStateSkuState=");
        LIZ.append(this.skuStateSkuState);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Integer getBottomNavBarStyle() {
        return this.bottomNavBarStyle;
    }

    public final List<String> getCurrentSpecification() {
        return this.currentSpecification;
    }

    public final Boolean getShowCounter() {
        return this.showCounter;
    }

    public final SkuState getSkuStateSkuState() {
        return this.skuStateSkuState;
    }

    public MiniPdpState(List<String> list, Boolean bool, Integer num, SkuState skuState) {
        this.currentSpecification = list;
        this.showCounter = bool;
        this.bottomNavBarStyle = num;
        this.skuStateSkuState = skuState;
    }

    public /* synthetic */ MiniPdpState(List list, Boolean bool, Integer num, SkuState skuState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : skuState);
    }
}
