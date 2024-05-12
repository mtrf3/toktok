package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OIq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61680OIq extends AbstractC61685OIv {
    public C61680OIq() {
        super("lowcase");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null && list.size() == 1 && (ListProtector.get(list, 0) instanceof String)) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                Locale locale = Locale.US;
                o.LJFF(locale, "Locale.US");
                String lowerCase = ((String) obj).toLowerCase(locale);
                o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }
        throw new C61596OFk(105, "params error");
    }
}
