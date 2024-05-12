package X;

import Y.ARunnableS29S0200000_10;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OsX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63281OsX extends AbstractC63515OwJ {
    public final int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final java.util.Map<String, Object> LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public C63622Oy2 LJIJJLI;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public final void LJIIZILJ() {
        if (this.LJI) {
            return;
        }
        C63322OtC.LJFF("GetMsgByUserHandler recordExceptionWhileSaveMsg");
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LIZJ;
        LIZ.getClass();
        long LIZLLL = C63291Osh.LIZLLL(i);
        C63291Osh LIZ2 = C63291Osh.LIZ();
        int i2 = this.LIZJ;
        LIZ2.getClass();
        Pair LJ = C63291Osh.LJ(i2);
        if (LJ == null) {
            C63291Osh LIZ3 = C63291Osh.LIZ();
            int i3 = this.LIZJ;
            LIZ3.getClass();
            C63291Osh.LJIIL(i3, 1, LIZLLL);
        } else {
            long longValue = ((Long) LJ.first).longValue();
            int intValue = ((Integer) LJ.second).intValue();
            if (longValue != LIZLLL) {
                C63291Osh LIZ4 = C63291Osh.LIZ();
                int i4 = this.LIZJ;
                LIZ4.getClass();
                C63291Osh.LJIIL(i4, 1, LIZLLL);
            } else {
                if (intValue == 2) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("GetMsgByUserHandler cursor always fail, skip: ");
                    LIZ5.append(LIZLLL);
                    C63322OtC.LIZLLL(X1D.LIZIZ(LIZ5));
                    return;
                }
                C63291Osh.LIZ().getClass();
                C63291Osh.LJIIL(this.LIZJ, intValue + 1, LIZLLL);
            }
        }
        this.LJI = true;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.messages_per_user_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILL(C63622Oy2 c63622Oy2) {
        boolean z;
        Long l;
        Response response;
        this.LJIILJJIL = (SystemClock.uptimeMillis() - this.LJIIL) + this.LJIILJJIL;
        this.LJIJJLI = c63622Oy2;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetMsgByUserHandler handleResponse, seqId:");
        V1I.LIZJ(LIZ, c63622Oy2.LJLIL, ", success:", z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C63269OsL.LJIIJ(this.LIZJ);
        if (!z) {
            C63269OsL.LJIIL(this.LIZJ, 2);
            C63337OtR.LJII(c63622Oy2, false).LIZ();
            LJIILIIL(false, C63623Oy3.LIZ(c63622Oy2));
            if (this.LIZJ == 3 && (response = c63622Oy2.LJLJL) != null && response.status_code.intValue() == AbstractC63551Owt.LJI) {
                C63308Osy.LJI().LIZLLL().LJLJJL = false;
                C115394fv.LJII().LJ();
                return;
            }
            return;
        }
        C63308Osy.LJI().getClass();
        this.LJIJJ = C63308Osy.LJ();
        MessagesPerUserResponseBody messagesPerUserResponseBody = c63622Oy2.LJLJL.body.messages_per_user_body;
        this.LJIJI = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIJI;
        long j = c63622Oy2.LJLIL;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        Boolean bool = messagesPerUserResponseBody.has_more;
        RunnableC63345OtZ.LIZLLL(new C63211OrP(this, messagesPerUserResponseBody, c63622Oy2, bool, j), new C63212OrQ(this, uptimeMillis2, j, bool), C63346Ota.LIZJ());
        long uptimeMillis3 = SystemClock.uptimeMillis();
        if (this.LIZLLL == 8 && (l = messagesPerUserResponseBody.next_interval) != null) {
            if (l.longValue() > 0) {
                C63319Ot9.LIZIZ().LJFF(messagesPerUserResponseBody.next_interval.longValue());
            } else {
                C63319Ot9.LIZIZ().LJ();
            }
        }
        this.LJIJI = (SystemClock.uptimeMillis() - uptimeMillis3) + this.LJIJI;
        if (messagesPerUserResponseBody.has_more.booleanValue()) {
            LJIILJJIL(1, messagesPerUserResponseBody.next_cursor.longValue());
            return;
        }
        long uptimeMillis4 = SystemClock.uptimeMillis();
        C63337OtR.LJII(c63622Oy2, true).LIZ();
        this.LJIJI = (SystemClock.uptimeMillis() - uptimeMillis4) + this.LJIJI;
        LJIILIIL(true, null);
    }

    public C63281OsX(int i, java.util.Map<String, Object> map) {
        super(EnumC63625Oy5.GET_MESSAGES_BY_USER.getValue());
        this.LJFF = null;
        this.LJI = false;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = 0;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0L;
        this.LJIJJ = 0L;
        this.LJIJJLI = null;
        this.LIZJ = i;
        this.LJFF = map;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (C63308Osy.LJI().LIZLLL().LJJLI) {
            RunnableC63345OtZ.LJ(new C63282OsY(this, c63622Oy2, aRunnableS29S0200000_10), null, false);
        } else {
            LJIILL(c63622Oy2);
        }
    }

    public final void LJIILIIL(boolean z, C63623Oy3 c63623Oy3) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.LIZLLL == 0) {
            C63309Osz.LIZLLL().LIZIZ(this.LIZJ);
        }
        C63309Osz.LIZLLL().getClass();
        C63309Osz.LJI(z);
        this.LJIJI = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIJI;
        long uptimeMillis2 = SystemClock.uptimeMillis() - this.LJIIJJI;
        C63308Osy.LJI().LIZIZ().LJIIJJI(this.LIZJ, this.LIZLLL, uptimeMillis2, this.LJFF, z);
        C63272OsO.LIZLLL(false, z, uptimeMillis2, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, c63623Oy3, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LIZLLL, false);
    }

    public final void LJIILJJIL(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.LIZJ;
        java.util.Set<Integer> set = C63269OsL.LIZJ;
        if (((CopyOnWriteArraySet) set).contains(Integer.valueOf(i2)) || C63269OsL.LJFF(this.LIZJ)) {
            StringBuilder LJ = C7MY.LJ("GetMsgByUserHandler pull, reason:", i, ", inbox:");
            LJ.append(this.LIZJ);
            LJ.append(", already doing, return");
            C63322OtC.LJFF(X1D.LIZIZ(LJ));
            return;
        }
        StringBuilder LJ2 = C7MY.LJ("GetMsgByUserHandler pull, reason:", i, ", inbox:");
        V10.LJFF(LJ2, this.LIZJ, ", cursor:", j);
        C63322OtC.LJFF(X1D.LIZIZ(LJ2));
        if (i != 1) {
            this.LJ = i;
        }
        this.LIZLLL = i;
        if (i != 1 && i != 8) {
            C63308Osy.LJI().LIZIZ().LIZIZ(this.LIZJ, this.LIZLLL);
        }
        ((CopyOnWriteArraySet) set).add(Integer.valueOf(this.LIZJ));
        C63488Ovs c63488Ovs = new C63488Ovs();
        c63488Ovs.LIZLLL = Long.valueOf(j);
        if (this.LIZLLL == 8) {
            c63488Ovs.LJFF = Long.valueOf(C63319Ot9.LIZIZ().LIZJ());
        }
        if (this.LIZLLL == 0) {
            C63308Osy.LJI().LIZIZ().isNewUser();
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJ = c63488Ovs.build();
        LJIIJJI(this.LIZJ, c89453Z8v.build(), null, new Object[0]);
        this.LJIILIIL = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJIILIIL;
        this.LJIIL = SystemClock.uptimeMillis();
    }

    public final void LJIILLIIL(MessagesPerUserResponseBody messagesPerUserResponseBody, boolean z, String str, String str2) {
        if (!C63308Osy.LJI().LIZLLL().LJLLL) {
            return;
        }
        RunnableC63345OtZ.LJ(new C63214OrS(this, messagesPerUserResponseBody, z, str, str2), new C63283OsZ(), false);
    }
}
