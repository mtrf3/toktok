package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase", f = "GetMsgByUserWithBufferUseCase.kt", l = {211}, m = "onPullMessagesEnd")
/* renamed from: X.Ou0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63372Ou0 extends C3CS {
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public C63373Ou1 LJLJJI;
    public Object LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C63364Ots LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63372Ou0(C63364Ots c63364Ots, InterfaceC67352kd<? super C63372Ou0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c63364Ots;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(0, 0, false, null, null, this);
    }
}
