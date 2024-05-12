package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUJ {
    public final GUN LIZ = new GUN();
    public final LinkedHashMap<String, GUU> LIZIZ = new LinkedHashMap<>();
    public GUU LIZJ;

    public final synchronized boolean LIZLLL() {
        boolean z;
        Collection<GUU> values = this.LIZIZ.values();
        o.LJIIIIZZ(values, "records.values");
        ArrayList arrayList = new ArrayList();
        Iterator<GUU> it = values.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            GUU next = it.next();
            if (true ^ (next.LIZLLL instanceof GOS)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() < 1) {
            z = false;
        }
        return z;
    }

    public final synchronized void LIZ(GUU record) {
        o.LJIIIZ(record, "record");
        if (LIZLLL()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RunningTaskFull startNewFailed cancelLast:");
            LIZ.append(true);
            GUH.LJJI(X1D.LIZIZ(LIZ));
            C41574GTi c41574GTi = new C41574GTi();
            c41574GTi.LIZ = "cancel_last_task_while_adding";
            C41359GLb LIZ2 = c41574GTi.LIZ();
            Collection<GUU> values = this.LIZIZ.values();
            o.LJIIIIZZ(values, "records.values");
            ArrayList arrayList = new ArrayList();
            for (GUU guu : values) {
                if (!(guu.LIZLLL instanceof GOS)) {
                    arrayList.add(guu);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GUQ guq = ((GUU) it.next()).LJI;
                if (guq != null) {
                    guq.LIZIZ(LIZ2);
                }
            }
        }
        this.LIZIZ.put(record.LIZIZ, record);
        this.LIZJ = record;
    }

    public final synchronized GUU LIZIZ(String str) {
        GUU guu;
        guu = this.LIZIZ.get(str);
        GUU guu2 = this.LIZJ;
        if (guu == null) {
            LJ(guu2, str);
        } else if ((guu.LIZLLL instanceof GOS) && guu2 != null) {
            LJ(guu2, str);
        }
        guu = guu2;
        return guu;
    }

    public static void LJ(GUU guu, String str) {
        String str2;
        StringBuilder LIZIZ = C25620zW.LIZIZ("PublishScheduler | RedirectRecord oldId:", str, " newId:");
        if (guu != null) {
            str2 = guu.LIZIZ;
        } else {
            str2 = null;
        }
        LIZIZ.append(str2);
        H7B.LIZ(X1D.LIZIZ(LIZIZ));
    }

    public static GUU LIZJ(GUJ guj, String str, PublishModel srcModel) {
        synchronized (guj) {
            o.LJIIIZ(srcModel, "srcModel");
            GUN gun = guj.LIZ;
            GUU LIZIZ = guj.LIZIZ(str);
            if (LIZIZ != null) {
                if (!gun.LIZ(srcModel, LIZIZ.LIZ)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PublishScheduler | Find unequal creationId src:");
                    LIZ.append(srcModel.creationId);
                    LIZ.append(" result:");
                    LIZ.append(LIZIZ.LIZ.creationId);
                    H7B.LIZ(X1D.LIZIZ(LIZ));
                } else {
                    return LIZIZ;
                }
            }
            return null;
        }
    }
}
