package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25080ye {
    public static void LIZ(InterfaceC262211e interfaceC262211e) {
        ArrayList arrayList = new ArrayList();
        Cursor query = interfaceC262211e.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (query.moveToNext()) {
            try {
                arrayList.add(query.getString(0));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DROP TRIGGER IF EXISTS ");
                LIZ.append(str);
                interfaceC262211e.LJJIJIIJI(X1D.LIZIZ(LIZ));
            }
        }
    }

    public static Cursor LIZIZ(AbstractC03300Ba abstractC03300Ba, InterfaceC262911l interfaceC262911l, boolean z) {
        int i;
        Cursor LJIILIIL = abstractC03300Ba.LJIILIIL(interfaceC262911l);
        if (z && (LJIILIIL instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) LJIILIIL;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (Build.VERSION.SDK_INT < 23 || i < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i2 = 0; i2 < abstractWindowedCursor.getColumnCount(); i2++) {
                            int type = abstractWindowedCursor.getType(i2);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i2] = abstractWindowedCursor.getBlob(i2);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i2] = abstractWindowedCursor.getString(i2);
                                        }
                                    } else {
                                        objArr[i2] = Double.valueOf(abstractWindowedCursor.getDouble(i2));
                                    }
                                } else {
                                    objArr[i2] = Long.valueOf(abstractWindowedCursor.getLong(i2));
                                }
                            } else {
                                objArr[i2] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return LJIILIIL;
    }
}
