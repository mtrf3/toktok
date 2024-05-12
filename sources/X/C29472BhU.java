package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileRepository$AsyncRequestDeferred", f = "LiveProfileRepository.kt", l = {79, 81}, m = "await")
/* renamed from: X.BhU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29472BhU extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C29471BhT LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29472BhU(C29471BhT c29471BhT, InterfaceC67352kd<? super C29472BhU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c29471BhT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(this);
    }
}
