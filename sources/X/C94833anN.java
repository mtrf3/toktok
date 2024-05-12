package X;

import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import com.bytedance.ies.effectcreator.swig.ElementId;
import com.bytedance.ies.effectcreator.swig.Feature;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel$emitEditPrefabEvent$1", f = "PrefabViewModel.kt", l = {272}, m = "invokeSuspend")
/* renamed from: X.anN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94833anN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PrefabViewModel LJLILLLLZI;
    public final /* synthetic */ AssetsLibData.AssetsItemData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94833anN(PrefabViewModel prefabViewModel, AssetsLibData.AssetsItemData assetsItemData, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = prefabViewModel;
        this.LJLJI = assetsItemData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94833anN(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ElementId id;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Feature feature = this.LJLILLLLZI.LJLLL;
            if (feature != null && (id = feature.id()) != null) {
                long longValue = new Long(id.objectId()).longValue();
                XLL xll = this.LJLILLLLZI.LJLJJL;
                OSZ osz = new OSZ(new Long(longValue), this.LJLJI.category);
                this.LJLIL = 1;
                if (xll.emit(osz, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
