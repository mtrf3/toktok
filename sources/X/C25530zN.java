package X;

import android.app.Application;
import android.os.Handler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashSet;

/* renamed from: X.0zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25530zN {
    public static final StringBuilder LJI = new StringBuilder();
    public final java.util.Set<Integer> LIZ = LIZ();
    public final java.util.Set<Integer> LIZIZ = LIZ();
    public final java.util.Set<Integer> LIZJ = new HashSet();
    public final int LIZLLL = 30;
    public final int LJ = 450;
    public final Handler LJFF = new Handler(C16880lQ.LLJJJJ());

    public static java.util.Set LIZ() {
        String string;
        HashSet hashSet = new HashSet();
        Application application = C78248UnM.LJLJJI;
        if (application == null) {
            string = "";
        } else {
            C25550zP.LIZ(application);
            string = C25550zP.LIZ.getString("evil_method_SPUtils_key", null);
        }
        if (string == null) {
            return hashSet;
        }
        String[] split = string.split(",");
        try {
            for (String str : split) {
                hashSet.add(CastIntegerProtector.valueOf(str));
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }
}
