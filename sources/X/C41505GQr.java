package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.GQr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41505GQr extends AbstractC41479GPr {
    public final CreateBaseAwemeResponse LIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success response:");
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C41505GQr(CreateBaseAwemeResponse response) {
        o.LJIIIZ(response, "response");
        this.LIZ = response;
    }
}
