package X;

import Y.IDAListenerS80S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.linkroom.widget.InteractCutShortWidget;

/* renamed from: X.U1r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76527U1r implements Runnable {
    public final /* synthetic */ InteractCutShortWidget LJLIL;
    public final /* synthetic */ C76349Txp LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public RunnableC76527U1r(InteractCutShortWidget interactCutShortWidget, C76349Txp c76349Txp, boolean z, boolean z2) {
        this.LJLIL = interactCutShortWidget;
        this.LJLILLLLZI = c76349Txp;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }

    public final void LIZ() {
        String str;
        Object obj;
        Integer num;
        Object obj2;
        int LIZ;
        View view;
        InteractCutShortWidget interactCutShortWidget = this.LJLIL;
        int i = this.LJLILLLLZI.LJLIL;
        boolean z = this.LJLJI;
        View view2 = interactCutShortWidget.getView();
        FrameLayout.LayoutParams layoutParams = null;
        if (view2 != null && view2.getParent() != null) {
            View view3 = interactCutShortWidget.getView();
            if (view3 != null) {
                obj = view3.getParent();
            } else {
                obj = null;
            }
            if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
                num = Integer.valueOf(view.getHeight());
            } else {
                num = null;
            }
            C29701Eo c29701Eo = interactCutShortWidget.LJLIL;
            if (c29701Eo != null) {
                obj2 = c29701Eo.getLayoutParams();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) obj2;
            }
            if (num != null) {
                num.intValue();
                if (layoutParams != null) {
                    layoutParams.width = C15380j0.LIZ(375.0f);
                    layoutParams.height = C15380j0.LIZ(200.0f);
                    if (!((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                        layoutParams.topMargin = (num.intValue() / 3) - C15380j0.LIZ(100.0f);
                    } else if (i != -1) {
                        if (z) {
                            LIZ = C15380j0.LIZ(95.0f);
                        } else {
                            LIZ = C15380j0.LIZ(200.0f);
                        }
                        layoutParams.topMargin = i - LIZ;
                    } else {
                        layoutParams.topMargin = (num.intValue() / 3) - C15380j0.LIZ(100.0f);
                    }
                    C29701Eo c29701Eo2 = interactCutShortWidget.LJLIL;
                    if (c29701Eo2 != null) {
                        c29701Eo2.setLayoutParams(layoutParams);
                    }
                }
            }
        }
        C29701Eo c29701Eo3 = this.LJLIL.LJLIL;
        if (this.LJLJJI) {
            str = "ttlive_match_result_ani_lose_without_bg.zip";
        } else {
            str = "ttlive_match_result_ani_win_without_bg.zip";
        }
        C15490jB.LJIIJ(c29701Eo3, "tiktok_live_match_redesign_resource", str, true);
        InteractCutShortWidget interactCutShortWidget2 = this.LJLIL;
        C29701Eo c29701Eo4 = interactCutShortWidget2.LJLIL;
        if (c29701Eo4 != null) {
            c29701Eo4.addAnimatorListener(new IDAListenerS80S0100000_13(interactCutShortWidget2, 1));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
