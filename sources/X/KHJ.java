package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommercePhotoSearchModel;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KHJ extends AbstractBinderC44127HTn {
    public final /* synthetic */ EComPhotoSearchServiceImpl LJLILLLLZI;

    @Override // X.AbstractBinderC44127HTn
    public final String LIZIZ() {
        return "ecommerce_photo_search";
    }

    public KHJ(EComPhotoSearchServiceImpl eComPhotoSearchServiceImpl) {
        this.LJLILLLLZI = eComPhotoSearchServiceImpl;
    }

    @Override // X.AbstractBinderC44127HTn
    public final void LIZ(Activity activity, Intent intent) {
        int i;
        int i2 = 1;
        C78857UxB.LJJJJIZL("enter_page", "take_photo", Long.valueOf(System.currentTimeMillis() - this.LJLILLLLZI.LIZLLL), 1, LiveTryModeCountDownThresholdSetting.DEFAULT);
        ReturnEcommercePhotoSearchModel returnEcommercePhotoSearchModel = (ReturnEcommercePhotoSearchModel) intent.getParcelableExtra("return_ecommerce_photo_search_model");
        JSONObject jSONObject = new JSONObject();
        EComPhotoSearchServiceImpl eComPhotoSearchServiceImpl = this.LJLILLLLZI;
        jSONObject.put("search_entrance", "mall");
        jSONObject.put("source_page_name", eComPhotoSearchServiceImpl.LIZIZ);
        jSONObject.put("search_type", eComPhotoSearchServiceImpl.LIZJ);
        if (returnEcommercePhotoSearchModel != null && returnEcommercePhotoSearchModel.albumAuthorized) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("album_authorized", i);
        if (returnEcommercePhotoSearchModel == null || !returnEcommercePhotoSearchModel.cameraAuthorized) {
            i2 = 0;
        }
        jSONObject.put("camera_authorized", i2);
        jSONObject.put("duration", System.currentTimeMillis() - eComPhotoSearchServiceImpl.LIZLLL);
        C48658J7u.LIZIZ("photo_search_page_view", jSONObject);
    }

    @Override // X.AbstractBinderC44127HTn
    public final void LIZLLL(Activity activity, Intent intent) {
        int i;
        PageType pageType;
        PageType pageType2;
        Object obj;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        String str;
        String str2;
        PageType pageType3;
        PageType pageType4;
        String str3;
        o.LJIIIZ(activity, "activity");
        ReturnEcommercePhotoSearchModel returnEcommercePhotoSearchModel = (ReturnEcommercePhotoSearchModel) intent.getParcelableExtra("return_ecommerce_photo_search_model");
        JSONObject jSONObject = new JSONObject();
        EComPhotoSearchServiceImpl eComPhotoSearchServiceImpl = this.LJLILLLLZI;
        jSONObject.put("search_entrance", "mall");
        jSONObject.put("source_page_name", eComPhotoSearchServiceImpl.LIZIZ);
        jSONObject.put("search_type", eComPhotoSearchServiceImpl.LIZJ);
        int i2 = 0;
        if (returnEcommercePhotoSearchModel != null && returnEcommercePhotoSearchModel.albumAuthorized) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("album_authorized", i);
        if (returnEcommercePhotoSearchModel != null && returnEcommercePhotoSearchModel.cameraAuthorized) {
            i2 = 1;
        }
        jSONObject.put("camera_authorized", i2);
        PageType pageType5 = null;
        if (returnEcommercePhotoSearchModel != null) {
            pageType = returnEcommercePhotoSearchModel.pageType;
        } else {
            pageType = null;
        }
        PageType pageType6 = PageType.TAKE_PHOTO;
        String str4 = "album";
        String str5 = "take_photo";
        if (pageType == pageType6) {
            obj = "take_photo";
        } else {
            if (returnEcommercePhotoSearchModel != null) {
                pageType2 = returnEcommercePhotoSearchModel.pageType;
            } else {
                pageType2 = null;
            }
            if (pageType2 == PageType.ALBUM) {
                obj = "album";
            } else {
                obj = "pdp_main_pic_similar";
            }
        }
        jSONObject.put("button_name", obj);
        C48658J7u.LIZIZ("photo_search_icon_click_return", jSONObject);
        KHQ khq = this.LJLILLLLZI.LIZ;
        if (khq != null && (photoSearchBusinessEnterParams = khq.LIZ()) != null) {
            if (returnEcommercePhotoSearchModel != null) {
                pageType3 = returnEcommercePhotoSearchModel.pageType;
            } else {
                pageType3 = null;
            }
            if (pageType3 == pageType6) {
                str4 = "take_photo";
            } else {
                if (returnEcommercePhotoSearchModel != null) {
                    pageType4 = returnEcommercePhotoSearchModel.pageType;
                } else {
                    pageType4 = null;
                }
                if (pageType4 != PageType.ALBUM) {
                    str4 = "pdp_main_pic_similar";
                }
            }
            photoSearchBusinessEnterParams.setEnterMethod(str4);
            photoSearchBusinessEnterParams.setLatestSearchId(SearchServiceImpl.LLLZI().LIZ());
            KG6 LLLLLIL = SearchServiceImpl.LLLZI().LLLLLIL();
            if (LLLLLIL != null) {
                str3 = LLLLLIL.LIZ();
            } else {
                str3 = null;
            }
            photoSearchBusinessEnterParams.setSearchContext(str3);
        } else {
            photoSearchBusinessEnterParams = null;
        }
        KHQ khq2 = this.LJLILLLLZI.LIZ;
        if (khq2 != null && (photoSearchLogEnterParams = khq2.LIZIZ()) != null) {
            if (returnEcommercePhotoSearchModel != null) {
                str2 = returnEcommercePhotoSearchModel.logExtra;
            } else {
                str2 = null;
            }
            photoSearchLogEnterParams.setPhotoSearchTypeDetail(str2);
        } else {
            photoSearchLogEnterParams = null;
        }
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = new PhotoSearchToolsEnterParams(null, null, null, 7, null);
        photoSearchToolsEnterParams.setSearchTime(Long.valueOf(System.currentTimeMillis()));
        if (returnEcommercePhotoSearchModel != null) {
            str = returnEcommercePhotoSearchModel.imagePath;
        } else {
            str = null;
        }
        photoSearchToolsEnterParams.setLocalFilePath(str);
        if (returnEcommercePhotoSearchModel != null) {
            pageType5 = returnEcommercePhotoSearchModel.pageType;
        }
        if (pageType5 != pageType6) {
            str5 = "choose_album";
        }
        photoSearchToolsEnterParams.setSearchSource(str5);
        this.LJLILLLLZI.LJ(activity, new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, null, 8, null));
    }
}
