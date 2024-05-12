package X;

import X.C0M9;
import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class QC6 implements InterfaceC68071Qnb {
    public static final C1HQ LJI = new C1HQ();
    public static final String[] LJII = {"key", "value"};
    public final ContentResolver LIZ;
    public final android.net.Uri LIZIZ;
    public final QC7 LIZJ;
    public final Object LIZLLL;
    public volatile java.util.Map LJ;
    public final List LJFF;

    public static synchronized void LIZLLL() {
        synchronized (QC6.class) {
            Iterator it = ((C0M9.e) LJI.values()).iterator();
            while (it.hasNext()) {
                QC6 qc6 = (QC6) it.next();
                qc6.LIZ.unregisterContentObserver(qc6.LIZJ);
            }
            LJI.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.QC5] */
    public final java.util.Map LIZJ() {
        Object obj;
        java.util.Map map = this.LJ;
        if (map == null) {
            synchronized (this.LIZLLL) {
                map = this.LJ;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            QC5 qc5 = new QC5(this);
                            try {
                                qc5 = qc5.LIZ();
                                obj = qc5;
                            } catch (SecurityException unused) {
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                } finally {
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                }
                            }
                            map = (java.util.Map) obj;
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.LJ = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC68071Qnb
    public final /* bridge */ /* synthetic */ Object LIZ(String str) {
        return LIZJ().get(str);
    }

    public QC6(ContentResolver contentResolver, android.net.Uri uri) {
        QC7 qc7 = new QC7(this);
        this.LIZJ = qc7;
        this.LIZLLL = new Object();
        this.LJFF = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.LIZ = contentResolver;
        this.LIZIZ = uri;
        contentResolver.registerContentObserver(uri, false, qc7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QC6 LIZIZ(ContentResolver contentResolver, android.net.Uri uri) {
        QC6 qc6;
        synchronized (QC6.class) {
            C1HQ c1hq = LJI;
            qc6 = (QC6) c1hq.getOrDefault(uri, null);
            if (qc6 == null) {
                try {
                    QC6 qc62 = new QC6(contentResolver, uri);
                    try {
                        c1hq.put(uri, qc62);
                    } catch (SecurityException unused) {
                    }
                    qc6 = qc62;
                } catch (SecurityException unused2) {
                }
            }
        }
        return qc6;
    }
}
