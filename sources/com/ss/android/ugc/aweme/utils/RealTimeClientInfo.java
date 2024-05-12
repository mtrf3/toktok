package com.ss.android.ugc.aweme.utils;

import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RealTimeClientInfo implements Serializable {

    @InterfaceC65349Pkn("brightness")
    public final BrightnessInfo brightness;

    @InterfaceC65349Pkn("dark_mode")
    public final int darkMode;

    @InterfaceC65349Pkn("font_scale")
    public final float fontScale;

    @InterfaceC65349Pkn("ohr_predict")
    public final OHRPredictResultParams ohrPredict;

    @InterfaceC65349Pkn("recent_consumption_data")
    public final String recentConsumptionData;

    public static /* synthetic */ RealTimeClientInfo copy$default(RealTimeClientInfo realTimeClientInfo, BrightnessInfo brightnessInfo, int i, float f, OHRPredictResultParams oHRPredictResultParams, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            brightnessInfo = realTimeClientInfo.brightness;
        }
        if ((i2 & 2) != 0) {
            i = realTimeClientInfo.darkMode;
        }
        if ((i2 & 4) != 0) {
            f = realTimeClientInfo.fontScale;
        }
        if ((i2 & 8) != 0) {
            oHRPredictResultParams = realTimeClientInfo.ohrPredict;
        }
        if ((i2 & 16) != 0) {
            str = realTimeClientInfo.recentConsumptionData;
        }
        return realTimeClientInfo.copy(brightnessInfo, i, f, oHRPredictResultParams, str);
    }

    public final RealTimeClientInfo copy(BrightnessInfo brightness, int i, float f, OHRPredictResultParams oHRPredictResultParams, String str) {
        o.LJIIIZ(brightness, "brightness");
        return new RealTimeClientInfo(brightness, i, f, oHRPredictResultParams, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealTimeClientInfo)) {
            return false;
        }
        RealTimeClientInfo realTimeClientInfo = (RealTimeClientInfo) obj;
        return o.LJ(this.brightness, realTimeClientInfo.brightness) && this.darkMode == realTimeClientInfo.darkMode && Float.compare(this.fontScale, realTimeClientInfo.fontScale) == 0 && o.LJ(this.ohrPredict, realTimeClientInfo.ohrPredict) && o.LJ(this.recentConsumptionData, realTimeClientInfo.recentConsumptionData);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.fontScale, ((this.brightness.hashCode() * 31) + this.darkMode) * 31, 31);
        OHRPredictResultParams oHRPredictResultParams = this.ohrPredict;
        int i = 0;
        if (oHRPredictResultParams == null) {
            hashCode = 0;
        } else {
            hashCode = oHRPredictResultParams.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        String str = this.recentConsumptionData;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RealTimeClientInfo(brightness=");
        LIZ.append(this.brightness);
        LIZ.append(", darkMode=");
        LIZ.append(this.darkMode);
        LIZ.append(", fontScale=");
        LIZ.append(this.fontScale);
        LIZ.append(", ohrPredict=");
        LIZ.append(this.ohrPredict);
        LIZ.append(", recentConsumptionData=");
        return q.LIZIZ(LIZ, this.recentConsumptionData, ')', LIZ);
    }

    public final BrightnessInfo getBrightness() {
        return this.brightness;
    }

    public final int getDarkMode() {
        return this.darkMode;
    }

    public final float getFontScale() {
        return this.fontScale;
    }

    public final OHRPredictResultParams getOhrPredict() {
        return this.ohrPredict;
    }

    public final String getRecentConsumptionData() {
        return this.recentConsumptionData;
    }

    public RealTimeClientInfo(BrightnessInfo brightness, int i, float f, OHRPredictResultParams oHRPredictResultParams, String str) {
        o.LJIIIZ(brightness, "brightness");
        this.brightness = brightness;
        this.darkMode = i;
        this.fontScale = f;
        this.ohrPredict = oHRPredictResultParams;
        this.recentConsumptionData = str;
    }
}
