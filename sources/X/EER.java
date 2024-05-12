package X;

import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EER extends EEN implements Handler.Callback {
    public final EFV LJLILLLLZI = new EFV(this);

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    public final void LJFF() {
        C36093EEn.LIZ.getClass();
        String LIZJ = C36093EEn.LIZLLL.LIZJ(EFK.IDLE);
        if (LIZJ != null) {
            C37179EiV.LIZJ(false).execute(new ARunnableS7S1100000_6(this, LIZJ, 14));
        }
    }

    public EER() {
        C16880lQ.LJLI(Looper.myQueue(), new EES(this));
    }

    @Override // X.EEN, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        C36093EEn.LIZ.getClass();
        if (C36093EEn.LIZLLL.LIZ(EFK.IDLE)) {
            this.LJLILLLLZI.LIZ(LinkMicRtcMixBitrateSetting.DEFAULT);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        LJFF();
        return true;
    }
}
