package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$addSongToMusicApp$3$2", f = "AddToMusicDspAuthUtil.kt", l = {2983}, m = "invokeSuspend")
/* renamed from: X.anm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94858anm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ DspAuthParam LJLJJLL;
    public final /* synthetic */ Fragment LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ DspAuthToken LJLL;
    public final /* synthetic */ boolean LJLLI;
    public final /* synthetic */ DspPlatform LJLLILLLL;
    public final /* synthetic */ long LJLLJ;
    public final /* synthetic */ String LJLLL;
    public final /* synthetic */ Activity LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94858anm(int i, long j, Activity activity, Fragment fragment, DspAuthParam dspAuthParam, DspAuthToken dspAuthToken, DspPlatform dspPlatform, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = z;
        this.LJLJJLL = dspAuthParam;
        this.LJLJL = fragment;
        this.LJLJLJ = z2;
        this.LJLJLLL = z3;
        this.LJLL = dspAuthToken;
        this.LJLLI = z4;
        this.LJLLILLLL = dspPlatform;
        this.LJLLJ = j;
        this.LJLLL = str3;
        this.LJLLLL = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        int i = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        boolean z = this.LJLJJL;
        DspAuthParam dspAuthParam = this.LJLJJLL;
        Fragment fragment = this.LJLJL;
        boolean z2 = this.LJLJLJ;
        boolean z3 = this.LJLJLLL;
        DspAuthToken dspAuthToken = this.LJLL;
        boolean z4 = this.LJLLI;
        DspPlatform dspPlatform = this.LJLLILLLL;
        return new C94858anm(i, this.LJLLJ, this.LJLLLL, fragment, dspAuthParam, dspAuthToken, dspPlatform, str, str2, this.LJLLL, interfaceC67352kd, z, z2, z3, z4);
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
            InterfaceC65462ha<XGX<C94474aha>> LJLLJ = C94302aeo.LJIIJ().getOperator().LJLLJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            C94295aeh c94295aeh = new C94295aeh(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJI, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLILLLLZI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL);
            this.LJLIL = 1;
            if (LJLLJ.collect(c94295aeh, this) == enumC58928NAu) {
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
