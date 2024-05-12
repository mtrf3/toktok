package X;

import Y.IDfS28S0200000_42;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPageFragment;
import java.util.List;

/* renamed from: X.acr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94181acr implements InterfaceC65462ha<List<? extends AssetsLibData.AssetsItemData>> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ PrefabPageFragment LJLILLLLZI;

    public C94181acr(InterfaceC65462ha interfaceC65462ha, PrefabPageFragment prefabPageFragment) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = prefabPageFragment;
    }

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super List<? extends AssetsLibData.AssetsItemData>> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new IDfS28S0200000_42(interfaceC64672gJ, this.LJLILLLLZI, 7), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
