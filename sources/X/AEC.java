package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class AEC implements InterfaceC57784Mm4 {
    public final boolean LJLIL;
    public final Object LJLILLLLZI;
    public String LJLJI;
    public AG6 LJLJJI;

    public AEC() {
        this(false, null, 15);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public Object LIZ() {
        return this.LJLILLLLZI;
    }

    public boolean LIZIZ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public AEC(boolean z, Object obj, int i) {
        z = (i & 2) != 0 ? true : z;
        obj = (i & 4) != 0 ? null : obj;
        String identity = (i & 8) != 0 ? AnonymousClass629.LIZ("randomUUID().toString()") : null;
        o.LJIIIZ(identity, "identity");
        this.LJLIL = z;
        this.LJLILLLLZI = obj;
        this.LJLJI = identity;
    }
}
