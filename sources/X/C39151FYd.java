package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;

/* renamed from: X.FYd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39151FYd {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public C39151FYd() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 23) {
            i = 25;
        } else if (i2 <= 27) {
            i = 20;
        } else {
            i = 15;
        }
        this.LIZ = i;
        this.LIZIZ = LiveExchangeConfirmThreshold.DEFAULT;
        this.LIZJ = true;
        this.LIZLLL = true;
        this.LJ = true;
        this.LJFF = true;
        this.LJI = false;
    }
}
