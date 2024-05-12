package X;

import Y.AfS63S0100000_11;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Spx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73313Spx extends QXX implements InterfaceC73323Sq7, InterfaceC73317Sq1 {
    public final C73314Spy LJLIL = new C73314Spy();

    @Override // X.InterfaceC73317Sq1
    public final void release() {
        this.LJLIL.release();
    }

    @Override // X.QXX, X.InterfaceC73323Sq7
    public final C73316Sq0 LJJIJL(InterfaceC68914R2w from, InterfaceC68914R2w to, AbstractC73922Szm abstractC73922Szm) {
        o.LJIIJ(from, "from");
        o.LJIIJ(to, "to");
        C73919Szj c73919Szj = new C73919Szj(from, to, abstractC73922Szm);
        Object obj = c73919Szj.LIZ;
        if (obj != null) {
            C73422Sri LJFF = ((InterfaceC68900R2i) obj).LJFF();
            JAG.LJFF.getClass();
            AbstractC73946T0k defaultScheduler = (AbstractC73946T0k) JAG.LJ.getValue();
            o.LJFF(defaultScheduler, "defaultScheduler");
            AbstractC73672Svk<R> LJJIII = LJFF.LJJJ(defaultScheduler).LJJIFFI(new C68917R2z(c73919Szj)).LJJIII(new IDhS105S0100000_12(c73919Szj, 32), false);
            AfS63S0100000_11 afS63S0100000_11 = new AfS63S0100000_11(c73919Szj, 52);
            Object obj2 = C72268SXw.LJLIL;
            if (obj2 != null) {
                obj2 = new AfS64S0100000_12(obj2, 146);
            }
            C73316Sq0 c73316Sq0 = new C73316Sq0((C73411SrX) LJJIII.LJJJLIIL(afS63S0100000_11, (InterfaceC64592gB) obj2));
            C73314Spy c73314Spy = this.LJLIL;
            c73314Spy.getClass();
            c73314Spy.LJLIL.LIZ(c73316Sq0);
            return c73316Sq0;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceableObserved<kotlin.Pair<K, V?>>");
    }
}
