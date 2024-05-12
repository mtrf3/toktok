package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67532kv {
    public static final C67532kv LIZ = new C67532kv();
    public static List<C66342j0> LIZIZ;
    public static List<C66342j0> LIZJ;

    public static String LIZIZ() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        return curUserId;
    }

    public static void LIZ(List list) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("share_video_recent_records");
        LIZ2.append(LIZIZ());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + getCurrentUid())");
        String LIZIZ2 = LIZIZ();
        C64962gm LIZ3 = C48841JEv.LIZ(C78613UtF.LIZJ);
        LIZIZ = null;
        XKX.LIZLLL(LIZ3, null, null, new C66312ix(list, repo, LIZIZ2, null), 3);
    }

    public static C66342j0 LIZJ(String str) {
        List LJLJJL = s.LJLJJL(str, new String[]{":"}, 0, 6);
        if (LJLJJL.size() == 2) {
            Integer LJJIL = C38350F3i.LJJIL((String) ListProtector.get(LJLJJL, 0));
            EnumC66332iz enumC66332iz = EnumC66332iz.EXTERNAL;
            int value = enumC66332iz.getValue();
            if (LJJIL == null || LJJIL.intValue() != value) {
                enumC66332iz = EnumC66332iz.INTERNAL;
                int value2 = enumC66332iz.getValue();
                if (LJJIL == null || LJJIL.intValue() != value2) {
                    return null;
                }
            }
            return new C66342j0(enumC66332iz, (String) ListProtector.get(LJLJJL, 1));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.util.List<X.2j0>, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<X.2j0>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final synchronized void LIZLLL(List<String> list, Keva keva) {
        ?? LJJIJIIJI;
        ?? r6 = LIZJ;
        if (r6 == 0) {
            String[] stringArray = keva.getStringArray("recent_video_share_targets", new String[0]);
            o.LJIIIIZZ(stringArray, "repo.getStringArray(KEVA_KEY, arrayOf())");
            List<String> LJJZZIII = ORY.LJJZZIII(stringArray);
            r6 = new ArrayList();
            for (String it : LJJZZIII) {
                o.LJIIIIZZ(it, "it");
                C66342j0 LIZJ2 = LIZJ(it);
                if (LIZJ2 != null) {
                    r6.add(LIZJ2);
                }
            }
        }
        if (list.size() + r6.size() > 10) {
            if (list.size() >= 10) {
                List<String> subList = list.subList(list.size() - 10, list.size());
                LJJIJIIJI = new ArrayList();
                Iterator<String> it2 = subList.iterator();
                while (it2.hasNext()) {
                    C66342j0 LIZJ3 = LIZJ(it2.next());
                    if (LIZJ3 != null) {
                        LJJIJIIJI.add(LIZJ3);
                    }
                }
            } else {
                QSQ qsq = new QSQ(2);
                qsq.LJ(r6.subList((list.size() + r6.size()) - 10, r6.size()).toArray(new C66342j0[0]));
                ArrayList arrayList = new ArrayList();
                Iterator<String> it3 = list.iterator();
                while (it3.hasNext()) {
                    C66342j0 LIZJ4 = LIZJ(it3.next());
                    if (LIZJ4 != null) {
                        arrayList.add(LIZJ4);
                    }
                }
                qsq.LJ(arrayList.toArray(new C66342j0[0]));
                LJJIJIIJI = C47261Igj.LJJIJIIJI(qsq.LJIIIZ(new C66342j0[qsq.LJFF()]));
            }
        } else {
            QSQ qsq2 = new QSQ(2);
            qsq2.LJ(r6.toArray(new C66342j0[0]));
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it4 = list.iterator();
            while (it4.hasNext()) {
                C66342j0 LIZJ5 = LIZJ(it4.next());
                if (LIZJ5 != null) {
                    arrayList2.add(LIZJ5);
                }
            }
            qsq2.LJ(arrayList2.toArray(new C66342j0[0]));
            LJJIJIIJI = C47261Igj.LJJIJIIJI(qsq2.LJIIIZ(new C66342j0[qsq2.LJFF()]));
        }
        LIZJ = LJJIJIIJI;
        if (LJJIJIIJI != 0) {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
            Iterator it5 = LJJIJIIJI.iterator();
            while (it5.hasNext()) {
                arrayList3.add(((C66342j0) it5.next()).toString());
            }
            keva.storeStringArray("recent_video_share_targets", (String[]) arrayList3.toArray(new String[0]));
        }
    }
}
