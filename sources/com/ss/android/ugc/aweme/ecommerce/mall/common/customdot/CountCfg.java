package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CountCfg {

    @InterfaceC65349Pkn("basic_info_list")
    public final List<BasicInfo> basicInfoList;
    public final Integer count;

    @InterfaceC65349Pkn("show_type")
    public final Integer showType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountCfg copy$default(CountCfg countCfg, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = countCfg.showType;
        }
        if ((i & 2) != 0) {
            num2 = countCfg.count;
        }
        if ((i & 4) != 0) {
            list = countCfg.basicInfoList;
        }
        return countCfg.copy(num, num2, list);
    }

    public final CountCfg copy(Integer num, Integer num2, List<BasicInfo> list) {
        return new CountCfg(num, num2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountCfg)) {
            return false;
        }
        CountCfg countCfg = (CountCfg) obj;
        return o.LJ(this.showType, countCfg.showType) && o.LJ(this.count, countCfg.count) && o.LJ(this.basicInfoList, countCfg.basicInfoList);
    }

    public int hashCode() {
        Integer num = this.showType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BasicInfo> list = this.basicInfoList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CountCfg(showType=");
        LIZ.append(this.showType);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", basicInfoList=");
        return C1NE.LIZIZ(LIZ, this.basicInfoList, ')', LIZ);
    }

    public final List<BasicInfo> getBasicInfoList() {
        return this.basicInfoList;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public CountCfg(Integer num, Integer num2, List<BasicInfo> list) {
        this.showType = num;
        this.count = num2;
        this.basicInfoList = list;
    }
}
