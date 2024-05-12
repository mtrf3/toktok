package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$updateDspPlatform$1$1", f = "AddToMusicDspAuthUtil.kt", l = {2983}, m = "invokeSuspend")
/* renamed from: X.ao0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94872ao0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ EnumC93896aYG LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C94872ao0(DspPlatform dspPlatform, EnumC93896aYG enumC93896aYG, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C94872ao0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = enumC93896aYG;
        this.LJLJJI = str;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94872ao0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            InterfaceC94324afA operator = C94302aeo.LJIIJ().getOperator();
            int value = this.LJLILLLLZI.getValue();
            int value2 = this.LJLJI.getValue();
            if (this.LJLJI == EnumC93896aYG.UNLINK && this.LJLILLLLZI == DspPlatform.SPOTIFY) {
                str = this.LJLJJI;
            } else {
                str = null;
            }
            InterfaceC65462ha<XGX<C94496ahw>> LJLIIL = operator.LJLIIL(value, value2, str);
            C94301aen c94301aen = new C94301aen(this.LJLJI, this.LJLILLLLZI, this.LJLJJL, this.LJLJJLL);
            this.LJLIL = 1;
            if (LJLIIL.collect(c94301aen, this) == enumC58928NAu) {
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
