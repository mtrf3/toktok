package X;

import android.os.Bundle;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Q4z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66421Q4z {
    public final GraphRequest LIZ;

    public C66421Q4z(Bundle bundle, Q51 httpMethod) {
        o.LJIIIZ(httpMethod, "httpMethod");
        this.LIZ = new GraphRequest(null, "me", bundle, C66420Q4y.LIZ(httpMethod), null, 32);
    }
}
