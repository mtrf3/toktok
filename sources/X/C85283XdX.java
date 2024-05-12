package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM", f = "PoiPublishExtensionVM.kt", l = {128}, m = "getRequestPopupEnable")
/* renamed from: X.XdX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85283XdX extends C3CS {
    public PoiPublishExtensionVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PoiPublishExtensionVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85283XdX(PoiPublishExtensionVM poiPublishExtensionVM, InterfaceC67352kd<? super C85283XdX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = poiPublishExtensionVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(this);
    }
}
