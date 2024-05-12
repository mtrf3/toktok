package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class QH4 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZIZ, this.LIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.LIZIZ, "applicationId");
        c64362PNu.LIZ(this.LIZ, "apiKey");
        c64362PNu.LIZ(this.LIZJ, "databaseUrl");
        c64362PNu.LIZ(this.LJ, "gcmSenderId");
        c64362PNu.LIZ(this.LJFF, "storageBucket");
        c64362PNu.LIZ(this.LJI, "projectId");
        return c64362PNu.toString();
    }

    public static QH4 LIZ(Context context) {
        QH5 qh5 = new QH5(context);
        String LIZ = qh5.LIZ("google_app_id");
        if (TextUtils.isEmpty(LIZ)) {
            return null;
        }
        return new QH4(LIZ, qh5.LIZ("google_api_key"), qh5.LIZ("firebase_database_url"), qh5.LIZ("ga_trackingId"), qh5.LIZ("gcm_defaultSenderId"), qh5.LIZ("google_storage_bucket"), qh5.LIZ("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QH4)) {
            return false;
        }
        QH4 qh4 = (QH4) obj;
        if (!C64363PNv.LIZ(this.LIZIZ, qh4.LIZIZ) || !C64363PNv.LIZ(this.LIZ, qh4.LIZ) || !C64363PNv.LIZ(this.LIZJ, qh4.LIZJ) || !C64363PNv.LIZ(this.LIZLLL, qh4.LIZLLL) || !C64363PNv.LIZ(this.LJ, qh4.LJ) || !C64363PNv.LIZ(this.LJFF, qh4.LJFF) || !C64363PNv.LIZ(this.LJI, qh4.LJI)) {
            return false;
        }
        return true;
    }

    public QH4(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        QH7.LJIIJ("ApplicationId must be set.", !QH6.LIZ(str));
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
    }
}
