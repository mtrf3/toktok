package X;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83311Wmp extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C83310Wmo LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83311Wmp(C83310Wmo c83310Wmo) {
        super(0);
        this.LJLIL = c83310Wmo;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C83310Wmo c83310Wmo = this.LJLIL;
        c83310Wmo.LIZLLL = true;
        ((ConcurrentLinkedQueue) c83310Wmo.LJ).clear();
        List<Param> mInitParam = c83310Wmo.LJIIJJI;
        o.LJIIIIZZ(mInitParam, "mInitParam");
        for (Object obj : mInitParam) {
            AbstractC83313Wmr<Param, Target> abstractC83313Wmr = c83310Wmo.LJIIL;
            AbstractC83312Wmq LIZ = abstractC83313Wmr.LIZ(obj, abstractC83313Wmr.LIZ.LIZJ());
            LIZ.getClass();
            ((ConcurrentLinkedQueue) c83310Wmo.LJ).offer(LIZ);
        }
        c83310Wmo.LJIIJJI.clear();
        this.LJLIL.LJIIIZ();
        return C76800UCe.LIZ;
    }
}
