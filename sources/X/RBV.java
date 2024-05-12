package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RBV {
    public static boolean LIZ = GuestModeServiceImpl.LJIIJJI().LJIIJ();

    public static boolean LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        return arguments.getBoolean("code_sent", false);
    }

    public static String LIZIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        return LIZJ(arguments);
    }

    public static String LIZJ(Bundle bundle) {
        String string = bundle.getString("args_email");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String LIZLLL(Fragment fragment) {
        String string;
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null || (string = arguments.getString("page")) == null) {
            return "";
        }
        return string;
    }

    public static PhoneNumberUtil.PhoneNumber LJ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        return (PhoneNumberUtil.PhoneNumber) arguments.getSerializable("args_phone_number");
    }

    public static String LJFF(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        String string = arguments.getString("args_string_phone_number", "");
        o.LJIIIIZZ(string, "fragment.arguments!!.get…(PHONE_NUMBER_STRING, \"\")");
        return string;
    }

    public static String LJI(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        String string = arguments.getString("ticket", "");
        o.LJIIIIZZ(string, "fragment.arguments!!.getString(TICKET, \"\")");
        return string;
    }

    public static String LJII(BaseAccountBindingsFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        String string = arguments.getString("verify_ticket", "");
        o.LJIIIIZZ(string, "fragment.arguments!!.getString(VERIFY_TICKET, \"\")");
        return string;
    }

    public static boolean LJIIIIZZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        return arguments.getBoolean("login_with_2sv", false);
    }

    public static void LJIIIZ(Fragment fragment, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        arguments.putBoolean("code_sent", z);
    }

    public static void LJIIJ(Bundle bundle, String email) {
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(email, "email");
        bundle.putString("args_email", email);
    }

    public static void LJIIJJI(Fragment fragment, String email) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(email, "email");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        arguments.putString("args_email", email);
    }

    public static void LJIIL(Fragment fragment, PhoneNumberUtil.PhoneNumber phone) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(phone, "phone");
        Bundle requireArguments = fragment.requireArguments();
        o.LJIIIIZZ(requireArguments, "fragment.requireArguments()");
        requireArguments.putSerializable("args_phone_number", phone);
    }

    public static void LJIILIIL(Bundle bundle, String phone) {
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(phone, "phone");
        bundle.putString("args_string_phone_number", phone);
    }

    public static void LJIILJJIL(Fragment fragment, String str) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        LJIILIIL(arguments, str);
    }

    public static void LJIILL(Bundle bundle, String ticket) {
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(ticket, "ticket");
        bundle.putString("ticket", ticket);
    }

    public static void LJIILLIIL(InputCodeFragmentV2 fragment, String str) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        o.LJI(arguments);
        LJIILL(arguments, str);
    }
}
