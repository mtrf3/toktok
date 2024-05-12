package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URM implements URK {
    public final Keva LIZ;

    public URM() {
        Keva keva = UQ2.LIZ().LIZ;
        o.LJIIIIZZ(keva, "PermissionDialogKeva.instance.keva");
        this.LIZ = keva;
    }

    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        URP urp = c77208URw.LJLILLLLZI;
        EnumC77147UPn enumC77147UPn = urp.LJLJI;
        int i = 1;
        this.LIZ.storeInt("total_pop_up_count", urp.LJLJJLL.totalPopupCount + 1);
        int i2 = URN.LIZ[c77208URw.LJLIL.LJ.LIZLLL.ordinal()];
        int i3 = 2;
        if (i2 != 2) {
            if (i2 == 3) {
                this.LIZ.storeLong("last_show_contact_time", System.currentTimeMillis());
                Keva keva = this.LIZ;
                int i4 = URN.LIZIZ[enumC77147UPn.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        "wrong relationAuthPlatform".toString();
                        throw new IllegalStateException("wrong relationAuthPlatform");
                    }
                } else {
                    i3 = 1;
                }
                keva.storeInt("last_permission_pop_up_type", i3);
                if (c77208URw.LJLILLLLZI.LJLJJL) {
                    C19N.LIZJ(this.LIZ, "reask_count", 0, 1, "reask_count");
                } else {
                    C19N.LIZJ(this.LIZ, "rules_major_stage", 0, 1, "rules_major_stage");
                    C19N.LIZJ(this.LIZ, "contact_pop_up_count", 0, 1, "contact_pop_up_count");
                }
            }
        } else {
            this.LIZ.storeLong("last_show_contact_time", System.currentTimeMillis());
            Keva keva2 = this.LIZ;
            int i5 = URN.LIZIZ[enumC77147UPn.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i = 2;
                } else {
                    "wrong relationAuthPlatform".toString();
                    throw new IllegalStateException("wrong relationAuthPlatform");
                }
            }
            keva2.storeInt("last_permission_pop_up_type", i);
        }
        return URP.L(c77208URw.LJLILLLLZI, false, null, null, null, false, null, EnumC55722Ltu.UPDATE_LOCAL_FREQ_DATA, 63);
    }
}
