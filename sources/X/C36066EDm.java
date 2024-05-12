package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaApiData;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaApiFetcher", f = "RomaApiFetcher.kt", l = {59}, m = "fetchRemote")
/* renamed from: X.EDm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36066EDm extends C3CS {
    public Object LJLIL;
    public RomaApiData LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C36065EDl LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36066EDm(C36065EDl c36065EDl, InterfaceC67352kd<? super C36066EDm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c36065EDl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(this);
    }
}
