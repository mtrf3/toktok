package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C1NE;
import X.C48339Iy7;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomLruCacheSetting {
    public static final EcomLruCacheSetting LIZ = new EcomLruCacheSetting();
    public static final EcomLruCacheSettingConfig LIZIZ = new EcomLruCacheSettingConfig(null, 1, null);

    /* loaded from: classes13.dex */
    public static final class EcomLruCacheScene {

        @InterfaceC65349Pkn("immediate")
        public final boolean immediate;

        @InterfaceC65349Pkn("max_size")
        public int maxSize;

        @InterfaceC65349Pkn("persistence")
        public boolean persistence;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public String scene;

        @InterfaceC65349Pkn("timeout")
        public final int timeout;

        /* JADX WARN: Multi-variable type inference failed */
        public EcomLruCacheScene() {
            this(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcomLruCacheScene copy$default(EcomLruCacheScene ecomLruCacheScene, boolean z, int i, String str, int i2, boolean z2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = ecomLruCacheScene.persistence;
            }
            if ((i3 & 2) != 0) {
                i = ecomLruCacheScene.maxSize;
            }
            if ((i3 & 4) != 0) {
                str = ecomLruCacheScene.scene;
            }
            if ((i3 & 8) != 0) {
                i2 = ecomLruCacheScene.timeout;
            }
            if ((i3 & 16) != 0) {
                z2 = ecomLruCacheScene.immediate;
            }
            return ecomLruCacheScene.copy(z, i, str, i2, z2);
        }

        public final EcomLruCacheScene copy(boolean z, int i, String str, int i2, boolean z2) {
            return new EcomLruCacheScene(z, i, str, i2, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomLruCacheScene)) {
                return false;
            }
            EcomLruCacheScene ecomLruCacheScene = (EcomLruCacheScene) obj;
            return this.persistence == ecomLruCacheScene.persistence && this.maxSize == ecomLruCacheScene.maxSize && o.LJ(this.scene, ecomLruCacheScene.scene) && this.timeout == ecomLruCacheScene.timeout && this.immediate == ecomLruCacheScene.immediate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z = this.persistence;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = ((r0 * 31) + this.maxSize) * 31;
            String str = this.scene;
            return ((((i + (str == null ? 0 : str.hashCode())) * 31) + this.timeout) * 31) + (this.immediate ? 1 : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomLruCacheScene(persistence=");
            LIZ.append(this.persistence);
            LIZ.append(", maxSize=");
            LIZ.append(this.maxSize);
            LIZ.append(", scene=");
            LIZ.append(this.scene);
            LIZ.append(", timeout=");
            LIZ.append(this.timeout);
            LIZ.append(", immediate=");
            return C48339Iy7.LIZJ(LIZ, this.immediate, ')', LIZ);
        }

        public final boolean getImmediate() {
            return this.immediate;
        }

        public final int getMaxSize() {
            return this.maxSize;
        }

        public final boolean getPersistence() {
            return this.persistence;
        }

        public final String getScene() {
            return this.scene;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final void setMaxSize(int i) {
            this.maxSize = i;
        }

        public final void setPersistence(boolean z) {
            this.persistence = z;
        }

        public final void setScene(String str) {
            this.scene = str;
        }

        public EcomLruCacheScene(boolean z, int i, String str, int i2, boolean z2) {
            this.persistence = z;
            this.maxSize = i;
            this.scene = str;
            this.timeout = i2;
            this.immediate = z2;
        }

        public /* synthetic */ EcomLruCacheScene(boolean z, int i, String str, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 10 : i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class EcomLruCacheSettingConfig {

        @InterfaceC65349Pkn("scenes")
        public List<EcomLruCacheScene> scenes;

        public EcomLruCacheSettingConfig() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcomLruCacheSettingConfig copy$default(EcomLruCacheSettingConfig ecomLruCacheSettingConfig, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ecomLruCacheSettingConfig.scenes;
            }
            return ecomLruCacheSettingConfig.copy(list);
        }

        public final EcomLruCacheSettingConfig copy(List<EcomLruCacheScene> scenes) {
            o.LJIIIZ(scenes, "scenes");
            return new EcomLruCacheSettingConfig(scenes);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcomLruCacheSettingConfig) && o.LJ(this.scenes, ((EcomLruCacheSettingConfig) obj).scenes);
        }

        public int hashCode() {
            return this.scenes.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomLruCacheSettingConfig(scenes=");
            return C1NE.LIZIZ(LIZ, this.scenes, ')', LIZ);
        }

        public final List<EcomLruCacheScene> getScenes() {
            return this.scenes;
        }

        public EcomLruCacheSettingConfig(List<EcomLruCacheScene> scenes) {
            o.LJIIIZ(scenes, "scenes");
            this.scenes = scenes;
        }

        public final void setScenes(List<EcomLruCacheScene> list) {
            o.LJIIIZ(list, "<set-?>");
            this.scenes = list;
        }

        public EcomLruCacheSettingConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
        }
    }
}
