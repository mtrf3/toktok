package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SelectRegionDTO {

    @InterfaceC65349Pkn("districts")
    public final List<Region> districts;

    @InterfaceC65349Pkn("enter_method")
    public final String enterMethod;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectRegionDTO copy$default(SelectRegionDTO selectRegionDTO, List list, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectRegionDTO.districts;
        }
        if ((i & 2) != 0) {
            str = selectRegionDTO.enterMethod;
        }
        if ((i & 4) != 0) {
            num = selectRegionDTO.status;
        }
        return selectRegionDTO.copy(list, str, num);
    }

    public final SelectRegionDTO copy(List<Region> list, String str, Integer num) {
        return new SelectRegionDTO(list, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectRegionDTO)) {
            return false;
        }
        SelectRegionDTO selectRegionDTO = (SelectRegionDTO) obj;
        return o.LJ(this.districts, selectRegionDTO.districts) && o.LJ(this.enterMethod, selectRegionDTO.enterMethod) && o.LJ(this.status, selectRegionDTO.status);
    }

    public int hashCode() {
        List<Region> list = this.districts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.enterMethod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.status;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectRegionDTO(districts=");
        LIZ.append(this.districts);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", status=");
        return s0.LIZJ(LIZ, this.status, ')', LIZ);
    }

    public final List<Region> getDistricts() {
        return this.districts;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public SelectRegionDTO(List<Region> list, String str, Integer num) {
        this.districts = list;
        this.enterMethod = str;
        this.status = num;
    }
}
