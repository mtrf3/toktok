package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaDataFactory", f = "SkylightMediaDataFactory.kt", l = {51}, m = "triggerRefresh")
/* renamed from: X.MYn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56997MYn extends C3CS {
    public C56986MYc LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C56986MYc LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56997MYn(C56986MYc c56986MYc, InterfaceC67352kd<? super C56997MYn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c56986MYc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIZ(this);
    }
}
