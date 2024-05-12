package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;

/* loaded from: classes13.dex */
public final class TFF<T> implements Observer {
    public static final TFF<T> LJLIL = new TFF<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        SearchEffectModel searchEffectModel;
        InterfaceC44306HaA LJFF = Z9N.LIZIZ.LJFF();
        SearchEffectResponseV2 searchEffectResponseV2 = (SearchEffectResponseV2) ((C74413TIj) obj).LIZ;
        if (searchEffectResponseV2 != null) {
            searchEffectModel = searchEffectResponseV2.getData();
        } else {
            searchEffectModel = null;
        }
        LJFF.LJIJI(searchEffectModel);
    }
}
