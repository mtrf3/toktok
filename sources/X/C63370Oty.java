package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserUseCase", f = "GetMsgByUserUseCase.kt", l = {93, 116, 133, 163, 203, 211, 223}, m = "pull")
/* renamed from: X.Oty, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63370Oty extends C3CS {
    public C63363Otr LJLIL;
    public Object LJLILLLLZI;
    public C63373Ou1 LJLJI;
    public MessagesPerUserResponseBody LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public /* synthetic */ Object LJLL;
    public final /* synthetic */ C63363Otr LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63370Oty(C63363Otr c63363Otr, InterfaceC67352kd<? super C63370Oty> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLI = c63363Otr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLL = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLI.LIZJ(0, 0, 0L, false, null, this);
    }
}
