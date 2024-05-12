package X;

import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;

/* renamed from: X.Brh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC30105Brh {
    boolean LJIIIIZZ(MotionEvent motionEvent);

    void R2(Layer2PriorityManager layer2PriorityManager);

    void c8(int i);

    void continueAfterWidgetLoaded();

    Fragment getFragment();

    void handleCopyrightViolation(RemindMessage remindMessage);

    void loadIndependentBehaviors();

    void nj();

    C30876C9w w();
}
