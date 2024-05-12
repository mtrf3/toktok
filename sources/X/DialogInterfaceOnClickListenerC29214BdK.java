package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BdK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29214BdK implements DialogInterface.OnClickListener {
    public final /* synthetic */ C29216BdM LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C29215BdL LJLJJI;
    public final /* synthetic */ C29213BdJ LJLJJL;

    public DialogInterfaceOnClickListenerC29214BdK(C29216BdM c29216BdM, Context context, long j, C29215BdL c29215BdL, C29213BdJ c29213BdJ) {
        this.LJLIL = c29216BdM;
        this.LJLILLLLZI = context;
        this.LJLJI = j;
        this.LJLJJI = c29215BdL;
        this.LJLJJL = c29213BdJ;
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
        C29215BdL c29215BdL = this.LJLJJI;
        c29215BdL.LIZJ.invoke(Integer.valueOf(c29215BdL.LJ));
        C29213BdJ c29213BdJ = this.LJLJJL;
        DataChannel dataChannel = this.LJLJJI.LIZIZ;
        c29213BdJ.getClass();
        C29213BdJ.LIZIZ(dataChannel, "continue");
    }
}
