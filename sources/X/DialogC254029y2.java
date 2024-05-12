package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC254029y2 extends Dialog {
    public KUR LJLIL;

    @Override // android.app.Dialog
    public final void show() {
        if (getOwnerActivity() == null || getOwnerActivity().isFinishing()) {
            return;
        }
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-9039249747731980505")).LIZ) {
            super.show();
        }
        KUR kur = this.LJLIL;
        if (kur == null) {
            return;
        }
        kur.LJIIIZ();
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
        this.LJLIL.setStatus(-1);
    }

    public DialogC254029y2(Activity activity) {
        super(activity, R.style.a5_);
        setOwnerActivity(activity);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.id);
        KUR kur = (KUR) findViewById(R.id.kf_);
        this.LJLIL = kur;
        kur.setBuilder(KUY.LIZ(getContext()));
    }
}
