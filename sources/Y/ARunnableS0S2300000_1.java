package Y;

import X.C10K;
import X.C29S;
import X.C2JJ;
import X.C46318IFu;
import X.C4XM;
import X.C54289LSj;
import X.C56308M8a;
import X.C56802Ku;
import X.C61996OUu;
import X.C79045V0n;
import X.FMX;
import X.M89;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public class ARunnableS0S2300000_1 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        boolean z;
        Activity activity = ((BaseListFragmentPanel) this.l4).activity;
        if (activity == null || activity.isFinishing() || ((Aweme) this.l2) == null) {
            return;
        }
        ((BaseListFragmentPanel) this.l4).mDialogController.LJIILL();
        ((BaseListFragmentPanel) this.l4).mDialogController.LJIIZILJ();
        Aweme aweme = (Aweme) this.l2;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = "";
        }
        Aweme aweme2 = (Aweme) this.l2;
        if (aweme2 != null && "1".equals(aweme2.isFromTrendingCard())) {
            str = ((BaseListFragmentPanel) this.l4).param.getSearchResultId();
        }
        M89 m89 = ((BaseListFragmentPanel) this.l4).param;
        if (m89 != null && "discovery".equals(m89.getEventType())) {
            z = true;
        } else {
            z = false;
        }
        C2JJ c2jj = new C2JJ();
        String tabName = ((BaseListFragmentPanel) this.l4).param.getTabName();
        if (tabName != null) {
            c2jj.LIZ.LIZ = tabName;
        }
        String str2 = ((BaseListFragmentPanel) this.l4).param.getmImprId();
        if (str2 != null) {
            c2jj.LIZ.LIZIZ = str2;
        }
        String searchId = ((BaseListFragmentPanel) this.l4).param.getSearchId();
        C56802Ku c56802Ku = c2jj.LIZ;
        c56802Ku.LIZJ = searchId;
        c56802Ku.LIZLLL = str;
        c2jj.LIZ.LJ = ((BaseListFragmentPanel) this.l4).param.getChallengeId();
        String parentTagId = ((BaseListFragmentPanel) this.l4).param.getParentTagId();
        C56802Ku c56802Ku2 = c2jj.LIZ;
        c56802Ku2.LJFF = parentTagId;
        c56802Ku2.LJI = z;
        c2jj.LIZ.LJIIJ = ((BaseListFragmentPanel) this.l4).param.getPageType();
        String enterMethod = this.s0;
        o.LJIIIZ(enterMethod, "enterMethod");
        c2jj.LIZ.LJII = enterMethod;
        String panelSource = this.s1;
        o.LJIIIZ(panelSource, "panelSource");
        c2jj.LIZ.LJIIIIZZ = panelSource;
        String videoCollectionId = ((BaseListFragmentPanel) this.l4).param.getVideoCollectionId();
        String videoCollectionName = ((BaseListFragmentPanel) this.l4).param.getVideoCollectionName();
        C56802Ku c56802Ku3 = c2jj.LIZ;
        c56802Ku3.LJIIJJI = videoCollectionId;
        c56802Ku3.LJIIL = videoCollectionName;
        Bundle bundle = (Bundle) this.l3;
        if (bundle != null) {
            int i = bundle.getInt("longPressDownX");
            int i2 = ((Bundle) this.l3).getInt("longPressDownY");
            C56802Ku c56802Ku4 = c2jj.LIZ;
            c56802Ku4.LJIILIIL = i;
            c56802Ku4.LJIILJJIL = i2;
            int[] intArray = ((Bundle) this.l3).getIntArray("share_button_location");
            if (intArray != null) {
                c2jj.LIZ.LJIILL = intArray;
            }
        }
        C56802Ku c56802Ku5 = c2jj.LIZ;
        BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) this.l4;
        baseListFragmentPanel.mDialogController.LJIJJ(baseListFragmentPanel.activity, (Aweme) this.l2, c56802Ku5);
        ((BaseListFragmentPanel) this.l4).onCastingOverlayShow();
    }

    public final void LIZ$1() {
        C54289LSj c54289LSj = new C54289LSj((C29S) this.l2, (Aweme) this.l3, this.s0, this.s1);
        View view = (View) this.l4;
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c54289LSj));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c54289LSj.showAtLocation(view, 80, 0, 0);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
            } catch (Throwable unused) {
                c54289LSj.showAtLocation(view, 80, 0, 0);
            }
        } else {
            c54289LSj.showAtLocation(view, 80, 0, 0);
        }
        new C61996OUu((C29S) this.l2).LIZ(0);
        Aweme aweme = (Aweme) this.l3;
        String enterFrom = this.s0;
        String enterMethod = this.s1;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C10K.LIZIZ(new ACallableS7S2100000_1(enterFrom, aweme, enterMethod, 5), FMX.LIZIZ(), null);
    }

    public final void LIZ$2() {
        ForegroundColorSpan foregroundColorSpan;
        SpannableString spannableString = new SpannableString(this.s0);
        int LJJLIIIJL = s.LJJLIIIJL(this.s0, this.s1, 0, false, 6);
        Context context = ((ReplaceMusicBottomBarAssem) this.l3).Y3().getContext();
        o.LJIIIIZZ(context, "contentView.context");
        Integer LJI = C79045V0n.LJI(R.attr.eb, context);
        if (LJI != null) {
            foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
        } else {
            foregroundColorSpan = null;
        }
        spannableString.setSpan(foregroundColorSpan, LJJLIIIJL, this.s1.length() + LJJLIIIJL, 17);
        ((TuxTextView) this.l4).setText(spannableString);
    }

    public static final void run$0(ARunnableS0S2300000_1 aRunnableS0S2300000_1) {
        boolean LIZ;
        try {
            aRunnableS0S2300000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2300000_1 aRunnableS0S2300000_1) {
        boolean LIZ;
        try {
            aRunnableS0S2300000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S2300000_1 aRunnableS0S2300000_1) {
        boolean LIZ;
        try {
            aRunnableS0S2300000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2300000_1(Object obj, Object obj2, String str, String str2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = obj3;
    }

    public ARunnableS0S2300000_1(BaseListFragmentPanel baseListFragmentPanel, Aweme aweme, String str, String str2, String str3, Bundle bundle, int i) {
        this.$t = i;
        this.l4 = baseListFragmentPanel;
        this.l2 = aweme;
        this.s0 = str2;
        this.s1 = str3;
        this.l3 = bundle;
    }
}
