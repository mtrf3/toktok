package X;

import com.bytedance.bpea.cert.token.TokenCert;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchHelper$performVoiceSearch$job$1", f = "VoiceSearchHelper.kt", l = {50}, m = "invokeSuspend")
/* renamed from: X.an4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94814an4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C93906aYQ LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ HashMap<String, String> LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ K55 LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94814an4(boolean z, C93906aYQ c93906aYQ, ActivityC45651qj activityC45651qj, String str, HashMap<String, String> hashMap, int i, K55 k55, InterfaceC67352kd<? super C94814an4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = c93906aYQ;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = str;
        this.LJLJJLL = hashMap;
        this.LJLJL = i;
        this.LJLJLJ = k55;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94814an4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
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
            if (this.LJLILLLLZI) {
                this.LJLJI.getClass();
                j = 250;
            } else {
                j = 0;
            }
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ActivityC45651qj fragmentActivity = this.LJLJJI;
        C94139acB c94139acB = new C94139acB(this.LJLJJL, fragmentActivity, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJI);
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        C61099NyR.LIZIZ.LIZIZ(fragmentActivity, TokenCert.Companion.with("bpea-voice_search_button_request_permission")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new C94244ads(c94139acB));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
