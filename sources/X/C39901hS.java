package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: X.1hS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39901hS extends C19M implements InterfaceC012303b {
    public static final Method LLII;
    public C281118l LLIFFJFJJ;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                LLII = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // X.InterfaceC012303b
    public final void LIZJ(C281318n c281318n, MenuItem menuItem) {
        C281118l c281118l = this.LLIFFJFJJ;
        if (c281118l != null) {
            c281118l.LIZJ(c281318n, menuItem);
        }
    }

    @Override // X.InterfaceC012303b
    public final void LJ(C281318n c281318n, C281618q c281618q) {
        C281118l c281118l = this.LLIFFJFJJ;
        if (c281118l != null) {
            c281118l.LJ(c281318n, c281618q);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.03G, X.19O] */
    @Override // X.C19M
    public final C03G LJIILJJIL(final Context context, final boolean z) {
        ?? r0 = new C03G(context, z) { // from class: X.19O
            public final int LJLLL;
            public final int LJLLLL;
            public InterfaceC012303b LJLLLLLL;
            public C281618q LJLZ;

            @Override // X.C03G, android.view.View
            public final boolean onHoverEvent(MotionEvent motionEvent) {
                C02I c02i;
                int i;
                C281618q c281618q;
                int pointToPosition;
                int i2;
                if (this.LJLLLLLL != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i = headerViewListAdapter.getHeadersCount();
                        c02i = (C02I) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        c02i = (C02I) adapter;
                        i = 0;
                    }
                    if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c02i.getCount()) {
                        c281618q = c02i.LIZJ(i2);
                    } else {
                        c281618q = null;
                    }
                    C281618q c281618q2 = this.LJLZ;
                    if (c281618q2 != c281618q) {
                        C281318n c281318n = c02i.LJLIL;
                        if (c281618q2 != null) {
                            this.LJLLLLLL.LIZJ(c281318n, c281618q2);
                        }
                        this.LJLZ = c281618q;
                        if (c281618q != null) {
                            this.LJLLLLLL.LJ(c281318n, c281618q);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            public void setHoverListener(InterfaceC012303b interfaceC012303b) {
                this.LJLLLLLL = interfaceC012303b;
            }

            @Override // X.C03G, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }

            {
                super(context, z);
                if (1 == C012403c.LIZ(context)) {
                    this.LJLLL = 21;
                    this.LJLLLL = 22;
                } else {
                    this.LJLLL = 22;
                    this.LJLLLL = 21;
                }
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C02I c02i;
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null) {
                    if (i == this.LJLLL) {
                        if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                            performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                        }
                        return true;
                    }
                    if (i == this.LJLLLL) {
                        setSelection(-1);
                        ListAdapter adapter = getAdapter();
                        if (adapter instanceof HeaderViewListAdapter) {
                            c02i = (C02I) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                        } else {
                            c02i = (C02I) adapter;
                        }
                        c02i.LJLIL.LIZJ(false);
                        return true;
                    }
                }
                return super.onKeyDown(i, keyEvent);
            }
        };
        r0.setHoverListener(this);
        return r0;
    }

    public C39901hS(Context context, int i, int i2) {
        super(context, null, i, i2);
    }
}
