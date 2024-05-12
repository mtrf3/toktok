package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.service.IMUserService", f = "IMUserService.kt", l = {244}, m = "checkWelcomeMsgEnabled")
/* renamed from: X.3Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80803Fc extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C80813Fd LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80803Fc(C80813Fd c80813Fd, InterfaceC67352kd<? super C80803Fc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c80813Fd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, null, this);
    }
}
