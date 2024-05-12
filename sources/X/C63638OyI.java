package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.ackmessage.MessageBatchAckUseCase", f = "MessageBatchAckUseCase.kt", l = {144}, m = "sendBatchAck")
/* renamed from: X.OyI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63638OyI extends C3CS {
    public C63630OyA LJLIL;
    public BatchAckMessageRequestBody LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C63630OyA LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63638OyI(C63630OyA c63630OyA, InterfaceC67352kd<? super C63638OyI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c63630OyA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJFF(0, null, this);
    }
}
