package X;

import android.content.ContentResolver;
import android.database.Cursor;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FK1 implements FK4 {
    public boolean LIZ;
    public final ContentResolver LIZIZ;
    public final android.net.Uri LIZJ;
    public final Cert LIZLLL;

    @Override // X.FK4
    public final Cursor LIZ(String str, String[] strArr, String[] strArr2) {
        if (this.LIZ) {
            this.LIZ = false;
            FK3 fk3 = FK0.LIZ;
            ContentResolver query = this.LIZIZ;
            android.net.Uri uri = this.LIZJ;
            Cert cert = this.LIZLLL;
            fk3.getClass();
            o.LJIIJ(query, "$this$query");
            o.LJIIJ(uri, "uri");
            OHW LJ = C17J.LJ(cert, new String[]{FK3.LIZ(uri)});
            C78929UyL.LIZIZ(LJ, "android/content/ContentResolver", "query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", C113554cx.LJJL(new OSZ("uri", uri), new OSZ("projection", strArr), new OSZ("selection", str), new OSZ("selectionArgs", strArr2), new OSZ("sortOrder", "sort_key")));
            return (Cursor) C39207Fa7.LIZ(LJ, new FK2(query, uri, strArr, str, strArr2));
        }
        throw new Q0C(-1, "contentResolver handler state illegal: can not be reused");
    }

    public FK1(ContentResolver contentResolver, android.net.Uri uri, String authority, Cert cert) {
        o.LJIIJ(contentResolver, "contentResolver");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(authority, "authority");
        this.LIZIZ = contentResolver;
        this.LIZJ = uri;
        this.LIZLLL = cert;
        this.LIZ = true;
    }
}
