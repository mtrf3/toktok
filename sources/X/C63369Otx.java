package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase", f = "GetMsgByUserWithBufferUseCase.kt", l = {73, 97, 119, 142, 155}, m = "pull")
/* renamed from: X.Otx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63369Otx extends C3CS {
    public C63364Ots LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C63373Ou1 LJLJJI;
    public MessagesPerUserResponseBody LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public long LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ C63364Ots LJLL;
    public int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63369Otx(C63364Ots c63364Ots, InterfaceC67352kd<? super C63369Otx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLL = c63364Ots;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLLL = obj;
        this.LJLLI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLL.LIZIZ(0, 0, null, 0L, false, null, this);
    }
}
