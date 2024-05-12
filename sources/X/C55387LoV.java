package X;

import Y.IDRunnableS6S0101000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LoV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55387LoV {
    public volatile List<String> LIZ;

    public final synchronized void LIZIZ() {
        if (this.LIZ != null) {
            this.LIZ.clear();
        }
        C38995FSd.LIZJ().execute(new IDRunnableS6S0101000(5, this, 23));
    }

    public final synchronized String LIZJ() {
        String LIZIZ = C9NH.LIZ(EF7.LIZIZ(), "rec_user").LIZIZ("to_report_rec_user_ids", "");
        if (this.LIZ != null && this.LIZ.size() > 0) {
            StringBuilder sb = new StringBuilder();
            if (!LIZIZ.isEmpty()) {
                sb.append(LIZIZ);
                sb.append(",");
            }
            if (!C9NH.LIZ(EF7.LIZIZ(), "rec_user").LIZIZ("to_report_rec_user_ids", "").isEmpty()) {
                Iterator it = Arrays.asList(C9NH.LIZ(EF7.LIZIZ(), "rec_user").LIZIZ("to_report_rec_user_ids", "").split(",")).iterator();
                while (it.hasNext()) {
                    this.LIZ.remove((String) it.next());
                }
            }
            ArrayList arrayList = new ArrayList(this.LIZ);
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append(",");
            }
            String sb2 = sb.toString();
            if (sb2.endsWith(",")) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            return sb2;
        }
        return LIZIZ;
    }

    public final void LIZLLL() {
        C9NH.LIZ(EF7.LIZIZ(), "rec_user").LJFF("to_report_rec_user_ids", LIZJ());
    }

    public final synchronized void LIZ(int i, String str) {
        if (this.LIZ == null) {
            this.LIZ = Collections.synchronizedList(new ArrayList());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(":");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!this.LIZ.contains(LIZIZ)) {
            this.LIZ.add(LIZIZ);
        }
    }
}
