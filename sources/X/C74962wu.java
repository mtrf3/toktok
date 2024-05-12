package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.EcAnchorApi$Companion", f = "EcAnchorApi.kt", l = {82, 84}, m = "refreshShortTouch")
/* renamed from: X.2wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74962wu extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C74952wt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74962wu(C74952wt c74952wt, InterfaceC67352kd<? super C74962wu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c74952wt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, null, 0L, this);
    }
}
