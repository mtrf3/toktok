package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.J0y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48480J0y {
    public static volatile FeedItemList LIZ;
    public static final Object LIZIZ = new Object();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C48481J0z.LJLIL);
    public static String[] LIZLLL;

    static {
        String[] stringArray = LJ().getStringArray("nearby_feed_consumed_list", new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(\n   …ptyArray<String>(),\n    )");
        LIZLLL = stringArray;
    }

    public static Keva LJ() {
        Object value = LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static File LIZLLL() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath());
        String str = File.separator;
        YE1.LIZLLL(LIZ2, str, "nearby_cache", str, "nearby_feed.json");
        File file = new File(X1D.LIZIZ(LIZ2));
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0093, code lost:
    
        if (r7.getItems().size() > 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LIZIZ(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48480J0y.LIZIZ(java.lang.String):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public static FeedItemList LIZJ(String str) {
        FeedItemList feedItemList;
        List<Aweme> items;
        J10.LIZ.getClass();
        if (J10.LIZ() == 0) {
            return null;
        }
        synchronized (LIZIZ) {
            if (LIZ == null) {
                LIZ = LIZIZ(str);
            }
            FeedItemList feedItemList2 = LIZ;
            if (feedItemList2 != null && (items = feedItemList2.getItems()) != null) {
                Iterator<Aweme> it = items.iterator();
                while (it.hasNext()) {
                    it.next().setClientCache(true);
                }
            }
            feedItemList = LIZ;
        }
        return feedItemList;
    }

    public static void LJFF(int i) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key", "nearby_cache");
            linkedHashMap.put("value_int1", String.valueOf(i));
            FMX.LJIIL("location_power_track", linkedHashMap);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.feed.model.FeedItemList r4) {
        /*
            java.util.List r1 = r4.getItems()
            if (r1 == 0) goto L2d
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L29
            java.lang.String r0 = ""
        L29:
            r4.add(r0)
            goto L15
        L2d:
            r4 = 0
        L2e:
            r3 = 0
            if (r4 == 0) goto L4c
            com.bytedance.keva.Keva r2 = LJ()
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r1 = r4.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "nearby_feed_consumed_list"
            r2.storeStringArray(r0, r1)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L4e
        L4c:
            java.lang.String[] r0 = new java.lang.String[r3]
        L4e:
            X.C48480J0y.LIZLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48480J0y.LJI(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    public static void LJII(String str) {
        J10.LIZ.getClass();
        if (J10.LIZ() != 0 && ORY.LJJIJIIJIL(str, LIZLLL)) {
            String[] strArr = LIZLLL;
            strArr[ORY.LJJJJIZL(str, strArr)] = "";
            LJ().storeStringArray("nearby_feed_consumed_list", LIZLLL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        if (0 != 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.feed.model.FeedItemList r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48480J0y.LIZ(com.ss.android.ugc.aweme.feed.model.FeedItemList, java.lang.String):void");
    }
}
