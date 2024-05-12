package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$uploadAMEEffect$2$effectIdTask$1", f = "MobileEffectUtil.kt", l = {353}, m = "invokeSuspend")
/* renamed from: X.2w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74412w1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC84498XEg LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74412w1(InterfaceC84498XEg interfaceC84498XEg, InterfaceC67352kd<? super C74412w1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC84498XEg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74412w1(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC84498XEg interfaceC84498XEg = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = ET5.LIZ(interfaceC84498XEg, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
