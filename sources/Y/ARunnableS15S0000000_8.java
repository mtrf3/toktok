package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C46982IcE;
import X.C47281Ih3;
import X.C47448Ijk;
import X.C47455Ijr;
import X.C48693J9d;
import X.C78253UnR;
import X.C78609UtB;
import X.C78886Uxe;
import X.C84763XOl;
import X.IG0;
import X.IWF;
import X.InterfaceC47474IkA;
import X.LNH;
import X.X1D;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.VSyncMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes9.dex */
public class ARunnableS15S0000000_8 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public static void LIZ$1() {
        try {
            InetAddress byName = InetAddress.getByName("whoami.akamai.net");
            if (byName != null) {
                C78609UtB.LJLJJLL = byName.getHostAddress();
                C78609UtB.LJLJL = SystemClock.elapsedRealtime();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update dns server ip:");
                LIZ.append(C78609UtB.LJLJJLL);
                C78253UnR.LJI("DNSServerIP", X1D.LIZIZ(LIZ));
            }
        } catch (UnknownHostException unused) {
        }
    }

    public final void LIZ$0() {
        Aweme LIZIZ;
        String str;
        IWF.LJJLIIIIJ().LJIJ();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (LIZIZ = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ)) != null) {
            String aid = LIZIZ.getAid();
            Aweme aweme = IG0.LIZJ;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(aid, str)) {
                IG0.LJ++;
            }
        }
        IG0.LJIIIIZZ.postDelayed(this, 1000L);
    }

    public ARunnableS15S0000000_8(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        boolean LIZ;
        try {
            aRunnableS15S0000000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        boolean LIZ;
        try {
            try {
                VSyncMonitor.LIZIZ = C16880lQ.LLIIIJ();
            } catch (RuntimeException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initUIThreadChoreographer failed: ");
                LIZ2.append(C78886Uxe.LJJ(e));
                LLog.LIZLLL(4, "VSyncMonitor", X1D.LIZIZ(LIZ2));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        boolean LIZ;
        InterfaceC47474IkA interfaceC47474IkA;
        try {
            if (C47455Ijr.LJ != null) {
                C47448Ijk c47448Ijk = (C47448Ijk) C47455Ijr.LJ;
                c47448Ijk.getClass();
                C46982IcE.LIZIZ().isDebug();
                WeakReference<InterfaceC47474IkA> weakReference = c47448Ijk.LIZ.downloadFinishListener;
                if (weakReference != null && (interfaceC47474IkA = weakReference.get()) != null) {
                    interfaceC47474IkA.LIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        boolean LIZ;
        try {
            if (C47455Ijr.LJ != null) {
                C47455Ijr.LJ.getClass();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        boolean LIZ;
        try {
            C48693J9d.LJLJL = C47281Ih3.LJFF();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        boolean LIZ;
        try {
            LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S0000000_8(int i, String str, int i2) {
        this.$t = i2;
    }

    public ARunnableS15S0000000_8(String str, int i, String str2, int i2) {
        this.$t = i2;
    }
}
