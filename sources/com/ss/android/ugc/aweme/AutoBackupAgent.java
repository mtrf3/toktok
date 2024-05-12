package com.ss.android.ugc.aweme;

import X.C188727au;
import X.C221108m2;
import X.C62822Ol8;
import X.EL4;
import X.EL5;
import X.FMX;
import android.app.backup.BackupAgentHelper;
import android.app.backup.FullBackupDataOutput;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AutoBackupAgent extends BackupAgentHelper {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(EL5.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EL4.LJLIL);

    @Override // android.app.backup.BackupAgent
    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        int i;
        try {
            super.onFullBackup(fullBackupDataOutput);
            o.LJIIIIZZ(((SharedPreferences) this.LIZ.getValue()).getAll(), "autoBackupSP.all");
            if (!r1.isEmpty()) {
                i = 1;
            } else {
                i = 0;
            }
            int i2 = ((SharedPreferences) this.LIZIZ.getValue()).getInt("backup_count_key", 0) + 1;
            ((SharedPreferences) this.LIZIZ.getValue()).edit().putInt("backup_count_key", i2).apply();
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(i, "did_backup_data");
            c188727au.LIZLLL(i2, "backup_count");
            FMX.LJIIL("full_backup", c188727au.LIZ);
        } catch (Throwable unused) {
        }
    }
}
