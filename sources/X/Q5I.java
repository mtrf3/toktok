package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public enum Q5I {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final C66446Q5y Companion = new C66446Q5y();
    public final String LJLIL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q5I[] valuesCustom() {
        return (Q5I[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static final Q5I fromString(String str) {
        Companion.getClass();
        Q5I[] valuesCustom = valuesCustom();
        int length = valuesCustom.length;
        int i = 0;
        while (i < length) {
            Q5I q5i = valuesCustom[i];
            i++;
            if (o.LJ(q5i.toString(), str)) {
                return q5i;
            }
        }
        return FACEBOOK;
    }

    Q5I(String str) {
        this.LJLIL = str;
    }
}
