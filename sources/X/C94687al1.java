package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.api.AddSongToMusicAppMutation", f = "AddSongToMusicAppMutation.kt", l = {19}, m = "operate")
/* renamed from: X.al1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94687al1 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C94475ahb LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94687al1(C94475ahb c94475ahb, InterfaceC67352kd<? super C94687al1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c94475ahb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
