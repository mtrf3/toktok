package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Eip, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37199Eip extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C37199Eip LJLIL = new C37199Eip();

    public C37199Eip() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        String str;
        String LIZ = C85990Xow.LIZ();
        if (LIZ != null) {
            str = LIZ.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = null;
        }
        return Boolean.valueOf(o.LJ(str, "ID"));
    }
}
