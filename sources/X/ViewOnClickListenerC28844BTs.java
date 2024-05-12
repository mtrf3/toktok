package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BTs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC28844BTs implements View.OnClickListener {
    public static final ViewOnClickListenerC28844BTs LJLIL = new ViewOnClickListenerC28844BTs();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C74824TYe.LJLL("livesdk_trymode_anchor_guest_connection_click_flip_cammera", C77123UOp.LJJIIZ());
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIIIZ;
        Integer LIZIZ = c48459J0d.LIZIZ();
        if (LIZIZ == null || LIZIZ.intValue() != 1) {
            C30868C9o.LIZJ(R.string.l_j);
            c48459J0d.LJ(1);
        } else {
            C30868C9o.LIZJ(R.string.kd4);
            c48459J0d.LJ(0);
        }
        UPJ.LJFF(2, C73943T0h.LIZ());
    }
}
