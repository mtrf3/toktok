package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowMediaCacheManager", f = "NowMediaCacheManager.kt", l = {25, 26}, m = "addPhotoCache")
/* renamed from: X.W3s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81676W3s extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C81674W3q LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81676W3s(C81674W3q c81674W3q, InterfaceC67352kd<? super C81676W3s> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c81674W3q;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, null, this);
    }
}
