package com.ss.android.ugc.aweme.ecommerce.image;

import X.AnonymousClass391;
import X.C00F;
import X.C113554cx;
import X.C1NE;
import X.C32I;
import X.C51029K0z;
import X.C61878OQg;
import X.C78685UuP;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.N2Q;
import X.N2R;
import X.WM7;
import X.X1D;
import defpackage.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EcomImageXConfig {
    public static final EcomImageXConfig LIZ = new EcomImageXConfig();
    public static final EcomImageXConfigData LIZIZ;
    public static final Map<String, EcomImageXConfigModel> LIZJ;
    public static final Map<String, EcomImageXConfigModel> LIZLLL;

    /* loaded from: classes11.dex */
    public static final class EcomImageXConfigData {

        @InterfaceC65349Pkn("config")
        public final List<EcomImageXConfigModel> config;

        @InterfaceC65349Pkn("origin_template")
        public final List<String> originTemplate;

        @InterfaceC65349Pkn("service_id")
        public final List<String> serviceID;

        public EcomImageXConfigData() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomImageXConfigData copy$default(EcomImageXConfigData ecomImageXConfigData, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ecomImageXConfigData.serviceID;
            }
            if ((i & 2) != 0) {
                list2 = ecomImageXConfigData.originTemplate;
            }
            if ((i & 4) != 0) {
                list3 = ecomImageXConfigData.config;
            }
            return ecomImageXConfigData.copy(list, list2, list3);
        }

        public final EcomImageXConfigData copy(List<String> serviceID, List<String> originTemplate, List<EcomImageXConfigModel> config) {
            o.LJIIIZ(serviceID, "serviceID");
            o.LJIIIZ(originTemplate, "originTemplate");
            o.LJIIIZ(config, "config");
            return new EcomImageXConfigData(serviceID, originTemplate, config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomImageXConfigData)) {
                return false;
            }
            EcomImageXConfigData ecomImageXConfigData = (EcomImageXConfigData) obj;
            return o.LJ(this.serviceID, ecomImageXConfigData.serviceID) && o.LJ(this.originTemplate, ecomImageXConfigData.originTemplate) && o.LJ(this.config, ecomImageXConfigData.config);
        }

        public int hashCode() {
            return this.config.hashCode() + AnonymousClass391.LIZIZ(this.originTemplate, this.serviceID.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomImageXConfigData(serviceID=");
            LIZ.append(this.serviceID);
            LIZ.append(", originTemplate=");
            LIZ.append(this.originTemplate);
            LIZ.append(", config=");
            return C1NE.LIZIZ(LIZ, this.config, ')', LIZ);
        }

        public final List<EcomImageXConfigModel> getConfig() {
            return this.config;
        }

        public final List<String> getOriginTemplate() {
            return this.originTemplate;
        }

        public final List<String> getServiceID() {
            return this.serviceID;
        }

        public EcomImageXConfigData(List<String> list, List<String> list2, List<EcomImageXConfigModel> list3) {
            C00F.LJ(list, "serviceID", list2, "originTemplate", list3, "config");
            this.serviceID = list;
            this.originTemplate = list2;
            this.config = list3;
        }

        public EcomImageXConfigData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3);
        }
    }

    /* loaded from: classes11.dex */
    public static final class EcomImageXConfigModel {

        /* renamed from: default, reason: not valid java name */
        @InterfaceC65349Pkn("default")
        public final String f22default;

        @InterfaceC65349Pkn("format")
        public final String format;

        @InterfaceC65349Pkn("page")
        public final String page;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public final String scene;

        @InterfaceC65349Pkn("template")
        public final String template;

        @InterfaceC65349Pkn("width")
        public final Integer width;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomImageXConfigModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcomImageXConfigModel copy$default(EcomImageXConfigModel ecomImageXConfigModel, String str, String str2, String str3, String str4, String str5, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomImageXConfigModel.scene;
            }
            if ((i & 2) != 0) {
                str2 = ecomImageXConfigModel.page;
            }
            if ((i & 4) != 0) {
                str3 = ecomImageXConfigModel.f22default;
            }
            if ((i & 8) != 0) {
                str4 = ecomImageXConfigModel.template;
            }
            if ((i & 16) != 0) {
                str5 = ecomImageXConfigModel.format;
            }
            if ((i & 32) != 0) {
                num = ecomImageXConfigModel.width;
            }
            return ecomImageXConfigModel.copy(str, str2, str3, str4, str5, num);
        }

        public final EcomImageXConfigModel copy(String str, String str2, String str3, String str4, String str5, Integer num) {
            return new EcomImageXConfigModel(str, str2, str3, str4, str5, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomImageXConfigModel)) {
                return false;
            }
            EcomImageXConfigModel ecomImageXConfigModel = (EcomImageXConfigModel) obj;
            return o.LJ(this.scene, ecomImageXConfigModel.scene) && o.LJ(this.page, ecomImageXConfigModel.page) && o.LJ(this.f22default, ecomImageXConfigModel.f22default) && o.LJ(this.template, ecomImageXConfigModel.template) && o.LJ(this.format, ecomImageXConfigModel.format) && o.LJ(this.width, ecomImageXConfigModel.width);
        }

        public int hashCode() {
            String str = this.scene;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.page;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f22default;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.template;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.format;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.width;
            return hashCode5 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomImageXConfigModel(scene=");
            LIZ.append(this.scene);
            LIZ.append(", page=");
            LIZ.append(this.page);
            LIZ.append(", default=");
            LIZ.append(this.f22default);
            LIZ.append(", template=");
            LIZ.append(this.template);
            LIZ.append(", format=");
            LIZ.append(this.format);
            LIZ.append(", width=");
            return s0.LIZJ(LIZ, this.width, ')', LIZ);
        }

        public final String getDefault() {
            return this.f22default;
        }

        public final String getFormat() {
            return this.format;
        }

        public final String getPage() {
            return this.page;
        }

        public final String getScene() {
            return this.scene;
        }

        public final String getTemplate() {
            return this.template;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public EcomImageXConfigModel(String str, String str2, String str3, String str4, String str5, Integer num) {
            this.scene = str;
            this.page = str2;
            this.f22default = str3;
            this.template = str4;
            this.format = str5;
            this.width = num;
        }

        public /* synthetic */ EcomImageXConfigModel(String str, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? num : null);
        }
    }

    static {
        EcomImageXConfigData ecomImageXConfigData = new EcomImageXConfigData(null, null, null, 7, null);
        FFL.LJIIIZ().getClass();
        EcomImageXConfigData ecomImageXConfigData2 = (EcomImageXConfigData) FFL.LJIJ(true, "ecom_imagex_config", 31744, EcomImageXConfigData.class, ecomImageXConfigData);
        if (ecomImageXConfigData2 != null) {
            ecomImageXConfigData = ecomImageXConfigData2;
        }
        LIZIZ = ecomImageXConfigData;
        List<EcomImageXConfigModel> config = ecomImageXConfigData.getConfig();
        ArrayList arrayList = new ArrayList();
        for (EcomImageXConfigModel ecomImageXConfigModel : config) {
            if (C78685UuP.LJJJZ(ecomImageXConfigModel.getScene())) {
                arrayList.add(ecomImageXConfigModel);
            }
        }
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList, 10));
        int i = 16;
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((EcomImageXConfigModel) next).getScene(), next);
        }
        N2R.LIZ.getClass();
        Map LJJLIIIJILLIZJL = C113554cx.LJJLIIIJILLIZJL(linkedHashMap, N2R.LIZJ);
        N2Q.LIZ.getClass();
        LIZJ = C113554cx.LJJLIIIJILLIZJL(LJJLIIIJILLIZJL, N2Q.LIZJ);
        List<EcomImageXConfigModel> config2 = LIZIZ.getConfig();
        ArrayList arrayList2 = new ArrayList();
        for (EcomImageXConfigModel ecomImageXConfigModel2 : config2) {
            if (C78685UuP.LJJJZ(ecomImageXConfigModel2.getPage())) {
                arrayList2.add(ecomImageXConfigModel2);
            }
        }
        int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(arrayList2, 10));
        if (LJJIIZ2 >= 16) {
            i = LJJIIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap2.put(((EcomImageXConfigModel) next2).getPage(), next2);
        }
        N2R.LIZ.getClass();
        Map LJJLIIIJILLIZJL2 = C113554cx.LJJLIIIJILLIZJL(linkedHashMap2, N2R.LIZLLL);
        N2Q.LIZ.getClass();
        LIZLLL = C113554cx.LJJLIIIJILLIZJL(LJJLIIIJILLIZJL2, N2Q.LIZLLL);
    }
}
