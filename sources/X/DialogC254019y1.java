package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9y1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC254019y1 extends Dialog {
    public KUR LJLIL;

    @Override // android.app.Dialog
    public final void show() {
        if (getOwnerActivity() == null || getOwnerActivity().isFinishing()) {
            return;
        }
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "9027340740919801552")).LIZ) {
            super.show();
        }
        KUR kur = this.LJLIL;
        if (kur == null) {
            return;
        }
        kur.LJI();
        this.LJLIL.LJIIIZ();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (getOwnerActivity() == null || getOwnerActivity().isFinishing()) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        KUR kur = this.LJLIL;
        if (kur == null) {
            return;
        }
        kur.setVisibility(8);
    }

    public DialogC254019y1(Activity activity) {
        super(activity, R.style.a77);
        setOwnerActivity(activity);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.amf);
        KUR kur = (KUR) findViewById(R.id.kf_);
        this.LJLIL = kur;
        kur.setBuilder(KUY.LIZ(getContext()));
    }
}
