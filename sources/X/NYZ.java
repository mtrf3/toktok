package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NYZ implements InterfaceC60721NsL {
    public View LIZ;
    public C72108SRs LIZIZ;

    @Override // X.InterfaceC60721NsL
    public final void LIZ(boolean z) {
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        } else {
            o.LJIJI("rootView");
            throw null;
        }
    }

    @Override // X.InterfaceC60721NsL
    public final void LIZIZ(int i) {
        C72108SRs c72108SRs = this.LIZIZ;
        if (c72108SRs != null) {
            c72108SRs.setProgress(i);
        } else {
            o.LJIJI("progressBar");
            throw null;
        }
    }

    @Override // X.InterfaceC60721NsL
    public final View LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.chl, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …process_bar, null, false)");
        this.LIZ = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.ffi);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.landing_page_tpl)");
        this.LIZIZ = (C72108SRs) findViewById;
        View view = this.LIZ;
        if (view != null) {
            return view;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
