package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: X.0Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04240Eq {
    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2, C10610bJ c10610bJ) {
        Object obj;
        if (c10610bJ != null) {
            try {
                synchronized (c10610bJ) {
                    if (c10610bJ.LIZJ == null) {
                        CancellationSignal LIZIZ = C10590bH.LIZIZ();
                        c10610bJ.LIZJ = LIZIZ;
                        if (c10610bJ.LIZ) {
                            C10590bH.LIZ(LIZIZ);
                        }
                    }
                    obj = c10610bJ.LIZJ;
                }
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new C10680bQ();
                }
                throw e;
            }
        } else {
            obj = null;
        }
        return C04230Ep.LIZ(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
