package X;

import android.content.ContentResolver;
import android.database.Cursor;

/* loaded from: classes7.dex */
public final class FK2 extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, Cursor> {
    public final /* synthetic */ ContentResolver LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;
    public final /* synthetic */ String[] LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String[] LJLJJL;
    public final /* synthetic */ String LJLJJLL = "sort_key";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FK2(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        super(1);
        this.LJLIL = contentResolver;
        this.LJLILLLLZI = uri;
        this.LJLJI = strArr;
        this.LJLJJI = str;
        this.LJLJJL = strArr2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, android.database.Cursor] */
    @Override // X.InterfaceC88472Yns
    public final Cursor invoke(C66300Q0i c66300Q0i) {
        ContentResolver contentResolver = this.LJLIL;
        android.net.Uri uri = this.LJLILLLLZI;
        String[] strArr = this.LJLJI;
        String str = this.LJLJJI;
        String[] strArr2 = this.LJLJJL;
        String str2 = this.LJLJJLL;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-7707592712876489610"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
