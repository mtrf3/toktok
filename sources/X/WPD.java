package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPD extends F9E {
    public final String LJLIL;
    public final InterfaceC82236WPg LJLILLLLZI;
    public final InterfaceC142225i6 LJLJI;
    public final InterfaceC82284WRc LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public WPD(String name, InterfaceC82236WPg repository, InterfaceC142225i6 intensitySource, InterfaceC82284WRc logicStore) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(intensitySource, "intensitySource");
        o.LJIIIZ(logicStore, "logicStore");
        this.LJLIL = name;
        this.LJLILLLLZI = repository;
        this.LJLJI = intensitySource;
        this.LJLJJI = logicStore;
    }
}
