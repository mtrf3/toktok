package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Process;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.legoImp.task.appkiller.RestartApplicationService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes7.dex */
public final class FK6 extends PthreadThread {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ RestartApplicationService LJLILLLLZI;

    public static Cursor LJ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-5258091665499186446"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, null, null, null);
    }

    public final void LIZLLL() {
        try {
            Process.killProcess(this.LJLIL);
            Thread.sleep(2000L);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(FKM.LIZ().getPackageName());
            LIZ.append(".RestartContentProvider");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("content://");
            LIZ2.append(LIZIZ);
            LIZ2.append("/");
            Cursor LJ = LJ(this.LJLILLLLZI.getContentResolver(), UriProtector.parse(X1D.LIZIZ(LIZ2)), new String[0]);
            if (LJ != null) {
                LJ.close();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FK6(RestartApplicationService restartApplicationService, int i) {
        super("RestartApplicationService$1");
        this.LJLILLLLZI = restartApplicationService;
        this.LJLIL = i;
    }
}
