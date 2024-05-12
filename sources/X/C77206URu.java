package X;

import com.bytedance.keva.Keva;

/* renamed from: X.URu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77206URu implements URK {
    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        Keva keva = LA5.LIZJ;
        keva.storeLong("last_show_email_dialog_time", System.currentTimeMillis());
        keva.storeInt("email_dialog_show_times", keva.getInt("email_dialog_show_times", 0) + 1);
        return URP.L(c77208URw.LJLILLLLZI, false, null, null, null, false, null, EnumC55722Ltu.UPDATE_LOCAL_FREQ_DATA, 63);
    }
}
