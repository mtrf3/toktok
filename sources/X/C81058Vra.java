package X;

import android.content.ContentUris;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.os.Build;
import android.provider.MediaStore;
import com.zhihu.matisse.internal.entity.Album;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Vra, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81058Vra extends C42281lI {
    public static final android.net.Uri LJIJI = MediaStore.Files.getContentUri("external");
    public static final String[] LJIJJ = {"_id", "bucket_id", "bucket_display_name", "mime_type", "uri", "count"};
    public static final String[] LJIJJLI = {"_id", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};
    public static final String[] LJIL = {"_id", "bucket_id", "bucket_display_name", "mime_type"};
    public static final String[] LJJ = {String.valueOf(1), String.valueOf(3)};

    @Override // X.C0ZP
    public final void LJ() {
    }

    @Override // X.C1PE
    public final Cursor LJIIJ() {
        android.net.Uri uri;
        int i;
        long valueOf;
        android.net.Uri uri2;
        int i2;
        Cursor LJIILIIL = super.LJIILIIL();
        String[] strArr = LJIJJ;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        String str = null;
        if (Build.VERSION.SDK_INT < 29) {
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            if (LJIILIIL != null) {
                i2 = 0;
                while (LJIILIIL.moveToNext()) {
                    long j = LJIILIIL.getLong(LJIILIIL.getColumnIndex("_id"));
                    long j2 = LJIILIIL.getLong(LJIILIIL.getColumnIndex("bucket_id"));
                    String string = LJIILIIL.getString(LJIILIIL.getColumnIndex("bucket_display_name"));
                    String string2 = LJIILIIL.getString(LJIILIIL.getColumnIndex("mime_type"));
                    android.net.Uri LJIILJJIL = LJIILJJIL(LJIILIIL);
                    int i3 = LJIILIIL.getInt(LJIILIIL.getColumnIndex("count"));
                    matrixCursor2.addRow(new String[]{Long.toString(j), Long.toString(j2), string, string2, LJIILJJIL.toString(), String.valueOf(i3)});
                    i2 += i3;
                }
                if (LJIILIIL.moveToFirst()) {
                    uri2 = LJIILJJIL(LJIILIIL);
                } else {
                    uri2 = null;
                }
            } else {
                uri2 = null;
                i2 = 0;
            }
            String[] strArr2 = new String[6];
            String str2 = Album.ALBUM_ID_ALL;
            strArr2[0] = str2;
            strArr2[1] = str2;
            strArr2[2] = "All";
            strArr2[3] = null;
            if (uri2 != null) {
                str = uri2.toString();
            }
            strArr2[4] = str;
            strArr2[5] = String.valueOf(i2);
            matrixCursor.addRow(strArr2);
            return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor2});
        }
        HashMap hashMap = new HashMap();
        if (LJIILIIL != null) {
            while (LJIILIIL.moveToNext()) {
                long j3 = LJIILIIL.getLong(LJIILIIL.getColumnIndex("bucket_id"));
                Long l = (Long) hashMap.get(Long.valueOf(j3));
                if (l == null) {
                    valueOf = 1L;
                } else {
                    valueOf = Long.valueOf(l.longValue() + 1);
                }
                hashMap.put(Long.valueOf(j3), valueOf);
            }
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(LJIJJ);
        if (LJIILIIL != null && LJIILIIL.moveToFirst()) {
            uri = LJIILJJIL(LJIILIIL);
            HashSet hashSet = new HashSet();
            i = 0;
            do {
                long j4 = LJIILIIL.getLong(LJIILIIL.getColumnIndex("bucket_id"));
                if (!hashSet.contains(Long.valueOf(j4))) {
                    long j5 = LJIILIIL.getLong(LJIILIIL.getColumnIndex("_id"));
                    String string3 = LJIILIIL.getString(LJIILIIL.getColumnIndex("bucket_display_name"));
                    String string4 = LJIILIIL.getString(LJIILIIL.getColumnIndex("mime_type"));
                    android.net.Uri LJIILJJIL2 = LJIILJJIL(LJIILIIL);
                    long longValue = ((Long) hashMap.get(Long.valueOf(j4))).longValue();
                    matrixCursor3.addRow(new String[]{Long.toString(j5), Long.toString(j4), string3, string4, LJIILJJIL2.toString(), String.valueOf(longValue)});
                    hashSet.add(Long.valueOf(j4));
                    i = (int) (i + longValue);
                }
            } while (LJIILIIL.moveToNext());
        } else {
            uri = null;
            i = 0;
        }
        String[] strArr3 = new String[6];
        String str3 = Album.ALBUM_ID_ALL;
        strArr3[0] = str3;
        strArr3[1] = str3;
        strArr3[2] = "All";
        strArr3[3] = null;
        if (uri != null) {
            str = uri.toString();
        }
        strArr3[4] = str;
        strArr3[5] = String.valueOf(i);
        matrixCursor.addRow(strArr3);
        return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor3});
    }

    public static android.net.Uri LJIILJJIL(Cursor cursor) {
        android.net.Uri contentUri;
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        if (EnumC81057VrZ.isImage(string)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (EnumC81057VrZ.isVideo(string)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81058Vra(android.content.Context r7, java.lang.String r8, java.lang.String[] r9) {
        /*
            r6 = this;
            android.net.Uri r2 = X.C81058Vra.LJIJI
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L12
            java.lang.String[] r3 = X.C81058Vra.LJIJJLI
        La:
            r1 = r7
            r0 = r6
            r5 = r9
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L12:
            java.lang.String[] r3 = X.C81058Vra.LJIL
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81058Vra.<init>(android.content.Context, java.lang.String, java.lang.String[]):void");
    }
}
