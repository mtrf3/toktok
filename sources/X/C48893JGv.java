package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.JGv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48893JGv implements InterfaceC221168m8 {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJFF;
    public static boolean LJI;
    public static long LJII;
    public static long LJIIIZ;
    public static final C48893JGv LIZ = new C48893JGv();
    public static long LJ = -1;
    public static long LJIIIIZZ = -1;

    @Override // X.InterfaceC221168m8
    public final void LJFF() {
        LIZIZ = false;
        LIZJ = false;
        LIZLLL = false;
        LJFF = false;
        LJI = false;
        LJIIIIZZ = -1L;
        LJ = -1L;
        LJII = 0L;
        LJIIIZ = 0L;
        C49133JQb.LIZ("SearchShareVideoPlayInfoHelper", "clean data now");
    }

    public static void LJI() {
        if (LJIIIIZZ != -1) {
            LJII = (System.currentTimeMillis() - LJIIIIZZ) + LJII;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("inner play time: ");
            LIZ2.append(LJII);
            LIZ2.append(", last play time: ");
            LIZ2.append(LJIIIIZZ);
            X1D.LIZIZ(LIZ2);
        }
    }

    @Override // X.InterfaceC221168m8
    public final long LIZ() {
        return LJII;
    }

    @Override // X.InterfaceC221168m8
    public final long LIZLLL() {
        return LJIIIIZZ;
    }

    @Override // X.InterfaceC221168m8
    public final long LJ() {
        return LJIIIZ;
    }

    public static void LJII(long j) {
        LJIIIZ += j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("outer play time ");
        LIZ2.append(LJIIIZ);
        LIZ2.append(", last play time: ");
        LIZ2.append(LJ);
        X1D.LIZIZ(LIZ2);
    }

    public static java.util.Map LJIIIIZZ(long j) {
        Object obj;
        String valueOf = String.valueOf(Math.abs(j - (LJIIIZ + LJII)));
        OSZ[] oszArr = new OSZ[5];
        String str = "1";
        if (LIZIZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("search_is_fullscreen_begin", obj);
        if (!LIZJ) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("search_is_fullscreen_end", str);
        oszArr[2] = new OSZ("search_duration_inner", String.valueOf(LJII));
        oszArr[3] = new OSZ("search_duration_outer", String.valueOf(LJIIIZ));
        oszArr[4] = new OSZ("RD_play_duration_sum_differential", valueOf);
        return C113554cx.LJJL(oszArr);
    }

    @Override // X.InterfaceC221168m8
    public final void LIZJ(long j) {
        if (!LIZLLL) {
            LIZLLL = true;
            LIZIZ = true;
        }
        if (LJFF) {
            LJFF = false;
        } else {
            LJIIIIZZ = j;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("inner start, current: ");
        LIZ2.append(j);
        X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC221168m8
    public final java.util.Map<String, String> LIZIZ(long j, long j2) {
        LIZJ = true;
        LJI();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("inner end,  current: ");
        LIZ2.append(j);
        X1D.LIZIZ(LIZ2);
        return LJIIIIZZ(j2);
    }
}
