package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JEv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48841JEv implements InterfaceC75158Tec, InterfaceC48038ItG, InterfaceC73592SuS, InteractConfig.UrlDispatcher {
    public static String LJLIL;
    public static InterfaceC47478IkE LJLILLLLZI;
    public static boolean LJLJI;
    public static final C48841JEv LJLJJI = new C48841JEv();
    public static final C48841JEv LJLJJL = new C48841JEv();

    @Override // X.InterfaceC75158Tec
    public void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILJJIL(int i, int i2, String str) {
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILL(Exception exc, String str) {
    }

    public static final C64962gm LIZIZ() {
        return new C64962gm(T2R.LJIIJJI().plus(C36636EZk.LIZ));
    }

    public static String LJIIJJI() {
        String str;
        if (TextUtils.isEmpty(LJLIL)) {
            try {
                str = new String(Base64.decode("c25zc2RrX29wZW51ZGlk".getBytes("UTF-8"), 2));
            } catch (Exception unused) {
                str = "";
            }
            LJLIL = str;
        }
        return LJLIL;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.model.InteractConfig.UrlDispatcher
    public String userRegion() {
        return C64707PaR.LIZJ;
    }

    public static final C64962gm LIZ(MBA mba) {
        if (mba.get(InterfaceC79150V4o.LJJJJJ) == null) {
            mba = mba.plus(C79146V4k.LJIILIIL());
        }
        return new C64962gm(mba);
    }

    public static SharedPreferences LJIIJ(Context context) {
        return F9J.LIZIZ(context, 0, "applog_stats");
    }

    public static String LJIIL(Throwable th) {
        if (th == null) {
            return "";
        }
        Throwable th2 = th;
        while (!(th2 instanceof UnknownHostException)) {
            th2 = th2.getCause();
            if (th2 == null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                return stringWriter.toString();
            }
        }
        return "UnknownHostException";
    }

    public static final boolean LJIILLIIL(InterfaceC70422pa interfaceC70422pa) {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) interfaceC70422pa.getCoroutineContext().get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o == null) {
            return true;
        }
        return interfaceC79150V4o.isActive();
    }

    public static final boolean LJIIZILJ(InterfaceC136115Vv interfaceC136115Vv) {
        if (interfaceC136115Vv == null || !interfaceC136115Vv.Jj0()) {
            return false;
        }
        return true;
    }

    public static int LJIJ(Boolean bool) {
        return o.LJ(bool, Boolean.TRUE) ? 1 : 0;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error");
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.model.InteractConfig.UrlDispatcher
    public String urlDispatch(String str) {
        C37819Esp ttUrlDispatch;
        try {
            ttUrlDispatch = TTNetInit.ttUrlDispatch(str);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateUserCustomRtcConfig config url dispatcher exception ");
            LIZ.append(th.getMessage());
            U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        }
        if (!TextUtils.isEmpty(ttUrlDispatch.LIZ)) {
            return ttUrlDispatch.LIZ;
        }
        return null;
    }

    public static final void LIZJ(InterfaceC70422pa interfaceC70422pa, CancellationException cancellationException) {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) interfaceC70422pa.getCoroutineContext().get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(cancellationException);
        } else {
            String LJIILLIIL = o.LJIILLIIL(interfaceC70422pa, "Scope cannot be cancelled because it does not have a job: ");
            LJIILLIIL.toString();
            throw new IllegalStateException(LJIILLIIL);
        }
    }

    public static void LIZLLL(InterfaceC70422pa interfaceC70422pa, String str) {
        LIZJ(interfaceC70422pa, C62848OlY.LIZ(str, null));
    }

    public static final Object LJI(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC67352kd interfaceC67352kd) {
        C84662XKo c84662XKo = new C84662XKo(interfaceC67352kd, interfaceC67352kd.getContext());
        return C78555UsJ.LJJJIL(c84662XKo, c84662XKo, interfaceC88471Ynr);
    }

    public static void LJII(String str, String str2) {
        LJIIIIZZ(str, str2, null);
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        InterfaceC47478IkE interfaceC47478IkE = LJLILLLLZI;
        if (interfaceC47478IkE != null && LJLJI) {
            C47466Ik2 c47466Ik2 = (C47466Ik2) interfaceC47478IkE;
            if (!C46982IcE.LIZIZ().isDebug()) {
                C46474ILu.LIZ(str, str2);
            }
            JSONObject genAlogJSON = c47466Ik2.LIZ.genAlogJSON(str, str2, str3);
            if (genAlogJSON != null) {
                C46982IcE.LIZ().d("VideoCache", genAlogJSON);
            }
        }
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        InterfaceC47478IkE interfaceC47478IkE = LJLILLLLZI;
        if (interfaceC47478IkE != null && LJLJI) {
            C47466Ik2 c47466Ik2 = (C47466Ik2) interfaceC47478IkE;
            if (!C46982IcE.LIZIZ().isDebug()) {
                C46474ILu.LIZ(str, str2);
            }
            JSONObject genAlogJSON = c47466Ik2.LIZ.genAlogJSON(str, str2, str3);
            if (genAlogJSON != null) {
                C46982IcE.LIZ().e("VideoCache", genAlogJSON);
            }
        }
    }

    public static void LJIILIIL(String str, String str2, String str3) {
        InterfaceC47478IkE interfaceC47478IkE = LJLILLLLZI;
        if (interfaceC47478IkE != null && LJLJI) {
            C47466Ik2 c47466Ik2 = (C47466Ik2) interfaceC47478IkE;
            if (!C46982IcE.LIZIZ().isDebug()) {
                C46474ILu.LIZ(str, str2);
            }
            JSONObject genAlogJSON = c47466Ik2.LIZ.genAlogJSON(str, str2, str3);
            if (genAlogJSON != null) {
                C46982IcE.LIZ().i("VideoCache", genAlogJSON);
            }
        }
    }

    public static void LJIJI(String str, String str2, String str3) {
        InterfaceC47478IkE interfaceC47478IkE = LJLILLLLZI;
        if (interfaceC47478IkE != null && LJLJI) {
            C47466Ik2 c47466Ik2 = (C47466Ik2) interfaceC47478IkE;
            if (!C46982IcE.LIZIZ().isDebug()) {
                C46474ILu.LIZ(str, str2);
            }
            JSONObject genAlogJSON = c47466Ik2.LIZ.genAlogJSON(str, str2, str3);
            if (genAlogJSON != null) {
                C46982IcE.LIZ().w("VideoCache", genAlogJSON);
            }
        }
    }
}
