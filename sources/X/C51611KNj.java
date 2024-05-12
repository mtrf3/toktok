package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KNj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51611KNj extends LinearLayout implements InterfaceC51613KNl, InterfaceC50172Jma {
    public static final /* synthetic */ int LJLLI = 0;
    public LinearLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public ImageView LJLJI;
    public DmtTextView LJLJJI;
    public DmtTextView LJLJJL;
    public int LJLJJLL;
    public C50259Jnz LJLJL;
    public FrameLayout LJLJLJ;
    public DmtTextView LJLJLLL;
    public LinearLayout LJLL;

    public final void LIZIZ() {
        int color;
        int i;
        int color2;
        if (this.LJLIL == null || this.LJLJL == null) {
            return;
        }
        Resources resources = getResources();
        DmtTextView dmtTextView = this.LJLJJI;
        if (dmtTextView != null) {
            if (this.LJLJL.LJIILIIL) {
                if (this.LJLJJLL == 0) {
                    color2 = resources.getColor(R.color.cs);
                } else {
                    color2 = resources.getColor(R.color.be);
                }
                dmtTextView.setTextColor(color2);
            } else {
                if (this.LJLJJLL == 0) {
                    i = R.color.ck;
                } else {
                    i = R.color.bd;
                }
                dmtTextView.setTextColor(resources.getColor(i));
            }
        }
        DmtTextView dmtTextView2 = this.LJLJJL;
        if (dmtTextView2 != null) {
            if (this.LJLJJLL == 0) {
                color = resources.getColor(R.color.cs);
            } else {
                color = resources.getColor(R.color.be);
            }
            dmtTextView2.setTextColor(color);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLIL = (LinearLayout) findViewById(R.id.fk6);
        this.LJLILLLLZI = (FrameLayout) findViewById(R.id.fj3);
        this.LJLJI = (ImageView) findViewById(R.id.f2l);
        this.LJLJJI = (DmtTextView) findViewById(R.id.mo6);
        this.LJLJJL = (DmtTextView) findViewById(R.id.m4n);
        this.LJLJLJ = (FrameLayout) findViewById(R.id.dds);
        this.LJLJLLL = (DmtTextView) findViewById(R.id.cv6);
        this.LJLL = (LinearLayout) findViewById(R.id.cec);
        if (C16310kV.LIZLLL(this) == 1) {
            setLayoutDirection(0);
            this.LJLIL.setLayoutDirection(1);
        }
    }

    @Override // X.InterfaceC51613KNl
    public final void LIZ(int i) {
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            LIZIZ();
        }
    }

    public void setDocLayoutParams(LinearLayout.LayoutParams layoutParams) {
        this.LJLL.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC50172Jma
    public void setStatus(C50259Jnz c50259Jnz) {
        if (c50259Jnz == null) {
            return;
        }
        this.LJLJL = c50259Jnz;
        if (c50259Jnz.LJIIIZ) {
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJI.setImageDrawable(this.LJLJL.LIZIZ);
        } else {
            this.LJLILLLLZI.setVisibility(8);
        }
        C50259Jnz c50259Jnz2 = this.LJLJL;
        if (c50259Jnz2.LJIIJ) {
            this.LJLJJI.setText(c50259Jnz2.LJ);
        }
        if (this.LJLJL.LJIILIIL) {
            C023107f.LJII(this.LJLJJI, R.style.a6p);
        }
        C50259Jnz c50259Jnz3 = this.LJLJL;
        if (c50259Jnz3.LJIIJJI) {
            this.LJLJJL.setText(c50259Jnz3.LJFF);
            if (this.LJLJL.LJIIL) {
                this.LJLJJL.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        C50259Jnz c50259Jnz4 = this.LJLJL;
        if (c50259Jnz4.LJIILJJIL) {
            this.LJLJLLL.setText(c50259Jnz4.LJII);
            this.LJLJLJ.setVisibility(0);
            this.LJLJLLL.setVisibility(0);
            this.LJLJLLL.setOnClickListener(new ViewOnClickListenerC13880ga(this.LJLJL.LJIIIIZZ));
        }
        LIZIZ();
    }

    public C51611KNj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
