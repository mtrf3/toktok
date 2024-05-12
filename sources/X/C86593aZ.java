package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.FamiliarsRelationsErrorReporter", f = "FamiliarsRelationsErrorReporter.kt", l = {37}, m = "findAllUidWithSort")
/* renamed from: X.3aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86593aZ extends C3CS {
    public C86563aW LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C86563aW LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86593aZ(C86563aW c86563aW, InterfaceC67352kd<? super C86593aZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c86563aW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(this);
    }
}
