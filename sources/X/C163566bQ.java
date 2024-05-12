package X;

import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$restoreCanvasResource$1", f = "QuickForwardResolver.kt", l = {288, 292}, m = "invokeSuspend")
/* renamed from: X.6bQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163566bQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C84661XKn LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ CanvasFilterParam LJLJJL;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, Boolean, String, C76800UCe> LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ CanvasVideoData LJLJLJ;
    public final /* synthetic */ ForwardVideo LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C163566bQ(String str, CanvasFilterParam canvasFilterParam, InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt, String str2, CanvasVideoData canvasVideoData, ForwardVideo forwardVideo, InterfaceC67352kd<? super C163566bQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = str;
        this.LJLJJL = canvasFilterParam;
        this.LJLJJLL = interfaceC88473Ynt;
        this.LJLJL = str2;
        this.LJLJLJ = canvasVideoData;
        this.LJLJLLL = forwardVideo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C163566bQ c163566bQ = new C163566bQ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c163566bQ.LJLJI = obj;
        return c163566bQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163566bQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
