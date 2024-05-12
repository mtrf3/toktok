package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import ujb.o;

/* renamed from: X.a5m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92130a5m extends AbstractC91689Zyf<Integer> {
    public C92130a5m() {
        super(false);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "integer";
    }

    @Override // X.AbstractC91689Zyf
    public final Integer LIZJ(String str) {
        int parseInt;
        if (o.LJJJLIIL(str, "0x", false)) {
            String substring = str.substring(2);
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            C17N.LJIIJ(16);
            parseInt = CastIntegerProtector.parseInt(substring, 16);
        } else {
            parseInt = CastIntegerProtector.parseInt(str);
        }
        return Integer.valueOf(parseInt);
    }

    @Override // X.AbstractC91689Zyf
    public final Integer LIZ(Bundle bundle, String str) {
        Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
        if (LLJJIII != null) {
            return Integer.valueOf(((Integer) LLJJIII).intValue());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, Integer num) {
        int intValue = num.intValue();
        kotlin.jvm.internal.o.LJIIIZ(key, "key");
        bundle.putInt(key, intValue);
    }
}
