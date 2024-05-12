package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule", f = "AICaptionNetworkModule.kt", l = {46}, m = "submitImage")
/* renamed from: X.EaZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36687EaZ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AICaptionNetworkModule LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36687EaZ(AICaptionNetworkModule aICaptionNetworkModule, InterfaceC67352kd<? super C36687EaZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = aICaptionNetworkModule;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
