package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.paidcontent.assem.SeriesPostUIAssem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS135S0200000_4;
import ujb.o;

/* loaded from: classes5.dex */
public final class A2J implements View.OnClickListener {
    public final /* synthetic */ SeriesPostUIAssem LJLIL;

    public A2J(SeriesPostUIAssem seriesPostUIAssem) {
        this.LJLIL = seriesPostUIAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        CreativeModel creativeModel;
        PaidContentVideoModel paidContentVideoModel;
        CreativeModel creativeModel2;
        PaidContentVideoModel paidContentVideoModel2;
        String str2 = this.LJLIL.x3().LJLJL;
        String str3 = this.LJLIL.x3().LJLJJLL;
        SeriesItem LIZ = ((A1P) this.LJLIL.A3().getState()).LJLILLLLZI.LIZ();
        if (LIZ == null || (str = LIZ.collectionId) == null) {
            str = "";
        }
        A2D.LIZJ("click_series_video_upload_next", str2, str3, str);
        SeriesPostUIAssem seriesPostUIAssem = this.LJLIL;
        SeriesItem LIZ2 = ((A1P) seriesPostUIAssem.A3().getState()).LJLILLLLZI.LIZ();
        T5T t5t = seriesPostUIAssem.LJLIL;
        Editable editable = null;
        if (t5t != null) {
            editable = t5t.getText();
        }
        String LJJJJZ = o.LJJJJZ(String.valueOf(editable), "\n", "", false);
        if (LIZ2 != null && C78685UuP.LJJJZ(LIZ2.collectionId)) {
            if (((A1P) seriesPostUIAssem.A3().getState()).LJLJLJ) {
                VideoPublishEditModel videoPublishEditModel = seriesPostUIAssem.x3().LJLIL;
                if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (paidContentVideoModel2 = creativeModel2.paidContentModel) != null) {
                    paidContentVideoModel2.setCollectionId(LIZ2.collectionId);
                }
                VideoPublishEditModel videoPublishEditModel2 = seriesPostUIAssem.x3().LJLIL;
                if (videoPublishEditModel2 != null) {
                    PostLandingModel postLandingModel = videoPublishEditModel2.creativeModel.postLandingModel;
                    postLandingModel.landingBack = true;
                    postLandingModel.backUrl = "aweme://paidcontent/seriesdraft";
                    Bundle bundle = new Bundle();
                    bundle.putString("collection_id", LIZ2.collectionId);
                    bundle.putString("enter_from", "series_post_page");
                    bundle.putString("entry_point", seriesPostUIAssem.x3().LJLJJLL);
                    bundle.putBoolean("should_show_back_button", false);
                    bundle.putBoolean("is_new_collection", true);
                    postLandingModel.backBundle = bundle;
                    videoPublishEditModel2.title = LJJJJZ;
                    PostPageModel postPageModel = videoPublishEditModel2.creativeModel.postPageModel;
                    postPageModel.captionModel.markupText = LJJJJZ;
                    postPageModel.markupCaption = LJJJJZ;
                    SY4 sy4 = seriesPostUIAssem.LJLILLLLZI;
                    if (sy4 != null) {
                        sy4.setLoading(true);
                    }
                    AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(seriesPostUIAssem, videoPublishEditModel2, 132);
                    ActivityC45651qj LIZ3 = C212428Vi.LIZ(seriesPostUIAssem);
                    if (LIZ3 != null) {
                        aqS135S0200000_4.invoke(LIZ3);
                        return;
                    }
                    return;
                }
                return;
            }
            VideoPublishEditModel videoPublishEditModel3 = seriesPostUIAssem.x3().LJLIL;
            if (videoPublishEditModel3 != null && (creativeModel = videoPublishEditModel3.creativeModel) != null && (paidContentVideoModel = creativeModel.paidContentModel) != null) {
                paidContentVideoModel.setCollectionId(LIZ2.collectionId);
            }
            VideoPublishEditModel videoPublishEditModel4 = seriesPostUIAssem.x3().LJLIL;
            if (videoPublishEditModel4 == null) {
                return;
            }
            videoPublishEditModel4.title = LJJJJZ;
            CreativeModel creativeModel3 = videoPublishEditModel4.creativeModel;
            PostPageModel postPageModel2 = creativeModel3.postPageModel;
            postPageModel2.captionModel.markupText = LJJJJZ;
            postPageModel2.markupCaption = LJJJJZ;
            creativeModel3.postLandingModel.landingBack = true;
            if (seriesPostUIAssem.x3().LJLILLLLZI) {
                PostLandingModel postLandingModel2 = videoPublishEditModel4.creativeModel.postLandingModel;
                postLandingModel2.backUrl = "aweme://paidcontent/manage";
                Bundle bundle2 = new Bundle();
                bundle2.putString("collection_id", videoPublishEditModel4.creativeModel.paidContentModel.getCollectionId());
                bundle2.putString("entry_point", seriesPostUIAssem.x3().LJLJJLL);
                bundle2.putString("enter_from", seriesPostUIAssem.x3().LJLJL);
                bundle2.putBoolean("should_show_back_button", false);
                bundle2.putBoolean("is_new_collection", false);
                postLandingModel2.backBundle = bundle2;
            }
            SY4 sy42 = seriesPostUIAssem.LJLILLLLZI;
            if (sy42 != null) {
                sy42.setLoading(true);
            }
            AqS135S0200000_4 aqS135S0200000_42 = new AqS135S0200000_4(seriesPostUIAssem, videoPublishEditModel4, 132);
            ActivityC45651qj LIZ4 = C212428Vi.LIZ(seriesPostUIAssem);
            if (LIZ4 == null) {
                return;
            }
            aqS135S0200000_42.invoke(LIZ4);
        }
    }
}
