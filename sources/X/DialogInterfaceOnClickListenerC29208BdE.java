package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BdE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29208BdE implements DialogInterface.OnClickListener {
    public final /* synthetic */ C29207BdD LJLIL;
    public final /* synthetic */ BIK LJLILLLLZI;
    public final /* synthetic */ C29216BdM LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLJJL;

    public DialogInterfaceOnClickListenerC29208BdE(C29207BdD c29207BdD, BIK bik, C29216BdM c29216BdM, Context context, C84654XKg c84654XKg) {
        this.LJLIL = c29207BdD;
        this.LJLILLLLZI = bik;
        this.LJLJI = c29216BdM;
        this.LJLJJI = context;
        this.LJLJJL = c84654XKg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        C29207BdD c29207BdD = this.LJLIL;
        DataChannel dataChannel = this.LJLILLLLZI.LIZIZ;
        c29207BdD.getClass();
        C29207BdD.LIZJ(dataChannel, "continue");
        C29216BdM c29216BdM = this.LJLJI;
        Context context = this.LJLJJI;
        long id = this.LJLIL.LIZ.getId();
        c29216BdM.getClass();
        C29216BdM.LIZIZ(context, id, "saved_uid_start");
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLJJL;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }
}
