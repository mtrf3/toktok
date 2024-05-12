package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.VnQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80800VnQ extends C16120kC {
    public final /* synthetic */ C80796VnM LIZ;

    public C80800VnQ(C80796VnM c80796VnM) {
        this.LIZ = c80796VnM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0.getCount() > 1) goto L6;
     */
    @Override // X.C16120kC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityEvent(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
        /*
            r3 = this;
            super.onInitializeAccessibilityEvent(r4, r5)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = r0.getName()
            r5.setClassName(r0)
            X.0mv r2 = new X.0mv
            android.view.accessibility.AccessibilityRecord r0 = android.view.accessibility.AccessibilityRecord.obtain()
            r2.<init>(r0)
            X.VnM r0 = r3.LIZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.LJLLJ
            if (r0 == 0) goto L51
            int r0 = r0.getCount()
            r1 = 1
            if (r0 <= r1) goto L51
        L22:
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setScrollable(r1)
            int r1 = r5.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L50
            X.VnM r0 = r3.LIZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.LJLLJ
            if (r0 == 0) goto L50
            int r1 = r0.getCount()
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setItemCount(r1)
            X.VnM r0 = r3.LIZ
            int r1 = r0.LJLLL
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setFromIndex(r1)
            X.VnM r0 = r3.LIZ
            int r1 = r0.LJLLL
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setToIndex(r1)
        L50:
            return
        L51:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80800VnQ.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIILJJIL(ViewPager.class.getName());
        PagerAdapter pagerAdapter = this.LIZ.LJLLJ;
        if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        c17760mq.LJJII(z);
        if (this.LIZ.canScrollVertically(1)) {
            c17760mq.LIZ(4096);
        }
        if (this.LIZ.canScrollVertically(-1)) {
            c17760mq.LIZ(FileUtils.BUFFER_SIZE);
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.LIZ.canScrollVertically(-1)) {
                return false;
            }
            C80796VnM c80796VnM = this.LIZ;
            c80796VnM.setCurrentItem(c80796VnM.LJLLL - 1);
            return true;
        }
        if (!this.LIZ.canScrollVertically(1)) {
            return false;
        }
        C80796VnM c80796VnM2 = this.LIZ;
        c80796VnM2.setCurrentItem(c80796VnM2.LJLLL + 1);
        return true;
    }
}
