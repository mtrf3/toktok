package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.api.CollectMusicMutation", f = "CollectMusicMutation.kt", l = {17}, m = "operate")
/* renamed from: X.8SU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SU extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C8ST LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8SU(C8ST c8st, InterfaceC67352kd<? super C8SU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c8st;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
