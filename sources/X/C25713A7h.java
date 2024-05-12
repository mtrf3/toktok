package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController", f = "LinkPrivacyNoticeController.kt", l = {109, 128}, m = "innerShow")
/* renamed from: X.A7h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25713A7h extends C3CS {
    public C25710A7e LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C25710A7e LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25713A7h(C25710A7e c25710A7e, InterfaceC67352kd<? super C25713A7h> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c25710A7e;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
