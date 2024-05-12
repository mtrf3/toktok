package androidx.appcompat.view.menu;

import X.AnonymousClass033;
import X.C02P;
import X.C16300kU;
import X.C16880lQ;
import X.C281618q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements C02P, AbsListView.SelectionBoundsAdjuster {
    public C281618q LJLIL;
    public ImageView LJLILLLLZI;
    public RadioButton LJLJI;
    public TextView LJLJJI;
    public CheckBox LJLJJL;
    public TextView LJLJJLL;
    public ImageView LJLJL;
    public ImageView LJLJLJ;
    public LinearLayout LJLJLLL;
    public final Drawable LJLL;
    public final int LJLLI;
    public final Context LJLLILLLL;
    public boolean LJLLJ;
    public final Drawable LJLLL;
    public final boolean LJLLLL;
    public LayoutInflater LJLLLLLL;
    public boolean LJLZ;

    private LayoutInflater getInflater() {
        if (this.LJLLLLLL == null) {
            this.LJLLLLLL = C16880lQ.LLZIL(getContext());
        }
        return this.LJLLLLLL;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C16300kU.LJIILLIIL(this, this.LJLL);
        TextView textView = (TextView) findViewById(R.id.title);
        this.LJLJJI = textView;
        int i = this.LJLLI;
        if (i != -1) {
            textView.setTextAppearance(this.LJLLILLLL, i);
        }
        this.LJLJJLL = (TextView) findViewById(R.id.jz5);
        ImageView imageView = (ImageView) findViewById(R.id.kph);
        this.LJLJL = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.LJLLL);
        }
        this.LJLJLJ = (ImageView) findViewById(R.id.dyz);
        this.LJLJLLL = (LinearLayout) findViewById(R.id.bst);
    }

    @Override // X.C02P
    public C281618q getItemData() {
        return this.LJLIL;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.LJLJL;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // X.C02P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C281618q r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.LJIIIIZZ(X.18q):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.LJLJLJ;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LJLJLJ.getLayoutParams();
            rect.top = this.LJLJLJ.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public void setCheckable(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        View view;
        if (!z && this.LJLJI == null && this.LJLJJL == null) {
            return;
        }
        if ((this.LJLIL.LJJ & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.LJLJI == null) {
                RadioButton radioButton = (RadioButton) C16880lQ.LLLLIILL(getInflater(), R.layout.d_, this, false);
                this.LJLJI = radioButton;
                LinearLayout linearLayout = this.LJLJLLL;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.LJLJI;
            view = this.LJLJJL;
        } else {
            if (this.LJLJJL == null) {
                CheckBox checkBox = (CheckBox) C16880lQ.LLLLIILL(getInflater(), R.layout.d7, this, false);
                this.LJLJJL = checkBox;
                LinearLayout linearLayout2 = this.LJLJLLL;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.LJLJJL;
            view = this.LJLJI;
        }
        if (z) {
            compoundButton.setChecked(this.LJLIL.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.LJLJJL;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.LJLJI;
        if (radioButton2 == null) {
            return;
        }
        radioButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        if ((this.LJLIL.LJJ & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.LJLJI == null) {
                RadioButton radioButton = (RadioButton) C16880lQ.LLLLIILL(getInflater(), R.layout.d_, this, false);
                this.LJLJI = radioButton;
                LinearLayout linearLayout = this.LJLJLLL;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.LJLJI;
        } else {
            if (this.LJLJJL == null) {
                CheckBox checkBox = (CheckBox) C16880lQ.LLLLIILL(getInflater(), R.layout.d7, this, false);
                this.LJLJJL = checkBox;
                LinearLayout linearLayout2 = this.LJLJLLL;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.LJLJJL;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.LJLZ = z;
        this.LJLLJ = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.LJLJLJ;
        if (imageView != null) {
            if (!this.LJLLLL && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        this.LJLIL.LJIILIIL.getClass();
        boolean z = this.LJLZ;
        if (!z && !this.LJLLJ) {
            return;
        }
        ImageView imageView = this.LJLILLLLZI;
        if (imageView == null && drawable == null && !this.LJLLJ) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) C16880lQ.LLLLIILL(getInflater(), R.layout.d8, this, false);
            this.LJLILLLLZI = imageView2;
            LinearLayout linearLayout = this.LJLJLLL;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable != null || this.LJLLJ) {
            ImageView imageView3 = this.LJLILLLLZI;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.LJLILLLLZI.getVisibility() != 0) {
                this.LJLILLLLZI.setVisibility(0);
                return;
            }
            return;
        }
        this.LJLILLLLZI.setVisibility(8);
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.LJLJJI.setText(charSequence);
            if (this.LJLJJI.getVisibility() != 0) {
                this.LJLJJI.setVisibility(0);
                return;
            }
            return;
        }
        if (this.LJLJJI.getVisibility() == 8) {
            return;
        }
        this.LJLJJI.setVisibility(8);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(getContext(), attributeSet, new int[]{android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, R.attr.b59, R.attr.bfe}, R.attr.aoz, 0);
        this.LJLL = LJIILIIL.LJ(5);
        this.LJLLI = LJIILIIL.LJIIIIZZ(1, -1);
        this.LJLLJ = LJIILIIL.LIZ(7, false);
        this.LJLLILLLL = context;
        this.LJLLL = LJIILIIL.LJ(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.aad, 0);
        this.LJLLLL = obtainStyledAttributes.hasValue(0);
        LJIILIIL.LJIILJJIL();
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLILLLLZI != null && this.LJLLJ) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.LJLILLLLZI.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }
}
