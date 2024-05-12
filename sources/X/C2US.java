package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2US, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2US {
    public HashSet<String> LIZ;
    public volatile HashSet<String> LIZIZ;
    public volatile List<String> LIZJ;

    public final void LIZIZ() {
        if (this.LIZIZ != null) {
            if (!C79004UzY.LJJIFFI(null)) {
                this.LIZIZ.removeAll(null);
            } else {
                this.LIZIZ.clear();
            }
        }
        C1A7.LJIILLIIL("follow_feed").LJFF("to_report_feed_ids", "");
    }

    public final String LIZLLL() {
        if (C79004UzY.LJJIFFI(this.LIZJ)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public final String LJ() {
        if (C79004UzY.LJJIFFI(this.LIZIZ)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public C2US() {
        String LIZIZ = C1A7.LJIILLIIL("follow_feed").LIZIZ("to_report_feed_ids", "");
        if (LIZIZ == null || LIZIZ.isEmpty()) {
            return;
        }
        String[] split = LIZIZ.split(",");
        for (String str : split) {
            LIZ(str);
        }
    }

    public static C2US LIZJ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C2UT.LIZ;
        C2US c2us = (C2US) concurrentHashMap.get(str);
        if (c2us == null) {
            C2US c2us2 = new C2US();
            concurrentHashMap.put(str, c2us2);
            return c2us2;
        }
        return c2us;
    }

    public final void LIZ(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new HashSet<>();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashSet<>();
        }
        if (this.LIZ.contains(str)) {
            return;
        }
        this.LIZIZ.add(str);
        this.LIZ.add(str);
    }
}
