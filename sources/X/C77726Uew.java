package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import java.util.LinkedHashMap;

/* renamed from: X.Uew, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77726Uew implements InterfaceC77573UcT {
    public static final java.util.Map<String, InterfaceC77573UcT> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("v2", new C77727Uex());
        linkedHashMap.put("v3", new C77728Uey());
        linkedHashMap.put("v4", new C77729Uez());
        LIZ = linkedHashMap;
    }

    @Override // X.InterfaceC77573UcT
    public final String getContent() {
        InterfaceC77573UcT interfaceC77573UcT = (InterfaceC77573UcT) ((LinkedHashMap) LIZ).get(LiveWalletRechargeExchangeStrengthen.INSTANCE.getValue());
        if (interfaceC77573UcT != null) {
            return interfaceC77573UcT.getContent();
        }
        return null;
    }

    @Override // X.InterfaceC77573UcT
    public final String getTitle() {
        InterfaceC77573UcT interfaceC77573UcT = (InterfaceC77573UcT) ((LinkedHashMap) LIZ).get(LiveWalletRechargeExchangeStrengthen.INSTANCE.getValue());
        if (interfaceC77573UcT != null) {
            return interfaceC77573UcT.getTitle();
        }
        return null;
    }
}
