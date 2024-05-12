package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class JIL {
    public static final C62822Ol8 LIZ;

    static {
        JIL jil = new JIL();
        LIZ = C221108m2.LIZIZ(JIM.LJLIL);
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ != null && !LIZJ.LJI(jil)) {
            LIZJ.LJIILJJIL(jil);
        }
    }

    @QD3
    public final void onRenderFirstFrame(C46272IEa event) {
        String str;
        o.LJIIIZ(event, "event");
        LiveData liveData = (LiveData) LIZ.getValue();
        Aweme aweme = event.LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        liveData.setValue(str);
    }
}
