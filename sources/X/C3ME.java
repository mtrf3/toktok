package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager", f = "SharePanelContactsPreloadManager.kt", l = {283, 284, 291, 298, 299, 305, 306}, m = "internalLoadConcurrently")
/* renamed from: X.3ME, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ME extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public C68322mC LJLJI;
    public C68322mC LJLJJI;
    public boolean LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C82563Lw LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3ME(C82563Lw c82563Lw, InterfaceC67352kd<? super C3ME> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c82563Lw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZJ(false, this);
    }
}
