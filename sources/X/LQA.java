package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LQA implements INearbyFeedService {
    public static final LQA LIZIZ = new LQA();
    public final /* synthetic */ INearbyFeedService LIZ = NearbyFeedServiceImpl.LJJI();

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final int LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LIZIZ(Context context, PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams, M26 m26) {
        this.LIZ.LIZIZ(context, poiDiscoveryLandingPageParams, m26);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LIZLLL(boolean z) {
        this.LIZ.LIZLLL(z);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJ(Fragment fragment) {
        return this.LIZ.LJ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJFF(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LJFF(activity);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJII(String str, HashMap<String, String> params, Aweme aweme, boolean z) {
        o.LJIIIZ(params, "params");
        this.LIZ.LJII(str, params, aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final View LJIIIIZZ(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIIIIZZ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final Object LJIIIZ(InterfaceC209388Jq params) {
        o.LJIIIZ(params, "params");
        return this.LIZ.LJIIIZ(params);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIIJ(Aweme aweme) {
        this.LIZ.LJIIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final InterfaceC54498LaA LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final Integer LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIILL() {
        this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final java.util.Map<String, String> LJIILLIIL(String str) {
        return this.LIZ.LJIILLIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final EE1 LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final InterfaceC54049LJd LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final void LJIJJ(java.util.Map<String, String> params) {
        o.LJIIIZ(params, "params");
        this.LIZ.LJIJJ(params);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final AbstractC53764L8e LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final HashMap<String, String> LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C54039LIt LJJ() {
        return this.LIZ.LJJ();
    }
}
