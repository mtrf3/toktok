package X;

import Y.AfS64S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import fjb.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$dealCategoryEffectsOperate$1$1$1$1", f = "DefaultStickerSource.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TJ6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CategoryEffectModel LJLILLLLZI;
    public final /* synthetic */ TJC LJLJI;
    public final /* synthetic */ AfS64S0100000_12 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TJ6(CategoryEffectModel categoryEffectModel, InterfaceC67352kd interfaceC67352kd, TJC tjc, AfS64S0100000_12 afS64S0100000_12) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = categoryEffectModel;
        this.LJLJI = tjc;
        this.LJLJJI = afS64S0100000_12;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new TJ6(this.LJLILLLLZI, completion, this.LJLJI, this.LJLJJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            ArrayList arrayList = new ArrayList(this.LJLILLLLZI.getEffects());
            Iterator<TJE> it = this.LJLJI.LIZ().iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            java.util.Map<String, List<Effect>> map = ((C74418TIo) this.LJLJJI.l0).LJ;
            String LIZIZ = this.LJLJI.LIZIZ();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(((EffectTemplate) next).getEffectId())) {
                    arrayList2.add(next);
                }
            }
            map.put(LIZIZ, arrayList2);
            CategoryEffectModel categoryEffectModel = this.LJLILLLLZI;
            List<? extends Effect> list = (List) ((LinkedHashMap) ((C74418TIo) this.LJLJJI.l0).LJ).get(this.LJLJI.LIZIZ());
            if (list == null) {
                list = new ArrayList<>();
            }
            categoryEffectModel.setEffects(list);
            XIF xif = EXX.LIZ;
            TJ7 tj7 = new TJ7(this, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, tj7, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
