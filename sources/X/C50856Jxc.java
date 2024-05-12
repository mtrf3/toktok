package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Jxc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50856Jxc extends JNS<C50856Jxc> {
    public static final ConcurrentHashMap<String, Integer> LJIILL = new ConcurrentHashMap<>();

    public C50856Jxc() {
        super("search_lynx_load_event");
    }

    public final void LJIIZILJ(int i) {
        LJIILL("container_type", String.valueOf(i));
    }
}
