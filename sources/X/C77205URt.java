package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.TimeUnit;

/* renamed from: X.URt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77205URt implements USJ {
    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        boolean z;
        boolean z2;
        URP urp = c77208URw.LJLILLLLZI;
        long currentTimeMillis = System.currentTimeMillis();
        Keva keva = LA5.LIZJ;
        long j = keva.getLong("last_show_email_dialog_time", 0L);
        C62822Ol8 c62822Ol8 = LA5.LIZLLL;
        long j2 = currentTimeMillis - ((Keva) c62822Ol8.getValue()).getLong("last_show_contact_time", 0L);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (j2 > timeUnit.toMillis(30L) && currentTimeMillis - ((Keva) c62822Ol8.getValue()).getLong("contact_did_pop_up_time", 0L) > timeUnit.toMillis(30L)) {
            z = true;
        } else {
            z = false;
        }
        if ((j == 0 || currentTimeMillis - j >= TimeUnit.DAYS.toMillis(15L)) && keva.getInt("email_dialog_show_times", 0) < 5 && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return URP.L(urp, z2, null, null, null, false, null, null, 126);
    }
}
