package X;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CLF implements DialogInterface.OnClickListener {
    public final /* synthetic */ C29216BdM LJLIL;
    public final /* synthetic */ CLB LJLILLLLZI;
    public final /* synthetic */ long[] LJLJI;
    public final /* synthetic */ C15960jw LJLJJI;

    public CLF(C29216BdM c29216BdM, CLB clb, long[] jArr, C15960jw c15960jw) {
        this.LJLIL = c29216BdM;
        this.LJLILLLLZI = clb;
        this.LJLJI = jArr;
        this.LJLJJI = c15960jw;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        C29216BdM c29216BdM = this.LJLIL;
        Context context = this.LJLILLLLZI.LIZ;
        long j = this.LJLJI[0];
        c29216BdM.getClass();
        C29216BdM.LIZIZ(context, j, "saved_uid_recharge");
        this.LJLILLLLZI.getClass();
        CLB.LIZIZ(0);
        this.LJLILLLLZI.LJ(this.LJLJJI);
    }
}
