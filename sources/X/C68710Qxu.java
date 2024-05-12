package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Qxu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68710Qxu {
    public static final C68710Qxu LIZ = new C68710Qxu();
    public static final C62822Ol8 LIZIZ;
    public static final java.util.Set<String> LIZJ;

    static {
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C68711Qxv.LJLIL);
        LIZIZ = LIZIZ2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZJ = linkedHashSet;
        java.util.Set<String> kevaData = ((Keva) LIZIZ2.getValue()).getStringSet("refresh_key", OQY.INSTANCE);
        o.LJIIIIZZ(kevaData, "kevaData");
        linkedHashSet.addAll(kevaData);
    }
}
