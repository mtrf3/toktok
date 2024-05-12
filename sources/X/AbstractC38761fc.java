package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.1fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38761fc extends C16120kC {
    public static final Rect LJIIJ = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
    public static final C38741fa LJIIJJI = new InterfaceC270214g<C17760mq>() { // from class: X.1fa
    };
    public static final C270114f LJIIL = new Object() { // from class: X.14f
    };
    public final AccessibilityManager LJ;
    public final View LJFF;
    public C38751fb LJI;
    public final Rect LIZ = new Rect();
    public final Rect LIZIZ = new Rect();
    public final Rect LIZJ = new Rect();
    public final int[] LIZLLL = new int[2];
    public int LJII = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJIIIIZZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJIIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;

    public abstract void LIZJ(List<Integer> list);

    public abstract boolean LJFF(int i, int i2);

    public void LJI(C17760mq c17760mq) {
    }

    public abstract void LJII(int i, C17760mq c17760mq);

    public void LJIIIIZZ(int i, boolean z) {
    }

    public AbstractC38761fc(View view) {
        if (view != null) {
            this.LJFF = view;
            this.LJ = (AccessibilityManager) C16880lQ.LLILL(view.getContext(), "accessibility");
            view.setFocusable(true);
            if (C16300kU.LIZJ(view) == 0) {
                C16300kU.LJIJ(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final boolean LIZ(int i) {
        if (this.LJIIIIZZ != i) {
            return false;
        }
        this.LJIIIIZZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        LJIIIIZZ(i, false);
        LJIIJ(i, 8);
        return true;
    }

    public final C17760mq LIZIZ(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C17760mq c17760mq = new C17760mq(obtain);
        c17760mq.LJIJJ(true);
        c17760mq.LJIJJLI(true);
        c17760mq.LJIILJJIL("android.view.View");
        Rect rect = LJIIJ;
        c17760mq.LJIIJ(rect);
        c17760mq.LJIIJJI(rect);
        c17760mq.LJJI(this.LJFF);
        LJII(i, c17760mq);
        if (c17760mq.LJI() != null || c17760mq.LJ() != null) {
            c17760mq.LIZLLL(this.LIZIZ);
            if (!this.LIZIZ.equals(rect)) {
                int actions = obtain.getActions();
                if ((actions & 64) == 0) {
                    if ((actions & 128) == 0) {
                        obtain.setPackageName(this.LJFF.getContext().getPackageName());
                        View view = this.LJFF;
                        c17760mq.LIZJ = i;
                        obtain.setSource(view, i);
                        if (this.LJII == i) {
                            c17760mq.LJIIIIZZ(true);
                            c17760mq.LIZ(128);
                        } else {
                            c17760mq.LJIIIIZZ(false);
                            c17760mq.LIZ(64);
                        }
                        if (this.LJIIIIZZ == i) {
                            z = true;
                            c17760mq.LIZ(2);
                        } else {
                            z = false;
                            if (obtain.isFocusable()) {
                                c17760mq.LIZ(1);
                            }
                        }
                        obtain.setFocused(z);
                        this.LJFF.getLocationOnScreen(this.LIZLLL);
                        obtain.getBoundsInScreen(this.LIZ);
                        if (this.LIZ.equals(rect)) {
                            c17760mq.LIZLLL(this.LIZ);
                            if (c17760mq.LIZIZ != -1) {
                                C17760mq c17760mq2 = new C17760mq(AccessibilityNodeInfo.obtain());
                                for (int i2 = c17760mq.LIZIZ; i2 != -1; i2 = c17760mq2.LIZIZ) {
                                    View view2 = this.LJFF;
                                    c17760mq2.LIZIZ = -1;
                                    c17760mq2.LIZ.setParent(view2, -1);
                                    c17760mq2.LJIIJ(LJIIJ);
                                    LJII(i2, c17760mq2);
                                    c17760mq2.LIZLLL(this.LIZIZ);
                                    Rect rect2 = this.LIZ;
                                    Rect rect3 = this.LIZIZ;
                                    rect2.offset(rect3.left, rect3.top);
                                }
                                c17760mq2.LIZ.recycle();
                            }
                            this.LIZ.offset(this.LIZLLL[0] - this.LJFF.getScrollX(), this.LIZLLL[1] - this.LJFF.getScrollY());
                        }
                        if (this.LJFF.getLocalVisibleRect(this.LIZJ)) {
                            this.LIZJ.offset(this.LIZLLL[0] - this.LJFF.getScrollX(), this.LIZLLL[1] - this.LJFF.getScrollY());
                            if (this.LIZ.intersect(this.LIZJ)) {
                                c17760mq.LJIIJJI(this.LIZ);
                                Rect rect4 = this.LIZ;
                                if (rect4 != null && !rect4.isEmpty() && this.LJFF.getWindowVisibility() == 0) {
                                    Object parent = this.LJFF.getParent();
                                    while (true) {
                                        if (parent instanceof View) {
                                            View view3 = (View) parent;
                                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                                break;
                                            }
                                            parent = view3.getParent();
                                        } else if (parent != null) {
                                            c17760mq.LIZ.setVisibleToUser(true);
                                        }
                                    }
                                }
                            }
                        }
                        return c17760mq;
                    }
                    throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                }
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    }

    public final C17760mq LJ(int i) {
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.LJFF);
            C17760mq c17760mq = new C17760mq(obtain);
            this.LJFF.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            LIZJ(arrayList);
            if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c17760mq.LIZ.addChild(this.LJFF, ((Integer) ListProtector.get(arrayList, i2)).intValue());
                }
                return c17760mq;
            }
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        return LIZIZ(i);
    }

    public final boolean LJIIIZ(int i) {
        int i2;
        if ((!this.LJFF.isFocused() && !this.LJFF.requestFocus()) || (i2 = this.LJIIIIZZ) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            LIZ(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.LJIIIIZZ = i;
        LJIIIIZZ(i, true);
        LJIIJ(i, 8);
        return true;
    }

    public final void LJIIJJI(int i) {
        int i2 = this.LJIIIZ;
        if (i2 == i) {
            return;
        }
        this.LJIIIZ = i;
        LJIIJ(i, 128);
        LJIIJ(i2, 256);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1fb] */
    @Override // X.C16120kC
    public final C17780ms getAccessibilityNodeProvider(View view) {
        if (this.LJI == null) {
            this.LJI = new C17780ms() { // from class: X.1fb
                @Override // X.C17780ms
                public final C17760mq LIZ(int i) {
                    return new C17760mq(AccessibilityNodeInfo.obtain(AbstractC38761fc.this.LJ(i).LIZ));
                }

                @Override // X.C17780ms
                public final C17760mq LIZJ(int i) {
                    int i2;
                    if (i == 2) {
                        i2 = AbstractC38761fc.this.LJII;
                    } else {
                        i2 = AbstractC38761fc.this.LJIIIIZZ;
                    }
                    if (i2 == Integer.MIN_VALUE) {
                        return null;
                    }
                    return LIZ(i2);
                }

                @Override // X.C17780ms
                public final boolean LIZLLL(int i, int i2, Bundle bundle) {
                    int i3;
                    AbstractC38761fc abstractC38761fc = AbstractC38761fc.this;
                    if (i != -1) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 64) {
                                    if (i2 != 128) {
                                        return abstractC38761fc.LJFF(i, i2);
                                    }
                                    if (abstractC38761fc.LJII == i) {
                                        abstractC38761fc.LJII = LiveLayoutPreloadThreadPriority.DEFAULT;
                                        abstractC38761fc.LJFF.invalidate();
                                        abstractC38761fc.LJIIJ(i, 65536);
                                        return true;
                                    }
                                } else if (abstractC38761fc.LJ.isEnabled() && abstractC38761fc.LJ.isTouchExplorationEnabled() && (i3 = abstractC38761fc.LJII) != i) {
                                    if (i3 != Integer.MIN_VALUE) {
                                        abstractC38761fc.LJII = LiveLayoutPreloadThreadPriority.DEFAULT;
                                        abstractC38761fc.LJFF.invalidate();
                                        abstractC38761fc.LJIIJ(i3, 65536);
                                    }
                                    abstractC38761fc.LJII = i;
                                    abstractC38761fc.LJFF.invalidate();
                                    abstractC38761fc.LJIIJ(i, 32768);
                                    return true;
                                }
                                return false;
                            }
                            return abstractC38761fc.LIZ(i);
                        }
                        return abstractC38761fc.LJIIIZ(i);
                    }
                    return C16300kU.LJIIIZ(abstractC38761fc.LJFF, i2, bundle);
                }
            };
        }
        return this.LJI;
    }

    public final boolean LIZLLL(int i, Rect rect) {
        final boolean z;
        Object obj;
        int lastIndexOf;
        int i2;
        ArrayList arrayList = new ArrayList();
        LIZJ(arrayList);
        C0MB c0mb = new C0MB();
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c0mb.LJI(((Integer) ListProtector.get(arrayList, i4)).intValue(), LIZIZ(((Integer) ListProtector.get(arrayList, i4)).intValue()));
        }
        int i5 = this.LJIIIIZZ;
        Object obj2 = null;
        if (i5 != Integer.MIN_VALUE) {
            obj2 = c0mb.LJ(i5, null);
        }
        int i6 = -1;
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                Rect rect2 = new Rect();
                int i7 = this.LJIIIIZZ;
                if (i7 != Integer.MIN_VALUE) {
                    LJ(i7).LIZLLL(rect2);
                } else if (rect != null) {
                    rect2.set(rect);
                } else {
                    View view = this.LJFF;
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i == 130) {
                                    rect2.set(0, -1, width, -1);
                                } else {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                            } else {
                                rect2.set(-1, 0, -1, height);
                            }
                        } else {
                            rect2.set(0, height, width, height);
                        }
                    } else {
                        rect2.set(width, 0, width, height);
                    }
                }
                C270114f c270114f = LJIIL;
                C38741fa c38741fa = LJIIJJI;
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                rect3.offset(0, -(rect2.height() + 1));
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect3.offset(-(rect2.width() + 1), 0);
                        }
                    } else {
                        rect3.offset(0, rect2.height() + 1);
                    }
                } else {
                    rect3.offset(rect2.width() + 1, 0);
                }
                c270114f.getClass();
                int LJIIIIZZ = c0mb.LJIIIIZZ();
                Rect rect4 = new Rect();
                obj = null;
                for (int i8 = 0; i8 < LJIIIIZZ; i8++) {
                    C17760mq c17760mq = (C17760mq) c0mb.LJIIIZ(i8);
                    if (c17760mq != obj2) {
                        c38741fa.getClass();
                        c17760mq.LIZLLL(rect4);
                        if (C270414i.LIZJ(i, rect2, rect4)) {
                            if (C270414i.LIZJ(i, rect2, rect3) && !C270414i.LIZ(i, rect2, rect4, rect3)) {
                                if (!C270414i.LIZ(i, rect2, rect3, rect4)) {
                                    int LIZLLL = C270414i.LIZLLL(i, rect2, rect4);
                                    int LJ = C270414i.LJ(i, rect2, rect4);
                                    int i9 = (LJ * LJ) + (LIZLLL * 13 * LIZLLL);
                                    int LIZLLL2 = C270414i.LIZLLL(i, rect2, rect3);
                                    int LJ2 = C270414i.LJ(i, rect2, rect3);
                                    if (i9 >= (LJ2 * LJ2) + (LIZLLL2 * 13 * LIZLLL2)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            obj = c17760mq;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        } else {
            if (C16310kV.LIZLLL(this.LJFF) == 1) {
                z = true;
            } else {
                z = false;
            }
            C270114f c270114f2 = LJIIL;
            final C38741fa c38741fa2 = LJIIJJI;
            c270114f2.getClass();
            int LJIIIIZZ2 = c0mb.LJIIIIZZ();
            ArrayList arrayList2 = new ArrayList(LJIIIIZZ2);
            for (int i10 = 0; i10 < LJIIIIZZ2; i10++) {
                arrayList2.add(c0mb.LJIIIZ(i10));
            }
            Collections.sort(arrayList2, new Comparator<T>(z, c38741fa2) { // from class: X.14h
                public final Rect LJLIL = new Rect();
                public final Rect LJLILLLLZI = new Rect();
                public final boolean LJLJI;
                public final InterfaceC270214g<T> LJLJJI;

                {
                    this.LJLJI = z;
                    this.LJLJJI = c38741fa2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Rect rect5 = this.LJLIL;
                    Rect rect6 = this.LJLILLLLZI;
                    this.LJLJJI.getClass();
                    ((C17760mq) t).LIZLLL(rect5);
                    this.LJLJJI.getClass();
                    ((C17760mq) t2).LIZLLL(rect6);
                    int i11 = rect5.top;
                    int i12 = rect6.top;
                    if (i11 < i12) {
                        return -1;
                    }
                    if (i11 > i12) {
                        return 1;
                    }
                    int i13 = rect5.left;
                    int i14 = rect6.left;
                    if (i13 < i14) {
                        if (!this.LJLJI) {
                            return -1;
                        }
                        return 1;
                    }
                    if (i13 > i14) {
                        if (this.LJLJI) {
                            return -1;
                        }
                        return 1;
                    }
                    int i15 = rect5.bottom;
                    int i16 = rect6.bottom;
                    if (i15 < i16) {
                        return -1;
                    }
                    if (i15 > i16) {
                        return 1;
                    }
                    int i17 = rect5.right;
                    int i18 = rect6.right;
                    if (i17 < i18) {
                        if (!this.LJLJI) {
                            return -1;
                        }
                        return 1;
                    }
                    if (i17 > i18) {
                        if (this.LJLJI) {
                            return -1;
                        }
                        return 1;
                    }
                    return 0;
                }
            });
            if (i != 1) {
                int size = arrayList2.size();
                if (obj2 == null) {
                    lastIndexOf = -1;
                } else {
                    lastIndexOf = arrayList2.lastIndexOf(obj2);
                }
                int i11 = lastIndexOf + 1;
                if (i11 < size) {
                    obj = ListProtector.get(arrayList2, i11);
                }
                i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
            } else {
                int size2 = arrayList2.size();
                if (obj2 != null) {
                    size2 = arrayList2.indexOf(obj2);
                }
                int i12 = size2 - 1;
                if (i12 >= 0) {
                    obj = ListProtector.get(arrayList2, i12);
                }
                i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
            }
            return LJIIIZ(i2);
        }
        if (obj != null) {
            if (c0mb.LJLIL) {
                c0mb.LIZLLL();
            }
            while (true) {
                if (i3 >= c0mb.LJLJJI) {
                    break;
                }
                if (c0mb.LJLJI[i3] == obj) {
                    i6 = i3;
                    break;
                }
                i3++;
            }
            i2 = c0mb.LJFF(i6);
            return LJIIIZ(i2);
        }
        i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
        return LJIIIZ(i2);
    }

    public final void LJIIJ(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.LJ.isEnabled() || (parent = this.LJFF.getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C17760mq LJ = LJ(i);
            obtain.getText().add(LJ.LJI());
            obtain.setContentDescription(LJ.LJ());
            obtain.setScrollable(LJ.LIZ.isScrollable());
            obtain.setPassword(LJ.LIZ.isPassword());
            obtain.setEnabled(LJ.LIZ.isEnabled());
            obtain.setChecked(LJ.LIZ.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(LJ.LIZ.getClassName());
                C17800mu.LIZ(obtain, this.LJFF, i);
                obtain.setPackageName(this.LJFF.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.LJFF.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(this.LJFF, obtain);
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        LJI(c17760mq);
    }
}
