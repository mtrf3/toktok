package X;

import Y.IDHandlerS9S0000000_9;

/* renamed from: X.Ohi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62610Ohi {
    public static AKT LIZIZ;
    public static final C62610Ohi LIZ = new C62610Ohi();
    public static final IDHandlerS9S0000000_9 LIZJ = new IDHandlerS9S0000000_9(C16880lQ.LLJJJJ(), 1);

    public static final void LIZ() {
        C62609Ohh c62609Ohh = new C62609Ohh();
        C57702Og c57702Og = C57082Lw.LIZ;
        c57702Og.LIZIZ("video_download_status").observeForever(c62609Ohh, true);
        c57702Og.LIZIZ("video_click_retry").observeForever(new C44929HkD());
        c57702Og.LIZIZ("photo_click_try").observeForever(C62364Odk.LIZIZ.LIZJ());
    }

    public static final void LIZIZ() {
        AKT akt = LIZIZ;
        if (akt != null) {
            akt.LIZ();
        }
        LIZIZ = null;
        IDHandlerS9S0000000_9 iDHandlerS9S0000000_9 = LIZJ;
        if (iDHandlerS9S0000000_9.hasMessages(1)) {
            iDHandlerS9S0000000_9.removeMessages(1);
        }
    }
}
