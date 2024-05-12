package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.api.PoiSearchApi$Companion", f = "PoiSearchApi.kt", l = {668}, m = "requestPopupEnable")
/* renamed from: X.XdQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85276XdQ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C85269XdJ LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85276XdQ(C85269XdJ c85269XdJ, InterfaceC67352kd<? super C85276XdQ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c85269XdJ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJ(this);
    }
}
