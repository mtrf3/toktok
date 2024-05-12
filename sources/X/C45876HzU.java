package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HzU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45876HzU {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[Catch: IOException -> 0x0110, TRY_ENTER, TryCatch #6 {IOException -> 0x0110, blocks: (B:43:0x00bf, B:44:0x00c2, B:46:0x00c7, B:48:0x00cc, B:55:0x00fe, B:57:0x0103, B:59:0x0108, B:61:0x010d), top: B:29:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103 A[Catch: IOException -> 0x0110, TryCatch #6 {IOException -> 0x0110, blocks: (B:43:0x00bf, B:44:0x00c2, B:46:0x00c7, B:48:0x00cc, B:55:0x00fe, B:57:0x0103, B:59:0x0108, B:61:0x010d), top: B:29:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108 A[Catch: IOException -> 0x0110, TryCatch #6 {IOException -> 0x0110, blocks: (B:43:0x00bf, B:44:0x00c2, B:46:0x00c7, B:48:0x00cc, B:55:0x00fe, B:57:0x0103, B:59:0x0108, B:61:0x010d), top: B:29:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d A[Catch: IOException -> 0x0110, TRY_LEAVE, TryCatch #6 {IOException -> 0x0110, blocks: (B:43:0x00bf, B:44:0x00c2, B:46:0x00c7, B:48:0x00cc, B:55:0x00fe, B:57:0x0103, B:59:0x0108, B:61:0x010d), top: B:29:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6 A[Catch: IOException -> 0x00f3, TryCatch #1 {IOException -> 0x00f3, blocks: (B:76:0x00e1, B:67:0x00e6, B:69:0x00eb, B:71:0x00f0), top: B:75:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb A[Catch: IOException -> 0x00f3, TryCatch #1 {IOException -> 0x00f3, blocks: (B:76:0x00e1, B:67:0x00e6, B:69:0x00eb, B:71:0x00f0), top: B:75:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0 A[Catch: IOException -> 0x00f3, TRY_LEAVE, TryCatch #1 {IOException -> 0x00f3, blocks: (B:76:0x00e1, B:67:0x00e6, B:69:0x00eb, B:71:0x00f0), top: B:75:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45876HzU.LIZIZ(java.lang.String):java.lang.String");
    }

    public static android.net.Uri LIZJ(android.net.Uri uri) {
        android.net.Uri uri2;
        String documentId = DocumentsContract.getDocumentId(uri);
        o.LJIIIIZZ(documentId, "getDocumentId(uri)");
        List LJLJJL = s.LJLJJL(documentId, new String[]{":"}, 0, 6);
        String str = (String) ListProtector.get(LJLJJL, 0);
        if (TextUtils.equals("image", str)) {
            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (C00T.LIZLLL()) {
                uri2 = MediaStore.Images.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals("video", str)) {
            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            if (C00T.LIZLLL()) {
                uri2 = MediaStore.Video.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals("audio", str)) {
            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            if (C00T.LIZLLL()) {
                uri2 = MediaStore.Audio.Media.getContentUri("external_primary");
            }
        } else {
            uri2 = null;
        }
        if (TextUtils.isEmpty((CharSequence) ListProtector.get(LJLJJL, 1))) {
            return null;
        }
        o.LJI(uri2);
        return ContentUris.withAppendedId(uri2, CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 1)));
    }

    public static Long LIZ(Context context, android.net.Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
            uri = LIZJ(uri);
            if (uri == null) {
                return null;
            }
        } else if (!TextUtils.equals("media", uri.getAuthority())) {
            return Long.valueOf(new File(C00S.LIZIZ(context, uri)).length());
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null || (openFileDescriptor = contentResolver.openFileDescriptor(uri, "r")) == null) {
            return null;
        }
        return Long.valueOf(openFileDescriptor.getStatSize());
    }
}
