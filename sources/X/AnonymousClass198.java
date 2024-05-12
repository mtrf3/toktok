package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.198, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass198 implements C02O {
    public C281318n LJLIL;
    public C281618q LJLILLLLZI;
    public final /* synthetic */ C011902x LJLJI;

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
    }

    @Override // X.C02O
    public final Parcelable LIZIZ() {
        return null;
    }

    @Override // X.C02O
    public final boolean LJFF(SubMenuC39851hN subMenuC39851hN) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJII() {
        return false;
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
    }

    @Override // X.C02O
    public final int getId() {
        return 0;
    }

    public AnonymousClass198(C011902x c011902x) {
        this.LJLJI = c011902x;
    }

    @Override // X.C02O
    public final void LIZJ(boolean z) {
        if (this.LJLILLLLZI != null) {
            C281318n c281318n = this.LJLIL;
            if (c281318n != null) {
                int size = c281318n.size();
                for (int i = 0; i < size; i++) {
                    if (this.LJLIL.getItem(i) == this.LJLILLLLZI) {
                        return;
                    }
                }
            }
            LJ(this.LJLILLLLZI);
        }
    }

    @Override // X.C02O
    public final boolean LJ(C281618q c281618q) {
        KeyEvent.Callback callback = this.LJLJI.LJLJLLL;
        if (callback instanceof InterfaceC25590zT) {
            ((InterfaceC25590zT) callback).onActionViewCollapsed();
        }
        C011902x c011902x = this.LJLJI;
        C16880lQ.LJZL(c011902x, c011902x.LJLJLLL);
        C011902x c011902x2 = this.LJLJI;
        C16880lQ.LJZL(c011902x2, c011902x2.LJLJLJ);
        C011902x c011902x3 = this.LJLJI;
        c011902x3.LJLJLLL = null;
        int size = c011902x3.LLIIII.size();
        while (true) {
            size--;
            if (size >= 0) {
                c011902x3.addView((View) ListProtector.get(c011902x3.LLIIII, size));
            } else {
                c011902x3.LLIIII.clear();
                this.LJLILLLLZI = null;
                this.LJLJI.requestLayout();
                c281618q.LJFF(false);
                return true;
            }
        }
    }

    @Override // X.C02O
    public final boolean LJI(C281618q c281618q) {
        this.LJLJI.LIZJ();
        ViewParent parent = this.LJLJI.LJLJLJ.getParent();
        C011902x c011902x = this.LJLJI;
        if (parent != c011902x) {
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(c011902x.LJLJLJ, (ViewGroup) parent);
            }
            C011902x c011902x2 = this.LJLJI;
            c011902x2.addView(c011902x2.LJLJLJ);
        }
        this.LJLJI.LJLJLLL = c281618q.getActionView();
        this.LJLILLLLZI = c281618q;
        ViewParent parent2 = this.LJLJI.LJLJLLL.getParent();
        C011902x c011902x3 = this.LJLJI;
        if (parent2 != c011902x3) {
            if (parent2 instanceof ViewGroup) {
                C16880lQ.LJLLL(c011902x3.LJLJLLL, (ViewGroup) parent2);
            }
            this.LJLJI.getClass();
            AnonymousClass199 anonymousClass199 = new AnonymousClass199();
            C011902x c011902x4 = this.LJLJI;
            anonymousClass199.LIZ = (c011902x4.LJLLL & 112) | 8388611;
            anonymousClass199.LIZIZ = 2;
            c011902x4.LJLJLLL.setLayoutParams(anonymousClass199);
            C011902x c011902x5 = this.LJLJI;
            c011902x5.addView(c011902x5.LJLJLLL);
        }
        C011902x c011902x6 = this.LJLJI;
        int childCount = c011902x6.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = c011902x6.getChildAt(childCount);
            if (((AnonymousClass199) childAt.getLayoutParams()).LIZIZ != 2 && childAt != c011902x6.LJLIL) {
                try {
                    if (C78996UzQ.LJJIIJZLJL(c011902x6.getChildAt(childCount))) {
                        C78996UzQ.LJI();
                    }
                } catch (Throwable unused) {
                }
                c011902x6.removeViewAt(childCount);
                c011902x6.LLIIII.add(childAt);
            }
        }
        this.LJLJI.requestLayout();
        c281618q.LJFF(true);
        KeyEvent.Callback callback = this.LJLJI.LJLJLLL;
        if (callback instanceof InterfaceC25590zT) {
            ((InterfaceC25590zT) callback).onActionViewExpanded();
        }
        return true;
    }

    @Override // X.C02O
    public final void LJIIIIZZ(Context context, C281318n c281318n) {
        C281618q c281618q;
        C281318n c281318n2 = this.LJLIL;
        if (c281318n2 != null && (c281618q = this.LJLILLLLZI) != null) {
            c281318n2.LIZLLL(c281618q);
        }
        this.LJLIL = c281318n;
    }
}
