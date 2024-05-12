package X;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.o;

/* renamed from: X.PsS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC65824PsS {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public static final EnumSet<EnumC65824PsS> ALL;
    public static final C65823PsR Companion = new C65823PsR();
    public final long LJLIL;

    public static final EnumSet<EnumC65824PsS> parseOptions(long j) {
        Companion.getClass();
        return C65823PsR.LIZ(j);
    }

    static {
        EnumSet<EnumC65824PsS> allOf = EnumSet.allOf(EnumC65824PsS.class);
        o.LJIIIIZZ(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC65824PsS[] valuesCustom() {
        return (EnumC65824PsS[]) Arrays.copyOf(values(), 3);
    }

    public final long getValue() {
        return this.LJLIL;
    }

    EnumC65824PsS(long j) {
        this.LJLIL = j;
    }
}
