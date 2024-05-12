package X;

import com.bytedance.common.utility.Logger;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Umb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78201Umb implements InterfaceC78208Umi {
    public final /* synthetic */ C78202Umc LIZ;

    @Override // X.InterfaceC78208Umi
    public final void LJIIIZ() {
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13(this.LIZ, 528));
    }

    @Override // X.InterfaceC78208Umi
    public final void onStart() {
        C78194UmU c78194UmU;
        InterfaceC78206Umg interfaceC78206Umg;
        C78161Ulx c78161Ulx;
        this.LIZ.LJLILLLLZI = C32257ClJ.LIZLLL().LIZ();
        C78194UmU c78194UmU2 = this.LIZ.LJLJJL;
        if (c78194UmU2 != null && (c78161Ulx = c78194UmU2.LJ) != null) {
            c78161Ulx.onStart();
        }
        C78202Umc c78202Umc = this.LIZ;
        if (!c78202Umc.LJLJJI && (c78194UmU = c78202Umc.LJLJJL) != null && (interfaceC78206Umg = c78194UmU.LIZLLL) != null) {
            interfaceC78206Umg.LIZ(EnumC78220Umu.ALPHA_PLAYER);
        }
        this.LIZ.LJLJJI = true;
    }

    @Override // X.InterfaceC78208Umi
    public final void onStop() {
        InterfaceC78206Umg interfaceC78206Umg;
        InterfaceC78206Umg interfaceC78206Umg2;
        C78161Ulx c78161Ulx;
        C78194UmU c78194UmU = this.LIZ.LJLJJL;
        if (c78194UmU != null && (c78161Ulx = c78194UmU.LJ) != null) {
            c78161Ulx.LIZIZ(null);
        }
        C78194UmU c78194UmU2 = this.LIZ.LJLJJL;
        if (c78194UmU2 != null && (interfaceC78206Umg2 = c78194UmU2.LIZLLL) != null) {
            interfaceC78206Umg2.LIZJ(EnumC78220Umu.ALPHA_PLAYER);
        }
        C78194UmU c78194UmU3 = this.LIZ.LJLJJL;
        if (c78194UmU3 != null) {
            interfaceC78206Umg = c78194UmU3.LIZLLL;
        } else {
            interfaceC78206Umg = null;
        }
        Logger.i("giftboxprocess", String.valueOf(interfaceC78206Umg));
        this.LIZ.LJLJJL = null;
    }

    public C78201Umb(C78202Umc c78202Umc) {
        this.LIZ = c78202Umc;
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZ(C78163Ulz c78163Ulz) {
        String str;
        int i;
        InterfaceC78206Umg interfaceC78206Umg;
        InterfaceC78206Umg interfaceC78206Umg2;
        C78161Ulx c78161Ulx;
        C78194UmU c78194UmU = this.LIZ.LJLJJL;
        if (c78194UmU != null && (c78161Ulx = c78194UmU.LJ) != null) {
            c78161Ulx.LIZIZ(null);
        }
        C78165Um1 LIZ = this.LIZ.LIZ(null);
        if (c78163Ulz == null) {
            C78194UmU c78194UmU2 = this.LIZ.LJLJJL;
            if (c78194UmU2 != null && (interfaceC78206Umg2 = c78194UmU2.LIZLLL) != null) {
                interfaceC78206Umg2.LJII(EnumC78220Umu.ALPHA_PLAYER, LIZ);
            }
        } else {
            if (c78163Ulz.LIZLLL == null) {
                c78163Ulz.LIZLLL = LIZ;
            }
            C78194UmU c78194UmU3 = this.LIZ.LJLJJL;
            if (c78194UmU3 != null && (interfaceC78206Umg = c78194UmU3.LIZLLL) != null) {
                interfaceC78206Umg.LJFF(EnumC78220Umu.ALPHA_PLAYER, c78163Ulz);
            }
            C78165Um1 c78165Um1 = c78163Ulz.LIZLLL;
            if (c78165Um1 != null) {
                str = c78165Um1.LJIIIZ;
            } else {
                str = null;
            }
            if (o.LJ(str, "DefaultSystemPlayer") && (i = c78163Ulz.LIZ) != 0 && (i == -18 || i == -20 || i == -23)) {
                InterfaceC40667Fxf.LIZ.LIZ(Boolean.TRUE);
            }
        }
        this.LIZ.LJLJJL = null;
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZIZ(C60382Yo c60382Yo) {
        InterfaceC78206Umg interfaceC78206Umg;
        C78161Ulx c78161Ulx;
        C78194UmU c78194UmU = this.LIZ.LJLJJL;
        if (c78194UmU != null && (c78161Ulx = c78194UmU.LJ) != null) {
            c78161Ulx.LIZIZ(c60382Yo);
        }
        C78165Um1 LIZ = this.LIZ.LIZ(c60382Yo);
        C78202Umc c78202Umc = this.LIZ;
        C78194UmU c78194UmU2 = c78202Umc.LJLJJL;
        if (c78194UmU2 != null) {
            interfaceC78206Umg = c78194UmU2.LIZLLL;
        } else {
            interfaceC78206Umg = null;
        }
        c78202Umc.LJLJJL = null;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJII(EnumC78220Umu.ALPHA_PLAYER, LIZ);
        }
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZJ(float f, float f2, float f3, float f4) {
    }
}
