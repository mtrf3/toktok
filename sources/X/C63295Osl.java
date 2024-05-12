package X;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;

/* renamed from: X.Osl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63295Osl implements InterfaceC63353Oth<Pair<Long, Long>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ MessagesPerUserInitV2ResponseBody LJLJI;
    public final /* synthetic */ C63622Oy2 LJLJJI;
    public final /* synthetic */ C63294Osk LJLJJL;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Pair<Long, Long> pair) {
        Pair<Long, Long> pair2 = pair;
        this.LJLJJL.LJIILJJIL += SystemClock.uptimeMillis() - this.LJLIL;
        if (this.LJLILLLLZI) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.LJLJJL.LJFF++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMInitHandler handleResponse onCallback, has_more:");
            LIZ.append(this.LJLJI.has_more);
            LIZ.append(", nextCursor:");
            LIZ.append(this.LJLJI.next_cursor);
            LIZ.append(", isByUser:");
            LIZ.append(this.LJLJJL.LJ);
            LIZ.append(", seqId:");
            LIZ.append(this.LJLJJI.LJLIL);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            InterfaceC63292Osi LIZIZ = C63308Osy.LJI().LIZIZ();
            ((Long) pair2.first).longValue();
            ((Long) pair2.second).longValue();
            LIZIZ.LJIIIZ();
            C63291Osh LIZ2 = C63291Osh.LIZ();
            int i = this.LJLJJL.LIZJ;
            LIZ2.getClass();
            long j = 0;
            if (C63291Osh.LIZLLL(i) <= 0) {
                C63291Osh LIZ3 = C63291Osh.LIZ();
                int i2 = this.LJLJJL.LIZJ;
                Long l = this.LJLJI.per_user_cursor;
                if (l != null) {
                    j = l.longValue();
                }
                LIZ3.getClass();
                C63291Osh.LJIIJJI(i2, j);
            }
            if (this.LJLJI.has_more.booleanValue() && this.LJLJI.next_cursor != null) {
                if (this.LJLJJL.LJ) {
                    C63291Osh LIZ4 = C63291Osh.LIZ();
                    int i3 = this.LJLJJL.LIZJ;
                    long longValue = this.LJLJI.next_cursor.longValue();
                    LIZ4.getClass();
                    C63291Osh.LIZLLL.LIZIZ(Long.valueOf(longValue), C63291Osh.LJIIIIZZ(i3, "im_init_page_cursor"));
                }
                if (C63308Osy.LJI().LIZLLL().LJIJJLI == 1) {
                    C63269OsL.LIZLLL(true);
                }
                C63294Osk.LJIILIIL(this.LJLJJL, SystemClock.uptimeMillis() - uptimeMillis);
            } else {
                C63291Osh LIZ5 = C63291Osh.LIZ();
                int i4 = this.LJLJJL.LIZJ;
                LIZ5.getClass();
                C63291Osh.LIZLLL.putBoolean(C63291Osh.LJIIIIZZ(i4, "im_init"), true);
                C63308Osy.LJI().LIZIZ().LJIIJ(this.LJLJJL.LIZJ, 2);
                C63294Osk.LJIILIIL(this.LJLJJL, SystemClock.uptimeMillis() - uptimeMillis);
                this.LJLJJL.LJIILJJIL(true, true);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                C63269OsL.LIZLLL(true);
                C63294Osk.LJIILIIL(this.LJLJJL, SystemClock.uptimeMillis() - uptimeMillis2);
                long uptimeMillis3 = SystemClock.uptimeMillis();
                C63294Osk c63294Osk = this.LJLJJL;
                long j2 = uptimeMillis3 - c63294Osk.LJIIIIZZ;
                int i5 = c63294Osk.LJFF;
                int i6 = c63294Osk.LJI;
                int i7 = c63294Osk.LJII;
                C63623Oy3 LIZ6 = C63623Oy3.LIZ(this.LJLJJI);
                C63294Osk c63294Osk2 = this.LJLJJL;
                C63272OsO.LJII(true, j2, i5, i6, i7, LIZ6, c63294Osk2.LJIIJ, c63294Osk2.LJIIJJI, c63294Osk2.LJIIL, c63294Osk2.LJIILIIL, c63294Osk2.LJIILJJIL, c63294Osk2.LJIILL, c63294Osk2.LJIILLIIL);
            }
            C63337OtR.LJII(this.LJLJJI, true).LIZ();
        } else {
            C63308Osy.LJI().LIZIZ().LJIIJ(this.LJLJJL.LIZJ, 1);
            this.LJLJJL.LJIILJJIL(true, true);
            C63337OtR.LJII(this.LJLJJI, false).LIZ();
            long uptimeMillis4 = SystemClock.uptimeMillis();
            C63294Osk c63294Osk3 = this.LJLJJL;
            long j3 = uptimeMillis4 - c63294Osk3.LJIIIIZZ;
            int i8 = c63294Osk3.LJFF;
            int i9 = c63294Osk3.LJI;
            int i10 = c63294Osk3.LJII;
            C63623Oy3 LIZ7 = C63623Oy3.LIZ(this.LJLJJI);
            C63294Osk c63294Osk4 = this.LJLJJL;
            C63272OsO.LJII(false, j3, i8, i9, i10, LIZ7, c63294Osk4.LJIIJ, c63294Osk4.LJIIJJI, c63294Osk4.LJIIL, c63294Osk4.LJIILIIL, c63294Osk4.LJIILJJIL, c63294Osk4.LJIILL, c63294Osk4.LJIILLIIL);
        }
        C63337OtR.LJII(this.LJLJJI, true).LIZ();
    }

    public C63295Osl(C63294Osk c63294Osk, long j, boolean z, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, C63622Oy2 c63622Oy2) {
        this.LJLJJL = c63294Osk;
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = messagesPerUserInitV2ResponseBody;
        this.LJLJJI = c63622Oy2;
    }
}
