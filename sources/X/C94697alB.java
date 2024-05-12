package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.SongCheckForDspQuery", f = "SongCheckForDspQuery.kt", l = {18}, m = "operate")
/* renamed from: X.alB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94697alB extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94495ahv LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94697alB(C94495ahv c94495ahv, InterfaceC67352kd<? super C94697alB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94495ahv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
