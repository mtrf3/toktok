package X;

import android.content.Context;

/* renamed from: X.1fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC38611fN extends C14D {
    public boolean LJLIL;

    @Override // android.app.Dialog
    public void show() {
        if ((AnonymousClass149.LIZ.LIZLLL() && !this.LJLIL) || new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "6450193670654449387")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        AnonymousClass149.LIZ.LIZ(this);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        AnonymousClass149.LIZ.LJ(this);
    }

    public DialogC38611fN(Context context) {
        super(context);
    }

    public DialogC38611fN(Context context, C38601fM<?> c38601fM) {
        super(context);
        if (c38601fM != null) {
            this.LJLIL = c38601fM.LIZIZ;
        }
    }

    public DialogC38611fN(Context context, int i) {
        super(context, i);
    }
}
