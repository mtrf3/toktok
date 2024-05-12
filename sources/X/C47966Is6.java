package X;

import Y.IDHandlerS21S0100000_8;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.HandlerThread;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.b0;

/* renamed from: X.Is6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47966Is6 {
    public static final Object LJIJI = new Object();
    public static C47966Is6 LJIJJ;
    public final Context LIZIZ;
    public boolean LJII;
    public TelephonyManager LJIILIIL;
    public final ConnectivityManager LJIILJJIL;
    public int LIZ = -2;
    public String LIZJ = "NOT_REGISTERED";
    public String LIZLLL = "NOT_REGISTERED";
    public int LJ = -2;
    public int LJFF = -2;
    public int LJI = -2;
    public final Object LJIIIIZZ = new Object();
    public final Object LJIIIZ = new Object();
    public final Object LJIIJ = new Object();
    public final Object LJIIJJI = new Object();
    public final Object LJIIL = new Object();
    public C47967Is7 LJIILL = null;
    public C47965Is5 LJIILLIIL = null;
    public InterfaceC47972IsC LJIIZILJ = null;
    public int LJIJ = -2;

    public static String LIZ(int i) {
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMA - EvDo rev. 0";
            case 6:
                return "CDMA - EvDo rev. A";
            case 7:
                return "CDMA - 1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "iDEN";
            case 12:
                return "CDMA - EvDo rev. B";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "LTE";
            case 14:
                return "CDMA - eHRPD";
            case 15:
                return "HSPA+";
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return "GSM";
            case 17:
                return "TD_SCDMA";
            case 18:
                return "IWLAN";
            case 19:
                return "LTE_CA";
            case 20:
                return "NR";
            default:
                return "UNKNOWN";
        }
    }

    public final void LIZIZ() {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            if (this.LJIJ != defaultDataSubscriptionId) {
                TelephonyManager createForSubscriptionId = this.LJIILIIL.createForSubscriptionId(defaultDataSubscriptionId);
                this.LJIILIIL = createForSubscriptionId;
                createForSubscriptionId.listen(this.LJIILL, 321);
                this.LJIJ = defaultDataSubscriptionId;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkQualityCollect{mGSMType='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", mNetworkType='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", mDataLevel=");
        LIZ.append(this.LJ);
        LIZ.append(", mWifiLevel=");
        LIZ.append(this.LJFF);
        LIZ.append(", lastDataSim=");
        return b0.LIZJ(LIZ, this.LJIJ, '}', LIZ);
    }

    public C47966Is6(Context context) {
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        try {
            this.LIZIZ = context;
            this.LJIILIIL = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            this.LJIILJJIL = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            HandlerThread handlerThread = new HandlerThread("listener_thread");
            handlerThread.start();
            new IDHandlerS21S0100000_8(this, handlerThread.getLooper(), 5).sendEmptyMessage(0);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
