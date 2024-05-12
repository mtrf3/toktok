package X;

import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$FCPPopupConfigs;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$Popup;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2ZQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZQ extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, PopupRuleData$Popup>> {
    public static final C2ZQ LJLIL = new C2ZQ();

    public C2ZQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<String, PopupRuleData$Popup> invoke() {
        List<PopupRuleData$Popup> list;
        C2ZT.LIZ.getClass();
        PopupRuleData$FCPPopupConfigs popupRuleData$FCPPopupConfigs = (PopupRuleData$FCPPopupConfigs) C2ZT.LIZIZ.getValue();
        if (popupRuleData$FCPPopupConfigs != null) {
            list = popupRuleData$FCPPopupConfigs.getPopups();
        } else {
            list = null;
        }
        HashMap<String, PopupRuleData$Popup> hashMap = new HashMap<>();
        if (list != null) {
            for (PopupRuleData$Popup popupRuleData$Popup : list) {
                String popupKey = popupRuleData$Popup.getPopupKey();
                if (popupKey != null) {
                    hashMap.put(popupKey, popupRuleData$Popup);
                }
            }
        }
        return hashMap;
    }
}
