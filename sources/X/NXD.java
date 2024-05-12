package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXD extends NXE {
    public View LIZ;
    public C72108SRs LIZIZ;

    @Override // X.InterfaceC60721NsL
    public final void LIZ(boolean z) {
        int i;
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC60721NsL
    public final void LIZIZ(int i) {
        C72108SRs c72108SRs = this.LIZIZ;
        if (c72108SRs != null) {
            c72108SRs.setProgress(i);
        }
    }

    @Override // X.InterfaceC60721NsL
    public final View LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cn7, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …rogress_bar, null, false)");
        this.LIZ = LLLLIILL;
        this.LIZIZ = (C72108SRs) LLLLIILL.findViewById(R.id.iac);
        View view = this.LIZ;
        if (view != null) {
            return view;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
