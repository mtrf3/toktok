package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C1Q extends C0YE {
    public final /* synthetic */ C1P LJLJI;
    public final /* synthetic */ C1R LJLJJI;

    @Override // X.C0YE
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        LiveDialog liveDialog = this.LJLJI.LJLJJL;
        if (liveDialog != null) {
            this.LJLJJI.LJIILLIIL(liveDialog);
        }
        if (this.LJLJI.LJLJJL == null) {
            C0NB.LIZLLL("no violation dialog = null when click feedback btn");
        }
    }

    public C1Q(C1P c1p, C1R c1r) {
        this.LJLJI = c1p;
        this.LJLJJI = c1r;
    }
}
