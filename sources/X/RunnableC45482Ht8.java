package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC45482Ht8 implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C45473Hsz LJLILLLLZI;
    public final /* synthetic */ C45765Hxh LJLJI;

    public RunnableC45482Ht8(boolean z, C45473Hsz c45473Hsz, C45765Hxh c45765Hxh) {
        this.LJLIL = z;
        this.LJLILLLLZI = c45473Hsz;
        this.LJLJI = c45765Hxh;
    }

    public final void LIZ() {
        if (this.LJLIL && HRX.LJI() && HRX.LJFF() && this.LJLILLLLZI.LJJJJI.LIZ.getBoolean("autocut_guide_should_show", true)) {
            this.LJLILLLLZI.LJJJJI.LIZ.storeBoolean("autocut_guide_should_show", false);
            C45473Hsz c45473Hsz = this.LJLILLLLZI;
            C45474Ht0 c45474Ht0 = c45473Hsz.LIZJ;
            if (c45474Ht0 != null) {
                Context context = c45474Ht0.getContext();
                o.LJIIIIZZ(context, "videoImageMixedView.context");
                c45473Hsz.LJJJJ = C44703HgZ.LIZJ(context, this.LJLJI, "upload_page", this.LJLILLLLZI.LIZ);
                return;
            }
            o.LJIJI("videoImageMixedView");
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
