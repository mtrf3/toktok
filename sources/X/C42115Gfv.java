package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42115Gfv implements InterfaceC42116Gfw {
    public static final C42115Gfv LIZ = new C42115Gfv();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC42116Gfw
    public final C42131GgB LIZ(String key) {
        o.LJIIIZ(key, "key");
        return new C42131GgB(key);
    }
}
