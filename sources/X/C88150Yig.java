package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Yig, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88150Yig {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final List<InetAddress> LJFF;
    public final boolean LJI;
    public final String LJII;

    public final int LIZ() {
        if (!this.LIZ) {
            return 1;
        }
        int i = this.LIZIZ;
        if (i != 0 && i != 4 && i != 5) {
            return 0;
        }
        switch (this.LIZJ) {
            case 1:
                return 7;
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 5;
            case 5:
                return 10;
            case 6:
                return 11;
            case 7:
                return 6;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 12;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return 4;
            case 12:
                return 13;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return 18;
            case 14:
                return 16;
            case 15:
                return 17;
            default:
                return 0;
        }
    }

    public final int LIZIZ() {
        if (!this.LIZ) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.LIZIZ(this.LIZIZ, this.LIZJ);
    }

    public C88150Yig(boolean z, int i, int i2, boolean z2, String str, List<InetAddress> list, boolean z3, String str2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z2;
        this.LJ = str == null ? "" : str;
        this.LJFF = list == null ? new ArrayList<>() : list;
        this.LJI = z3;
        this.LJII = str2 == null ? "" : str2;
    }
}
