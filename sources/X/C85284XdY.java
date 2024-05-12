package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionRepository$operator$1", f = "PoiPublishExtensionRepository.kt", l = {112}, m = "getRequestPopupEnable")
/* renamed from: X.XdY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85284XdY extends C3CS {
    public C85279XdT LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C85279XdT LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85284XdY(C85279XdT c85279XdT, InterfaceC67352kd<? super C85284XdY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c85279XdT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJJJJLL(this);
    }
}
