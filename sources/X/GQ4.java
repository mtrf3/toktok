package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQ4 {
    public static void LIZ(VideoPublishEditModel editModel, String str, long j) {
        int i;
        o.LJIIIZ(editModel, "editModel");
        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("creationId: ");
        LIZ.append(editModel.getCreationId());
        LIZ.append(", restore caption cost: ");
        LJJ.LIZJ("lexical", C0H1.LIZJ(LIZ, j, "ms", LIZ));
        C145995oB LJI = C5V5.LJI(editModel);
        LJI.LJI("creation_id", editModel.getCreationId());
        LJI.LJI("content_source", H7R.LJJIFFI(editModel));
        LJI.LJI("publish_step_name", "restore");
        LJI.LJI(WM7.SCENE_SERVICE, str);
        LJI.LIZIZ(j, "duration");
        LJI.LJ("is_draft", editModel.creativeModel.draftInfoModel.isDraft);
        String str2 = editModel.creativeModel.postPageModel.captionModel.markupText;
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        LJI.LIZ(i, "markup_length");
        LJI.LIZ(editModel.creativeModel.postPageModel.captionModel.markupExtra.size(), "metadata_length");
        FMX.LJIIL("lexical_perf", LJI.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel editModel, String str, long j) {
        int i;
        o.LJIIIZ(editModel, "editModel");
        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("creationId: ");
        LIZ.append(editModel.getCreationId());
        LIZ.append(", snapshot caption cost: ");
        LJJ.LIZJ("lexical", C0H1.LIZJ(LIZ, j, "ms", LIZ));
        C145995oB LJI = C5V5.LJI(editModel);
        LJI.LJI("creation_id", editModel.getCreationId());
        LJI.LJI("content_source", H7R.LJJIFFI(editModel));
        LJI.LJI("publish_step_name", "snapshot");
        LJI.LJI(WM7.SCENE_SERVICE, str);
        LJI.LIZIZ(j, "duration");
        LJI.LJ("is_draft", editModel.creativeModel.draftInfoModel.isDraft);
        String str2 = editModel.creativeModel.postPageModel.captionModel.markupText;
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        LJI.LIZ(i, "markup_length");
        LJI.LIZ(editModel.creativeModel.postPageModel.captionModel.markupExtra.size(), "metadata_length");
        FMX.LJIIL("lexical_perf", LJI.LIZ);
    }
}
