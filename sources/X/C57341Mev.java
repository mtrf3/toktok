package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.QueryMusicExtraWithHighPriorityQuery", f = "QueryMusicExtraWithHighPriorityQuery.kt", l = {19}, m = "operate")
/* renamed from: X.Mev, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57341Mev extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57340Meu LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57341Mev(C57340Meu c57340Meu, InterfaceC67352kd<? super C57341Mev> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57340Meu;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
