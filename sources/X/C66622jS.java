package X;

import com.bytedance.android.livesdk.hints.LiveGiftApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.livegoal.GiftLiveGoalCapsuleHandler$enableCapsuleGuide$1", f = "GiftLiveGoalCapsuleHandler.kt", l = {107}, m = "invokeSuspend")
/* renamed from: X.2jS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66622jS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29850Bna LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66622jS(C29850Bna c29850Bna, boolean z, InterfaceC67352kd<? super C66622jS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29850Bna;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66622jS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
                C29850Bna c29850Bna = this.LJLILLLLZI;
                boolean z2 = this.LJLJI;
                LiveGiftApi liveGiftApi = (LiveGiftApi) c29850Bna.LIZ.getValue();
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLIL = 1;
                obj = liveGiftApi.enableLiveGoalCapsule(z, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C3C5.m7constructorimpl((C28467BFf) obj);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
