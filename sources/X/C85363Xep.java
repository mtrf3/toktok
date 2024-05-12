package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2", f = "PoiPublishExtensionAssemV2.kt", l = {696}, m = "tryCreateHeaderItem")
/* renamed from: X.Xep, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85363Xep extends C3CS {
    public PoiPublishExtensionAssemV2 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PoiPublishExtensionAssemV2 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85363Xep(PoiPublishExtensionAssemV2 poiPublishExtensionAssemV2, InterfaceC67352kd<? super C85363Xep> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = poiPublishExtensionAssemV2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.O3(this);
    }
}
