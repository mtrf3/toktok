package X;

import android.view.View;
import java.util.HashMap;

/* renamed from: X.BTp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC28841BTp implements View.OnClickListener {
    public static final ViewOnClickListenerC28841BTp LJLIL = new ViewOnClickListenerC28841BTp();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap LJJIIZ = C77123UOp.LJJIIZ();
        LJJIIZ.put("action_type", "click");
        C74824TYe.LJLL("livesdk_trymode_anchor_guest_seat_modification_popup", LJJIIZ);
    }
}
