package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.QueryPartnerMusicQuery", f = "QueryPartnerMusicQuery.kt", l = {15}, m = "operate")
/* renamed from: X.MeV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57315MeV extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57314MeU LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57315MeV(C57314MeU c57314MeU, InterfaceC67352kd<? super C57315MeV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57314MeU;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
