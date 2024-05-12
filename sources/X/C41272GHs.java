package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GHs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41272GHs implements InterfaceC42062Gf4 {
    public final Activity LIZ;
    public DialogC25756A8y LIZIZ;

    @Override // X.InterfaceC42062Gf4
    public final void LIZIZ() {
    }

    public final void LIZ() {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.q9_);
        c26045AKb.LJIIJ();
        DialogC25756A8y dialogC25756A8y = this.LIZIZ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            DialogC25756A8y dialogC25756A8y2 = this.LIZIZ;
            o.LJI(dialogC25756A8y2);
            dialogC25756A8y2.dismiss();
        }
    }

    public final void LIZJ() {
        Activity activity = this.LIZ;
        if (this.LIZIZ == null && activity != null) {
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(activity);
            this.LIZIZ = dialogC25756A8y;
            dialogC25756A8y.LIZIZ(R.string.q5d);
            DialogC25756A8y dialogC25756A8y2 = this.LIZIZ;
            o.LJI(dialogC25756A8y2);
            V1B.LJLJJL(dialogC25756A8y2);
        }
        DialogC25756A8y dialogC25756A8y3 = this.LIZIZ;
        if (dialogC25756A8y3 != null) {
            o.LJI(dialogC25756A8y3);
            if (!dialogC25756A8y3.isShowing()) {
                DialogC25756A8y dialogC25756A8y4 = this.LIZIZ;
                o.LJI(dialogC25756A8y4);
                if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y4, new Object[0], "void", new C65300Pk0(false, "()V", "-3090270595146933640")).LIZ) {
                    return;
                }
                dialogC25756A8y4.show();
            }
        }
    }

    public C41272GHs(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC42062Gf4
    public void onSuccess(String str) {
        DialogC25756A8y dialogC25756A8y = this.LIZIZ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            DialogC25756A8y dialogC25756A8y2 = this.LIZIZ;
            o.LJI(dialogC25756A8y2);
            dialogC25756A8y2.dismiss();
        }
    }
}
