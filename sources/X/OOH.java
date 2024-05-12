package X;

import Y.ACListenerS30S0100000_10;
import Y.IDObjectS182S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OOH extends OOS {
    public final boolean LJLJLLL;
    public final String LJLL;
    public final OOK LJLLI;
    public final Long LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public View LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxIconView LJLZ;
    public T5T LJZ;
    public TuxTextView LJZI;
    public SY4 LJZL;
    public BottomSheetBehavior<View> LL;
    public String LLD;
    public String LLF;
    public final ACListenerS30S0100000_10 LLFF;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "7585616429822712547")).LIZ) {
            super.show();
        }
        T5T t5t = this.LJZ;
        if (t5t != null) {
            t5t.setFocusable(true);
            t5t.setFocusableInTouchMode(true);
            t5t.requestFocus();
            KeyboardUtils.LIZJ(t5t);
        }
        if (this.LJLJLLL) {
            C63110Opm.LIZIZ("show", C63100Opc.LIZLLL, this.LJLLILLLL, this.LJLLJ, this.LJLLL);
        }
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        if (this.LJLJLLL) {
            C63110Opm.LIZIZ(this.LLF, C63100Opc.LIZLLL, this.LJLLILLLL, this.LJLLJ, this.LJLLL);
        }
        this.LLD = "";
    }

    @Override // X.OOS, android.app.Dialog
    public final void onStart() {
        super.onStart();
        View findViewById = findViewById(R.id.c8m);
        if (findViewById != null) {
            findViewById.setBackground(null);
        }
        setOnShowListener(new OOI(this, findViewById));
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        if (this.LJLJLLL) {
            i = R.layout.a_n;
        } else {
            i = R.layout.aeu;
        }
        setContentView(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        this.LJLLLL = findViewById(R.id.hht);
        this.LJLLLLLL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLZ = (TuxIconView) findViewById(R.id.eb1);
        this.LJZ = (T5T) findViewById(R.id.he4);
        this.LJZI = (TuxTextView) findViewById(R.id.btv);
        this.LJZL = (SY4) findViewById(R.id.avw);
        TuxIconView tuxIconView = this.LJLZ;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, this.LLFF);
        }
        SY4 sy4 = this.LJZL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, this.LLFF);
        }
        SY4 sy42 = this.LJZL;
        if (sy42 != null) {
            sy42.setEnabled(false);
            sy42.setClickable(false);
        }
        TuxTextView tuxTextView = this.LJLLLLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(R.string.hg5);
        }
        TuxTextView tuxTextView2 = this.LJZI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("0/200");
        }
        T5T t5t = this.LJZ;
        if (t5t != null) {
            t5t.addTextChangedListener(new IDObjectS182S0100000_10(this, 2));
        }
        T5T t5t2 = this.LJZ;
        if (t5t2 != null) {
            t5t2.setText(this.LJLL);
        }
    }

    public OOH(Context context, boolean z, String str, OOK ook, Long l, String str2, String str3) {
        super(context, R.style.a6_);
        this.LJLJLLL = z;
        this.LJLL = str;
        this.LJLLI = ook;
        this.LJLLILLLL = l;
        this.LJLLJ = str2;
        this.LJLLL = str3;
        this.LLF = "click";
        this.LLFF = new ACListenerS30S0100000_10(this, 152);
    }
}
