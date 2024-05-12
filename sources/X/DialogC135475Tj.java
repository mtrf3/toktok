package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5Tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC135475Tj extends Dialog {
    public C223338pd LJLIL;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "6259214279788454437")).LIZ) {
            super.show();
        }
        C223338pd c223338pd = this.LJLIL;
        if (c223338pd != null) {
            c223338pd.LIZIZ();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C223338pd c223338pd = this.LJLIL;
        if (c223338pd != null) {
            c223338pd.LIZJ();
        }
    }

    public DialogC135475Tj(Context context) {
        super(context, R.style.hk);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cc2);
        this.LJLIL = (C223338pd) findViewById(R.id.luc);
        setCanceledOnTouchOutside(false);
    }
}
