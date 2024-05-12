package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.api.ServerABSettingsApi$Companion", f = "ServerABSettingsApi.kt", l = {34}, m = "getABTestResultForBroadcaster")
/* renamed from: X.Ru3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71019Ru3 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C71018Ru2 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71019Ru3(C71018Ru2 c71018Ru2, InterfaceC67352kd<? super C71019Ru3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c71018Ru2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
