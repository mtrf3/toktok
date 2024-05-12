package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.StickerAction$execute$3$1", f = "StickerAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85093Vp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AwemeDetailList LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ C85143Vu LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ DialogC25756A8y LJLJJLL;
    public final /* synthetic */ Context LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85093Vp(AwemeDetailList awemeDetailList, C72242sW c72242sW, C85143Vu c85143Vu, Activity activity, long j, DialogC25756A8y dialogC25756A8y, Context context, InterfaceC67352kd<? super C85093Vp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDetailList;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = c85143Vu;
        this.LJLJJI = activity;
        this.LJLJJL = j;
        this.LJLJJLL = dialogC25756A8y;
        this.LJLJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85093Vp(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85093Vp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
