package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Lss, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55658Lss extends AbstractC48820JEa {
    public static final C55658Lss LJFF = new C55658Lss();

    public C55658Lss() {
        super("playlist", "mix_feed");
    }

    public final void LJIILL(String playlistId, String str, String str2) {
        String str3;
        o.LJIIIZ(playlistId, "playlistId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playlistId: ");
        LIZ.append(playlistId);
        LIZ.append(", watch history read result: ");
        LIZ.append(str);
        if (str2 != null) {
            str3 = i0.LJFF(", reason: ", str2);
        } else {
            str3 = "";
        }
        LIZ.append(str3);
        LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    public final void LJIILLIIL(String str, String str2, String str3) {
        String str4;
        StringBuilder LIZLLL = C1FL.LIZLLL("playlistId: ", str, ", watch history write result: ", str2);
        if (str3 != null) {
            str4 = i0.LJFF(", reason: ", str3);
        } else {
            str4 = "";
        }
        LIZLLL.append(str4);
        LJIIIIZZ(X1D.LIZIZ(LIZLLL));
    }
}
