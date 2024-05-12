package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.VnO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80798VnO extends C16120kC {
    public final /* synthetic */ C80794VnK LIZ;

    public final boolean LIZ() {
        PagerAdapter pagerAdapter = this.LIZ.LJLJJLL;
        if (pagerAdapter != null) {
            Integer valueOf = Integer.valueOf(pagerAdapter.getCount());
            o.LJI(valueOf);
            if (valueOf.intValue() > 1) {
                return true;
            }
        }
        return false;
    }

    public C80798VnO(C80794VnK c80794VnK) {
        this.LIZ = c80794VnK;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        PagerAdapter pagerAdapter;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        event.setClassName("androidx.viewpager.widget.ViewPager");
        C17810mv c17810mv = new C17810mv(AccessibilityRecord.obtain());
        c17810mv.LIZ.setScrollable(LIZ());
        if (event.getEventType() == 4096 && (pagerAdapter = this.LIZ.LJLJJLL) != null) {
            Integer valueOf = Integer.valueOf(pagerAdapter.getCount());
            o.LJI(valueOf);
            c17810mv.LIZ.setItemCount(valueOf.intValue());
            c17810mv.LIZ.setFromIndex(this.LIZ.LJLJL);
            c17810mv.LIZ.setToIndex(this.LIZ.LJLJL);
        }
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL("androidx.viewpager.widget.ViewPager");
        info.LJJII(LIZ());
        if (this.LIZ.canScrollVertically(1)) {
            info.LIZ(4096);
        }
        if (this.LIZ.canScrollVertically(-1)) {
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
            if (i == 8192 && this.LIZ.canScrollVertically(-1)) {
                C80794VnK c80794VnK = this.LIZ;
                c80794VnK.setCurrentItem(c80794VnK.LJLJL - 1);
                return true;
            }
        } else if (this.LIZ.canScrollVertically(1)) {
            C80794VnK c80794VnK2 = this.LIZ;
            c80794VnK2.setCurrentItem(c80794VnK2.LJLJL + 1);
            return true;
        }
        return false;
    }
}
