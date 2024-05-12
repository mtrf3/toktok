package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LxQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55940LxQ extends F9E implements C33Q {
    public final AbstractC72932td<C55942LxS> LJLIL;
    public final AbstractC72932td<C55941LxR> LJLILLLLZI;
    public final AbstractC72932td<C68722mq> LJLJI;

    public C55940LxQ() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public /* synthetic */ C55940LxQ(int i) {
        this(new C72912tb(new C55942LxS((EnumC55936LxM) null, 3)), new C72912tb(new C55941LxR(false, (EnumC55946LxW) null, 7)), C33X.LIZ);
    }

    public C55940LxQ(AbstractC72932td<C55942LxS> iconConfig, AbstractC72932td<C55941LxR> dotConfig, AbstractC72932td<C68722mq> tooltipConfig) {
        o.LJIIIZ(iconConfig, "iconConfig");
        o.LJIIIZ(dotConfig, "dotConfig");
        o.LJIIIZ(tooltipConfig, "tooltipConfig");
        this.LJLIL = iconConfig;
        this.LJLILLLLZI = dotConfig;
        this.LJLJI = tooltipConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C55940LxQ L(C55940LxQ c55940LxQ, C72912tb c72912tb, C72912tb c72912tb2, C72912tb c72912tb3, int i) {
        AbstractC72932td iconConfig = c72912tb;
        if ((i & 1) != 0) {
            iconConfig = c55940LxQ.LJLIL;
        }
        AbstractC72932td dotConfig = c72912tb2;
        if ((i & 2) != 0) {
            dotConfig = c55940LxQ.LJLILLLLZI;
        }
        AbstractC72932td tooltipConfig = c72912tb3;
        if ((i & 4) != 0) {
            tooltipConfig = c55940LxQ.LJLJI;
        }
        c55940LxQ.getClass();
        o.LJIIIZ(iconConfig, "iconConfig");
        o.LJIIIZ(dotConfig, "dotConfig");
        o.LJIIIZ(tooltipConfig, "tooltipConfig");
        return new C55940LxQ(iconConfig, dotConfig, tooltipConfig);
    }
}
