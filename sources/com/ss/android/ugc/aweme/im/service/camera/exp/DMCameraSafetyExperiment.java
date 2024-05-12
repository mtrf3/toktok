package com.ss.android.ugc.aweme.im.service.camera.exp;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.POF;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class DMCameraSafetyExperiment {
    public static final DMCameraSafetyExperiment LIZ = new DMCameraSafetyExperiment();
    public static final CameraSafetyExperimentModel LIZIZ = new CameraSafetyExperimentModel(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, null);
    public static final int LIZJ;
    public static final boolean LIZLLL;

    /* loaded from: classes12.dex */
    public static final class CameraSafetyExperimentModel {

        @InterfaceC65349Pkn("enabled")
        public final int enabled;

        @InterfaceC65349Pkn("launch_time")
        public final int launchTime;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CameraSafetyExperimentModel() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.camera.exp.DMCameraSafetyExperiment.CameraSafetyExperimentModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CameraSafetyExperimentModel)) {
                return false;
            }
            CameraSafetyExperimentModel cameraSafetyExperimentModel = (CameraSafetyExperimentModel) obj;
            return this.launchTime == cameraSafetyExperimentModel.launchTime && this.enabled == cameraSafetyExperimentModel.enabled;
        }

        public final int hashCode() {
            return (this.launchTime * 31) + this.enabled;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CameraSafetyExperimentModel(launchTime=");
            LIZ.append(this.launchTime);
            LIZ.append(", enabled=");
            return b0.LIZJ(LIZ, this.enabled, ')', LIZ);
        }

        public CameraSafetyExperimentModel(int i, int i2) {
            this.launchTime = i;
            this.enabled = i2;
        }

        public /* synthetic */ CameraSafetyExperimentModel(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(POF.LJLIL);
        LIZJ = ((CameraSafetyExperimentModel) LIZIZ2.getValue()).launchTime;
        if (((CameraSafetyExperimentModel) LIZIZ2.getValue()).enabled == 1) {
            z = true;
        }
        LIZLLL = z;
    }
}
