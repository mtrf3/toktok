package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLU extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "tablet_info";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        return LFH.LIZIZ.LIZLLL().LJIJ().LIZJ();
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }
}
