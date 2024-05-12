package X;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelSwipeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CsF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32687CsF extends C32681Cs9 {
    public C32687CsF(DataChannel dataChannel, GiftPanelLeafViewModel giftPanelLeafViewModel) {
        super(dataChannel);
    }

    @Override // X.C32681Cs9
    public final AbstractC32678Cs6 LJLLLLLL(int i, ViewGroup parent) {
        WindowManager windowManager;
        Display defaultDisplay;
        o.LJIIIZ(parent, "parent");
        if (C32694CsM.LJIIJJI) {
            C32694CsM.LJIIJJI = false;
            C32694CsM.LJIIL = SystemClock.uptimeMillis();
        }
        AbstractC32678Cs6 LJLLLLLL = super.LJLLLLLL(i, parent);
        LiveGiftPanelSwipeSetting.INSTANCE.isEnabled();
        Object LLILL = C16880lQ.LLILL(C15380j0.LIZLLL(), "window");
        if (LLILL instanceof WindowManager) {
            windowManager = (WindowManager) LLILL;
        } else {
            windowManager = null;
        }
        Point point = new Point();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getSize(point);
        }
        int LIZ = (point.x - C15380j0.LIZ(8.0f)) / 4;
        if (i == 13 || i == 14) {
            LIZ *= 2;
        }
        LJLLLLLL.itemView.setLayoutParams(new ViewGroup.LayoutParams(LIZ, C15380j0.LIZ(110.0f)));
        return LJLLLLLL;
    }

    @Override // X.C32681Cs9, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractC32678Cs6 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        AbstractC32678Cs6 LJLLLLLL = LJLLLLLL(i, viewGroup);
        C0AX.LIZ(viewGroup, LJLLLLLL.itemView, R.id.lj7);
        View view = LJLLLLLL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LJLLLLLL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJLLLLLL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LJLLLLLL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LJLLLLLL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJLLLLLL.getClass().getName();
        return LJLLLLLL;
    }
}
