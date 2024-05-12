package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.Pzg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66272Pzg implements J1T {
    public static int LJLIL;
    public static C66283Pzr LJLILLLLZI;
    public static Object LJLJI;
    public static volatile boolean LJLJJI;
    public static final C66272Pzg LJLJJL = new C66272Pzg();

    public final void LIZIZ(Context context) {
        long clearCallingIdentity;
        Object LLILL = C16880lQ.LLILL(context, "phone");
        if (LLILL != null) {
            TelephonyManager telephonyManager = (TelephonyManager) LLILL;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                try {
                    LJLILLLLZI = new C66283Pzr(this);
                    clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        Executor mainExecutor = context.getMainExecutor();
                        C66283Pzr c66283Pzr = LJLILLLLZI;
                        if (c66283Pzr != null) {
                            telephonyManager.registerTelephonyCallback(mainExecutor, c66283Pzr);
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            LJLJJI = true;
                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyCallback");
                    } finally {
                    }
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    return;
                }
            }
            if (i >= 29) {
                try {
                    LJLJI = new C66270Pze(new ExecutorC64417PPx(C16880lQ.LLJJJJ()));
                    clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        Object obj = LJLJI;
                        if (obj != null) {
                            telephonyManager.listen((PhoneStateListener) obj, 64);
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            LJLJJI = true;
                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.PhoneStateListener");
                    } finally {
                    }
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                    return;
                }
            }
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS47S0100000_11(telephonyManager, 160));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    @Override // X.J1T
    public final boolean LIZ(InterfaceC66286Pzu store, String storeKey, int i, String str, String str2, String str3, C65300Pk0 c65300Pk0) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(storeKey, "storeKey");
        if (!LJLJJI) {
            return true;
        }
        store.LIZIZ(storeKey, Integer.valueOf(LJLIL));
        return false;
    }
}
