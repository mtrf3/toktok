package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.URf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77191URf implements URK {
    public final Keva LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;

    public C77191URf(int i) {
        Keva keva = UQ2.LIZ().LIZ;
        o.LJIIIIZZ(keva, "PermissionDialogKeva.instance.keva");
        UQG isRussia = UQG.LJLIL;
        o.LJIIIZ(isRussia, "isRussia");
        this.LIZ = keva;
        this.LIZIZ = isRussia;
    }

    @Override // X.USJ
    public final Object LIZ(C77208URw c77208URw, InterfaceC67352kd<? super URP> interfaceC67352kd) {
        EnumC77147UPn enumC77147UPn;
        EnumC77147UPn enumC77147UPn2;
        int i = this.LIZ.getInt("last_permission_pop_up_type", 0);
        if (i != 0 && i != 1) {
            if (i == 2) {
                enumC77147UPn = EnumC77147UPn.FACEBOOK;
            } else {
                "wrong socialRecType".toString();
                throw new IllegalStateException("wrong socialRecType");
            }
        } else {
            enumC77147UPn = EnumC77147UPn.CONTACT;
        }
        if (this.LIZIZ.invoke().booleanValue()) {
            enumC77147UPn2 = EnumC77147UPn.CONTACT;
        } else {
            int i2 = C77198URm.LIZ[enumC77147UPn.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    enumC77147UPn2 = EnumC77147UPn.CONTACT;
                } else {
                    "wrong relationAuthPlatform".toString();
                    throw new IllegalStateException("wrong relationAuthPlatform");
                }
            } else {
                enumC77147UPn2 = EnumC77147UPn.FACEBOOK;
            }
        }
        USS uss = c77208URw.LJLIL.LJ.LIZIZ;
        if (!o.LJ(uss, USU.LIZ)) {
            if (uss instanceof USL) {
                enumC77147UPn2 = ((USL) uss).LIZ;
            } else {
                throw new C162476Zf();
            }
        }
        return URP.L(c77208URw.LJLILLLLZI, true, enumC77147UPn2, null, null, false, null, null, 124);
    }
}
