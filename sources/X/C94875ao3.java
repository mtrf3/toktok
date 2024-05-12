package X;

import Y.IDeS360S0100000_1;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$getDspPlaylists$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ao3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94875ao3 extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super InterfaceC65462ha<? extends XGX<C94482ahi>>>, Object> {
    public /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94875ao3(int i, String str, Long l, String str2, int i2, InterfaceC67352kd<? super C94875ao3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = l;
        this.LJLJJL = str2;
        this.LJLJJLL = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C94875ao3 c94875ao3 = new C94875ao3(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c94875ao3.LJLIL = ((Boolean) obj).booleanValue();
        return c94875ao3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL) {
            InterfaceC94324afA operator = C94302aeo.LJIIJ().getOperator();
            int i = this.LJLILLLLZI;
            String str = this.LJLJI;
            return V1M.LJIIZILJ(C78613UtF.LIZJ, operator.LJJIJIL(i, this.LJLJJI, this.LJLJJLL, str, this.LJLJJL));
        }
        return new IDeS360S0100000_1(null, 10);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Boolean bool, InterfaceC67352kd<? super InterfaceC65462ha<? extends XGX<C94482ahi>>> interfaceC67352kd) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
