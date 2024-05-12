package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* renamed from: X.Vwu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81388Vwu extends AbstractC81781W7t implements W70<W8X> {
    public static final Class<?> LIZLLL = C81388Vwu.class;
    public static final String[] LJ = {"_id", "_data"};
    public static final String[] LJFF = {"_data"};
    public static final Rect LJI = new Rect(0, 0, 512, 384);
    public static final Rect LJII = new Rect(0, 0, 96, 96);
    public final ContentResolver LIZJ;

    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public static int LJI(C79238V7y c79238V7y) {
        Rect rect = LJII;
        if (C78926UyI.LJJIIZI(rect.width(), rect.height(), c79238V7y)) {
            return 3;
        }
        Rect rect2 = LJI;
        if (C78926UyI.LJJIIZI(rect2.width(), rect2.height(), c79238V7y)) {
            return 1;
        }
        return 0;
    }

    @Override // X.W70
    public final boolean LIZ(C79238V7y c79238V7y) {
        Rect rect = LJI;
        return C78926UyI.LJJIIZI(rect.width(), rect.height(), c79238V7y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r3 != 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.Vwu, X.W7t] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bb -> B:17:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bd -> B:17:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00af -> B:17:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a3 -> B:17:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c3 -> B:17:0x001d). Please report as a decompilation issue!!! */
    @Override // X.AbstractC81781W7t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.W8X LIZLLL(X.W5O r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81388Vwu.LIZLLL(X.W5O):X.W8X");
    }

    public final W8X LJFF(int i, C79238V7y c79238V7y) {
        int length;
        int LJI2 = LJI(c79238V7y);
        if (LJI2 == 0) {
            return null;
        }
        try {
            Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.LIZJ, i, LJI2, LJFF);
            if (queryMiniThumbnail == null) {
                return null;
            }
            try {
                queryMiniThumbnail.moveToFirst();
                if (queryMiniThumbnail.getCount() > 0) {
                    String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        FileInputStream fileInputStream = new FileInputStream(string);
                        if (string == null) {
                            length = -1;
                        } else {
                            length = (int) new File(string).length();
                        }
                        W8X LIZJ = LIZJ(fileInputStream, length);
                        queryMiniThumbnail.close();
                        return LIZJ;
                    }
                }
                queryMiniThumbnail.close();
                return null;
            } catch (Throwable th) {
                queryMiniThumbnail.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C81388Vwu(Executor executor, W84 w84, ContentResolver contentResolver) {
        super(executor, w84);
        this.LIZJ = contentResolver;
    }
}
