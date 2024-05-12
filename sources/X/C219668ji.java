package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel$getAddYoursStickerFromTopic$1", f = "AddYoursHubListViewModel.kt", l = {174}, m = "invokeSuspend")
/* renamed from: X.8ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219668ji extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC220518l5 LJLILLLLZI;
    public final /* synthetic */ AddYoursTopic LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<AddYoursStickerStruct, Boolean, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C219668ji(AbstractC220518l5 abstractC220518l5, AddYoursTopic addYoursTopic, InterfaceC88471Ynr<? super AddYoursStickerStruct, ? super Boolean, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C219668ji> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC220518l5;
        this.LJLJI = addYoursTopic;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219668ji(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC220518l5 abstractC220518l5 = this.LJLILLLLZI;
            if (abstractC220518l5 instanceof C220498l3) {
                obj = ((C220498l3) abstractC220518l5).LJ;
            } else {
                Long topicId = this.LJLJI.getTopicId();
                obj = null;
                if (topicId != null) {
                    long longValue = topicId.longValue();
                    XIA xia = C78613UtF.LIZJ;
                    C219678jj c219678jj = new C219678jj(longValue, null);
                    this.LJLIL = 1;
                    obj = XKX.LJI(xia, c219678jj, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        InterfaceC88471Ynr<AddYoursStickerStruct, Boolean, C76800UCe> interfaceC88471Ynr = this.LJLJJI;
        AbstractC220518l5 abstractC220518l52 = this.LJLILLLLZI;
        if (abstractC220518l52 == null || abstractC220518l52.LIZIZ != 1) {
            z = false;
        }
        interfaceC88471Ynr.invoke(obj, Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
