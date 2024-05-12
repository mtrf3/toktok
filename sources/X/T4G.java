package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4G implements T43 {
    public boolean LJLIL;
    public final TEZ LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC88472Yns<Integer, Boolean> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public T4G(TEZ stickerDataManager, int i, InterfaceC88472Yns<? super Integer, Boolean> externalCondition) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(externalCondition, "externalCondition");
        this.LJLILLLLZI = stickerDataManager;
        this.LJLJI = i;
        this.LJLJJI = externalCondition;
    }

    @Override // X.T43
    public final boolean LJJIJIIJIL(Effect effect, int i, int i2) {
        o.LJIIIZ(effect, "effect");
        if (this.LJLIL || this.LJLILLLLZI.LLJJIJIIJIL() != null || i != this.LJLJI || !this.LJLJJI.invoke(Integer.valueOf(i2)).booleanValue()) {
            return false;
        }
        this.LJLIL = true;
        return true;
    }
}
