package X;

import Y.IDfS15S0300000_42;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$onActivityResultFromAmazonMusicAuth$6$1", f = "AddToMusicDspAuthUtil.kt", l = {2983}, m = "invokeSuspend")
/* renamed from: X.ao5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94877ao5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Fragment LJLJL;
    public final /* synthetic */ Activity LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94877ao5(String str, String str2, String str3, String str4, String str5, Fragment fragment, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C94877ao5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = fragment;
        this.LJLJLJ = activity;
        this.LJLJLLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94877ao5(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
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
            InterfaceC65462ha LJJJI = C94302aeo.LJIIJ().getOperator().LJJJI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            IDfS15S0300000_42 iDfS15S0300000_42 = new IDfS15S0300000_42(this.LJLJL, this.LJLJLJ, this.LJLJLLL, 3);
            this.LJLIL = 1;
            if (LJJJI.collect(iDfS15S0300000_42, this) == enumC58928NAu) {
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