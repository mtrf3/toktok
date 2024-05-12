package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SIY implements InterfaceC81754W6s {
    @Override // X.InterfaceC81754W6s
    public final void LIZ(String str, String str2) {
    }

    @Override // X.InterfaceC81754W6s
    public final void LIZIZ(String str, String str2, java.util.Map<String, String> map) {
    }

    @Override // X.InterfaceC81754W6s
    public final void LIZJ(String str, String str2, java.util.Map<String, String> map) {
    }

    @Override // X.InterfaceC81754W6s
    public final void LIZLLL(String str, String str2, boolean z) {
    }

    @Override // X.InterfaceC81754W6s
    public final void LJ(String str) {
    }

    @Override // X.InterfaceC81754W6s
    public final void LJI(String str, String str2, Throwable th, java.util.Map<String, String> map) {
    }

    @Override // X.InterfaceC81754W6s
    public final void LJII(String str) {
    }

    @Override // X.InterfaceC81754W6s
    public final boolean LJIIIZ(String str) {
        return false;
    }

    @Override // X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        long currentTimeMillis;
        Long second;
        if (o.LJ(str, "-1")) {
            return;
        }
        ConcurrentHashMap<String, OSZ<Boolean, Long>> concurrentHashMap = SIZ.LIZJ;
        OSZ<Boolean, Long> osz = concurrentHashMap.get(str);
        if (osz != null && (second = osz.getSecond()) != null) {
            currentTimeMillis = second.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        concurrentHashMap.put(str, new OSZ<>(Boolean.TRUE, C44847Hit.LIZ(currentTimeMillis)));
    }

    @Override // X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        long currentTimeMillis;
        Long second;
        if (o.LJ(str, "-1")) {
            return;
        }
        ConcurrentHashMap<String, OSZ<Boolean, Long>> concurrentHashMap = SIZ.LIZJ;
        OSZ<Boolean, Long> osz = concurrentHashMap.get(str);
        if (osz != null && (second = osz.getSecond()) != null) {
            currentTimeMillis = second.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        concurrentHashMap.put(str, new OSZ<>(Boolean.TRUE, C44847Hit.LIZ(currentTimeMillis)));
        SIZ.LIZLLL.LIZJ();
    }

    @Override // X.InterfaceC81754W6s
    public final void LJIIJ(W5O w5o, Object obj, String str, boolean z) {
        if (o.LJ(str, "-1")) {
            return;
        }
        SIZ.LIZJ.put(str, new OSZ<>(Boolean.FALSE, Long.valueOf(System.currentTimeMillis())));
    }
}
