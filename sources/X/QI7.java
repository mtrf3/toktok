package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QI7 {
    public static final List<String> LJ = Collections.singletonList("BgSessionTaskModel");
    public final Context LIZ;
    public final C66758QHy LIZIZ;
    public final QI6 LIZJ;
    public final QI3 LIZLLL;

    public final void LIZ() {
        this.LIZLLL.LJJIZ.LJIJI(0, LJ, "[Task] clear task session sp", new Object[0]);
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LIZ, 0, LIZIZ()).edit();
            edit.putString("key_task_session", "");
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public final String LIZIZ() {
        if (this.LIZLLL.LJ() != null) {
            return this.LIZLLL.LJ().LJJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applog_task@");
        LIZ.append(this.LIZLLL.LJIIIZ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x017e: IGET (r0 I:X.QI3) = (r6 I:X.QI7) (LINE:16777598) X.QI7.LIZLLL X.QI3, block:B:50:0x017e */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.QI7] */
    public final void LIZJ(QIS qis) {
        ?? r6;
        int i;
        if (qis == null) {
            return;
        }
        try {
            QIM qim = new QIM();
            QI3 qi3 = this.LIZLLL;
            if (qi3.LJIILIIL != null) {
                qi3.LJIILIIL.LJLLI.LIZ(qim);
            }
            qim.LJLILLLLZI = qis.LIZ;
            qim.LJLJJI = qis.LIZIZ;
            qim.LLFZ = 1;
            if (!TextUtils.isEmpty(qis.LIZLLL)) {
                qim.LLFII = qis.LIZLLL;
            }
            if (!TextUtils.isEmpty(qis.LJFF)) {
                qim.LLFFF = qis.LJFF;
            }
            qim.LL = Math.max(0L, (qis.LJI - qis.LIZ) - qis.LJII);
            qim.LLD = qis.LJI;
            boolean z = qis.LIZJ;
            boolean z2 = qis.LJ;
            if (!z) {
                if (!z2) {
                    i = 1;
                } else {
                    i = 3;
                }
            } else if (!z2) {
                i = 2;
            } else {
                i = 4;
            }
            qim.LLFF = Integer.valueOf(i);
            if (QI6.LIZJ(this.LIZJ.LIZLLL)) {
                JSONObject LIZ = this.LIZJ.LIZ();
                this.LIZJ.getClass();
                if (QI6.LIZJ(LIZ)) {
                    if (this.LIZLLL.LJIILLIIL != null && QI8.LJFF != null) {
                        C1PH.LJIILL(LIZ);
                    }
                    this.LIZLLL.LJJIZ.LJIJI(0, LJ, "[Task] save task session to db : {}", qis);
                    C66750QHq c66750QHq = new C66750QHq();
                    c66750QHq.LJIJJLI(this.LIZLLL.LJIIIZ, LIZ, null, qim, null, new JSONArray[]{null, null, null}, new long[]{-1, -1, -1}, null, null, 9);
                    this.LIZIZ.LJ(c66750QHq, true, null, null);
                    return;
                }
                if (LIZ == null) {
                    this.LIZLLL.LJJIZ.LJIILL(LJ, "[Task] saveTaskSession new header is null", null, new Object[0]);
                } else {
                    QIX qix = this.LIZLLL.LJJIZ;
                    List<String> list = LJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[Task] saveTaskSession new header without valid did: ");
                    LIZ2.append(LIZ.optString("device_id"));
                    LIZ2.append(", iid: ");
                    LIZ2.append(LIZ.optString("install_id"));
                    qix.LJIILL(list, X1D.LIZIZ(LIZ2), null, new Object[0]);
                }
                this.LIZLLL.LIZLLL.LJ(QIQ.pack, QIK.f_device_none);
                return;
            }
            JSONObject LIZ3 = this.LIZJ.LIZ();
            if (LIZ3 != null) {
                QIX qix2 = this.LIZLLL.LJJIZ;
                List<String> list2 = LJ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("[Task] saveTaskSession device header without valid did: ");
                LIZ4.append(LIZ3.optString("device_id"));
                LIZ4.append(", iid: ");
                LIZ4.append(LIZ3.optString("install_id"));
                qix2.LJIILL(list2, X1D.LIZIZ(LIZ4), null, new Object[0]);
            } else {
                this.LIZLLL.LJJIZ.LJIILL(LJ, "[Task] saveTaskSession device header is null", null, new Object[0]);
            }
            this.LIZLLL.LIZLLL.LJ(QIQ.pack, QIK.f_device_none);
        } catch (Throwable th) {
            r6.LIZLLL.LJJIZ.LJIILL(LJ, "[Task] Save task session failed", th, new Object[0]);
        }
    }

    public final void LIZLLL(QIS qis) {
        if (qis == null) {
            return;
        }
        this.LIZLLL.LJJIZ.LJIJI(0, LJ, "[Task] saveTaskSessionToSp : {}", qis);
        String LIZ = qis.LIZ();
        if (LIZ == null) {
            LIZ = "";
        }
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LIZ, 0, LIZIZ()).edit();
            edit.putString("key_task_session", LIZ);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public QI7(QI3 qi3, C66758QHy c66758QHy, QI6 qi6) {
        this.LIZIZ = c66758QHy;
        this.LIZJ = qi6;
        this.LIZLLL = qi3;
        this.LIZ = qi3.LJIIJ;
        HandlerThreadC36428ERk.LIZIZ().LIZ(new ARunnableS47S0100000_11(this, 155));
    }
}
