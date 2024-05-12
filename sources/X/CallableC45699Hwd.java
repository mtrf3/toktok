package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: X.Hwd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45699Hwd<V> implements Callable {
    public final /* synthetic */ C68322mC<Cursor> LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ android.net.Uri LJLJI;

    public CallableC45699Hwd(C68322mC<Cursor> c68322mC, Context context, android.net.Uri uri) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = context;
        this.LJLJI = uri;
    }

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, "date_modified desc limit 1"}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "3216750197766995225"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, null, null, "date_modified desc limit 1");
    }

    public static Cursor LIZIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, Bundle bundle) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, bundle, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "3216750197766995225"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, bundle, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        T t;
        try {
            C68322mC<Cursor> c68322mC = this.LJLIL;
            if (Build.VERSION.SDK_INT >= 29) {
                Bundle bundle = new Bundle();
                bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_modified"});
                bundle.putInt("android:query-arg-sort-direction", 1);
                bundle.putInt("android:query-arg-limit", 1);
                t = LIZIZ(this.LJLILLLLZI.getContentResolver(), this.LJLJI, C62639OiB.LIZJ, bundle);
            } else {
                t = LIZ(this.LJLILLLLZI.getContentResolver(), this.LJLJI, C62639OiB.LIZJ);
            }
            c68322mC.element = t;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }
}
