package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FJ9 extends AbstractC43178Gx4 {
    public final String LIZ = "used_abmock";

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return true;
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        return GsonProtectorUtils.toJson(C75792yF.LIZIZ(), FHR.LIZ());
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return this.LIZ;
    }
}
