package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class CF7 {
    public final View LIZ;
    public final DataChannel LIZIZ;
    public BarrageMessage LIZJ;
    public final C62822Ol8 LIZLLL;

    public CF7(View view, DataChannel dataChannel) {
        this.LIZ = view;
        this.LIZIZ = dataChannel;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 402));
        this.LIZLLL = LIZIZ;
        LinearLayout linearLayout = (LinearLayout) LIZIZ.getValue();
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS25S0100000_5(this, 399));
        }
    }
}
