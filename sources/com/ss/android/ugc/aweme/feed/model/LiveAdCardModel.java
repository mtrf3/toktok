package com.ss.android.ugc.aweme.feed.model;

import X.C69432nz;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LiveAdCardModel extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("component_data")
    public final ComponentData componentData;

    @InterfaceC65349Pkn("component_fail_reason")
    public final String componentFailReason;

    @InterfaceC65349Pkn("frontend_extra_data")
    public final Object frontendExtraData;

    @InterfaceC65349Pkn("live_products")
    public final Object liveProduct;

    public static /* synthetic */ LiveAdCardModel copy$default(LiveAdCardModel liveAdCardModel, ComponentData componentData, Object obj, Object obj2, String str, int i, Object obj3) {
        if ((i & 1) != 0) {
            componentData = liveAdCardModel.componentData;
        }
        if ((i & 2) != 0) {
            obj = liveAdCardModel.liveProduct;
        }
        if ((i & 4) != 0) {
            obj2 = liveAdCardModel.frontendExtraData;
        }
        if ((i & 8) != 0) {
            str = liveAdCardModel.componentFailReason;
        }
        return liveAdCardModel.copy(componentData, obj, obj2, str);
    }

    public final LiveAdCardModel copy(ComponentData componentData, Object obj, Object obj2, String str) {
        return new LiveAdCardModel(componentData, obj, obj2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveAdCardModel)) {
            return false;
        }
        LiveAdCardModel liveAdCardModel = (LiveAdCardModel) obj;
        return o.LJ(this.componentData, liveAdCardModel.componentData) && o.LJ(this.liveProduct, liveAdCardModel.liveProduct) && o.LJ(this.frontendExtraData, liveAdCardModel.frontendExtraData) && o.LJ(this.componentFailReason, liveAdCardModel.componentFailReason);
    }

    public int hashCode() {
        ComponentData componentData = this.componentData;
        int hashCode = (componentData == null ? 0 : componentData.hashCode()) * 31;
        Object obj = this.liveProduct;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.frontendExtraData;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.componentFailReason;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final LiveProduct getLiveProductCase() {
        if (this.liveProduct == null) {
            return null;
        }
        return (LiveProduct) GsonProtectorUtils.fromJson(C69432nz.LIZ(), GsonProtectorUtils.toJson(C69432nz.LIZ(), this.liveProduct), LiveProduct.class);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveAdCardModel(componentData=");
        LIZ.append(this.componentData);
        LIZ.append(", liveProduct=");
        LIZ.append(this.liveProduct);
        LIZ.append(", frontendExtraData=");
        LIZ.append(this.frontendExtraData);
        LIZ.append(", componentFailReason=");
        return q.LIZIZ(LIZ, this.componentFailReason, ')', LIZ);
    }

    public final ComponentData getComponentData() {
        return this.componentData;
    }

    public final String getComponentFailReason() {
        return this.componentFailReason;
    }

    public final Object getFrontendExtraData() {
        return this.frontendExtraData;
    }

    public final Object getLiveProduct() {
        return this.liveProduct;
    }

    public LiveAdCardModel(ComponentData componentData, Object obj, Object obj2, String str) {
        this.componentData = componentData;
        this.liveProduct = obj;
        this.frontendExtraData = obj2;
        this.componentFailReason = str;
    }
}
