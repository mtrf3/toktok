package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterDataSource", f = "ComposerFilterDataSource.kt", l = {74}, m = "fetchLocalDataNew")
/* renamed from: X.22O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22O extends C3CS {
    public C1VF LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1VF LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22O(C1VF c1vf, InterfaceC67352kd<? super C22O> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1vf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
