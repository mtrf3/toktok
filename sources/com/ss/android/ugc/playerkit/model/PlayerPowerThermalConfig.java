package com.ss.android.ugc.playerkit.model;

import X.C48339Iy7;
import X.C74221TAz;
import X.X1D;
import defpackage.q;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class PlayerPowerThermalConfig {
    public CurveParamFactor curveParamFactor;
    public boolean enableAdjustBrSelect;
    public boolean enableAdjustPreRender;
    public boolean enableAdjustSr;
    public boolean enableAdjustTextureRender;
    public SrFactor srFactor;

    /* loaded from: classes2.dex */
    public static class CurveParamFactor {
        public List<Float> lightThermalParamFactor;
        public List<Float> lowPowerParamFactor;
        public List<Float> moderateThermalParamFactor;
        public List<Float> severeThermalParamFactor;

        public String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CurveParamFactor{lowPowerParamFactor=");
            List<Float> list = this.lowPowerParamFactor;
            String str4 = "null";
            if (list == null) {
                str = "null";
            } else {
                str = Arrays.toString(list.toArray());
            }
            LIZ.append(str);
            LIZ.append(", lightThermalParamFactor=");
            List<Float> list2 = this.lightThermalParamFactor;
            if (list2 == null) {
                str2 = "null";
            } else {
                str2 = Arrays.toString(list2.toArray());
            }
            LIZ.append(str2);
            LIZ.append(", moderateThermalParamFactor=");
            List<Float> list3 = this.moderateThermalParamFactor;
            if (list3 == null) {
                str3 = "null";
            } else {
                str3 = Arrays.toString(list3.toArray());
            }
            LIZ.append(str3);
            LIZ.append(", severeThermalParamFactor=");
            List<Float> list4 = this.severeThermalParamFactor;
            if (list4 != null) {
                str4 = Arrays.toString(list4.toArray());
            }
            return q.LIZIZ(LIZ, str4, '}', LIZ);
        }
    }

    /* loaded from: classes2.dex */
    public static class SrFactor {
        public float lightThermalSrFactor;
        public float lowPowerSrFactor;
        public float moderateThermalSrFactor;
        public float severeThermalSrFactor;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SrFactor{lowPowerSrFactor=");
            LIZ.append(this.lowPowerSrFactor);
            LIZ.append(", lightThermalSrFactor=");
            LIZ.append(this.lightThermalSrFactor);
            LIZ.append(", moderateThermalSrFactor=");
            LIZ.append(this.moderateThermalSrFactor);
            LIZ.append(", severeThermalSrFactor=");
            return C74221TAz.LIZLLL(LIZ, this.severeThermalSrFactor, '}', LIZ);
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerPowerThermalConfig{enableAdjustSr=");
        LIZ.append(this.enableAdjustSr);
        LIZ.append(", srFactor=");
        LIZ.append(this.srFactor);
        LIZ.append(", enableAdjustBrSelect=");
        LIZ.append(this.enableAdjustBrSelect);
        LIZ.append(", curveParamFactor=");
        LIZ.append(this.curveParamFactor);
        LIZ.append(", enableAdjustTextureRender=");
        LIZ.append(this.enableAdjustTextureRender);
        LIZ.append(", enableAdjustPreRender=");
        return C48339Iy7.LIZJ(LIZ, this.enableAdjustPreRender, '}', LIZ);
    }

    public static boolean isCurveParamFactorValid(CurveParamFactor curveParamFactor) {
        List<Float> list;
        List<Float> list2;
        List<Float> list3;
        List<Float> list4;
        if (curveParamFactor != null && (list = curveParamFactor.lowPowerParamFactor) != null && list.size() == 5 && (list2 = curveParamFactor.lightThermalParamFactor) != null && list2.size() == 5 && (list3 = curveParamFactor.moderateThermalParamFactor) != null && list3.size() == 5 && (list4 = curveParamFactor.severeThermalParamFactor) != null && list4.size() == 5) {
            return true;
        }
        return false;
    }
}
