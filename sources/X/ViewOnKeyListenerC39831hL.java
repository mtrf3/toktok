package X;

import Y.IDCListenerS241S0100000;
import Y.IDLListenerS188S0100000;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1hL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC39831hL extends AbstractC37391dP implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public final Handler LJLJL;
    public View LJLLLL;
    public View LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;
    public int LL;
    public boolean LLF;
    public C02N LLFF;
    public ViewTreeObserver LLFFF;
    public PopupWindow.OnDismissListener LLFII;
    public boolean LLFZ;
    public final List<C281318n> LJLJLJ = new ArrayList();
    public final List<C02G> LJLJLLL = new ArrayList();
    public final IDLListenerS188S0100000 LJLL = new IDLListenerS188S0100000(this, 0);
    public final IDCListenerS241S0100000 LJLLI = new IDCListenerS241S0100000(this, 0);
    public final C281118l LJLLILLLL = new C281118l(this);
    public int LJLLJ = 0;
    public int LJLLL = 0;
    public boolean LLD = false;

    @Override // X.C02O
    public final Parcelable LIZIZ() {
        return null;
    }

    @Override // X.C02O
    public final boolean LJII() {
        return false;
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
    }

    @Override // X.AnonymousClass112
    public final C03G LIZLLL() {
        if (((ArrayList) this.LJLJLLL).isEmpty()) {
            return null;
        }
        return ((C02G) ListProtector.get(this.LJLJLLL, ((ArrayList) r1).size() - 1)).LIZ.LJLJI;
    }

    @Override // X.AnonymousClass112
    public final void dismiss() {
        int size = ((ArrayList) this.LJLJLLL).size();
        if (size > 0) {
            C02G[] c02gArr = (C02G[]) ((ArrayList) this.LJLJLLL).toArray(new C02G[size]);
            for (int i = size - 1; i >= 0; i--) {
                C02G c02g = c02gArr[i];
                if (c02g.LIZ.isShowing()) {
                    c02g.LIZ.dismiss();
                }
            }
        }
    }

    @Override // X.AnonymousClass112
    public final boolean isShowing() {
        if (((ArrayList) this.LJLJLLL).size() <= 0 || !((C02G) ListProtector.get(this.LJLJLLL, 0)).LIZ.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int size = ((ArrayList) this.LJLJLLL).size();
        for (int i = 0; i < size; i++) {
            C02G c02g = (C02G) ListProtector.get(this.LJLJLLL, i);
            if (!c02g.LIZ.isShowing()) {
                c02g.LIZIZ.LIZJ(false);
                return;
            }
        }
    }

    @Override // X.AnonymousClass112
    public final void show() {
        boolean z;
        if (isShowing()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            LJIJJLI((C281318n) it.next());
        }
        ((ArrayList) this.LJLJLJ).clear();
        View view = this.LJLLLL;
        this.LJLLLLLL = view;
        if (view != null) {
            if (this.LLFFF == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.LLFFF = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.LJLL);
            }
            this.LJLLLLLL.addOnAttachStateChangeListener(this.LJLLI);
        }
    }

    @Override // X.C02O
    public final void LIZJ(boolean z) {
        Iterator it = ((ArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C02G) it.next()).LIZ.LJLJI.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C02I) adapter).notifyDataSetChanged();
        }
    }

    @Override // X.C02O
    public final boolean LJFF(SubMenuC39851hN subMenuC39851hN) {
        Iterator it = ((ArrayList) this.LJLJLLL).iterator();
        while (it.hasNext()) {
            C02G c02g = (C02G) it.next();
            if (subMenuC39851hN == c02g.LIZIZ) {
                c02g.LIZ.LJLJI.requestFocus();
                return true;
            }
        }
        if (subMenuC39851hN.hasVisibleItems()) {
            LJIIJJI(subMenuC39851hN);
            C02N c02n = this.LLFF;
            if (c02n != null) {
                c02n.LIZIZ(subMenuC39851hN);
            }
            return true;
        }
        return false;
    }

    @Override // X.C02O
    public final void LJIIIZ(C02N c02n) {
        this.LLFF = c02n;
    }

    @Override // X.AbstractC37391dP
    public final void LJIIJJI(C281318n c281318n) {
        c281318n.LIZIZ(this, this.LJLILLLLZI);
        if (isShowing()) {
            LJIJJLI(c281318n);
        } else {
            ((ArrayList) this.LJLJLJ).add(c281318n);
        }
    }

    @Override // X.AbstractC37391dP
    public final void LJIILIIL(View view) {
        if (this.LJLLLL != view) {
            this.LJLLLL = view;
            this.LJLLL = Gravity.getAbsoluteGravity(this.LJLLJ, C16310kV.LIZLLL(view));
        }
    }

    @Override // X.AbstractC37391dP
    public final void LJIILJJIL(boolean z) {
        this.LLD = z;
    }

    @Override // X.AbstractC37391dP
    public final void LJIILL(int i) {
        if (this.LJLLJ != i) {
            this.LJLLJ = i;
            this.LJLLL = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(this.LJLLLL));
        }
    }

    @Override // X.AbstractC37391dP
    public final void LJIILLIIL(int i) {
        this.LJZ = true;
        this.LJZL = i;
    }

    @Override // X.AbstractC37391dP
    public final void LJIIZILJ(PopupWindow.OnDismissListener onDismissListener) {
        this.LLFII = onDismissListener;
    }

    @Override // X.AbstractC37391dP
    public final void LJIJ(boolean z) {
        this.LLF = z;
    }

    @Override // X.AbstractC37391dP
    public final void LJIJI(int i) {
        this.LJZI = true;
        this.LL = i;
    }

    public final void LJIJJLI(C281318n c281318n) {
        C02G c02g;
        Rect rect;
        C02I c02i;
        int i;
        int firstVisiblePosition;
        View childAt;
        int i2;
        boolean z;
        int i3;
        int i4;
        int width;
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLILLLLZI);
        C02I c02i2 = new C02I(c281318n, LLZIL, this.LJLJJLL, R.layout.d4);
        if (!isShowing() && this.LLD) {
            c02i2.LJLJI = true;
        } else if (isShowing()) {
            c02i2.LJLJI = AbstractC37391dP.LJIJJ(c281318n);
        }
        int LJIIL = AbstractC37391dP.LJIIL(c02i2, this.LJLILLLLZI, this.LJLJI);
        C39901hS c39901hS = new C39901hS(this.LJLILLLLZI, this.LJLJJI, this.LJLJJL);
        c39901hS.LLIFFJFJJ = this.LJLLILLLL;
        c39901hS.LJLLLLLL = this;
        c39901hS.LLFFF.setOnDismissListener(this);
        c39901hS.LJLLLL = this.LJLLLL;
        c39901hS.LJLLILLLL = this.LJLLL;
        c39901hS.LLFF = true;
        c39901hS.LLFFF.setFocusable(true);
        c39901hS.LLFFF.setInputMethodMode(2);
        c39901hS.LJIILIIL(c02i2);
        c39901hS.LJIILL(LJIIL);
        c39901hS.LJLLILLLL = this.LJLLL;
        if (((ArrayList) this.LJLJLLL).size() > 0) {
            List<C02G> list = this.LJLJLLL;
            c02g = (C02G) U26.LIZIZ((ArrayList) list, 1, list);
            C281318n c281318n2 = c02g.LIZIZ;
            int size = c281318n2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                MenuItem item = c281318n2.getItem(i5);
                if (item.hasSubMenu() && c281318n == item.getSubMenu()) {
                    C03G c03g = c02g.LIZ.LJLJI;
                    ListAdapter adapter = c03g.getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i = headerViewListAdapter.getHeadersCount();
                        c02i = (C02I) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        c02i = (C02I) adapter;
                        i = 0;
                    }
                    int count = c02i.getCount();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= count) {
                            break;
                        }
                        if (item == c02i.getItem(i6)) {
                            if (i6 != -1 && (firstVisiblePosition = (i6 + i) - c03g.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c03g.getChildCount() && (childAt = c03g.getChildAt(firstVisiblePosition)) != null) {
                                if (Build.VERSION.SDK_INT <= 28) {
                                    Method method = C39901hS.LLII;
                                    if (method != null) {
                                        try {
                                            method.invoke(c39901hS.LLFFF, Boolean.FALSE);
                                        } catch (Exception unused) {
                                        }
                                    }
                                } else {
                                    c39901hS.LLFFF.setTouchModal(false);
                                }
                                int i7 = Build.VERSION.SDK_INT;
                                if (i7 >= 23) {
                                    c39901hS.LLFFF.setEnterTransition(null);
                                }
                                List<C02G> list2 = this.LJLJLLL;
                                C03G c03g2 = ((C02G) U26.LIZIZ((ArrayList) list2, 1, list2)).LIZ.LJLJI;
                                int[] iArr = new int[2];
                                c03g2.getLocationOnScreen(iArr);
                                Rect rect2 = new Rect();
                                this.LJLLLLLL.getWindowVisibleDisplayFrame(rect2);
                                if (this.LJLZ != 1 ? iArr[0] - LJIIL >= 0 : c03g2.getWidth() + iArr[0] + LJIIL > rect2.right) {
                                    i2 = 0;
                                    z = false;
                                } else {
                                    i2 = 1;
                                    z = true;
                                }
                                this.LJLZ = i2;
                                if (i7 >= 26) {
                                    c39901hS.LJLLLL = childAt;
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int[] iArr2 = new int[2];
                                    this.LJLLLL.getLocationOnScreen(iArr2);
                                    int[] iArr3 = new int[2];
                                    childAt.getLocationOnScreen(iArr3);
                                    if ((this.LJLLL & 7) == 5) {
                                        iArr2[0] = this.LJLLLL.getWidth() + iArr2[0];
                                        iArr3[0] = childAt.getWidth() + iArr3[0];
                                    }
                                    i3 = iArr3[0] - iArr2[0];
                                    i4 = iArr3[1] - iArr2[1];
                                }
                                if ((this.LJLLL & 5) == 5) {
                                    if (z) {
                                        width = i3 + LJIIL;
                                        c39901hS.LJLJJLL = width;
                                        c39901hS.LJLLI = true;
                                        c39901hS.LJLL = true;
                                        c39901hS.LJI(i4);
                                    } else {
                                        LJIIL = childAt.getWidth();
                                        width = i3 - LJIIL;
                                        c39901hS.LJLJJLL = width;
                                        c39901hS.LJLLI = true;
                                        c39901hS.LJLL = true;
                                        c39901hS.LJI(i4);
                                    }
                                } else {
                                    if (z) {
                                        width = i3 + childAt.getWidth();
                                        c39901hS.LJLJJLL = width;
                                        c39901hS.LJLLI = true;
                                        c39901hS.LJLL = true;
                                        c39901hS.LJI(i4);
                                    }
                                    width = i3 - LJIIL;
                                    c39901hS.LJLJJLL = width;
                                    c39901hS.LJLLI = true;
                                    c39901hS.LJLL = true;
                                    c39901hS.LJI(i4);
                                }
                            }
                        } else {
                            i6++;
                        }
                    }
                } else {
                    i5++;
                }
            }
            ((ArrayList) this.LJLJLLL).add(new C02G(c39901hS, c281318n, this.LJLZ));
            c39901hS.show();
            C03G c03g3 = c39901hS.LJLJI;
            c03g3.setOnKeyListener(this);
            if (c02g != null && this.LLF && c281318n.LJIIL != null) {
                View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.da, c03g3, false);
                TextView textView = (TextView) LLLLIILL.findViewById(android.R.id.title);
                LLLLIILL.setEnabled(false);
                textView.setText(c281318n.LJIIL);
                c03g3.addHeaderView(LLLLIILL, null, false);
                c39901hS.show();
                return;
            }
            return;
        }
        c02g = null;
        if (this.LJZ) {
            c39901hS.LJLJJLL = this.LJZL;
        }
        if (this.LJZI) {
            c39901hS.LJI(this.LL);
        }
        Rect rect3 = this.LJLIL;
        if (rect3 != null) {
            rect = new Rect(rect3);
        } else {
            rect = null;
        }
        c39901hS.LLF = rect;
        ((ArrayList) this.LJLJLLL).add(new C02G(c39901hS, c281318n, this.LJLZ));
        c39901hS.show();
        C03G c03g32 = c39901hS.LJLJI;
        c03g32.setOnKeyListener(this);
        if (c02g != null) {
        }
    }

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
        int i;
        int size = ((ArrayList) this.LJLJLLL).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c281318n == ((C02G) ListProtector.get(this.LJLJLLL, i2)).LIZIZ) {
                if (i2 < 0) {
                    return;
                }
                int i3 = i2 + 1;
                if (i3 < ((ArrayList) this.LJLJLLL).size()) {
                    ((C02G) ListProtector.get(this.LJLJLLL, i3)).LIZIZ.LIZJ(false);
                }
                C02G c02g = (C02G) ListProtector.remove(this.LJLJLLL, i2);
                c02g.LIZIZ.LJIIZILJ(this);
                if (this.LLFZ) {
                    C39901hS c39901hS = c02g.LIZ;
                    if (Build.VERSION.SDK_INT >= 23) {
                        c39901hS.LLFFF.setExitTransition(null);
                    } else {
                        c39901hS.getClass();
                    }
                    c02g.LIZ.LLFFF.setAnimationStyle(0);
                }
                c02g.LIZ.dismiss();
                int size2 = ((ArrayList) this.LJLJLLL).size();
                if (size2 > 0) {
                    this.LJLZ = ((C02G) ListProtector.get(this.LJLJLLL, size2 - 1)).LIZJ;
                } else {
                    if (C16310kV.LIZLLL(this.LJLLLL) == 1) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.LJLZ = i;
                    if (size2 == 0) {
                        dismiss();
                        C02N c02n = this.LLFF;
                        if (c02n != null) {
                            c02n.LIZ(c281318n, true);
                        }
                        ViewTreeObserver viewTreeObserver = this.LLFFF;
                        if (viewTreeObserver != null) {
                            if (viewTreeObserver.isAlive()) {
                                this.LLFFF.removeGlobalOnLayoutListener(this.LJLL);
                            }
                            this.LLFFF = null;
                        }
                        this.LJLLLLLL.removeOnAttachStateChangeListener(this.LJLLI);
                        this.LLFII.onDismiss();
                        return;
                    }
                }
                if (z) {
                    ((C02G) ListProtector.get(this.LJLJLLL, 0)).LIZIZ.LIZJ(false);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    public ViewOnKeyListenerC39831hL(Context context, View view, int i, int i2, boolean z) {
        this.LJLILLLLZI = context;
        this.LJLLLL = view;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = z;
        this.LJLZ = C16310kV.LIZLLL(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.LJLJI = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.bw));
        this.LJLJL = new Handler();
    }
}
