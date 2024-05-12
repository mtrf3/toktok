package X;

import Y.ARunnableS43S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GiY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42278GiY implements CreativeLoadingDialog {
    public final C62822Ol8 LIZ;
    public final ARunnableS43S0100000_7 LIZIZ;
    public final DialogC25753A8v LIZJ;
    public final A90 LIZLLL;
    public final DialogC25756A8y LJ;
    public final int LJFF;
    public boolean LJI;
    public boolean LJII;
    public final ARunnableS43S0100000_7 LJIIIIZZ;

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void dismiss() {
        this.LJI = false;
        if (!isShowing() && this.LJII) {
            this.LJII = false;
            ((Handler) this.LIZ.getValue()).removeCallbacks(this.LJIIIIZZ);
        }
        if (isShowing()) {
            try {
                DialogC25753A8v dialogC25753A8v = this.LIZJ;
                if (dialogC25753A8v != null) {
                    dialogC25753A8v.dismiss();
                }
                A90 a90 = this.LIZLLL;
                if (a90 != null) {
                    a90.dismiss();
                }
                DialogC25756A8y dialogC25756A8y = this.LJ;
                if (dialogC25756A8y != null) {
                    dialogC25756A8y.dismiss();
                }
                if (this.LJFF > 0) {
                    ((Handler) this.LIZ.getValue()).removeCallbacks(this.LIZIZ);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final boolean isShowing() {
        A90 a90 = this.LIZLLL;
        if (a90 != null && a90.isShowing()) {
            return true;
        }
        DialogC25756A8y dialogC25756A8y = this.LJ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            return true;
        }
        DialogC25753A8v dialogC25753A8v = this.LIZJ;
        if (dialogC25753A8v != null && dialogC25753A8v.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final Dialog originalDialog() {
        A90 a90 = this.LIZLLL;
        if (a90 != null) {
            return a90;
        }
        DialogC25756A8y dialogC25756A8y = this.LJ;
        if (dialogC25756A8y != null) {
            return dialogC25756A8y;
        }
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void show() {
        if (!isShowing()) {
            try {
                DialogC25753A8v dialogC25753A8v = this.LIZJ;
                if (dialogC25753A8v != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/tools/view/uikit/factory/CreativeTuxLoadingDualBallDialog", "show", dialogC25753A8v, new Object[0], "void", new C65300Pk0(false, "()V", "8296375845255291763")).LIZ) {
                    dialogC25753A8v.show();
                }
                A90 a90 = this.LIZLLL;
                if (a90 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "8296375845255291763")).LIZ) {
                    a90.show();
                }
                DialogC25756A8y dialogC25756A8y = this.LJ;
                if (dialogC25756A8y != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "8296375845255291763")).LIZ) {
                    dialogC25756A8y.show();
                }
                if (this.LJFF > 0) {
                    ((Handler) this.LIZ.getValue()).postDelayed(this.LIZIZ, this.LJFF);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void delayShow(long j) {
        this.LJI = true;
        this.LJII = true;
        Handler handler = (Handler) this.LIZ.getValue();
        ARunnableS43S0100000_7 aRunnableS43S0100000_7 = this.LJIIIIZZ;
        if (j <= 0) {
            j = C42279GiZ.LIZ();
        }
        handler.postDelayed(aRunnableS43S0100000_7, j);
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void updateProgress(int i) {
        A90 a90;
        if (isShowing() && (a90 = this.LIZLLL) != null) {
            a90.LIZLLL(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog
    public final void updateProgressContent(String content) {
        o.LJIIIZ(content, "content");
        if (isShowing()) {
            A90 a90 = this.LIZLLL;
            if (a90 != null) {
                a90.LIZJ(content);
            }
            DialogC25756A8y dialogC25756A8y = this.LJ;
            if (dialogC25756A8y != null) {
                dialogC25756A8y.LIZJ(content);
            }
        }
    }

    public C42278GiY(Context context, CreativeLoadingDialogBuilder builder) {
        boolean z;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(builder, "builder");
        builder.getConfig().isShowProgress();
        this.LIZ = C221108m2.LIZIZ(new AqS157S0100000_7(context, 421));
        this.LIZIZ = new ARunnableS43S0100000_7(this, 89);
        int i = -1;
        this.LJFF = -1;
        this.LJI = true;
        this.LJIIIIZZ = new ARunnableS43S0100000_7(this, 88);
        int i2 = C42286Gig.LIZ[builder.getConfig().getCancelViewVisibleType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = 15000;
                    }
                } else {
                    i = 5000;
                }
            } else {
                i = 0;
            }
        }
        this.LJFF = i;
        String message = builder.getConfig().getMessage();
        if ((message == null || message.length() == 0) && builder.getConfig().getCancelViewVisibleType() == CreativeLoadingDialogBuilder.CancelType.GONE) {
            z = true;
        } else {
            z = false;
        }
        if (builder.getConfig().isShowProgress()) {
            A90 a90 = new A90(context);
            a90.LIZ(false);
            a90.LIZIZ(builder.getConfig().getHasOverLay());
            a90.LIZJ(builder.getConfig().getMessage());
            a90.LJ(i == 0);
            a90.setCancelable(builder.getConfig().getBackCanCancel());
            this.LIZLLL = a90;
            return;
        }
        if (!builder.getConfig().isShowProgress() && !z) {
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
            dialogC25756A8y.LIZ(builder.getConfig().getHasOverLay());
            dialogC25756A8y.LIZJ(builder.getConfig().getMessage());
            dialogC25756A8y.LIZLLL(i == 0);
            dialogC25756A8y.setCancelable(builder.getConfig().getBackCanCancel());
            this.LJ = dialogC25756A8y;
            return;
        }
        DialogC25753A8v dialogC25753A8v = new DialogC25753A8v(context);
        dialogC25753A8v.setCancelable(builder.getConfig().getBackCanCancel());
        this.LIZJ = dialogC25753A8v;
    }
}
