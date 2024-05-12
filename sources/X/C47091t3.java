package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1t3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C47091t3 extends C45071pn {
    public C41081jM LJLJJI;
    public C41081jM LJLJJL;
    public TextView LJLJJLL;
    public C54852Dh LJLJL;

    public void setIcon(Drawable drawable) {
        this.LJLJJI.setImageDrawable(drawable);
        if (drawable == null) {
            this.LJLJJI.setVisibility(8);
            this.LJLJJLL.setGravity(17);
        } else {
            this.LJLJJI.setVisibility(0);
            this.LJLJJLL.setGravity(8388611);
        }
    }

    public void setIconCenter(Drawable drawable) {
        this.LJLJJL.setImageDrawable(drawable);
        if (drawable == null) {
            this.LJLJJL.setVisibility(8);
        } else {
            this.LJLJJL.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.LJLJJLL.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams.width = -2;
                ((LinearLayout.LayoutParams) layoutParams).weight = 0.0f;
                setGravity(17);
                this.LJLJJLL.setLayoutParams(layoutParams);
            }
        }
        this.LJLJJLL.setGravity(17);
    }

    public void setText(int i) {
        this.LJLJJLL.setText(i);
    }

    public void setIcon(int i) {
        setIcon(C20110qd.LIZ(getContext(), i));
    }

    public void setText(CharSequence charSequence) {
        this.LJLJJLL.setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.28b, X.2Dh] */
    public C47091t3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ap_);
        LinearLayout.inflate(getContext(), R.layout.bpj, this);
        this.LJLJJI = (C41081jM) findViewById(R.id.fus);
        this.LJLJJL = (C41081jM) findViewById(R.id.fut);
        this.LJLJJLL = (TextView) findViewById(R.id.fuu);
        ?? r1 = new AbstractC534928b<C47091t3>(this) { // from class: X.2Dh
            @Override // X.QXX
            public final int[] LLLLLLL() {
                return new int[]{android.R.attr.textAppearance, android.R.attr.orientation, android.R.attr.background, android.R.attr.padding, android.R.attr.text, R.attr.ag7, R.attr.aog, R.attr.ap9};
            }

            {
                super(this);
            }

            @Override // X.AbstractC534928b
            public final void LLLLZIL(TypedArray typedArray) {
                int indexCount = typedArray.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArray.getIndex(i);
                    if (index == 0) {
                        int resourceId = typedArray.getResourceId(index, 0);
                        if (resourceId != 0) {
                            C023107f.LJII(((C47091t3) this.LJLIL).LJLJJLL, resourceId);
                        }
                    } else if (index == 6) {
                        C023107f.LJFF(((C47091t3) this.LJLIL).LJLJJLL, typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == 7) {
                        ColorStateList LJIILLIIL = C1DF.LJIILLIIL(this.LJLIL.getContext(), typedArray, index);
                        if (LJIILLIIL != null) {
                            C07S.LIZ(((C47091t3) this.LJLIL).LJLJJI, LJIILLIIL);
                            ((C47091t3) this.LJLIL).LJLJJLL.setTextColor(LJIILLIIL);
                        }
                    } else if (index == 3) {
                        int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                        this.LJLIL.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    } else if (index == 1) {
                        ((LinearLayout) this.LJLIL).setOrientation(typedArray.getInt(index, -1));
                    } else if (index == 2) {
                        C16300kU.LJIILLIIL(this.LJLIL, typedArray.getDrawable(index));
                    } else if (index == 5) {
                        int resourceId2 = typedArray.getResourceId(index, 0);
                        if (resourceId2 != 0) {
                            T t = this.LJLIL;
                            ((C47091t3) t).setIcon(C20110qd.LIZ(t.getContext(), resourceId2));
                        } else {
                            ((C47091t3) this.LJLIL).setIcon((Drawable) null);
                        }
                    } else if (index == 4) {
                        ((C47091t3) this.LJLIL).setText(C16880lQ.LLLZZ(typedArray, index));
                    }
                }
            }

            @Override // X.AbstractC534928b
            public final void LLLLZLLLI(AttributeSet attributeSet2, int i, int i2) {
                super.LLLLZLLLI(attributeSet2, R.attr.ap_, 0);
            }
        };
        this.LJLJL = r1;
        r1.LLLLZLLLI(attributeSet, R.attr.ap_, 0);
    }
}
