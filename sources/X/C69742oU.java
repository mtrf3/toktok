package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager", f = "AwemeFetchManager.kt", l = {106}, m = "getBatchAwemeCacheItem")
/* renamed from: X.2oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69742oU extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C69732oT LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69742oU(C69732oT c69732oT, InterfaceC67352kd<? super C69742oU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c69732oT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZLLL(null, 0, null, this);
    }
}
