package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion", f = "SendMsgUseCase.kt", l = {75}, m = "send-BWLJW6A")
/* renamed from: X.Ov7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63441Ov7 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C63440Ov6 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63441Ov7(C63440Ov6 c63440Ov6, InterfaceC67352kd<? super C63441Ov7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c63440Ov6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZ = this.LJLILLLLZI.LIZ(null, null, null, this);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C3C5.m6boximpl(LIZ);
    }
}
