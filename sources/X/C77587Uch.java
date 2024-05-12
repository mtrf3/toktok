package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Uch, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77587Uch implements InterfaceC77748UfI {
    public final /* synthetic */ C77603Ucx LIZ;

    public C77587Uch(C77603Ucx c77603Ucx) {
        this.LIZ = c77603Ucx;
    }

    @Override // X.InterfaceC77748UfI
    public final void LIZ(String str, HashMap hashMap) {
        String str2;
        HashMap LIZ = C1R5.LIZ(str, "serviceName");
        if (hashMap != null) {
            LIZ.putAll(hashMap);
        }
        C77603Ucx c77603Ucx = this.LIZ;
        c77603Ucx.getClass();
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("charge_style", "window");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_anchor", str2);
        hashMap2.put("request_page", "live_detail");
        c77603Ucx.LJII(hashMap2);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_pay");
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ2.LJJIFFI(LIZ);
        LIZ2.LJJIFFI(hashMap2);
        LIZ2.LJJIIJZLJL();
    }
}
