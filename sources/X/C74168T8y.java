package X;

import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.T8y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74168T8y {
    public final VoiceConversionDetailsResponse LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74168T8y)) {
            return false;
        }
        C74168T8y c74168T8y = (C74168T8y) obj;
        return o.LJ(this.LIZ, c74168T8y.LIZ) && this.LIZIZ == c74168T8y.LIZIZ;
    }

    public final int hashCode() {
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = this.LIZ;
        return C16880lQ.LLJIJIL(this.LIZIZ) + ((voiceConversionDetailsResponse == null ? 0 : voiceConversionDetailsResponse.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceConversionDetailNode(voiceDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C74168T8y(VoiceConversionDetailsResponse voiceConversionDetailsResponse, long j) {
        this.LIZ = voiceConversionDetailsResponse;
        this.LIZIZ = j;
    }
}
