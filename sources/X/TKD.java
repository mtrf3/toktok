package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public final class TKD<V> implements Callable {
    public final /* synthetic */ Effect LJLIL;
    public final /* synthetic */ C82823Wex LJLILLLLZI;
    public final /* synthetic */ TEA LJLJI;
    public final /* synthetic */ Integer LJLJJI;

    public TKD(Effect effect, C82823Wex c82823Wex, TEA tea, Integer num) {
        this.LJLIL = effect;
        this.LJLILLLLZI = c82823Wex;
        this.LJLJI = tea;
        this.LJLJJI = num;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Effect effect = this.LJLIL;
        if (effect != null) {
            C82823Wex c82823Wex = this.LJLILLLLZI;
            TEA tea = this.LJLJI;
            Integer num = this.LJLJJI;
            InterfaceC73367Sqp interfaceC73367Sqp = (InterfaceC73367Sqp) c82823Wex.LJIIJJI.getValue();
            if (interfaceC73367Sqp != null) {
                interfaceC73367Sqp.LIZIZ(effect, tea, num, true);
                return C76800UCe.LIZ;
            }
        }
        return null;
    }
}
