package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.IMUserRepository", f = "IMUserRepository.kt", l = {119, 136}, m = "getUserList")
/* renamed from: X.3Ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80543Ec extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C80533Eb LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80543Ec(C80533Eb c80533Eb, InterfaceC67352kd<? super C80543Ec> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c80533Eb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJIILIIL(null, null, false, false, this);
    }
}
