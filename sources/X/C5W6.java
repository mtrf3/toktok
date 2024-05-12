package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMediaForVideo2Sticker$1", f = "CutOptimizedVideoChosenHandler.kt", l = {578, 583, 590}, m = "invokeSuspend")
/* renamed from: X.5W6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ MediaModel LJLJJL;
    public final /* synthetic */ C43544H7c LJLJJLL;
    public final /* synthetic */ Intent LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5W6(MediaModel mediaModel, C43544H7c c43544H7c, Intent intent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C5W6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = mediaModel;
        this.LJLJJLL = c43544H7c;
        this.LJLJL = intent;
        this.LJLJLJ = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C5W6 c5w6 = new C5W6(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c5w6.LJLJJI = obj;
        return c5w6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc A[DONT_GENERATE] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5W6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
