package X;

import Y.ACallableS38S1100000_11;
import Y.ACallableS60S0300000_11;
import Y.ARunnableS15S0400000_11;
import Y.ARunnableS22S0300000_11;
import android.content.Context;
import android.database.Cursor;
import com.bytedance.sync.v2.presistence.AppDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.QuQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68494QuQ implements InterfaceC67090QUs {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJI;
    public final C62822Ol8 LJLIL;
    public final C68498QuU LJLILLLLZI;
    public final Context LJLJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C68494QuQ.class), "mDbInst", "getMDbInst()Lcom/bytedance/sync/v2/presistence/AppDatabase;");
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    public final AppDatabase LIZLLL() {
        return (AppDatabase) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC67090QUs
    public final void LJJIJIIJIL() {
        C68501QuX c68501QuX = (C68501QuX) LIZLLL().LJIJJ();
        InterfaceC37591dj LIZ = c68501QuX.LIZLLL.LIZ();
        c68501QuX.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            c68501QuX.LIZ.LJIILLIIL();
        } finally {
            c68501QuX.LIZ.LJIIJJI();
            c68501QuX.LIZLLL.LIZJ(LIZ);
        }
    }

    public C68494QuQ(Context mContext) {
        o.LJIIJ(mContext, "mContext");
        this.LJLJI = mContext;
        this.LJLIL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 72));
        this.LJLILLLLZI = new C68498QuU();
    }

    @Override // X.InterfaceC67090QUs
    public final List<QV9> LJI(List<String> syncIds) {
        o.LJIIJ(syncIds, "syncIds");
        C68496QuS c68496QuS = (C68496QuS) LIZLLL().LJIJ();
        c68496QuS.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM t_sync_cursor WHERE sync_id IN (");
        int size = syncIds.size();
        C217818gj.LIZ(size, sb);
        sb.append(")");
        C1CD LIZJ = C1CD.LIZJ(size, sb.toString());
        int i = 1;
        for (String str : syncIds) {
            if (str == null) {
                LIZJ.LLLLLLJ(i);
            } else {
                LIZJ.LJJII(i, str);
            }
            i++;
        }
        Cursor LJIILIIL = c68496QuS.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("topic_type");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("recv_cursor");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("report_cursor");
            ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
            while (LJIILIIL.moveToNext()) {
                QV9 qv9 = new QV9();
                qv9.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                qv9.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv9.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                EnumC67115QVr fromValue = EnumC67115QVr.fromValue(LJIILIIL.getInt(columnIndexOrThrow4));
                if (fromValue == null) {
                    fromValue = EnumC67115QVr.SpecTopic;
                }
                qv9.LIZLLL = fromValue;
                qv9.LJ = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow5));
                qv9.LJFF = LJIILIIL.getLong(columnIndexOrThrow6);
                qv9.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                arrayList.add(qv9);
            }
            return arrayList;
        } finally {
            LJIILIIL.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final boolean LJJIFFI(List<? extends QV2> obj) {
        o.LJIIJ(obj, "obj");
        try {
            C68495QuR c68495QuR = (C68495QuR) LIZLLL().LJIJI();
            c68495QuR.LIZ.LIZJ();
            try {
                int LJFF = c68495QuR.LIZLLL.LJFF(obj);
                c68495QuR.LIZ.LJIILLIIL();
                if (LJFF <= 0) {
                    return false;
                }
                return true;
            } finally {
                c68495QuR.LIZ.LJIIJJI();
            }
        } catch (Exception e) {
            QUU.LIZJ().ensureNotReachHere(e, "execute sql failed when deleteSyncLog");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    @Override // X.InterfaceC67090QUs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.QV9> LJJII(X.QUJ r9) {
        /*
            r8 = this;
            com.bytedance.sync.v2.presistence.AppDatabase r0 = r8.LIZLLL()     // Catch: java.lang.Throwable -> L16
            X.Quf r2 = r0.LJIJ()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r9.LIZ     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "deviceInfo.did"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L16
            X.QuS r2 = (X.C68496QuS) r2     // Catch: java.lang.Throwable -> L16
            java.util.List r0 = r2.LIZ(r1)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r1 = move-exception
            java.lang.String r0 = "exception when queryLocalSyncCursorInfo"
            X.PV6.LIZJ(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L21:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r0.iterator()
        L2a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r5 = r7.next()
            r2 = r5
            X.QV9 r2 = (X.QV9) r2
            X.QW9 r1 = r2.LJ
            X.QW9 r0 = X.QW9.Device
            r4 = 1
            if (r1 == r0) goto L4b
            java.lang.String r3 = r2.LIZJ
            java.lang.String r2 = r9.LIZIZ
            boolean r0 = android.text.TextUtils.equals(r3, r2)
            if (r0 == 0) goto L53
        L48:
            r0 = 1
        L49:
            if (r0 == 0) goto L51
        L4b:
            if (r4 == 0) goto L2a
            r6.add(r5)
            goto L2a
        L51:
            r4 = 0
            goto L4b
        L53:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "0"
            if (r0 != 0) goto L61
            boolean r0 = android.text.TextUtils.equals(r3, r1)
            if (r0 == 0) goto L76
        L61:
            r0 = 1
        L62:
            if (r0 == 0) goto L78
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L70
            boolean r0 = android.text.TextUtils.equals(r2, r1)
            if (r0 == 0) goto L74
        L70:
            r0 = 1
        L71:
            if (r0 == 0) goto L78
            goto L48
        L74:
            r0 = 0
            goto L71
        L76:
            r0 = 0
            goto L62
        L78:
            r0 = 0
            goto L49
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68494QuQ.LJJII(X.QUJ):java.util.List");
    }

    @Override // X.InterfaceC67090QUs
    public final void LJJIIJZLJL(C67094QUw c67094QUw) {
        C68495QuR c68495QuR = (C68495QuR) LIZLLL().LJIJI();
        c68495QuR.LIZ.LIZJ();
        try {
            c68495QuR.LIZJ.LJFF(c67094QUw);
            c68495QuR.LIZ.LJIILLIIL();
        } finally {
            c68495QuR.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final boolean LJJIIZI(String str) {
        try {
            Object LJIILJJIL = LIZLLL().LJIILJJIL(new ACallableS38S1100000_11(this, str, 0));
            o.LJFF(LJIILJJIL, "mDbInst.runInTransaction…      true\n            })");
            return ((Boolean) LJIILJJIL).booleanValue();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            QUP LIZJ = QUU.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error when delete ");
            LIZ.append(str);
            LIZJ.ensureNotReachHere(e, X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // X.InterfaceC67090QUs
    public final QV9 LJJIJIL(long j) {
        QV9 qv9;
        C68496QuS c68496QuS = (C68496QuS) LIZLLL().LJIJ();
        c68496QuS.getClass();
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM t_sync_cursor WHERE sync_id = ?");
        LIZJ.LJIIIZ(1, j);
        Cursor LJIILIIL = c68496QuS.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("topic_type");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("recv_cursor");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("report_cursor");
            if (LJIILIIL.moveToFirst()) {
                qv9 = new QV9();
                qv9.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                qv9.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv9.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                EnumC67115QVr fromValue = EnumC67115QVr.fromValue(LJIILIIL.getInt(columnIndexOrThrow4));
                if (fromValue == null) {
                    fromValue = EnumC67115QVr.SpecTopic;
                }
                qv9.LIZLLL = fromValue;
                qv9.LJ = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow5));
                qv9.LJFF = LJIILIIL.getLong(columnIndexOrThrow6);
                qv9.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
            } else {
                qv9 = null;
            }
            return qv9;
        } finally {
            LJIILIIL.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final List LJJJJZ(String str) {
        C68501QuX c68501QuX = (C68501QuX) LIZLLL().LJIJJ();
        c68501QuX.getClass();
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM t_report_synclog WHERE cursor > 0 and sync_id=? ORDER BY cursor ASC LIMIT ?");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 100);
        Cursor LJIILIIL = c68501QuX.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("business");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("cursor");
            int columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("data");
            int columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("md5");
            ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
            while (LJIILIIL.moveToNext()) {
                QV5 qv5 = new QV5();
                qv5.LIZ = LJIILIIL.getLong(columnIndexOrThrow);
                qv5.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv5.LIZJ = LJIILIIL.getLong(columnIndexOrThrow3);
                qv5.LIZLLL = LJIILIIL.getString(columnIndexOrThrow4);
                qv5.LJ = LJIILIIL.getString(columnIndexOrThrow5);
                qv5.LJFF = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow6));
                qv5.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                qv5.LJII = LJIILIIL.getBlob(columnIndexOrThrow8);
                qv5.LJIIIIZZ = LJIILIIL.getString(columnIndexOrThrow9);
                arrayList.add(qv5);
            }
            return arrayList;
        } finally {
            LJIILIIL.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final List LJJJZ(int i) {
        C68495QuR c68495QuR = (C68495QuR) LIZLLL().LJIJI();
        c68495QuR.getClass();
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM t_snapshot WHERE notified < cursor ORDER BY sync_id,business LIMIT ? offset ?");
        LIZJ.LJIIIZ(1, 50);
        LIZJ.LJIIIZ(2, i);
        Cursor LJIILIIL = c68495QuR.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("business");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("cursor");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("data");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("notified");
            int columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("data_type");
            int columnIndexOrThrow10 = LJIILIIL.getColumnIndexOrThrow("publish_ts");
            int columnIndexOrThrow11 = LJIILIIL.getColumnIndexOrThrow("receive_ts");
            int columnIndexOrThrow12 = LJIILIIL.getColumnIndexOrThrow("consume_type");
            int columnIndexOrThrow13 = LJIILIIL.getColumnIndexOrThrow("patch_cnt");
            try {
                ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
                while (LJIILIIL.moveToNext()) {
                    C67094QUw c67094QUw = new C67094QUw();
                    c67094QUw.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                    c67094QUw.LIZIZ = LJIILIIL.getLong(columnIndexOrThrow2);
                    c67094QUw.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                    c67094QUw.LIZLLL = LJIILIIL.getString(columnIndexOrThrow4);
                    c67094QUw.LJ = LJIILIIL.getLong(columnIndexOrThrow5);
                    c67094QUw.LJFF = LJIILIIL.getBlob(columnIndexOrThrow6);
                    c67094QUw.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                    c67094QUw.LJII = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow8));
                    QV1 fromValue = QV1.fromValue(LJIILIIL.getInt(columnIndexOrThrow9));
                    if (fromValue == null) {
                        fromValue = QV1.ORIGIN;
                    }
                    c67094QUw.LJIIIIZZ = fromValue;
                    c67094QUw.LJIIIZ = LJIILIIL.getLong(columnIndexOrThrow10);
                    c67094QUw.LJIIJ = LJIILIIL.getLong(columnIndexOrThrow11);
                    EnumC68499QuV fromValue2 = EnumC68499QuV.fromValue(LJIILIIL.getInt(columnIndexOrThrow12));
                    if (fromValue2 == null) {
                        fromValue2 = EnumC68499QuV.Increment;
                    }
                    c67094QUw.LJIIJJI = fromValue2;
                    c67094QUw.LJIIL = LJIILIIL.getInt(columnIndexOrThrow13);
                    arrayList.add(c67094QUw);
                }
                LJIILIIL.close();
                LIZJ.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LJIILIIL.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.InterfaceC67090QUs
    public final long LJJLIIIJILLIZJL(QV5 qv5) {
        C68501QuX c68501QuX = (C68501QuX) LIZLLL().LJIJJ();
        c68501QuX.LIZ.LIZJ();
        try {
            long LJI = c68501QuX.LIZIZ.LJI(qv5);
            c68501QuX.LIZ.LJIILLIIL();
            return LJI;
        } finally {
            c68501QuX.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final boolean LJIIIZ(C67094QUw c67094QUw, List<? extends QV2> list) {
        Object LJIILJJIL = LIZLLL().LJIILJJIL(new ACallableS60S0300000_11(this, c67094QUw, list, 0));
        o.LJFF(LJIILJJIL, "mDbInst.runInTransaction…Log(syncLogs))\n        })");
        return ((Boolean) LJIILJJIL).booleanValue();
    }

    @Override // X.InterfaceC67090QUs
    public final void LJIILIIL(long j, long j2) {
        C68501QuX c68501QuX = (C68501QuX) LIZLLL().LJIJJ();
        InterfaceC37591dj LIZ = c68501QuX.LJ.LIZ();
        c68501QuX.LIZ.LIZJ();
        try {
            LIZ.LJIIIZ(1, j);
            LIZ.LJIIIZ(2, j2);
            LIZ.LJIJJLI();
            c68501QuX.LIZ.LJIILLIIL();
        } finally {
            c68501QuX.LIZ.LJIIJJI();
            c68501QuX.LJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC67090QUs
    public final boolean LJIJJLI(List<? extends QV5> undistributedUploads, QV9 syncCursor) {
        o.LJIIJ(undistributedUploads, "undistributedUploads");
        o.LJIIJ(syncCursor, "syncCursor");
        try {
            Object LJIILJJIL = LIZLLL().LJIILJJIL(new ACallableS60S0300000_11(this, undistributedUploads, syncCursor, 1));
            o.LJFF(LJIILJJIL, "mDbInst.runInTransaction…ursor) > 0\n            })");
            return ((Boolean) LJIILJJIL).booleanValue();
        } catch (Exception e) {
            QUU.LIZJ().ensureNotReachHere(e, "execute sql failed when updateUploadCursor");
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.InterfaceC67090QUs
    public final List LJJIJ(QW9 bucket, String str) {
        o.LJIIJ(bucket, "bucket");
        C68501QuX c68501QuX = (C68501QuX) LIZLLL().LJIJJ();
        c68501QuX.getClass();
        C1CD LIZJ = C1CD.LIZJ(3, "SELECT * FROM t_report_synclog WHERE cursor <= 0 and did = ? and business in (SELECT distinct id from t_business where bucket=?) ORDER BY id ASC LIMIT ?");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, UC0.LJIIIZ(bucket));
        LIZJ.LJIIIZ(3, 100);
        Cursor LJIILIIL = c68501QuX.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("business");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("cursor");
            int columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("data");
            int columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("md5");
            ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
            while (LJIILIIL.moveToNext()) {
                QV5 qv5 = new QV5();
                qv5.LIZ = LJIILIIL.getLong(columnIndexOrThrow);
                qv5.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv5.LIZJ = LJIILIIL.getLong(columnIndexOrThrow3);
                qv5.LIZLLL = LJIILIIL.getString(columnIndexOrThrow4);
                qv5.LJ = LJIILIIL.getString(columnIndexOrThrow5);
                qv5.LJFF = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow6));
                qv5.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                qv5.LJII = LJIILIIL.getBlob(columnIndexOrThrow8);
                qv5.LJIIIIZZ = LJIILIIL.getString(columnIndexOrThrow9);
                arrayList.add(qv5);
            }
            return arrayList;
        } finally {
            LJIILIIL.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final C67094QUw LJJIJL(long j, String str) {
        C67094QUw c67094QUw;
        C68495QuR c68495QuR = (C68495QuR) LIZLLL().LJIJI();
        c68495QuR.getClass();
        C1CD LIZJ = C1CD.LIZJ(2, "SELECT * FROM t_snapshot WHERE sync_id = ? AND business = ? ");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, j);
        Cursor LJIILIIL = c68495QuR.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("business");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("cursor");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("data");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("notified");
            int columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("data_type");
            int columnIndexOrThrow10 = LJIILIIL.getColumnIndexOrThrow("publish_ts");
            int columnIndexOrThrow11 = LJIILIIL.getColumnIndexOrThrow("receive_ts");
            int columnIndexOrThrow12 = LJIILIIL.getColumnIndexOrThrow("consume_type");
            int columnIndexOrThrow13 = LJIILIIL.getColumnIndexOrThrow("patch_cnt");
            if (LJIILIIL.moveToFirst()) {
                c67094QUw = new C67094QUw();
                c67094QUw.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                try {
                    c67094QUw.LIZIZ = LJIILIIL.getLong(columnIndexOrThrow2);
                    c67094QUw.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                    c67094QUw.LIZLLL = LJIILIIL.getString(columnIndexOrThrow4);
                    c67094QUw.LJ = LJIILIIL.getLong(columnIndexOrThrow5);
                    c67094QUw.LJFF = LJIILIIL.getBlob(columnIndexOrThrow6);
                    c67094QUw.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                    c67094QUw.LJII = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow8));
                    QV1 fromValue = QV1.fromValue(LJIILIIL.getInt(columnIndexOrThrow9));
                    if (fromValue == null) {
                        fromValue = QV1.ORIGIN;
                    }
                    c67094QUw.LJIIIIZZ = fromValue;
                    c67094QUw.LJIIIZ = LJIILIIL.getLong(columnIndexOrThrow10);
                    c67094QUw.LJIIJ = LJIILIIL.getLong(columnIndexOrThrow11);
                    EnumC68499QuV fromValue2 = EnumC68499QuV.fromValue(LJIILIIL.getInt(columnIndexOrThrow12));
                    if (fromValue2 == null) {
                        fromValue2 = EnumC68499QuV.Increment;
                    }
                    c67094QUw.LJIIJJI = fromValue2;
                    c67094QUw.LJIIL = LJIILIIL.getInt(columnIndexOrThrow13);
                } catch (Throwable th) {
                    th = th;
                    LJIILIIL.close();
                    LIZJ.LIZLLL();
                    throw th;
                }
            } else {
                c67094QUw = null;
            }
            LJIILIIL.close();
            LIZJ.LIZLLL();
            return c67094QUw;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.InterfaceC67090QUs
    public final List LJJIZ(int i, java.util.Set syncIds) {
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        o.LJIIJ(syncIds, "syncIds");
        C68495QuR c68495QuR = (C68495QuR) LIZLLL().LJIJI();
        c68495QuR.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM t_synclog WHERE sync_id in (");
        int size = syncIds.size();
        C217818gj.LIZ(size, sb);
        sb.append(") ORDER BY sync_id, business, sync_cursor ASC LIMIT ? offset ?");
        int i2 = size + 2;
        C1CD LIZJ = C1CD.LIZJ(i2, sb.toString());
        Iterator it = syncIds.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                LIZJ.LLLLLLJ(i3);
            } else {
                LIZJ.LJIIIZ(i3, l.longValue());
            }
            i3++;
        }
        LIZJ.LJIIIZ(size + 1, 100);
        LIZJ.LJIIIZ(i2, i);
        Cursor LJIILIIL = c68495QuR.LIZ.LJIILIIL(LIZJ);
        try {
            columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("did");
            columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("sync_cursor");
            columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("data");
            columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("md5");
            columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("business");
            columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("consume_type");
            columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("data_type");
            columnIndexOrThrow10 = LJIILIIL.getColumnIndexOrThrow("publish_ts");
            columnIndexOrThrow11 = LJIILIIL.getColumnIndexOrThrow("receive_ts");
            columnIndexOrThrow12 = LJIILIIL.getColumnIndexOrThrow("bucket");
            columnIndexOrThrow13 = LJIILIIL.getColumnIndexOrThrow("req_id");
        } catch (Throwable th) {
            th = th;
        }
        try {
            ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
            while (LJIILIIL.moveToNext()) {
                QV2 qv2 = new QV2();
                qv2.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                qv2.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv2.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                qv2.LIZLLL = LJIILIIL.getLong(columnIndexOrThrow4);
                qv2.LJ = LJIILIIL.getBlob(columnIndexOrThrow5);
                qv2.LJFF = LJIILIIL.getString(columnIndexOrThrow6);
                qv2.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                EnumC68499QuV fromValue = EnumC68499QuV.fromValue(LJIILIIL.getInt(columnIndexOrThrow8));
                if (fromValue == null) {
                    fromValue = EnumC68499QuV.Increment;
                }
                qv2.LJII = fromValue;
                QV1 fromValue2 = QV1.fromValue(LJIILIIL.getInt(columnIndexOrThrow9));
                if (fromValue2 == null) {
                    fromValue2 = QV1.ORIGIN;
                }
                qv2.LJIIIIZZ = fromValue2;
                qv2.LJIIIZ = LJIILIIL.getLong(columnIndexOrThrow10);
                qv2.LJIIJ = LJIILIIL.getLong(columnIndexOrThrow11);
                qv2.LJIIJJI = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow12));
                qv2.LJIIL = LJIILIIL.getString(columnIndexOrThrow13);
                arrayList.add(qv2);
            }
            LJIILIIL.close();
            LIZJ.LIZLLL();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            LJIILIIL.close();
            LIZJ.LIZLLL();
            throw th;
        }
    }

    @Override // X.InterfaceC67090QUs
    public final List LJJJJL(int i, long j) {
        try {
            return ((C68495QuR) LIZLLL().LJIJI()).LIZ(j, EnumC68499QuV.OneByOne, i);
        } catch (Throwable th) {
            QUU.LIZJ().ensureNotReachHere(th, th.getMessage());
            List emptyList = Collections.emptyList();
            o.LJFF(emptyList, "Collections.emptyList()");
            return emptyList;
        }
    }

    @Override // X.InterfaceC67090QUs
    public final void LJJJJLL(ArrayList<QV2> arrayList, QV9 qv9) {
        LIZLLL().LJIILL(new ARunnableS22S0300000_11(qv9, this, arrayList, 6));
    }

    @Override // X.InterfaceC67090QUs
    public final List LJIIJJI(QW9 bucket, String str, String str2) {
        o.LJIIJ(bucket, "bucket");
        C68501QuX c68501QuX = (C68501QuX) LIZLLL().LJIJJ();
        c68501QuX.getClass();
        C1CD LIZJ = C1CD.LIZJ(4, "SELECT * FROM t_report_synclog WHERE cursor <= 0 and did = ? and uid = ? and business in (SELECT distinct id from t_business where bucket=?) ORDER BY id ASC LIMIT ?");
        LIZJ.LJJII(1, str);
        LIZJ.LJJII(2, str2);
        LIZJ.LJIIIZ(3, UC0.LJIIIZ(bucket));
        LIZJ.LJIIIZ(4, 100);
        Cursor LJIILIIL = c68501QuX.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("business");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("cursor");
            int columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("data");
            int columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("md5");
            ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
            while (LJIILIIL.moveToNext()) {
                QV5 qv5 = new QV5();
                qv5.LIZ = LJIILIIL.getLong(columnIndexOrThrow);
                qv5.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv5.LIZJ = LJIILIIL.getLong(columnIndexOrThrow3);
                qv5.LIZLLL = LJIILIIL.getString(columnIndexOrThrow4);
                qv5.LJ = LJIILIIL.getString(columnIndexOrThrow5);
                qv5.LJFF = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow6));
                qv5.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                qv5.LJII = LJIILIIL.getBlob(columnIndexOrThrow8);
                qv5.LJIIIIZZ = LJIILIIL.getString(columnIndexOrThrow9);
                arrayList.add(qv5);
            }
            return arrayList;
        } finally {
            LJIILIIL.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC67090QUs
    public final void LJJLIIIIJ(List<QV9> syncCursors, List<String> pendingDelete, List<? extends QVB> businesses) {
        o.LJIIJ(syncCursors, "syncCursors");
        o.LJIIJ(pendingDelete, "pendingDelete");
        o.LJIIJ(businesses, "businesses");
        LIZLLL().LJIILL(new ARunnableS15S0400000_11(pendingDelete, this, businesses, syncCursors, 4));
    }
}
