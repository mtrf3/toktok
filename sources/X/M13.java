package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M13 extends F9E implements C33Q {
    public final AbstractC72932td<M14> LJLIL;
    public final AbstractC72932td<M11> LJLILLLLZI;

    public M13() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ M13(int i) {
        this(new C72912tb(new M14((M1C) null, 3)), new C72912tb(new M11(false, (M1L) null, 7)));
    }

    public M13(AbstractC72932td<M14> iconConfig, AbstractC72932td<M11> dotConfig) {
        o.LJIIIZ(iconConfig, "iconConfig");
        o.LJIIIZ(dotConfig, "dotConfig");
        this.LJLIL = iconConfig;
        this.LJLILLLLZI = dotConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static M13 L(M13 m13, C72912tb c72912tb, C72912tb c72912tb2, int i) {
        AbstractC72932td iconConfig = c72912tb;
        if ((i & 1) != 0) {
            iconConfig = m13.LJLIL;
        }
        AbstractC72932td dotConfig = c72912tb2;
        if ((i & 2) != 0) {
            dotConfig = m13.LJLILLLLZI;
        }
        m13.getClass();
        o.LJIIIZ(iconConfig, "iconConfig");
        o.LJIIIZ(dotConfig, "dotConfig");
        return new M13(iconConfig, dotConfig);
    }
}
