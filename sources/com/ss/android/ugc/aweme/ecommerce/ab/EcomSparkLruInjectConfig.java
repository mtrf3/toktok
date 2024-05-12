package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C1NE;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomSparkLruInjectConfig {
    public static final EcomSparkLruInjectConfig LIZ = new EcomSparkLruInjectConfig();
    public static final EcomSparkLruInjectModel[] LIZIZ;

    /* loaded from: classes2.dex */
    public static final class EcomSparkLruInjectCache {

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public final String scene;

        @InterfaceC65349Pkn("sub_channel")
        public final String subChannel;

        public static /* synthetic */ EcomSparkLruInjectCache copy$default(EcomSparkLruInjectCache ecomSparkLruInjectCache, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomSparkLruInjectCache.subChannel;
            }
            if ((i & 2) != 0) {
                str2 = ecomSparkLruInjectCache.scene;
            }
            if ((i & 4) != 0) {
                str3 = ecomSparkLruInjectCache.key;
            }
            return ecomSparkLruInjectCache.copy(str, str2, str3);
        }

        public final EcomSparkLruInjectCache copy(String str, String scene, String str2) {
            o.LJIIIZ(scene, "scene");
            return new EcomSparkLruInjectCache(str, scene, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomSparkLruInjectCache)) {
                return false;
            }
            EcomSparkLruInjectCache ecomSparkLruInjectCache = (EcomSparkLruInjectCache) obj;
            return o.LJ(this.subChannel, ecomSparkLruInjectCache.subChannel) && o.LJ(this.scene, ecomSparkLruInjectCache.scene) && o.LJ(this.key, ecomSparkLruInjectCache.key);
        }

        public int hashCode() {
            int hashCode;
            String str = this.subChannel;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int LJ = C79062V1e.LJ(this.scene, hashCode * 31, 31);
            String str2 = this.key;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return LJ + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomSparkLruInjectCache(subChannel=");
            LIZ.append(this.subChannel);
            LIZ.append(", scene=");
            LIZ.append(this.scene);
            LIZ.append(", key=");
            return q.LIZIZ(LIZ, this.key, ')', LIZ);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getScene() {
            return this.scene;
        }

        public final String getSubChannel() {
            return this.subChannel;
        }

        public EcomSparkLruInjectCache(String str, String scene, String str2) {
            o.LJIIIZ(scene, "scene");
            this.subChannel = str;
            this.scene = scene;
            this.key = str2;
        }

        public /* synthetic */ EcomSparkLruInjectCache(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EcomSparkLruInjectModel {

        @InterfaceC65349Pkn("cache")
        public final List<EcomSparkLruInjectCache> cache;

        @InterfaceC65349Pkn("channel")
        public final String channel;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomSparkLruInjectModel copy$default(EcomSparkLruInjectModel ecomSparkLruInjectModel, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecomSparkLruInjectModel.channel;
            }
            if ((i & 2) != 0) {
                list = ecomSparkLruInjectModel.cache;
            }
            return ecomSparkLruInjectModel.copy(str, list);
        }

        public final EcomSparkLruInjectModel copy(String channel, List<EcomSparkLruInjectCache> cache) {
            o.LJIIIZ(channel, "channel");
            o.LJIIIZ(cache, "cache");
            return new EcomSparkLruInjectModel(channel, cache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomSparkLruInjectModel)) {
                return false;
            }
            EcomSparkLruInjectModel ecomSparkLruInjectModel = (EcomSparkLruInjectModel) obj;
            return o.LJ(this.channel, ecomSparkLruInjectModel.channel) && o.LJ(this.cache, ecomSparkLruInjectModel.cache);
        }

        public int hashCode() {
            return this.cache.hashCode() + (this.channel.hashCode() * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomSparkLruInjectModel(channel=");
            LIZ.append(this.channel);
            LIZ.append(", cache=");
            return C1NE.LIZIZ(LIZ, this.cache, ')', LIZ);
        }

        public final List<EcomSparkLruInjectCache> getCache() {
            return this.cache;
        }

        public final String getChannel() {
            return this.channel;
        }

        public EcomSparkLruInjectModel(String channel, List<EcomSparkLruInjectCache> cache) {
            o.LJIIIZ(channel, "channel");
            o.LJIIIZ(cache, "cache");
            this.channel = channel;
            this.cache = cache;
        }

        public EcomSparkLruInjectModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
        }
    }

    static {
        EcomSparkLruInjectModel[] ecomSparkLruInjectModelArr = new EcomSparkLruInjectModel[0];
        EcomSparkLruInjectModel[] ecomSparkLruInjectModelArr2 = (EcomSparkLruInjectModel[]) SettingsManager.LIZLLL().LJIIIIZZ("ecom_spark_lru_inject_config", EcomSparkLruInjectModel[].class, ecomSparkLruInjectModelArr);
        if (ecomSparkLruInjectModelArr2 != null) {
            ecomSparkLruInjectModelArr = ecomSparkLruInjectModelArr2;
        }
        LIZIZ = ecomSparkLruInjectModelArr;
    }
}
