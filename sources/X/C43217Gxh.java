package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43217Gxh {
    public static final /* synthetic */ int LIZ = 0;

    public static final SynthetiseResult LIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        SynthetiseResult synthetiseResult = new SynthetiseResult();
        synthetiseResult.setSyntheticStartTime(new C43236Gy0(0));
        synthetiseResult.draftHardEncode = editModel.mHardEncode;
        synthetiseResult.outputFile = editModel.getOutputFile();
        synthetiseResult.needRecode = C44526Hdi.LJFF(editModel);
        synthetiseResult.flags |= 1;
        synthetiseResult.isEnableFpsSet = C19N.LJ("enable_synthetic_fps_set", true);
        synthetiseResult.editPreviewInfo = editModel.getPreviewInfo();
        synthetiseResult.isFastImport = editModel.isFastImport;
        synthetiseResult.isFastImportForLog = H7R.LJJJJ(editModel);
        synthetiseResult.isTTStory = editModel.isStoryEditMode;
        synthetiseResult.segmentCount = editModel.segmentCounts();
        synthetiseResult.hasSubtitle = editModel.hasSubtitle();
        return synthetiseResult;
    }

    public static final SynthetiseResult LIZIZ(int i) {
        SynthetiseResult synthetiseResult = new SynthetiseResult();
        synthetiseResult.ret = i;
        return synthetiseResult;
    }
}
