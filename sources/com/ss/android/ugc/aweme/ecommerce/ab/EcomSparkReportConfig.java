package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C1NE;
import X.C32I;
import X.C51029K0z;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomSparkReportConfig {
    public static final EcomSparkReportConfig LIZ = new EcomSparkReportConfig();
    public static final EcomSparkReportConfigData LIZIZ;
    public static final Map<String, String> LIZJ;
    public static final Map<String, EcomSparkReportConfigModel> LIZLLL;

    /* loaded from: classes2.dex */
    public static final class EcomSparkReportConfigModel {

        @InterfaceC65349Pkn("channel")
        public String channel;

        @InterfaceC65349Pkn("page_name")
        public String pageName;

        @InterfaceC65349Pkn("sub_page_name")
        public String subPageName;

        @InterfaceC65349Pkn("sub_param")
        public String subParam;

        @InterfaceC65349Pkn("sub_value")
        public String subValue;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomSparkReportConfigModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcomSparkReportConfigModel copy$default(EcomSparkReportConfigModel ecomSparkReportConfigModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomSparkReportConfigModel.channel;
            }
            if ((i & 2) != 0) {
                str2 = ecomSparkReportConfigModel.pageName;
            }
            if ((i & 4) != 0) {
                str3 = ecomSparkReportConfigModel.subParam;
            }
            if ((i & 8) != 0) {
                str4 = ecomSparkReportConfigModel.subValue;
            }
            if ((i & 16) != 0) {
                str5 = ecomSparkReportConfigModel.subPageName;
            }
            return ecomSparkReportConfigModel.copy(str, str2, str3, str4, str5);
        }

        public final EcomSparkReportConfigModel copy(String channel, String pageName, String subParam, String subValue, String subPageName) {
            o.LJIIIZ(channel, "channel");
            o.LJIIIZ(pageName, "pageName");
            o.LJIIIZ(subParam, "subParam");
            o.LJIIIZ(subValue, "subValue");
            o.LJIIIZ(subPageName, "subPageName");
            return new EcomSparkReportConfigModel(channel, pageName, subParam, subValue, subPageName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomSparkReportConfigModel)) {
                return false;
            }
            EcomSparkReportConfigModel ecomSparkReportConfigModel = (EcomSparkReportConfigModel) obj;
            return o.LJ(this.channel, ecomSparkReportConfigModel.channel) && o.LJ(this.pageName, ecomSparkReportConfigModel.pageName) && o.LJ(this.subParam, ecomSparkReportConfigModel.subParam) && o.LJ(this.subValue, ecomSparkReportConfigModel.subValue) && o.LJ(this.subPageName, ecomSparkReportConfigModel.subPageName);
        }

        public int hashCode() {
            return this.subPageName.hashCode() + C79062V1e.LJ(this.subValue, C79062V1e.LJ(this.subParam, C79062V1e.LJ(this.pageName, this.channel.hashCode() * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomSparkReportConfigModel(channel=");
            LIZ.append(this.channel);
            LIZ.append(", pageName=");
            LIZ.append(this.pageName);
            LIZ.append(", subParam=");
            LIZ.append(this.subParam);
            LIZ.append(", subValue=");
            LIZ.append(this.subValue);
            LIZ.append(", subPageName=");
            return q.LIZIZ(LIZ, this.subPageName, ')', LIZ);
        }

        public final String getChannel() {
            return this.channel;
        }

        public final String getPageName() {
            return this.pageName;
        }

        public final String getSubPageName() {
            return this.subPageName;
        }

        public final String getSubParam() {
            return this.subParam;
        }

        public final String getSubValue() {
            return this.subValue;
        }

        public final void setChannel(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.channel = str;
        }

        public final void setPageName(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.pageName = str;
        }

        public final void setSubPageName(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.subPageName = str;
        }

        public final void setSubParam(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.subParam = str;
        }

        public final void setSubValue(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.subValue = str;
        }

        public EcomSparkReportConfigModel(String channel, String pageName, String subParam, String subValue, String subPageName) {
            o.LJIIIZ(channel, "channel");
            o.LJIIIZ(pageName, "pageName");
            o.LJIIIZ(subParam, "subParam");
            o.LJIIIZ(subValue, "subValue");
            o.LJIIIZ(subPageName, "subPageName");
            this.channel = channel;
            this.pageName = pageName;
            this.subParam = subParam;
            this.subValue = subValue;
            this.subPageName = subPageName;
        }

        public /* synthetic */ EcomSparkReportConfigModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
        }
    }

    /* loaded from: classes2.dex */
    public static final class EcomSparkReportConfigData {

        @InterfaceC65349Pkn("data")
        public List<EcomSparkReportConfigModel> data;

        public EcomSparkReportConfigData() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomSparkReportConfigData copy$default(EcomSparkReportConfigData ecomSparkReportConfigData, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ecomSparkReportConfigData.data;
            }
            return ecomSparkReportConfigData.copy(list);
        }

        public final EcomSparkReportConfigData copy(List<EcomSparkReportConfigModel> data) {
            o.LJIIIZ(data, "data");
            return new EcomSparkReportConfigData(data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcomSparkReportConfigData) && o.LJ(this.data, ((EcomSparkReportConfigData) obj).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomSparkReportConfigData(data=");
            return C1NE.LIZIZ(LIZ, this.data, ')', LIZ);
        }

        public final List<EcomSparkReportConfigModel> getData() {
            return this.data;
        }

        public EcomSparkReportConfigData(List<EcomSparkReportConfigModel> data) {
            o.LJIIIZ(data, "data");
            this.data = data;
        }

        public final void setData(List<EcomSparkReportConfigModel> list) {
            o.LJIIIZ(list, "<set-?>");
            this.data = list;
        }

        public EcomSparkReportConfigData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
        }
    }

    static {
        EcomSparkReportConfigData ecomSparkReportConfigData = new EcomSparkReportConfigData(null, 1, null);
        EcomSparkReportConfigData ecomSparkReportConfigData2 = (EcomSparkReportConfigData) SettingsManager.LIZLLL().LJIIIIZZ("ecom_spark_report_config", EcomSparkReportConfigData.class, ecomSparkReportConfigData);
        if (ecomSparkReportConfigData2 != null) {
            ecomSparkReportConfigData = ecomSparkReportConfigData2;
        }
        LIZIZ = ecomSparkReportConfigData;
        List<EcomSparkReportConfigModel> data = ecomSparkReportConfigData.getData();
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(data, 10));
        int i = 16;
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EcomSparkReportConfigModel ecomSparkReportConfigModel : data) {
            OSZ osz = new OSZ(ecomSparkReportConfigModel.getChannel(), ecomSparkReportConfigModel.getPageName());
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        LIZJ = linkedHashMap;
        List<EcomSparkReportConfigModel> data2 = LIZIZ.getData();
        int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(data2, 10));
        if (LJJIIZ2 >= 16) {
            i = LJJIIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (EcomSparkReportConfigModel ecomSparkReportConfigModel2 : data2) {
            EcomSparkReportConfigModel ecomSparkReportConfigModel3 = ecomSparkReportConfigModel2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(ecomSparkReportConfigModel3.getChannel());
            LIZ2.append('_');
            LIZ2.append(ecomSparkReportConfigModel3.getSubParam());
            LIZ2.append('_');
            LIZ2.append(ecomSparkReportConfigModel3.getSubValue());
            linkedHashMap2.put(X1D.LIZIZ(LIZ2), ecomSparkReportConfigModel2);
        }
        LIZLLL = linkedHashMap2;
    }
}
