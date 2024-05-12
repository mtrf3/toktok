package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class HB7 {
    public static final CreativeInfo LIZ = new CreativeInfo("FixedCreativeInfo", 0, null, 4, null);

    public static final void LIZ(Workspace workspace, VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        String str;
        if (workspace != null && videoPublishEditModel != null && (multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData) != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (str = multiEditVideoRecordData.curRecordingDir) != null) {
            String LJIJJLI = C78966Uyw.LJIJJLI(str);
            int LJJLIIIJL = s.LJJLIIIJL(LJIJJLI, "new", 0, false, 6);
            if (LJJLIIIJL >= 0) {
                String substring = LJIJJLI.substring(0, LJJLIIIJL);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                workspace.LJLIL.s(C78966Uyw.LJIJJLI(substring));
                return;
            }
            workspace.LJLIL.s(LJIJJLI);
        }
    }
}
