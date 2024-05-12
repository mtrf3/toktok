package X;

import Y.ACListenerS25S0101000_7;
import Y.ACListenerS30S0101000_13;
import Y.ARunnableS10S0110000_4;
import Y.IDCListenerS10S0101000;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UaI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class DialogC77438UaI extends DialogC38611fN {
    public static final Float LLIZ = Float.valueOf(17.0f);
    public static final Float LLIZLLLIL;
    public static final Float LLJ;
    public static final Float LLJI;
    public Context LJLILLLLZI;
    public C47121t6 LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public CharSequence LJLJLLL;
    public ImageView LJLL;
    public ImageView LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public FrameLayout LJLZ;
    public FrameLayout LJZ;
    public FrameLayout LJZI;
    public FrameLayout LJZL;
    public FrameLayout LL;
    public C47161tA LLD;
    public CharSequence LLF;
    public CharSequence LLFF;
    public CharSequence LLFFF;
    public CharSequence LLFII;
    public String LLFZ;
    public String LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public DialogInterface.OnClickListener LLIIII;
    public DialogInterface.OnClickListener LLIIIILZ;
    public View.OnClickListener LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public int LLIIL;
    public DialogInterface.OnDismissListener LLIILII;
    public DialogInterface.OnShowListener LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public boolean LLILII;
    public View LLILIL;
    public View LLILL;
    public int LLILLIZIL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;

    public DialogC77438UaI() {
        throw null;
    }

    static {
        Float valueOf = Float.valueOf(15.0f);
        LLIZLLLIL = valueOf;
        LLJ = Float.valueOf(8.0f);
        LLJI = valueOf;
    }

    public final int LJJIIJ() {
        int LIZJ = (int) KL2.LIZJ(this.LJLILLLLZI, 310.0f);
        int LJIIJJI = (int) (KL2.LJIIJJI(this.LJLILLLLZI) * 0.8d);
        if (LJIIJJI > LIZJ) {
            return LIZJ;
        }
        return LJIIJJI;
    }

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void onStart() {
        int LIZJ;
        int LIZJ2;
        super.onStart();
        this.LLD.setAlpha(0.0f);
        this.LLILL.setVisibility(0);
        this.LJLJJI.setVisibility(0);
        this.LJLJJI.setTextIsSelectable(this.LLILLJJLI);
        if (!TextUtils.isEmpty(this.LJLJLLL)) {
            this.LJLJJI.setText(this.LJLJLLL);
        } else if (!TextUtils.isEmpty(this.LLFZ)) {
            this.LJLJJI.setText(this.LLFZ);
        } else {
            this.LLILL.setVisibility(8);
        }
        this.LJLJJI.setGravity(this.LLIIL);
        boolean isEmpty = TextUtils.isEmpty(this.LLF);
        Float f = LLIZ;
        if (!isEmpty) {
            this.LJLJI.setText(this.LLF);
            this.LJLJJI.setTextSize(1, LLIZLLLIL.floatValue());
            this.LJLJJI.setTextColor(C04330Ez.LIZIZ(this.LJLILLLLZI, R.color.cs));
        } else {
            this.LJLJJI.setTextSize(1, f.floatValue());
            this.LJLJJI.setTextColor(C04330Ez.LIZIZ(this.LJLILLLLZI, R.color.ck));
        }
        if (this.LLFF != null) {
            this.LJLJJL.setVisibility(0);
            this.LJLJJL.setText(this.LLFF);
            if (this.LLIIIJ != null) {
                this.LJLJJL.setTextColor(C04330Ez.LIZIZ(this.LJLILLLLZI, R.color.c7));
                C16880lQ.LJJIIZ(this.LJLJJL, this.LLIIIJ);
            }
            this.LJLJJL.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, this.LLII, 0);
        }
        this.LJLJL.setText(this.LLFFF);
        this.LJLZ.setBackgroundColor(0);
        if (TextUtils.isEmpty(this.LLFII)) {
            this.LJLJJLL.setVisibility(8);
            this.LJLLLL.setVisibility(8);
            this.LJLJL.setBackgroundResource(R.drawable.ddg);
        } else {
            this.LJLJJLL.setText(this.LLFII);
        }
        if (TextUtils.isEmpty(this.LLI)) {
            this.LJLJJLL.setTextColor(C04330Ez.LIZIZ(this.LJLILLLLZI, R.color.cs));
            C23010vJ.LJ(LiveChatShowDelayForHotLiveSetting.DEFAULT, this.LJLJJLL);
            this.LJLJLJ.setVisibility(8);
            this.LJLLLLLL.setVisibility(8);
        } else {
            this.LJLJLJ.setText(this.LLI);
        }
        if (TextUtils.isEmpty(this.LLF)) {
            this.LJLJI.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILL.getLayoutParams();
            if (this.LLILIL != null && this.LLIFFJFJJ <= 0) {
                layoutParams.topMargin = (int) KL2.LIZJ(this.LJLILLLLZI, 16.0f);
            } else {
                layoutParams.topMargin = (int) KL2.LIZJ(this.LJLILLLLZI, 24.0f);
            }
            this.LLILL.setLayoutParams(layoutParams);
            this.LJLJJI.setTextSize(1, 17.0f);
        }
        int i = this.LLIFFJFJJ;
        if (i > 0) {
            if (i == Integer.MAX_VALUE) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LJLL.getLayoutParams();
                layoutParams2.height = (int) (LJJIIJ() / this.LLILZIL);
                this.LJLL.setLayoutParams(layoutParams2);
                this.LJLL.setAdjustViewBounds(false);
                this.LJLL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C15490jB.LJ(this.LJLL, this.LLILLL, this.LLILZ);
            } else {
                this.LJLL.setImageResource(i);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, 0);
            this.LJLJI.setLayoutParams(marginLayoutParams);
        } else if (this.LLILIL != null) {
            this.LJLZ.setVisibility(8);
            this.LJZI.setVisibility(0);
            int i2 = this.LLIIZ;
            if (i2 == 0) {
                LIZJ = -2;
            } else {
                LIZJ = (int) KL2.LIZJ(this.LJLILLLLZI, i2);
            }
            int i3 = this.LLIL;
            if (i3 == 0) {
                LIZJ2 = -2;
            } else {
                LIZJ2 = (int) KL2.LIZJ(this.LJLILLLLZI, i3);
            }
            this.LJZL.addView(this.LLILIL, 0, new FrameLayout.LayoutParams(LIZJ, LIZJ2));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
            marginLayoutParams2.setMargins(0, (int) KL2.LIZJ(this.LJLILLLLZI, 16.0f), 0, 0);
            this.LJLJI.setLayoutParams(marginLayoutParams2);
        } else {
            this.LJLZ.setVisibility(8);
        }
        if (this.LJLLL != null) {
            this.LJLJI.setTextSize(1, f.floatValue());
            this.LL.setVisibility(0);
            this.LL.addView(this.LJLLL, 0, new FrameLayout.LayoutParams(-1, -2, 17));
        }
        if (!this.LLIIJLIL) {
            this.LJLJL.setEnabled(false);
        }
        setCancelable(this.LLILII);
        DialogInterface.OnDismissListener onDismissListener = this.LLIILII;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnShowListener onShowListener = this.LLIILZL;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        C16880lQ.LJJIIZ(this.LJLJJLL, new ACListenerS30S0101000_13(0, this, 1));
        C16880lQ.LJJIIZ(this.LJLJL, new ACListenerS30S0101000_13(0, this, 2));
        C16880lQ.LJJIIZ(this.LJLJLJ, new IDCListenerS10S0101000(1, this, 1));
        C16880lQ.LJIILLIIL(this.LJLLI, new IDCListenerS10S0101000(1, this, 2));
        try {
            LJJIIJZLJL(true, this.LLD);
            setContentView(this.LJLLILLLL);
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.acf);
                window.setBackgroundDrawableResource(R.color.cz);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.5f;
                window.addFlags(2);
                attributes.gravity = 1;
                attributes.width = LJJIIJ();
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        if (this.LLILII && this.LLILZLL) {
            C16880lQ.LJIIJ(new ACListenerS25S0101000_7(1, this, 4), findViewById(R.id.nk0));
        }
    }

    public DialogC77438UaI(Context context) {
        super(context);
        this.LLIIJLIL = true;
        this.LLILII = true;
        this.LLILLIZIL = -1;
        this.LLILZLL = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r9 > r4) goto L21;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC77438UaI.onCreate(android.os.Bundle):void");
    }

    public DialogC77438UaI(Context context, C77437UaH c77437UaH) {
        super(context, c77437UaH);
        this.LLIIJLIL = true;
        this.LLILII = true;
        this.LLILLIZIL = -1;
        this.LLILZLL = true;
    }

    public static void LJJIIJZLJL(boolean z, C47161tA c47161tA) {
        if (c47161tA == null) {
            return;
        }
        c47161tA.post(new ARunnableS10S0110000_4((Object) c47161tA, z, 5));
    }
}
