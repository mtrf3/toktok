package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLS extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "screen_size";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        int LIZLLL = C53947LFf.LIZLLL();
        int LIZ = C53947LFf.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZLLL);
        LIZ2.append('*');
        LIZ2.append(LIZ);
        LIZ2.append("(dp)");
        return X1D.LIZIZ(LIZ2);
    }
}
