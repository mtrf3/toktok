package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM$tryShootWithAddYours$1", f = "AddYoursEntranceButtonVM.kt", l = {42, 46}, m = "invokeSuspend")
/* renamed from: X.8uS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226328uS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC226378uX LJLILLLLZI;
    public final /* synthetic */ AddYoursEntranceButtonVM LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<AddYoursStickerStruct, Boolean, Boolean, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C226328uS(AbstractC226378uX abstractC226378uX, AddYoursEntranceButtonVM addYoursEntranceButtonVM, InterfaceC88473Ynt<? super AddYoursStickerStruct, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt, InterfaceC67352kd<? super C226328uS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC226378uX;
        this.LJLJI = addYoursEntranceButtonVM;
        this.LJLJJI = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C226328uS(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C220508l4 c220508l4;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC226378uX abstractC226378uX = this.LJLILLLLZI;
            if (abstractC226378uX instanceof C226348uU) {
                AddYoursEntranceButtonVM addYoursEntranceButtonVM = this.LJLJI;
                AddYoursRecommendation addYoursRecommendation = ((C226348uU) abstractC226378uX).LJ;
                this.LJLIL = 1;
                obj = addYoursEntranceButtonVM.kv0(addYoursRecommendation, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                obj = null;
                if (abstractC226378uX instanceof C226338uT) {
                    AddYoursEntranceButtonVM addYoursEntranceButtonVM2 = this.LJLJI;
                    AbstractC220518l5 abstractC220518l5 = ((C226338uT) abstractC226378uX).LJ;
                    this.LJLIL = 2;
                    addYoursEntranceButtonVM2.getClass();
                    if (abstractC220518l5 instanceof C220498l3) {
                        obj = ((C220498l3) abstractC220518l5).LJ;
                    } else if ((abstractC220518l5 instanceof C220508l4) && (obj = (c220508l4 = (C220508l4) abstractC220518l5).LJFF) == null) {
                        obj = C220488l2.LIZIZ.LIZ(c220508l4.LIZ, this);
                    }
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        this.LJLJJI.invoke(obj, Boolean.valueOf(this.LJLILLLLZI.LIZJ), Boolean.valueOf(this.LJLILLLLZI.LIZLLL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
