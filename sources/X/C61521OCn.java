package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OCn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61521OCn {
    public C61276O3c LIZ;
    public final java.util.Map<String, C61522OCo> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Integer> LIZJ;
    public final AtomicBoolean LIZLLL;

    public final void LIZ() {
        OC6.LIZ("gecko-debug-tag", "loop stop");
        Iterator it = ((ConcurrentHashMap) this.LIZIZ).keySet().iterator();
        while (it.hasNext()) {
            C61522OCo c61522OCo = (C61522OCo) ((ConcurrentHashMap) this.LIZIZ).get(it.next());
            if (c61522OCo != null) {
                c61522OCo.LIZJ.set(false);
                c61522OCo.LIZ.removeMessages(c61522OCo.LIZLLL);
                ((ConcurrentHashMap) c61522OCo.LJ).clear();
            }
        }
    }

    public C61521OCn() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZJ = concurrentHashMap;
        this.LIZLLL = new AtomicBoolean(true);
        concurrentHashMap.put(EnumC61516OCi.lv_1.name(), 600);
        concurrentHashMap.put(EnumC61516OCi.lv_2.name(), Integer.valueOf(LinkMicRtcMixBitrateSetting.DEFAULT));
        concurrentHashMap.put(EnumC61516OCi.lv_3.name(), 1800);
    }
}
