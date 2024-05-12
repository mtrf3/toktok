package X;

import Y.AfS67S0100000_15;
import Y.IDaS224S0100000_15;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XjK */
/* loaded from: classes16.dex */
public final class C85642XjK {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(BaseAccountFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.getBoolean("is_email_verified")) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(BaseAccountFlowFragment fragment) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            i = arguments.getInt("current_scene");
        } else {
            i = -1;
        }
        if (i == EnumC69116RAq.UNBIND_PHONE.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(BaseAccountFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.Al() == EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_PHONE || fragment.Al() == EnumC69113RAn.UNBIND_PHONE_VERIFY) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(BaseAccountFlowFragment fragment, String str, InterfaceC65784Pro interfaceC65784Pro, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro2) {
        o.LJIIIZ(fragment, "fragment");
        C69093R9t.LJIJI(fragment, fragment, "", 6, str, map, null, 192).LJIIIZ(new AfS67S0100000_15(interfaceC65784Pro2, 55)).LJI(new IDaS224S0100000_15(interfaceC65784Pro, 6)).LJIILL();
    }

    public static void LJFF(BaseAccountFlowFragment fragment, String str, InterfaceC65784Pro interfaceC65784Pro, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro2) {
        o.LJIIIZ(fragment, "fragment");
        C69093R9t.LJIJJ(fragment, fragment, "", EnumC69113RAn.UNBIND_PHONE_CONFIRM, str, map).LJIIIZ(new AfS67S0100000_15(interfaceC65784Pro2, 56)).LJI(new IDaS224S0100000_15(interfaceC65784Pro, 7)).LJIILL();
    }

    public static /* synthetic */ void LJ(BaseAccountFlowFragment baseAccountFlowFragment, String str, AqS165S0100000_15 aqS165S0100000_15, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro, int i) {
        if ((i & 4) != 0) {
            aqS165S0100000_15 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        LIZLLL(baseAccountFlowFragment, str, aqS165S0100000_15, map, interfaceC65784Pro);
    }

    public static /* synthetic */ void LJI(BaseAccountFlowFragment baseAccountFlowFragment, String str, AqS165S0100000_15 aqS165S0100000_15, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro, int i) {
        if ((i & 4) != 0) {
            aqS165S0100000_15 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        LJFF(baseAccountFlowFragment, str, aqS165S0100000_15, map, interfaceC65784Pro);
    }
}
