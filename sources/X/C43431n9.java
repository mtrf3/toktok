package X;

import Y.IDRunnableS6S0101000;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1n9 */
/* loaded from: classes.dex */
public final class C43431n9 extends C1K3 {
    public LiveIconView LJLJI;
    public ImageView LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public C2A7 LJLJL;
    public LinearLayout LJLJLJ;
    public View LJLJLLL;
    public int LJLL;

    public C43431n9() {
        throw null;
    }

    public static /* synthetic */ void LJJLJLI(C43431n9 c43431n9) {
        c43431n9.setLayoutMargin(c43431n9.LJLL);
    }

    public static /* synthetic */ void LJJLL(C43431n9 c43431n9) {
        c43431n9.setLayoutMargin(c43431n9.LJLL);
    }

    public void setLayoutMargin(int i) {
        int dimensionPixelSize;
        double d;
        float dimension;
        int measuredHeight = getMeasuredHeight();
        if (i == 0) {
            if (this.LJLJJI.getVisibility() == 0) {
                d = measuredHeight * 0.4d;
                dimension = getContext().getResources().getDimension(R.dimen.xn);
            } else {
                d = measuredHeight * 0.4d;
                dimension = getContext().getResources().getDimension(R.dimen.xl);
            }
            dimensionPixelSize = (int) (d - dimension);
            C018905p c018905p = (C018905p) this.LJLJL.getLayoutParams();
            c018905p.topToTop = 0;
            c018905p.topToBottom = -1;
            ((ViewGroup.MarginLayoutParams) c018905p).topMargin = (int) ((measuredHeight * 0.7d) + getContext().getResources().getDimensionPixelSize(R.dimen.xo));
            this.LJLJL.setLayoutParams(c018905p);
        } else {
            dimensionPixelSize = (int) ((measuredHeight * 0.4d) - ((getContext().getResources().getDimensionPixelSize(R.dimen.xp) + (this.LJLJL.getHeight() + (this.LJLJJLL.getHeight() + this.LJLJJL.getHeight()))) * 0.4d));
            C018905p c018905p2 = (C018905p) this.LJLJL.getLayoutParams();
            c018905p2.topToTop = -1;
            c018905p2.topToBottom = R.id.g3q;
            ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.xm);
            this.LJLJL.setLayoutParams(c018905p2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJLJ.getLayoutParams();
        marginLayoutParams.topMargin = dimensionPixelSize;
        this.LJLJLJ.setLayoutParams(marginLayoutParams);
    }

    public final void LJJZ(int i) {
        if (i == 0) {
            this.LJLJI.setVisibility(8);
            this.LJLJJI.setVisibility(8);
        } else if (i == 1) {
            this.LJLJI.setVisibility(0);
            this.LJLJJI.setVisibility(8);
        } else if (i == 2) {
            this.LJLJI.setVisibility(8);
            this.LJLJJI.setVisibility(0);
        }
        post(new IDRunnableS6S0101000(0, this, 30));
    }

    public void setButtonIcon(int i) {
        this.LJLJL.setIcon(i);
        this.LJLJL.setIconAutoMirrored(true);
    }

    public void setButtonStyle(int i) {
        this.LJLJL.LJJLL(i);
    }

    public void setButtonText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.LJLJL.setVisibility(8);
        } else {
            this.LJLJL.setText(charSequence);
            this.LJLJL.setVisibility(0);
        }
    }

    public void setIcon(int i) {
        boolean LIZIZ = C0TT.LIZ.LIZIZ(i, false);
        Drawable LIZ = C0TU.LIZ(i, getContext());
        LiveIconView liveIconView = this.LJLJI;
        if (liveIconView != null) {
            liveIconView.setIcon(LIZ);
            this.LJLJI.setIconAutoMirrored(LIZIZ);
        }
        if (LIZ == null) {
            LJJZ(0);
        } else {
            LJJZ(1);
        }
    }

    public void setIconAttr(int i) {
        setIcon(C259910h.LJ(i, getContext()));
    }

    public void setIconSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LJLJI.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
        this.LJLJI.setLayoutParams(layoutParams);
    }

    public void setIconTint(ColorStateList colorStateList) {
        LiveIconView liveIconView = this.LJLJI;
        if (liveIconView != null) {
            liveIconView.setIconTintList(colorStateList);
        }
    }

    public void setIllustration(Drawable drawable) {
        this.LJLJJI.setImageDrawable(drawable);
        if (drawable == null) {
            LJJZ(0);
        } else {
            LJJZ(2);
            C07810Sj.LJ(drawable, false);
        }
    }

    public void setLayoutType(int i) {
        this.LJLL = i;
        setLayoutMargin(i);
    }

    public void setMessage(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.LJLJJLL.setVisibility(8);
        } else {
            this.LJLJJLL.setText(charSequence);
            this.LJLJJLL.setVisibility(0);
        }
    }

    public void setMessageStyle(int i) {
        this.LJLJJLL.LJJIJIL(i);
    }

    public void setOnButtonClickListener(View.OnClickListener onClickListener) {
        C16880lQ.LJJIII(this.LJLJL, onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.LJLJJL.setVisibility(8);
        } else {
            this.LJLJJL.setText(charSequence);
            this.LJLJJL.setVisibility(0);
        }
    }

    public void setTitleStyle(int i) {
        this.LJLJJL.LJJIJIL(i);
    }

    public void setButtonIcon(Drawable drawable) {
        this.LJLJL.setIcon(drawable);
        this.LJLJL.setIconAutoMirrored(true);
    }

    public void setButtonText(int i) {
        setButtonText(getContext().getString(i));
    }

    public void setIcon(Drawable drawable) {
        LiveIconView liveIconView = this.LJLJI;
        if (liveIconView != null) {
            liveIconView.setIcon(drawable);
            this.LJLJI.setIconAutoMirrored(true);
        }
        if (drawable == null) {
            LJJZ(0);
        } else {
            LJJZ(1);
        }
    }

    public void setIllustration(int i) {
        setIllustration(C20110qd.LIZ(getContext(), i));
    }

    public void setMessage(int i) {
        setMessage(getContext().getString(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public C43431n9(C25600zU c25600zU, int i) {
        super(c25600zU, null, R.attr.ax1);
        ViewGroup.inflate(c25600zU, R.layout.bqm, this);
        this.LJLJI = (LiveIconView) findViewById(R.id.f51);
        this.LJLJJI = (ImageView) findViewById(R.id.f58);
        this.LJLJL = (C2A7) findViewById(R.id.au4);
        this.LJLJJL = (C47121t6) findViewById(R.id.mo6);
        this.LJLJJLL = (C47121t6) findViewById(R.id.mb7);
        this.LJLJLJ = (LinearLayout) findViewById(R.id.g3q);
        this.LJLJLLL = findViewById(R.id.g94);
        new AbstractC534928b<C43431n9>(this) { // from class: X.2HN
            @Override // X.QXX
            public final int[] LLLLLLL() {
                return new int[]{R.attr.a0f, R.attr.a0h, R.attr.a0k, R.attr.ag7, R.attr.agk, R.attr.ago, R.attr.ah1, R.attr.akz, R.attr.b0s, R.attr.b0t, R.attr.b0u, R.attr.bje, R.attr.bjo, R.attr.bjr};
            }

            {
                super(this);
            }

            @Override // X.AbstractC534928b
            public final void LLLLZIL(TypedArray typedArray) {
                TextView textView;
                ColorStateList LJIILLIIL;
                ColorStateList LJIILLIIL2;
                int indexCount = typedArray.getIndexCount();
                int i2 = 0;
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == 7) {
                        this.LJLIL.post(new C15O(typedArray.getInt(index, 0), i2, this));
                    } else if (index == 4) {
                        ((C43431n9) this.LJLIL).setIconSize(typedArray.getDimensionPixelSize(index, this.LJLIL.getContext().getResources().getDimensionPixelSize(R.dimen.xs)));
                    } else if (index == 6) {
                        ((C43431n9) this.LJLIL).setIllustration(typedArray.getResourceId(index, 0));
                    } else if (index == 3) {
                        int LJFF = C259910h.LJFF(this.LJLIL.getContext(), typedArray, index);
                        if (LJFF != -1) {
                            ((C43431n9) this.LJLIL).setIcon(LJFF);
                        } else {
                            ((C43431n9) this.LJLIL).setIcon((Drawable) null);
                        }
                    } else if (index == 5) {
                        ((C43431n9) this.LJLIL).setIconTint(C1DF.LJIILLIIL(this.LJLIL.getContext(), typedArray, index));
                    } else if (index == 11) {
                        ((C43431n9) this.LJLIL).setTitle(C16880lQ.LLLZLZ(typedArray, index));
                    } else if (index == 8) {
                        ((C43431n9) this.LJLIL).setMessage(C16880lQ.LLLZLZ(typedArray, index));
                    } else if (index == 1) {
                        ((C43431n9) this.LJLIL).setButtonText(C16880lQ.LLLZLZ(typedArray, index));
                    } else if (index == 0) {
                        int LJFF2 = C259910h.LJFF(this.LJLIL.getContext(), typedArray, index);
                        if (LJFF2 != -1) {
                            ((C43431n9) this.LJLIL).setButtonIcon(LJFF2);
                        } else {
                            ((C43431n9) this.LJLIL).setButtonIcon((Drawable) null);
                        }
                    } else if (index == 2) {
                        int resourceId = typedArray.getResourceId(index, 0);
                        if (resourceId != 0) {
                            ((C43431n9) this.LJLIL).setButtonStyle(resourceId);
                        }
                    } else if (index == 12) {
                        int resourceId2 = typedArray.getResourceId(index, 0);
                        if (resourceId2 != 0) {
                            ((C43431n9) this.LJLIL).setTitleStyle(resourceId2);
                        }
                    } else if (index == 9) {
                        int resourceId3 = typedArray.getResourceId(index, 0);
                        if (resourceId3 != 0) {
                            ((C43431n9) this.LJLIL).setMessageStyle(resourceId3);
                        }
                    } else if (index == 13) {
                        TextView textView2 = (TextView) this.LJLIL.findViewById(R.id.mo6);
                        if (textView2 != null && (LJIILLIIL2 = C1DF.LJIILLIIL(this.LJLIL.getContext(), typedArray, index)) != null) {
                            textView2.setTextColor(LJIILLIIL2);
                        }
                    } else if (index == 10 && (textView = (TextView) this.LJLIL.findViewById(R.id.mb7)) != null && (LJIILLIIL = C1DF.LJIILLIIL(this.LJLIL.getContext(), typedArray, index)) != null) {
                        textView.setTextColor(LJIILLIIL);
                    }
                }
            }
        }.LLLLZLLLI(null, R.attr.ax1, R.style.yu);
        post(new IDRunnableS6S0101000(0, this, 31));
    }
}
