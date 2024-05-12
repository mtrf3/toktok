package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem", f = "PoiPublishExtensionAssem.kt", l = {1187}, m = "tryCreateHeaderItem")
/* renamed from: X.Xeo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85362Xeo extends C3CS {
    public PoiPublishExtensionAssem LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PoiPublishExtensionAssem LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85362Xeo(PoiPublishExtensionAssem poiPublishExtensionAssem, InterfaceC67352kd<? super C85362Xeo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = poiPublishExtensionAssem;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.a4(this);
    }
}
