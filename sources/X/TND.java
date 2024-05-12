package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TND<T, R> implements InterfaceC48038ItG<OSZ<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {
    public static final TND LJLIL = new TND();

    @Override // X.InterfaceC48038ItG
    public final List<? extends ProviderEffect> apply(OSZ<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> osz) {
        OSZ<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> osz2 = osz;
        o.LJIIIZ(osz2, "<name for destructuring parameter 0>");
        return osz2.getFirst();
    }
}
