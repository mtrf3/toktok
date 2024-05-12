package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class JFI extends JFG {
    public final Context LIZIZ;
    public final SharedPreferences LIZJ;
    public final QIF LIZLLL;

    @Override // X.JFG, X.InterfaceC66819QKh
    public final String LIZ(String str) {
        return LJ(str).getString(str, null);
    }

    @Override // X.JFG
    public final void LIZLLL(List<String> list) {
        if (list == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                SharedPreferences LJ = LJ(str);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(LJ);
                if (editor == null) {
                    editor = LJ(str).edit();
                    hashMap.put(LJ, editor);
                }
                if (LJ != null && LJ.contains(str)) {
                    editor.remove(str);
                }
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) ((Map.Entry) it.next()).getValue()).apply();
        }
        super.LIZLLL(list);
    }

    public final SharedPreferences LJ(String str) {
        if ("device_id".equals(str) || "install_id".equals(str) || "bd_did".equals(str)) {
            return this.LIZJ;
        }
        return C48847JFb.LIZ(this.LIZIZ, this.LIZLLL);
    }

    @Override // X.JFG, X.InterfaceC66819QKh
    public final void LIZJ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = LJ(str).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public JFI(Context context, SharedPreferences sharedPreferences, QIF qif) {
        if (context != null) {
            this.LIZIZ = context;
            this.LIZJ = sharedPreferences;
            this.LIZLLL = qif;
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }
}
