package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;

/* renamed from: X.Zrq, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91266Zrq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(IXTabPanelAbility iXTabPanelAbility) {
        LOA loa;
        if (iXTabPanelAbility != null) {
            loa = iXTabPanelAbility.getPanelStatus();
        } else {
            loa = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("status=");
        LIZ2.append(loa);
        X1D.LIZIZ(LIZ2);
        if (loa == LOA.MOVE_DOWN_SHOWING || loa == LOA.MOVE_DOWN_AND_SHOWING_ANIMATING) {
            return true;
        }
        return false;
    }
}
