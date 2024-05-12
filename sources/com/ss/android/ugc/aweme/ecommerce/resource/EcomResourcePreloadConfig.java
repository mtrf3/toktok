package com.ss.android.ugc.aweme.ecommerce.resource;

import X.C1JX;
import X.C1NE;
import X.C32I;
import X.C48339Iy7;
import X.C51029K0z;
import X.C61878OQg;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomResourcePreloadConfig {
    public static final EcomResourcePreloadConfig LIZ = new EcomResourcePreloadConfig();
    public static final Map<String, EcomResourcePreloadModel> LIZIZ;

    /* loaded from: classes14.dex */
    public static final class EcomResourceImageModel {

        @InterfaceC65349Pkn("fix_px")
        public final double fixPx;

        @InterfaceC65349Pkn("height")
        public final Double height;

        @InterfaceC65349Pkn("limit")
        public final Integer limit;

        /* renamed from: native, reason: not valid java name */
        @InterfaceC65349Pkn("native")
        public final boolean f24native;

        @InterfaceC65349Pkn("path")
        public final String path;

        @InterfaceC65349Pkn("plugin")
        public final boolean plugin;

        @InterfaceC65349Pkn("rgb565")
        public final Boolean rgb565;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public final String scene;

        @InterfaceC65349Pkn("width")
        public final Double width;

        public static /* synthetic */ EcomResourceImageModel copy$default(EcomResourceImageModel ecomResourceImageModel, String str, Integer num, Double d, Double d2, double d3, Boolean bool, boolean z, String str2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomResourceImageModel.path;
            }
            if ((i & 2) != 0) {
                num = ecomResourceImageModel.limit;
            }
            if ((i & 4) != 0) {
                d = ecomResourceImageModel.width;
            }
            if ((i & 8) != 0) {
                d2 = ecomResourceImageModel.height;
            }
            if ((i & 16) != 0) {
                d3 = ecomResourceImageModel.fixPx;
            }
            if ((i & 32) != 0) {
                bool = ecomResourceImageModel.rgb565;
            }
            if ((i & 64) != 0) {
                z = ecomResourceImageModel.plugin;
            }
            if ((i & 128) != 0) {
                str2 = ecomResourceImageModel.scene;
            }
            if ((i & 256) != 0) {
                z2 = ecomResourceImageModel.f24native;
            }
            return ecomResourceImageModel.copy(str, num, d, d2, d3, bool, z, str2, z2);
        }

        public final EcomResourceImageModel copy(String path, Integer num, Double d, Double d2, double d3, Boolean bool, boolean z, String str, boolean z2) {
            o.LJIIIZ(path, "path");
            return new EcomResourceImageModel(path, num, d, d2, d3, bool, z, str, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomResourceImageModel)) {
                return false;
            }
            EcomResourceImageModel ecomResourceImageModel = (EcomResourceImageModel) obj;
            return o.LJ(this.path, ecomResourceImageModel.path) && o.LJ(this.limit, ecomResourceImageModel.limit) && o.LJ(this.width, ecomResourceImageModel.width) && o.LJ(this.height, ecomResourceImageModel.height) && Double.compare(this.fixPx, ecomResourceImageModel.fixPx) == 0 && o.LJ(this.rgb565, ecomResourceImageModel.rgb565) && this.plugin == ecomResourceImageModel.plugin && o.LJ(this.scene, ecomResourceImageModel.scene) && this.f24native == ecomResourceImageModel.f24native;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.path.hashCode() * 31;
            Integer num = this.limit;
            int i = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = (hashCode5 + hashCode) * 31;
            Double d = this.width;
            if (d == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = d.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Double d2 = this.height;
            if (d2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = d2.hashCode();
            }
            int LIZIZ = C1JX.LIZIZ(this.fixPx, (i3 + hashCode3) * 31, 31);
            Boolean bool = this.rgb565;
            if (bool == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = bool.hashCode();
            }
            int i4 = (LIZIZ + hashCode4) * 31;
            boolean z = this.plugin;
            int i5 = 1;
            int i6 = z;
            if (z != 0) {
                i6 = 1;
            }
            int i7 = (i4 + i6) * 31;
            String str = this.scene;
            if (str != null) {
                i = str.hashCode();
            }
            int i8 = (i7 + i) * 31;
            if (!this.f24native) {
                i5 = 0;
            }
            return i8 + i5;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomResourceImageModel(path=");
            LIZ.append(this.path);
            LIZ.append(", limit=");
            LIZ.append(this.limit);
            LIZ.append(", width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", fixPx=");
            LIZ.append(this.fixPx);
            LIZ.append(", rgb565=");
            LIZ.append(this.rgb565);
            LIZ.append(", plugin=");
            LIZ.append(this.plugin);
            LIZ.append(", scene=");
            LIZ.append(this.scene);
            LIZ.append(", native=");
            return C48339Iy7.LIZJ(LIZ, this.f24native, ')', LIZ);
        }

        public final double getFixPx() {
            return this.fixPx;
        }

        public final Double getHeight() {
            return this.height;
        }

        public final Integer getLimit() {
            return this.limit;
        }

        public final boolean getNative() {
            return this.f24native;
        }

        public final String getPath() {
            return this.path;
        }

        public final boolean getPlugin() {
            return this.plugin;
        }

        public final Boolean getRgb565() {
            return this.rgb565;
        }

        public final String getScene() {
            return this.scene;
        }

        public final Double getWidth() {
            return this.width;
        }

        public EcomResourceImageModel(String path, Integer num, Double d, Double d2, double d3, Boolean bool, boolean z, String str, boolean z2) {
            o.LJIIIZ(path, "path");
            this.path = path;
            this.limit = num;
            this.width = d;
            this.height = d2;
            this.fixPx = d3;
            this.rgb565 = bool;
            this.plugin = z;
            this.scene = str;
            this.f24native = z2;
        }

        public /* synthetic */ EcomResourceImageModel(String str, Integer num, Double d, Double d2, double d3, Boolean bool, boolean z, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, d, d2, (i & 16) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? false : z, (i & 128) == 0 ? str2 : null, (i & 256) != 0 ? false : z2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class EcomResourcePreloadModel {

        @InterfaceC65349Pkn("api")
        public final String api;

        @InterfaceC65349Pkn("images")
        public final List<EcomResourceImageModel> images;

        public EcomResourcePreloadModel() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomResourcePreloadModel copy$default(EcomResourcePreloadModel ecomResourcePreloadModel, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomResourcePreloadModel.api;
            }
            if ((i & 2) != 0) {
                list = ecomResourcePreloadModel.images;
            }
            return ecomResourcePreloadModel.copy(str, list);
        }

        public final EcomResourcePreloadModel copy(String api, List<EcomResourceImageModel> images) {
            o.LJIIIZ(api, "api");
            o.LJIIIZ(images, "images");
            return new EcomResourcePreloadModel(api, images);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomResourcePreloadModel)) {
                return false;
            }
            EcomResourcePreloadModel ecomResourcePreloadModel = (EcomResourcePreloadModel) obj;
            return o.LJ(this.api, ecomResourcePreloadModel.api) && o.LJ(this.images, ecomResourcePreloadModel.images);
        }

        public int hashCode() {
            return this.images.hashCode() + (this.api.hashCode() * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomResourcePreloadModel(api=");
            LIZ.append(this.api);
            LIZ.append(", images=");
            return C1NE.LIZIZ(LIZ, this.images, ')', LIZ);
        }

        public final String getApi() {
            return this.api;
        }

        public final List<EcomResourceImageModel> getImages() {
            return this.images;
        }

        public EcomResourcePreloadModel(String api, List<EcomResourceImageModel> images) {
            o.LJIIIZ(api, "api");
            o.LJIIIZ(images, "images");
            this.api = api;
            this.images = images;
        }

        public EcomResourcePreloadModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
        }
    }

    static {
        EcomResourcePreloadModel[] ecomResourcePreloadModelArr = new EcomResourcePreloadModel[0];
        FFL.LJIIIZ().getClass();
        EcomResourcePreloadModel[] ecomResourcePreloadModelArr2 = (EcomResourcePreloadModel[]) FFL.LJIJ(true, "ecom_resource_preload_config", 31744, EcomResourcePreloadModel[].class, ecomResourcePreloadModelArr);
        if (ecomResourcePreloadModelArr2 != null) {
            ecomResourcePreloadModelArr = ecomResourcePreloadModelArr2;
        }
        ArrayList arrayList = new ArrayList();
        for (EcomResourcePreloadModel ecomResourcePreloadModel : ecomResourcePreloadModelArr) {
            if (ecomResourcePreloadModel.getApi().length() > 0) {
                arrayList.add(ecomResourcePreloadModel);
            }
        }
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((EcomResourcePreloadModel) next).getApi(), next);
        }
        LIZIZ = linkedHashMap;
    }
}
