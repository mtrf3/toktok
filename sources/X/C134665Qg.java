package X;

import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134665Qg {
    public final VideoPublishEditModel LIZ;
    public final String LIZIZ;

    public final C145995oB LIZ() {
        C145995oB LJJJLIIL = H8F.LJJJLIIL(this.LIZ);
        LJJJLIIL.LJI("creation_id", this.LIZ.getCreationId());
        LJJJLIIL.LJI("shoot_way", this.LIZ.mShootWay);
        LJJJLIIL.LJI("content_type", H8F.LJII(this.LIZ));
        LJJJLIIL.LJI("content_source", H8F.LJI(this.LIZ));
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        String stickers = this.LIZ.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        LJJJLIIL.LJI("prop_list", stickers);
        LJJJLIIL.LIZ(this.LIZ.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        LJJJLIIL.LJI("app_language", C60903NvH.LJIIJJI().LJII());
        LJJJLIIL.LJI("current_page", this.LIZIZ);
        return LJJJLIIL;
    }

    public /* synthetic */ C134665Qg(VideoPublishEditModel videoPublishEditModel) {
        this(videoPublishEditModel, "text_edit_page");
    }

    public final String LIZIZ(String str) {
        String str2;
        String str3 = this.LIZIZ;
        if (o.LJ(str3, "text_edit_page")) {
            InlineCaptionModel inlineCaptionModel = this.LIZ.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel == null || (str2 = inlineCaptionModel.selectLanguageCode) == null) {
                return "";
            }
            return H8F.LJJJLL(str2);
        }
        if (!o.LJ(str3, "caption_font_edit_page") || str == null) {
            return "";
        }
        return H8F.LJJJLL(str);
    }

    public C134665Qg(VideoPublishEditModel publishEditModel, String currentPage) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(currentPage, "currentPage");
        this.LIZ = publishEditModel;
        this.LIZIZ = currentPage;
    }
}
