package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.QcR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67379QcR implements InterfaceC67397Qcj, PSE, InterfaceC66854QLq {
    public static final C67365QcD LJLJJLL = new C67365QcD("proto");
    public final C79383VDn LJLIL;
    public final InterfaceC67370QcI LJLILLLLZI;
    public final InterfaceC67370QcI LJLJI;
    public final AbstractC67423Qd9 LJLJJI;
    public final InterfaceC67469Qdt<String> LJLJJL;

    @Override // X.InterfaceC66854QLq
    public final void LIZ() {
        LJIIJJI(new InterfaceC67373QcL() { // from class: X.Qca
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                C67379QcR c67379QcR = C67379QcR.this;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c67379QcR.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("UPDATE global_log_event_state SET last_metrics_upload_ms=");
                LIZ.append(c67379QcR.LJLILLLLZI.getTime());
                sQLiteDatabase.compileStatement(X1D.LIZIZ(LIZ)).execute();
                return null;
            }
        });
    }

    @Override // X.InterfaceC66854QLq
    public final C67430QdG LIZJ() {
        final C67429QdF c67429QdF = new C67429QdF();
        final HashMap hashMap = new HashMap();
        SQLiteDatabase LJFF = LJFF();
        LJFF.beginTransaction();
        try {
            C67430QdG c67430QdG = (C67430QdG) LJIILIIL(LJFF.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new InterfaceC67373QcL() { // from class: X.Qd5
                @Override // X.InterfaceC67373QcL
                public final Object apply(Object obj) {
                    C67379QcR c67379QcR = C67379QcR.this;
                    java.util.Map map = hashMap;
                    C67429QdF c67429QdF2 = c67429QdF;
                    Cursor cursor = (Cursor) obj;
                    c67379QcR.getClass();
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        int i = cursor.getInt(1);
                        EnumC67390Qcc enumC67390Qcc = EnumC67390Qcc.REASON_UNKNOWN;
                        if (i != enumC67390Qcc.getNumber()) {
                            EnumC67390Qcc enumC67390Qcc2 = EnumC67390Qcc.MESSAGE_TOO_OLD;
                            if (i != enumC67390Qcc2.getNumber()) {
                                enumC67390Qcc2 = EnumC67390Qcc.CACHE_FULL;
                                if (i != enumC67390Qcc2.getNumber()) {
                                    enumC67390Qcc2 = EnumC67390Qcc.PAYLOAD_TOO_BIG;
                                    if (i != enumC67390Qcc2.getNumber()) {
                                        enumC67390Qcc2 = EnumC67390Qcc.MAX_RETRIES_REACHED;
                                        if (i != enumC67390Qcc2.getNumber()) {
                                            enumC67390Qcc2 = EnumC67390Qcc.INVALID_PAYLOD;
                                            if (i != enumC67390Qcc2.getNumber()) {
                                                enumC67390Qcc2 = EnumC67390Qcc.SERVER_ERROR;
                                                if (i != enumC67390Qcc2.getNumber()) {
                                                    C46617IRh.LIZ("SQLiteEventStore");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            enumC67390Qcc = enumC67390Qcc2;
                        }
                        long j = cursor.getLong(2);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        List list = (List) map.get(string);
                        C67452Qdc c67452Qdc = new C67452Qdc();
                        c67452Qdc.LIZIZ = enumC67390Qcc;
                        c67452Qdc.LIZ = j;
                        list.add(new C67453Qdd(c67452Qdc.LIZ, c67452Qdc.LIZIZ));
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        C67435QdL c67435QdL = new C67435QdL();
                        c67435QdL.LIZ = (String) entry.getKey();
                        c67435QdL.LIZIZ = (List) entry.getValue();
                        ((ArrayList) c67429QdF2.LIZIZ).add(new C67433QdJ(c67435QdL.LIZ, Collections.unmodifiableList(c67435QdL.LIZIZ)));
                    }
                    final long time = c67379QcR.LJLILLLLZI.getTime();
                    c67429QdF2.LIZ = (C67489QeD) c67379QcR.LJIIJJI(new InterfaceC67373QcL() { // from class: X.QeB
                        @Override // X.InterfaceC67373QcL
                        public final Object apply(Object obj2) {
                            long j2 = time;
                            Cursor rawQuery = ((SQLiteDatabase) obj2).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                            try {
                                rawQuery.moveToNext();
                                long j3 = rawQuery.getLong(0);
                                C67488QeC c67488QeC = new C67488QeC();
                                c67488QeC.LIZ = j3;
                                c67488QeC.LIZIZ = j2;
                                return c67488QeC.LIZ();
                            } finally {
                                rawQuery.close();
                            }
                        }
                    });
                    C67454Qde c67454Qde = new C67454Qde();
                    C67458Qdi c67458Qdi = new C67458Qdi();
                    c67458Qdi.LIZ = c67379QcR.LJFF().compileStatement("PRAGMA page_size").simpleQueryForLong() * c67379QcR.LJI();
                    c67458Qdi.LIZIZ = AbstractC67423Qd9.LIZ.LIZIZ;
                    c67454Qde.LIZ = new C67475Qdz(c67458Qdi.LIZ, c67458Qdi.LIZIZ);
                    c67429QdF2.LIZJ = new C67460Qdk(c67454Qde.LIZ);
                    c67429QdF2.LIZLLL = c67379QcR.LJLJJL.get();
                    return new C67430QdG(c67429QdF2.LIZ, Collections.unmodifiableList(c67429QdF2.LIZIZ), c67429QdF2.LIZJ, c67429QdF2.LIZLLL);
                }
            });
            LJFF.setTransactionSuccessful();
            return c67430QdG;
        } finally {
            LJFF.endTransaction();
        }
    }

    public final SQLiteDatabase LJFF() {
        C79383VDn c79383VDn = this.LJLIL;
        Objects.requireNonNull(c79383VDn);
        C65769PrZ c65769PrZ = new C65769PrZ(c79383VDn);
        long time = this.LJLJI.getTime();
        while (true) {
            try {
                return (SQLiteDatabase) c65769PrZ.LIZ();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.LJLJI.getTime() < this.LJLJJI.LIZ() + time) {
                    SystemClock.sleep(50L);
                } else {
                    throw new FT7("Timed out while trying to open db.", e);
                }
            }
        }
    }

    @Override // X.InterfaceC67397Qcj
    public final int LLJLIL() {
        final long time = this.LJLILLLLZI.getTime() - this.LJLJJI.LIZIZ();
        return ((Integer) LJIIJJI(new InterfaceC67373QcL() { // from class: X.QcX
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                C67379QcR c67379QcR = C67379QcR.this;
                long j = time;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c67379QcR.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (rawQuery.moveToNext()) {
                    try {
                        c67379QcR.LIZIZ(rawQuery.getInt(0), EnumC67390Qcc.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // X.InterfaceC67397Qcj
    public final Iterable<AbstractC67354Qc2> LLZ() {
        return (Iterable) LJIIJJI(new C67399Qcl());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public final long LJI() {
        return LJFF().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static String LJIIL(Iterable<AbstractC67413Qcz> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC67413Qcz> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().LIZIZ());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // X.PSE
    public final Object LIZLLL(InterfaceC54346LUo interfaceC54346LUo) {
        try {
            return LJ(interfaceC54346LUo);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final <T> T LJ(InterfaceC54346LUo<T> interfaceC54346LUo) {
        SQLiteDatabase LJFF = LJFF();
        long time = this.LJLJI.getTime();
        while (true) {
            try {
                LJFF.beginTransaction();
                try {
                    T execute = interfaceC54346LUo.execute();
                    LJFF.setTransactionSuccessful();
                    return execute;
                } finally {
                    LJFF.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (this.LJLJI.getTime() < this.LJLJJI.LIZ() + time) {
                    SystemClock.sleep(50L);
                } else {
                    throw new FT7("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    public final <T> T LJIIJJI(InterfaceC67373QcL<SQLiteDatabase, T> interfaceC67373QcL) {
        SQLiteDatabase LJFF = LJFF();
        LJFF.beginTransaction();
        try {
            T apply = interfaceC67373QcL.apply(LJFF);
            LJFF.setTransactionSuccessful();
            return apply;
        } finally {
            LJFF.endTransaction();
        }
    }

    @Override // X.InterfaceC67397Qcj
    public final void LJZL(Iterable<AbstractC67413Qcz> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DELETE FROM events WHERE _id in ");
        LIZ.append(LJIIL(iterable));
        LJFF().compileStatement(X1D.LIZIZ(LIZ)).execute();
    }

    @Override // X.InterfaceC67397Qcj
    public final boolean LLJJIJIIJIL(final AbstractC67354Qc2 abstractC67354Qc2) {
        return ((Boolean) LJIIJJI(new InterfaceC67373QcL() { // from class: X.QcZ
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                C67379QcR c67379QcR = C67379QcR.this;
                AbstractC67354Qc2 abstractC67354Qc22 = abstractC67354Qc2;
                c67379QcR.getClass();
                Long LJIIJ = C67379QcR.LJIIJ((SQLiteDatabase) obj, abstractC67354Qc22);
                if (LJIIJ == null) {
                    return Boolean.FALSE;
                }
                Cursor rawQuery = c67379QcR.LJFF().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{LJIIJ.toString()});
                try {
                    return Boolean.valueOf(rawQuery.moveToNext());
                } finally {
                    rawQuery.close();
                }
            }
        })).booleanValue();
    }

    @Override // X.InterfaceC67397Qcj
    public final long LLLLJ(AbstractC67354Qc2 abstractC67354Qc2) {
        Long l;
        Cursor rawQuery = LJFF().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC67354Qc2.LIZIZ(), String.valueOf(C67356Qc4.LIZ(abstractC67354Qc2.LIZLLL()))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            return l.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // X.InterfaceC67397Qcj
    public final Iterable<AbstractC67413Qcz> LLZLI(final AbstractC67354Qc2 abstractC67354Qc2) {
        return (Iterable) LJIIJJI(new InterfaceC67373QcL() { // from class: X.QcQ
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                final C67379QcR c67379QcR = C67379QcR.this;
                final AbstractC67354Qc2 abstractC67354Qc22 = abstractC67354Qc2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c67379QcR.getClass();
                final ArrayList arrayList = new ArrayList();
                Long LJIIJ = C67379QcR.LJIIJ(sQLiteDatabase, abstractC67354Qc22);
                if (LJIIJ != null) {
                    C67379QcR.LJIILIIL(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{LJIIJ.toString()}, null, null, null, String.valueOf(c67379QcR.LJLJJI.LIZJ())), new InterfaceC67373QcL() { // from class: X.QcJ
                        @Override // X.InterfaceC67373QcL
                        public final Object apply(Object obj2) {
                            boolean z;
                            C67365QcD c67365QcD;
                            C67365QcD c67365QcD2;
                            C67379QcR c67379QcR2 = C67379QcR.this;
                            List list = arrayList;
                            AbstractC67354Qc2 abstractC67354Qc23 = abstractC67354Qc22;
                            Cursor cursor = (Cursor) obj2;
                            c67379QcR2.getClass();
                            while (cursor.moveToNext()) {
                                long j = cursor.getLong(0);
                                if (cursor.getInt(7) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C67362QcA c67362QcA = new C67362QcA();
                                c67362QcA.LJFF = new HashMap();
                                c67362QcA.LIZLLL(cursor.getString(1));
                                c67362QcA.LIZLLL = Long.valueOf(cursor.getLong(2));
                                c67362QcA.LJ = Long.valueOf(cursor.getLong(3));
                                if (z) {
                                    String string = cursor.getString(4);
                                    if (string == null) {
                                        c67365QcD2 = C67379QcR.LJLJJLL;
                                    } else {
                                        c67365QcD2 = new C67365QcD(string);
                                    }
                                    c67362QcA.LIZJ(new C67366QcE(c67365QcD2, cursor.getBlob(5)));
                                } else {
                                    String string2 = cursor.getString(4);
                                    if (string2 == null) {
                                        c67365QcD = C67379QcR.LJLJJLL;
                                    } else {
                                        c67365QcD = new C67365QcD(string2);
                                    }
                                    Cursor query = c67379QcR2.LJFF().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                                    try {
                                        ArrayList arrayList2 = new ArrayList();
                                        int i = 0;
                                        while (query.moveToNext()) {
                                            byte[] blob = query.getBlob(0);
                                            arrayList2.add(blob);
                                            i += blob.length;
                                        }
                                        byte[] bArr = new byte[i];
                                        int i2 = 0;
                                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                            byte[] bArr2 = (byte[]) ListProtector.get(arrayList2, i3);
                                            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                                            i2 += bArr2.length;
                                        }
                                        query.close();
                                        c67362QcA.LIZJ(new C67366QcE(c67365QcD, bArr));
                                    } catch (Throwable th) {
                                        query.close();
                                        throw th;
                                    }
                                }
                                if (!cursor.isNull(6)) {
                                    c67362QcA.LIZIZ = Integer.valueOf(cursor.getInt(6));
                                }
                                list.add(new C67383QcV(j, abstractC67354Qc23, c67362QcA.LIZIZ()));
                            }
                            return null;
                        }
                    });
                }
                final HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append(((AbstractC67413Qcz) ListProtector.get(arrayList, i)).LIZIZ());
                    if (i < arrayList.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                C67379QcR.LJIILIIL(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC67373QcL() { // from class: X.IsR
                    @Override // X.InterfaceC67373QcL
                    public final Object apply(Object obj2) {
                        java.util.Map map = hashMap;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            long j = cursor.getLong(0);
                            java.util.Set set = (java.util.Set) map.get(Long.valueOf(j));
                            if (set == null) {
                                set = new HashSet();
                                map.put(Long.valueOf(j), set);
                            }
                            set.add(new J23(cursor.getString(1), cursor.getString(2)));
                        }
                        return null;
                    }
                });
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC67413Qcz abstractC67413Qcz = (AbstractC67413Qcz) listIterator.next();
                    if (hashMap.containsKey(Long.valueOf(abstractC67413Qcz.LIZIZ()))) {
                        C67362QcA LJIIIIZZ = abstractC67413Qcz.LIZ().LJIIIIZZ();
                        for (J23 j23 : (java.util.Set) hashMap.get(Long.valueOf(abstractC67413Qcz.LIZIZ()))) {
                            LJIIIIZZ.LIZ(j23.LIZ, j23.LIZIZ);
                        }
                        listIterator.set(new C67383QcV(abstractC67413Qcz.LIZIZ(), abstractC67413Qcz.LIZJ(), LJIIIIZZ.LIZIZ()));
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // X.InterfaceC67397Qcj
    public final void LLZZZZ(Iterable<AbstractC67413Qcz> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        LIZ.append(LJIIL(iterable));
        String LIZIZ = X1D.LIZIZ(LIZ);
        SQLiteDatabase LJFF = LJFF();
        LJFF.beginTransaction();
        try {
            LJFF.compileStatement(LIZIZ).execute();
            Cursor rawQuery = LJFF.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
            while (rawQuery.moveToNext()) {
                try {
                    LIZIZ(rawQuery.getInt(0), EnumC67390Qcc.MAX_RETRIES_REACHED, rawQuery.getString(1));
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            LJFF.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
            LJFF.setTransactionSuccessful();
        } finally {
            LJFF.endTransaction();
        }
    }

    public static Long LJIIJ(SQLiteDatabase sQLiteDatabase, AbstractC67354Qc2 abstractC67354Qc2) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC67354Qc2.LIZIZ(), String.valueOf(C67356Qc4.LIZ(abstractC67354Qc2.LIZLLL()))));
        if (abstractC67354Qc2.LIZJ() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC67354Qc2.LIZJ(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) LJIILIIL(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new T28());
    }

    public static <T> T LJIILIIL(Cursor cursor, InterfaceC67373QcL<Cursor, T> interfaceC67373QcL) {
        try {
            return interfaceC67373QcL.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // X.InterfaceC67397Qcj
    public final void LJJLIIIJL(final long j, final AbstractC67354Qc2 abstractC67354Qc2) {
        LJIIJJI(new InterfaceC67373QcL() { // from class: X.QcT
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                long j2 = j;
                AbstractC67354Qc2 abstractC67354Qc22 = abstractC67354Qc2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC67354Qc22.LIZIZ(), String.valueOf(C67356Qc4.LIZ(abstractC67354Qc22.LIZLLL()))}) < 1) {
                    contentValues.put("backend_name", abstractC67354Qc22.LIZIZ());
                    contentValues.put("priority", Integer.valueOf(C67356Qc4.LIZ(abstractC67354Qc22.LIZLLL())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // X.InterfaceC67397Qcj
    public final C67383QcV r(final AbstractC67354Qc2 abstractC67354Qc2, final AbstractC67375QcN abstractC67375QcN) {
        abstractC67354Qc2.LIZLLL();
        abstractC67375QcN.LJI();
        abstractC67354Qc2.LIZIZ();
        C46617IRh.LIZ("SQLiteEventStore");
        long longValue = ((Long) LJIIJJI(new InterfaceC67373QcL() { // from class: X.QcP
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                long insert;
                boolean z;
                byte[] bArr;
                C67379QcR c67379QcR = C67379QcR.this;
                AbstractC67375QcN abstractC67375QcN2 = abstractC67375QcN;
                AbstractC67354Qc2 abstractC67354Qc22 = abstractC67354Qc2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (c67379QcR.LJFF().compileStatement("PRAGMA page_size").simpleQueryForLong() * c67379QcR.LJI() >= c67379QcR.LJLJJI.LJ()) {
                    c67379QcR.LIZIZ(1L, EnumC67390Qcc.CACHE_FULL, abstractC67375QcN2.LJI());
                    return -1L;
                }
                Long LJIIJ = C67379QcR.LJIIJ(sQLiteDatabase, abstractC67354Qc22);
                if (LJIIJ != null) {
                    insert = LJIIJ.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", abstractC67354Qc22.LIZIZ());
                    contentValues.put("priority", Integer.valueOf(C67356Qc4.LIZ(abstractC67354Qc22.LIZLLL())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (abstractC67354Qc22.LIZJ() != null) {
                        contentValues.put("extras", Base64.encodeToString(abstractC67354Qc22.LIZJ(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int LIZLLL = c67379QcR.LJLJJI.LIZLLL();
                byte[] bArr2 = abstractC67375QcN2.LIZLLL().LIZIZ;
                if (bArr2.length <= LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", abstractC67375QcN2.LJI());
                contentValues2.put("timestamp_ms", Long.valueOf(abstractC67375QcN2.LJ()));
                contentValues2.put("uptime_ms", Long.valueOf(abstractC67375QcN2.LJII()));
                contentValues2.put("payload_encoding", abstractC67375QcN2.LIZLLL().LIZ.LIZ);
                contentValues2.put("code", abstractC67375QcN2.LIZJ());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                if (z) {
                    bArr = bArr2;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / LIZLLL);
                    for (int i = 1; i <= ceil; i++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * LIZLLL, Math.min(i * LIZLLL, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(abstractC67375QcN2.LIZIZ()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new C67383QcV(longValue, abstractC67354Qc2, abstractC67375QcN);
    }

    @Override // X.InterfaceC66854QLq
    public final void LIZIZ(final long j, final EnumC67390Qcc enumC67390Qcc, final String str) {
        LJIIJJI(new InterfaceC67373QcL() { // from class: X.QLp
            @Override // X.InterfaceC67373QcL
            public final Object apply(Object obj) {
                boolean z;
                String str2 = str;
                EnumC67390Qcc enumC67390Qcc2 = enumC67390Qcc;
                long j2 = j;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(enumC67390Qcc2.getNumber())});
                try {
                    if (rawQuery.getCount() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    rawQuery.close();
                    if (!valueOf.booleanValue()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("log_source", str2);
                        contentValues.put("reason", Integer.valueOf(enumC67390Qcc2.getNumber()));
                        contentValues.put("events_dropped_count", Long.valueOf(j2));
                        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
                        LIZ.append(j2);
                        LIZ.append(" WHERE log_source = ? AND reason = ?");
                        sQLiteDatabase.execSQL(X1D.LIZIZ(LIZ), new String[]{str2, Integer.toString(enumC67390Qcc2.getNumber())});
                    }
                    return null;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
        });
    }

    public C67379QcR(InterfaceC67370QcI interfaceC67370QcI, InterfaceC67370QcI interfaceC67370QcI2, AbstractC67423Qd9 abstractC67423Qd9, C79383VDn c79383VDn, InterfaceC67469Qdt<String> interfaceC67469Qdt) {
        this.LJLIL = c79383VDn;
        this.LJLILLLLZI = interfaceC67370QcI;
        this.LJLJI = interfaceC67370QcI2;
        this.LJLJJI = abstractC67423Qd9;
        this.LJLJJL = interfaceC67469Qdt;
    }
}
