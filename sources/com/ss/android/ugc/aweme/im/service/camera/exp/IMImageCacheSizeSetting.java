package com.ss.android.ugc.aweme.im.service.camera.exp;

import X.C15890jp;
import X.C221108m2;
import X.C51029K0z;
import X.C59782Wg;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.X1D;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMImageCacheSizeSetting {
    public static final IMImageCacheSizeConfig LIZ = new IMImageCacheSizeConfig(null, 1, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C59782Wg.LJLIL);

    /* loaded from: classes2.dex */
    public static final class IMImageCacheSizeConfig implements Serializable {

        @InterfaceC65349Pkn("cache_size_map")
        public final Map<String, Long> cacheSizeMap;

        public IMImageCacheSizeConfig() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IMImageCacheSizeConfig copy$default(IMImageCacheSizeConfig iMImageCacheSizeConfig, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = iMImageCacheSizeConfig.cacheSizeMap;
            }
            return iMImageCacheSizeConfig.copy(map);
        }

        public final IMImageCacheSizeConfig copy(Map<String, Long> cacheSizeMap) {
            o.LJIIIZ(cacheSizeMap, "cacheSizeMap");
            return new IMImageCacheSizeConfig(cacheSizeMap);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IMImageCacheSizeConfig) && o.LJ(this.cacheSizeMap, ((IMImageCacheSizeConfig) obj).cacheSizeMap);
        }

        public int hashCode() {
            return this.cacheSizeMap.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMImageCacheSizeConfig(cacheSizeMap=");
            return C15890jp.LIZ(LIZ, this.cacheSizeMap, ')', LIZ);
        }

        public final Map<String, Long> getCacheSizeMap() {
            return this.cacheSizeMap;
        }

        public IMImageCacheSizeConfig(Map<String, Long> cacheSizeMap) {
            o.LJIIIZ(cacheSizeMap, "cacheSizeMap");
            this.cacheSizeMap = cacheSizeMap;
        }

        public IMImageCacheSizeConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C51029K0z.LJJIIZI(new OSZ("dm_camera", 536870912L)) : map);
        }
    }
}
