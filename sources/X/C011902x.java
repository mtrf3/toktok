package X;

import Y.IDCListenerS135S0100000;
import Y.IDRunnableS6S0101000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar$SavedState;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.h0;

/* renamed from: X.02x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C011902x extends ViewGroup {
    public AnonymousClass191 LJLIL;
    public AppCompatTextView LJLILLLLZI;
    public AppCompatTextView LJLJI;
    public C012503d LJLJJI;
    public AppCompatImageView LJLJJL;
    public final Drawable LJLJJLL;
    public final CharSequence LJLJL;
    public C012503d LJLJLJ;
    public View LJLJLLL;
    public Context LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public C013203k LJZL;
    public int LL;
    public int LLD;
    public final int LLF;
    public CharSequence LLFF;
    public CharSequence LLFFF;
    public ColorStateList LLFII;
    public ColorStateList LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final ArrayList<View> LLII;
    public final ArrayList<View> LLIIII;
    public final int[] LLIIIILZ;
    public final C16560ku LLIIIJ;
    public ArrayList<MenuItem> LLIIIL;
    public InterfaceC011802w LLIIIZ;
    public final AnonymousClass197 LLIIJI;
    public C19E LLIIJLIL;
    public ActionMenuPresenter LLIIL;
    public AnonymousClass198 LLIILII;
    public C02N LLIILZL;
    public C02J LLIIZ;
    public boolean LLIL;
    public final IDRunnableS85S0100000 LLILII;

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C25650zZ(getContext());
    }

    public final void LIZJ() {
        if (this.LJLJLJ == null) {
            C012503d c012503d = new C012503d(getContext(), null, R.attr.bjx);
            this.LJLJLJ = c012503d;
            c012503d.setImageDrawable(this.LJLJJLL);
            this.LJLJLJ.setContentDescription(this.LJLJL);
            AnonymousClass199 anonymousClass199 = new AnonymousClass199();
            anonymousClass199.LIZ = (this.LJLLL & 112) | 8388611;
            anonymousClass199.LIZIZ = 2;
            this.LJLJLJ.setLayoutParams(anonymousClass199);
            C16880lQ.LJIILL(this.LJLJLJ, new IDCListenerS135S0100000(this, 6));
        }
    }

    public final void LJ() {
        if (this.LJLIL == null) {
            AnonymousClass191 anonymousClass191 = new AnonymousClass191(getContext(), null);
            this.LJLIL = anonymousClass191;
            anonymousClass191.setPopupTheme(this.LJLLI);
            this.LJLIL.setOnMenuItemClickListener(this.LLIIJI);
            AnonymousClass191 anonymousClass1912 = this.LJLIL;
            C02N c02n = this.LLIILZL;
            C02J c02j = this.LLIIZ;
            anonymousClass1912.LL = c02n;
            anonymousClass1912.LLD = c02j;
            AnonymousClass199 anonymousClass199 = new AnonymousClass199();
            anonymousClass199.LIZ = (this.LJLLL & 112) | 8388613;
            this.LJLIL.setLayoutParams(anonymousClass199);
            LIZIZ(this.LJLIL, false);
        }
    }

    public final void LJFF() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new C012503d(getContext(), null, R.attr.bjx);
            AnonymousClass199 anonymousClass199 = new AnonymousClass199();
            anonymousClass199.LIZ = (this.LJLLL & 112) | 8388611;
            this.LJLJJI.setLayoutParams(anonymousClass199);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass199();
    }

    public CharSequence getCollapseContentDescription() {
        C012503d c012503d = this.LJLJLJ;
        if (c012503d != null) {
            return c012503d.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C012503d c012503d = this.LJLJLJ;
        if (c012503d != null) {
            return c012503d.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C013203k c013203k = this.LJZL;
        if (c013203k != null) {
            if (c013203k.LJI) {
                return c013203k.LIZ;
            }
            return c013203k.LIZIZ;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.LLD;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C013203k c013203k = this.LJZL;
        if (c013203k != null) {
            return c013203k.LIZ;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C013203k c013203k = this.LJZL;
        if (c013203k != null) {
            return c013203k.LIZIZ;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C013203k c013203k = this.LJZL;
        if (c013203k != null) {
            if (c013203k.LJI) {
                return c013203k.LIZIZ;
            }
            return c013203k.LIZ;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.LL;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C281318n c281318n;
        AnonymousClass191 anonymousClass191 = this.LJLIL;
        if (anonymousClass191 != null && (c281318n = anonymousClass191.LJLLLLLL) != null && c281318n.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.LLD, 0));
        }
        return getContentInsetEnd();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.LJLJJL;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.LJLJJL;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        C012503d c012503d = this.LJLJJI;
        if (c012503d != null) {
            return c012503d.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C012503d c012503d = this.LJLJJI;
        if (c012503d != null) {
            return c012503d.getDrawable();
        }
        return null;
    }

    public AnonymousClass039 getWrapper() {
        if (this.LLIIJLIL == null) {
            this.LLIIJLIL = new C19E(this, true);
        }
        return this.LLIIJLIL;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ActionMenuPresenter actionMenuPresenter;
        C281618q c281618q;
        Toolbar$SavedState toolbar$SavedState = new Toolbar$SavedState(super.onSaveInstanceState());
        AnonymousClass198 anonymousClass198 = this.LLIILII;
        if (anonymousClass198 != null && (c281618q = anonymousClass198.LJLILLLLZI) != null) {
            toolbar$SavedState.LJLIL = c281618q.LIZ;
        }
        AnonymousClass191 anonymousClass191 = this.LJLIL;
        boolean z = false;
        if (anonymousClass191 != null && (actionMenuPresenter = anonymousClass191.LJZL) != null && actionMenuPresenter.LJIIL()) {
            z = true;
        }
        toolbar$SavedState.LJLILLLLZI = z;
        return toolbar$SavedState;
    }

    public final void LIZLLL() {
        LJ();
        AnonymousClass191 anonymousClass191 = this.LJLIL;
        if (anonymousClass191.LJLLLLLL == null) {
            C281318n c281318n = (C281318n) anonymousClass191.getMenu();
            if (this.LLIILII == null) {
                this.LLIILII = new AnonymousClass198(this);
            }
            this.LJLIL.setExpandedActionViewsExclusive(true);
            c281318n.LIZIZ(this.LLIILII, this.LJLL);
        }
    }

    public int getCurrentContentInsetLeft() {
        if (C16310kV.LIZLLL(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C16310kV.LIZLLL(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.LL, 0));
        }
        return getContentInsetStart();
    }

    public Menu getMenu() {
        LIZLLL();
        return this.LJLIL.getMenu();
    }

    public Drawable getOverflowIcon() {
        LIZLLL();
        return this.LJLIL.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.LLILII);
    }

    public View getNavButtonView() {
        return this.LJLJJI;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.LLIIL;
    }

    public Context getPopupContext() {
        return this.LJLL;
    }

    public int getPopupTheme() {
        return this.LJLLI;
    }

    public CharSequence getSubtitle() {
        return this.LLFFF;
    }

    public final TextView getSubtitleTextView() {
        return this.LJLJI;
    }

    public CharSequence getTitle() {
        return this.LLFF;
    }

    public int getTitleMarginBottom() {
        return this.LJZI;
    }

    public int getTitleMarginEnd() {
        return this.LJLZ;
    }

    public int getTitleMarginStart() {
        return this.LJLLLLLL;
    }

    public int getTitleMarginTop() {
        return this.LJZ;
    }

    public final TextView getTitleTextView() {
        return this.LJLILLLLZI;
    }

    public static AnonymousClass199 LJI(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof AnonymousClass199) {
            return new AnonymousClass199((AnonymousClass199) layoutParams);
        }
        if (layoutParams instanceof C009401y) {
            return new AnonymousClass199((C009401y) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass199((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass199(layoutParams);
    }

    public static int LJIIIIZZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C16530kr.LIZIZ(marginLayoutParams) + C16530kr.LIZJ(marginLayoutParams);
    }

    public static int LJIIIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static void LJIIL(C011902x c011902x) {
        Iterator<MenuItem> it = c011902x.LLIIIL.iterator();
        while (it.hasNext()) {
            c011902x.getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = c011902x.getCurrentMenuItems();
        C16560ku c16560ku = c011902x.LLIIIJ;
        c011902x.getMenu();
        c011902x.getMenuInflater();
        Iterator<InterfaceC16580kw> it2 = c16560ku.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        ArrayList<MenuItem> currentMenuItems2 = c011902x.getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        c011902x.LLIIIL = currentMenuItems2;
    }

    public final void LJIIJ(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final boolean LJIIJJI(View view) {
        if (view.getParent() == this || this.LLIIII.contains(view)) {
            return true;
        }
        return false;
    }

    public final boolean LJIIZILJ(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof AnonymousClass199)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass199(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.LLIFFJFJJ = false;
        }
        if (!this.LLIFFJFJJ) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.LLIFFJFJJ = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.LLIFFJFJJ = false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C281318n c281318n;
        MenuItem findItem;
        if (!(parcelable instanceof Toolbar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Toolbar$SavedState toolbar$SavedState = (Toolbar$SavedState) parcelable;
        super.onRestoreInstanceState(toolbar$SavedState.mSuperState);
        AnonymousClass191 anonymousClass191 = this.LJLIL;
        if (anonymousClass191 != null) {
            c281318n = anonymousClass191.LJLLLLLL;
        } else {
            c281318n = null;
        }
        int i = toolbar$SavedState.LJLIL;
        if (i != 0 && this.LLIILII != null && c281318n != null && (findItem = c281318n.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (toolbar$SavedState.LJLILLLLZI) {
            removeCallbacks(this.LLILII);
            post(this.LLILII);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.LJZL == null) {
            this.LJZL = new C013203k();
        }
        C013203k c013203k = this.LJZL;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == c013203k.LJI) {
            return;
        }
        c013203k.LJI = z;
        if (c013203k.LJII) {
            if (z) {
                int i2 = c013203k.LIZLLL;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = c013203k.LJ;
                }
                c013203k.LIZ = i2;
                int i3 = c013203k.LIZJ;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = c013203k.LJFF;
                }
                c013203k.LIZIZ = i3;
                return;
            }
            int i4 = c013203k.LIZJ;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c013203k.LJ;
            }
            c013203k.LIZ = i4;
            int i5 = c013203k.LIZLLL;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c013203k.LJFF;
            }
            c013203k.LIZIZ = i5;
            return;
        }
        c013203k.LIZ = c013203k.LJ;
        c013203k.LIZIZ = c013203k.LJFF;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.LLI = false;
        }
        if (!this.LLI) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.LLI = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.LLI = false;
        }
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            LIZJ();
        }
        C012503d c012503d = this.LJLJLJ;
        if (c012503d != null) {
            c012503d.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            LIZJ();
            this.LJLJLJ.setImageDrawable(drawable);
        } else {
            C012503d c012503d = this.LJLJLJ;
            if (c012503d == null) {
                return;
            }
            c012503d.setImageDrawable(this.LJLJJLL);
        }
    }

    public void setCollapsible(boolean z) {
        this.LLIL = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if (i != this.LLD) {
            this.LLD = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if (i != this.LL) {
            this.LL = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.LJLJJL == null) {
                this.LJLJJL = new AppCompatImageView(getContext());
            }
            if (!LJIIJJI(this.LJLJJL)) {
                LIZIZ(this.LJLJJL, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.LJLJJL;
            if (appCompatImageView != null && LJIIJJI(appCompatImageView)) {
                C16880lQ.LJZL(this, this.LJLJJL);
                this.LLIIII.remove(this.LJLJJL);
            }
        }
        AppCompatImageView appCompatImageView2 = this.LJLJJL;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.LJLJJL == null) {
            this.LJLJJL = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.LJLJJL;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            LJFF();
        }
        C012503d c012503d = this.LJLJJI;
        if (c012503d != null) {
            c012503d.setContentDescription(charSequence);
            C03E.LIZ(this.LJLJJI, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            LJFF();
            if (!LJIIJJI(this.LJLJJI)) {
                LIZIZ(this.LJLJJI, true);
            }
        } else {
            C012503d c012503d = this.LJLJJI;
            if (c012503d != null && LJIIJJI(c012503d)) {
                C16880lQ.LJZL(this, this.LJLJJI);
                this.LLIIII.remove(this.LJLJJI);
            }
        }
        C012503d c012503d2 = this.LJLJJI;
        if (c012503d2 != null) {
            c012503d2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        LJFF();
        C16880lQ.LJIILL(this.LJLJJI, onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC011802w interfaceC011802w) {
        this.LLIIIZ = interfaceC011802w;
    }

    public void setOverflowIcon(Drawable drawable) {
        LIZLLL();
        this.LJLIL.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.LJLLI != i) {
            this.LJLLI = i;
            if (i == 0) {
                this.LJLL = getContext();
            } else {
                this.LJLL = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.LJLJI == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.LJLJI = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.LJLJI.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.LJLLJ;
                if (i != 0) {
                    this.LJLJI.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.LLFZ;
                if (colorStateList != null) {
                    this.LJLJI.setTextColor(colorStateList);
                }
            }
            if (!LJIIJJI(this.LJLJI)) {
                LIZIZ(this.LJLJI, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.LJLJI;
            if (appCompatTextView2 != null && LJIIJJI(appCompatTextView2)) {
                C16880lQ.LJZL(this, this.LJLJI);
                this.LLIIII.remove(this.LJLJI);
            }
        }
        AppCompatTextView appCompatTextView3 = this.LJLJI;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.LLFFF = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.LLFZ = colorStateList;
        AppCompatTextView appCompatTextView = this.LJLJI;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.LJLILLLLZI == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.LJLILLLLZI = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.LJLILLLLZI.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.LJLLILLLL;
                if (i != 0) {
                    this.LJLILLLLZI.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.LLFII;
                if (colorStateList != null) {
                    this.LJLILLLLZI.setTextColor(colorStateList);
                }
            }
            if (!LJIIJJI(this.LJLILLLLZI)) {
                LIZIZ(this.LJLILLLLZI, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.LJLILLLLZI;
            if (appCompatTextView2 != null && LJIIJJI(appCompatTextView2)) {
                C16880lQ.LJZL(this, this.LJLILLLLZI);
                this.LLIIII.remove(this.LJLILLLLZI);
            }
        }
        AppCompatTextView appCompatTextView3 = this.LJLILLLLZI;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.LLFF = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.LJZI = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.LJLZ = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.LJLLLLLL = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.LJZ = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.LLFII = colorStateList;
        AppCompatTextView appCompatTextView = this.LJLILLLLZI;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LJI(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C20110qd.LIZ(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(C20110qd.LIZ(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C20110qd.LIZ(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public C011902x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, List list) {
        boolean z;
        if (C16310kV.LIZLLL(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(this));
        ArrayList arrayList = (ArrayList) list;
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                AnonymousClass199 anonymousClass199 = (AnonymousClass199) childAt.getLayoutParams();
                if (anonymousClass199.LIZIZ == 0 && LJIIZILJ(childAt)) {
                    int i3 = anonymousClass199.LIZ;
                    int LIZLLL = C16310kV.LIZLLL(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, LIZLLL) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = LIZLLL == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            AnonymousClass199 anonymousClass1992 = (AnonymousClass199) childAt2.getLayoutParams();
            if (anonymousClass1992.LIZIZ == 0 && LJIIZILJ(childAt2)) {
                int i5 = anonymousClass1992.LIZ;
                int LIZLLL2 = C16310kV.LIZLLL(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, LIZLLL2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = LIZLLL2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void LIZIZ(View view, boolean z) {
        AnonymousClass199 anonymousClass199;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            anonymousClass199 = new AnonymousClass199();
        } else if (!checkLayoutParams(layoutParams)) {
            anonymousClass199 = LJI(layoutParams);
        } else {
            anonymousClass199 = (AnonymousClass199) layoutParams;
        }
        anonymousClass199.LIZIZ = 1;
        if (z && this.LJLJLLL != null) {
            view.setLayoutParams(anonymousClass199);
            this.LLIIII.add(view);
        } else {
            addView(view, anonymousClass199);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 80) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(int r9, android.view.View r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r5 = r10.getLayoutParams()
            X.01y r5 = (X.C009401y) r5
            int r7 = r10.getMeasuredHeight()
            r6 = 0
            if (r9 <= 0) goto L51
            int r0 = r7 - r9
            int r4 = r0 / 2
        L11:
            int r0 = r5.LIZ
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            r2 = 80
            r1 = 48
            if (r3 == r0) goto L29
            if (r3 == r1) goto L62
            if (r3 == r2) goto L53
            int r0 = r8.LLF
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 == r1) goto L62
            if (r0 == r2) goto L53
        L29:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 / 2
            int r0 = r5.topMargin
            if (r1 >= r0) goto L42
            r1 = r0
        L40:
            int r4 = r4 + r1
            return r4
        L42:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r5.bottomMargin
            if (r2 >= r0) goto L40
            int r0 = r0 - r2
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r6, r1)
            goto L40
        L51:
            r4 = 0
            goto L11
        L53:
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r4
            return r1
        L62:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011902x.LJII(int, android.view.View):int");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.LLIIIILZ;
        boolean LIZ = C03Q.LIZ(this);
        int i9 = !LIZ ? 1 : 0;
        int i10 = 0;
        if (LJIIZILJ(this.LJLJJI)) {
            LJIILLIIL(this.LJLJJI, i, 0, i2, this.LJLLLL);
            i3 = LJIIIIZZ(this.LJLJJI) + this.LJLJJI.getMeasuredWidth();
            i4 = Math.max(0, LJIIIZ(this.LJLJJI) + this.LJLJJI.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.LJLJJI.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (LJIIZILJ(this.LJLJLJ)) {
            LJIILLIIL(this.LJLJLJ, i, 0, i2, this.LJLLLL);
            i3 = LJIIIIZZ(this.LJLJLJ) + this.LJLJLJ.getMeasuredWidth();
            i4 = Math.max(i4, LJIIIZ(this.LJLJLJ) + this.LJLJLJ.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.LJLJLJ.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[LIZ ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (LJIIZILJ(this.LJLIL)) {
            LJIILLIIL(this.LJLIL, i, max, i2, this.LJLLLL);
            i6 = LJIIIIZZ(this.LJLIL) + this.LJLIL.getMeasuredWidth();
            i4 = Math.max(i4, LJIIIZ(this.LJLIL) + this.LJLIL.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.LJLIL.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i9] = Math.max(0, currentContentInsetEnd - i6);
        if (LJIIZILJ(this.LJLJLLL)) {
            max2 += LJIILL(this.LJLJLLL, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, LJIIIZ(this.LJLJLLL) + this.LJLJLLL.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.LJLJLLL.getMeasuredState());
        }
        if (LJIIZILJ(this.LJLJJL)) {
            max2 += LJIILL(this.LJLJJL, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, LJIIIZ(this.LJLJJL) + this.LJLJJL.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.LJLJJL.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((AnonymousClass199) childAt.getLayoutParams()).LIZIZ == 0 && LJIIZILJ(childAt)) {
                max2 += LJIILL(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, LJIIIZ(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.LJZ + this.LJZI;
        int i13 = this.LJLLLLLL + this.LJLZ;
        if (LJIIZILJ(this.LJLILLLLZI)) {
            LJIILL(this.LJLILLLLZI, i, max2 + i13, i2, i12, iArr);
            i7 = LJIIIIZZ(this.LJLILLLLZI) + this.LJLILLLLZI.getMeasuredWidth();
            i8 = LJIIIZ(this.LJLILLLLZI) + this.LJLILLLLZI.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, this.LJLILLLLZI.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (LJIIZILJ(this.LJLJI)) {
            i7 = Math.max(i7, LJIILL(this.LJLJI, i, max2 + i13, i2, i8 + i12, iArr));
            i8 += LJIIIZ(this.LJLJI) + this.LJLJI.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, this.LJLJI.getMeasuredState());
        }
        int i14 = max2 + i7;
        int max3 = Math.max(i4, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (this.LLIL) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!LJIIZILJ(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public C011902x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.bjy);
        this.LLF = 8388627;
        this.LLII = new ArrayList<>();
        this.LLIIII = new ArrayList<>();
        this.LLIIIILZ = new int[2];
        this.LLIIIJ = new C16560ku(new IDRunnableS6S0101000(0, this, 3));
        this.LLIIIL = new ArrayList<>();
        this.LLIIJI = new AnonymousClass197(this);
        this.LLILII = new IDRunnableS85S0100000(this, 10);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(getContext(), attributeSet, new int[]{android.R.attr.gravity, android.R.attr.minHeight, R.attr.a0e, R.attr.a44, R.attr.a45, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.ay3, R.attr.ay4, R.attr.b0_, R.attr.b0r, R.attr.b1r, R.attr.b1s, R.attr.b52, R.attr.bfi, R.attr.bfj, R.attr.bfk, R.attr.bje, R.attr.bji, R.attr.bjj, R.attr.bjk, R.attr.bjl, R.attr.bjm, R.attr.bjn, R.attr.bjq, R.attr.bjr}, R.attr.bjy, 0);
        h0.LJIJ(this, context, new int[]{android.R.attr.gravity, android.R.attr.minHeight, R.attr.a0e, R.attr.a44, R.attr.a45, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.ay3, R.attr.ay4, R.attr.b0_, R.attr.b0r, R.attr.b1r, R.attr.b1s, R.attr.b52, R.attr.bfi, R.attr.bfj, R.attr.bfk, R.attr.bje, R.attr.bji, R.attr.bjj, R.attr.bjk, R.attr.bjl, R.attr.bjm, R.attr.bjn, R.attr.bjq, R.attr.bjr}, attributeSet, LJIILIIL.LIZIZ, R.attr.bjy);
        this.LJLLILLLL = LJIILIIL.LJIIIIZZ(28, 0);
        this.LJLLJ = LJIILIIL.LJIIIIZZ(19, 0);
        this.LLF = LJIILIIL.LIZIZ.getInteger(0, 8388627);
        this.LJLLL = LJIILIIL.LIZIZ.getInteger(2, 48);
        int LIZJ = LJIILIIL.LIZJ(22, 0);
        LIZJ = LJIILIIL.LJIIJJI(27) ? LJIILIIL.LIZJ(27, LIZJ) : LIZJ;
        this.LJZI = LIZJ;
        this.LJZ = LIZJ;
        this.LJLZ = LIZJ;
        this.LJLLLLLL = LIZJ;
        int LIZJ2 = LJIILIIL.LIZJ(25, -1);
        if (LIZJ2 >= 0) {
            this.LJLLLLLL = LIZJ2;
        }
        int LIZJ3 = LJIILIIL.LIZJ(24, -1);
        if (LIZJ3 >= 0) {
            this.LJLZ = LIZJ3;
        }
        int LIZJ4 = LJIILIIL.LIZJ(26, -1);
        if (LIZJ4 >= 0) {
            this.LJZ = LIZJ4;
        }
        int LIZJ5 = LJIILIIL.LIZJ(23, -1);
        if (LIZJ5 >= 0) {
            this.LJZI = LIZJ5;
        }
        this.LJLLLL = LJIILIIL.LIZLLL(13, -1);
        int LIZJ6 = LJIILIIL.LIZJ(9, LiveLayoutPreloadThreadPriority.DEFAULT);
        int LIZJ7 = LJIILIIL.LIZJ(5, LiveLayoutPreloadThreadPriority.DEFAULT);
        int LIZLLL = LJIILIIL.LIZLLL(7, 0);
        int LIZLLL2 = LJIILIIL.LIZLLL(8, 0);
        if (this.LJZL == null) {
            this.LJZL = new C013203k();
        }
        C013203k c013203k = this.LJZL;
        c013203k.LJII = false;
        if (LIZLLL != Integer.MIN_VALUE) {
            c013203k.LJ = LIZLLL;
            c013203k.LIZ = LIZLLL;
        }
        if (LIZLLL2 != Integer.MIN_VALUE) {
            c013203k.LJFF = LIZLLL2;
            c013203k.LIZIZ = LIZLLL2;
        }
        if (LIZJ6 != Integer.MIN_VALUE || LIZJ7 != Integer.MIN_VALUE) {
            c013203k.LIZ(LIZJ6, LIZJ7);
        }
        this.LL = LJIILIIL.LIZJ(10, LiveLayoutPreloadThreadPriority.DEFAULT);
        this.LLD = LJIILIIL.LIZJ(6, LiveLayoutPreloadThreadPriority.DEFAULT);
        this.LJLJJLL = LJIILIIL.LJ(4);
        this.LJLJL = LJIILIIL.LJIIJ(3);
        CharSequence LJIIJ = LJIILIIL.LJIIJ(21);
        if (!TextUtils.isEmpty(LJIIJ)) {
            setTitle(LJIIJ);
        }
        CharSequence LJIIJ2 = LJIILIIL.LJIIJ(18);
        if (!TextUtils.isEmpty(LJIIJ2)) {
            setSubtitle(LJIIJ2);
        }
        this.LJLL = getContext();
        setPopupTheme(LJIILIIL.LJIIIIZZ(17, 0));
        Drawable LJ = LJIILIIL.LJ(16);
        if (LJ != null) {
            setNavigationIcon(LJ);
        }
        CharSequence LJIIJ3 = LJIILIIL.LJIIJ(15);
        if (!TextUtils.isEmpty(LJIIJ3)) {
            setNavigationContentDescription(LJIIJ3);
        }
        Drawable LJ2 = LJIILIIL.LJ(11);
        if (LJ2 != null) {
            setLogo(LJ2);
        }
        CharSequence LJIIJ4 = LJIILIIL.LJIIJ(12);
        if (!TextUtils.isEmpty(LJIIJ4)) {
            setLogoDescription(LJIIJ4);
        }
        if (LJIILIIL.LJIIJJI(29)) {
            setTitleTextColor(LJIILIIL.LIZIZ(29));
        }
        if (LJIILIIL.LJIIJJI(20)) {
            setSubtitleTextColor(LJIILIIL.LIZIZ(20));
        }
        if (LJIILIIL.LJIIJJI(14)) {
            LJIIJ(LJIILIIL.LJIIIIZZ(14, 0));
        }
        LJIILIIL.LJIILJJIL();
    }

    public final int LJIILIIL(View view, int i, int i2, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int LJII = LJII(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        C17M.LIZIZ(view, LJII, max, LJII, max + measuredWidth);
        return measuredWidth + marginLayoutParams.rightMargin + max;
    }

    public final int LJIILJJIL(View view, int i, int i2, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int LJII = LJII(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        C17M.LIZIZ(view, LJII, max - measuredWidth, LJII, max);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    public final void LJIILLIIL(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x030e A[LOOP:3: B:103:0x030c->B:104:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5 A[LOOP:0: B:89:0x01a3->B:90:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4 A[LOOP:1: B:93:0x02a2->B:94:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c8 A[LOOP:2: B:97:0x02c6->B:98:0x02c8, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011902x.onLayout(boolean, int, int, int, int):void");
    }

    public final int LJIILL(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }
}
