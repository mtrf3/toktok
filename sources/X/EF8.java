package X;

import android.app.Application;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EF8 implements EEX {
    public final /* synthetic */ Application LIZ;

    public EF8(Application application) {
        this.LIZ = application;
    }

    @Override // X.EEX
    public final void LIZ(EEV state) {
        o.LJIIIZ(state, "state");
        if (C36839Ed1.LIZIZ(this.LIZ)) {
            Object value = EF1.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-MAIN_PROCESS_STATE_REPO>(...)");
            ((Keva) value).storeInt("runstate", state.ordinal());
        }
    }
}
