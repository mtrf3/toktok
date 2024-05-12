package X;

import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GXW {
    public static java.util.Set LIZIZ() {
        return C60903NvH.LJIIJJI().LJJIJL().getAllowListService().getPrefixAllowList();
    }

    public static void LIZJ() {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
    }

    public static final String LIZ(AwemeDraft draft) {
        String draftDir;
        o.LJIIIZ(draft, "draft");
        AVDraftExtras aVDraftExtras = draft.LJJJJI;
        if (aVDraftExtras.isFastImport) {
            EditPreviewInfo LIZLLL = C41802Gas.LIZLLL(draft, false);
            if (LIZLLL == null || (draftDir = LIZLLL.getDraftDir()) == null) {
                return "";
            }
            return draftDir;
        }
        if (draft.photoMovieContext != null) {
            String str = aVDraftExtras.draftVideoPath;
            if (str == null) {
                return "";
            }
            return str;
        }
        String LIZJ = C38352F3k.LIZJ(aVDraftExtras.draftVideoPath);
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, C43075GvP.LIZJ, LIZJ, LIZ);
        if (LJFF == null) {
            return "";
        }
        return LJFF;
    }
}
