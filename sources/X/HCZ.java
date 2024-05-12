package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.AnchorInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighLightExtra;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCZ implements InterfaceC44004HOu {
    public final /* synthetic */ HighlightsListViewModel LIZ;
    public final /* synthetic */ HighlightCellItem LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;

    @Override // X.InterfaceC44004HOu
    public final void onFailed() {
        long j;
        String str;
        Long length;
        this.LIZ.setState(C242679fj.LJLIL);
        HighlightsListViewModel highlightsListViewModel = this.LIZ;
        String str2 = highlightsListViewModel.LJLILLLLZI;
        String str3 = highlightsListViewModel.LJLJI;
        boolean z = highlightsListViewModel.LJLJLJ;
        HighlightVideoInfo videoInfo = this.LIZIZ.getVideoInfo();
        if (videoInfo != null && (length = videoInfo.getLength()) != null) {
            j = length.longValue();
        } else {
            j = 0;
        }
        HighlightVideoInfo videoInfo2 = this.LIZIZ.getVideoInfo();
        if (videoInfo2 == null || (str = videoInfo2.getFragmentId()) == null) {
            str = "";
        }
        C44008HOy.LIZLLL(j, System.currentTimeMillis() - this.LIZ.LJLL, str2, str3, str, "others", this.LIZIZ.getDaInfo(), z);
    }

    @Override // X.InterfaceC44004HOu
    public final void LIZ(Integer num) {
        HighlightsListViewModel highlightsListViewModel = this.LIZ;
        highlightsListViewModel.LJLJJL = num;
        highlightsListViewModel.setState(HP4.LJLIL);
    }

    @Override // X.InterfaceC44004HOu
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        this.LIZ.setState(new AqS173S0100000_7(entity, 381));
    }

    @Override // X.InterfaceC44004HOu
    public final void LJFF(String str, String fileName) {
        long j;
        String str2;
        AnchorInfo anchorInfo;
        int i;
        String suggestVideoToast;
        String suggestVideoTitle;
        String fragmentId;
        Long length;
        o.LJIIIZ(fileName, "fileName");
        this.LIZ.setState(HP5.LJLIL);
        HighlightsListViewModel highlightsListViewModel = this.LIZ;
        String str3 = highlightsListViewModel.LJLILLLLZI;
        String str4 = highlightsListViewModel.LJLJI;
        boolean z = highlightsListViewModel.LJLJLJ;
        HighlightVideoInfo videoInfo = this.LIZIZ.getVideoInfo();
        if (videoInfo != null && (length = videoInfo.getLength()) != null) {
            j = length.longValue();
        } else {
            j = 0;
        }
        HighlightVideoInfo videoInfo2 = this.LIZIZ.getVideoInfo();
        String str5 = "";
        if (videoInfo2 == null || (str2 = videoInfo2.getFragmentId()) == null) {
            str2 = "";
        }
        C44008HOy.LIZLLL(j, System.currentTimeMillis() - this.LIZ.LJLL, str3, str4, str2, "finish_loading", this.LIZIZ.getDaInfo(), z);
        HighlightsListViewModel highlightsListViewModel2 = this.LIZ;
        ActivityC45651qj activityC45651qj = this.LIZJ;
        String str6 = highlightsListViewModel2.LJLILLLLZI;
        HighlightCellItem highlightCellItem = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HighlightVideoInfo videoInfo3 = highlightCellItem.getVideoInfo();
        if (videoInfo3 != null && (fragmentId = videoInfo3.getFragmentId()) != null) {
            linkedHashMap.put("video_fragment_id", fragmentId);
        }
        linkedHashMap.put("room_id", str6);
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("is_ecom", bool);
        HighLightExtra highLightExtra = highlightCellItem.getHighLightExtra();
        if (highLightExtra != null && (suggestVideoTitle = highLightExtra.getSuggestVideoTitle()) != null) {
            linkedHashMap.put("suggest_video_title", suggestVideoTitle);
        }
        HighLightExtra highLightExtra2 = highlightCellItem.getHighLightExtra();
        if (highLightExtra2 != null && (suggestVideoToast = highLightExtra2.getSuggestVideoToast()) != null) {
            linkedHashMap.put("suggest_video_toast", suggestVideoToast);
        }
        linkedHashMap.put("landing_to_record", bool);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("high_light_video_parameters_model", linkedHashMap);
        ArrayList arrayList = new ArrayList();
        HighLightExtra highLightExtra3 = highlightCellItem.getHighLightExtra();
        if (highLightExtra3 != null && (anchorInfo = highLightExtra3.getAnchorInfo()) != null) {
            Integer type = anchorInfo.getType();
            if (type != null) {
                i = type.intValue();
            } else {
                i = 0;
            }
            String keyword = anchorInfo.getKeyword();
            if (keyword == null) {
                keyword = "";
            }
            String url = anchorInfo.getUrl();
            if (url == null) {
                url = "";
            }
            String language = anchorInfo.getLanguage();
            if (language == null) {
                language = "";
            }
            String content = anchorInfo.getContent();
            if (content != null) {
                str5 = content;
            }
            arrayList.add(new CreateAnchorInfo(i, keyword, url, language, str5, anchorInfo.getIconUrl(), null, anchorInfo.getExtra(), "", "", anchorInfo.getSubtype(), anchorInfo.getCanDelete(), false, 4160, null));
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//openVideoEdit");
        buildRoute.withParam("media_path", str);
        buildRoute.withParam("shoot_way", "livesdk_tiktokec_shop_highlight");
        buildRoute.withParam("anchors", C27739Aud.LJI(arrayList));
        buildRoute.withParam("creative_initial_model", C27739Aud.LJI(linkedHashMap2));
        buildRoute.open();
    }

    public HCZ(HighlightsListViewModel highlightsListViewModel, HighlightCellItem highlightCellItem, ActivityC45651qj activityC45651qj) {
        this.LIZ = highlightsListViewModel;
        this.LIZIZ = highlightCellItem;
        this.LIZJ = activityC45651qj;
    }
}
