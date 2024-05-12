package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AutoCheckResponse {

    @InterfaceC65349Pkn("precheck_music")
    public final Integer precheck_music;

    public static /* synthetic */ AutoCheckResponse copy$default(AutoCheckResponse autoCheckResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = autoCheckResponse.precheck_music;
        }
        return autoCheckResponse.copy(num);
    }

    public final AutoCheckResponse copy(Integer num) {
        return new AutoCheckResponse(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCheckResponse) && o.LJ(this.precheck_music, ((AutoCheckResponse) obj).precheck_music);
    }

    public int hashCode() {
        Integer num = this.precheck_music;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCheckResponse(precheck_music=");
        return s0.LIZJ(LIZ, this.precheck_music, ')', LIZ);
    }

    public final Integer getPrecheck_music() {
        return this.precheck_music;
    }

    public AutoCheckResponse(Integer num) {
        this.precheck_music = num;
    }
}
