package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {147}, m = "create")
/* renamed from: X.Ox5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63563Ox5 extends C3CS {
    public C63560Ox2 LJLIL;
    public C63569OxB LJLILLLLZI;
    public C116934iP LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C63560Ox2 LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63563Ox5(C63560Ox2 c63560Ox2, InterfaceC67352kd<? super C63563Ox5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c63560Ox2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(0, 0, null, null, null, this);
    }
}
