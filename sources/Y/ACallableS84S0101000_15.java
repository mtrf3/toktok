package Y;

import X.C16880lQ;
import X.C76800UCe;
import X.X4A;
import X.X4P;
import X.X4Q;
import X.XTH;
import X.XTK;
import android.database.Cursor;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class ACallableS84S0101000_15 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS84S0101000_15 aCallableS84S0101000_15) {
        ((XTK) aCallableS84S0101000_15.l0).LIZ.onProgress(aCallableS84S0101000_15.i1);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS84S0101000_15 aCallableS84S0101000_15) {
        ((XTH) aCallableS84S0101000_15.l0).LIZ.onProgress(aCallableS84S0101000_15.i1);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS84S0101000_15 aCallableS84S0101000_15) {
        Cursor cursor;
        X4A x4a = (X4A) aCallableS84S0101000_15.l0;
        int i = aCallableS84S0101000_15.i1;
        x4a.B0();
        DownloadInfo downloadInfo = null;
        if (X4A.LJLJJLL != null) {
            try {
                cursor = X4A.LJLJJLL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "_id"}), new String[]{Integer.toString(i)});
            } catch (Throwable unused) {
                cursor = null;
            }
            try {
                if (cursor.moveToNext()) {
                    downloadInfo = X4P.LJIJJ(cursor);
                    X4Q.LJJIII(cursor);
                } else {
                    X4Q.LJJIII(cursor);
                }
            } catch (Throwable unused2) {
                X4Q.LJJIII(cursor);
                return downloadInfo;
            }
        }
        return downloadInfo;
    }

    public ACallableS84S0101000_15(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
