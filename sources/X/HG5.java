package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HG5 extends SQLiteOpenHelper {
    public static HG5 LJLIL;

    public final ArrayList<OriginalSoundUploadTask> LIZIZ() {
        boolean z;
        boolean z2;
        ArrayList<OriginalSoundUploadTask> arrayList = new ArrayList<>();
        Cursor query = getReadableDatabase().query("OriginalSound", new String[]{"aweme_id", "vid", "audio_path", "union_id", "update_time", "match_factors", "is_draft", "origin", "is_backup", "query_times"}, null, null, null, null, "update_time desc");
        while (query.moveToNext()) {
            try {
                String string = query.getString(query.getColumnIndex("aweme_id"));
                o.LJIIIIZZ(string, "it.getString(it.getColumnIndex(AWEME_ID))");
                String string2 = query.getString(query.getColumnIndex("vid"));
                o.LJIIIIZZ(string2, "it.getString(it.getColumnIndex(VID))");
                String string3 = query.getString(query.getColumnIndex("audio_path"));
                o.LJIIIIZZ(string3, "it.getString(it.getColumnIndex(AUDIO_PATH))");
                long j = query.getLong(query.getColumnIndex("update_time"));
                String string4 = query.getString(query.getColumnIndex("union_id"));
                int i = query.getInt(query.getColumnIndex("match_factors"));
                if (query.getInt(query.getColumnIndex("is_draft")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = query.getInt(query.getColumnIndex("origin"));
                if (query.getInt(query.getColumnIndex("is_backup")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new OriginalSoundUploadTask(string, string2, string3, j, string4, null, i, z, i2, z2, query.getInt(query.getColumnIndex("query_times"))));
            } finally {
            }
        }
        AnonymousClass636.LJFF(query, null);
        return arrayList;
    }

    public HG5(Context context) {
        super(context, "OriginalSound", (SQLiteDatabase.CursorFactory) null, 3);
    }

    public final void LIZ(OriginalSoundUploadTask originalSoundUploadTask) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", originalSoundUploadTask.awemeId);
        contentValues.put("vid", originalSoundUploadTask.vid);
        contentValues.put("audio_path", originalSoundUploadTask.originalSoundPath);
        contentValues.put("audio_vid", originalSoundUploadTask.audioVid);
        contentValues.put("update_time", Long.valueOf(originalSoundUploadTask.updateTime));
        contentValues.put("union_id", originalSoundUploadTask.unionId);
        contentValues.put("match_factors", Integer.valueOf(originalSoundUploadTask.matchFactors));
        contentValues.put("is_draft", Integer.valueOf(originalSoundUploadTask.isDraft ? 1 : 0));
        contentValues.put("origin", Integer.valueOf(originalSoundUploadTask.origin));
        contentValues.put("is_backup", Integer.valueOf(originalSoundUploadTask.isBackup ? 1 : 0));
        contentValues.put("query_times", Integer.valueOf(originalSoundUploadTask.queryTimes));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db) {
        o.LJIIIZ(db, "db");
        db.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db, int i, int i2) {
        o.LJIIIZ(db, "db");
        if (i < 2) {
            if (i != i2) {
                db.execSQL("ALTER TABLE OriginalSound ADD COLUMN union_id TEXT");
            }
        } else if (i >= 3) {
            return;
        }
        if (i != i2) {
            db.execSQL("ALTER TABLE OriginalSound ADD COLUMN match_factors INTEGER");
            db.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_draft INTEGER");
            db.execSQL("ALTER TABLE OriginalSound ADD COLUMN origin INTEGER");
            db.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_backup INTEGER");
            db.execSQL("ALTER TABLE OriginalSound ADD COLUMN query_times INTEGER");
        }
    }
}
