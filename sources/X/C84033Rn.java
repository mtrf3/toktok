package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.service.IMFamiliarService", f = "IMFamiliarService.kt", l = {38}, m = "getFamiliarReType")
/* renamed from: X.3Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84033Rn extends C3CS {
    public C84023Rm LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public IMUser LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C84023Rm LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84033Rn(C84023Rm c84023Rm, InterfaceC67352kd<? super C84033Rn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c84023Rm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, null, null, this);
    }
}
