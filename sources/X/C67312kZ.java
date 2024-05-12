package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadMgr$updateEffect$4$1$onSuccess$1", f = "DraftStickerDownloadMgr.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67312kZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<Effect> LJLIL;
    public final /* synthetic */ InterfaceC67352kd<List<Effect>> LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67312kZ(List<Effect> list, InterfaceC67352kd<? super List<Effect>> interfaceC67352kd, List<String> list2, InterfaceC67352kd<? super C67312kZ> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC67352kd;
        this.LJLJI = list2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67312kZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<Effect> list = this.LJLIL;
        List<String> list2 = this.LJLJI;
        ArrayList arrayList = null;
        for (Effect effect : list) {
            if (list2.contains(effect.getEffectId())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(effect);
            }
        }
        InterfaceC67352kd<List<Effect>> interfaceC67352kd = this.LJLILLLLZI;
        C3C5.m7constructorimpl(arrayList);
        interfaceC67352kd.resumeWith(arrayList);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
