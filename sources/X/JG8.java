package X;

import Y.ARunnableS5S1300000_8;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.bdinstall.BDInstallProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class JG8 {
    public static final java.util.Map<String, String> LIZJ = new ConcurrentHashMap();
    public static final java.util.Map<String, List<JGB>> LIZLLL = new ConcurrentHashMap();
    public static final JGA LJ = new JGA();
    public final Context LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public JG8(Context context) {
        this.LIZ = context;
    }

    public static JG8 LIZ(Context context) {
        return LJ.LIZIZ(context);
    }

    public final void LIZIZ(String str, String str2, JGB jgb) {
        android.net.Uri LIZ;
        if (this.LIZIZ.compareAndSet(false, true) && (LIZ = BDInstallProvider.LIZ(this.LIZ)) != null) {
            this.LIZ.getContentResolver().registerContentObserver(LIZ, true, new JG9(this, JFV.LIZIZ(JFV.LIZ(JFV.LIZLLL))));
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this) {
            java.util.Map<String, List<JGB>> map = LIZLLL;
            List list = (List) ((ConcurrentHashMap) map).get(str2);
            if (list == null) {
                list = new ArrayList();
                ((ConcurrentHashMap) map).put(str2, list);
            }
            list.add(jgb);
            java.util.Map<String, String> map2 = LIZJ;
            if (((ConcurrentHashMap) map2).containsKey(str2)) {
                String str3 = (String) ((ConcurrentHashMap) map2).get(str2);
                if (jgb != null) {
                    jgb.LIZIZ(str3, str);
                }
                return;
            }
            SharedPreferences LIZIZ = F9J.LIZIZ(this.LIZ, 0, "ug_install_op_pref");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append("_");
            LIZ2.append(str);
            String string = LIZIZ.getString(X1D.LIZIZ(LIZ2), null);
            if (!TextUtils.isEmpty(string) && jgb != null) {
                jgb.LIZIZ(string, str);
            }
        }
    }

    public final void LIZJ(String str, String str2, String str3) {
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LIZ, 0, "ug_install_op_pref").edit();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append("_");
            LIZ.append(str);
            edit.putString(X1D.LIZIZ(LIZ), str3).apply();
            android.net.Uri LIZ2 = BDInstallProvider.LIZ(this.LIZ);
            if (LIZ2 == null) {
                return;
            }
            new ARunnableS5S1300000_8(LIZ2.buildUpon().appendQueryParameter("key", str2).appendQueryParameter("aid", str).appendQueryParameter("value", str3).build(), new int[1], str, this, 4).run();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
