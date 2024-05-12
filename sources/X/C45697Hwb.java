package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import bytedance.io.BdMediaItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.BdMediaItemCompat;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hwb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45697Hwb {
    public static boolean LIZ;

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "7313652660684965548"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
    }

    public static C45687HwR LJ(C1A7 c1a7, int i, int i2) {
        String str;
        if (c1a7 != null) {
            c1a7.getClass();
        }
        String str2 = null;
        if (c1a7 != null) {
            str = null;
            c1a7.getClass();
            c1a7.getClass();
            c1a7.getClass();
        } else {
            str = null;
        }
        long j = -1;
        if (c1a7 != null) {
            c1a7.getClass();
            j = 0;
            c1a7.getClass();
        }
        String LJFF = i0.LJFF("date_modified ", "DESC");
        StringBuilder LJ = C7MY.LJ(" LIMIT ", i2, " OFFSET ");
        LJ.append(i * i2);
        String LIZIZ = X1D.LIZIZ(LJ);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(null)) {
            arrayList.add("%" + ((String) null) + '%');
            str = "_data like ?";
        }
        if (j > 0) {
            if (str != null) {
                str = C78866UxK.LJIILJJIL(str, "date_modified >= ?");
            } else {
                str = null;
            }
            arrayList.add(String.valueOf(j));
        }
        if (j > 0) {
            if (str != null) {
                str2 = C78866UxK.LJIILJJIL(str, "date_modified <= ?");
            }
            arrayList.add(String.valueOf(j));
            str = str2;
        }
        C45687HwR c45687HwR = new C45687HwR();
        o.LJIIIZ(LJFF, "<set-?>");
        c45687HwR.LIZ = LJFF;
        o.LJIIIZ(LIZIZ, "<set-?>");
        c45687HwR.LIZIZ = LIZIZ;
        c45687HwR.LIZJ = str;
        c45687HwR.LIZLLL = arrayList;
        return c45687HwR;
    }

    public static List LIZJ(Context context, String str, String str2, String[] strArr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = LIZ(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "mime_type", "_size", "_data", "date_modified", "width", "height"}, str, strArr, str2);
            if (cursor == null) {
                return arrayList;
            }
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                String filePath = cursor.getString(1);
                long j2 = cursor.getLong(2);
                String string = cursor.getString(3);
                long j3 = cursor.getLong(4);
                String string2 = cursor.getString(5);
                long j4 = cursor.getInt(6);
                int i = cursor.getInt(7);
                int i2 = cursor.getInt(8);
                if (j3 > 0) {
                    MediaModel mediaModel = new MediaModel(j);
                    mediaModel.fileLocalUriPath = filePath;
                    mediaModel.relativePath = filePath;
                    mediaModel.date = j2;
                    mediaModel.fileSize = j3;
                    mediaModel.thumbnail = string2;
                    mediaModel.modify = j4;
                    if (LIZ) {
                        mediaModel.width = i;
                        mediaModel.height = i2;
                    }
                    String str3 = "";
                    try {
                        o.LJIIIIZZ(filePath, "filePath");
                        String str4 = File.separator;
                        o.LJIIIIZZ(str4, "File.separator");
                        List<String> split = new OJD(str4).split(filePath, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str5 : split) {
                            if (str5.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(str5);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            str3 = (String) arrayList2.get(arrayList2.size() - 1);
                        }
                    } catch (Exception unused) {
                    }
                    mediaModel.albumClass = str3;
                    if (string != null && s.LJJJLZIJ(string, "gif", false)) {
                        mediaModel.type = 2;
                    } else {
                        mediaModel.type = 1;
                        if (!LIZ || mediaModel.width <= 0 || mediaModel.height <= 0) {
                            o.LJIIIIZZ(filePath, "filePath");
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            C44694HgQ.LIZLLL(filePath, options);
                            Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                            Object obj = pair.first;
                            o.LJIIIIZZ(obj, "size.first");
                            mediaModel.width = ((Number) obj).intValue();
                            Object obj2 = pair.second;
                            o.LJIIIIZZ(obj2, "size.second");
                            mediaModel.height = ((Number) obj2).intValue();
                        }
                    }
                    arrayList.add(mediaModel);
                }
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static List LJI(Context context, String str, String str2, String[] strArr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = LIZ(context.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "mime_type", "duration", "_size", "_data", "width", "height"}, str, strArr, str2);
            if (cursor == null) {
                return arrayList;
            }
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                String filePath = cursor.getString(1);
                long j2 = cursor.getLong(2);
                String string = cursor.getString(3);
                long j3 = cursor.getLong(4);
                long j4 = cursor.getLong(5);
                String string2 = cursor.getString(6);
                int i = cursor.getInt(7);
                int i2 = cursor.getInt(8);
                if (!TextUtils.isEmpty(filePath) && j3 > 0 && j4 > 0) {
                    MediaModel mediaModel = new MediaModel(j);
                    mediaModel.fileLocalUriPath = filePath;
                    mediaModel.relativePath = filePath;
                    mediaModel.date = j2;
                    mediaModel.mimeType = string;
                    mediaModel.duration = j3;
                    mediaModel.fileSize = j4;
                    mediaModel.type = 4;
                    mediaModel.thumbnail = string2;
                    mediaModel.width = i;
                    mediaModel.height = i2;
                    String str3 = "";
                    try {
                        o.LJIIIIZZ(filePath, "filePath");
                        String str4 = File.separator;
                        o.LJIIIIZZ(str4, "File.separator");
                        List<String> split = new OJD(str4).split(filePath, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str5 : split) {
                            if (str5.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(str5);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            str3 = (String) arrayList2.get(arrayList2.size() - 1);
                        }
                    } catch (Exception unused) {
                    }
                    mediaModel.albumClass = str3;
                    arrayList.add(mediaModel);
                }
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final List<MediaModel> LIZIZ(Context context, boolean z, int i, int i2, C1A7 c1a7) {
        List<MediaModel> LIZJ;
        boolean z2;
        o.LJIIIZ(context, "context");
        C45687HwR LJ = LJ(c1a7, i2, i);
        String[] strArr = null;
        if (!z) {
            String str = LJ.LIZJ;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str2 = "mime_type not like ?";
            if (!z2) {
                String str3 = LJ.LIZJ;
                if (str3 != null) {
                    str2 = C78866UxK.LJIILJJIL(str3, "mime_type not like ?");
                } else {
                    str2 = null;
                }
            }
            LJ.LIZJ = str2;
            LJ.LIZLLL.add("%gif%");
        }
        if (LJ.LIZLLL.size() > 0) {
            Object[] array = LJ.LIZLLL.toArray(new String[0]);
            if (array != null) {
                strArr = (String[]) array;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        if (i <= 0) {
            if (C44694HgQ.LJJ()) {
                LIZJ = LIZLLL(context, LJ.LIZJ, strArr, LJ.LIZ, -1, -1);
            } else {
                LIZJ = LIZJ(context, LJ.LIZJ, LJ.LIZ, strArr);
            }
        } else if (C44694HgQ.LJJ()) {
            LIZJ = LIZLLL(context, LJ.LIZJ, strArr, LJ.LIZ, i, i2 * i);
        } else {
            String str4 = LJ.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJ.LIZ);
            LIZ2.append(LJ.LIZIZ);
            LIZJ = LIZJ(context, str4, X1D.LIZIZ(LIZ2), strArr);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("FileAdapterAndroidR image media list:");
        LIZ3.append(LIZJ.size());
        LIZ3.append(",");
        LIZ3.append(C44694HgQ.LJJ());
        LIZ3.append(", trace:");
        LIZ3.append(android.util.Log.getStackTraceString(new Throwable()));
        String LIZIZ = X1D.LIZIZ(LIZ3);
        InterfaceC44698HgU interfaceC44698HgU = C44694HgQ.LIZJ;
        if (interfaceC44698HgU != null) {
            interfaceC44698HgU.LIZIZ(-2, LIZIZ);
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(android.content.Context r27, java.lang.String r28, java.lang.String[] r29, java.lang.String r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45697Hwb.LIZLLL(android.content.Context, java.lang.String, java.lang.String[], java.lang.String, int, int):java.util.List");
    }

    public static List LJFF(Context context, String str, String[] strArr, String str2, int i, int i2) {
        boolean z;
        ArrayList arrayList;
        Cursor cursor;
        boolean z2;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int i3;
        int i4;
        int columnIndexOrThrow12;
        int length;
        String str3;
        ArrayList arrayList2;
        boolean z3;
        boolean z4;
        Cursor cursor2;
        boolean z5;
        int i5;
        String sortOrder = str2;
        ArrayList arrayList3 = new ArrayList();
        InterfaceC44699HgV interfaceC44699HgV = C44694HgQ.LIZLLL;
        if (interfaceC44699HgV != null) {
            z = interfaceC44699HgV.LIZ();
        } else {
            z = false;
        }
        if (z) {
            o.LJIIIZ(sortOrder, "sortOrder");
            arrayList = new ArrayList();
            android.net.Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String[] strArr2 = C45698Hwc.LIZ;
                if (z5) {
                    cursor2 = C45698Hwc.LIZ(context.getContentResolver(), uri, strArr2, C00T.LIZJ(i, i2, str, null, strArr));
                } else if (C00T.LIZLLL()) {
                    if (i > 0) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(" LIMIT ");
                        LIZ2.append(i);
                        LIZ2.append(" OFFSET ");
                        LIZ2.append(i2);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(sortOrder);
                        LIZ3.append(LIZIZ);
                        sortOrder = X1D.LIZIZ(LIZ3);
                    }
                    cursor2 = C45698Hwc.LIZIZ(context.getContentResolver(), uri, strArr2, str, strArr, sortOrder);
                } else {
                    if (i > 0) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(" LIMIT ");
                        LIZ4.append(i);
                        LIZ4.append(" OFFSET ");
                        LIZ4.append(i2);
                        String LIZIZ2 = X1D.LIZIZ(LIZ4);
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(sortOrder);
                        LIZ5.append(LIZIZ2);
                        sortOrder = X1D.LIZIZ(LIZ5);
                    }
                    cursor2 = C45698Hwc.LIZIZ(context.getContentResolver(), uri, C45698Hwc.LIZIZ, str, strArr, sortOrder);
                }
                if (cursor2 != null) {
                    try {
                        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("_id");
                        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("_display_name");
                        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("date_modified");
                        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("date_added");
                        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("mime_type");
                        int columnIndexOrThrow18 = cursor2.getColumnIndexOrThrow("_size");
                        int columnIndexOrThrow19 = cursor2.getColumnIndexOrThrow("width");
                        int columnIndexOrThrow20 = cursor2.getColumnIndexOrThrow("height");
                        int columnIndexOrThrow21 = cursor2.getColumnIndexOrThrow("duration");
                        int columnIndexOrThrow22 = cursor2.getColumnIndexOrThrow("datetaken");
                        int columnIndexOrThrow23 = cursor2.getColumnIndexOrThrow("resolution");
                        if (C00T.LIZLLL()) {
                            i5 = cursor2.getColumnIndexOrThrow("relative_path");
                        } else {
                            i5 = -1;
                        }
                        int columnIndexOrThrow24 = cursor2.getColumnIndexOrThrow("_data");
                        StringBuilder LIZ6 = X1D.LIZ();
                        File LLLLLLLLLL = C16880lQ.LLLLLLLLLL();
                        o.LJIIIIZZ(LLLLLLLLLL, "Environment.getExternalStorageDirectory()");
                        LIZ6.append(LLLLLLLLLL.getPath());
                        LIZ6.append("/");
                        int length2 = X1D.LIZIZ(LIZ6).length();
                        while (cursor2.moveToNext()) {
                            BdMediaItemCompat bdMediaItemCompat = new BdMediaItemCompat(0);
                            long j = cursor2.getLong(columnIndexOrThrow13);
                            bdMediaItemCompat.id = j;
                            bdMediaItemCompat.name = cursor2.getString(columnIndexOrThrow14);
                            bdMediaItemCompat.modify = cursor2.getLong(columnIndexOrThrow15);
                            bdMediaItemCompat.dateAdded = cursor2.getLong(columnIndexOrThrow16);
                            bdMediaItemCompat.mimeType = cursor2.getString(columnIndexOrThrow17);
                            bdMediaItemCompat.fileSize = cursor2.getLong(columnIndexOrThrow18);
                            bdMediaItemCompat.width = cursor2.getInt(columnIndexOrThrow19);
                            bdMediaItemCompat.height = cursor2.getInt(columnIndexOrThrow20);
                            bdMediaItemCompat.duration = cursor2.getLong(columnIndexOrThrow21);
                            bdMediaItemCompat.dateToken = cursor2.getLong(columnIndexOrThrow22);
                            bdMediaItemCompat.resolution = cursor2.getString(columnIndexOrThrow23);
                            String absolutePath = cursor2.getString(columnIndexOrThrow24);
                            bdMediaItemCompat.absolutePath = absolutePath;
                            if (C00T.LIZLLL()) {
                                bdMediaItemCompat.relativePath = cursor2.getString(i5);
                            } else {
                                o.LJIIIIZZ(absolutePath, "absolutePath");
                                String str4 = File.separator;
                                o.LJIIIIZZ(str4, "File.separator");
                                try {
                                    String substring = absolutePath.substring(length2, s.LJJLIIJ(absolutePath, str4, 6));
                                    o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append(substring);
                                    LIZ7.append(str4);
                                    bdMediaItemCompat.relativePath = X1D.LIZIZ(LIZ7);
                                } catch (IndexOutOfBoundsException unused) {
                                    bdMediaItemCompat.relativePath = "";
                                }
                            }
                            bdMediaItemCompat.uri = ContentUris.withAppendedId(uri, j);
                            arrayList.add(bdMediaItemCompat);
                        }
                        cursor2.close();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = null;
            }
        } else {
            z = false;
            arrayList = new ArrayList();
            android.net.Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String[] strArr3 = C268613q.LIZJ;
                if (z2) {
                    cursor = C268613q.LIZ(context.getContentResolver(), uri2, strArr3, C00T.LIZJ(i, i2, str, sortOrder, strArr));
                } else if (C00T.LIZLLL()) {
                    if (i > 0) {
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append(" LIMIT ");
                        LIZ8.append(i);
                        LIZ8.append(" OFFSET ");
                        LIZ8.append(i2);
                        String LIZIZ3 = X1D.LIZIZ(LIZ8);
                        StringBuilder LIZ9 = X1D.LIZ();
                        LIZ9.append(sortOrder);
                        LIZ9.append(LIZIZ3);
                        sortOrder = X1D.LIZIZ(LIZ9);
                    }
                    cursor = C268613q.LIZIZ(context.getContentResolver(), uri2, strArr3, str, strArr, sortOrder);
                } else {
                    if (i > 0) {
                        StringBuilder LIZ10 = X1D.LIZ();
                        LIZ10.append(" LIMIT ");
                        LIZ10.append(i);
                        LIZ10.append(" OFFSET ");
                        LIZ10.append(i2);
                        String LIZIZ4 = X1D.LIZIZ(LIZ10);
                        StringBuilder LIZ11 = X1D.LIZ();
                        LIZ11.append(sortOrder);
                        LIZ11.append(LIZIZ4);
                        sortOrder = X1D.LIZIZ(LIZ11);
                    }
                    cursor = C268613q.LIZIZ(context.getContentResolver(), uri2, C268613q.LIZLLL, str, strArr, sortOrder);
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            if (cursor != null) {
                try {
                    columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                    columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_display_name");
                    columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("date_modified");
                    columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("date_added");
                    columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("mime_type");
                    columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("_size");
                    columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("width");
                    columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("height");
                    columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("duration");
                    columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("datetaken");
                    columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("resolution");
                    if (C00T.LIZLLL()) {
                        i3 = cursor.getColumnIndexOrThrow("relative_path");
                        i4 = cursor.getColumnIndexOrThrow("orientation");
                    } else {
                        i3 = -1;
                        i4 = -1;
                    }
                    columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("_data");
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append(C16880lQ.LLLLLLLLLL().getPath());
                    LIZ12.append("/");
                    length = X1D.LIZIZ(LIZ12).length();
                } catch (Throwable th4) {
                    th = th4;
                }
                while (cursor.moveToNext()) {
                    BdMediaItem bdMediaItem = new BdMediaItem();
                    long j2 = cursor.getLong(columnIndexOrThrow);
                    bdMediaItem.id = j2;
                    int i6 = cursor.getInt(columnIndexOrThrow7);
                    int i7 = cursor.getInt(columnIndexOrThrow8);
                    bdMediaItem.name = cursor.getString(columnIndexOrThrow2);
                    bdMediaItem.modify = cursor.getLong(columnIndexOrThrow3);
                    bdMediaItem.dateAdded = cursor.getLong(columnIndexOrThrow4);
                    bdMediaItem.mimeType = cursor.getString(columnIndexOrThrow5);
                    bdMediaItem.fileSize = cursor.getLong(columnIndexOrThrow6);
                    bdMediaItem.width = i6;
                    bdMediaItem.height = i7;
                    bdMediaItem.duration = cursor.getLong(columnIndexOrThrow9);
                    bdMediaItem.dateToken = cursor.getLong(columnIndexOrThrow10);
                    bdMediaItem.resolution = cursor.getString(columnIndexOrThrow11);
                    if (C00T.LIZLLL()) {
                        String string = cursor.getString(i3);
                        int i8 = cursor.getInt(i4);
                        if (string == null) {
                            String string2 = cursor.getString(columnIndexOrThrow12);
                            String str5 = File.separator;
                            int lastIndexOf = string2.lastIndexOf(str5);
                            try {
                                StringBuilder LIZ13 = X1D.LIZ();
                                LIZ13.append(string2.substring(length, lastIndexOf));
                                LIZ13.append(str5);
                                string = X1D.LIZIZ(LIZ13);
                            } catch (IndexOutOfBoundsException unused2) {
                                bdMediaItem.relativePath = "";
                            }
                        }
                        bdMediaItem.relativePath = string;
                        bdMediaItem.orientation = i8;
                        bdMediaItem.uri = ContentUris.withAppendedId(uri2, j2);
                        arrayList.add(bdMediaItem);
                    } else {
                        String string3 = cursor.getString(columnIndexOrThrow12);
                        String str6 = File.separator;
                        try {
                            String substring2 = string3.substring(length, string3.lastIndexOf(str6));
                            StringBuilder LIZ14 = X1D.LIZ();
                            LIZ14.append(substring2);
                            LIZ14.append(str6);
                            bdMediaItem.relativePath = X1D.LIZIZ(LIZ14);
                        } catch (IndexOutOfBoundsException unused3) {
                            bdMediaItem.relativePath = "";
                        }
                        bdMediaItem.uri = ContentUris.withAppendedId(uri2, j2);
                        arrayList.add(bdMediaItem);
                    }
                    th = th4;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                cursor.close();
            }
        }
        if (C78886Uxe.LJJIJ(arrayList)) {
            return arrayList3;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BdMediaItem bdMediaItem2 = (BdMediaItem) it.next();
            if (bdMediaItem2.fileSize > 0) {
                if (z && (bdMediaItem2 instanceof BdMediaItemCompat)) {
                    String str7 = ((BdMediaItemCompat) bdMediaItem2).absolutePath;
                    if (str7 == null || str7.length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        File file = new File(str7);
                        boolean exists = file.exists();
                        boolean canRead = file.canRead();
                        if (!exists || !canRead) {
                            C44694HgQ.LJIILIIL.getClass();
                            InterfaceC44698HgU interfaceC44698HgU = C44694HgQ.LIZJ;
                            if (interfaceC44698HgU != null) {
                                StringBuilder LIZLLL = C00F.LIZLLL("media ignored due to file unaccessible, exist=", exists, ", canRead=", canRead, ", media=");
                                LIZLLL.append(bdMediaItem2);
                                interfaceC44698HgU.LIZIZ(Integer.MAX_VALUE, X1D.LIZIZ(LIZLLL));
                            }
                        }
                    }
                }
                MediaModel mediaModel = new MediaModel(bdMediaItem2.id);
                mediaModel.fileLocalUriPath = bdMediaItem2.uri.toString();
                String str8 = bdMediaItem2.relativePath;
                mediaModel.relativePath = str8;
                mediaModel.fileName = bdMediaItem2.name;
                mediaModel.date = bdMediaItem2.dateAdded;
                mediaModel.fileSize = bdMediaItem2.fileSize;
                mediaModel.modify = bdMediaItem2.modify;
                mediaModel.mimeType = bdMediaItem2.mimeType;
                mediaModel.width = bdMediaItem2.width;
                mediaModel.height = bdMediaItem2.height;
                mediaModel.duration = bdMediaItem2.duration;
                mediaModel.type = 4;
                if (!TextUtils.isEmpty(str8)) {
                    try {
                        String str9 = mediaModel.relativePath;
                        o.LJIIIIZZ(str9, "mediaModel.relativePath");
                        String str10 = File.separator;
                        try {
                            o.LJIIIIZZ(str10, "File.separator");
                            List<String> split = new OJD(str10).split(str9, 0);
                            arrayList2 = new ArrayList();
                            for (String str11 : split) {
                                if (str11.length() <= 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    arrayList2.add(str11);
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            StringBuilder LIZIZ5 = C59895Nf1.LIZIZ(e, "MediaHelper ===> image ablum exception :");
                            LIZIZ5.append(C44694HgQ.LJJ());
                            LIZIZ5.append(", trace:");
                            LIZIZ5.append(android.util.Log.getStackTraceString(e));
                            String LIZIZ6 = X1D.LIZIZ(LIZIZ5);
                            InterfaceC44698HgU interfaceC44698HgU2 = C44694HgQ.LIZJ;
                            if (interfaceC44698HgU2 != null) {
                                interfaceC44698HgU2.LIZIZ(-2, LIZIZ6);
                            }
                            str3 = "";
                            mediaModel.albumClass = str3;
                            arrayList3.add(mediaModel);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (!arrayList2.isEmpty()) {
                        str3 = (String) ListProtector.get(arrayList2, arrayList2.size() - 1);
                        mediaModel.albumClass = str3;
                    }
                    str3 = "";
                    mediaModel.albumClass = str3;
                }
                arrayList3.add(mediaModel);
            }
        }
        return arrayList3;
    }
}
