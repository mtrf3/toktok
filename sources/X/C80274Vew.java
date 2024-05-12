package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import java.util.HashSet;

/* renamed from: X.Vew, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80274Vew extends ViewGroup implements C02Q {
    public static final int[] LLFZ = {R.attr.state_checked};
    public static final int[] LLI = {-16842910};
    public final C40511iR LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final ViewOnClickListenerC80276Vey LJLJL;
    public final C43051mX LJLJLJ;
    public final SparseArray<View.OnTouchListener> LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public C80272Veu[] LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public ColorStateList LJLLLL;
    public int LJLLLLLL;
    public ColorStateList LJLZ;
    public final ColorStateList LJZ;
    public int LJZI;
    public int LJZL;
    public Drawable LL;
    public int LLD;
    public final int[] LLF;
    public SparseArray<BadgeDrawable> LLFF;
    public BottomNavigationPresenter LLFFF;
    public C281318n LLFII;

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C80272Veu getNewItem() {
        C80272Veu c80272Veu = (C80272Veu) this.LJLJLJ.LIZIZ();
        if (c80272Veu == null) {
            return new C80272Veu(getContext());
        }
        return c80272Veu;
    }

    public final ColorStateList LIZJ() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList LIZJ = C04330Ez.LIZJ(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.a4r, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = LIZJ.getDefaultColor();
        int[] iArr = LLI;
        return new ColorStateList(new int[][]{iArr, LLFZ, ViewGroup.EMPTY_STATE_SET}, new int[]{LIZJ.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public Drawable getItemBackground() {
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null && c80272VeuArr.length > 0) {
            return c80272VeuArr[0].getBackground();
        }
        return this.LL;
    }

    public final void LIZIZ() {
        boolean z;
        removeAllViews();
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                if (c80272Veu != null) {
                    this.LJLJLJ.LIZ(c80272Veu);
                    ImageView imageView = c80272Veu.LJLJL;
                    if (c80272Veu.LJLLLLLL != null) {
                        if (imageView != null) {
                            c80272Veu.setClipChildren(true);
                            c80272Veu.setClipToPadding(true);
                            BadgeDrawable badgeDrawable = c80272Veu.LJLLLLLL;
                            if (badgeDrawable != null) {
                                if (badgeDrawable.LIZLLL() != null) {
                                    badgeDrawable.LIZLLL().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(badgeDrawable);
                                }
                            }
                        }
                        c80272Veu.LJLLLLLL = null;
                    }
                }
            }
        }
        if (this.LLFII.size() == 0) {
            this.LJLLJ = 0;
            this.LJLLL = 0;
            this.LJLLILLLL = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.LLFII.size(); i++) {
            hashSet.add(Integer.valueOf(this.LLFII.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.LLFF.size(); i2++) {
            int keyAt = this.LLFF.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.LLFF.delete(keyAt);
            }
        }
        this.LJLLILLLL = new C80272Veu[this.LLFII.size()];
        int i3 = this.LJLLI;
        int size = this.LLFII.LJIIJJI().size();
        if (i3 != -1 ? i3 == 0 : size > 3) {
            z = true;
        } else {
            z = false;
        }
        for (int i4 = 0; i4 < this.LLFII.size(); i4++) {
            this.LLFFF.LJLILLLLZI = true;
            this.LLFII.getItem(i4).setCheckable(true);
            this.LLFFF.LJLILLLLZI = false;
            C80272Veu newItem = getNewItem();
            this.LJLLILLLL[i4] = newItem;
            newItem.setIconTintList(this.LJLLLL);
            newItem.setIconSize(this.LJLLLLLL);
            newItem.setTextColor(this.LJZ);
            newItem.setTextAppearanceInactive(this.LJZI);
            newItem.setTextAppearanceActive(this.LJZL);
            newItem.setTextColor(this.LJLZ);
            Drawable drawable = this.LL;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.LLD);
            }
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.LJLLI);
            C281618q c281618q = (C281618q) this.LLFII.getItem(i4);
            newItem.LJIIIIZZ(c281618q);
            newItem.setItemPosition(i4);
            int i5 = c281618q.LIZ;
            newItem.setOnTouchListener(this.LJLJLLL.get(i5));
            newItem.setOnClickListener(new ViewOnClickListenerC13880ga(this.LJLJL));
            int i6 = this.LJLLJ;
            if (i6 != 0 && i5 == i6) {
                this.LJLLL = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.LLFII.size() - 1, this.LJLLL);
        this.LJLLL = min;
        this.LLFII.getItem(min).setChecked(true);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.LLFF;
    }

    public ColorStateList getIconTintList() {
        return this.LJLLLL;
    }

    public int getItemBackgroundRes() {
        return this.LLD;
    }

    public int getItemIconSize() {
        return this.LJLLLLLL;
    }

    public int getItemTextAppearanceActive() {
        return this.LJZL;
    }

    public int getItemTextAppearanceInactive() {
        return this.LJZI;
    }

    public ColorStateList getItemTextColor() {
        return this.LJLZ;
    }

    public int getLabelVisibilityMode() {
        return this.LJLLI;
    }

    public int getSelectedItemId() {
        return this.LJLLJ;
    }

    public C80274Vew(Context context) {
        super(context, null);
        this.LJLJLJ = new C43051mX(5);
        this.LJLJLLL = new SparseArray<>(5);
        this.LJLLJ = 0;
        this.LJLLL = 0;
        this.LLFF = new SparseArray<>(5);
        Resources resources = getResources();
        this.LJLILLLLZI = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.ly);
        this.LJLJI = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.lz);
        this.LJLJJI = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.ls);
        this.LJLJJL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.lt);
        this.LJLJJLL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.lw);
        this.LJZ = LIZJ();
        C40511iR c40511iR = new C40511iR();
        this.LJLIL = c40511iR;
        c40511iR.LJJIZ(0);
        c40511iR.LJJIII(115L);
        c40511iR.LJJIIJZLJL(new C30901Je());
        c40511iR.LJJIJL(new CVY());
        this.LJLJL = new ViewOnClickListenerC80276Vey(this);
        this.LLF = new int[5];
        C16300kU.LJIJ(this, 1);
    }

    private void setBadgeIfNeeded(C80272Veu c80272Veu) {
        BadgeDrawable badgeDrawable;
        int id = c80272Veu.getId();
        if (id != -1 && (badgeDrawable = this.LLFF.get(id)) != null) {
            c80272Veu.setBadge(badgeDrawable);
        }
    }

    @Override // X.C02Q
    public final void LIZ(C281318n c281318n) {
        this.LLFII = c281318n;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C17760mq(accessibilityNodeInfo).LJIILLIIL(C17730mn.LIZ(1, this.LLFII.LJIIJJI().size(), 1));
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.LLFF = sparseArray;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setBadge(sparseArray.get(c80272Veu.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.LJLLLL = colorStateList;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.LL = drawable;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.LLD = i;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.LJLL = z;
    }

    public void setItemIconSize(int i) {
        this.LJLLLLLL = i;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.LJZL = i;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.LJLZ;
                if (colorStateList != null) {
                    c80272Veu.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.LJZI = i;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.LJLZ;
                if (colorStateList != null) {
                    c80272Veu.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.LJLZ = colorStateList;
        C80272Veu[] c80272VeuArr = this.LJLLILLLL;
        if (c80272VeuArr != null) {
            for (C80272Veu c80272Veu : c80272VeuArr) {
                c80272Veu.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.LJLLI = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.LLFFF = bottomNavigationPresenter;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.LLFII.LJIIJJI().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.LJLJJLL, 1073741824);
        int i5 = this.LJLLI;
        int i6 = 1;
        if (i5 != -1 ? i5 == 0 : size2 > 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.LJLL) {
            View childAt = getChildAt(this.LJLLL);
            int i7 = this.LJLJJL;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.LJLJJI, LiveLayoutPreloadThreadPriority.DEFAULT), makeMeasureSpec);
                i7 = Math.max(i7, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i8 = size2 - i3;
            int min = Math.min(size - (this.LJLJI * i8), Math.min(i7, this.LJLJJI));
            int i9 = size - min;
            if (i8 != 0) {
                i6 = i8;
            }
            int min2 = Math.min(i9 / i6, this.LJLILLLLZI);
            int i10 = i9 - (i8 * min2);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getVisibility() != 8) {
                    int[] iArr = this.LLF;
                    if (i11 == this.LJLLL) {
                        i4 = min;
                    } else {
                        i4 = min2;
                    }
                    iArr[i11] = i4;
                    if (i10 > 0) {
                        iArr[i11] = i4 + 1;
                        i10--;
                    }
                } else {
                    this.LLF[i11] = 0;
                }
            }
        } else {
            if (size2 != 0) {
                i6 = size2;
            }
            int min3 = Math.min(size / i6, this.LJLJJI);
            int i12 = size - (size2 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.LLF;
                    iArr2[i13] = min3;
                    if (i12 > 0) {
                        iArr2[i13] = min3 + 1;
                        i12--;
                    }
                } else {
                    this.LLF[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.LLF[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.LJLJJLL, makeMeasureSpec, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C16310kV.LIZLLL(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }
}
