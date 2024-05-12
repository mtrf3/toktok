package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JOm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49092JOm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (((Number) C34263DcZ.LIZ.getValue()).intValue() != 0 && LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme, boolean z) {
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        o.LJIIIZ(aweme, "aweme");
        if (!LIZ() || C53326KwM.LIZ() || C34011DWl.LIZ()) {
            return false;
        }
        Video video = aweme.getVideo();
        String str = null;
        if (video == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty() || aweme.getSearchExtraParams() == null) {
            return false;
        }
        java.util.Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
        if (searchExtraParams != null) {
            str = searchExtraParams.get("is_search_video");
        }
        if (!o.LJ(str, "1") || z || aweme.isAd() || JP2.LIZ(aweme) || C46442IKo.LIZIZ()) {
            return false;
        }
        if (C49099JOt.LIZ && aweme.getVideoSkipEnableSkipButton()) {
            return false;
        }
        return true;
    }
}
