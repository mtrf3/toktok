package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39305Fbh implements InterfaceC39320Fbw {
    public final String LIZ = "com.orange.update.provider.attributionprovider";
    public final String LIZIZ = "virtualpreload";
    public final String LIZJ = "appcenterstore";
    public final String LIZLLL = "orange_int";
    public final String LJ = "preinstalled_version";
    public final String LJFF = "is_virtual_preload";
    public final Context LJI;

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    public C39305Fbh(Context context) {
        this.LJI = context;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        Cursor query;
        String preinstalledVersion;
        o.LJIIIZ(preInstallResult, "preInstallResult");
        C39310Fbm c39310Fbm = preInstallResult.LIZ;
        ContentResolver contentResolver = this.LJI.getContentResolver();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("content://");
        LIZ.append(this.LIZ);
        LIZ.append("/");
        LIZ.append(this.LJI.getPackageName());
        android.net.Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ));
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{parse, null, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "-634286254461572448"));
        if (LIZJ.LIZ) {
            query = (Cursor) LIZJ.LIZIZ;
        } else {
            query = contentResolver.query(parse, null, null, null, null, null);
        }
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    while (query.moveToNext()) {
                        int columnIndex = query.getColumnIndex(this.LJ);
                        String str = "";
                        if (columnIndex < 0) {
                            preinstalledVersion = "";
                        } else {
                            preinstalledVersion = query.getString(columnIndex);
                        }
                        int columnIndex2 = query.getColumnIndex(this.LJFF);
                        if (columnIndex2 >= 0) {
                            if (query.getInt(columnIndex2) == 1) {
                                str = this.LIZIZ;
                            } else {
                                str = this.LIZJ;
                            }
                        }
                        c39310Fbm.LJLLILLLL = 7;
                        o.LJIIIZ(str, "<set-?>");
                        c39310Fbm.LJLILLLLZI = str;
                        o.LJIIIIZZ(preinstalledVersion, "preinstalledVersion");
                        c39310Fbm.LJLJJI = preinstalledVersion;
                        String str2 = this.LIZLLL;
                        o.LJIIIZ(str2, "<set-?>");
                        c39310Fbm.LJLIL = str2;
                        c39310Fbm.LJLLI = false;
                        preInstallResult.LJ = true;
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                query.close();
                throw th;
            }
            query.close();
        }
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        LLLLIIIILLL.getId();
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        Thread thread = LLJJJJ.getThread();
        o.LJIIIIZZ(thread, "Looper.getMainLooper().thread");
        thread.getId();
        return preInstallResult;
    }
}
