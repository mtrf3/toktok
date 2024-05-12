package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getcheckinfo.GetConversationCheckInfoUseCase", f = "GetConversationCheckInfoUseCase.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "fetchConversationCompletenessInfo")
/* renamed from: X.Oyk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63666Oyk extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C63650OyU LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63666Oyk(C63650OyU c63650OyU, InterfaceC67352kd<? super C63666Oyk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c63650OyU;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(0, 0, this);
    }
}
