package X;

import com.bytedance.android.livesdk.livesetting.watchlive.PushStreamUrlConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.live.api.LiveRoomPreloadApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BTm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28838BTm implements B4D {
    public static final C28838BTm LJ = new C28838BTm();
    public static final int LJFF = PushStreamUrlConfig.INSTANCE.getCacheSize();
    public final java.util.Map<String, Room> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final LiveRoomPreloadApi LIZLLL = (LiveRoomPreloadApi) Q7L.LIZIZ(LiveRoomPreloadApi.class);

    public final void LIZ() {
        if (this.LIZ.size() >= LJFF) {
            java.util.Map<String, Room> cacheMap = this.LIZ;
            o.LJIIIIZZ(cacheMap, "cacheMap");
            Iterator<Map.Entry<String, Room>> it = cacheMap.entrySet().iterator();
            if (it.hasNext()) {
                String key = it.next().getKey();
                if (key != null) {
                    this.LIZIZ.remove(key);
                    this.LIZJ.remove(key);
                }
                it.remove();
            }
        }
    }

    public final String LIZIZ(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append('-');
        LIZ.append(str2);
        String remove = concurrentHashMap.remove(X1D.LIZIZ(LIZ));
        if (remove == null) {
            return "null";
        }
        return remove;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0011 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r13, java.lang.String r14, X.RunnableC67235Qa7 r15) {
        /*
            r12 = this;
            java.lang.String r10 = "push-push"
            r1 = 0
            r3 = r13
            if (r3 == 0) goto Lc
            long r6 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r3)     // Catch: java.lang.Exception -> Lc
            goto Le
        Lc:
            r6 = 0
        Le:
            r4 = r14
            if (r4 == 0) goto L16
            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r4)     // Catch: java.lang.Exception -> L16
            goto L18
        L16:
            r8 = 0
        L18:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
        L20:
            return
        L21:
            r2 = r12
            com.ss.android.ugc.aweme.live.api.LiveRoomPreloadApi r5 = r2.LIZLLL
            if (r5 == 0) goto L20
            X.Svk r1 = r5.preloadRoom(r6, r8, r10)
            if (r1 == 0) goto L20
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r0 = r1.LJJJ(r0)
            if (r0 == 0) goto L20
            Y.AfS2S2200000_5 r1 = new Y.AfS2S2200000_5
            r6 = 0
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            Y.AfS2S2200000_5 r6 = new Y.AfS2S2200000_5
            r11 = 1
            r7 = r2
            r8 = r3
            r9 = r4
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r0.LJJJLIIL(r1, r6)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28838BTm.LIZJ(java.lang.String, java.lang.String, X.Qa7):void");
    }
}
