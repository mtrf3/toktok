package o3;

import X.C16120kC;
import X.C17720mm;
import X.C17760mq;
import X.C73305Spp;
import X.C74053T4n;
import Y.ARunnableS31S0200000_12;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDaS470S0100000_12 extends C16120kC {
    public final int $t;
    public Object l0;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, c17760mq);
                return;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, c17760mq);
                return;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, c17760mq);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 0:
                return performAccessibilityAction$0(this, view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public IDaS470S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS470S0100000_12 iDaS470S0100000_12, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (((C73305Spp) iDaS470S0100000_12.l0).LJLJJL != null) {
            info.LJIILL(true);
            info.LIZIZ(C17720mm.LJI);
        } else {
            info.LJIILL(false);
            info.LJII(C17720mm.LJI);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS470S0100000_12 iDaS470S0100000_12, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        String str = ((C74053T4n) iDaS470S0100000_12.l0).LLFFF;
        if (str != null) {
            info.LJJIFFI(str);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS470S0100000_12 iDaS470S0100000_12, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJJIFFI(((ViewPagerLoginView) iDaS470S0100000_12.l0).LIZIZ.getString(R.string.a9v));
    }

    public static final boolean performAccessibilityAction$0(IDaS470S0100000_12 iDaS470S0100000_12, View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (i == 16) {
            ARunnableS31S0200000_12 aRunnableS31S0200000_12 = ((C73305Spp) iDaS470S0100000_12.l0).LJLJJL;
            if (aRunnableS31S0200000_12 != null) {
                aRunnableS31S0200000_12.run();
                return true;
            }
            return true;
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}
