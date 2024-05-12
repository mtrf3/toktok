package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.cloudmessaging.zzd;
import java.net.MalformedURLException;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import p83.a;

/* renamed from: X.QYj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC67185QYj implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public final void LIZ() {
        final QYU qyu = (QYU) this.LJLILLLLZI;
        while (true) {
            synchronized (qyu) {
                if (qyu.LJLIL == 2) {
                    if (((ArrayDeque) qyu.LJLJJI).isEmpty()) {
                        qyu.LIZJ();
                        return;
                    }
                    final QYY<?> qyy = (QYY) ((ArrayDeque) qyu.LJLJJI).poll();
                    qyu.LJLJJL.put(qyy.LIZ, qyy);
                    qyu.LJLJJLL.LIZIZ.schedule(new Runnable() { // from class: X.QYX
                        public final void LIZ() {
                            QYU qyu2 = QYU.this;
                            int i = qyy.LIZ;
                            synchronized (qyu2) {
                                QYY<?> qyy2 = qyu2.LJLJJL.get(i);
                                if (qyy2 != null) {
                                    qyu2.LJLJJL.remove(i);
                                    qyy2.LIZJ(new C67180QYe("Timed out waiting for response", null));
                                    qyu2.LIZJ();
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                        new StringBuilder(String.valueOf(qyy).length() + 8);
                    }
                    Context context = qyu.LJLJJLL.LIZ;
                    Messenger messenger = qyu.LJLILLLLZI;
                    Message obtain = Message.obtain();
                    obtain.what = qyy.LIZJ;
                    obtain.arg1 = qyy.LIZ;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", qyy.LIZIZ());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", qyy.LIZLLL);
                    obtain.setData(bundle);
                    try {
                        QYZ qyz = qyu.LJLJI;
                        Messenger messenger2 = qyz.LIZ;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            zzd zzdVar = qyz.LIZIZ;
                            if (zzdVar != null) {
                                Messenger messenger3 = zzdVar.LJLIL;
                                messenger3.getClass();
                                messenger3.send(obtain);
                            } else {
                                throw new IllegalStateException("Both messengers are null");
                                break;
                            }
                        }
                    } catch (RemoteException e) {
                        qyu.LIZ(2, e.getMessage());
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void LIZIZ() {
        Pair pair;
        C68048QnE c68048QnE = (C68048QnE) this.LJLILLLLZI;
        c68048QnE.LJFF();
        if (!c68048QnE.LIZ.LJIILLIIL().LJIILLIIL.LIZIZ()) {
            long LIZ = c68048QnE.LIZ.LJIILLIIL().LJIIZILJ.LIZ();
            c68048QnE.LIZ.LJIILLIIL().LJIIZILJ.LIZIZ(1 + LIZ);
            C68033Qmz c68033Qmz = c68048QnE.LIZ;
            if (LIZ >= 5) {
                c68033Qmz.LIZJ().LJIIIIZZ.LIZ("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                c68048QnE.LIZ.LJIILLIIL().LJIILLIIL.LIZ(true);
                return;
            }
            c68033Qmz.LIZIZ().LJFF();
            C68033Qmz.LJIIJ(c68033Qmz.LJIIZILJ);
            C68033Qmz.LJIIJ(c68033Qmz.LJIIZILJ);
            String LJIIJ = c68033Qmz.LJIILJJIL().LJIIJ();
            C67274Qak LJIILLIIL = c68033Qmz.LJIILLIIL();
            LJIILLIIL.LJFF();
            LJIILLIIL.LIZ.LJIILIIL.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = LJIILLIIL.LJI;
            if (str == null || elapsedRealtime >= LJIILLIIL.LJIIIIZZ) {
                LJIILLIIL.LJIIIIZZ = LJIILLIIL.LIZ.LJI.LJIIJJI(LJIIJ, C68555QvP.LIZJ) + elapsedRealtime;
                try {
                    a.C0043a LJIIIZ = C67274Qak.LJIIIZ(LJIILLIIL.LIZ.LIZ);
                    LJIILLIIL.LJI = "";
                    String str2 = LJIIIZ.LIZ;
                    if (str2 != null) {
                        LJIILLIIL.LJI = str2;
                    }
                    LJIILLIIL.LJII = LJIIIZ.LIZIZ;
                } catch (Exception e) {
                    LJIILLIIL.LIZ.LIZJ().LJIIL.LIZIZ(e, "Unable to get advertising id");
                    LJIILLIIL.LJI = "";
                }
                pair = new Pair(LJIILLIIL.LJI, Boolean.valueOf(LJIILLIIL.LJII));
            } else {
                pair = new Pair(str, Boolean.valueOf(LJIILLIIL.LJII));
            }
            Boolean LJIILIIL = c68033Qmz.LJI.LJIILIIL("google_analytics_adid_collection_enabled");
            if ((LJIILIIL != null && !LJIILIIL.booleanValue()) || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                c68033Qmz.LIZJ().LJIIL.LIZ("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                return;
            }
            C68033Qmz.LJIIJ(c68033Qmz.LJIIZILJ);
            C67277Qan c67277Qan = c68033Qmz.LJIIZILJ;
            c67277Qan.LJII();
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(c67277Qan.LIZ.LIZ, "connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
                    if (LJJLI != null && LJJLI.isConnected()) {
                        C68083Qnn LJIL = c68033Qmz.LJIL();
                        c68033Qmz.LJIILJJIL().LIZ.LJI.LJIIJ();
                        String str3 = (String) pair.first;
                        long LIZ2 = c68033Qmz.LJIILLIIL().LJIIZILJ.LIZ() - 1;
                        LJIL.getClass();
                        try {
                            QH7.LJI(str3);
                            QH7.LJI(LJIIJ);
                            String LLLZ = C16880lQ.LLLZ("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{C16880lQ.LLLZ("v%s.%s", new Object[]{64000L, Integer.valueOf(LJIL.LJJLI())}), str3, LJIIJ, Long.valueOf(LIZ2)});
                            if (LJIIJ.equals(LJIL.LIZ.LJI.LJI("debug.deferred.deeplink"))) {
                                LLLZ = LLLZ.concat("&ddl_test=1");
                            }
                            java.net.URL url = new java.net.URL(LLLZ);
                            C68033Qmz.LJIIJ(c68033Qmz.LJIIZILJ);
                            C67277Qan c67277Qan2 = c68033Qmz.LJIIZILJ;
                            OFW ofw = new OFW(c68033Qmz);
                            c67277Qan2.LJFF();
                            c67277Qan2.LJII();
                            c67277Qan2.LIZ.LIZIZ().LJIIL(new P9O(c67277Qan2, LJIIJ, url, ofw));
                            return;
                        } catch (IllegalArgumentException | MalformedURLException e2) {
                            LJIL.LIZ.LIZJ().LJFF.LIZIZ(e2.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                            return;
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
            c68033Qmz.LIZJ().LJIIIIZZ.LIZ("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        c68048QnE.LIZ.LIZJ().LJIIL.LIZ("Deferred Deep Link already retrieved. Not fetching again.");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC67185QYj(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
