package com.ttnet.org.chromium.net;

import J.N;
import X.AnonymousClass028;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.F64;
import X.F66;
import X.O6T;
import Y.ARunnableS25S0200000_6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.ttnet.org.chromium.base.TraceEvent;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class ProxyChangeListener {
    public static final /* synthetic */ int LJ = 0;
    public final Handler LIZ = new Handler(Looper.myLooper());
    public long LIZIZ;
    public ProxyReceiver LIZJ;
    public F64 LIZLLL;

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    public final void LIZIZ() {
        IntentFilter LIZ = AnonymousClass028.LIZ("android.intent.action.PROXY_CHANGE");
        ProxyReceiver proxyReceiver = new ProxyReceiver();
        this.LIZJ = proxyReceiver;
        if (Build.VERSION.SDK_INT < 23) {
            O6T.LIZ(proxyReceiver, O6T.LIZ, LIZ);
            return;
        }
        O6T.LIZ(proxyReceiver, O6T.LIZ, new IntentFilter());
        F64 f64 = new F64(this);
        this.LIZLLL = f64;
        O6T.LIZ(f64, O6T.LIZ, LIZ);
    }

    public void stop() {
        this.LIZIZ = 0L;
        C16880lQ.LJJLIIIJL(O6T.LIZ, this.LIZJ);
        F64 f64 = this.LIZLLL;
        if (f64 != null) {
            C16880lQ.LJJLIIIJL(O6T.LIZ, f64);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    /* loaded from: classes7.dex */
    public class ProxyReceiver extends BroadcastReceiver {
        public ProxyReceiver() {
        }

        public void com_ttnet_org_chromium_net_ProxyChangeListener$ProxyReceiver__onReceive$___twin___(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.LIZ.postDelayed(new ARunnableS25S0200000_6(intent, this, 23), 1000L);
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
                com_ttnet_org_chromium_net_ProxyChangeListener$ProxyReceiver__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                com_ttnet_org_chromium_net_ProxyChangeListener$ProxyReceiver__onReceive$___twin___(context, intent);
            }
        }
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public final void LIZ(F66 f66) {
        if (this.LIZIZ == 0) {
            return;
        }
        if (f66 != null) {
            N.MtXZ30qk(this.LIZIZ, this, f66.LIZ, f66.LIZIZ, f66.LIZJ, f66.LIZLLL);
        } else {
            N.MKwsFZ4t(this.LIZIZ, this);
        }
    }

    public void start(long j) {
        TraceEvent LIZ = TraceEvent.LIZ("ProxyChangeListener.start");
        try {
            this.LIZIZ = j;
            LIZIZ();
            if (LIZ != null) {
                LIZ.close();
            }
        } catch (Throwable th) {
            if (LIZ != null) {
                try {
                    LIZ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
