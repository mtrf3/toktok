package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OIp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61679OIp extends AbstractC61685OIv {
    public C61679OIp() {
        super("upcase");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null && list.size() == 1 && (ListProtector.get(list, 0) instanceof String)) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                Locale locale = Locale.US;
                o.LJFF(locale, "Locale.US");
                String upperCase = ((String) obj).toUpperCase(locale);
                o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                return upperCase;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }
        throw new C61596OFk(105, "params error");
    }
}
