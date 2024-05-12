package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager", f = "SharePanelContactsPreloadManager.kt", l = {256, 259, 266, 267, 273, 274}, m = "internalLoadSequentially")
/* renamed from: X.3MF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MF extends C3CS {
    public Object LJLIL;
    public C68322mC LJLILLLLZI;
    public C68322mC LJLJI;
    public boolean LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C82563Lw LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3MF(C82563Lw c82563Lw, InterfaceC67352kd<? super C3MF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c82563Lw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZLLL(false, this);
    }
}
