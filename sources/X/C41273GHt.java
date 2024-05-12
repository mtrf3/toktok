package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GHt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41273GHt implements InterfaceC42064Gf6 {
    public final Activity LIZ;
    public DialogC25756A8y LIZIZ;

    @Override // X.InterfaceC42064Gf6
    public final void LIZIZ() {
    }

    public final void LIZJ() {
        if (this.LIZIZ == null) {
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(this.LIZ);
            dialogC25756A8y.LIZIZ(R.string.q5d);
            this.LIZIZ = dialogC25756A8y;
            V1B.LJLJJL(dialogC25756A8y);
        }
        DialogC25756A8y dialogC25756A8y2 = this.LIZIZ;
        if (dialogC25756A8y2 == null || dialogC25756A8y2.isShowing() || new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y2, new Object[0], "void", new C65300Pk0(false, "()V", "-7437708341368286557")).LIZ) {
            return;
        }
        dialogC25756A8y2.show();
    }

    @Override // X.InterfaceC42064Gf6
    public final void onFailure() {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.q9_);
        c26045AKb.LJIIJ();
        DialogC25756A8y dialogC25756A8y = this.LIZIZ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            dialogC25756A8y.dismiss();
        }
    }

    public C41273GHt(Activity activity) {
        this.LIZ = activity;
    }
}
