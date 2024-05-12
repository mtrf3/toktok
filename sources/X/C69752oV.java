package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager", f = "AwemeFetchManager.kt", l = {229, 245}, m = "getAwemeCacheItem")
/* renamed from: X.2oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69752oV extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C69732oT LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69752oV(C69732oT c69732oT, InterfaceC67352kd<? super C69752oV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c69732oT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, null, this);
    }
}
