package X;

import android.content.DialogInterface;

/* renamed from: X.BJe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC28570BJe implements DialogInterface.OnClickListener {
    public final /* synthetic */ C28571BJf LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ BJT LJLJJI;

    public DialogInterfaceOnClickListenerC28570BJe(C28571BJf c28571BJf, long j, long j2, BJT bjt) {
        this.LJLIL = c28571BJf;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = bjt;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C28571BJf.LJFF(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        this.LJLIL.getClass();
        BZI LJ = C28571BJf.LJ("livesdk_turn_on_ranking_popup_click");
        LJ.LJIJJ("turn_on", "button_click_type");
        LJ.LJJIIJZLJL();
    }
}
