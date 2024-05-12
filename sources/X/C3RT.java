package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.FamiliarsLoader", f = "FamiliarsLoader.kt", l = {38, 42}, m = "loadInternal")
/* renamed from: X.3RT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RT extends C3CS {
    public C3RS LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C3RS LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RT(C3RS c3rs, InterfaceC67352kd<? super C3RT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c3rs;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(this);
    }
}
