package X;

import Y.ARunnableS26S0200000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUT {
    public final InterfaceC43387H1b LIZ;

    public GUT(C43478H4o c43478H4o) {
        this.LIZ = c43478H4o;
    }

    public static final void LIZ(Context context, String cause) {
        o.LJIIIZ(context, "context");
        if (cause == null || cause.length() == 0) {
            cause = "unknown";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("invoke_type", "cancelSynthesis");
        c145995oB.LJI(WM7.SCENE_SERVICE, cause);
        c145995oB.LJI("publish_parallel", "1");
        FMX.LJIIL("publish_service_cancel", c145995oB.LIZ);
        C41574GTi c41574GTi = new C41574GTi();
        o.LJIIIZ(cause, "cause");
        c41574GTi.LIZ = cause;
        C41359GLb LIZ = c41574GTi.LIZ();
        GUQ guq = GUH.LJI;
        if (guq == null) {
            return;
        }
        GUH.LIZLLL.execute(new ARunnableS26S0200000_7(LIZ, guq, 19));
    }

    public final InterfaceC153045zY LIZIZ(VideoPublishEditModel editModel, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ.LIZ();
        return C152875zH.LIZIZ(editModel, aqS168S0100000_2);
    }
}
