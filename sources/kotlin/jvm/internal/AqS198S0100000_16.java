package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C33A;
import X.C33B;
import X.C41875Gc3;
import X.C53330KwQ;
import X.C63120Opw;
import X.C76800UCe;
import X.C87614Ya2;
import X.C87881YeL;
import X.C87882YeM;
import X.EnumC40671Fxj;
import X.EnumC40673Fxl;
import X.EnumC57385Mfd;
import X.InterfaceC88471Ynr;
import X.V8U;
import X.XKX;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* loaded from: classes17.dex */
public class AqS198S0100000_16 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS198S0100000_16(C87614Ya2 c87614Ya2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c87614Ya2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS198S0100000_16(C87881YeL c87881YeL, int i) {
        super(2);
        this.$t = i;
        this.l0 = c87881YeL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS198S0100000_16(C87882YeM c87882YeM, int i) {
        super(2);
        this.$t = i;
        this.l0 = c87882YeM;
    }

    public static final Object invoke$0(AqS198S0100000_16 aqS198S0100000_16, Object args, Object obj) {
        o.LJIIIZ(args, "args");
        o.LJIIIZ(obj, "<anonymous parameter 1>");
        ((C87614Ya2) aqS198S0100000_16.l0).LJI.LIZJ(args, false, new C41875Gc3(0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        String str;
        View view = (View) obj;
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(vm, "vm");
        C63120Opw c63120Opw = ((C87882YeM) aqS198S0100000_16.l0).LIZ;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        vm.gv0(str);
        ((C87882YeM) aqS198S0100000_16.l0).LJIIJJI(view, vm, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        String str;
        View view = (View) obj;
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(vm, "vm");
        C63120Opw c63120Opw = ((C87882YeM) aqS198S0100000_16.l0).LIZ;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        vm.gv0(str);
        ((C87882YeM) aqS198S0100000_16.l0).LJIIJJI(view, vm, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        String str;
        View messageBtn = (View) obj;
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(messageBtn, "messageBtn");
        o.LJIIIZ(vm, "vm");
        C63120Opw c63120Opw = ((C87882YeM) aqS198S0100000_16.l0).LIZ;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        vm.gv0(str);
        ((C87882YeM) aqS198S0100000_16.l0).LJIIJJI(messageBtn, vm, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(vm, "vm");
        C63120Opw c63120Opw = ((C87882YeM) aqS198S0100000_16.l0).LIZ;
        if (c63120Opw != null) {
            String conversationId = c63120Opw.getConversationId();
            o.LJIIIIZZ(conversationId, "it.conversationId");
            C33A c33a = vm.LJLIL;
            if (c33a != null) {
                XKX.LIZLLL(c33a.LIZ, null, null, new C33B(new AqS69S1100000_1(c33a, conversationId, 0), c33a, null), 3);
            }
        }
        EnumC40671Fxj position = ((C87882YeM) aqS198S0100000_16.l0).LIZLLL.getPosition();
        EnumC40673Fxl displayType = ((C87882YeM) aqS198S0100000_16.l0).LIZLLL.getDisplayType();
        C87882YeM c87882YeM = (C87882YeM) aqS198S0100000_16.l0;
        V8U.LIZ(position, displayType, null, c87882YeM.LIZ, c87882YeM.LIZJ, EnumC57385Mfd.CLEAR_HISTORY);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        boolean z;
        View view = (View) obj;
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(vm, "vm");
        C87881YeL c87881YeL = (C87881YeL) aqS198S0100000_16.l0;
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZ() < 3) {
            z = true;
        } else {
            z = false;
        }
        c87881YeL.LJIIJJI(view, z, vm, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        boolean z;
        View view = (View) obj;
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(vm, "vm");
        C87881YeL c87881YeL = (C87881YeL) aqS198S0100000_16.l0;
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZ() < 5) {
            z = true;
        } else {
            z = false;
        }
        c87881YeL.LJIIJJI(view, z, vm, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        View messageBtn = (View) obj;
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(messageBtn, "messageBtn");
        o.LJIIIZ(vm, "vm");
        ((C87881YeL) aqS198S0100000_16.l0).LJIIJJI(messageBtn, true, vm, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS198S0100000_16 aqS198S0100000_16, Object obj, Object obj2) {
        IMSearchDefaultVM vm = (IMSearchDefaultVM) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(vm, "vm");
        IMUser iMUser = ((C87881YeL) aqS198S0100000_16.l0).LIZ;
        if (iMUser != null) {
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            C33A c33a = vm.LJLIL;
            if (c33a != null) {
                XKX.LIZLLL(c33a.LIZ, null, null, new C33B(new AqS69S1100000_1(c33a, uid, 1), c33a, null), 3);
            }
        }
        EnumC40671Fxj position = ((C87881YeL) aqS198S0100000_16.l0).LJ.getPosition();
        EnumC40673Fxl displayType = ((C87881YeL) aqS198S0100000_16.l0).LJ.getDisplayType();
        C87881YeL c87881YeL = (C87881YeL) aqS198S0100000_16.l0;
        V8U.LIZ(position, displayType, c87881YeL.LIZ, c87881YeL.LIZIZ, c87881YeL.LIZLLL, EnumC57385Mfd.CLEAR_HISTORY);
        return C76800UCe.LIZ;
    }
}
