package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91361ZtN extends C16120kC {
    public final /* synthetic */ C91362ZtO LIZ;

    public C91361ZtN(C91362ZtO c91362ZtO) {
        this.LIZ = c91362ZtO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
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
            java.lang.String r0 = "host"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            super.onInitializeAccessibilityEvent(r4, r5)
            java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
            r5.setClassName(r0)
            X.0mv r2 = new X.0mv
            android.view.accessibility.AccessibilityRecord r0 = android.view.accessibility.AccessibilityRecord.obtain()
            r2.<init>(r0)
            X.ZtO r0 = r3.LIZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.LJLJJL
            if (r0 == 0) goto L57
            int r0 = r0.getCount()
            r1 = 1
            if (r0 <= r1) goto L57
        L28:
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setScrollable(r1)
            int r1 = r5.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L56
            X.ZtO r0 = r3.LIZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.LJLJJL
            if (r0 == 0) goto L56
            int r1 = r0.getCount()
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setItemCount(r1)
            X.ZtO r0 = r3.LIZ
            int r1 = r0.LJLJJLL
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setFromIndex(r1)
            X.ZtO r0 = r3.LIZ
            int r1 = r0.LJLJJLL
            android.view.accessibility.AccessibilityRecord r0 = r2.LIZ
            r0.setToIndex(r1)
        L56:
            return
        L57:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91361ZtN.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        boolean z;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL("androidx.viewpager.widget.ViewPager");
        PagerAdapter pagerAdapter = this.LIZ.LJLJJL;
        if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
            z = true;
        } else {
            z = false;
        }
        info.LJJII(z);
        if (this.LIZ.LJIJI(1)) {
            info.LIZ(4096);
        }
        if (this.LIZ.LJIJI(-1)) {
            info.LIZ(FileUtils.BUFFER_SIZE);
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (super.performAccessibilityAction(host, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.LIZ.LJIJI(-1)) {
                return false;
            }
            C91362ZtO c91362ZtO = this.LIZ;
            c91362ZtO.setCurrentItem(c91362ZtO.LJLJJLL - 1);
            return true;
        }
        if (!this.LIZ.LJIJI(1)) {
            return false;
        }
        C91362ZtO c91362ZtO2 = this.LIZ;
        c91362ZtO2.setCurrentItem(c91362ZtO2.LJLJJLL + 1);
        return true;
    }
}
