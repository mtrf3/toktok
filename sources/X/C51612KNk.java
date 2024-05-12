package X;

import Y.ACListenerS25S0201000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KNk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51612KNk extends ScrollView implements InterfaceC51613KNl, InterfaceC50172Jma {
    public C50259Jnz LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public LinearLayout LJLJJI;
    public ImageView LJLJJL;
    public DmtTextView LJLJJLL;
    public DmtTextView LJLJL;
    public DmtTextView LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public View.OnClickListener LJZL;
    public int LL;

    public final void LJIIIIZZ() {
        int i;
        int color;
        int color2;
        int i2;
        int color3;
        int color4;
        int color5;
        if (this.LJLJJI == null || this.LJLIL == null) {
            return;
        }
        Resources resources = getResources();
        DmtTextView dmtTextView = this.LJLJJLL;
        if (dmtTextView != null) {
            if (this.LJLIL.LJIILIIL) {
                if (this.LL == 0) {
                    color5 = resources.getColor(R.color.cs);
                } else {
                    color5 = resources.getColor(R.color.be);
                }
                dmtTextView.setTextColor(color5);
            } else {
                if (this.LL == 0) {
                    color4 = resources.getColor(R.color.ck);
                } else {
                    color4 = resources.getColor(R.color.bd);
                }
                dmtTextView.setTextColor(color4);
            }
        }
        DmtTextView dmtTextView2 = this.LJLJL;
        if (dmtTextView2 != null) {
            if (this.LL == 0) {
                color3 = resources.getColor(R.color.cs);
            } else {
                color3 = resources.getColor(R.color.be);
            }
            dmtTextView2.setTextColor(color3);
        }
        DmtTextView dmtTextView3 = this.LJLJLJ;
        if (dmtTextView3 != null) {
            EnumC50262Jo2 enumC50262Jo2 = this.LJLIL.LJI;
            EnumC50262Jo2 enumC50262Jo22 = EnumC50262Jo2.SOLID;
            if (enumC50262Jo2 == enumC50262Jo22) {
                if (this.LL == 0) {
                    i2 = R.drawable.ddm;
                } else {
                    i2 = R.drawable.ddl;
                }
                dmtTextView3.setBackgroundResource(i2);
            } else {
                if (this.LL == 0) {
                    i = R.drawable.ddk;
                } else {
                    i = R.drawable.ddi;
                }
                dmtTextView3.setBackgroundResource(i);
            }
            if (this.LJLIL.LJI == enumC50262Jo22) {
                if (this.LL == 0) {
                    color2 = resources.getColor(R.color.bc);
                } else {
                    color2 = resources.getColor(R.color.ar);
                }
                dmtTextView3.setTextColor(color2);
                return;
            }
            if (this.LL == 0) {
                color = resources.getColor(R.color.ck);
            } else {
                color = resources.getColor(R.color.bd);
            }
            dmtTextView3.setTextColor(color);
        }
    }

    public final void LIZJ() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            if (i >= 0) {
                this.LJLILLLLZI = i;
            } else if (i != -2) {
            } else {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    public final void LJ() {
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.m4n);
        this.LJLJL = dmtTextView;
        C50259Jnz c50259Jnz = this.LJLIL;
        if (c50259Jnz.LJIIJJI) {
            dmtTextView.setText(c50259Jnz.LJFF);
            if (this.LJLIL.LJIIL) {
                this.LJLJL.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public final void LJFF() {
        int i;
        LIZJ();
        C50259Jnz c50259Jnz = this.LJLIL;
        if (c50259Jnz == null || (i = this.LJLILLLLZI) < this.LJLJLLL) {
            return;
        }
        if (c50259Jnz.LJIIIZ) {
            int i2 = (int) ((i * 0.2f) + 0.5f);
            LJIIIZ(i2, this.LJLJJL);
            if (this.LJLIL.LJIILJJIL) {
                setButtonMargin((((((((this.LJLILLLLZI - i2) - this.LJLLLLLL) - this.LJLL) - LIZLLL(this.LJLJJLL)) - this.LJLLI) - LIZLLL(this.LJLJL)) - this.LJLLJ) - this.LJLLILLLL);
            }
        } else if (c50259Jnz.LJIIJ) {
            int i3 = (int) ((i * 0.3f) + 0.5f);
            LJIIIZ(i3, this.LJLJJLL);
            if (this.LJLIL.LJIILJJIL) {
                setButtonMargin((((((this.LJLILLLLZI - i3) - LIZLLL(this.LJLJJLL)) - this.LJLLI) - LIZLLL(this.LJLJL)) - this.LJLLJ) - this.LJLLILLLL);
            }
        } else {
            LJIIIZ((int) ((i * 0.3f) + 0.5f), this.LJLJL);
        }
        this.LJLJL.requestLayout();
    }

    public final void LJI() {
        DmtTextView dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.mo6);
        this.LJLJJLL = dmtTextView2;
        C50259Jnz c50259Jnz = this.LJLIL;
        if (c50259Jnz.LJIIJ) {
            dmtTextView2.setText(c50259Jnz.LJ);
        }
        if (this.LJLIL.LJIILIIL) {
            C023107f.LJII(this.LJLJJLL, R.style.a6p);
        }
        C50259Jnz c50259Jnz2 = this.LJLIL;
        if (c50259Jnz2.LJIILJJIL) {
            LinearLayout linearLayout = this.LJLJJI;
            if (c50259Jnz2.LJI == EnumC50262Jo2.SOLID) {
                dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.a6o), null);
            } else {
                dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.a6n), null);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJLLL, this.LJLLJ);
            layoutParams.gravity = 1;
            linearLayout.addView(dmtTextView, layoutParams);
            dmtTextView.setText(c50259Jnz2.LJII);
            dmtTextView.setFontType("medium");
            dmtTextView.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0201000_8(0, this, c50259Jnz2.LJIIIIZZ, 5)));
            this.LJLJLJ = dmtTextView;
        }
        LJ();
    }

    public final void LJII() {
        ViewGroup.LayoutParams layoutParams;
        LIZJ();
        removeAllViews();
        setScrollY(0);
        C50259Jnz c50259Jnz = this.LJLIL;
        if (c50259Jnz == null || this.LJLILLLLZI < this.LJLJLLL) {
            return;
        }
        if (c50259Jnz.LJIIIZ) {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bix, this, true);
            this.LJLJJI = (LinearLayout) findViewById(R.id.fk6);
            ImageView imageView = (ImageView) findViewById(R.id.f2l);
            this.LJLJJL = imageView;
            imageView.setImageDrawable(C04270Et.LIZIZ(getContext(), this.LJLIL.LIZ));
            LJI();
            LIZIZ(this.LJLJJI);
            C50259Jnz c50259Jnz2 = this.LJLIL;
            if (c50259Jnz2.LIZJ > 0 && c50259Jnz2.LIZLLL > 0 && (layoutParams = this.LJLJJL.getLayoutParams()) != null) {
                C50259Jnz c50259Jnz3 = this.LJLIL;
                layoutParams.height = c50259Jnz3.LIZLLL;
                layoutParams.width = c50259Jnz3.LIZJ;
                this.LJLJJL.setLayoutParams(layoutParams);
            }
        } else if (c50259Jnz.LJIIJ) {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.biw, this, true);
            this.LJLJJI = (LinearLayout) findViewById(R.id.fk6);
            LJI();
            LIZIZ(this.LJLJJI);
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.biv, this, true);
            this.LJLJJI = (LinearLayout) findViewById(R.id.fk6);
            LJ();
            LIZIZ(this.LJLJJI);
        }
        View.OnClickListener onClickListener = this.LJZL;
        if (onClickListener != null) {
            C16880lQ.LJIIZILJ(this.LJLJJI, onClickListener);
        }
        this.LJLZ = true;
        LJIIIIZZ();
        Boolean valueOf = Boolean.valueOf(this.LJZ);
        this.LJZ = valueOf.booleanValue();
        if (valueOf.booleanValue()) {
            DmtTextView dmtTextView = this.LJLJJLL;
            if (dmtTextView != null) {
                dmtTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, getContext()));
            }
            DmtTextView dmtTextView2 = this.LJLJL;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, getContext()));
            }
            DmtTextView dmtTextView3 = this.LJLJLJ;
            if (dmtTextView3 != null) {
                if (this.LJLIL.LJI == EnumC50262Jo2.SOLID) {
                    dmtTextView3.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.ddl));
                } else {
                    dmtTextView3.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.ddj));
                }
                this.LJLJLJ.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, getContext()));
            }
        }
        if (C16310kV.LIZLLL(this) == 1) {
            setLayoutDirection(0);
            this.LJLJJI.setLayoutDirection(1);
        }
        LJFF();
    }

    public C51612KNk(Context context) {
        super(context, null, 0);
        LIZJ();
        Resources resources = getContext().getResources();
        this.LJLJLLL = resources.getDimensionPixelSize(R.dimen.lm);
        this.LJLL = resources.getDimensionPixelSize(R.dimen.lp);
        this.LJLLI = resources.getDimensionPixelSize(R.dimen.le);
        this.LJLLILLLL = resources.getDimensionPixelSize(R.dimen.ln);
        this.LJLLL = resources.getDimensionPixelSize(R.dimen.ld);
        this.LJLLJ = resources.getDimensionPixelSize(R.dimen.lb);
        this.LJLLLL = resources.getDimensionPixelSize(R.dimen.r8);
        this.LJLLLLLL = resources.getDimensionPixelSize(R.dimen.lh);
    }

    private void setButtonMargin(int i) {
        int i2 = this.LJLLILLLL;
        if (i < i2) {
            LJIIIZ(i2, this.LJLJLJ);
            return;
        }
        int i3 = (int) ((this.LJLILLLLZI * 0.2f) + 0.5f);
        if (i3 < i2) {
            LJIIIZ(i, this.LJLJLJ);
            return;
        }
        int i4 = i - (i3 - i2);
        if (i4 > i2) {
            LJIIIZ(i4, this.LJLJLJ);
        } else {
            LJIIIZ(i2, this.LJLJLJ);
        }
    }

    @Override // X.InterfaceC51613KNl
    public final void LIZ(int i) {
        if (this.LL != i) {
            this.LL = i;
            LJIIIIZZ();
        }
    }

    public final void LIZIZ(LinearLayout linearLayout) {
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.LJLLILLLL));
    }

    public final int LIZLLL(DmtTextView dmtTextView) {
        dmtTextView.measure(View.MeasureSpec.makeMeasureSpec(this.LJLJI - (this.LJLLLL * 2), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
        return dmtTextView.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJZL = onClickListener;
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, onClickListener);
        }
    }

    @Override // X.InterfaceC50172Jma
    public void setStatus(C50259Jnz c50259Jnz) {
        if (c50259Jnz == null) {
            return;
        }
        this.LJLIL = c50259Jnz;
        if (!c50259Jnz.LJIILJJIL || (c50259Jnz.LJIIJ && c50259Jnz.LJIIJJI)) {
            if (c50259Jnz.LJIIJ) {
                if (TextUtils.isEmpty(c50259Jnz.LJ)) {
                    throw new IllegalArgumentException("title text should not be empty String!");
                }
            } else if (c50259Jnz.LJIIJJI) {
                if (!TextUtils.isEmpty(c50259Jnz.LJFF)) {
                    if (this.LJLIL.LJIIIZ) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                } else {
                    throw new IllegalArgumentException("desc text should not be empty String!");
                }
            }
            this.LJLZ = false;
            if (this.LJLILLLLZI > 0) {
                LJII();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("button must with title and description!");
    }

    public final void LJIIIZ(int i, View view) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI != i2 || this.LJLJI != i) {
            this.LJLJI = i;
            this.LJLILLLLZI = i2;
            LinearLayout linearLayout = this.LJLJJI;
            if (linearLayout == null) {
                if (this.LJLIL != null) {
                    if (this.LJLZ) {
                        LJFF();
                        return;
                    } else {
                        LJII();
                        return;
                    }
                }
                return;
            }
            linearLayout.post(new ARunnableS44S0100000_8(this, 148));
        }
    }
}
