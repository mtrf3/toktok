package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel$markCollected$1$1", f = "AddYoursDetailViewModel.kt", l = {84}, m = "invokeSuspend")
/* renamed from: X.8jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219438jL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C219458jN LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ AddYoursDetailViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219438jL(C219458jN c219458jN, boolean z, AddYoursDetailViewModel addYoursDetailViewModel, InterfaceC67352kd<? super C219438jL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c219458jN;
        this.LJLJJI = z;
        this.LJLJJL = addYoursDetailViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219438jL(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        AddYoursTopic copy$default;
        int i;
        Long topicId;
        AddYoursTopic copy$default2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    i = this.LJLIL;
                    C141335gf.LIZJ(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj2);
                AddYoursTopic addYoursTopic = this.LJLJI.LJLIL;
                if (addYoursTopic != null) {
                    i = addYoursTopic.getCollectStatus();
                } else {
                    i = 0;
                }
                boolean z = this.LJLJJI;
                AddYoursTopic addYoursTopic2 = this.LJLJI.LJLIL;
                if (addYoursTopic2 != null && (copy$default2 = AddYoursTopic.copy$default(addYoursTopic2, null, null, null, null, null, null, null, null, z ? 1 : 0, null, 767, null)) != null) {
                    C2U8.LIZ(new C219248j2(copy$default2, EnumC219268j4.COLLECT));
                }
                C219458jN c219458jN = this.LJLJI;
                boolean z2 = this.LJLJJI;
                AddYoursTopic addYoursTopic3 = c219458jN.LJLIL;
                if (addYoursTopic3 != null && (topicId = addYoursTopic3.getTopicId()) != null) {
                    long longValue = topicId.longValue();
                    this.LJLIL = i;
                    this.LJLILLLLZI = 1;
                    obj2 = C219908k6.LIZ().markCollectedStatus(longValue, z2 ? 1 : 0, this);
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LIZ = (BaseResponse) obj2;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        AddYoursDetailViewModel addYoursDetailViewModel = this.LJLJJL;
        C219458jN c219458jN2 = this.LJLJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LJ(m10exceptionOrNullimpl);
            addYoursDetailViewModel.setState(C219448jM.LJLIL);
            AddYoursTopic addYoursTopic4 = c219458jN2.LJLIL;
            if (addYoursTopic4 != null && (copy$default = AddYoursTopic.copy$default(addYoursTopic4, null, null, null, null, null, null, null, null, i, null, 767, null)) != null) {
                C2U8.LIZ(new C219248j2(copy$default, EnumC219268j4.COLLECT));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
