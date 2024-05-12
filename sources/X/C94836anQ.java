package X;

import com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditViewModel;
import com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditViewModel$initData$1$1", f = "PrefabEditViewModel.kt", l = {24}, m = "invokeSuspend")
/* renamed from: X.anQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94836anQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IDqS423S0100000_42 LJLILLLLZI;
    public final /* synthetic */ Feature LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94836anQ(IDqS423S0100000_42 iDqS423S0100000_42, Feature feature, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iDqS423S0100000_42;
        this.LJLJI = feature;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94836anQ(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EEStdUIAnnotationBaseList mappableUiAnnotations;
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
            Feature feature = this.LJLJI;
            if (feature != null && (mappableUiAnnotations = feature.getMappableUiAnnotations()) != null) {
                XLM xlm = ((PrefabEditViewModel) this.LJLILLLLZI.l0).LJLIL;
                ArrayList arrayList = new ArrayList();
                Iterator<UIAnnotationBase> it = mappableUiAnnotations.iterator();
                while (it.hasNext()) {
                    UIAnnotationBase next = it.next();
                    UIAnnotationUIType uIType = next.getUIType();
                    if (uIType != null && C93660aUS.LIZ[uIType.ordinal()] == 1) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UIAnnotationBase uIAnnotationBase = (UIAnnotationBase) it2.next();
                    UIAnnotationUIType uIType2 = uIAnnotationBase.getUIType();
                    if (uIType2 != null && C93660aUS.LIZIZ[uIType2.ordinal()] == 1) {
                        UIAnnotationFloat dynamicCast = UIAnnotationFloat.dynamicCast((Element) uIAnnotationBase);
                        o.LJIIIIZZ(dynamicCast, "UIAnnotationFloat.dynamicCast(base)");
                        arrayList2.add(dynamicCast);
                    } else {
                        throw new Exception();
                    }
                }
                this.LJLIL = 1;
                xlm.setValue(arrayList2);
                if (C76800UCe.LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
