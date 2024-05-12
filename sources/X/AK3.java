package X;

import android.content.DialogInterface;

/* loaded from: classes5.dex */
public final class AK3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C29701Eo LJLJI;

    public AK3(C34K c34k, String str, C29701Eo c29701Eo) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = str;
        this.LJLJI = c29701Eo;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.LJLIL.element) {
            str = "done";
        } else {
            str = "close";
        }
        FMX.LJIILL("click_story_widget_guide", new OSZ("notification_page", "enter_from"), new OSZ(this.LJLILLLLZI, "trigger_type"), new OSZ(str, "click_type"), new OSZ(1, "page"));
        this.LJLJI.cancelAnimation();
        this.LJLIL.element = false;
    }
}
