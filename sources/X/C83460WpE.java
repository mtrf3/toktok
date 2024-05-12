package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicChangeOneAction$microActionChain$2$1", f = "MusicChangeOneAction.kt", l = {74}, m = "execute-238auH8")
/* renamed from: X.WpE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83460WpE extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83448Wp2 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83460WpE(C83448Wp2 c83448Wp2, InterfaceC67352kd<? super C83460WpE> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83448Wp2;
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
