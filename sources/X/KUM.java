package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KUM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(Fragment fragment, Bundle args, InterfaceC88472Yns interfaceC88472Yns) {
        int i;
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(args, "args");
        String string = args.getString("fromStart", "");
        if (o.LJ(string, "MainPage")) {
            i = 2;
        } else if (o.LJ(string, "RootNode")) {
            i = 3;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("handleOtherOnNodeVisibility social>>>fromStart:");
            LIZ2.append(string);
            C60392Yp.LIZIZ("LComponent", X1D.LIZIZ(LIZ2));
            return;
        }
        interfaceC88472Yns.invoke(Integer.valueOf(i));
    }

    public static void LJ(Fragment fragment, Bundle args, boolean z) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(args, "args");
        if (!C46397IIv.LIZ || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return;
        }
        String string = args.getString("fromStart", "");
        C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0("For You");
        String sv02 = c188787b0.LIZ(mo49getActivity).sv0(sv0);
        String sv03 = c188787b0.LIZ(mo49getActivity).sv0(sv02);
        int i = 0;
        if (o.LJ(string, "MainFragment") || args.getBoolean(sv0) || o.LJ(string, "MainPage") || args.getBoolean(sv02) || o.LJ(string, "RootNode") || args.getBoolean(sv03) || HHG.LIZ) {
            return;
        }
        HHG.LIZ = true;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("logForVisibility not legal >>> isShow:");
        LIZ2.append(z);
        LIZ2.append(",fromStart:");
        LIZ2.append(string);
        LIZ2.append(",mainTopTag:");
        YE1.LIZLLL(LIZ2, sv0, ",mainBottomTag:", sv02, ",rootTag:");
        LIZ2.append(sv03);
        String msg = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg, "msg");
        if (C60402Yq.LIZ) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StringBuilder sb = new StringBuilder(msg);
            sb.append("\n");
            int length = stackTrace.length;
            if (length > 10) {
                length = 10;
                sb.append(stackTrace[0].getClassName());
                sb.append(".");
                sb.append(stackTrace[0].getMethodName());
                sb.append(" ");
                sb.append(stackTrace[0].getLineNumber());
                sb.append("\n");
                i = 0 + 1;
            }
            while (i < length) {
                sb.append(stackTrace[i].getClassName());
                sb.append(".");
                sb.append(stackTrace[i].getMethodName());
                sb.append(" ");
                sb.append(stackTrace[i].getLineNumber());
                sb.append("\n");
                i++;
            }
            msg = sb.toString();
            o.LJIIIIZZ(msg, "stringBuilder.toString()");
        }
        if (!C46397IIv.LIZ) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("LFeedPanel");
        LIZ3.append(">>> ");
        LIZ3.append(msg);
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
    }

    public static void LIZ(Fragment fragment, Bundle bundle, String str, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(fragment, "<this>");
        LIZJ(fragment, bundle, str, interfaceC88472Yns);
    }

    public static void LIZIZ(Fragment fragment, Bundle args, String str, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(args, "args");
        LIZJ(fragment, args, str, interfaceC88472Yns);
    }

    public static void LIZJ(Fragment fragment, Bundle bundle, String str, InterfaceC88472Yns interfaceC88472Yns) {
        int i;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0(str);
        String sv02 = c188787b0.LIZ(mo49getActivity).sv0(sv0);
        String sv03 = c188787b0.LIZ(mo49getActivity).sv0(sv02);
        if (o.LJ(string, "MainFragment") || bundle.getBoolean(sv0)) {
            i = 1;
        } else if (o.LJ(string, "MainPage") || bundle.getBoolean(sv02)) {
            i = 2;
        } else if (o.LJ(string, "RootNode") || bundle.getBoolean(sv03)) {
            i = 3;
        } else {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("handleOnNodeVisibility common>>>fromStart:", string, ",mainTopTag:", sv0, ",mainBottomTag:");
            LIZLLL.append(sv02);
            LIZLLL.append(",rootTag:");
            LIZLLL.append(sv03);
            C60392Yp.LIZIZ("LComponent", X1D.LIZIZ(LIZLLL));
            return;
        }
        interfaceC88472Yns.invoke(Integer.valueOf(i));
    }
}
