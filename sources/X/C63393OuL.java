package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.Response;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.receivenewmessage.NewMsgNotifyUseCase", f = "NewMsgNotifyUseCase.kt", l = {114, 138, 200, 206, 216}, m = "processResponseAndNotify")
/* renamed from: X.OuL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63393OuL extends C3CS {
    public C63385OuD LJLIL;
    public Response LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public C109544Rq LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C63385OuD LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63393OuL(C63385OuD c63385OuD, InterfaceC67352kd<? super C63393OuL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c63385OuD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZIZ(null, this);
    }
}
