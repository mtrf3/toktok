package X;

import android.content.Context;

/* renamed from: X.1t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC47081t2 extends DialogC40981jC {
    @Override // android.app.Dialog
    public void show() {
        if (AnonymousClass149.LIZ.LIZLLL() || new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareAppCompatDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-2308123501847124504")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        AnonymousClass149.LIZ.LIZ(this);
    }

    @Override // X.C18Z, android.app.Dialog
    public void onStop() {
        super.onStop();
        AnonymousClass149.LIZ.LJ(this);
    }

    public DialogC47081t2(Context context) {
        super(context);
    }

    public DialogC47081t2(Context context, int i) {
        super(context, i);
    }
}
