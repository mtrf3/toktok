package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.poi.search.PoiSearchAssem;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XcW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85220XcW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ PoiSearchAssem LJLIL;
    public final /* synthetic */ ILocationBaseServiceForMT LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85220XcW(PoiSearchAssem poiSearchAssem, ILocationBaseServiceForMT iLocationBaseServiceForMT, boolean z) {
        super(0);
        this.LJLIL = poiSearchAssem;
        this.LJLILLLLZI = iLocationBaseServiceForMT;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        this.LJLIL.LJLLL = false;
        boolean inAppPreciseUnknown = this.LJLILLLLZI.inAppPreciseUnknown();
        boolean isInAppPrecise = this.LJLILLLLZI.isInAppPrecise();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = this.LJLILLLLZI;
        View view = this.LJLIL.LJLIL;
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "content.context");
            boolean isSystemPrecise = iLocationBaseServiceForMT.isSystemPrecise(context);
            if (inAppPreciseUnknown || !isInAppPrecise || !isSystemPrecise) {
                z = true;
            } else {
                z = false;
            }
            this.LJLIL.O3();
            if (this.LJLJI && z) {
                PoiSearchAssem poiSearchAssem = this.LJLIL;
                poiSearchAssem.LJLLL = true;
                ILocationBaseServiceForMT iLocationBaseServiceForMT2 = this.LJLILLLLZI;
                View view2 = poiSearchAssem.LJLIL;
                if (view2 != null) {
                    Context context2 = view2.getContext();
                    o.LJIIIIZZ(context2, "content.context");
                    poiSearchAssem.LJLJLLL = iLocationBaseServiceForMT2.getGpsBannerHeaderConvertedView(context2, this.LJLIL.v3(), new AqS165S0100000_15(this.LJLIL, 551));
                    this.LJLIL.v3().LJLLI();
                    PoiSearchAssem poiSearchAssem2 = this.LJLIL;
                    View view3 = poiSearchAssem2.LJLJLLL;
                    if (view3 != null) {
                        poiSearchAssem2.v3().LJLJL(0, view3);
                    }
                } else {
                    o.LJIJI("content");
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("content");
        throw null;
    }
}
