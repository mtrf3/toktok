package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.1V7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1V7 extends AbstractC16850lN<C13810gT> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final ConnectivityManager LJFF;
    public final C16870lP LJI;
    public final C16860lO LJII;

    static {
        C0VW.LIZIZ("NetworkStateTracker");
    }

    @Override // X.AbstractC16850lN
    public final void LIZLLL() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                C0VW.LIZ().getClass();
                this.LJFF.registerDefaultNetworkCallback(this.LJI);
                return;
            } catch (IllegalArgumentException | SecurityException unused) {
                C0VW.LIZ().getClass();
                return;
            }
        }
        C0VW.LIZ().getClass();
        C16880lQ.LJJLIIIJILLIZJL(this.LJII, this.LIZIZ, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // X.AbstractC16850lN
    public final void LJ() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                C0VW.LIZ().getClass();
                this.LJFF.unregisterNetworkCallback(this.LJI);
                return;
            } catch (IllegalArgumentException | SecurityException unused) {
                C0VW.LIZ().getClass();
                return;
            }
        }
        C0VW.LIZ().getClass();
        C16880lQ.LJJLIIIJL(this.LIZIZ, this.LJII);
    }

    public final C13810gT LJFF() {
        boolean z;
        NetworkCapabilities networkCapabilities;
        boolean z2;
        NetworkInfo LJJLI = C16880lQ.LJJLI(this.LJFF);
        boolean z3 = true;
        if (LJJLI != null && LJJLI.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.LJFF.getNetworkCapabilities(this.LJFF.getActiveNetwork());
            } catch (SecurityException unused) {
                C0VW.LIZ().getClass();
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z2 = true;
                    boolean LIZ = C0ZN.LIZ(this.LJFF);
                    if (LJJLI != null || LJJLI.isRoaming()) {
                        z3 = false;
                    }
                    return new C13810gT(z, z2, LIZ, z3);
                }
            }
        }
        z2 = false;
        boolean LIZ2 = C0ZN.LIZ(this.LJFF);
        if (LJJLI != null) {
        }
        z3 = false;
        return new C13810gT(z, z2, LIZ2, z3);
    }

    @Override // X.AbstractC16850lN
    public final C13810gT LIZ() {
        return LJFF();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0lO] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lP] */
    public C1V7(Context context, InterfaceC23750wV interfaceC23750wV) {
        super(context, interfaceC23750wV);
        this.LJFF = (ConnectivityManager) C16880lQ.LLILL(this.LIZIZ, "connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJI = new ConnectivityManager.NetworkCallback() { // from class: X.0lP
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    C0VW.LIZ().getClass();
                    C1V7 c1v7 = C1V7.this;
                    c1v7.LIZJ(c1v7.LJFF());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    C0VW LIZ = C0VW.LIZ();
                    C16880lQ.LLLZ("Network capabilities changed: %s", new Object[]{networkCapabilities});
                    LIZ.getClass();
                    C1V7 c1v7 = C1V7.this;
                    c1v7.LIZJ(c1v7.LJFF());
                }
            };
        } else {
            this.LJII = new BroadcastReceiver() { // from class: X.0lO
                public final void LIZ(Intent intent) {
                    if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        return;
                    }
                    C0VW.LIZ().getClass();
                    C1V7 c1v7 = C1V7.this;
                    c1v7.LIZJ(c1v7.LJFF());
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C84763XOl.LJIIJJI && intent != null) {
                        if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                            C35532Dx2.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C38523F9z.LIZ();
                        LIZ(intent);
                    }
                }
            };
        }
    }
}
