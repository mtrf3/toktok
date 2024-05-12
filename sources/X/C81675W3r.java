package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowMediaCacheManager", f = "NowMediaCacheManager.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT, 44}, m = "addMixCache")
/* renamed from: X.W3r, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81675W3r extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C81674W3q LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81675W3r(C81674W3q c81674W3q, InterfaceC67352kd<? super C81675W3r> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c81674W3q;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, null, null, null, this);
    }
}
