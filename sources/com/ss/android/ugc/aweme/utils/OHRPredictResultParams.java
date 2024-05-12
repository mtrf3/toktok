package com.ss.android.ugc.aweme.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OHRPredictResultParams extends F9E implements Serializable {

    @InterfaceC65349Pkn("confidence")
    public final float confidence;

    @InterfaceC65349Pkn("hand")
    public final int hand;

    @InterfaceC65349Pkn("left_percent")
    public final float leftPercent;

    @InterfaceC65349Pkn("right_percent")
    public final float rightPercent;

    public static /* synthetic */ OHRPredictResultParams copy$default(OHRPredictResultParams oHRPredictResultParams, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oHRPredictResultParams.hand;
        }
        if ((i2 & 2) != 0) {
            f = oHRPredictResultParams.confidence;
        }
        if ((i2 & 4) != 0) {
            f2 = oHRPredictResultParams.leftPercent;
        }
        if ((i2 & 8) != 0) {
            f3 = oHRPredictResultParams.rightPercent;
        }
        return oHRPredictResultParams.copy(i, f, f2, f3);
    }

    public final OHRPredictResultParams copy(int i, float f, float f2, float f3) {
        return new OHRPredictResultParams(i, f, f2, f3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.hand), Float.valueOf(this.confidence), Float.valueOf(this.leftPercent), Float.valueOf(this.rightPercent)};
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final int getHand() {
        return this.hand;
    }

    public final float getLeftPercent() {
        return this.leftPercent;
    }

    public final float getRightPercent() {
        return this.rightPercent;
    }

    public OHRPredictResultParams(int i, float f, float f2, float f3) {
        this.hand = i;
        this.confidence = f;
        this.leftPercent = f2;
        this.rightPercent = f3;
    }
}
