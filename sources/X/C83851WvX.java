package X;

import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WvX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83851WvX extends F9E {
    public final InterfaceC83878Wvy LJLIL;
    public final InterfaceC83829WvB LJLILLLLZI;
    public final C82127WLb LJLJI;
    public final C83835WvH LJLJJI;
    public final InterfaceC65784Pro<C83935Wwt> LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C83851WvX(InterfaceC83878Wvy globalContext, InterfaceC83829WvB recorder, C82127WLb shakeFreeManager, C83835WvH sessionEventDispatcher, AqS161S0200000_14 aqS161S0200000_14) {
        o.LJIIIZ(globalContext, "globalContext");
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(shakeFreeManager, "shakeFreeManager");
        o.LJIIIZ(sessionEventDispatcher, "sessionEventDispatcher");
        this.LJLIL = globalContext;
        this.LJLILLLLZI = recorder;
        this.LJLJI = shakeFreeManager;
        this.LJLJJI = sessionEventDispatcher;
        this.LJLJJL = aqS161S0200000_14;
    }
}
