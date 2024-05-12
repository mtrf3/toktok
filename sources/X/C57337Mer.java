package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.QueryMusicExtraQuery", f = "QueryMusicExtraQuery.kt", l = {19}, m = "operate")
/* renamed from: X.Mer, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57337Mer extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57336Meq LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57337Mer(C57336Meq c57336Meq, InterfaceC67352kd<? super C57337Mer> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57336Meq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
