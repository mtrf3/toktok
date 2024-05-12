package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77586Ucg implements InterfaceC77748UfI {
    public final /* synthetic */ C77583Ucd LIZ;

    public C77586Ucg(C77583Ucd c77583Ucd) {
        this.LIZ = c77583Ucd;
    }

    @Override // X.InterfaceC77748UfI
    public final void LIZ(String serviceName, HashMap hashMap) {
        String str;
        Object obj;
        o.LJIIIZ(serviceName, "serviceName");
        C77583Ucd c77583Ucd = this.LIZ;
        c77583Ucd.getClass();
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        OSZ[] oszArr = new OSZ[10];
        oszArr[0] = new OSZ("request_page", "live_detail");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str = "portal";
        } else {
            str = c77583Ucd.LJIIL;
        }
        oszArr[1] = new OSZ("charge_reason", str);
        oszArr[2] = new OSZ("charge_style", "window");
        oszArr[3] = new OSZ("panel_type", "first_charge");
        oszArr[4] = new OSZ("second_entrance", "other_recharge");
        String str2 = "1";
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_anchor", obj);
        oszArr[6] = new OSZ("portal_id", String.valueOf(BJM.LJIIL()));
        if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[7] = new OSZ("is_portal_user", str2);
        oszArr[8] = new OSZ("gift_enter_from", c77583Ucd.LJIILIIL);
        oszArr[9] = new OSZ("notification_type", c77583Ucd.LJIILJJIL);
        java.util.Map LJJL = C113554cx.LJJL(oszArr);
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_pay");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIFFI(LJJL);
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJJIIJZLJL();
    }
}
