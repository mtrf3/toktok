package X;

import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import fjb.a;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM$translateAddYoursTopic$1", f = "AddYoursCollectionListVM.kt", l = {98}, m = "invokeSuspend")
/* renamed from: X.8jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219348jC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C219368jE LJLILLLLZI;
    public final /* synthetic */ AddYoursCollectionListVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219348jC(C219368jE c219368jE, AddYoursCollectionListVM addYoursCollectionListVM, InterfaceC67352kd<? super C219348jC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c219368jE;
        this.LJLJI = addYoursCollectionListVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219348jC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C4 c3c4;
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
                C219368jE c219368jE = this.LJLILLLLZI;
                long j = c219368jE.LJLIL;
                String str = c219368jE.LJLJI;
                this.LJLIL = 1;
                obj = C219958kB.LIZ(j, str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C219948kA translationInfo = (C219948kA) obj;
            AddYoursCollectionListVM addYoursCollectionListVM = this.LJLJI;
            C219368jE item = this.LJLILLLLZI;
            addYoursCollectionListVM.getClass();
            o.LJIIIZ(item, "item");
            o.LJIIIZ(translationInfo, "translationInfo");
            addYoursCollectionListVM.withState(new C219358jD(addYoursCollectionListVM, item, true, translationInfo));
            C3C5.m7constructorimpl(translationInfo);
            c3c4 = translationInfo;
        } catch (Exception e) {
            C3C4 LIZ = C141335gf.LIZ(e);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        this.LJLJI.setState(new AqS169S0100000_3(c3c4, 702));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
