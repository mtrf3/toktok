package X;

import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import fjb.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$dedupDrafts$2", f = "MyEffectsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftEffect>>, Object> {
    public final /* synthetic */ List<MobileEffect> LJLIL;
    public final /* synthetic */ List<DraftEffect> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQK(List<MobileEffect> list, List<DraftEffect> list2, InterfaceC67352kd<? super EQK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQK(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<MobileEffect> list = this.LJLIL;
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (MobileEffect mobileEffect : list) {
            OSZ osz = new OSZ(mobileEffect.getEffectId(), new Integer(mobileEffect.getModerationStatus()));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        List<DraftEffect> list2 = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (DraftEffect draftEffect : list2) {
            DraftEffect draftEffect2 = draftEffect;
            if (linkedHashMap.containsKey(draftEffect2.getEffectId())) {
                Integer num = (Integer) linkedHashMap.get(draftEffect2.getEffectId());
                if (num != null && num.intValue() != 2 && num.intValue() == 3) {
                    EffectCreatorServiceImpl.LJIIJ().LIZIZ(C5L7.LIZ(), draftEffect2.getDraft().draftID);
                }
            } else {
                arrayList.add(draftEffect);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftEffect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
