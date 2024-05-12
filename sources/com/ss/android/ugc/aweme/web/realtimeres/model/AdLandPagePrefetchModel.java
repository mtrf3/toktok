package com.ss.android.ugc.aweme.web.realtimeres.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdLandPagePrefetchModel {

    /* loaded from: classes7.dex */
    public static final class PrefetchModel {

        @InterfaceC65349Pkn("fileName")
        public final String fileName;

        @InterfaceC65349Pkn("fileSize")
        public final Long fileSize;

        @InterfaceC65349Pkn("isPixelResource")
        public final Integer isPixelResource;

        @InterfaceC65349Pkn("level")
        public final Integer level;

        @InterfaceC65349Pkn("reqHeader")
        public final Map<String, String> reqHeader;

        @InterfaceC65349Pkn("resourceType")
        public final String resourceType;

        @InterfaceC65349Pkn("url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public PrefetchModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrefetchModel)) {
                return false;
            }
            PrefetchModel prefetchModel = (PrefetchModel) obj;
            return o.LJ(this.fileName, prefetchModel.fileName) && o.LJ(this.fileSize, prefetchModel.fileSize) && o.LJ(this.resourceType, prefetchModel.resourceType) && o.LJ(this.level, prefetchModel.level) && o.LJ(this.url, prefetchModel.url) && o.LJ(this.reqHeader, prefetchModel.reqHeader) && o.LJ(this.isPixelResource, prefetchModel.isPixelResource);
        }

        public final int hashCode() {
            String str = this.fileName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.fileSize;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.resourceType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.level;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.url;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, String> map = this.reqHeader;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            Integer num2 = this.isPixelResource;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PrefetchModel(fileName=");
            LIZ.append(this.fileName);
            LIZ.append(", fileSize=");
            LIZ.append(this.fileSize);
            LIZ.append(", resourceType=");
            LIZ.append(this.resourceType);
            LIZ.append(", level=");
            LIZ.append(this.level);
            LIZ.append(", url=");
            LIZ.append(this.url);
            LIZ.append(", reqHeader=");
            LIZ.append(this.reqHeader);
            LIZ.append(", isPixelResource=");
            return s0.LIZJ(LIZ, this.isPixelResource, ')', LIZ);
        }

        public PrefetchModel(String str, Long l, String str2, Integer num, String str3, Map<String, String> map, Integer num2) {
            this.fileName = str;
            this.fileSize = l;
            this.resourceType = str2;
            this.level = num;
            this.url = str3;
            this.reqHeader = map;
            this.isPixelResource = num2;
        }

        public /* synthetic */ PrefetchModel(String str, Long l, String str2, Integer num, String str3, Map map, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, (i & 64) == 0 ? num2 : null);
        }
    }
}
