package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallMainToolPanelBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LyN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55999LyN {
    public static void LIZ(C55975Lxz toolPanelView, MallMainToolPanelBean data) {
        boolean LJIJ;
        o.LJIIIZ(toolPanelView, "toolPanelView");
        o.LJIIIZ(data, "data");
        int i = C56000LyO.LIZ[data.getViewType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                toolPanelView.LIZ();
                C36746EbW.LIZ(3, "UpdateToolPanel old user toolPanel else setEmpty");
                return;
            } else if (data.getUserType() == EnumC55971Lxv.OLD) {
                toolPanelView.setNewStyleContent(data.getToolList());
                C36746EbW.LIZ(3, "UpdateToolPanel old user toolPanel CONTENT setNewStyleContent");
                return;
            } else {
                toolPanelView.LIZ();
                C36746EbW.LIZ(3, "UpdateToolPanel old user toolPanel CONTENT setEmpty");
                return;
            }
        }
        synchronized (C56023Lyl.LIZ) {
            LJIJ = C79057V0z.LJIJ(C56023Lyl.LIZIZ(), "ec_mall_main_tool_panel_has_expose", false);
        }
        if (LJIJ) {
            C36746EbW.LIZ(4, "skeleton");
            toolPanelView.setVisibility(0);
            toolPanelView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            View view = toolPanelView.LJLIL;
            if (view == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(toolPanelView.getContext()), R.layout.aob, toolPanelView, false);
                toolPanelView.LJLIL = LLLLIILL;
                if (LLLLIILL != null) {
                    LLLLIILL.setLayoutParams(layoutParams);
                }
                toolPanelView.addView(toolPanelView.LJLIL);
            } else {
                view.setVisibility(0);
            }
            View view2 = toolPanelView.LJLIL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = toolPanelView.LJLILLLLZI;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            C36746EbW.LIZ(3, "UpdateToolPanel old user toolPanel SKELETON setSkeletonView");
            return;
        }
        toolPanelView.LIZ();
        C36746EbW.LIZ(3, "UpdateToolPanel old user toolPanel SKELETON setEmpty");
    }
}
