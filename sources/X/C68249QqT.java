package X;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QqT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68249QqT implements InterfaceC51050K1u {
    public Object LIZ;
    public Object LIZIZ;

    public /* synthetic */ C68249QqT(C68241QqL c68241QqL, String str) {
        this.LIZIZ = c68241QqL;
        this.LIZ = str;
    }

    public /* synthetic */ C68249QqT() {
    }

    public /* synthetic */ C68249QqT(C71740SDo state, List list) {
        o.LJIIIZ(state, "state");
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.addAll(list);
        ((List) this.LIZ).add(new C71725SCz());
        this.LIZIZ = new SDF((List) this.LIZ, state, 0);
    }

    @Override // X.InterfaceC51050K1u
    public final void LIZ(String str, int i, Throwable th, byte[] bArr, java.util.Map map) {
        C68242QqM c68242QqM;
        long longValue;
        byte[] bArr2 = bArr;
        int i2 = i;
        C68241QqL c68241QqL = (C68241QqL) this.LIZIZ;
        c68241QqL.LIZIZ().LJFF();
        c68241QqL.LJI();
        if (bArr2 == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                c68241QqL.LJIJI = false;
                c68241QqL.LJJII();
            }
        }
        List list = c68241QqL.LJJ;
        QH7.LJIIIIZZ(list);
        c68241QqL.LJJ = null;
        if (i2 != 200) {
            if (i2 == 204) {
                i2 = 204;
            }
            c68241QqL.LIZJ().LJIILIIL.LIZJ(Integer.valueOf(i2), th, "Network upload failed. Will retry later. code, error");
            C67194QYs c67194QYs = c68241QqL.LJIIIIZZ.LJIIJ;
            ((C67688QhQ) c68241QqL.LIZLLL()).getClass();
            c67194QYs.LIZIZ(System.currentTimeMillis());
            if (i2 != 503 || i2 == 429) {
                C67194QYs c67194QYs2 = c68241QqL.LJIIIIZZ.LJIIIIZZ;
                ((C67688QhQ) c68241QqL.LIZLLL()).getClass();
                c67194QYs2.LIZIZ(System.currentTimeMillis());
            }
            C68242QqM c68242QqM2 = c68241QqL.LIZJ;
            C68241QqL.LJJIJIIJI(c68242QqM2);
            c68242QqM2.LJJJ(list);
            c68241QqL.LJJIIJ();
        }
        if (th == null) {
            try {
                C67194QYs c67194QYs3 = c68241QqL.LJIIIIZZ.LJIIIZ;
                ((C67688QhQ) c68241QqL.LIZLLL()).getClass();
                c67194QYs3.LIZIZ(System.currentTimeMillis());
                c68241QqL.LJIIIIZZ.LJIIJ.LIZIZ(0L);
                c68241QqL.LJJIIJ();
                c68241QqL.LIZJ().LJIILIIL.LIZJ(Integer.valueOf(i2), Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
                C68242QqM c68242QqM3 = c68241QqL.LIZJ;
                C68241QqL.LJJIJIIJI(c68242QqM3);
                c68242QqM3.LJJIL();
            } catch (SQLiteException e) {
                c68241QqL.LIZJ().LJFF.LIZIZ(e, "Database error while trying to delete uploaded bundles");
                ((C67688QhQ) c68241QqL.LIZLLL()).getClass();
                c68241QqL.LJIILJJIL = SystemClock.elapsedRealtime();
                c68241QqL.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(c68241QqL.LJIILJJIL), "Disable upload, time");
            }
            try {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    try {
                        c68242QqM = c68241QqL.LIZJ;
                        C68241QqL.LJJIJIIJI(c68242QqM);
                        longValue = l.longValue();
                        c68242QqM.LJFF();
                        c68242QqM.LJI();
                        try {
                        } catch (SQLiteException e2) {
                            c68242QqM.LIZ.LIZJ().LJFF.LIZIZ(e2, "Failed to delete a bundle in a queue table");
                            throw e2;
                            break;
                        }
                    } catch (SQLiteException e3) {
                        List list2 = c68241QqL.LJJI;
                        if (list2 == null || !((ArrayList) list2).contains(l)) {
                            throw e3;
                        }
                    }
                    if (c68242QqM.LJJI().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                        break;
                    }
                }
                C68242QqM c68242QqM4 = c68241QqL.LIZJ;
                C68241QqL.LJJIJIIJI(c68242QqM4);
                c68242QqM4.LJIIJ();
                C68242QqM c68242QqM5 = c68241QqL.LIZJ;
                C68241QqL.LJJIJIIJI(c68242QqM5);
                c68242QqM5.LJJIZ();
                c68241QqL.LJJI = null;
                C68186QpS c68186QpS = c68241QqL.LIZIZ;
                C68241QqL.LJJIJIIJI(c68186QpS);
                if (c68186QpS.LJIIIZ() && c68241QqL.LJJIIZ()) {
                    c68241QqL.LJIJI();
                } else {
                    c68241QqL.LJJIFFI = -1L;
                    c68241QqL.LJJIIJ();
                }
                c68241QqL.LJIILJJIL = 0L;
            } catch (Throwable th2) {
                C68242QqM c68242QqM6 = c68241QqL.LIZJ;
                C68241QqL.LJJIJIIJI(c68242QqM6);
                c68242QqM6.LJJIZ();
                throw th2;
            }
        }
        c68241QqL.LIZJ().LJIILIIL.LIZJ(Integer.valueOf(i2), th, "Network upload failed. Will retry later. code, error");
        C67194QYs c67194QYs4 = c68241QqL.LJIIIIZZ.LJIIJ;
        ((C67688QhQ) c68241QqL.LIZLLL()).getClass();
        c67194QYs4.LIZIZ(System.currentTimeMillis());
        if (i2 != 503) {
        }
        C67194QYs c67194QYs22 = c68241QqL.LJIIIIZZ.LJIIIIZZ;
        ((C67688QhQ) c68241QqL.LIZLLL()).getClass();
        c67194QYs22.LIZIZ(System.currentTimeMillis());
        C68242QqM c68242QqM22 = c68241QqL.LIZJ;
        C68241QqL.LJJIJIIJI(c68242QqM22);
        c68242QqM22.LJJJ(list);
        c68241QqL.LJJIIJ();
    }
}
