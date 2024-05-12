package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.AckMessageRequestBody;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.ackmessage.MessageAckUseCase", f = "MessageAckUseCase.kt", l = {153}, m = "sendAck")
/* renamed from: X.OyG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63636OyG extends C3CS {
    public C63631OyB LJLIL;
    public EnumC63625Oy5 LJLILLLLZI;
    public AckMessageRequestBody LJLJI;
    public long LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C63631OyB LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63636OyG(C63631OyB c63631OyB, InterfaceC67352kd<? super C63636OyG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c63631OyB;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZLLL(0, 0L, null, null, null, null, null, this);
    }
}
