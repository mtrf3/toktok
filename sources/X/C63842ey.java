package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63842ey extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<String, Integer>, CharSequence> {
    public static final C63842ey LJLIL = new C63842ey();

    public C63842ey() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Map.Entry<String, Integer> entry) {
        Map.Entry<String, Integer> entry2 = entry;
        o.LJIIIZ(entry2, "entry");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(entry2.getKey());
        LIZ.append('-');
        LIZ.append(entry2.getValue().intValue());
        return X1D.LIZIZ(LIZ);
    }
}