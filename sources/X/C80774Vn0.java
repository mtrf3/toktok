package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.Vn0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80774Vn0 extends C16120kC {
    public final /* synthetic */ C80769Vmv LIZ;

    public C80774Vn0(C80769Vmv c80769Vmv) {
        this.LIZ = c80769Vmv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1 > 1) goto L6;
     */
    @Override // X.C16120kC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.onInitializeAccessibilityEvent(r3, r4)
            java.lang.Class<X.Vn0> r0 = X.C80774Vn0.class
            java.lang.String r0 = r0.getName()
            r4.setClassName(r0)
            X.Vmv r0 = r2.LIZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.LJLLI
            if (r0 == 0) goto L40
            int r1 = r0.getCount()
            r0 = 1
            if (r1 <= r0) goto L40
        L19:
            r4.setScrollable(r0)
            int r1 = r4.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L3f
            X.Vmv r0 = r2.LIZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.LJLLI
            if (r0 == 0) goto L3f
            int r0 = r0.getCount()
            r4.setItemCount(r0)
            X.Vmv r0 = r2.LIZ
            int r0 = r0.LJLLILLLL
            r4.setFromIndex(r0)
            X.Vmv r0 = r2.LIZ
            int r0 = r0.LJLLILLLL
            r4.setToIndex(r0)
        L3f:
            return
        L40:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80774Vn0.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIILJJIL(C80774Vn0.class.getName());
        PagerAdapter pagerAdapter = this.LIZ.LJLLI;
        if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        c17760mq.LJJII(z);
        if (this.LIZ.canScrollHorizontally(1)) {
            c17760mq.LIZ(4096);
        }
        if (this.LIZ.canScrollHorizontally(-1)) {
            c17760mq.LIZ(FileUtils.BUFFER_SIZE);
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.LIZ.canScrollHorizontally(-1)) {
                return false;
            }
            C80769Vmv c80769Vmv = this.LIZ;
            c80769Vmv.setCurrentItem(c80769Vmv.LJLLILLLL - 1);
            return true;
        }
        if (!this.LIZ.canScrollHorizontally(1)) {
            return false;
        }
        C80769Vmv c80769Vmv2 = this.LIZ;
        c80769Vmv2.setCurrentItem(c80769Vmv2.LJLLILLLL + 1);
        return true;
    }
}
