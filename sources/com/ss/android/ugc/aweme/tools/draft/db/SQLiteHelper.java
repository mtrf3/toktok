package com.ss.android.ugc.aweme.tools.draft.db;

import X.C16880lQ;
import X.C19N;
import X.C42962Gta;
import X.C42975Gtn;
import X.C60903NvH;
import X.KL2;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ss.android.ugc.aweme.tools.draft.da.DBEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class SQLiteHelper extends SQLiteOpenHelper {
    public static SQLiteHelper sInstance;

    public SQLiteHelper() {
        super(C16880lQ.LLLLJI(C60903NvH.LJ), "aweme.db", null, 28, getErrorHandler());
    }

    public static DatabaseErrorHandler getErrorHandler() {
        if (C19N.LJ("use_draft_database_error_handler", true)) {
            return new C42975Gtn();
        }
        return null;
    }

    public static SQLiteHelper getInstance() {
        if (sInstance == null) {
            synchronized (SQLiteHelper.class) {
                if (sInstance == null) {
                    sInstance = new SQLiteHelper();
                }
            }
        }
        return sInstance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT,\n\t`draft_view_info`\tTEXT,\n\t`save_time`\tLONG,\n\t`creative_model`\tTEXT,\n\t`is_published`\tINTEGER,\n\t`published_time`\tLONG,\n\t`published_aweme_id`\tTEXT,\n\t`format_type`\tINTEGER\tDEFAULT 1,\n\t`visible_to_user`\tINTEGER\tDEFAULT 1\n);");
        long currentTimeMillis = System.currentTimeMillis();
        C42962Gta.LIZLLL().storeLong("short_creation_time", currentTimeMillis);
        C42962Gta.LJFF(new DBEvent("db_create", 0, 0, C42962Gta.LIZJ(), currentTimeMillis, C42962Gta.LIZIZ(currentTimeMillis), 6, null));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int i, int i2) {
        try {
            super.onDowngrade(db, i, i2);
            o.LJIIIZ(db, "db");
            long currentTimeMillis = System.currentTimeMillis();
            C42962Gta.LJFF(new DBEvent("db_downgrade", i, i2, C42962Gta.LIZJ(), currentTimeMillis, C42962Gta.LIZIZ(currentTimeMillis)));
        } catch (Exception e) {
            C60903NvH.LJIIJJI().LJJIIZI().LIZ(e);
            KL2.LIZLLL(R.string.tgf, C16880lQ.LLLLJI(C60903NvH.LJ));
            System.exit(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x033e, code lost:
    
        if (r178 <= 16) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0343, code lost:
    
        if (r178 <= 2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x036a, code lost:
    
        if (r9 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0389, code lost:
    
        if (r9.isClosed() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f4, code lost:
    
        if (r178 <= 27) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0362 A[Catch: all -> 0x0376, Exception -> 0x0383, TryCatch #2 {Exception -> 0x0383, all -> 0x0376, blocks: (B:58:0x0347, B:60:0x0362), top: B:57:0x0347 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d4  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r177, int r178, int r179) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
