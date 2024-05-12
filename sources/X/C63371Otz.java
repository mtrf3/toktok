package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserUseCase", f = "GetMsgByUserUseCase.kt", l = {297}, m = "onPullMessagesEnd")
/* renamed from: X.Otz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63371Otz extends C3CS {
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public C63373Ou1 LJLJJI;
    public Object LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C63363Otr LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63371Otz(C63363Otr c63363Otr, InterfaceC67352kd<? super C63371Otz> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c63363Otr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZIZ(0, 0, false, null, null, this);
    }
}
