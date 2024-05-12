package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import o3.h0;

/* renamed from: X.1Gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30171Gj extends ConstraintLayout {
    public C0KV LJLIL;
    public C47121t6 LJLILLLLZI;
    public C47121t6 LJLJI;
    public LinearLayout LJLJJI;
    public View LJLJJL;
    public LiveIconView LJLJJLL;
    public LinearLayout LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public View LJLL;
    public C41041jI LJLLI;
    public List<? extends C0KK> LJLLILLLL;
    public List<C0KJ> LJLLJ;
    public List<C0KJ> LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;

    public final void LJJLJLI() {
        if (this.LJLJJI.getVisibility() == 0 || this.LJLJJLL.getVisibility() == 0) {
            this.LJLJJL.setVisibility(0);
        } else {
            this.LJLJJL.setVisibility(8);
        }
        C018905p c018905p = (C018905p) this.LJLIL.getLayoutParams();
        if (this.LJLJJI.getVisibility() == 8) {
            c018905p.startToStart = 0;
            c018905p.startToEnd = -1;
            C16530kr.LJII(c018905p, this.LJLLLLLL);
        } else {
            c018905p.startToStart = -1;
            c018905p.startToEnd = R.id.g48;
            C16530kr.LJII(c018905p, 0);
        }
        this.LJLIL.setLayoutParams(c018905p);
    }

    public void setEndList(List<? extends C0KJ> list) {
        if (this.LJLLL == null) {
            this.LJLLL = new ArrayList();
        }
        this.LJLLL.clear();
        if (list != null) {
            this.LJLLL.addAll(list);
        }
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout != null) {
            LJJLL(linearLayout, this.LJLLL);
        }
        this.LJLJLLL.setVisibility(8);
    }

    public void setEndTextButton(C0KL c0kl) {
        this.LJLJLLL.setText(c0kl.LIZIZ);
        LJJZ(this.LJLJLLL, c0kl.LIZ);
        C0YF.LIZ(c0kl.LIZLLL, this.LJLJLLL);
        setEndTextButtonEnable(c0kl.LIZJ);
        this.LJLJL.setVisibility(8);
        this.LJLJLLL.setVisibility(0);
    }

    public void setEndTextButtonEnable(boolean z) {
        this.LJLJLLL.setEnabled(z);
    }

    public void setFadingEdgeEnabled(boolean z) {
        C0KV c0kv = this.LJLIL;
        if (c0kv != null) {
            c0kv.setHorizontalFadingEdgeEnabled(z);
        }
        setClipChildren(z);
        setClipToPadding(z);
    }

    public void setSingleIcon(C0KJ c0kj) {
        if (c0kj == null) {
            this.LJLJJLL.setVisibility(8);
        } else {
            if (c0kj instanceof C30161Gi) {
                this.LJLJJLL.setIconAttr(c0kj.LIZ);
            } else {
                this.LJLJJLL.setIcon(c0kj.LIZ);
            }
            this.LJLJJLL.setIconTint(C259910h.LIZIZ(R.attr.bns, getContext()));
            View.OnClickListener onClickListener = c0kj.LIZIZ;
            if (onClickListener != null) {
                C0YF.LIZ(onClickListener, this.LJLJJLL);
            }
            this.LJLJJLL.setVisibility(0);
        }
        LJJLJLI();
    }

    public void setSingleIconAlpha(float f) {
        this.LJLJJLL.setAlpha(f);
    }

    public void setSingleIconClickable(boolean z) {
        this.LJLJJLL.setClickable(z);
    }

    public void setSingleIconRotation(float f) {
        this.LJLJJLL.setRotation(f);
    }

    public void setStartIconOffset(float f) {
        if (this.LJLJJI.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJJI.getLayoutParams();
            int i = (int) (this.LJLLLL * f);
            if (i != C16530kr.LIZJ(marginLayoutParams)) {
                C16530kr.LJII(marginLayoutParams, i);
                this.LJLJJI.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLIL.getLayoutParams();
        int i2 = (int) (((this.LJLLLL - this.LJLZ) * f) + this.LJLLLLLL);
        if (i2 == C16530kr.LIZJ(marginLayoutParams2)) {
            return;
        }
        C16530kr.LJII(marginLayoutParams2, i2);
        this.LJLIL.setLayoutParams(marginLayoutParams2);
    }

    public void setStartList(List<? extends C0KJ> list) {
        if (this.LJLLJ == null) {
            this.LJLLJ = new ArrayList();
        }
        this.LJLLJ.clear();
        if (list != null) {
            this.LJLLJ.addAll(list);
        }
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            LJJLL(linearLayout, this.LJLLJ);
            LJJLJLI();
        }
        this.LJLJLJ.setVisibility(8);
    }

    public void setStartTextButton(C0KL c0kl) {
        this.LJLJLJ.setText(c0kl.LIZIZ);
        LJJZ(this.LJLJLJ, c0kl.LIZ);
        C0YF.LIZ(c0kl.LIZLLL, this.LJLJLJ);
        setStartTextButtonEnable(c0kl.LIZJ);
        this.LJLJJI.setVisibility(8);
        LJJLJLI();
        this.LJLJLJ.setVisibility(0);
    }

    public void setStartTextButtonEnable(boolean z) {
        this.LJLJLJ.setEnabled(z);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.LJLILLLLZI.LJJIJIL(R.style.a45);
        this.LJLJI.setText(charSequence);
        if (!TextUtils.isEmpty(this.LJLILLLLZI.getText())) {
            this.LJLJI.setVisibility(0);
        }
        this.LJLIL.setVisibility(8);
        this.LJLLILLLL = null;
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.LJLILLLLZI.setText(charSequence);
        this.LJLILLLLZI.setVisibility(0);
        if (!TextUtils.isEmpty(this.LJLJI.getText())) {
            this.LJLJI.setVisibility(0);
        }
        this.LJLIL.setVisibility(8);
        this.LJLLILLLL = null;
    }

    public C30171Gj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJLL(LinearLayout linearLayout, List list) {
        if (list == null || list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        for (int i = 0; i < list.size() && i < 2; i++) {
            C0KJ c0kj = (C0KJ) ListProtector.get(list, i);
            LiveIconView liveIconView = new LiveIconView(getContext(), null);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.xu);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 17;
            liveIconView.setLayoutParams(layoutParams);
            if (c0kj instanceof C30161Gi) {
                liveIconView.setIconAttr(c0kj.LIZ);
            } else {
                liveIconView.setIcon(c0kj.LIZ);
            }
            c0kj.getClass();
            liveIconView.setIconTint(C259910h.LIZIZ(R.attr.bns, getContext()));
            FrameLayout frameLayout = new FrameLayout(getContext());
            int i2 = this.LJLLLL;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            frameLayout.addView(liveIconView);
            View.OnClickListener onClickListener = c0kj.LIZIZ;
            if (onClickListener != null) {
                C0YF.LIZ(onClickListener, frameLayout);
            }
            linearLayout.addView(frameLayout);
        }
    }

    public final void LJJZ(C47121t6 c47121t6, C0KM c0km) {
        if (c0km == C0KM.PRIMARY) {
            c47121t6.setTextColor(C04330Ez.LIZJ(R.color.aa8, getContext()));
        } else {
            c47121t6.setTextColor(C04330Ez.LIZJ(R.color.aa9, getContext()));
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(this.LJLILLLLZI.getMeasuredWidth(), this.LJLJI.getMeasuredWidth());
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(this);
        int measuredWidth = (getMeasuredWidth() - max) / 2;
        int max2 = Math.max(this.LJLJJL.getMeasuredWidth(), this.LJLJLJ.getMeasuredWidth());
        int max3 = Math.max(this.LJLJL.getMeasuredWidth(), this.LJLJLLL.getMeasuredWidth());
        if (max2 > measuredWidth || max3 > measuredWidth) {
            anonymousClass064.LJIIIZ(R.id.g6n, 6, R.id.ah2, 7, this.LJLZ);
            anonymousClass064.LJIIIZ(R.id.g6n, 7, R.id.ah6, 6, this.LJLZ);
        } else {
            anonymousClass064.LJIIIZ(R.id.g6n, 6, 0, 6, this.LJLLLLLL);
            anonymousClass064.LJIIIZ(R.id.g6n, 7, 0, 7, this.LJLLLLLL);
        }
        anonymousClass064.LIZIZ(this);
        if (this.LJLLILLLL == null) {
            return;
        }
        this.LJLILLLLZI.setVisibility(8);
        this.LJLJI.setVisibility(8);
        this.LJLJLJ.setVisibility(8);
        this.LJLJLLL.setVisibility(8);
        this.LJLIL.setVisibility(0);
        this.LJLIL.setTabMode(0);
    }

    public C30171Gj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        ViewGroup.inflate(context, R.layout.bqt, this);
        this.LJLLLLLL = getContext().getResources().getDimensionPixelSize(R.dimen.xi);
        this.LJLZ = getContext().getResources().getDimensionPixelSize(R.dimen.xk);
        this.LJLLLL = context.getResources().getDimensionPixelSize(R.dimen.xv);
        this.LJLIL = (C0KV) findViewById(R.id.kyt);
        this.LJLILLLLZI = (C47121t6) findViewById(R.id.mo6);
        this.LJLJI = (C47121t6) findViewById(R.id.mlu);
        this.LJLJJI = (LinearLayout) findViewById(R.id.g47);
        this.LJLJJL = findViewById(R.id.g48);
        this.LJLJJLL = (LiveIconView) findViewById(R.id.fph);
        this.LJLJL = (LinearLayout) findViewById(R.id.g5n);
        this.LJLJLJ = (C47121t6) findViewById(R.id.m_s);
        this.LJLJLLL = (C47121t6) findViewById(R.id.mi8);
        this.LJLL = findViewById(R.id.nbt);
        new AbstractC534928b<C30171Gj>(this) { // from class: X.2HO
            @Override // X.QXX
            public final int[] LLLLLLL() {
                return new int[]{R.attr.bav};
            }

            {
                super(this);
            }

            @Override // X.AbstractC534928b
            public final void LLLLZIL(TypedArray typedArray) {
                int i2;
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == 0) {
                        Boolean valueOf = Boolean.valueOf(typedArray.getBoolean(index, false));
                        View view = ((C30171Gj) this.LJLIL).LJLL;
                        if (view != null) {
                            if (valueOf.booleanValue()) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            view.setVisibility(i2);
                        }
                    }
                }
            }
        }.LLLLZLLLI(attributeSet, 0, R.style.yw);
        LJJLL(this.LJLJJI, this.LJLLJ);
        LJJLJLI();
        LJJLL(this.LJLJL, this.LJLLL);
        int[] iArr = {R.id.g48, R.id.g47, R.id.m_s};
        View findViewById = findViewById(R.id.ah2);
        if (findViewById instanceof AbstractC019505v) {
            ((AbstractC019505v) findViewById).setReferencedIds(iArr);
        }
        int[] iArr2 = {R.id.g5n, R.id.mi8};
        View findViewById2 = findViewById(R.id.ah6);
        if (findViewById2 instanceof AbstractC019505v) {
            ((AbstractC019505v) findViewById2).setReferencedIds(iArr2);
        }
        h0.LJIJJ(this.LJLILLLLZI, true);
    }
}
