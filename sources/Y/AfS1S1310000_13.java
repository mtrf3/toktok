package Y;

import X.C77157UPx;
import X.C77177UQr;
import X.EnumC77154UPu;
import X.InterfaceC64592gB;
import X.UR7;
import X.URA;
import X.URB;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS1S1310000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S1310000_13 afS1S1310000_13, Object obj) {
        C77157UPx c77157UPx = (C77157UPx) obj;
        if (c77157UPx.LJLILLLLZI.LJLIL && c77157UPx.LJLIL == EnumC77154UPu.SYNC_STATUS) {
            C77177UQr c77177UQr = C77177UQr.LIZ;
            String str = afS1S1310000_13.s0;
            boolean z = afS1S1310000_13.z4;
            URA ura = (URA) afS1S1310000_13.l1;
            UR7 ur7 = (UR7) afS1S1310000_13.l2;
            c77177UQr.getClass();
            C77177UQr.LJIIZILJ(str, 1, z, ura, ur7, true);
            C77177UQr.LJIIIIZZ().storeBoolean("finish_contact_permission_process", true);
            URB urb = C77177UQr.LJFF;
            if (urb != null) {
                urb.ex();
            }
        }
        EnumC77154UPu enumC77154UPu = c77157UPx.LJLIL;
        if ((enumC77154UPu == EnumC77154UPu.REQUEST_ACTUAL_PERMISSION || enumC77154UPu == EnumC77154UPu.REQUEST_UID_PERMISSION) && !c77157UPx.LJLILLLLZI.LJLIL) {
            boolean LJ = o.LJ(((Map) afS1S1310000_13.l3).get("is_followed_pop_up"), "1");
            C77177UQr c77177UQr2 = C77177UQr.LIZ;
            String str2 = afS1S1310000_13.s0;
            boolean z2 = afS1S1310000_13.z4;
            URA ura2 = (URA) afS1S1310000_13.l1;
            UR7 ur72 = (UR7) afS1S1310000_13.l2;
            c77177UQr2.getClass();
            C77177UQr.LJIIZILJ(str2, 1, z2, ura2, ur72, LJ);
        }
    }

    public static final void accept$1(AfS1S1310000_13 afS1S1310000_13, Object obj) {
        C77157UPx c77157UPx = (C77157UPx) obj;
        if (c77157UPx.LJLILLLLZI.LJLIL && c77157UPx.LJLIL == EnumC77154UPu.SYNC_STATUS) {
            C77177UQr c77177UQr = C77177UQr.LIZ;
            String str = afS1S1310000_13.s0;
            boolean z = afS1S1310000_13.z4;
            URA ura = (URA) afS1S1310000_13.l1;
            UR7 ur7 = (UR7) afS1S1310000_13.l2;
            c77177UQr.getClass();
            C77177UQr.LJIIZILJ(str, 2, z, ura, ur7, true);
            C77177UQr.LJIIIIZZ().storeBoolean("finish_facebook_permission_process", true);
            URB urb = C77177UQr.LJFF;
            if (urb != null) {
                urb.UQ();
            }
        }
        EnumC77154UPu enumC77154UPu = c77157UPx.LJLIL;
        if ((enumC77154UPu == EnumC77154UPu.REQUEST_ACTUAL_PERMISSION || enumC77154UPu == EnumC77154UPu.REQUEST_UID_PERMISSION) && !c77157UPx.LJLILLLLZI.LJLIL) {
            boolean LJ = o.LJ(((Map) afS1S1310000_13.l3).get("is_followed_pop_up"), "1");
            C77177UQr c77177UQr2 = C77177UQr.LIZ;
            String str2 = afS1S1310000_13.s0;
            boolean z2 = afS1S1310000_13.z4;
            URA ura2 = (URA) afS1S1310000_13.l1;
            UR7 ur72 = (UR7) afS1S1310000_13.l2;
            c77177UQr2.getClass();
            C77177UQr.LJIIZILJ(str2, 2, z2, ura2, ur72, LJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS1S1310000_13(String str, String str2, boolean z, URA ura, UR7 ur7, Map<String, String> map) {
        this.$t = map;
        this.s0 = str;
        this.z4 = str2;
        this.l1 = z;
        this.l2 = ura;
        this.l3 = ur7;
    }
}
