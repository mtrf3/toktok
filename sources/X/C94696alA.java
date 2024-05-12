package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.SelectDspPlaylistMutation", f = "SelectDspPlaylistMutation.kt", l = {19}, m = "operate")
/* renamed from: X.alA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94696alA extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94493aht LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94696alA(C94493aht c94493aht, InterfaceC67352kd<? super C94696alA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94493aht;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
