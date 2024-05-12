package Y;

import X.C145995oB;
import X.C76800UCe;
import X.GXR;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverFragment;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS18S0100100_2 implements Callable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS18S0100100_2 aCallableS18S0100100_2) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(aCallableS18S0100100_2.j1, "duration");
        c145995oB.LJI("type", "publish_select_cover");
        c145995oB.LJI("content_type", "publish_image_cover");
        VideoPublishEditModel videoPublishEditModel = ((ImageChooseCoverFragment) aCallableS18S0100100_2.l0).LLFII;
        if (videoPublishEditModel != null) {
            c145995oB.LJI("enter_from", videoPublishEditModel.creativeModel.postPageModel.coverEnterFrom);
            GXR.LIZ("tool_performance_publish_cover_first_frame", c145995oB.LIZ);
            return C76800UCe.LIZ;
        }
        o.LJIJI("model");
        throw null;
    }

    public static final Object call$1(ACallableS18S0100100_2 aCallableS18S0100100_2) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(aCallableS18S0100100_2.j1, "duration");
        c145995oB.LJI("type", "publish_preview");
        c145995oB.LJI("content_type", "publish_image_preview");
        c145995oB.LJI("enter_from", ((ImagePublishPreviewScene) aCallableS18S0100100_2.l0).LJLLI.creativeModel.postPageModel.previewEnterFrom);
        GXR.LIZ("tool_performance_publish_cover_first_frame", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public ACallableS18S0100100_2(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
