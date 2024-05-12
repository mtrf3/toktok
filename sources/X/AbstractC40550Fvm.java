package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fvm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40550Fvm {
    public static C40549Fvl LJ(int i, int i2, int i3, long j, long j2, List list, List list2) {
        if (i2 != 8) {
            return new C40549Fvl(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static C40549Fvl LJFF(Bundle bundle) {
        return new C40549Fvl(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract List<String> LIZ();

    public abstract List<String> LIZIZ();

    public abstract long LIZJ();

    public abstract List<Intent> LIZLLL();

    public abstract int LJI();

    public final List<String> LJII() {
        return LIZIZ() != null ? new ArrayList(LIZIZ()) : new ArrayList();
    }

    public final List<String> LJIIIIZZ() {
        return LIZ() != null ? new ArrayList(LIZ()) : new ArrayList();
    }

    public abstract PendingIntent LJIIIZ();

    public abstract int LJIIJ();

    public abstract int LJIIJJI();

    public abstract long LJIIL();
}
