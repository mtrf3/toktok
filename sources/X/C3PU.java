package X;

import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3PU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PU extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C3PU INSTANCE = new C3PU();

    public C3PU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        boolean z;
        C62822Ol8 c62822Ol8 = C49631Jdr.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String LJFF = C97343ru.LJFF(R.string.s33);
            C96963rI.LJII().getClass();
            String LLLZ = C16880lQ.LLLZ(LJFF, Arrays.copyOf(new Object[]{C97353rv.LIZJ()}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            return C47261Igj.LJJIJ(LLLZ);
        }
        String LJFF2 = C97343ru.LJFF(R.string.co2);
        C96963rI.LJII().getClass();
        return C47261Igj.LJJIJIIJI(Q8U.LIZIZ(new Object[]{C97353rv.LIZJ()}, 1, LJFF2, "format(format, *args)"), C97343ru.LJFF(R.string.co3));
    }
}
