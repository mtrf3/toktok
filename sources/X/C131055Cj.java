package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131055Cj implements InterfaceC131065Ck {
    public final ConcurrentHashMap<String, Object> LIZ;

    public C131055Cj(ConcurrentHashMap<String, Object> concurrentHashMap) {
        this.LIZ = concurrentHashMap;
    }

    @Override // X.InterfaceC131065Ck
    public final <T> void LIZ(EnumC127484zQ key, T value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LIZ.put(key.name(), value);
    }
}
