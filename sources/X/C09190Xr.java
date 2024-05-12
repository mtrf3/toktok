package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.0Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09190Xr {
    public static Context LIZ;
    public static Keva LIZIZ;
    public static final C09570Zd LIZJ = new C09570Zd(new C09560Zc(EnumC09550Zb.SINGLE_PROCESS, null, null, null, C32661Py.LIZ));

    public static final void LIZ(String str) {
        Keva repo = Keva.getRepo("kevaUser");
        o.LJIIIIZZ(repo, "getRepo(ALL_USER_REPO)");
        LIZIZ = repo;
        if (str == null) {
            repo.storeBoolean("unlogin", true);
        } else {
            repo.storeBoolean(str, true);
        }
    }

    public static final void LIZIZ(String str) {
        Context context = LIZ;
        if (context != null) {
            File[] listFiles = new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), str).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        String name = file.getName();
                        if (new File(file.getAbsolutePath(), i0.LJFF(name, ".lxi")).exists()) {
                            Keva.getRepoWithPath(name, str, 1, false).clear();
                        } else {
                            Keva.getRepoWithPath(name, str, 0, false).clear();
                        }
                    }
                }
                return;
            }
            return;
        }
        o.LJIJI("kvStorageContext");
        throw null;
    }
}
