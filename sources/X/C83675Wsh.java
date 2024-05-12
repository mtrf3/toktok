package X;

import com.bytedance.ies.effecteditor.swig.EffectHandleGetter;
import com.ss.android.vesdk.VERecorder;
import java.util.Objects;

/* renamed from: X.Wsh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83675Wsh extends EffectHandleGetter {
    @Override // com.bytedance.ies.effecteditor.swig.EffectHandleGetter
    public final long getEffectHandle() {
        if (IBZ.LIZ().LIZIZ() != null) {
            VERecorder LIZIZ = IBZ.LIZ().LIZIZ();
            Objects.requireNonNull(LIZIZ);
            return LIZIZ.LIZIZ.getEffectHandler();
        }
        return 0L;
    }
}
