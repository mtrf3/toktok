package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BdH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29211BdH implements DialogInterface.OnClickListener {
    public final /* synthetic */ C29216BdM LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C29212BdI LJLJJI;
    public final /* synthetic */ C29210BdG LJLJJL;

    public DialogInterfaceOnClickListenerC29211BdH(C29216BdM c29216BdM, Context context, long j, C29212BdI c29212BdI, C29210BdG c29210BdG) {
        this.LJLIL = c29216BdM;
        this.LJLILLLLZI = context;
        this.LJLJI = j;
        this.LJLJJI = c29212BdI;
        this.LJLJJL = c29210BdG;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        C29216BdM c29216BdM = this.LJLIL;
        Context context = this.LJLILLLLZI;
        long j = this.LJLJI;
        c29216BdM.getClass();
        C29216BdM.LIZIZ(context, j, "saved_uid_start");
        C29212BdI c29212BdI = this.LJLJJI;
        c29212BdI.LIZJ.invoke(Integer.valueOf(c29212BdI.LJ));
        C29210BdG c29210BdG = this.LJLJJL;
        DataChannel dataChannel = this.LJLJJI.LIZIZ;
        c29210BdG.getClass();
        C29210BdG.LIZIZ(dataChannel, "continue");
    }
}
