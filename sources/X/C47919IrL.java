package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.IrL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47919IrL extends BroadcastReceiver {
    public static boolean LIZ;
    public static ArrayList<InterfaceC47920IrM> LIZIZ;
    public static C47919IrL LIZJ;

    static {
        C16880lQ.LJLLJ(C47919IrL.class);
        LIZ = false;
        LIZIZ = new ArrayList<>();
    }

    public static void LIZIZ(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.ugc.aweme.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Context LLLLL = C16880lQ.LLLLL(context);
        if (LIZJ == null) {
            synchronized (C47919IrL.class) {
                if (LIZJ == null) {
                    LIZJ = new C47919IrL();
                }
            }
        }
        C16880lQ.LJJLIIIJILLIZJL(LIZJ, LLLLL, intentFilter);
    }

    public static void LIZJ(InterfaceC47920IrM interfaceC47920IrM) {
        if (LIZIZ == null) {
            LIZIZ = new ArrayList<>();
        }
        if (!LIZIZ.contains(interfaceC47920IrM)) {
            LIZIZ.add(interfaceC47920IrM);
        }
    }

    public static void LIZLLL(InterfaceC47920IrM interfaceC47920IrM) {
        ArrayList<InterfaceC47920IrM> arrayList = LIZIZ;
        if (arrayList != null && arrayList.contains(interfaceC47920IrM)) {
            LIZIZ.remove(interfaceC47920IrM);
        }
    }

    public final void LIZ(Context context, Intent intent) {
        LIZJ = this;
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE") || intent.getAction().equalsIgnoreCase("com.ss.ugc.aweme.CONNECTIVITY_CHANGE")) {
            if (!C47918IrK.LIZ(context)) {
                LIZ = false;
            } else {
                LIZ = true;
                NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
                if (LJJLI != null && LJJLI.getExtraInfo() != null && LJJLI.getType() == 0) {
                    LJJLI.getExtraInfo().toLowerCase(Locale.getDefault()).equals("cmnet");
                }
            }
            if (!LIZIZ.isEmpty()) {
                int size = LIZIZ.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC47920IrM interfaceC47920IrM = (InterfaceC47920IrM) ListProtector.get(LIZIZ, i);
                    if (interfaceC47920IrM != null) {
                        if (LIZ) {
                            interfaceC47920IrM.LIZIZ();
                        } else {
                            interfaceC47920IrM.LIZ();
                        }
                    }
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
