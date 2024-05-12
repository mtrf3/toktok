package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardResult;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1", f = "QuickForwardResolver.kt", l = {116, 161, 162, 191, 196}, m = "invokeSuspend")
/* renamed from: X.GXi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41678GXi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public ProgressDialogC43239Gy3 LJLIL;
    public InterfaceC68342mE LJLILLLLZI;
    public InterfaceC68342mE LJLJI;
    public InterfaceC68342mE LJLJJI;
    public Object LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ QuickForwardConfig LJLJLLL;
    public final /* synthetic */ ForwardMedia LJLL;
    public final /* synthetic */ CreativeInfo LJLLI;
    public final /* synthetic */ QuickForwardResult LJLLILLLL;
    public final /* synthetic */ InterfaceC88472Yns<ForwardResult, C76800UCe> LJLLJ;
    public final /* synthetic */ Context LJLLL;
    public final /* synthetic */ String LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41678GXi(QuickForwardConfig quickForwardConfig, ForwardMedia forwardMedia, CreativeInfo creativeInfo, QuickForwardResult quickForwardResult, InterfaceC88472Yns<? super ForwardResult, C76800UCe> interfaceC88472Yns, Context context, String str, InterfaceC67352kd<? super C41678GXi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLLL = quickForwardConfig;
        this.LJLL = forwardMedia;
        this.LJLLI = creativeInfo;
        this.LJLLILLLL = quickForwardResult;
        this.LJLLJ = interfaceC88472Yns;
        this.LJLLL = context;
        this.LJLLLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41678GXi c41678GXi = new C41678GXi(this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, interfaceC67352kd);
        c41678GXi.LJLJLJ = obj;
        return c41678GXi;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41678GXi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
