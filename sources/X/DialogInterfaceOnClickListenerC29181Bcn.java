package X;

import android.content.DialogInterface;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bcn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29181Bcn implements DialogInterface.OnClickListener {
    public final /* synthetic */ C29207BdD LJLIL;
    public final /* synthetic */ BIK LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLJI;

    public DialogInterfaceOnClickListenerC29181Bcn(C29207BdD c29207BdD, BIK bik, C84654XKg c84654XKg) {
        this.LJLIL = c29207BdD;
        this.LJLILLLLZI = bik;
        this.LJLJI = c84654XKg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        C29207BdD c29207BdD = this.LJLIL;
        DataChannel dataChannel = this.LJLILLLLZI.LIZIZ;
        c29207BdD.getClass();
        C29207BdD.LIZJ(dataChannel, "cancel");
        dialog.dismiss();
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLJI;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }
}
