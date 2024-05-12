package X;

import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPageFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPageFragment$observeData$3", f = "PrefabPageFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.anF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94825anF extends AbstractC65782Prm implements InterfaceC88473Ynt<List<? extends AssetsLibData.AssetsItemData>, C94185acv, InterfaceC67352kd<? super List<? extends C94178aco>>, Object> {
    public /* synthetic */ Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PrefabPageFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94825anF(PrefabPageFragment prefabPageFragment, InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = prefabPageFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        boolean z2;
        C141335gf.LIZJ(obj);
        List list = (List) this.LJLIL;
        C94185acv c94185acv = (C94185acv) this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                AssetsLibData.AssetsItemData assetsItemData = (AssetsLibData.AssetsItemData) obj2;
                int intValue = new Integer(i2).intValue();
                String str = c94185acv.LJLIL;
                String str2 = this.LJLJI.LJLJJI;
                if (str2 != null) {
                    if (o.LJ(str, str2) && c94185acv.LJLILLLLZI == intValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    PrefabPageFragment prefabPageFragment = this.LJLJI;
                    if (z) {
                        i = c94185acv.LJLJI;
                        z2 = c94185acv.LJLJJI;
                    } else {
                        i = 0;
                        z2 = false;
                    }
                    prefabPageFragment.getClass();
                    String str3 = assetsItemData.effectId;
                    String str4 = assetsItemData.iconUrl;
                    String str5 = assetsItemData.name;
                    if (!z) {
                        i = 0;
                    }
                    arrayList.add(new C94178aco(i, str3, z, str4, str5, z2));
                    i2 = i3;
                } else {
                    o.LJIJI("categoryName");
                    throw null;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(List<? extends AssetsLibData.AssetsItemData> list, C94185acv selectedState, InterfaceC67352kd<? super List<? extends C94178aco>> interfaceC67352kd) {
        InterfaceC67352kd<? super List<? extends C94178aco>> continuation = interfaceC67352kd;
        o.LJIIIZ(list, "list");
        o.LJIIIZ(selectedState, "selectedState");
        o.LJIIIZ(continuation, "continuation");
        C94825anF c94825anF = new C94825anF(this.LJLJI, continuation);
        c94825anF.LJLIL = list;
        c94825anF.LJLILLLLZI = selectedState;
        return c94825anF.invokeSuspend(C76800UCe.LIZ);
    }
}
