package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$createDspPlaylist$3$1", f = "AddToMusicDspAuthUtil.kt", l = {2983}, m = "invokeSuspend")
/* renamed from: X.anp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94861anp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ DspPlatform LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final /* synthetic */ Activity LJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94861anp(int i, String str, String str2, String str3, long j, DspPlatform dspPlatform, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC67352kd<? super C94861anp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = j;
        this.LJLJL = dspPlatform;
        this.LJLJLJ = z;
        this.LJLJLLL = interfaceC65784Pro;
        this.LJLL = activity;
        this.LJLLI = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94861anp(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
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
            InterfaceC65462ha<XGX<C94476ahc>> LJJIFFI = C94302aeo.LJIIJ().getOperator().LJJIFFI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
            C94296aei c94296aei = new C94296aei(this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLJJL, this.LJLLI);
            this.LJLIL = 1;
            if (LJJIFFI.collect(c94296aei, this) == enumC58928NAu) {
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
