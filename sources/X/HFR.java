package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFR implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        ArrayList<String> arrayList = editModel.mvCreateVideoData.srcSelectMediaList;
        o.LJIIIIZZ(arrayList, "editModel.mvCreateVideoData.srcSelectMediaList");
        int size = ORZ.LLJJ(arrayList).size();
        if (size == 0) {
            return new OSZ(12, "");
        }
        if (i == size) {
            return new OSZ(-1, "");
        }
        return new OSZ(12, C48263Iwt.LIZLLL("frame count:", i, ", select size:", size));
    }
}
