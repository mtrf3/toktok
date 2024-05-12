package X;

import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$FCPPopupConfigs;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$PopupGroup;
import java.util.List;

/* renamed from: X.2ZP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZP extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends PopupRuleData$PopupGroup>> {
    public static final C2ZP LJLIL = new C2ZP();

    public C2ZP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends PopupRuleData$PopupGroup> invoke() {
        C2ZT.LIZ.getClass();
        PopupRuleData$FCPPopupConfigs popupRuleData$FCPPopupConfigs = (PopupRuleData$FCPPopupConfigs) C2ZT.LIZIZ.getValue();
        if (popupRuleData$FCPPopupConfigs != null) {
            return popupRuleData$FCPPopupConfigs.getGroups();
        }
        return null;
    }
}
