package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ujb.s;

/* renamed from: X.ByV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30527ByV {
    public static final HashMap<String, OSZ<LiveEffect, Long>> LIZ = new HashMap<>();
    public static final C30528ByW LIZIZ = C30528ByW.LJLIL;

    public static void LIZ(int i, Integer num, String str) {
        j LJJIJ;
        String LJJIFFI;
        if (i != 17 || num == null || num.intValue() != 10 || str == null) {
            return;
        }
        try {
            new o();
            m LJIIZILJ = o.LIZ(str).LJIIZILJ();
            if (LJIIZILJ.LJJIJLIJ("resource_added")) {
                g paths = LJIIZILJ.LJJIJIIJI("resource_added");
                kotlin.jvm.internal.o.LJIIIIZZ(paths, "paths");
                Iterator<j> it = paths.iterator();
                while (it.hasNext()) {
                    j next = it.next();
                    if ((next instanceof m) && (LJJIJ = ((m) next).LJJIJ("path")) != null && (LJJIFFI = LJJIJ.LJJIFFI()) != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator<Map.Entry<String, OSZ<LiveEffect, Long>>> it2 = LIZ.entrySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Map.Entry<String, OSZ<LiveEffect, Long>> next2 = it2.next();
                                String key = next2.getKey();
                                kotlin.jvm.internal.o.LJIIIIZZ(key, "entry.key");
                                if (s.LJJJLZIJ(LJJIFFI, key, false) && next2.getValue().getSecond().longValue() != 0) {
                                    String key2 = next2.getKey();
                                    LiveEffect first = next2.getValue().getFirst();
                                    long longValue = currentTimeMillis - next2.getValue().getSecond().longValue();
                                    BZI LIZ2 = C28787BRn.LIZ("livesdk_live_sticker_render_time");
                                    LIZ2.LJIIZILJ();
                                    C77412UZs.LJJIIZ(LIZ2, first);
                                    LIZ2.LJIJJ(Long.valueOf(longValue), "use_time");
                                    LIZ2.LJJIIJZLJL();
                                    if (key2 != null) {
                                        LIZ.remove(key2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
