package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OBd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61485OBd {
    public final ConcurrentHashMap<String, InterfaceC61488OBg> LIZ;
    public final String LIZIZ;

    public C61485OBd() {
        this.LIZ = new ConcurrentHashMap<>();
    }

    public C61485OBd(C61486OBe c61486OBe) {
        this();
        this.LIZIZ = c61486OBe.LIZIZ;
        this.LIZ.putAll(c61486OBe.LIZ);
    }
}
