package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightDataFactory", f = "SkylightDataFactory.kt", l = {60}, m = "triggerRefresh")
/* renamed from: X.MYm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56996MYm extends C3CS {
    public C56987MYd LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C56987MYd LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56996MYm(C56987MYd c56987MYd, InterfaceC67352kd<? super C56996MYm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c56987MYd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIZ(this);
    }
}
