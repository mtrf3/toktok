package X;

import android.text.TextUtils;

/* renamed from: X.Uni, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78270Uni implements InterfaceC78272Unk {
    public static final String LIZ() {
        String str = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIJ;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C78258UnW c78258UnW = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ;
        if (c78258UnW.LJII) {
            return "";
        }
        EnumC78271Unj enumC78271Unj = c78258UnW.LJ;
        if (enumC78271Unj == EnumC78271Unj.SG) {
            if (c78258UnW.LJI) {
                return "";
            }
            return "https://f-p.sgsnssdk.com";
        }
        if (enumC78271Unj != EnumC78271Unj.VA || c78258UnW.LJI) {
            return "";
        }
        return "https://f-p-va.isnssdk.com";
    }
}
