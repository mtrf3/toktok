package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.aweme.api.CollectAwemeMutation", f = "CollectAwemeMutation.kt", l = {18}, m = "operate")
/* renamed from: X.7zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203907zO extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C203897zN LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203907zO(C203897zN c203897zN, InterfaceC67352kd<? super C203907zO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c203897zN;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
