package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A8x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25755A8x extends Dialog {
    public boolean LJLIL;
    public ProgressBar LJLILLLLZI;
    public TextView LJLJI;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "6433439732123326731")).LIZ) {
            super.show();
        }
        ProgressBar progressBar = this.LJLILLLLZI;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC25755A8x(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(false);
        boolean z = this.LJLIL;
        this.LJLIL = z;
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(0.5f);
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.0f);
            }
        }
        Window window3 = getWindow();
        if (window3 != null) {
            C28289B8j.LIZIZ(0, window3);
        }
        setContentView(R.layout.byt);
        this.LJLILLLLZI = (ProgressBar) findViewById(R.id.ib9);
        View findViewById = findViewById(R.id.gi3);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.message_text_mt)");
        this.LJLJI = (TextView) findViewById;
        String LIZ = C82951Wh1.LIZ("pipo_common_waiting_while_loading_short");
        TextView textView = this.LJLJI;
        if (textView != null) {
            textView.setText(LIZ);
        } else {
            o.LJIJI("msgTv");
            throw null;
        }
    }
}
