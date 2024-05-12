package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationCode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationLog;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Gtd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42965Gtd extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abor_draft_operation";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "draft_load_success");
        List LJ2 = C43176Gx2.LJ(currentTimeMillis, "draft_load_error");
        List LJ3 = C43176Gx2.LJ(currentTimeMillis, "draft_save_success");
        List LJ4 = C43176Gx2.LJ(currentTimeMillis, "draft_save_error");
        List LJ5 = C43176Gx2.LJ(currentTimeMillis, "draft_delete_success");
        List LJ6 = C43176Gx2.LJ(currentTimeMillis, "draft_delete_error");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = LJ2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new DraftOperationCode(((C43189GxF) it.next()).LIZLLL));
        }
        arrayList.add(new DraftOperationLog("draft_load", LJ.size() + linkedHashSet.size(), ORZ.LLJI(linkedHashSet), LJ.size()));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = LJ4.iterator();
        while (it2.hasNext()) {
            linkedHashSet2.add(new DraftOperationCode(((C43189GxF) it2.next()).LIZLLL));
        }
        arrayList.add(new DraftOperationLog("draft_save", linkedHashSet2.size() + LJ3.size(), ORZ.LLJI(linkedHashSet2), LJ3.size()));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it3 = LJ6.iterator();
        while (it3.hasNext()) {
            linkedHashSet3.add(new DraftOperationCode(((C43189GxF) it3.next()).LIZLLL));
        }
        arrayList.add(new DraftOperationLog("draft_delete", linkedHashSet3.size() + LJ5.size(), ORZ.LLJI(linkedHashSet3), LJ5.size()));
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), arrayList);
        o.LJIIIIZZ(json, "get().getService(GsonPro….java).gson.toJson(infos)");
        return json;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC43178Gx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2112523571: goto L32;
                case -1144329134: goto L29;
                case -826777052: goto L3b;
                case -576852019: goto L20;
                case -351979233: goto L17;
                case 996197256: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "draft_load_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L17:
            java.lang.String r0 = "draft_save_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L20:
            java.lang.String r0 = "draft_delete_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L29:
            java.lang.String r0 = "draft_delete_error"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L32:
            java.lang.String r0 = "draft_load_error"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L3b:
            java.lang.String r0 = "draft_save_error"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc
        L43:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42965Gtd.LIZ(java.lang.String):boolean");
    }
}
