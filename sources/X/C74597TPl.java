package X;

import Y.AfS29S0110000_13;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TPl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74597TPl {
    public static boolean LIZ;
    public static EnumC74700TTk LIZIZ;
    public static final java.util.Map<String, String> LIZJ = new HashMap();
    public static final java.util.Map<String, String> LIZLLL = new HashMap();
    public static C73411SrX LJ;

    public static final void LIZ() {
        LIZ = false;
        LIZIZ = null;
        ((HashMap) LIZJ).clear();
        ((HashMap) LIZLLL).clear();
        C73411SrX c73411SrX = LJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LJ = null;
    }

    public static void LIZIZ(boolean z, Room room) {
        C73411SrX c73411SrX = LJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LJ = (C73411SrX) C1EW.LIZ(AbstractC73672Svk.LJJIJIIJIL(0L, 1L, 1L, 1L, TimeUnit.MINUTES)).LJJJLIIL(new AfS29S0110000_13(room, z, 4), new InterfaceC64592gB() { // from class: X.9Cj
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
