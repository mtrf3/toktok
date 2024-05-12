package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$Companion", f = "SendMsgUseCase.kt", l = {88, 91, 102}, m = "sendWithCallback")
/* renamed from: X.Ov8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63442Ov8 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C63440Ov6 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63442Ov8(C63440Ov6 c63440Ov6, InterfaceC67352kd<? super C63442Ov8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c63440Ov6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, null, null, this);
    }
}
