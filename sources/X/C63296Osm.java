package X;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;

/* renamed from: X.Osm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63296Osm implements InterfaceC63353Oth<Pair<Long, Long>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ MessagesPerUserInitV2ResponseBody LJLILLLLZI;
    public final /* synthetic */ C63622Oy2 LJLJI;
    public final /* synthetic */ C63294Osk LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Pair<Long, Long> pair) {
        Pair<Long, Long> pair2 = pair;
        this.LJLJJI.LJIILJJIL += SystemClock.uptimeMillis() - this.LJLIL;
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMInitHandler handleResponse onCallback, has_more:");
        LIZ.append(this.LJLILLLLZI.has_more);
        LIZ.append(", nextCursor:");
        LIZ.append(this.LJLILLLLZI.next_cursor);
        LIZ.append(", isByUser:");
        LIZ.append(this.LJLJJI.LJ);
        LIZ.append(", seqId:");
        LIZ.append(this.LJLJI.LJLIL);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        InterfaceC63292Osi LIZIZ = C63308Osy.LJI().LIZIZ();
        ((Long) pair2.first).longValue();
        ((Long) pair2.second).longValue();
        LIZIZ.LJIIIZ();
        if (this.LJLILLLLZI.has_more.booleanValue() && this.LJLILLLLZI.next_cursor != null) {
            if (this.LJLJJI.LJ) {
                C63291Osh LIZ2 = C63291Osh.LIZ();
                int i = this.LJLJJI.LIZJ;
                long longValue = this.LJLILLLLZI.next_cursor.longValue();
                LIZ2.getClass();
                C63291Osh.LIZLLL.LIZIZ(Long.valueOf(longValue), C63291Osh.LJIIIIZZ(i, "im_init_page_cursor"));
            }
            C63294Osk.LJIILIIL(this.LJLJJI, SystemClock.uptimeMillis() - uptimeMillis);
            this.LJLJJI.LJIILLIIL(this.LJLILLLLZI.next_cursor.longValue());
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (C63308Osy.LJI().LIZLLL().LJIJJLI == 1) {
                C63269OsL.LIZLLL(true);
            }
            C63294Osk.LJIILIIL(this.LJLJJI, SystemClock.uptimeMillis() - uptimeMillis2);
        } else {
            C63291Osh LIZ3 = C63291Osh.LIZ();
            int i2 = this.LJLJJI.LIZJ;
            LIZ3.getClass();
            C63291Osh.LIZLLL.putBoolean(C63291Osh.LJIIIIZZ(i2, "im_init"), true);
            C63308Osy.LJI().LIZIZ().LJIIJ(this.LJLJJI.LIZJ, 2);
            C63294Osk.LJIILIIL(this.LJLJJI, SystemClock.uptimeMillis() - uptimeMillis);
            this.LJLJJI.LJIILJJIL(true, true);
            long uptimeMillis3 = SystemClock.uptimeMillis();
            C63269OsL.LIZLLL(true);
            C63294Osk.LJIILIIL(this.LJLJJI, SystemClock.uptimeMillis() - uptimeMillis3);
            long uptimeMillis4 = SystemClock.uptimeMillis();
            C63294Osk c63294Osk = this.LJLJJI;
            long j = uptimeMillis4 - c63294Osk.LJIIIIZZ;
            int i3 = c63294Osk.LJFF;
            int i4 = c63294Osk.LJI;
            int i5 = c63294Osk.LJII;
            C63623Oy3 LIZ4 = C63623Oy3.LIZ(this.LJLJI);
            C63294Osk c63294Osk2 = this.LJLJJI;
            C63272OsO.LJII(true, j, i3, i4, i5, LIZ4, c63294Osk2.LJIIJ, c63294Osk2.LJIIJJI, c63294Osk2.LJIIL, c63294Osk2.LJIILIIL, c63294Osk2.LJIILJJIL, c63294Osk2.LJIILL, c63294Osk2.LJIILLIIL);
        }
        C63337OtR.LJII(this.LJLJI, true).LIZ();
    }

    public C63296Osm(C63294Osk c63294Osk, long j, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, C63622Oy2 c63622Oy2) {
        this.LJLJJI = c63294Osk;
        this.LJLIL = j;
        this.LJLILLLLZI = messagesPerUserInitV2ResponseBody;
        this.LJLJI = c63622Oy2;
    }
}
