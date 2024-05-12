package X;

import Y.IDhS105S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* renamed from: X.TMi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC74516TMi<V> implements Callable<InterfaceC115714gR<? extends C109444Rg>> {
    public final /* synthetic */ C74515TMh LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public CallableC74516TMi(C74515TMh c74515TMh, Effect effect, boolean z) {
        this.LJLIL = c74515TMh;
        this.LJLILLLLZI = effect;
        this.LJLJI = z;
    }

    @Override // java.util.concurrent.Callable
    public final InterfaceC115714gR<? extends C109444Rg> call() {
        return this.LJLIL.LJ.LIZIZ(this.LJLILLLLZI, this.LJLJI).LJJIJL(new IDhS105S0100000_12(this, 34));
    }
}
