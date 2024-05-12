package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.api.PrefabPanelResProvider;
import com.bytedance.ies.effectcreator.swig.Feature;
import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel$loadEffectList$1$1", f = "PrefabViewModel.kt", l = {82, 83, LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.anO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94834anO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94835anP LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94834anO(C94835anP c94835anP, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94835anP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94834anO(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            XLM xlm = this.LJLILLLLZI.LJLILLLLZI.LJLIL;
            C94058aas c94058aas = new C94058aas(e);
            this.LJLIL = 3;
            xlm.setValue(c94058aas);
            if (C76800UCe.LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            Feature feature = this.LJLILLLLZI.LJLILLLLZI.LJLLL;
            if (feature == null || (str = feature.getLokiPanelKey()) == null) {
                PrefabData prefabData = this.LJLILLLLZI.LJLILLLLZI.LJLLILLLL;
                if (prefabData != null) {
                    str = prefabData.lokiPanelKey;
                } else {
                    str = null;
                }
            }
            PrefabPanelResProvider prefabPanelResProvider = (PrefabPanelResProvider) C93745aVp.LIZ(PrefabPanelResProvider.class);
            if (str == null) {
                str = "";
            }
            this.LJLIL = 1;
            obj = prefabPanelResProvider.getAllResourceList(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        LinkedHashMap<String, List<AssetsLibData.AssetsItemData>> linkedHashMap = ((AssetsLibData) obj).LJLIL;
        XLM xlm2 = this.LJLILLLLZI.LJLILLLLZI.LJLIL;
        C94060aau c94060aau = new C94060aau(linkedHashMap);
        this.LJLIL = 2;
        xlm2.setValue(c94060aau);
        if (C76800UCe.LIZ == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }
}
