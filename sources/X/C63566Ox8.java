package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {230}, m = "doNetworkRequest")
/* renamed from: X.Ox8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63566Ox8 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C63560Ox2 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63566Ox8(C63560Ox2 c63560Ox2, InterfaceC67352kd<? super C63566Ox8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c63560Ox2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, this);
    }
}
