package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QSb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67021QSb implements InterfaceC67020QSa {
    public final QSZ LIZ;
    public final C72653SfJ LIZIZ;
    public final List<InterfaceC67026QSg> LIZJ;
    public final AtomicInteger LIZLLL;

    public C67021QSb(QSZ qsz) {
        InterfaceC67026QSg c67025QSf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LIZJ = copyOnWriteArrayList;
        this.LIZLLL = new AtomicInteger(0);
        this.LIZ = qsz;
        copyOnWriteArrayList.add(new C67023QSd(qsz.LIZIZ));
        if (qsz.LIZLLL) {
            int i = qsz.LJ;
            if (i != 1) {
                c67025QSf = i == 2 ? new C67024QSe() : c67025QSf;
            } else {
                c67025QSf = new C67025QSf(qsz.LIZ, qsz.LIZIZ);
            }
            copyOnWriteArrayList.add(c67025QSf);
        }
        this.LIZIZ = new C72653SfJ(qsz.LIZIZ, qsz.LIZJ);
    }

    @Override // X.InterfaceC67020QSa
    public final void LIZ(String str, String str2, int i, JSONObject jSONObject) {
        InterfaceC54848Lfo c54845Lfl;
        if (i != 0 && TextUtils.isEmpty(str2)) {
            str2 = "other error";
        }
        int addAndGet = this.LIZLLL.addAndGet(1);
        C67022QSc c67022QSc = new C67022QSc(addAndGet);
        QSZ qsz = this.LIZ;
        c67022QSc.LIZ = qsz.LIZIZ;
        c67022QSc.LIZIZ = qsz.LIZJ;
        c67022QSc.LIZLLL = str;
        c67022QSc.LJFF = i;
        c67022QSc.LJII = jSONObject;
        c67022QSc.LJ = str2;
        c67022QSc.LJI = String.valueOf(System.currentTimeMillis());
        C72653SfJ c72653SfJ = this.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("launch_sequence", addAndGet);
            jSONObject2.put("sdk_name", c67022QSc.LIZ);
            jSONObject2.put("sdk_version", c67022QSc.LIZIZ);
            jSONObject2.put("action_id", c67022QSc.LIZLLL);
            jSONObject2.put("message", c67022QSc.LJ);
            jSONObject2.put("result", c67022QSc.LJFF);
            jSONObject2.put("timestamp", c67022QSc.LJI);
            jSONObject2.put("extra", c67022QSc.LJII);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c72653SfJ.getClass();
        if (C67027QSh.LIZ == null) {
            synchronized (C67027QSh.class) {
                if (C67027QSh.LIZ == null) {
                    try {
                        try {
                            c54845Lfl = new C46104I7o();
                        } catch (Throwable unused) {
                            c54845Lfl = new C54845Lfl();
                        }
                    } catch (Throwable unused2) {
                        Class.forName("");
                        c54845Lfl = new C61576OEq();
                    }
                    C67027QSh.LIZ = c54845Lfl;
                }
            }
        }
        C67027QSh.LIZ.LJ(jSONObject2);
        Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC67026QSg) it.next()).LIZ(c67022QSc);
        }
    }
}
