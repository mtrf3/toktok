package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.bpea.basics.Cert;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.api.PoiSearchApi$Companion", f = "PoiSearchApi.kt", l = {376, 392, 436, 443}, m = "searchPoi")
/* renamed from: X.XdO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85274XdO extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Cert LJLJJL;
    public Cert LJLJJLL;
    public C72242sW LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public /* synthetic */ Object LJLLILLLL;
    public final /* synthetic */ C85269XdJ LJLLJ;
    public int LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85274XdO(C85269XdJ c85269XdJ, InterfaceC67352kd<? super C85274XdO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLJ = c85269XdJ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLILLLL = obj;
        this.LJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLJ.LJFF(null, null, null, null, null, this);
    }
}
