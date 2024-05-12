package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* renamed from: X.1hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40041hg extends C1AJ {
    public C45611qf LJLJI;

    @Override // X.C1AJ, X.AbstractC019505v
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.LJLJI = new C45611qf();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, com.zhiliaoapp.musically.R.attr.xw, com.zhiliaoapp.musically.R.attr.xx, com.zhiliaoapp.musically.R.attr.xy, com.zhiliaoapp.musically.R.attr.a1p, com.zhiliaoapp.musically.R.attr.a6s, com.zhiliaoapp.musically.R.attr.a6v, com.zhiliaoapp.musically.R.attr.a6w, com.zhiliaoapp.musically.R.attr.adm, com.zhiliaoapp.musically.R.attr.adn, com.zhiliaoapp.musically.R.attr.ado, com.zhiliaoapp.musically.R.attr.adp, com.zhiliaoapp.musically.R.attr.adq, com.zhiliaoapp.musically.R.attr.adr, com.zhiliaoapp.musically.R.attr.ads, com.zhiliaoapp.musically.R.attr.adt, com.zhiliaoapp.musically.R.attr.adu, com.zhiliaoapp.musically.R.attr.adv, com.zhiliaoapp.musically.R.attr.adw, com.zhiliaoapp.musically.R.attr.adx, com.zhiliaoapp.musically.R.attr.ady, com.zhiliaoapp.musically.R.attr.ae0, com.zhiliaoapp.musically.R.attr.ae1, com.zhiliaoapp.musically.R.attr.ae2, com.zhiliaoapp.musically.R.attr.ae3, com.zhiliaoapp.musically.R.attr.ae4, com.zhiliaoapp.musically.R.attr.akw, com.zhiliaoapp.musically.R.attr.alr, com.zhiliaoapp.musically.R.attr.als, com.zhiliaoapp.musically.R.attr.alt, com.zhiliaoapp.musically.R.attr.alu, com.zhiliaoapp.musically.R.attr.alv, com.zhiliaoapp.musically.R.attr.alw, com.zhiliaoapp.musically.R.attr.alx, com.zhiliaoapp.musically.R.attr.aly, com.zhiliaoapp.musically.R.attr.alz, com.zhiliaoapp.musically.R.attr.am0, com.zhiliaoapp.musically.R.attr.am1, com.zhiliaoapp.musically.R.attr.am2, com.zhiliaoapp.musically.R.attr.am3, com.zhiliaoapp.musically.R.attr.am4, com.zhiliaoapp.musically.R.attr.am5, com.zhiliaoapp.musically.R.attr.am6, com.zhiliaoapp.musically.R.attr.am7, com.zhiliaoapp.musically.R.attr.am8, com.zhiliaoapp.musically.R.attr.am9, com.zhiliaoapp.musically.R.attr.am_, com.zhiliaoapp.musically.R.attr.ama, com.zhiliaoapp.musically.R.attr.amb, com.zhiliaoapp.musically.R.attr.amc, com.zhiliaoapp.musically.R.attr.amd, com.zhiliaoapp.musically.R.attr.ame, com.zhiliaoapp.musically.R.attr.amf, com.zhiliaoapp.musically.R.attr.amg, com.zhiliaoapp.musically.R.attr.amh, com.zhiliaoapp.musically.R.attr.ami, com.zhiliaoapp.musically.R.attr.amj, com.zhiliaoapp.musically.R.attr.amk, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.amm, com.zhiliaoapp.musically.R.attr.amn, com.zhiliaoapp.musically.R.attr.amo, com.zhiliaoapp.musically.R.attr.amp, com.zhiliaoapp.musically.R.attr.amq, com.zhiliaoapp.musically.R.attr.amr, com.zhiliaoapp.musically.R.attr.ams, com.zhiliaoapp.musically.R.attr.amt, com.zhiliaoapp.musically.R.attr.amu, com.zhiliaoapp.musically.R.attr.amv, com.zhiliaoapp.musically.R.attr.amx, com.zhiliaoapp.musically.R.attr.amy, com.zhiliaoapp.musically.R.attr.an2, com.zhiliaoapp.musically.R.attr.an3, com.zhiliaoapp.musically.R.attr.an4, com.zhiliaoapp.musically.R.attr.an5, com.zhiliaoapp.musically.R.attr.an6, com.zhiliaoapp.musically.R.attr.an7, com.zhiliaoapp.musically.R.attr.ang});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.LJLJI.LJJIIZI = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C45611qf c45611qf = this.LJLJI;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c45611qf.LIZJ = dimensionPixelSize;
                    c45611qf.LIZLLL = dimensionPixelSize;
                    c45611qf.LJ = dimensionPixelSize;
                    c45611qf.LJFF = dimensionPixelSize;
                } else if (index == 11) {
                    C45611qf c45611qf2 = this.LJLJI;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c45611qf2.LJ = dimensionPixelSize2;
                    c45611qf2.LJI = dimensionPixelSize2;
                    c45611qf2.LJII = dimensionPixelSize2;
                } else if (index == 12) {
                    this.LJLJI.LJFF = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.LJLJI.LJI = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.LJLJI.LIZJ = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.LJLJI.LJII = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.LJLJI.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 38) {
                    this.LJLJI.LJJIIJZLJL = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 28) {
                    this.LJLJI.LJIILIIL = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 37) {
                    this.LJLJI.LJIILJJIL = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 22) {
                    this.LJLJI.LJIILL = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 30) {
                    this.LJLJI.LJIIZILJ = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 24) {
                    this.LJLJI.LJIILLIIL = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 32) {
                    this.LJLJI.LJIJ = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 26) {
                    this.LJLJI.LJIJI = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 21) {
                    this.LJLJI.LJIJJLI = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 29) {
                    this.LJLJI.LJJ = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 23) {
                    this.LJLJI.LJIL = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 31) {
                    this.LJLJI.LJJI = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 35) {
                    this.LJLJI.LJIJJ = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 25) {
                    this.LJLJI.LJJIII = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 34) {
                    this.LJLJI.LJJIIJ = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 27) {
                    this.LJLJI.LJJIFFI = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 36) {
                    this.LJLJI.LJJII = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 33) {
                    this.LJLJI.LJJIIZ = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.LJLJI;
        validateParams();
    }

    public void setFirstHorizontalBias(float f) {
        this.LJLJI.LJIJJLI = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.LJLJI.LJIILL = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.LJLJI.LJIL = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.LJLJI.LJIILLIIL = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.LJLJI.LJJIII = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.LJLJI.LJIJI = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.LJLJI.LJJIFFI = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.LJLJI.LJIILIIL = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.LJLJI.LJJIIZ = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.LJLJI.LJJIIZI = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C45611qf c45611qf = this.LJLJI;
        c45611qf.LIZJ = i;
        c45611qf.LIZLLL = i;
        c45611qf.LJ = i;
        c45611qf.LJFF = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.LJLJI.LIZLLL = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.LJLJI.LJI = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.LJLJI.LJII = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.LJLJI.LIZJ = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.LJLJI.LJJIIJ = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.LJLJI.LJIJJ = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.LJLJI.LJJII = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.LJLJI.LJIILJJIL = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.LJLJI.LJJIIJZLJL = i;
        requestLayout();
    }

    public C40041hg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC019505v, android.view.View
    public final void onMeasure(int i, int i2) {
        LJ(this.LJLJI, i, i2);
    }

    @Override // X.AbstractC019505v
    public final void resolveRtl(C018205i c018205i, boolean z) {
        C45611qf c45611qf = this.LJLJI;
        int i = c45611qf.LJ;
        if (i > 0 || c45611qf.LJFF > 0) {
            if (z) {
                c45611qf.LJI = c45611qf.LJFF;
                c45611qf.LJII = i;
            } else {
                c45611qf.LJI = i;
                c45611qf.LJII = c45611qf.LJFF;
            }
        }
    }

    @Override // X.C1AJ
    public final void LJ(C40071hj c40071hj, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c40071hj != null) {
            c40071hj.LJ(mode, size, mode2, size2);
            setMeasuredDimension(c40071hj.LJIIIZ, c40071hj.LJIIJ);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // X.AbstractC019505v
    public final void loadParameters(C019905z c019905z, C1AD c1ad, C018905p c018905p, SparseArray<C018205i> sparseArray) {
        super.loadParameters(c019905z, c1ad, c018905p, sparseArray);
        if (c1ad instanceof C45611qf) {
            C45611qf c45611qf = (C45611qf) c1ad;
            int i = c018905p.orientation;
            if (i != -1) {
                c45611qf.LJJIIZI = i;
            }
        }
    }
}
