package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.api.UnCollectMovieMutation", f = "UnCollectMovieMutation.kt", l = {15}, m = "operate")
/* renamed from: X.7ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199267ru extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199217rp LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199267ru(C199217rp c199217rp, InterfaceC67352kd<? super C199267ru> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199217rp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
