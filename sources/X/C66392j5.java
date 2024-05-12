package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$uploadAMEEffect$2$authKeyTask$1", f = "MobileEffectUtil.kt", l = {357}, m = "invokeSuspend")
/* renamed from: X.2j5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66392j5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super UploadAuthKeyConfig>, Object> {
    public int LJLIL;

    public C66392j5(InterfaceC67352kd<? super C66392j5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66392j5(interfaceC67352kd);
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
            this.LJLIL = 1;
            obj = C74186T9q.LJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super UploadAuthKeyConfig> interfaceC67352kd) {
        return new C66392j5(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
