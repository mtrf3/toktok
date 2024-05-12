package com.ss.android.ugc.aweme.ad.feed.shakeEgg;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class ShakeEggSetting {
    public static final ShakeEggSettingModel LIZ = new ShakeEggSettingModel(false, 0, 0 == true ? 1 : 0, 7, null);

    /* loaded from: classes10.dex */
    public static final class ShakeEggSettingModel {

        @InterfaceC65349Pkn("close_shake_egg")
        public final boolean closeShakeEgg;

        @InterfaceC65349Pkn("destroy_count")
        public final int destroyCount;

        @InterfaceC65349Pkn("load_delay")
        public final long loadDelay;

        /* JADX WARN: Multi-variable type inference failed */
        public ShakeEggSettingModel() {
            this(false, 0L, 0 == true ? 1 : 0, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShakeEggSettingModel)) {
                return false;
            }
            ShakeEggSettingModel shakeEggSettingModel = (ShakeEggSettingModel) obj;
            return this.closeShakeEgg == shakeEggSettingModel.closeShakeEgg && this.loadDelay == shakeEggSettingModel.loadDelay && this.destroyCount == shakeEggSettingModel.destroyCount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final int hashCode() {
            boolean z = this.closeShakeEgg;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return JBR.LIZJ(this.loadDelay, r0 * 31, 31) + this.destroyCount;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShakeEggSettingModel(closeShakeEgg=");
            LIZ.append(this.closeShakeEgg);
            LIZ.append(", loadDelay=");
            LIZ.append(this.loadDelay);
            LIZ.append(", destroyCount=");
            return b0.LIZJ(LIZ, this.destroyCount, ')', LIZ);
        }

        public ShakeEggSettingModel(boolean z, long j, int i) {
            this.closeShakeEgg = z;
            this.loadDelay = j;
            this.destroyCount = i;
        }

        public /* synthetic */ ShakeEggSettingModel(boolean z, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 6 : i);
        }
    }

    public static final ShakeEggSettingModel LIZ() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            ShakeEggSettingModel shakeEggSettingModel = LIZ;
            ShakeEggSettingModel shakeEggSettingModel2 = (ShakeEggSettingModel) LIZLLL.LJIIIIZZ("shake_egg_setting", ShakeEggSettingModel.class, shakeEggSettingModel);
            if (shakeEggSettingModel2 != null) {
                return shakeEggSettingModel2;
            }
            return shakeEggSettingModel;
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}
