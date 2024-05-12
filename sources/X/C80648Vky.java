package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vky, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80648Vky extends LinearLayout {
    public final Scroller LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public VelocityTracker LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public View LJLLLL;
    public ViewPager LJLLLLLL;
    public J2G LJLZ;
    public int LJZ;
    public final int LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public int LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final List<InterfaceC80650Vl0> LLIIIJ;
    public InterfaceC80651Vl1 LLIIIL;
    public InterfaceC80650Vl0 LLIIIZ;
    public final OGF LLIIJI;
    public boolean LLIIJLIL;

    static {
        C16880lQ.LJLLJ(C80648Vky.class);
    }

    public boolean LIZ() {
        if (this.LLFII >= this.LLFF) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int i;
        if (this.LJLIL.computeScrollOffset()) {
            int currY = this.LJLIL.getCurrY();
            J2G j2g = this.LJLZ;
            J2G j2g2 = J2G.UP;
            int i2 = 0;
            if (j2g == j2g2) {
                if (LIZ()) {
                    int finalY = this.LJLIL.getFinalY() - currY;
                    int duration = this.LJLIL.getDuration() - this.LJLIL.timePassed();
                    View LIZ = this.LLIIJI.LIZ();
                    int i3 = duration / 1000;
                    if (this.LJLIL == null || i3 == 0) {
                        i = 0;
                    } else {
                        i = finalY / i3;
                    }
                    if (LIZ instanceof AbsListView) {
                        AbsListView absListView = (AbsListView) LIZ;
                        if (this.LJZI >= 21) {
                            absListView.fling(i);
                        } else {
                            absListView.smoothScrollBy(finalY, duration);
                        }
                    } else if (LIZ instanceof ScrollView) {
                        ((ScrollView) LIZ).fling(i);
                    } else if (LIZ instanceof RecyclerView) {
                        ((RecyclerView) LIZ).LJJJI(0, i);
                    } else if (LIZ instanceof WebView) {
                        ((WebView) LIZ).flingScroll(0, i);
                    }
                    this.LJLIL.forceFinished(true);
                    return;
                }
                InterfaceC80651Vl1 interfaceC80651Vl1 = this.LLIIIL;
                if (interfaceC80651Vl1 == null || !interfaceC80651Vl1.LIZ()) {
                    scrollTo(0, currY);
                    invalidate();
                }
            } else {
                if (this.LLIIJI.LIZIZ()) {
                    scrollTo(0, getScrollY() + (currY - this.LLD));
                    int finalY2 = this.LJLIL.getFinalY() - currY;
                    int duration2 = this.LJLIL.getDuration() - this.LJLIL.timePassed();
                    if (this.LJLIL != null && duration2 != 0) {
                        i2 = finalY2 / duration2;
                    }
                    if ((Math.abs(i2) < 1 || Math.abs(Math.max(this.LJLIL.getFinalY(), this.LLF) - this.LLFII) < 5) && this.LLFII < 0) {
                        this.LJLIL.abortAnimation();
                        Scroller scroller = this.LJLIL;
                        int i4 = this.LLFII;
                        scroller.startScroll(0, i4, 0, -i4, Math.abs(i4) * 2);
                        this.LJLZ = j2g2;
                        return;
                    }
                    if (this.LLFII <= this.LLF) {
                        if ((getParent() instanceof C80896Voy) && this.LLII) {
                            float currVelocity = this.LJLIL.getCurrVelocity();
                            if (currVelocity > 0.0f) {
                                currVelocity = -currVelocity;
                            }
                            ((C80896Voy) getParent()).LJ(currVelocity);
                        }
                        this.LJLIL.forceFinished(true);
                        return;
                    }
                }
                invalidate();
            }
            this.LLD = currY;
        }
    }

    public Float getMoveDistanceY() {
        return Float.valueOf(this.LJLLL);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        View view = this.LJLLLL;
        if (view != null && !view.isClickable()) {
            this.LJLLLL.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.LJLLLLLL = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public int getCurScrollY() {
        return this.LLFII;
    }

    public OGF getHelper() {
        return this.LLIIJI;
    }

    public int getMaxY() {
        return this.LLFF;
    }

    public int getMinY() {
        return this.LLF;
    }

    public int getTabsMarginTop() {
        return this.LLFFF;
    }

    public final void LIZIZ(InterfaceC80650Vl0 interfaceC80650Vl0) {
        if (interfaceC80650Vl0 != null && !((ArrayList) this.LLIIIJ).contains(interfaceC80650Vl0)) {
            ((ArrayList) this.LLIIIJ).add(interfaceC80650Vl0);
        }
    }

    public final void LIZJ(float f) {
        Float valueOf = Float.valueOf(1.0f);
        C80077Vbl.LIZ(this, new OSZ(valueOf, valueOf), new OSZ(valueOf, Float.valueOf(f)), 0L, null, null);
        this.LJLIL.abortAnimation();
    }

    public final void LIZLLL(long j) {
        Float valueOf = Float.valueOf(1.0f);
        C80077Vbl.LIZ(this, new OSZ(valueOf, valueOf), new OSZ(valueOf, Float.valueOf(-3000.0f)), j, null, null);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        boolean z;
        InterfaceC80651Vl1 interfaceC80651Vl1;
        boolean z2;
        View LIZ = this.LLIIJI.LIZ();
        if (i < 0) {
            if (getScrollY() > this.LLF) {
                return true;
            }
            return false;
        }
        if (i > 0 && LIZ != null) {
            if (LIZ.canScrollVertically(i) || getScrollY() < this.LLFF) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (C26360AWe.LIZ() && (interfaceC80651Vl1 = this.LLIIIL) != null) {
                Boolean valueOf2 = Boolean.valueOf(interfaceC80651Vl1.LIZ());
                if (LIZ() && !LIZ.canScrollVertically(i)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf3 = Boolean.valueOf(z2);
                if ((valueOf.booleanValue() || valueOf3.booleanValue()) && !valueOf2.booleanValue()) {
                    return true;
                }
                return false;
            }
            return valueOf.booleanValue();
        }
        return super.canScrollVertically(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0186 A[Catch: IllegalArgumentException -> 0x0259, TryCatch #0 {IllegalArgumentException -> 0x0259, blocks: (B:3:0x0001, B:7:0x000a, B:19:0x01ad, B:21:0x0179, B:23:0x0186, B:24:0x0189, B:26:0x018d, B:28:0x0193, B:29:0x019b, B:31:0x01a1, B:36:0x01b2, B:39:0x01b8, B:41:0x01bc, B:43:0x01c0, B:45:0x01c6, B:46:0x01ec, B:48:0x01f0, B:50:0x01f6, B:52:0x0205, B:56:0x0226, B:57:0x022b, B:59:0x0231, B:62:0x0238, B:63:0x0229, B:64:0x003f, B:66:0x0043, B:67:0x0049, B:69:0x0055, B:70:0x005b, B:71:0x0063, B:73:0x0069, B:75:0x0076, B:77:0x007a, B:80:0x0080, B:83:0x0089, B:84:0x008d, B:87:0x009d, B:90:0x00b5, B:92:0x00bf, B:95:0x00c5, B:97:0x00cb, B:99:0x00d3, B:101:0x00d7, B:102:0x00da, B:104:0x00de, B:106:0x00e4, B:107:0x00ec, B:109:0x0115, B:112:0x0121, B:114:0x0125, B:118:0x0176, B:119:0x012c, B:122:0x0131, B:125:0x0159, B:127:0x015f, B:128:0x0165, B:129:0x0172), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a1 A[Catch: IllegalArgumentException -> 0x0259, TryCatch #0 {IllegalArgumentException -> 0x0259, blocks: (B:3:0x0001, B:7:0x000a, B:19:0x01ad, B:21:0x0179, B:23:0x0186, B:24:0x0189, B:26:0x018d, B:28:0x0193, B:29:0x019b, B:31:0x01a1, B:36:0x01b2, B:39:0x01b8, B:41:0x01bc, B:43:0x01c0, B:45:0x01c6, B:46:0x01ec, B:48:0x01f0, B:50:0x01f6, B:52:0x0205, B:56:0x0226, B:57:0x022b, B:59:0x0231, B:62:0x0238, B:63:0x0229, B:64:0x003f, B:66:0x0043, B:67:0x0049, B:69:0x0055, B:70:0x005b, B:71:0x0063, B:73:0x0069, B:75:0x0076, B:77:0x007a, B:80:0x0080, B:83:0x0089, B:84:0x008d, B:87:0x009d, B:90:0x00b5, B:92:0x00bf, B:95:0x00c5, B:97:0x00cb, B:99:0x00d3, B:101:0x00d7, B:102:0x00da, B:104:0x00de, B:106:0x00e4, B:107:0x00ec, B:109:0x0115, B:112:0x0121, B:114:0x0125, B:118:0x0176, B:119:0x012c, B:122:0x0131, B:125:0x0159, B:127:0x015f, B:128:0x0165, B:129:0x0172), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b2 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80648Vky.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCanScrollUp(boolean z) {
        if (z) {
            this.LLFF = this.LJZ - this.LLFFF;
        }
        if (!this.LLIFFJFJJ && this.LLIIIILZ == z) {
            return;
        }
        this.LLIIIILZ = z;
        if (!z) {
            if (this.LLFII != 0) {
                scrollTo(0, 0);
            }
            this.LLFF = 0;
        }
        this.LLIFFJFJJ = false;
    }

    public void setDisallowActionDown(boolean z) {
        this.LLIIII = z;
    }

    public void setMaxScrollHeight(int i) {
        int min = Math.min(i, this.LJZ - this.LLFFF);
        this.LLFF = min;
        this.LLFF = Math.max(min, 0);
    }

    public void setMinY(int i) {
        this.LLF = i;
    }

    public void setOnScrollListener(InterfaceC80650Vl0 interfaceC80650Vl0) {
        this.LLIIIZ = interfaceC80650Vl0;
    }

    public void setScrollMinY(int i) {
        this.LLI = i;
    }

    public void setTabsMarginTop(int i) {
        this.LLFFF = i;
        this.LLIFFJFJJ = true;
    }

    public C80648Vky(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        this.LJLLLL = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i, 0, 0, 0);
            this.LJZ = this.LJLLLL.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.LJZ - this.LLFFF) + View.MeasureSpec.getSize(i2), 1073741824));
        if (!this.LLIIJLIL) {
            this.LLFF = this.LJZ - this.LLFFF;
            this.LLIIJLIL = true;
        }
        if (!this.LLIIIILZ) {
            this.LLFF = 0;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        int i3;
        int scrollY = getScrollY();
        if (i2 < 0 && (i3 = scrollY + i2) < 0) {
            i2 = (int) ((1.0f - ((1.0f / this.LLF) * i3)) * i2 * 1.2f);
        }
        int i4 = i2 + scrollY;
        int i5 = this.LLFF;
        if (i4 >= i5 || i4 <= (i5 = this.LLF)) {
            i4 = i5;
        }
        super.scrollBy(i, i4 - scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        int i3 = this.LLFF;
        if (i2 >= i3) {
            i2 = i3;
        } else {
            int i4 = this.LLF;
            if (i2 <= i4) {
                i2 = i4;
            }
        }
        this.LLFII = i2;
        InterfaceC80650Vl0 interfaceC80650Vl0 = this.LLIIIZ;
        if (interfaceC80650Vl0 != 0) {
            if (interfaceC80650Vl0 instanceof AbsFragment) {
                if (((AbsFragment) interfaceC80650Vl0).isViewValid()) {
                    this.LLIIIZ.onScroll(i2, this.LLFF);
                }
            } else {
                interfaceC80650Vl0.onScroll(i2, i3);
            }
        }
        Iterator it = ((ArrayList) this.LLIIIJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC80650Vl0) it.next()).onScroll(i2, this.LLFF);
        }
        super.scrollTo(i, i2);
    }

    public C80648Vky(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLI = 10;
        this.LLIIIILZ = true;
        this.LLIIIJ = new ArrayList();
        this.LLIIJLIL = false;
        this.LLIIJI = new OGF();
        this.LJLIL = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLJL = viewConfiguration.getScaledTouchSlop();
        this.LJLJLJ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJLLL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LJZI = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bha});
        this.LLFFF = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
