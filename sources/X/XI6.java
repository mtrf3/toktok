package X;

import Y.IDxS312S0100000_15;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.state.base.StateAgentCache;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XI6<S> implements InterfaceC213128Ya<S>, AnonymousClass884<S> {
    public final InterfaceC65350Pko<? extends StateAgentCache<S>> LJLIL;
    public final XI7 LJLILLLLZI = new XI7(0);

    public abstract IMotaCache LJIIL(Object obj, String str);

    @Override // X.AnonymousClass884
    public final C79883Bo LIZ() {
        return new C79883Bo((InterfaceC70352pT) this.LJLILLLLZI.LIZJ);
    }

    public XI6(C65776Prg c65776Prg) {
        this.LJLIL = c65776Prg;
        C84763XOl.LIZIZ().LJJIFFI(C73636SvA.LJLIL).LIZ(new IDxS312S0100000_15(this, 1));
    }

    @Override // X.InterfaceC213128Ya
    public final S LJ(String id) {
        S s;
        StateAgentCache stateAgentCache;
        S s2;
        o.LJIIIZ(id, "id");
        if (C52535Kjb.LIZIZ()) {
            IMotaCache LIZ = C84578XHi.LIZ(C39557Ffl.LIZ(this.LJLIL), id);
            if (!(LIZ instanceof StateAgentCache) || (stateAgentCache = (StateAgentCache) LIZ) == null || (s2 = (S) stateAgentCache.getState()) == null) {
                return LJIIIZ();
            }
            return s2;
        }
        XI7 xi7 = this.LJLILLLLZI;
        xi7.getClass();
        OSZ osz = (OSZ) ((C0M6) xi7.LIZ).LIZIZ(id);
        if (osz != null && (s = (S) osz.getSecond()) != null) {
            return s;
        }
        return LJIIIZ();
    }

    @Override // X.AnonymousClass884
    public final void LJI(AnonymousClass885<S> subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        XI7 xi7 = this.LJLILLLLZI;
        xi7.getClass();
        ((CopyOnWriteArraySet) xi7.LIZIZ).add(subscriber);
    }

    @Override // X.AnonymousClass884
    public final void LJIIIIZZ(AnonymousClass885<S> anonymousClass885) {
        if (anonymousClass885 != null) {
            XI7 xi7 = this.LJLILLLLZI;
            xi7.getClass();
            ((CopyOnWriteArraySet) xi7.LIZIZ).remove(anonymousClass885);
        }
    }

    @Override // X.InterfaceC213128Ya
    public final void LJIIJ(Object obj, String id) {
        IMotaCache LJIIL;
        o.LJIIIZ(id, "id");
        if (C52535Kjb.LIZIZ()) {
            IMotaCache LIZ = C84578XHi.LIZ(C39557Ffl.LIZ(this.LJLIL), id);
            if ((!(LIZ instanceof StateAgentCache) || LIZ == null) && (LJIIL = LJIIL(obj, id)) != null) {
                C84578XHi.LIZJ(id, LJIIL, EnumC84576XHg.Query);
                return;
            }
            return;
        }
        XI7 xi7 = this.LJLILLLLZI;
        xi7.getClass();
        OSZ osz = (OSZ) ((C0M6) xi7.LIZ).LIZIZ(id);
        if (osz == null) {
            C0M6 c0m6 = (C0M6) xi7.LIZ;
            OSZ osz2 = new OSZ(obj, obj);
            o.LJIIIZ(c0m6, "<this>");
            c0m6.LIZJ(id, osz2);
            xi7.LIZ(id, obj, EnumC2063587z.NET);
            return;
        }
        OSZ osz3 = new OSZ(obj, osz.getSecond());
        C0M6 c0m62 = (C0M6) xi7.LIZ;
        o.LJIIIZ(c0m62, "<this>");
        c0m62.LIZJ(id, osz3);
    }

    public final void LJIIJJI(String id, Object state, EnumC84576XHg operation) {
        EnumC2063587z source;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(operation, "operation");
        int i = C84577XHh.LIZ[operation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        source = EnumC2063587z.MUTATION;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    source = EnumC2063587z.ROLLBACK;
                }
            } else {
                source = EnumC2063587z.OPTIMISTIC;
            }
        } else {
            source = EnumC2063587z.NET;
        }
        XI7 xi7 = this.LJLILLLLZI;
        xi7.getClass();
        o.LJIIIZ(source, "source");
        ((C3BJ) xi7.LIZJ).LIZIZ(new AnonymousClass883(id, state, source));
    }
}
