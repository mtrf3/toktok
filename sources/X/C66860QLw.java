package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.o;

/* renamed from: X.QLw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66860QLw extends SQLiteOpenHelper {
    public final String LJLIL;

    public C66860QLw(Context context) {
        super(context, "preinstall_attribution.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.LJLIL = "create table preinstall_tb (\n    id integer primary key autoincrement,\n    preinstall_channel_af text,\n    preinstall_campaign_af text,\n    preinstall_channel_tt text,\n    system_file_channel text,\n    file_path text,\n    name_in_manifest text,\n    install_referrer text,\n    app_channel text,\n    apk_first_install_time long,\n    apk_last_update_time long,\n    is_factory_uninstall integer,\n    preinstall_method integer,\n    df_code integer\n)";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db) {
        o.LJIIIZ(db, "db");
        db.execSQL(this.LJLIL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db, int i, int i2) {
        o.LJIIIZ(db, "db");
        if (i == 1 && i2 == 2) {
            db.execSQL("alter table preinstall_tb add column df_code integer    ");
            db.close();
        }
    }
}
