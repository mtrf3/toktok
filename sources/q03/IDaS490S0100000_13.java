package q03;

import X.AA5;
import X.C76800UCe;
import X.C76929UHd;
import X.C78671UuB;
import X.C98T;
import X.InterfaceC88472Yns;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;

/* loaded from: classes14.dex */
public class IDaS490S0100000_13 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS490S0100000_13(C76929UHd c76929UHd, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = c76929UHd;
    }

    public static final void LIZ$0(IDaS490S0100000_13 iDaS490S0100000_13, View view) {
        C76929UHd c76929UHd;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns;
        if (view != null && (interfaceC88472Yns = (c76929UHd = (C76929UHd) iDaS490S0100000_13.l0).LJLJJI) != null) {
            TextView textView = c76929UHd.LJLJJL;
            boolean z = false;
            if (textView != null && textView.getVisibility() == 0) {
                z = true;
            }
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }

    public static final void LIZ$1(IDaS490S0100000_13 iDaS490S0100000_13, View view) {
        if (view != null) {
            VideoUserCardVM p4 = ((VideoUserCardAssem) iDaS490S0100000_13.l0).p4();
            p4.setStateImmediate(C78671UuB.LJLIL);
            p4.lv0(false, AA5.CLICK);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS490S0100000_13(VideoUserCardAssem videoUserCardAssem, int i) {
        super(300L);
        this.$t = i;
        this.l0 = videoUserCardAssem;
    }
}
