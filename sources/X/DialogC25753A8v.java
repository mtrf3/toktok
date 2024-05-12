package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A8v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25753A8v extends Dialog {
    public C223338pd LJLIL;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "2490621742867292672")).LIZ) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC25753A8v(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.crp);
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        setCanceledOnTouchOutside(false);
        this.LJLIL = (C223338pd) findViewById(R.id.chy);
    }
}
