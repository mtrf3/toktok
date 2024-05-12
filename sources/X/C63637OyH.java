package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.Response;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.ackmessage.MessageAckUseCase", f = "MessageAckUseCase.kt", l = {47, 61, 73}, m = "handleResponse")
/* renamed from: X.OyH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63637OyH extends C3CS {
    public C63631OyB LJLIL;
    public Response LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C63631OyB LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63637OyH(C63631OyB c63631OyB, InterfaceC67352kd<? super C63637OyH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c63631OyB;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, this);
    }
}
