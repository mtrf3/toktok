package com.tencent.wcdb.database;

import X.C16880lQ;
import X.C84325X7p;
import X.X1D;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class SQLiteDebug {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes5.dex */
    public static class IOTraceStats {
        public String dbName;
        public String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public String path;

        public String toString() {
            return C16880lQ.LLLZ("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", new Object[]{this.dbName, this.path, Long.valueOf(this.pageSize), Long.valueOf(this.pageCount), this.journalMode, Long.valueOf(this.lastReadOffset), Long.valueOf(this.lastWriteOffset), Long.valueOf(this.lastJournalReadOffset), Long.valueOf(this.lastJournalWriteOffset)});
        }
    }

    /* loaded from: classes5.dex */
    public static class PagerStats {
        public ArrayList<DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    public static native void nativeGetIOTraceStats(long j, ArrayList<IOTraceStats> arrayList);

    public static native int nativeGetLastErrorLine();

    public static native void nativeGetPagerStats(PagerStats pagerStats);

    public static native void nativeSetIOTraceFlags(int i);

    static {
        SQLiteGlobal.loadLib();
    }

    public static void LIZ(SQLiteConnection sQLiteConnection) {
        try {
            nativeGetLastErrorLine();
            ArrayList arrayList = new ArrayList();
            long LJIIJJI = sQLiteConnection.LJIIJJI(null);
            if (LJIIJJI != 0) {
                nativeGetIOTraceStats(LJIIJJI, arrayList);
                sQLiteConnection.LIZLLL();
            }
        } catch (RuntimeException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Cannot collect I/O trace statistics: ");
            LIZ2.append(e.getMessage());
            Log.LIZ("WCDB.SQLiteDebug", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZIZ(SQLiteDatabase sQLiteDatabase) {
        try {
            nativeGetLastErrorLine();
            ArrayList arrayList = new ArrayList();
            long LJ = sQLiteDatabase.LJ("collectIoStat", false);
            if (LJ != 0) {
                nativeGetIOTraceStats(LJ, arrayList);
            }
            C84325X7p LJJ = sQLiteDatabase.LJJ();
            SQLiteConnection sQLiteConnection = LJJ.LIZIZ;
            if (sQLiteConnection != null) {
                sQLiteConnection.LIZLLL();
            }
            LJJ.LJIIIZ();
        } catch (RuntimeException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Cannot collect I/O trace statistics: ");
            LIZ2.append(e.getMessage());
            Log.LIZ("WCDB.SQLiteDebug", X1D.LIZIZ(LIZ2));
        }
    }

    /* loaded from: classes5.dex */
    public static class DbStats {
        public String cache;
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(String str, long j, long j2, int i, int i2, int i3, int i4) {
            this.dbName = str;
            this.pageSize = j2 / 1024;
            this.dbSize = (j * j2) / 1024;
            this.lookaside = i;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i2);
            LIZ.append("/");
            LIZ.append(i3);
            LIZ.append("/");
            LIZ.append(i4);
            this.cache = X1D.LIZIZ(LIZ);
        }
    }
}
