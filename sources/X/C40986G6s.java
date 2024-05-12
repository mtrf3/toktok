package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G6s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40986G6s {
    public static final boolean LIZ(VideoPublishEditModel editModel) {
        boolean z;
        o.LJIIIZ(editModel, "editModel");
        boolean LIZ = C40985G6r.LIZ();
        int i = C40983G6p.LIZ;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean isSaveLocalWithWaterMark = editModel.isSaveLocalWithWaterMark();
        if (!LIZ) {
            return false;
        }
        if (!isSaveLocalWithWaterMark && !z) {
            return false;
        }
        return true;
    }
}
