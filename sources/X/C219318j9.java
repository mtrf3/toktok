package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import fjb.a;
import kotlin.jvm.internal.AqS169S0100000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM$unCollectAddYoursTopic$1", f = "AddYoursCollectionListVM.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.8j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219318j9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AddYoursCollectionListVM LJLILLLLZI;
    public final /* synthetic */ C219368jE LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219318j9(C219368jE c219368jE, AddYoursCollectionListVM addYoursCollectionListVM, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = addYoursCollectionListVM;
        this.LJLJI = c219368jE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219318j9(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC219328jA interfaceC219328jA = (InterfaceC219328jA) this.LJLILLLLZI.LJLIL.getValue().getOperator();
                long j = this.LJLJI.LJLIL;
                this.LJLIL = 1;
                if (interfaceC219328jA.LJIL(j, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = AddYoursTopic.copy$default(this.LJLJI.LJLILLLLZI, null, null, null, null, null, null, null, null, 0, null, 767, null);
            C3C5.m7constructorimpl(LIZ);
        } catch (Exception e) {
            LIZ = C141335gf.LIZ(e);
            C3C5.m7constructorimpl(LIZ);
        }
        this.LJLILLLLZI.setState(new AqS169S0100000_3(LIZ, 704));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
