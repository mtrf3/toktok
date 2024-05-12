package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.GifShareAction$execute$videoStickerPanelShowed$1$1$1", f = "GifShareAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85103Vq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AwemeDetailList LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ DialogC25756A8y LJLJI;
    public final /* synthetic */ C62027OVz LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ C72242sW LJLJJLL;
    public final /* synthetic */ Context LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85103Vq(AwemeDetailList awemeDetailList, Activity activity, DialogC25756A8y dialogC25756A8y, C62027OVz c62027OVz, long j, C72242sW c72242sW, Context context, InterfaceC67352kd<? super C85103Vq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDetailList;
        this.LJLILLLLZI = activity;
        this.LJLJI = dialogC25756A8y;
        this.LJLJJI = c62027OVz;
        this.LJLJJL = j;
        this.LJLJJLL = c72242sW;
        this.LJLJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85103Vq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85103Vq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
