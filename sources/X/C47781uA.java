package X;

import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.BasePreviewWidgetVisibilityChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47781uA extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ InterfaceC65350Pko<? extends BasePreviewWidgetVisibilityChannel> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47781uA(InterfaceC65350Pko<? extends BasePreviewWidgetVisibilityChannel> interfaceC65350Pko) {
        super(1);
        this.LJLIL = interfaceC65350Pko;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        Boolean bool2;
        boolean booleanValue = bool.booleanValue();
        java.util.Map<InterfaceC65350Pko<? extends PreviewWidget>, java.util.Set<InterfaceC65350Pko<? extends BasePreviewWidgetVisibilityChannel>>> map = C0NA.LIZLLL;
        InterfaceC65350Pko<? extends BasePreviewWidgetVisibilityChannel> interfaceC65350Pko = this.LJLIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            java.util.Set set = (java.util.Set) ((LinkedHashMap) C0NA.LIZLLL).get(entry.getKey());
            if (set != null) {
                bool2 = Boolean.valueOf(set.contains(interfaceC65350Pko));
            } else {
                bool2 = null;
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (InterfaceC65350Pko interfaceC65350Pko2 : linkedHashMap.keySet()) {
            if (booleanValue) {
                C0NA.LJ(interfaceC65350Pko2);
            } else {
                C0NA.LIZLLL(interfaceC65350Pko2);
            }
        }
        return C76800UCe.LIZ;
    }
}
