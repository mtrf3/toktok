package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lsr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55657Lsr {
    public static final C55657Lsr LIZ = new C55657Lsr();
    public static InterfaceC32651Px LIZIZ;
    public static LinkedHashMap<String, String> LIZJ;

    static {
        C84763XOl.LIZIZ().LJJIFFI(C55660Lsu.LJLIL).LIZ(new C55659Lst());
    }

    public static String LIZ(String playlistId) {
        String str;
        o.LJIIIZ(playlistId, "playlistId");
        LinkedHashMap<String, String> linkedHashMap = LIZJ;
        if (linkedHashMap == null) {
            C55658Lss.LJFF.LJIILL(playlistId, "failed", "watch history doesn't exist");
        }
        if (linkedHashMap == null || (str = linkedHashMap.get(playlistId)) == null) {
            C55658Lss.LJFF.LJIILL(playlistId, "failed", "no watch history for this playlist");
            return "";
        }
        C55658Lss.LJFF.LJIILL(playlistId, "success", null);
        return str;
    }
}
