package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes15.dex */
public final class VZA extends ViewGroup {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final Scroller LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public VZJ LLF;
    public final int LLFF;
    public final int LLFFF;
    public final float LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public final int LLIIIJ;
    public float LLIIIL;
    public float LLIIIZ;
    public float LLIIJI;
    public float LLIIJLIL;
    public VZK LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public final List<VZG> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public float LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public final GestureDetector LLJILJILJ;

    public final void LJIJ() {
        int right;
        boolean z;
        if (getChildCount() < 1) {
            return;
        }
        View currentView = getCurrentView();
        int scrollDistance = getScrollDistance();
        int LJIIIIZZ = LJIIIIZZ(currentView) - scrollDistance;
        if (LJIIJJI()) {
            right = currentView.getBottom();
        } else {
            right = currentView.getRight();
        }
        int i = right - scrollDistance;
        if (LJ() && ((VZH) currentView.getLayoutParams()).LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int pile = getPile();
            if (LJIIJJI()) {
                this.LJLJLLL.startScroll(0, scrollDistance, 0, (i + this.LLILIL) - pile, this.LLJ);
            } else if (this.LJLLLL) {
                this.LJLJLLL.startScroll(scrollDistance, 0, (LJIIIIZZ - this.LLILIL) - (getChildExpectSize() + getPile()), 0, this.LLJ);
            } else {
                this.LJLJLLL.startScroll(scrollDistance, 0, (i + this.LLILIL) - pile, 0, this.LLJ);
            }
        } else if (LJFF() && ((VZH) currentView.getLayoutParams()).LIZ == this.LJLJJL - 1) {
            int childExpectSize = getChildExpectSize() + getPile();
            if (LJIIJJI()) {
                this.LJLJLLL.startScroll(0, scrollDistance, 0, (LJIIIIZZ - this.LLILIL) - childExpectSize, this.LLJ);
            } else if (this.LJLLLL) {
                this.LJLJLLL.startScroll(scrollDistance, 0, (i + this.LLILIL) - getPile(), 0, this.LLJ);
            } else {
                this.LJLJLLL.startScroll(scrollDistance, 0, (LJIIIIZZ - this.LLILIL) - childExpectSize, 0, this.LLJ);
            }
        } else {
            int childExpectSize2 = (getChildExpectSize() / 2) + getPile();
            int i2 = (LJIIIIZZ + i) / 2;
            if (LJIIJJI()) {
                this.LJLJLLL.startScroll(0, scrollDistance, 0, i2 - childExpectSize2, this.LJZL);
            } else {
                this.LJLJLLL.startScroll(scrollDistance, 0, i2 - childExpectSize2, 0, this.LJZL);
            }
        }
        setScrollState(2);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setScrollState(0);
        Scroller scroller = this.LJLJLLL;
        if (scroller != null && !scroller.isFinished()) {
            this.LJLJLLL.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void LIZLLL() {
        boolean z;
        if (this.LLIIL != null && this.LJLJJL > 0) {
            boolean z2 = false;
            if (this.LJLILLLLZI || this.LJLJI || this.LJLJJI) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLIZ && !z) {
                return;
            }
            LJIJJ(this.LLIILZL, z);
            int i = this.LJLJLJ;
            if (i != -1 && i != this.LJLJJLL) {
                z2 = this.LJLIL;
            } else {
                i = this.LJLJJLL;
                if (i == -1) {
                    return;
                }
            }
            if (i >= 0 && i < this.LJLJJL) {
                LJIJI(i, 1, z2);
            }
        }
    }

    public final boolean LJ() {
        if (this.LLILLL && !this.LJLLL && !this.LJLLI) {
            float f = this.LLJI;
            if (f > 0.0f && f < 1.0f && this.LLIIL != null && (this.LLJIJIL >= 0.0f ? this.LJLJJL >= 3 : this.LJLJJL >= 2) && !this.LJLJJI && !this.LJLILLLLZI && !this.LJLJI) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF() {
        if (this.LLILLL && !this.LJLLL && !this.LJLLI) {
            float f = this.LLJIJIL;
            if (f > 0.0f && f < 1.0f && this.LLIIL != null && (this.LLJI >= 0.0f ? this.LJLJJL >= 3 : this.LJLJJL >= 2) && !this.LJLJJI && !this.LJLILLLLZI && !this.LJLJI) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIJ() {
        if (this.LJLLLL && this.LL == 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI() {
        if (this.LL == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public final void LJIILLIIL() {
        int childExpectSize;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.LJLJJL < 1 || (childExpectSize = getChildExpectSize()) <= 0) {
            return;
        }
        int scrollDistance = getScrollDistance();
        int i10 = this.LLILIL + childExpectSize;
        if (i10 <= 0) {
            return;
        }
        int i11 = scrollDistance / i10;
        int i12 = scrollDistance % i10;
        if (LJIIJ()) {
            if (this.LJLLL) {
                if (scrollDistance > 0) {
                    if (i12 != 0) {
                        i11++;
                    } else {
                        i11 %= this.LJLJJL;
                    }
                    int width = (getWidth() + scrollDistance) - i12;
                    if (i12 == 0) {
                        i9 = 0;
                    } else {
                        i9 = this.LLILIL + childExpectSize;
                    }
                    i3 = width + i9;
                } else {
                    i3 = (getWidth() + scrollDistance) - i12;
                }
                int i13 = this.LJLJJL;
                i = (i13 - i11) % i13;
                if (i < 0) {
                    i += i13;
                }
            } else {
                int paddingRight = getPaddingRight() - this.LLIILZL;
                i = 0;
                while (true) {
                    if (i < this.LJLJJL - 1) {
                        int i14 = i + 1;
                        if (scrollDistance < (getWidth() + (this.LLILLIZIL - paddingRight)) - (i14 * i10)) {
                            break;
                        } else {
                            i = i14;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
                i3 = (getWidth() + (this.LLILLIZIL - paddingRight)) - (i10 * i);
            }
            i2 = 0;
        } else {
            if (this.LJLLL) {
                if (scrollDistance < 0) {
                    if (i12 != 0) {
                        i11--;
                    }
                    int i15 = this.LJLJJL;
                    i = ((i11 % i15) + i15) % i15;
                    if (i12 == 0) {
                        i4 = -this.LLILIL;
                    } else {
                        i4 = childExpectSize;
                    }
                    i2 = ((scrollDistance - i4) - i12) - this.LLILIL;
                } else {
                    i = i11 % this.LJLJJL;
                    i2 = scrollDistance - i12;
                }
            } else {
                int paddingLeft = getPaddingLeft() + this.LLIILZL;
                i = 0;
                while (true) {
                    if (i < this.LJLJJL) {
                        int i16 = i + 1;
                        if (scrollDistance < (i16 * i10) + this.LLILL + paddingLeft) {
                            break;
                        } else {
                            i = i16;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
                i2 = (i10 * i) + this.LLILL + paddingLeft;
            }
            i3 = 0;
        }
        int max = Math.max(0, getPageGap()) + scrollDistance;
        ?? arrayList = new ArrayList();
        if (!this.LJLLLLLL) {
            arrayList = getAllChildren();
            while (true) {
                View LJIIIZ = LJIIIZ(i);
                arrayList.remove(LJIIIZ);
                if (LJIIJ()) {
                    i2 = i3 - childExpectSize;
                } else {
                    i3 = i2 + childExpectSize;
                }
                LJIILL(LJIIIZ, i2, i3);
                LJIJJLI();
                if (LJIIJ()) {
                    if (i2 <= scrollDistance) {
                        break;
                    }
                    i3 = i2 - this.LLILIL;
                    i7 = i + 1;
                    i8 = this.LJLJJL;
                    if (i7 < i8 && !this.LJLLL) {
                        break;
                    } else {
                        i = i7 % i8;
                    }
                } else {
                    if (i3 >= max) {
                        break;
                    }
                    i2 = this.LLILIL + i3;
                    i7 = i + 1;
                    i8 = this.LJLJJL;
                    if (i7 < i8) {
                    }
                    i = i7 % i8;
                }
            }
        } else {
            if (!this.LJLLL) {
                int i17 = i2;
                int i18 = i3;
                for (int i19 = i - 1; i19 >= 0; i19--) {
                    View LJIIIZ2 = LJIIIZ(i19);
                    if (LJIIJ()) {
                        i6 = i18 + this.LLILIL;
                        i5 = i6 + childExpectSize;
                    } else {
                        i5 = i17 - this.LLILIL;
                        i6 = i5 - childExpectSize;
                    }
                    i17 = i6;
                    i18 = i5;
                    if ((LJIIJ() && i17 - this.LLILIL >= max) || (!LJIIJ() && this.LLILIL + i18 <= scrollDistance)) {
                        arrayList.add(LJIIIZ2);
                    }
                    LJIILL(LJIIIZ2, i17, i18);
                }
                while (i < this.LJLJJL) {
                    View LJIIIZ3 = LJIIIZ(i);
                    if (LJIIJ()) {
                        i2 = i3 - childExpectSize;
                    } else {
                        i3 = i2 + childExpectSize;
                    }
                    if ((LJIIJ() && i3 <= scrollDistance) || (!LJIIJ() && i2 >= max)) {
                        arrayList.add(LJIIIZ3);
                    }
                    LJIILL(LJIIIZ3, i2, i3);
                    if (LJIIJ()) {
                        i3 = i2 - this.LLILIL;
                    } else {
                        i2 = this.LLILIL + i3;
                    }
                    i++;
                }
            } else {
                int i20 = i;
                do {
                    View LJIIIZ4 = LJIIIZ(i20);
                    if (LJIIJ()) {
                        i2 = i3 - childExpectSize;
                    } else {
                        i3 = i2 + childExpectSize;
                    }
                    if ((LJIIJ() && i3 <= scrollDistance) || (!LJIIJ() && i2 >= max)) {
                        arrayList.add(LJIIIZ4);
                    }
                    LJIILL(LJIIIZ4, i2, i3);
                    if (LJIIJ()) {
                        i3 = i2 - this.LLILIL;
                    } else {
                        i2 = this.LLILIL + i3;
                    }
                    i20 = (i20 + 1) % this.LJLJJL;
                } while (i20 != i);
            }
            LJIJJLI();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LJIILJJIL((View) it.next(), this.LJLLLLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI() {
        /*
            r6 = this;
            X.VZJ r0 = r6.LLF
            if (r0 == 0) goto L8b
            int r0 = r6.getChildCount()
            r5 = -1
            int r4 = r0 + (-1)
        Lb:
            if (r4 <= r5) goto L8b
            android.view.View r3 = r6.getChildAt(r4)
            boolean r0 = r6.LJ()
            r2 = 1
            if (r0 == 0) goto L25
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.VZH r0 = (X.VZH) r0
            int r0 = r0.LIZ
            if (r0 != 0) goto L25
        L22:
            int r4 = r4 + (-1)
            goto Lb
        L25:
            boolean r0 = r6.LJFF()
            if (r0 == 0) goto L39
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.VZH r0 = (X.VZH) r0
            int r1 = r0.LIZ
            int r0 = r6.LJLJJL
            int r0 = r0 - r2
            if (r1 != r0) goto L3b
            goto L22
        L39:
            if (r3 == 0) goto L22
        L3b:
            boolean r0 = r6.LJIIJ()
            if (r0 == 0) goto L5e
            int r2 = r3.getLeft()
            int r0 = r6.getScrollX()
            int r2 = r2 - r0
            int r1 = r6.getOffset()
            int r1 = r1 + r2
            int r0 = r6.getPaddingLeft()
            int r1 = r1 - r0
        L54:
            X.VZJ r2 = r6.LLF
            boolean r0 = r6.LJIIJJI()
            r2.LIZIZ(r6, r3, r0, r1)
            goto L22
        L5e:
            boolean r0 = r6.LJIIJJI()
            if (r0 == 0) goto L78
            int r1 = r3.getTop()
            int r0 = r6.getScrollY()
            int r1 = r1 - r0
            int r0 = r6.getOffset()
            int r1 = r1 - r0
            int r0 = r6.getPaddingTop()
        L76:
            int r1 = r1 - r0
            goto L54
        L78:
            int r1 = r3.getLeft()
            int r0 = r6.getScrollX()
            int r1 = r1 - r0
            int r0 = r6.getOffset()
            int r1 = r1 - r0
            int r0 = r6.getPaddingLeft()
            goto L76
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VZA.LJIJJLI():void");
    }

    public final void LJIL() {
        boolean z;
        if (!this.LJLLI && !this.LJLL) {
            if (this.LJLLILLLL && this.LLD == 1) {
                z = true;
            } else {
                z = false;
            }
            Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
            while (it.hasNext()) {
                ((VZG) it.next()).LIZJ(this.LJLJJLL, z);
            }
            this.LJLL = true;
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        int finalX;
        if (this.LJLJLLL.computeScrollOffset()) {
            if (LJIIJJI()) {
                finalX = this.LJLJLLL.getFinalY();
            } else {
                finalX = this.LJLJLLL.getFinalX();
            }
            this.LLJILJIL = finalX;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.LJLJLLL.getCurrX();
            int currY = this.LJLJLLL.getCurrY();
            if (LJIIJJI() && scrollY != currY) {
                scrollTo(scrollX, currY);
            } else if (!LJIIJJI() && scrollX != currX) {
                scrollTo(currX, scrollY);
            }
            C16300kU.LJIIJ(this);
            return;
        }
        if (getChildCount() <= 0 || this.LLD == 1) {
            return;
        }
        int i = ((VZH) getCurrentView().getLayoutParams()).LIZ;
        this.LJLJJLL = i;
        if (this.LJLJL != i) {
            Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
            while (it.hasNext()) {
                ((VZG) it.next()).LJ(this.LJLJJLL, this.LJLLI);
            }
        }
        if (this.LJZ && this.LJZI) {
            this.LJLLL = false;
            this.LJZI = false;
            super.requestLayout();
        }
        if (!this.LJLLI && this.LJLL) {
            Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
            while (it2.hasNext()) {
                ((VZG) it2.next()).LIZLLL(this.LJLJJLL);
            }
            this.LJLL = false;
        }
        if (this.LJLJL == -1 && this.LJLJJLL != -1) {
            this.LJLLI = false;
        }
        this.LJLJL = this.LJLJJLL;
        setScrollState(0);
    }

    public int getChildExpectSize() {
        int i = this.LLIILII;
        if (i > 0) {
            return i;
        }
        return getContentSize();
    }

    private List<View> getAllChildren() {
        int childCount = getChildCount();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < childCount; i++) {
            linkedList.add(getChildAt(i));
        }
        return linkedList;
    }

    private int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getContentSize() {
        if (LJIIJJI()) {
            return getContentHeight();
        }
        return getContentWidth();
    }

    private int getContentWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private View getCurrentView() {
        int right;
        int childExpectSize = (getChildExpectSize() / 2) + getPile();
        int scrollDistance = getScrollDistance();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int LJIIIIZZ = LJIIIIZZ(childAt) - scrollDistance;
            if (LJIIJJI()) {
                right = childAt.getBottom();
            } else {
                right = childAt.getRight();
            }
            int i2 = right - scrollDistance;
            int i3 = this.LLIIIILZ;
            if (i3 > 0) {
                i2 += this.LLILIL;
            } else if (i3 < 0) {
                LJIIIIZZ -= this.LLILIL;
            }
            if (LJIIIIZZ <= childExpectSize && i2 >= childExpectSize) {
                return childAt;
            }
        }
        return getChildAt(0);
    }

    private int getPageGap() {
        int width;
        int i;
        if (LJIIJJI()) {
            width = getHeight() - getPaddingBottom();
            i = this.LLILIL;
        } else {
            width = getWidth() - getPaddingRight();
            i = this.LLILIL;
        }
        return width - i;
    }

    private int getPile() {
        int paddingLeft;
        int offset;
        if (LJIIJJI()) {
            paddingLeft = getPaddingTop();
            offset = getOffset();
        } else {
            if (LJIIJ()) {
                return (getWidth() + (getOffset() + getPaddingLeft())) - getChildExpectSize();
            }
            paddingLeft = getPaddingLeft();
            offset = getOffset();
        }
        return offset + paddingLeft;
    }

    private int getScrollDistance() {
        if (LJIIJJI()) {
            return getScrollY();
        }
        return getScrollX();
    }

    public VZK getAdapter() {
        return this.LLIIL;
    }

    public int getCurrentIndex() {
        return this.LJLJJLL;
    }

    public int getOffset() {
        return this.LLIILZL;
    }

    public int getTotalCount() {
        return this.LJLJJL;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
    }

    public VZA(Context context) {
        super(context, null);
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLLI = true;
        this.LJLLILLLL = true;
        this.LJZL = 300;
        this.LLIIII = -1;
        this.LLIILII = -1;
        this.LLIIZ = -1;
        this.LLIL = -1;
        this.LLILII = -1;
        this.LLILL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILLIZIL = Integer.MAX_VALUE;
        this.LLIZLLLIL = true;
        this.LLJ = 300;
        this.LLJI = -1.0f;
        this.LLJIJIL = -1.0f;
        this.LLJILJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJILJILJ = new GestureDetector(new VZC(this), new Handler(C16880lQ.LLJJJJ()));
        float f = getResources().getDisplayMetrics().density;
        this.LJLJLLL = new Scroller(context, new LinearInterpolator());
        int i = (int) (600.0f * f);
        this.LLFFF = i;
        this.LLFF = i;
        this.LLFII = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLIIIJ = (int) (f * 2.0f);
        this.LLILLJJLI = new ArrayList();
    }

    public final boolean LIZIZ(int i) {
        int i2;
        int i3;
        if (LJIIJJI() || this.LLIIL == null || (i2 = this.LJLJJL) <= 1 || (i3 = this.LJLJJLL) == -1) {
            return false;
        }
        if (!this.LJLLL) {
            if (i > 0) {
                if (this.LJLLLL) {
                    if (i3 <= 0) {
                        return false;
                    }
                } else if (i3 >= i2 - 1) {
                    return false;
                }
            } else {
                if (i >= 0) {
                    return false;
                }
                if (this.LJLLLL) {
                    if (i3 >= i2 - 1) {
                        return false;
                    }
                } else if (i3 <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean LIZJ(int i) {
        int i2;
        int i3;
        if (!LJIIJJI() || this.LLIIL == null || (i2 = this.LJLJJL) <= 1 || (i3 = this.LJLJJLL) == -1) {
            return false;
        }
        if (!this.LJLLL) {
            if (i > 0) {
                if (i3 >= i2 - 1) {
                    return false;
                }
            } else if (i >= 0 || i3 <= 0) {
                return false;
            }
        }
        return true;
    }

    public final int LJIIIIZZ(View view) {
        if (LJIIJJI()) {
            return view.getTop();
        }
        return view.getLeft();
    }

    public final View LJIIIZ(int i) {
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = getChildAt(childCount);
            if (((VZH) childAt.getLayoutParams()).LIZ == i) {
                return childAt;
            }
        }
        View view = (View) ListProtector.get(((VZI) this.LLIIL).LIZ.LLIFFJFJJ, i);
        VZH vzh = new VZH();
        vzh.LIZ = i;
        addViewInLayout(view, 0, vzh, true);
        LJIIL(view);
        return view;
    }

    public final void LJIIL(View view) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        if (LJIIJJI()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = layoutParams.width;
            if (i >= 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            } else {
                int max = Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
                int i2 = layoutParams.width;
                if (i2 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                } else if (i2 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, LiveLayoutPreloadThreadPriority.DEFAULT);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                }
            }
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getChildExpectSize(), 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getChildExpectSize(), 1073741824);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int i3 = layoutParams2.height;
            if (i3 >= 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else {
                int max2 = Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
                int i4 = layoutParams2.height;
                if (i4 == -1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else if (i4 == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, LiveLayoutPreloadThreadPriority.DEFAULT);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                }
            }
        }
        view.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    public final void LJIILIIL(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLIIII) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIIIL = motionEvent.getX(i);
            this.LLIIIZ = motionEvent.getY(i);
            this.LLIIII = motionEvent.getPointerId(i);
        }
    }

    public final void LJIIZILJ(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if ((this.LJLLILLLL && LIZIZ(i)) || this.LJLZ) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if ((this.LJLLILLLL && LIZJ(i)) || this.LJLZ) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int finalX;
        int currX;
        float f;
        float f2;
        float f3;
        if (!this.LJLLILLLL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 3 || actionMasked == 1) {
            this.LLIIII = -1;
            this.LLI = false;
            this.LLIFFJFJJ = false;
            this.LLFZ = false;
            this.LLII = false;
            this.LLIIIILZ = 0;
            return false;
        }
        if (actionMasked != 0) {
            if (this.LLI) {
                return true;
            }
            if (this.LLIFFJFJJ) {
                return false;
            }
        }
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        LJIILIIL(motionEvent);
                    }
                } else {
                    this.LLIIII = motionEvent.getPointerId(actionIndex);
                }
            } else {
                int i = this.LLIIII;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    float f4 = x - this.LLIIIL;
                    float f5 = y - this.LLIIIZ;
                    float f6 = x - this.LLIIJI;
                    float f7 = y - this.LLIIJLIL;
                    if (LJIIJJI()) {
                        f = f5;
                    } else {
                        f = f4;
                    }
                    int i2 = (int) f;
                    if (this.LJLLJ && i2 != 0 && LIZ(this, LJIIJJI(), false, i2, (int) x, (int) y)) {
                        this.LLIIIL = x;
                        this.LLIIIZ = y;
                        this.LLIFFJFJJ = true;
                        return false;
                    }
                    if (LJIIJJI()) {
                        if (Math.abs(f5) > this.LLFII && Math.abs(f5) > Math.abs(f6) * 0.5f) {
                            LJIIZILJ(true);
                            setScrollState(1);
                            this.LLI = true;
                            this.LLII = true;
                            if (f5 > 0.0f) {
                                f3 = this.LLIIJLIL + this.LLFII;
                            } else {
                                f3 = this.LLIIJLIL - this.LLFII;
                            }
                            this.LLIIIZ = f3;
                            this.LLIIIL = x;
                        } else if (f6 > this.LLFII) {
                            this.LLIFFJFJJ = true;
                        }
                    } else if (Math.abs(f4) > this.LLFII && Math.abs(f4) > Math.abs(f7) * 0.5f) {
                        LJIIZILJ(true);
                        setScrollState(1);
                        this.LLI = true;
                        this.LLII = true;
                        if (f4 > 0.0f) {
                            f2 = this.LLIIJI + this.LLFII;
                        } else {
                            f2 = this.LLIIJI - this.LLFII;
                        }
                        this.LLIIIL = f2;
                        this.LLIIIZ = y;
                    } else if (f7 > this.LLFII) {
                        this.LLIFFJFJJ = true;
                    }
                }
            }
        } else {
            float x2 = motionEvent.getX();
            this.LLIIJI = x2;
            this.LLIIIL = x2;
            float y2 = motionEvent.getY();
            this.LLIIJLIL = y2;
            this.LLIIIZ = y2;
            this.LLIIII = motionEvent.getPointerId(actionIndex);
            this.LLI = false;
            this.LLIFFJFJJ = false;
            this.LLII = false;
            this.LLFZ = false;
            this.LLIIIILZ = 0;
            this.LJLJLLL.computeScrollOffset();
            if (LJIIJJI()) {
                finalX = this.LJLJLLL.getFinalY();
                currX = this.LJLJLLL.getCurrY();
            } else {
                finalX = this.LJLJLLL.getFinalX();
                currX = this.LJLJLLL.getCurrX();
            }
            int i3 = finalX - currX;
            if (this.LLIZLLLIL) {
                LJIIZILJ(true);
            }
            if (this.LLD == 2 && Math.abs(i3) > this.LLIIIJ) {
                this.LJLJLLL.abortAnimation();
                LJIIZILJ(true);
                setScrollState(1);
                this.LLI = true;
            }
        }
        return this.LLI;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked != 5) {
                if (actionMasked == 6) {
                    LJIILIIL(motionEvent);
                }
            } else {
                this.LLIIII = motionEvent.getPointerId(actionIndex);
                this.LLIIIL = motionEvent.getX(actionIndex);
                this.LLIIIZ = motionEvent.getY(actionIndex);
            }
        } else {
            this.LLIIII = -1;
            if (!this.LLFZ) {
                LJIJ();
            }
        }
        if (this.LJLLILLLL) {
            return this.LLJILJILJ.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(VZK vzk) {
        if (this.LLIIL != null) {
            for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
                LJIILJJIL(getChildAt(childCount), false);
            }
        } else {
            removeAllViews();
        }
        this.LLIIL = vzk;
        if (vzk == null) {
            return;
        }
        this.LJLJJL = ((ArrayList) ((VZI) vzk).LIZ.LLIFFJFJJ).size();
    }

    public void setAnimDuration(int i) {
        this.LJZL = i;
    }

    public void setBounceBeginThreshold(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.LLJI = 1.0f - f;
        } else {
            this.LLJI = -1.0f;
        }
    }

    public void setBounceDuration(int i) {
        this.LLJ = i;
    }

    public void setBounceEndThreshold(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.LLJIJIL = 1.0f - f;
        } else {
            this.LLJIJIL = -1.0f;
        }
    }

    public void setEnableBounce(boolean z) {
        this.LLILLL = z;
    }

    public void setEnableNestedChild(boolean z) {
        this.LJLLJ = z;
    }

    public void setEnableViceLoop(boolean z) {
        this.LJZ = z;
    }

    public void setForceCanScroll(boolean z) {
        this.LJLZ = z;
    }

    public void setHLayoutUpdated(boolean z) {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = z;
    }

    public void setHandleGesture(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setIgnoreLayoutUpdate(boolean z) {
        this.LLIZ = z;
    }

    public void setIsRTL(boolean z) {
        this.LJLLLL = z;
    }

    public void setKeepItemView(boolean z) {
        this.LJLLLLLL = z;
    }

    public void setLoop(boolean z) {
        this.LJLLL = z;
        if (this.LJZ && this.LLIIL != null && this.LJLJJL > 1 && this.LJLJJLL != -1) {
            super.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.LL = i;
    }

    public void setPageMargin(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLILIL = i;
    }

    public void setPageSize(int i) {
        this.LLIILII = i;
    }

    public void setPropsUpdated(boolean z) {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = z;
    }

    public void setScrollState(int i) {
        if (this.LLD == i) {
            return;
        }
        Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
        while (it.hasNext()) {
            ((VZG) it.next()).onPageScrollStateChanged(i);
        }
        this.LLD = i;
    }

    public void setTouchable(boolean z) {
        this.LJLLILLLL = z;
    }

    public void setTransformer(VZJ vzj) {
        if (this.LLF != null) {
            for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
                this.LLF.LIZ(getChildAt(childCount));
            }
        }
        this.LLF = vzj;
        LJIJJLI();
    }

    public void setVLayoutUpdated(boolean z) {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = z;
    }

    public final void LJI(float f, float f2) {
        if (getChildCount() < 1) {
            return;
        }
        if (LJIIJJI()) {
            f = f2;
        }
        int pile = getPile();
        int scrollDistance = getScrollDistance();
        int i = ((VZH) getCurrentView().getLayoutParams()).LIZ;
        if (f < 0.0f) {
            int childCount = getChildCount();
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < childCount; i3++) {
                int LJIIIIZZ = LJIIIIZZ(getChildAt(i3)) - scrollDistance;
                if (LJIIIIZZ > pile && LJIIIIZZ < i2) {
                    i2 = LJIIIIZZ;
                }
            }
            if (i2 == Integer.MAX_VALUE) {
                LJII(i, true);
                return;
            }
            if (LJIIJJI()) {
                this.LJLJLLL.startScroll(0, scrollDistance, 0, i2 - pile, this.LJZL);
            } else {
                this.LJLJLLL.startScroll(scrollDistance, 0, i2 - pile, 0, this.LJZL);
            }
            setScrollState(2);
        } else {
            int childCount2 = getChildCount();
            int i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
            for (int i5 = 0; i5 < childCount2; i5++) {
                int LJIIIIZZ2 = LJIIIIZZ(getChildAt(i5)) - scrollDistance;
                if (LJIIIIZZ2 < pile && LJIIIIZZ2 > i4) {
                    i4 = LJIIIIZZ2;
                }
            }
            if (i4 == Integer.MIN_VALUE) {
                LJII(i, false);
                return;
            }
            if (LJIIJJI()) {
                this.LJLJLLL.startScroll(0, scrollDistance, 0, i4 - pile, this.LJZL);
            } else {
                this.LJLJLLL.startScroll(scrollDistance, 0, i4 - pile, 0, this.LJZL);
            }
            setScrollState(2);
        }
        invalidate();
    }

    public final void LJII(int i, boolean z) {
        int i2;
        int i3 = 0;
        if (z) {
            if (LJIIJ()) {
                if (this.LJLLL && i - 1 < 0) {
                    i = this.LJLJJL;
                }
                i2 = i - 1;
            } else {
                if (!this.LJLLL || i + 1 < this.LJLJJL) {
                    i3 = i + 1;
                }
                i2 = i3;
            }
            LJIJI(i2, !LJIIJ() ? 1 : 0, true);
            return;
        }
        if (LJIIJ()) {
            if (!this.LJLLL || i + 1 < this.LJLJJL) {
                i3 = i + 1;
            }
        } else {
            if (this.LJLLL && i - 1 < 0) {
                i = this.LJLJJL;
            }
            i3 = i - 1;
        }
        LJIJI(i3, LJIIJ() ? 1 : 0, true);
    }

    public final void LJIILJJIL(View view, boolean z) {
        VZJ vzj = this.LLF;
        if (vzj != null) {
            vzj.LIZ(view);
        }
        if (!z) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeView(view);
            this.LLIIL.getClass();
        }
    }

    public final void LJIJJ(int i, boolean z) {
        this.LLIILZL = i;
        if (z) {
            if (LJIIJJI()) {
                scrollTo(0, -i);
            } else {
                scrollTo(-i, 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        boolean z;
        boolean z2;
        int paddingLeft;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        int paddingLeft2;
        int childExpectSize = getChildExpectSize() + this.LLILIL;
        int i5 = this.LJLJJL * childExpectSize;
        int paddingLeft3 = getPaddingLeft() + this.LLIILZL;
        boolean z7 = true;
        if ((this.LLILL == Integer.MIN_VALUE && this.LLILLIZIL == Integer.MAX_VALUE) || this.LLIIZ != childExpectSize || this.LLIL != i5 || this.LLILII != paddingLeft3) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIZ = childExpectSize;
        this.LLIL = i5;
        this.LLILII = paddingLeft3;
        if (z) {
            if (LJIIJ()) {
                int paddingRight = getPaddingRight() - this.LLIILZL;
                this.LLILL = C0EH.LIZ(getChildExpectSize(), this.LLILIL, -(this.LJLJJL - 1), paddingRight);
                this.LLILLIZIL = paddingRight;
            } else {
                if (LJIIJJI()) {
                    paddingLeft2 = getPaddingTop();
                } else {
                    paddingLeft2 = getPaddingLeft();
                }
                int i6 = paddingLeft2 + this.LLIILZL;
                this.LLILL = -i6;
                this.LLILLIZIL = ((getChildExpectSize() + this.LLILIL) * (this.LJLJJL - 1)) - i6;
            }
        }
        if (!this.LJLLL) {
            if (LJIIJJI()) {
                if (LJ()) {
                    i3 = (int) ((this.LLJI * (getChildExpectSize() + this.LLILIL)) + this.LLILL);
                } else {
                    i3 = this.LLILL;
                }
                if (LJFF()) {
                    i4 = (int) (this.LLILLIZIL - (this.LLJIJIL * (getChildExpectSize() + this.LLILIL)));
                } else {
                    i4 = this.LLILLIZIL;
                }
                if (LJ() && i2 <= i3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.LLILZ = z5;
                if (LJFF() && i2 >= i4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.LLILZIL = z6;
                i2 = Math.min(Math.max(i2, i3), i4);
            } else {
                int i7 = this.LLILL;
                int i8 = this.LLILLIZIL;
                if (LJ()) {
                    if (this.LJLLLL) {
                        i8 = (int) (this.LLILLIZIL - (this.LLJI * (getChildExpectSize() + this.LLILIL)));
                    } else {
                        i7 = (int) ((this.LLJI * (getChildExpectSize() + this.LLILIL)) + this.LLILL);
                    }
                }
                if (LJFF()) {
                    if (this.LJLLLL) {
                        i7 = (int) ((this.LLJIJIL * (getChildExpectSize() + this.LLILIL)) + this.LLILL);
                    } else {
                        i8 = (int) (this.LLILLIZIL - (this.LLJIJIL * (getChildExpectSize() + this.LLILIL)));
                    }
                }
                if (LJ() && (!this.LJLLLL ? i <= i7 : i >= i8)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.LLILZ = z3;
                if (LJFF() && (!this.LJLLLL ? i >= i8 : i <= i7)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.LLILZIL = z4;
                i = Math.min(Math.max(i, i7), i8);
            }
        }
        super.scrollTo(i, i2);
        int childExpectSize2 = getChildExpectSize() + this.LLILIL;
        int i9 = this.LJLJJL * childExpectSize2;
        if (this.LJLLL && i9 > 0 && childExpectSize2 > 0) {
            int scrollDistance = getScrollDistance();
            if (LJIIJ()) {
                int paddingRight2 = getPaddingRight() - this.LLIILZL;
                int i10 = scrollDistance - (childExpectSize2 / 2);
                if (i10 >= 0) {
                    int i11 = i10 / i9;
                    this.LLILL = C22510uV.LIZ(i11, i9, childExpectSize2, paddingRight2);
                    this.LLILLIZIL = C0EH.LIZ(i11, 1, i9, paddingRight2);
                } else {
                    this.LLILL = C22510uV.LIZ(-((Math.abs(i10) / i9) + 1), i9, childExpectSize2, paddingRight2);
                    this.LLILLIZIL = ((-(Math.abs(i10) / i9)) * i9) + paddingRight2;
                }
            } else {
                if (LJIIJJI()) {
                    paddingLeft = getPaddingTop();
                } else {
                    paddingLeft = getPaddingLeft();
                }
                int i12 = paddingLeft + this.LLIILZL;
                int i13 = (childExpectSize2 / 2) + scrollDistance;
                if (i13 >= 0) {
                    int i14 = i13 / i9;
                    this.LLILL = (i14 * i9) - i12;
                    this.LLILLIZIL = (((i14 + 1) * i9) - childExpectSize2) - i12;
                } else {
                    this.LLILL = ((-((Math.abs(i13) / i9) + 1)) * i9) - i12;
                    this.LLILLIZIL = (((-(Math.abs(i13) / i9)) * i9) - childExpectSize2) - i12;
                }
            }
        }
        LJIILLIIL();
        if (!this.LJLLI && this.LJLL) {
            if (this.LJLLILLLL && this.LLD == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Iterator it = ((ArrayList) this.LLILLJJLI).iterator();
            while (it.hasNext()) {
                ((VZG) it.next()).LIZIZ(getScrollX(), getScrollY(), z2);
            }
        }
        if (!this.LJLLL) {
            if (this.LLILZ || this.LLILZIL) {
                LJIJ();
                if (!this.LLILZLL) {
                    boolean z8 = this.LLILZ;
                    boolean z9 = this.LLILZIL;
                    if (!this.LJLLI && this.LJLL) {
                        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
                        while (it2.hasNext()) {
                            ((VZG) it2.next()).LIZ(z8, z9);
                        }
                    }
                }
            }
            if (!this.LLILZ && !this.LLILZIL) {
                z7 = false;
            }
            this.LLILZLL = z7;
            this.LLILZ = false;
            this.LLILZIL = false;
        }
    }

    public final void LJIILL(View view, int i, int i2) {
        int paddingTop;
        int measuredHeight;
        if (LJIIJJI()) {
            int paddingLeft = getPaddingLeft();
            int measuredWidth = view.getMeasuredWidth() + paddingLeft;
            paddingTop = i;
            i = paddingLeft;
            measuredHeight = i2;
            i2 = measuredWidth;
        } else {
            paddingTop = getPaddingTop();
            measuredHeight = view.getMeasuredHeight() + paddingTop;
        }
        view.layout(i, paddingTop, i2, measuredHeight);
    }

    public final void LJIJI(int i, int i2, boolean z) {
        int right;
        int i3;
        boolean z2 = true;
        if (this.LJLJJL < 1 || getChildCount() < 1) {
            return;
        }
        int i4 = 0;
        int LJJIIZ = C78609UtB.LJJIIZ(i, 0, this.LJLJJL - 1);
        View currentView = getCurrentView();
        int i5 = ((VZH) currentView.getLayoutParams()).LIZ;
        if (i5 == LJJIIZ) {
            return;
        }
        int childExpectSize = getChildExpectSize();
        int scrollDistance = getScrollDistance();
        int pile = (childExpectSize / 2) + getPile();
        int LJIIIIZZ = LJIIIIZZ(currentView);
        if (LJIIJJI()) {
            right = currentView.getBottom();
        } else {
            right = currentView.getRight();
        }
        int i6 = ((right + LJIIIIZZ) / 2) - scrollDistance;
        int i7 = childExpectSize + this.LLILIL;
        int i8 = (LJJIIZ - i5) * i7;
        boolean z3 = this.LJLLL;
        if (z3 || this.LJZ) {
            if (i2 == 1) {
                if (LJJIIZ <= i5) {
                    i3 = this.LJLJJL + LJJIIZ;
                    i8 = (i3 - i5) * i7;
                }
                i3 = LJJIIZ;
                i8 = (i3 - i5) * i7;
            } else if (i2 == 0) {
                if (LJJIIZ > i5) {
                    i3 = LJJIIZ - this.LJLJJL;
                    i8 = (i3 - i5) * i7;
                }
                i3 = LJJIIZ;
                i8 = (i3 - i5) * i7;
            }
            if (!z3) {
                this.LJZI = true;
                if (i2 != 1 ? i2 != 0 || LJJIIZ <= i5 : LJJIIZ >= i5) {
                    z2 = false;
                }
                this.LJLLL = z2;
            }
        }
        LJIL();
        if (LJIIJ()) {
            Scroller scroller = this.LJLJLLL;
            int i9 = (i6 - pile) - i8;
            if (z) {
                i4 = this.LJZL;
            }
            scroller.startScroll(scrollDistance, 0, i9, 0, i4);
        } else if (LJIIJJI()) {
            Scroller scroller2 = this.LJLJLLL;
            int i10 = (i6 - pile) + i8;
            if (z) {
                i4 = this.LJZL;
            }
            scroller2.startScroll(0, scrollDistance, 0, i10, i4);
        } else {
            Scroller scroller3 = this.LJLJLLL;
            int i11 = (i6 - pile) + i8;
            if (z) {
                i4 = this.LJZL;
            }
            scroller3.startScroll(scrollDistance, 0, i11, 0, i4);
        }
        setScrollState(2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI || this.LJLJI) {
            LIZLLL();
            this.LJLILLLLZI = false;
            this.LJLJI = false;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        super.setPadding(i, i2, i3, i4);
        if (LJIIJJI()) {
            scrollBy(0, paddingLeft - i);
        } else {
            scrollBy(paddingLeft - i, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            LJIIL(getChildAt(childCount));
        }
        if (this.LJLJJI || this.LJLILLLLZI || this.LJLJI) {
            LIZLLL();
            this.LJLJJI = false;
            this.LJLILLLLZI = false;
            this.LJLJI = false;
            return;
        }
        LJIILLIIL();
    }

    public static boolean LIZ(View view, boolean z, boolean z2, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && LIZ(childAt, z, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z2) {
            if (z) {
                if (view.canScrollVertically(-i)) {
                    return true;
                }
            } else if (view.canScrollHorizontally(-i)) {
                return true;
            }
        }
        return false;
    }
}
