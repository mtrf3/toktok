package X;

import Y.ACListenerS30S0101000_13;
import Y.ACListenerS33S0100000_13;
import Y.IDObjectS184S0100000_13;
import android.content.Context;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UHL extends U2M {
    public final UHN LJLJJL;
    public final int LJLJJLL;
    public final OSZ<Integer, Integer> LJLJL;
    public final int LJLJLJ;
    public C47121t6 LJLJLLL;
    public LiveEditText LJLL;
    public C47121t6 LJLLI;
    public C2A7 LJLLILLLL;
    public C2A7 LJLLJ;
    public C2A7 LJLLL;
    public C2A7 LJLLLL;
    public C2A7 LJLLLLLL;
    public C2A7 LJLZ;
    public C2A7 LJZ;
    public C2A7 LJZI;
    public C2A7 LJZL;
    public C2A7 LL;
    public C2A7 LLD;
    public C2A7 LLF;
    public final UHM LLFF;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz6;
    }

    public final void LJJIJ() {
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.ndp, this.LJLJL.getSecond()));
        }
        C47121t6 c47121t62 = this.LJLLI;
        if (c47121t62 != null) {
            C87277YNd.LJJIJ(c47121t62);
        }
        C2A7 c2a7 = this.LJLLJ;
        if (c2a7 == null) {
            return;
        }
        c2a7.setEnabled(false);
    }

    public final void LJJIJIIJI() {
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.ndq, this.LJLJL.getFirst()));
        }
        C47121t6 c47121t62 = this.LJLLI;
        if (c47121t62 != null) {
            C87277YNd.LJJIJ(c47121t62);
        }
        C2A7 c2a7 = this.LJLLJ;
        if (c2a7 == null) {
            return;
        }
        c2a7.setEnabled(false);
    }

    @Override // X.U2M
    public final void LJJIIJZLJL() {
        this.LJLJLLL = (C47121t6) findViewById(R.id.coh);
        this.LJLJJI = findViewById(R.id.cj9);
        this.LJLL = (LiveEditText) findViewById(R.id.cj_);
        this.LJLLILLLL = (C2A7) findViewById(R.id.cj8);
        this.LJLLI = (C47121t6) findViewById(R.id.cja);
        this.LJLLJ = (C2A7) findViewById(R.id.cjb);
        this.LJLLL = (C2A7) findViewById(R.id.ciy);
        this.LJLLLL = (C2A7) findViewById(R.id.ciz);
        this.LJLLLLLL = (C2A7) findViewById(R.id.cj0);
        this.LJLZ = (C2A7) findViewById(R.id.cj1);
        this.LJZ = (C2A7) findViewById(R.id.cj2);
        this.LJZI = (C2A7) findViewById(R.id.cj3);
        this.LJZL = (C2A7) findViewById(R.id.cj4);
        this.LL = (C2A7) findViewById(R.id.cj5);
        this.LLD = (C2A7) findViewById(R.id.cj6);
        this.LLF = (C2A7) findViewById(R.id.cj7);
        LiveEditText liveEditText = this.LJLL;
        if (liveEditText != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJL.getFirst().intValue());
            LIZ.append(" - ");
            LIZ.append(this.LJLJL.getSecond().intValue());
            liveEditText.setHint(X1D.LIZIZ(LIZ));
            liveEditText.requestFocus();
            liveEditText.setShowSoftInputOnFocus(false);
            liveEditText.setLongClickable(false);
            liveEditText.setClickable(false);
            liveEditText.setTextIsSelectable(false);
            liveEditText.setCustomSelectionActionModeCallback(this.LLFF);
            liveEditText.addTextChangedListener(new IDObjectS184S0100000_13(this, 2));
            LJJIIZI(String.valueOf(this.LJLJJLL));
        }
        LJJIIZ(this.LJLLL, 0);
        LJJIIZ(this.LJLLLL, 1);
        LJJIIZ(this.LJLLLLLL, 2);
        LJJIIZ(this.LJLZ, 3);
        LJJIIZ(this.LJZ, 4);
        LJJIIZ(this.LJZI, 5);
        LJJIIZ(this.LJZL, 6);
        LJJIIZ(this.LL, 7);
        LJJIIZ(this.LLD, 8);
        LJJIIZ(this.LLF, 9);
        C2A7 c2a7 = this.LJLLILLLL;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 186));
        }
        C2A7 c2a72 = this.LJLLJ;
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new ACListenerS33S0100000_13(this, 185));
        }
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setText(C15380j0.LJIILJJIL(this.LJLJLJ));
    }

    public final void LJJIIZI(String str) {
        LiveEditText liveEditText = this.LJLL;
        if (liveEditText != null) {
            liveEditText.setText(str);
            liveEditText.setSelection(String.valueOf(liveEditText.getText()).length());
        }
    }

    public final void LJJIIZ(C2A7 c2a7, int i) {
        if (c2a7 == null) {
            return;
        }
        c2a7.setText(String.valueOf(i));
        C16880lQ.LJJIII(c2a7, new ACListenerS30S0101000_13(i, this, 8));
    }

    public UHL(Context context, UHN uhn, int i, OSZ<Integer, Integer> osz, int i2) {
        super(context, 5);
        this.LJLJJL = uhn;
        this.LJLJJLL = i;
        this.LJLJL = osz;
        this.LJLJLJ = i2;
        this.LLFF = new UHM();
    }
}
