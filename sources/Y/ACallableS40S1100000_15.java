package Y;

import X.C16880lQ;
import X.C38891fp;
import X.C39717FiL;
import X.C84382X9u;
import X.C84778XPa;
import X.X1D;
import X.X4A;
import X.X4P;
import X.X4Q;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.presenter.MusicListPresenter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACallableS40S1100000_15 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS40S1100000_15 aCallableS40S1100000_15) {
        return MusicApi.LIZ(((MusicListPresenter) aCallableS40S1100000_15.l1).mCursor, 16, aCallableS40S1100000_15.s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    public static final Object call$1(ACallableS40S1100000_15 aCallableS40S1100000_15) {
        ObjectInputStream objectInputStream;
        InputStream inputStream;
        C84778XPa c84778XPa = (C84778XPa) aCallableS40S1100000_15.l1;
        String str = aCallableS40S1100000_15.s0;
        C84382X9u c84382X9u = c84778XPa.LIZIZ;
        ObjectInputStream objectInputStream2 = null;
        try {
            if (c84382X9u != null) {
                try {
                    C39717FiL LJ = c84382X9u.LJ(str);
                    if (LJ != null) {
                        inputStream = LJ.LJLIL[0];
                    } else {
                        inputStream = null;
                    }
                    objectInputStream = new ObjectInputStream(inputStream);
                    try {
                        Object readObject = objectInputStream.readObject();
                        o.LJII(readObject, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                        ?? r1 = (Aweme) readObject;
                        C38891fp.LJIIJJI(objectInputStream);
                        objectInputStream2 = r1;
                        if (r1 != 0) {
                            C84778XPa c84778XPa2 = (C84778XPa) aCallableS40S1100000_15.l1;
                            String str2 = aCallableS40S1100000_15.s0;
                            C84382X9u c84382X9u2 = c84778XPa2.LIZIZ;
                            if (c84382X9u2 != null) {
                                try {
                                    c84382X9u2.LJIJ(str2);
                                } catch (Exception e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                            }
                            ((C84778XPa) aCallableS40S1100000_15.l1).LIZ.LJLIL.put(aCallableS40S1100000_15.s0, objectInputStream2);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        C16880lQ.LLLLIIL(e);
                        C38891fp.LJIIJJI(objectInputStream);
                        return objectInputStream2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    C38891fp.LJIIJJI(objectInputStream2);
                    throw th;
                }
            }
            return objectInputStream2;
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
        }
    }

    public static final Object call$2(ACallableS40S1100000_15 aCallableS40S1100000_15) {
        Cursor cursor;
        X4A x4a = (X4A) aCallableS40S1100000_15.l1;
        String str = aCallableS40S1100000_15.s0;
        x4a.B0();
        ArrayList arrayList = new ArrayList();
        if (X4A.LJLJJLL != null) {
            try {
                cursor = X4A.LJLJJLL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "url"}), new String[]{str});
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(X4P.LJIJJ(cursor));
                    } catch (Throwable unused) {
                        X4Q.LJJIII(cursor);
                        return arrayList;
                    }
                }
                X4Q.LJJIII(cursor);
            } catch (Throwable unused2) {
                cursor = null;
            }
        }
        return arrayList;
    }

    public static final Object call$3(ACallableS40S1100000_15 aCallableS40S1100000_15) {
        Cursor cursor;
        X4A x4a = (X4A) aCallableS40S1100000_15.l1;
        String str = aCallableS40S1100000_15.s0;
        x4a.B0();
        ArrayList arrayList = new ArrayList();
        if (X4A.LJLJJLL != null) {
            try {
                cursor = X4A.LJLJJLL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s WHERE %s = ? AND %s = ?", new Object[]{"downloader", "mimeType", "status"}), new String[]{str, String.valueOf(-3)});
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(X4P.LJIJJ(cursor));
                    } catch (Throwable unused) {
                        X4Q.LJJIII(cursor);
                        return arrayList;
                    }
                }
                X4Q.LJJIII(cursor);
            } catch (Throwable unused2) {
                cursor = null;
            }
        }
        return arrayList;
    }

    public static final Object call$4(ACallableS40S1100000_15 aCallableS40S1100000_15) {
        Cursor cursor;
        X4A x4a = (X4A) aCallableS40S1100000_15.l1;
        String str = aCallableS40S1100000_15.s0;
        x4a.B0();
        ArrayList arrayList = new ArrayList();
        if (X4A.LJLJJLL != null) {
            try {
                cursor = X4A.LJLJJLL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s WHERE %s = ? AND %s IN (?,?,?,?,?)", new Object[]{"downloader", "mimeType", "status"}), new String[]{str, String.valueOf(-1), String.valueOf(-2), String.valueOf(-7), String.valueOf(-4), String.valueOf(-5)});
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(X4P.LJIJJ(cursor));
                    } catch (Throwable unused) {
                        X4Q.LJJIII(cursor);
                        return arrayList;
                    }
                }
                X4Q.LJJIII(cursor);
            } catch (Throwable unused2) {
                cursor = null;
            }
        }
        return arrayList;
    }

    public static final Object call$5(ACallableS40S1100000_15 aCallableS40S1100000_15) {
        Cursor cursor;
        X4A x4a = (X4A) aCallableS40S1100000_15.l1;
        String str = aCallableS40S1100000_15.s0;
        x4a.B0();
        ArrayList arrayList = new ArrayList();
        if (X4A.LJLJJLL != null) {
            try {
                SQLiteDatabase sQLiteDatabase = X4A.LJLJJLL;
                String LLLZ = C16880lQ.LLLZ("SELECT * FROM %s WHERE %s LIKE ?", new Object[]{"downloader", "name"});
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("%");
                LIZ.append(str);
                cursor = sQLiteDatabase.rawQuery(LLLZ, new String[]{X1D.LIZIZ(LIZ)});
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(X4P.LJIJJ(cursor));
                    } catch (Throwable unused) {
                        X4Q.LJJIII(cursor);
                        return arrayList;
                    }
                }
                X4Q.LJJIII(cursor);
            } catch (Throwable unused2) {
                cursor = null;
            }
        }
        return arrayList;
    }

    public ACallableS40S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
