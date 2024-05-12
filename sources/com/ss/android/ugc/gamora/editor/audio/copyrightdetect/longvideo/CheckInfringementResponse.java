package com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CheckInfringementResponse {

    @InterfaceC65349Pkn("is_infringement")
    public final Boolean isInfringement;

    public static /* synthetic */ CheckInfringementResponse copy$default(CheckInfringementResponse checkInfringementResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = checkInfringementResponse.isInfringement;
        }
        return checkInfringementResponse.copy(bool);
    }

    public final CheckInfringementResponse copy(Boolean bool) {
        return new CheckInfringementResponse(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckInfringementResponse) && o.LJ(this.isInfringement, ((CheckInfringementResponse) obj).isInfringement);
    }

    public int hashCode() {
        Boolean bool = this.isInfringement;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckInfringementResponse(isInfringement=");
        return C78920UyC.LIZIZ(LIZ, this.isInfringement, ')', LIZ);
    }

    public final Boolean isInfringement() {
        return this.isInfringement;
    }

    public CheckInfringementResponse(Boolean bool) {
        this.isInfringement = bool;
    }
}
