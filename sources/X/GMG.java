package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$editQuickForwardPost$1", f = "QuickForwardResolver.kt", l = {213, 218, 219, 225}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GMG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public ProgressDialogC43239Gy3 LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ QuickForwardResult LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMG(QuickForwardResult quickForwardResult, Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, InterfaceC67352kd<? super GMG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = quickForwardResult;
        this.LJLJJL = context;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GMG gmg = new GMG(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        gmg.LJLJI = obj;
        return gmg;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
