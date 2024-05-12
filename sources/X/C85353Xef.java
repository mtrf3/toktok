package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Xef, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85353Xef extends AbstractC85354Xeg {
    public boolean LJLJL;

    @Override // X.AbstractC85354Xeg
    public final String LIZIZ() {
        return "edit_post";
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.AbstractC85354Xeg
    public final void LIZ() {
        Integer num;
        String str;
        String str2;
        Integer num2;
        boolean z;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//poi/search");
        String creationId = this.LJLJI.LJLILLLLZI.getMobParam().getCreationId();
        String contentType = this.LJLJI.LJLIL.getContentType();
        String shootWay = this.LJLJI.LJLILLLLZI.getMobParam().getShootWay();
        EditPostMobParam editPostMobParam = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        Integer num3 = null;
        if (editPostMobParam != null) {
            num = editPostMobParam.getAwemeType();
        } else {
            num = null;
        }
        buildRoute.withParam("poi_mob_param", new PoiMobParam(creationId, contentType, shootWay, "click_add_location", "edit_post", num, null, 64, null));
        buildRoute.withParam("page_scene", EnumC85244Xcu.POI_EDIT_POST);
        EditPostMobParam editPostMobParam2 = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        if (editPostMobParam2 != null) {
            str = editPostMobParam2.getAwemeId();
        } else {
            str = null;
        }
        buildRoute.withParam("aid", str);
        buildRoute.open(10001);
        PoiSearchApi.PoiSearchResultWrapper LIZ = LIZLLL().getState().LJLIL.LIZ();
        if (LIZ != null && (poiSearchResult = LIZ.poiSearchResult) != null) {
            str2 = poiSearchResult.getLogId();
        } else {
            str2 = null;
        }
        String LIZJ = LIZJ();
        EditPostMobParam editPostMobParam3 = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        if (editPostMobParam3 != null) {
            num2 = editPostMobParam3.getAwemeType();
        } else {
            num2 = null;
        }
        C225248si.LJIILIIL(num2, "edit_post", LIZJ, str2);
        C225248si.LJ();
        if (LIZLLL().getState().LJLILLLLZI != null) {
            z = true;
        } else {
            z = false;
        }
        EditPostMobParam editPostMobParam4 = this.LJLJI.LJLILLLLZI.getEditPostMobParam();
        if (editPostMobParam4 != null) {
            num3 = editPostMobParam4.getAwemeType();
        }
        C225248si.LJIIJ(false, z, num3);
    }

    @Override // X.AbstractC85354Xeg
    public final void LJFF() {
        AbstractC85354Xeg.LJIIJJI(this, EnumC85364Xeq.STATUS_POI_ERROR);
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJI() {
        if (this.LJLJI.LJLILLLLZI.getPoiData() != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC85354Xeg
    public final void LJII() {
        String str;
        PoiData poiData = this.LJLJI.LJLILLLLZI.getPoiData();
        if (poiData != null) {
            this.LJLJL = true;
            LIZLLL().jv0(poiData);
            PoiPublishExtensionVMV2 LIZLLL = LIZLLL();
            PoiMobParam mobParam = poiData.getMobParam();
            if (mobParam != null) {
                str = mobParam.getEnterMethod();
            } else {
                str = null;
            }
            LIZLLL.LJLIL = str;
            LIZLLL().LJLILLLLZI = poiData.getLogId();
        }
        LJIIIIZZ(this.LJLJL ? 1 : 0);
        if (!this.LJLJL) {
            LJFF();
        }
    }

    @Override // X.AbstractC85354Xeg
    public final String LIZJ() {
        if (LIZLLL().getState().LJLILLLLZI != null) {
            return "click_poi";
        }
        return "click_add_location";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85353Xef(Context sceneContext, LifecycleOwner lifecycleOwner, C85359Xel extensionMiscData) {
        super(sceneContext, lifecycleOwner, extensionMiscData);
        o.LJIIIZ(sceneContext, "sceneContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(extensionMiscData, "extensionMiscData");
    }
}
