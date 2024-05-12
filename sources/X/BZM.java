package X;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.android.livesdk.livesetting.other.LiveDispatchApplyInsetsOptSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSurfaceViewOptimizeSetting;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes6.dex */
public class BZM extends FrameLayout implements InterfaceC28271B7r {
    public int LJLIL;
    public final BZN LJLILLLLZI;
    public C025107z LJLJI;

    public List<DrawerLayout$DrawerListener> getDrawerListeners() {
        try {
            Field declaredField = C025107z.class.getDeclaredField("mListeners");
            declaredField.setAccessible(true);
            return (List) declaredField.get(this.LJLJI);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean getIsClearScreen() {
        return this.LJLILLLLZI.LJIIL;
    }

    public boolean getIsKeyboardOpen() {
        return this.LJLILLLLZI.LJIILIIL;
    }

    public final View LIZ(int i) {
        int absoluteGravity;
        C025107z c025107z = this.LJLJI;
        if (c025107z == null) {
            return null;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(c025107z)) & 7;
        int childCount = this.LJLJI.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LJLJI.getChildAt(i2);
            if (this.LJLJI == null) {
                absoluteGravity = 0;
            } else {
                absoluteGravity = Gravity.getAbsoluteGravity(((DrawerLayout$LayoutParams) childAt.getLayoutParams()).gravity, C16310kV.LIZLLL(this.LJLJI));
            }
            if ((absoluteGravity & 7) == absoluteGravity2) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LIZIZ(int i) {
        if (this.LJLJI == null || getContext() == null || getContext().getApplicationInfo() == null || this.LJLJI.getDrawerLockMode(i) != 0 || LIZ(i) == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (this.LJLIL == 1 && EnableSurfaceViewOptimizeSetting.INSTANCE.getValue()) {
            return true;
        }
        return super.gatherTransparentRegion(region);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (LiveDispatchApplyInsetsOptSettings.INSTANCE.getV()) {
            return C16800lI.LIZIZ.LJIIIZ();
        }
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        BZN bzn = this.LJLILLLLZI;
        bzn.getClass();
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            bzn.LIZLLL = x;
            bzn.LJ = y;
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        float f = x - bzn.LIZLLL;
        float f2 = y - bzn.LJ;
        if (!bzn.LIZJ ? f < 0.0f : f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f) <= bzn.LJFF * 2 || Math.abs(f) <= Math.abs(f2) || !bzn.LIZJ(f) || !z || !bzn.LIZIZ(motionEvent)) {
            return false;
        }
        if (Math.abs(f) <= Math.sqrt(3.0d) * Math.abs(f2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0 != 3) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BZM.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDragInterceptor(BZQ bzq) {
        this.LJLILLLLZI.LJIILL = bzq;
    }

    public void setDrawerEnable(boolean z) {
        this.LJLILLLLZI.LJIILJJIL = z;
    }

    public void setDrawerLayout(C025107z c025107z) {
        this.LJLJI = c025107z;
    }

    public void setKeyboardOpen(boolean z) {
        this.LJLILLLLZI.LJIILIIL = z;
    }

    public void setPageContainer(int i) {
        this.LJLIL = i;
    }

    public BZM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = -1;
        this.LJLILLLLZI = new BZN(context, this);
    }
}
