package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGL {
    public static XH8 LJFF;
    public final XH8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public XGL() {
        this(0);
    }

    public XGL(XH8 context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(XGM.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(XGO.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 890));
        this.LJ = C221108m2.LIZIZ(XGN.LJLIL);
    }

    public final <D extends InterfaceC199277rv> XGR<D> LIZ(XGE<D> mutation) {
        o.LJIIIZ(mutation, "mutation");
        return new XGR<>(this, mutation, this.LIZ);
    }

    public final <D extends InterfaceC199367s4> XGR<D> LIZIZ(InterfaceC57356MfA<D> query) {
        o.LJIIIZ(query, "query");
        return new XGR<>(this, query, this.LIZ);
    }

    public /* synthetic */ XGL(int i) {
        this(XH8.LIZ);
    }
}
