package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$songCheckForDsp$1$1", f = "AddToMusicDspAuthUtil.kt", l = {2983}, m = "invokeSuspend")
/* renamed from: X.aoB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94883aoB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94883aoB(DspPlatform dspPlatform, String str, String str2, String str3, boolean z, InterfaceC67352kd<? super C94883aoB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94883aoB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            InterfaceC65462ha<XGX<C94494ahu>> LJJJLIIL = C94302aeo.LJIIJ().getOperator().LJJJLIIL(this.LJLILLLLZI.getValue(), this.LJLJI, this.LJLJJI, this.LJLJJL);
            C94303aep c94303aep = new C94303aep(this.LJLJI, this.LJLILLLLZI, this.LJLJJLL);
            this.LJLIL = 1;
            if (LJJJLIIL.collect(c94303aep, this) == enumC58928NAu) {
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
