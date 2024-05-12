package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.QueryMusicAwemeListQuery", f = "QueryMusicAwemeListQuery.kt", l = {21}, m = "operate")
/* renamed from: X.MeX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57317MeX extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57316MeW LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57317MeX(C57316MeW c57316MeW, InterfaceC67352kd<? super C57317MeX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57316MeW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
