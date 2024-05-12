package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.a5k, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92128a5k extends AbstractC91689Zyf<Float> {
    public C92128a5k() {
        super(false);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "float";
    }

    @Override // X.AbstractC91689Zyf
    public final Float LIZJ(String str) {
        return Float.valueOf(CastFloatProtector.parseFloat(str));
    }

    @Override // X.AbstractC91689Zyf
    public final Float LIZ(Bundle bundle, String str) {
        Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
        if (LLJJIII != null) {
            return Float.valueOf(((Float) LLJJIII).floatValue());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, Float f) {
        float floatValue = f.floatValue();
        o.LJIIIZ(key, "key");
        bundle.putFloat(key, floatValue);
    }
}
