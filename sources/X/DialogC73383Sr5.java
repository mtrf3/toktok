package X;

import Y.ACListenerS32S0100000_12;
import Y.IDObjectS183S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sr5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC73383Sr5 extends OOS {
    public final Context LJLJLLL;
    public final InterfaceC73385Sr7 LJLL;
    public final String LJLLI;
    public LiveIconView LJLLILLLL;
    public T5T LJLLJ;
    public C47121t6 LJLLL;
    public C2A7 LJLLLL;
    public final ACListenerS32S0100000_12 LJLLLLLL;

    @Override // android.app.Dialog
    public final void show() {
        InputMethodManager inputMethodManager;
        if (!new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "8517654101091428372")).LIZ) {
            super.show();
        }
        T5T t5t = this.LJLLJ;
        if (t5t != null) {
            t5t.setFocusable(true);
            t5t.setFocusableInTouchMode(true);
            t5t.requestFocus();
            Object LLILL = C16880lQ.LLILL(this.LJLJLLL, "input_method");
            if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
                inputMethodManager.showSoftInput(t5t, 2);
            }
        }
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Integer num;
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception unused) {
        }
        super.onCreate(bundle);
        setContentView(R.layout.d0r);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        this.LJLLILLLL = (LiveIconView) findViewById(R.id.eb1);
        this.LJLLJ = (T5T) findViewById(R.id.he4);
        this.LJLLL = (C47121t6) findViewById(R.id.btv);
        this.LJLLLL = (C2A7) findViewById(R.id.avw);
        LiveIconView liveIconView = this.LJLLILLLL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, this.LJLLLLLL);
        }
        C2A7 c2a7 = this.LJLLLL;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, this.LJLLLLLL);
        }
        C2A7 c2a72 = this.LJLLLL;
        if (c2a72 != null) {
            c2a72.setEnabled(false);
            c2a72.setClickable(false);
        }
        if (!TextUtils.isEmpty(this.LJLLI)) {
            T5T t5t = this.LJLLJ;
            if (t5t != null) {
                t5t.setText(this.LJLLI);
            }
            C47121t6 c47121t6 = this.LJLLL;
            if (c47121t6 != null) {
                StringBuilder LIZ = X1D.LIZ();
                String str = this.LJLLI;
                if (str != null) {
                    num = Integer.valueOf(str.length());
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append("/200");
                c47121t6.setText(X1D.LIZIZ(LIZ));
            }
        } else {
            C47121t6 c47121t62 = this.LJLLL;
            if (c47121t62 != null) {
                c47121t62.setText("0/200");
            }
        }
        T5T t5t2 = this.LJLLJ;
        if (t5t2 != null) {
            t5t2.addTextChangedListener(new IDObjectS183S0100000_12(this, 7));
        }
    }

    public DialogC73383Sr5(Context context, C73386Sr8 c73386Sr8, String str) {
        super(context, R.style.aa0);
        this.LJLJLLL = context;
        this.LJLL = c73386Sr8;
        this.LJLLI = str;
        this.LJLLLLLL = new ACListenerS32S0100000_12(this, 151);
    }
}
