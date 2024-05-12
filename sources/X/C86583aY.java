package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.FamiliarsRelationsErrorReporter", f = "FamiliarsRelationsErrorReporter.kt", l = {21}, m = "clear")
/* renamed from: X.3aY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86583aY extends C3CS {
    public C86563aW LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C86563aW LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86583aY(C86563aW c86563aW, InterfaceC67352kd<? super C86583aY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c86563aW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
