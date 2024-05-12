package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.60g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1533860g {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (!editModel.isEnterFromDM() && !C79004UzY.LJJIII(editModel.canvasVideoData) && !H7R.LJJLIIIJJIZ(editModel)) {
            return true;
        }
        return false;
    }
}
