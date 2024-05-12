package X;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.QnN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C68057QnN {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C68057QnN(C68055QnL c68055QnL, String str) {
        this.LIZ = c68055QnL;
        this.LIZIZ = str;
    }

    public final Object LIZ() {
        String str;
        Cursor query;
        C68055QnL c68055QnL = (C68055QnL) this.LIZ;
        String str2 = (String) this.LIZIZ;
        ContentResolver contentResolver = c68055QnL.LIZ.getContentResolver();
        synchronized (C68058QnO.class) {
            if (C68058QnO.LJ == null) {
                C68058QnO.LIZLLL.set(false);
                C68058QnO.LJ = new HashMap();
                C68058QnO.LJIIIZ = new Object();
                contentResolver.registerContentObserver(C68058QnO.LIZ, true, new C68061QnR());
            } else if (C68058QnO.LIZLLL.getAndSet(false)) {
                C68058QnO.LJ.clear();
                C68058QnO.LJFF.clear();
                C68058QnO.LJI.clear();
                C68058QnO.LJII.clear();
                C68058QnO.LJIIIIZZ.clear();
                C68058QnO.LJIIIZ = new Object();
            }
            Object obj = C68058QnO.LJIIIZ;
            str = null;
            if (C68058QnO.LJ.containsKey(str2)) {
                String str3 = (String) C68058QnO.LJ.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                android.net.Uri uri = C68058QnO.LIZ;
                String[] strArr = {str2};
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, strArr, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "8344585710407265102"));
                if (LIZJ.LIZ) {
                    query = (Cursor) LIZJ.LIZIZ;
                } else {
                    query = contentResolver.query(uri, null, null, strArr, null);
                }
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            C68058QnO.LIZ(str2, obj, null);
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            C68058QnO.LIZ(str2, obj, string);
                            if (string != null) {
                                str = string;
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }

    public /* synthetic */ C68057QnN() {
        this.LIZ = new ArrayList();
        this.LIZIZ = new LinkedHashMap();
    }
}
