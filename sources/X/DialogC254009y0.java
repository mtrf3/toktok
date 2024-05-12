package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9y0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC254009y0 extends Dialog {
    public KUR LJLIL;

    @Override // android.app.Dialog
    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "8318057351621470128")).LIZ) {
                super.show();
            }
            KUR kur = this.LJLIL;
            if (kur != null) {
                kur.LJI();
                KUR kur2 = this.LJLIL;
                if (kur2 != null) {
                    kur2.LJIIIZ();
                    return;
                } else {
                    o.LJIJI("mDmtStatusView");
                    throw null;
                }
            }
            o.LJIJI("mDmtStatusView");
            throw null;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            KUR kur = this.LJLIL;
            if (kur != null) {
                kur.setVisibility(8);
            } else {
                o.LJIJI("mDmtStatusView");
                throw null;
            }
        }
    }

    public DialogC254009y0(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, R.style.uu);
        setOwnerActivity(activityC45651qj);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bmz);
        View findViewById = findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.status_view)");
        KUR kur = (KUR) findViewById;
        this.LJLIL = kur;
        kur.setBuilder(KUY.LIZ(getContext()));
    }
}
