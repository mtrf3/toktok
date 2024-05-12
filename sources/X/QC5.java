package X;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public final /* synthetic */ class QC5 implements InterfaceC63909P6j {
    public Object LIZ;

    public /* synthetic */ QC5(QC6 qc6) {
        this.LIZ = qc6;
    }

    public final Object LIZ() {
        Cursor query;
        java.util.Map hashMap;
        QC6 qc6 = (QC6) this.LIZ;
        ContentResolver contentResolver = qc6.LIZ;
        android.net.Uri uri = qc6.LIZIZ;
        String[] strArr = QC6.LJII;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "8344585710407265112"));
        if (LIZJ.LIZ) {
            query = (Cursor) LIZJ.LIZIZ;
        } else {
            query = contentResolver.query(uri, strArr, null, null, null);
        }
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C1HQ(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public QC5(int i) {
        if (i != 2) {
            return;
        }
        this.LIZ = new LinkedList();
    }
}
