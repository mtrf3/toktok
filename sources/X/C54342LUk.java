package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.deeplink.actions.base.BaseLinkAction", f = "BaseLinkAction.kt", l = {118}, m = "preRunBlock")
/* renamed from: X.LUk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54342LUk extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AbstractC54341LUj<T> LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54342LUk(AbstractC54341LUj<T> abstractC54341LUj, InterfaceC67352kd<? super C54342LUk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = abstractC54341LUj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.preRunBlock(this);
    }
}
