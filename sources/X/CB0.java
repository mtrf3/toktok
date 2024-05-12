package X;

import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveFinishPagePreloadTypeSetting;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CB0 {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C5T.LJLIL);

    public static void LIZ() {
        if (LiveFinishPagePreloadTypeSetting.INSTANCE.getValue() != 2) {
            return;
        }
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        String str = (String) LIZ.getValue();
        c60827Nu3.getClass();
        C60827Nu3.LIZ(str, "live_broadcast_end");
    }

    public static void LIZIZ() {
        if (LiveFinishPagePreloadTypeSetting.INSTANCE.getValue() == 0) {
            return;
        }
        C58310MuY.LIZIZ.getClass();
        if (C60827Nu3.LJFF("live_broadcast_end") != null) {
            return;
        }
        ALE ale = new ALE();
        ale.LIZ = "live_broadcast_end";
        ale.LJIILIIL = C47261Igj.LJJIJ(LIZ.getValue());
        ale.LJIILL = true;
        ale.LJIIL = CBW.LJLIL;
        ale.LIZIZ(CB4.LJLIL);
        C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
    }

    public static void LIZJ() {
        LruCache<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> lruCache;
        java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot;
        LinkedList<SoftReference<InterfaceC60831Nu7>> linkedList;
        Integer valueOf;
        if (LiveFinishPagePreloadTypeSetting.INSTANCE.getValue() == 0) {
            return;
        }
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        C5H3 c5h3 = LIZ;
        Object cacheKey = c5h3.getValue();
        c60827Nu3.getClass();
        o.LJIIJ(cacheKey, "cacheKey");
        C59886Nes LJFF = C60827Nu3.LJFF("live_broadcast_end");
        if (LJFF != null && (lruCache = LJFF.LJI) != null && (snapshot = lruCache.snapshot()) != null && (linkedList = snapshot.get(cacheKey)) != null && (valueOf = Integer.valueOf(linkedList.size())) != null && valueOf.intValue() > 0) {
            return;
        }
        C60827Nu3.LJIIIZ((String) c5h3.getValue(), "live_broadcast_end", null, null, true, Boolean.FALSE);
    }
}
