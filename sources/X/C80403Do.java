package X;

import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.3Do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80403Do {
    public final TTSVoiceDetailsResponse LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80403Do)) {
            return false;
        }
        C80403Do c80403Do = (C80403Do) obj;
        return o.LJ(this.LIZ, c80403Do.LIZ) && this.LIZIZ == c80403Do.LIZIZ;
    }

    public final int hashCode() {
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = this.LIZ;
        return C16880lQ.LLJIJIL(this.LIZIZ) + ((tTSVoiceDetailsResponse == null ? 0 : tTSVoiceDetailsResponse.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTSVoiceDetailNode(voiceDetail=");
        LIZ.append(this.LIZ);
        LIZ.append(", timestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C80403Do(TTSVoiceDetailsResponse tTSVoiceDetailsResponse, long j) {
        this.LIZ = tTSVoiceDetailsResponse;
        this.LIZIZ = j;
    }
}
