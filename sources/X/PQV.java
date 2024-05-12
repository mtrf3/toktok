package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes12.dex */
public final class PQV implements InterfaceC28215B5n {
    @Override // X.InterfaceC28215B5n
    public final java.util.Map<String, String> LIZ(PQZ pqz) {
        String str;
        OSZ[] oszArr = new OSZ[2];
        if (C64432PQm.LIZIZ().LIZJ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_battery_saver", str);
        oszArr[1] = new OSZ("is_first_launch_app", String.valueOf(C36152EGu.LJI()));
        return C113554cx.LJJL(oszArr);
    }
}
