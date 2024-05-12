package X;

import X.InterfaceC63694OzC;
import Y.ARunnableS44S0100000_8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KJt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51517KJt<T extends InterfaceC63694OzC<T>> {
    public static List<? extends AbstractC51517KJt<?>> LJ = C61878OQg.INSTANCE;
    public final C51516KJs<T> LIZ = new C51516KJs<>(new AqS158S0100000_8((AbstractC51517KJt) this, 439));
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8((AbstractC51517KJt) this, 438));
    public final ArrayList<EnumC51518KJu> LIZJ = new ArrayList<>();
    public final C49015JLn<T> LIZLLL = new C49015JLn<>();

    public abstract T LIZ();

    public AbstractC51517KJt() {
        LJ = ORZ.LLIIJI(this, LJ);
    }

    public final synchronized C51513KJp LIZIZ(KJU bindTo, EnumC51518KJu scope) {
        o.LJIIIZ(bindTo, "bindTo");
        o.LJIIIZ(scope, "scope");
        if (!this.LIZJ.contains(scope)) {
            this.LIZJ.add(scope);
        }
        if (scope == EnumC51518KJu.EXTERNAL) {
            C51520KJw c51520KJw = (C51520KJw) this.LIZ.LIZLLL.getValue();
            c51520KJw.getClass();
            C38995FSd.LIZLLL().execute(new ARunnableS44S0100000_8(c51520KJw, 7));
        }
        return new C51513KJp(bindTo, scope, this);
    }
}
