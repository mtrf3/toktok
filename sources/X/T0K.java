package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T0K {
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(RA8.LJLIL);
    public final T0M LIZ;
    public final T0J<EnumC71789SFl> LIZIZ = T0J.LJJZZI();

    public T0K(T0M t0m) {
        this.LIZ = t0m;
    }

    public final void LIZ(String pwd) {
        o.LJIIIZ(pwd, "pwd");
        if (!this.LIZ.LIZ) {
            this.LIZIZ.onNext(EnumC71789SFl.NOT_ENABLED);
            return;
        }
        if (pwd.length() == 0) {
            this.LIZIZ.onNext(EnumC72824Si4.UNKNOWN.getPasswordComplexity());
            return;
        }
        EnumC72824Si4 enumC72824Si4 = EnumC72824Si4.MEDIUM;
        Iterator it = ((ArrayList) this.LIZ.LIZJ).iterator();
        while (it.hasNext()) {
            enumC72824Si4 = ((T0W) it.next()).LIZ(pwd, enumC72824Si4);
            if (enumC72824Si4 == EnumC72824Si4.INSTANT_WEAK) {
                this.LIZIZ.onNext(enumC72824Si4.getPasswordComplexity());
                return;
            }
        }
        this.LIZIZ.onNext(enumC72824Si4.getPasswordComplexity());
    }
}
