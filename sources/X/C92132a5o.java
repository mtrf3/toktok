package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import ujb.o;

/* renamed from: X.a5o, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92132a5o extends AbstractC91689Zyf<Long> {
    public C92132a5o() {
        super(false);
    }

    @Override // X.AbstractC91689Zyf
    public final String LIZIZ() {
        return "long";
    }

    @Override // X.AbstractC91689Zyf
    public final Long LIZJ(String str) {
        String str2;
        long parseLong;
        if (o.LJJJJ(str, "L", false)) {
            str2 = str.substring(0, str.length() - 1);
            kotlin.jvm.internal.o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = str;
        }
        if (o.LJJJLIIL(str, "0x", false)) {
            String substring = str2.substring(2);
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            C17N.LJIIJ(16);
            parseLong = CastLongProtector.parseLong(substring, 16);
        } else {
            parseLong = CastLongProtector.parseLong(str2);
        }
        return Long.valueOf(parseLong);
    }

    @Override // X.AbstractC91689Zyf
    public final Long LIZ(Bundle bundle, String str) {
        Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
        if (LLJJIII != null) {
            return Long.valueOf(((Long) LLJJIII).longValue());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    @Override // X.AbstractC91689Zyf
    public final void LIZLLL(Bundle bundle, String key, Long l) {
        long longValue = l.longValue();
        kotlin.jvm.internal.o.LJIIIZ(key, "key");
        bundle.putLong(key, longValue);
    }
}
