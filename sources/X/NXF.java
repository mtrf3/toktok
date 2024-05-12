package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXF extends NXE {
    public final Context LIZ;
    public C72108SRs LIZIZ;

    public NXF(Context themeContext) {
        o.LJIIIZ(themeContext, "themeContext");
        this.LIZ = themeContext;
    }

    @Override // X.InterfaceC60721NsL
    public final void LIZ(boolean z) {
        int i;
        C72108SRs c72108SRs = this.LIZIZ;
        if (c72108SRs == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        c72108SRs.setVisibility(i);
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
        C72108SRs progressBar = (C72108SRs) C16880lQ.LLLZIIL(R.layout.c15, C16880lQ.LLZIL(this.LIZ), null).findViewById(R.id.hv6);
        this.LIZIZ = progressBar;
        o.LJIIIIZZ(progressBar, "progressBar");
        return progressBar;
    }
}
