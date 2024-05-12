package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.sending.PreRequestSendGiftProcessor", f = "PreRequestSendGiftProcessor.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "doProcess")
/* renamed from: X.Cut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32851Cut extends C3CS {
    public C32799Cu3 LJLIL;
    public C32816CuK LJLILLLLZI;
    public C32804Cu8 LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C32799Cu3 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32851Cut(C32799Cu3 c32799Cu3, InterfaceC67352kd<? super C32851Cut> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c32799Cu3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIIZ(null, this);
    }
}
