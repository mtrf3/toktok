package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobileEffectResponse {

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("ttep_effect_id")
    public final String ttepEffectId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectResponse)) {
            return false;
        }
        MobileEffectResponse mobileEffectResponse = (MobileEffectResponse) obj;
        return this.statusCode == mobileEffectResponse.statusCode && o.LJ(this.message, mobileEffectResponse.message) && this.errorCode == mobileEffectResponse.errorCode && o.LJ(this.ttepEffectId, mobileEffectResponse.ttepEffectId);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.message, this.statusCode * 31, 31) + this.errorCode) * 31;
        String str = this.ttepEffectId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobileEffectResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", ttepEffectId=");
        return q.LIZIZ(LIZ, this.ttepEffectId, ')', LIZ);
    }

    public MobileEffectResponse(int i, String message, int i2, String str) {
        o.LJIIIZ(message, "message");
        this.statusCode = i;
        this.message = message;
        this.errorCode = i2;
        this.ttepEffectId = str;
    }
}
