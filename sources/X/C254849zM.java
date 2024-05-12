package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver", f = "FBVNoticeObserver.kt", l = {68, 180}, m = "checkNotice")
/* renamed from: X.9zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254849zM extends C3CS {
    public FBVNoticeObserver LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FBVNoticeObserver LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254849zM(FBVNoticeObserver fBVNoticeObserver, InterfaceC67352kd<? super C254849zM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = fBVNoticeObserver;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
