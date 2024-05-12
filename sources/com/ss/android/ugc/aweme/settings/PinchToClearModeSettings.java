package com.ss.android.ugc.aweme.settings;

import X.C47959Irz;
import X.C74221TAz;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class PinchToClearModeSettings {
    public static final PinchToClearModeSettingsModel LIZ = new PinchToClearModeSettingsModel(1.1f, 1.0f, 4.0f, 0.5f);

    /* loaded from: classes9.dex */
    public static final class PinchToClearModeSettingsModel {

        @InterfaceC65349Pkn("enter_clear_mode_scale")
        public final float enterScale;

        @InterfaceC65349Pkn("exit_clear_mode_scale")
        public final float exitScale;

        @InterfaceC65349Pkn("max_scale")
        public final float maxScale;

        @InterfaceC65349Pkn("min_scale")
        public final float minScale;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PinchToClearModeSettingsModel() {
            /*
                r7 = this;
                r1 = 0
                r5 = 15
                r6 = 0
                r0 = r7
                r2 = r1
                r3 = r1
                r4 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.PinchToClearModeSettings.PinchToClearModeSettingsModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinchToClearModeSettingsModel)) {
                return false;
            }
            PinchToClearModeSettingsModel pinchToClearModeSettingsModel = (PinchToClearModeSettingsModel) obj;
            return Float.compare(this.enterScale, pinchToClearModeSettingsModel.enterScale) == 0 && Float.compare(this.exitScale, pinchToClearModeSettingsModel.exitScale) == 0 && Float.compare(this.maxScale, pinchToClearModeSettingsModel.maxScale) == 0 && Float.compare(this.minScale, pinchToClearModeSettingsModel.minScale) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.minScale) + C47959Irz.LIZIZ(this.maxScale, C47959Irz.LIZIZ(this.exitScale, Float.floatToIntBits(this.enterScale) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PinchToClearModeSettingsModel(enterScale=");
            LIZ.append(this.enterScale);
            LIZ.append(", exitScale=");
            LIZ.append(this.exitScale);
            LIZ.append(", maxScale=");
            LIZ.append(this.maxScale);
            LIZ.append(", minScale=");
            return C74221TAz.LIZLLL(LIZ, this.minScale, ')', LIZ);
        }

        public PinchToClearModeSettingsModel(float f, float f2, float f3, float f4) {
            this.enterScale = f;
            this.exitScale = f2;
            this.maxScale = f3;
            this.minScale = f4;
        }

        public /* synthetic */ PinchToClearModeSettingsModel(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 1.1f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? 4.0f : f3, (i & 8) != 0 ? 0.5f : f4);
        }
    }

    public static final PinchToClearModeSettingsModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PinchToClearModeSettingsModel pinchToClearModeSettingsModel = LIZ;
        PinchToClearModeSettingsModel pinchToClearModeSettingsModel2 = (PinchToClearModeSettingsModel) LIZLLL.LJIIIIZZ("pinch_to_clear_mode_settings", PinchToClearModeSettingsModel.class, pinchToClearModeSettingsModel);
        if (pinchToClearModeSettingsModel2 == null) {
            return pinchToClearModeSettingsModel;
        }
        return pinchToClearModeSettingsModel2;
    }
}
