package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.cameraicon.mgr.AddCameraIconMgr$tryToShow$2$1", f = "AddCameraIconMgr.kt", l = {110}, m = "invokeSuspend")
/* renamed from: X.2ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66142ig extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, String, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66142ig(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr, Object obj, String str, InterfaceC67352kd<? super C66142ig> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = obj;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66142ig(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C75382xa c75382xa = C75382xa.LJLIL;
            InterfaceC88471Ynr<Boolean, String, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
            String obj2 = this.LJLJI.toString();
            String str = this.LJLJJI;
            this.LJLIL = 1;
            if (c75382xa.LJFF(interfaceC88471Ynr, obj2, str, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
