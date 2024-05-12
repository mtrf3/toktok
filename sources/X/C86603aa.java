package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.FamiliarsRelationsErrorReporter", f = "FamiliarsRelationsErrorReporter.kt", l = {46}, m = "getRowCount")
/* renamed from: X.3aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86603aa extends C3CS {
    public C86563aW LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C86563aW LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86603aa(C86563aW c86563aW, InterfaceC67352kd<? super C86603aa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c86563aW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(this);
    }
}
