package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticData {

    @InterfaceC65349Pkn("logistics")
    public final List<LogisticDTO> logistics;

    @InterfaceC65349Pkn("selected_logistics_service_id")
    public final String selectedLogisticsServiceId;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogisticData copy$default(LogisticData logisticData, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logisticData.title;
        }
        if ((i & 2) != 0) {
            list = logisticData.logistics;
        }
        if ((i & 4) != 0) {
            str2 = logisticData.selectedLogisticsServiceId;
        }
        return logisticData.copy(str, list, str2);
    }

    public final LogisticData copy(String str, List<LogisticDTO> list, String str2) {
        return new LogisticData(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticData)) {
            return false;
        }
        LogisticData logisticData = (LogisticData) obj;
        return o.LJ(this.title, logisticData.title) && o.LJ(this.logistics, logisticData.logistics) && o.LJ(this.selectedLogisticsServiceId, logisticData.selectedLogisticsServiceId);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<LogisticDTO> list = this.logistics;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.selectedLogisticsServiceId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticData(title=");
        LIZ.append(this.title);
        LIZ.append(", logistics=");
        LIZ.append(this.logistics);
        LIZ.append(", selectedLogisticsServiceId=");
        return q.LIZIZ(LIZ, this.selectedLogisticsServiceId, ')', LIZ);
    }

    public final List<LogisticDTO> getLogistics() {
        return this.logistics;
    }

    public final String getSelectedLogisticsServiceId() {
        return this.selectedLogisticsServiceId;
    }

    public final String getTitle() {
        return this.title;
    }

    public LogisticData(String str, List<LogisticDTO> list, String str2) {
        this.title = str;
        this.logistics = list;
        this.selectedLogisticsServiceId = str2;
    }
}
