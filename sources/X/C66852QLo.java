package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.File;

/* renamed from: X.QLo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66852QLo extends SQLiteOpenHelper {
    public static volatile C66852QLo LJLILLLLZI;
    public boolean LJLIL;

    public static C66852QLo LIZ() {
        if (LJLILLLLZI == null) {
            synchronized (C66852QLo.class) {
                if (LJLILLLLZI == null) {
                    LJLILLLLZI = new C66852QLo();
                }
            }
        }
        return LJLILLLLZI;
    }

    public C66852QLo() {
        super(C84212X3g.LJ(), "downloader.db", (SQLiteDatabase.CursorFactory) null, 16);
        this.LJLIL = false;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        Context LJ = C84212X3g.LJ();
        if (!this.LJLIL && LJ != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("/data/data/");
                LIZ.append(LJ.getPackageName());
                LIZ.append("/database/main/");
                File file = new File(X1D.LIZIZ(LIZ));
                if (!file.exists()) {
                    file.mkdir();
                }
                super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
                this.LJLIL = true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return super.getReadableDatabase();
        }
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (Build.VERSION.SDK_INT == 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT, downloadStartTimeStamp INTEGER, downloadFinishTimeStamp INTEGER, installedTimeStamp INTEGER, hasDoInstallation INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ("DownloadDBHelper", "onDowngrade", C48263Iwt.LIZLLL("OldVersion: ", i, " newVersion: ", i2));
        }
        if (X4H.LJFF.LJIIIIZZ("support_sqlite_downgrade", 0) > 0) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloader");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS segments");
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Error: ");
                LIZ.append(th);
                C65210PiY.LIZJ("DownloadDBHelper", "onDowngrade", X1D.LIZIZ(LIZ));
            }
            onCreate(sQLiteDatabase);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ("DownloadDBHelper", "onUpgrade", C48263Iwt.LIZLLL("OldVersion: ", i, " newVersion: ", i2));
        }
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
            case 7:
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD taskId TEXT");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadStartTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadFinishTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD installedTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD hasDoInstallation INTEGER");
                return;
            default:
                return;
        }
    }
}
