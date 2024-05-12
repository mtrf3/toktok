package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponseExtra;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.autocut.mob.AutoCutNetworkRequestMobListener$onRequestNLEModelFinish$1", f = "AutoCutNetworkRequestListener.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HmC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45052HmC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C45051HmB LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45052HmC(String str, C45051HmB c45051HmB, boolean z, int i, int i2, String str2, long j, String str3, String str4, String str5, String str6, InterfaceC67352kd<? super C45052HmC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = c45051HmB;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = str2;
        this.LJLJL = j;
        this.LJLJLJ = str3;
        this.LJLJLLL = str4;
        this.LJLL = str5;
        this.LJLLI = str6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45052HmC(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        NLEModelResponseExtra nLEModelResponseExtra;
        C141335gf.LIZJ(obj);
        String str = null;
        try {
            String str2 = this.LJLIL;
            if (str2 != null && (nLEModelResponseExtra = ((NLEModelResponse) new Gson().LJI(str2, NLEModelResponse.class)).extra) != null) {
                str = nLEModelResponseExtra.logId;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C45051HmB c45051HmB = this.LJLILLLLZI;
        C45049Hm9.LJIILL(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, c45051HmB.LIZ, c45051HmB.LIZIZ, str, null, null, this.LJLL, this.LJLLI);
        return C76800UCe.LIZ;
    }
}
