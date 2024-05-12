package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.utils.TakoE2ELatencyHelper$onGetMessage$2$1", f = "TakoE2ELatencyHelper.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.2hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65592hn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65592hn(String str, String str2, int i, int i2, int i3, String str3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = i3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        return new C65592hn(this.LJLJJI, this.LJLJJL, i, i2, this.LJLJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
            C775132l c775132l = C775132l.LIZ;
            int i2 = this.LJLILLLLZI;
            int i3 = this.LJLJI;
            String str = this.LJLJJI;
            String str2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            if (this.LJLJL == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJLIL = 1;
            if (c775132l.LIZIZ(str, i2, i3, str2, z, str3, this) == enumC58928NAu) {
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
