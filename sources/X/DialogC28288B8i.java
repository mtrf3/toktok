package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.B8i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC28288B8i extends DialogC38611fN {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public B7O LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void onStart() {
        super.onStart();
    }

    public DialogC28288B8i(Context context) {
        super(context);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 186));
        this.LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 189));
        this.LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 188));
        this.LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 187));
        this.LJLJL = "";
        this.LJLJLJ = "";
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            C28289B8j.LIZIZ(0, window3);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setGravity(17);
        }
        setCanceledOnTouchOutside(false);
        super.onCreate(bundle);
        setContentView(R.layout.cy9);
        C16880lQ.LJJIIZ((C47121t6) this.LJLILLLLZI.getValue(), new ACListenerS25S0100000_5(this, 127));
        C16880lQ.LJJIIZ((C47121t6) this.LJLJI.getValue(), new ACListenerS25S0100000_5(this, 128));
        ((TextView) this.LJLJJI.getValue()).setText(this.LJLJL);
        ((TextView) this.LJLJJL.getValue()).setText(this.LJLJLJ);
    }
}
