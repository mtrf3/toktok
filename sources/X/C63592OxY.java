package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.im.core.proto.Request;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {180, 193}, m = "fetchByWs")
/* renamed from: X.OxY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63592OxY extends C3CS {
    public C63589OxV LJLIL;
    public InterfaceC43919HLn LJLILLLLZI;
    public C63588OxU LJLJI;
    public C63597Oxd LJLJJI;
    public Request LJLJJL;
    public int LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public /* synthetic */ Object LJLL;
    public final /* synthetic */ C63589OxV LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63592OxY(C63589OxV c63589OxV, InterfaceC67352kd<? super C63592OxY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLI = c63589OxV;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLL = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLI.LJFF(null, null, null, this);
    }
}
