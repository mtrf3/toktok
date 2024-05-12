package X;

import android.content.ContentResolver;
import android.database.Cursor;
import kotlin.jvm.internal.AqS13S1400000_6;

/* renamed from: X.FJz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38783FJz {
    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, C78862UxG c78862UxG, C37328Eku c37328Eku) {
        FK0.LIZ.getClass();
        OHW LJ = C17J.LJ(c78862UxG, new String[]{FK3.LIZ(uri)});
        LJ.LIZ.put("isPreCheck", Boolean.TRUE);
        return (Cursor) C39207Fa7.LIZ(LJ, new AqS13S1400000_6(contentResolver, uri, "", c78862UxG, c37328Eku, 1));
    }
}
