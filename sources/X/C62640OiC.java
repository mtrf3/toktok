package X;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.OiC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62640OiC<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C68322mC<Cursor> LIZ;
    public final /* synthetic */ long LIZIZ;

    public C62640OiC(C68322mC<Cursor> c68322mC, long j) {
        this.LIZ = c68322mC;
        this.LIZIZ = j;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        int i;
        int i2;
        boolean z;
        java.util.Map<String, String> map;
        int i3;
        Cursor cursor = this.LIZ.element;
        if (cursor != null) {
            long j = this.LIZIZ;
            if (!cursor.moveToFirst()) {
                C62657OiT.LIZIZ("cannot move to first");
            } else {
                int columnIndex = cursor.getColumnIndex("_data");
                int columnIndex2 = cursor.getColumnIndex("date_added");
                int columnIndex3 = cursor.getColumnIndex("width");
                int columnIndex4 = cursor.getColumnIndex("height");
                String filePath = cursor.getString(columnIndex);
                long j2 = 1000;
                long j3 = cursor.getLong(columnIndex2) * j2;
                if (columnIndex3 >= 0 && columnIndex4 >= 0) {
                    i = cursor.getInt(columnIndex3);
                    i2 = cursor.getInt(columnIndex4);
                } else {
                    o.LJIIIIZZ(filePath, "filePath");
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(filePath, options);
                    Point point = new Point(options.outWidth, options.outHeight);
                    i = point.x;
                    i2 = point.y;
                }
                o.LJIIIIZZ(filePath, "filePath");
                StringBuilder LJ = AnonymousClass028.LJ("ScreenShot: \n  path = ", filePath, "; \n  size = ", i, " * ");
                V10.LJFF(LJ, i2, "; \n  dateAdded = ", j3);
                C62657OiT.LIZIZ(X1D.LIZIZ(LJ));
                if (TextUtils.isEmpty(filePath)) {
                    C62657OiT.LIZIZ("error: path");
                } else {
                    String LIZJ = AnonymousClass028.LIZJ("getDefault()", filePath, "this as java.lang.String).toLowerCase(locale)");
                    String[] strArr = C62639OiB.LIZLLL;
                    int length = strArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (s.LJJJLZIJ(LIZJ, strArr[i4], false)) {
                            if (j3 / j2 < j / j2 || System.currentTimeMillis() - j3 > 10000) {
                                StringBuilder LIZJ2 = V10.LIZJ("error: time doesn't match\n  dateAdded: ", j3, " \n  startListenTime: ");
                                LIZJ2.append(j);
                                LIZJ2.append(" \n  total time: ");
                                LIZJ2.append(System.currentTimeMillis() - j3);
                                C62657OiT.LIZIZ(X1D.LIZIZ(LIZJ2));
                            } else {
                                Point point2 = C62639OiB.LIZ;
                                if (point2 != null && ((i > (i3 = point2.x) || i2 > point2.y) && (i2 > i3 || i > point2.y))) {
                                    C62657OiT.LIZIZ("error: size");
                                } else {
                                    IV0 iv0 = C62639OiB.LIZIZ;
                                    if (!iv0.containsKey((Object) filePath)) {
                                        iv0.put(filePath, Long.valueOf(System.currentTimeMillis()));
                                        AbstractC62641OiD abstractC62641OiD = C62639OiB.LJ;
                                        if (abstractC62641OiD != null) {
                                            z = abstractC62641OiD.onShot(filePath);
                                        } else {
                                            z = false;
                                        }
                                        Iterator<WeakReference<AbstractC62641OiD>> it = C62639OiB.LJFF.iterator();
                                        while (it.hasNext()) {
                                            AbstractC62641OiD abstractC62641OiD2 = it.next().get();
                                            if (abstractC62641OiD2 != null) {
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("image is screen shot, screenShotListenerRefs element = ");
                                                LIZ.append(abstractC62641OiD2);
                                                C62657OiT.LIZIZ(X1D.LIZIZ(LIZ));
                                                if (abstractC62641OiD2.getNeedDispatchIfHandledAlready() || !z) {
                                                    if (abstractC62641OiD2.onShot(filePath) || z) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                }
                                            }
                                        }
                                        AbstractC62641OiD abstractC62641OiD3 = C62639OiB.LJ;
                                        if (abstractC62641OiD3 != null) {
                                            map = abstractC62641OiD3.mobExtalParams();
                                        } else {
                                            map = null;
                                        }
                                        FMX.LJIIL("screen_shot", map);
                                    }
                                }
                            }
                        } else {
                            i4++;
                        }
                    }
                }
                StringBuilder LJ2 = AnonymousClass028.LJ("Media content changed, but not screenshot: \n  path = ", filePath, "; \n  size = ", i, " * ");
                V10.LJFF(LJ2, i2, "; \n  dateAdded = ", j3);
                C62657OiT.LIZIZ(X1D.LIZIZ(LJ2));
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
