package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHN {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final QI3 LJI;
    public final QH9 LJII;
    public long LJIIIIZZ;

    public final boolean LIZ(int i) {
        if (this.LIZ > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.LIZJ;
            long j2 = this.LJIIIIZZ;
            if (currentTimeMillis < j + j2) {
                int i2 = this.LIZLLL;
                if (i2 >= this.LIZIZ) {
                    return true;
                }
                this.LIZLLL = i2 + 1;
            } else {
                this.LIZJ = (((currentTimeMillis - j) / j2) * j2) + j;
                this.LIZLLL = 1;
            }
        }
        int i3 = this.LIZ;
        if (i3 >= 10000) {
            return true;
        }
        if (i3 > 0 && new Random().nextInt(10000) < this.LIZ) {
            return true;
        }
        if ((this.LJ > 0 && 1 == i) || (this.LJFF > 0 && 3 == i)) {
            return true;
        }
        return false;
    }

    public QHN(QI3 qi3, QH9 qh9, long j) {
        this.LJI = qi3;
        this.LJII = qh9;
        this.LJIIIIZZ = j;
    }

    public final void LIZIZ(JSONObject jSONObject, long j, QHC qhc) {
        int i;
        int i2;
        QI4 qi4;
        List<C66749QHp> list;
        int i3;
        this.LJIIIIZZ = j;
        int optInt = jSONObject.optInt("backoff_ratio", 0);
        this.LIZ = optInt;
        if (optInt < 0 || optInt > 10000) {
            this.LIZ = 0;
        }
        if (qhc == null || -1 == (i3 = qhc.LIZ)) {
            i = 12;
        } else if (i3 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = 60;
        }
        int optInt2 = jSONObject.optInt("max_request_frequency", i);
        this.LIZIZ = optInt2;
        if (optInt2 <= 0) {
            this.LIZIZ = 12;
        }
        int i4 = this.LIZ;
        if (i4 > 0) {
            if (this.LIZJ == 0) {
                this.LIZJ = System.currentTimeMillis();
                this.LIZLLL = 1;
            }
        } else if (i4 == 0) {
            this.LIZJ = 0L;
            this.LIZLLL = 0;
        }
        this.LJ = jSONObject.optInt("disable_session_start_request", 0);
        this.LJFF = jSONObject.optInt("disable_session_end_request", 0);
        if (this.LIZ == 0 && (i2 = this.LIZIZ) > 0 && (qi4 = this.LJII.LJIILIIL) != null && (list = qi4.LJLL) != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) qi4.LJLL).iterator();
            while (it.hasNext()) {
                C66749QHp c66749QHp = (C66749QHp) it.next();
                if (qhc == c66749QHp.LJIIIIZZ) {
                    c66749QHp.LJII.LJII[0][2] = i2;
                }
            }
        }
        QIX qix = this.LJI.LJJIZ;
        List<String> singletonList = Collections.singletonList("BackoffController");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("parseBackoffControllerFromResp mEventInterval: ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mBackoffRatio: ");
        LIZ.append(this.LIZ);
        LIZ.append(", mMaxRequestFrequency: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mBackoffWindowStartTime: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", mBackoffWindowSendCount: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mDisableSessionStartRequest: ");
        LIZ.append(this.LJ);
        LIZ.append(", mDisableSessionEndRequest: ");
        LIZ.append(this.LJFF);
        qix.LJIJI(0, singletonList, X1D.LIZIZ(LIZ), new Object[0]);
    }
}
