package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.service.AddYoursSendNotiInviteBehavior", f = "AddYoursInviteBehavior.kt", l = {118}, m = "onSelected")
/* renamed from: X.7qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198657qv extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C198647qu LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198657qv(C198647qu c198647qu, InterfaceC67352kd<? super C198657qv> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c198647qu;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onSelected(null, null, null, this);
    }
}
