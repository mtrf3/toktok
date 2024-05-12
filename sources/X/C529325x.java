package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.download.KaraokeDownloader", f = "KaraokeDownloader.kt", l = {177}, m = "onFinish")
/* renamed from: X.25x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C529325x extends C3CS {
    public C279917z LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C23080vQ LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529325x(C23080vQ c23080vQ, InterfaceC67352kd<? super C529325x> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c23080vQ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(this);
    }
}
