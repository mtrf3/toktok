package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.QAAnchorPopShowSetting;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BYn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28969BYn {
    public static final Object LIZ = new Object();
    public static final Object LIZIZ = new Object();

    public static void LIZ(EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        int i = C28973BYr.LIZ[button.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C15610jN.LIZ().removeCallbacksAndMessages(LIZ);
            return;
        }
        C15610jN.LIZ().removeCallbacksAndMessages(LIZIZ);
    }

    public static void LIZIZ(View view, DataChannel dataChannel, InterfaceC65784Pro interfaceC65784Pro) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        Boolean LIZJ = InterfaceC30442Bx8.LJJJJIZL.LIZJ();
        o.LJIIIIZZ(LIZJ, "SHOW_QUESTION_GUIDE_BUBBLE_ANCHOR.value");
        if (LIZJ.booleanValue() && QAAnchorPopShowSetting.INSTANCE.enable()) {
            if ((!BV1.LJ(dataChannel) && (LJIILL = C1DH.LJIILL(dataChannel)) != null && (interactionQuestionInfo = LJIILL.interactionQuestion) != null && interactionQuestionInfo.hasRecommend) || (BV1.LJ(dataChannel) && BV1.LIZLLL(dataChannel))) {
                C1YG c1yg = new C1YG(view);
                c1yg.LJIILLIIL = C15380j0.LJIILJJIL(R.string.mt8);
                c1yg.LJIIL = new C28970BYo(interfaceC65784Pro);
                C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_QA);
                return;
            }
            if (BV1.LIZJ(dataChannel)) {
                return;
            }
            C1YG c1yg2 = new C1YG(view);
            c1yg2.LIZ(R.string.mss);
            c1yg2.LJIIL = new C28971BYp(interfaceC65784Pro);
            C30770C5u.LIZLLL(new C1YH(c1yg2), C09.ANCHOR_QUICK_QA);
        }
    }
}
