package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.List;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xeh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85355Xeh extends AbstractC85354Xeg {
    public boolean LJLJL;
    public boolean LJLJLJ;

    @Override // X.AbstractC85354Xeg
    public final String LIZIZ() {
        return "video_post_page";
    }

    @Override // X.AbstractC85354Xeg
    public final void LJII() {
        String str;
        PoiData poiData;
        InterfaceC40948G5g publishExtensionDataContainer = this.LJLJI.LJLILLLLZI.getPublishExtensionDataContainer();
        String str2 = null;
        if (publishExtensionDataContainer != null) {
            str = ((VideoPublishContainerScene) publishExtensionDataContainer).LLLLJ();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        if (fromString != null && (poiData = fromString.poiData) != null) {
            this.LJLJL = true;
            LIZLLL().jv0(poiData);
            PoiPublishExtensionVMV2 LIZLLL = LIZLLL();
            PoiMobParam mobParam = poiData.getMobParam();
            if (mobParam != null) {
                str2 = mobParam.getEnterMethod();
            }
            LIZLLL.LJLIL = str2;
            LIZLLL().LJLILLLLZI = poiData.getLogId();
        }
        PoiPublishExtensionVMV2 LIZLLL2 = LIZLLL();
        C85393XfJ c85393XfJ = new TBT() { // from class: X.XfJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85333XeL) obj).LJLJI;
            }
        };
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZ = true;
        C8YN.LJII(this, LIZLLL2, c85393XfJ, c56412MCa, new AqS197S0100000_15(this, 53), 4);
        if (!this.LJLJL) {
            LIZLLL().gv0(this.LJLILLLLZI);
        }
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC85354Xeg
    public final void LJFF() {
        boolean z;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        List<PoiData> poiList;
        if (this.LJLJL) {
            AbstractC85354Xeg.LJIIJJI(this, EnumC85364Xeq.STATUS_POI_IDLE);
            LIZLLL().gv0(this.LJLILLLLZI);
            this.LJLJL = false;
            return;
        }
        PoiSearchApi.PoiSearchResultWrapper LIZ = LIZLLL().getState().LJLIL.LIZ();
        if (LIZ == null || (poiSearchResult = LIZ.poiSearchResult) == null || (poiList = poiSearchResult.getPoiList()) == null || poiList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        PoiPublishExtensionVMV2 LIZLLL = LIZLLL();
        EnumC85338XeQ enumC85338XeQ = LIZLLL.getState().LJLJJI;
        if ((enumC85338XeQ != null && enumC85338XeQ != LIZLLL.LJLJLLL.LIZ()) || z) {
            LIZLLL().gv0(this.LJLILLLLZI);
        } else {
            AbstractC85354Xeg.LJIIJJI(this, EnumC85364Xeq.STATUS_POI_LIST_SHOW);
        }
    }

    @Override // X.AbstractC85354Xeg
    public final boolean LJI() {
        String str;
        InterfaceC40948G5g publishExtensionDataContainer = this.LJLJI.LJLILLLLZI.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = ((VideoPublishContainerScene) publishExtensionDataContainer).LLLLJ();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        if (fromString == null || fromString.poiData == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC85354Xeg
    public final String LIZJ() {
        if (LIZLLL().getState().LJLILLLLZI != null) {
            return "click_poi";
        }
        return "click_add_location";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85355Xeh(Context sceneContext, LifecycleOwner lifecycleOwner, C85359Xel extensionMiscData) {
        super(sceneContext, lifecycleOwner, extensionMiscData);
        o.LJIIIZ(sceneContext, "sceneContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(extensionMiscData, "extensionMiscData");
    }
}
