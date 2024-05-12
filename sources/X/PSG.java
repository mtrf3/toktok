package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PSG implements SharedPreferences.Editor {
    public final Object LIZ = new Object();
    public final java.util.Map<String, Object> LIZIZ = new HashMap();
    public boolean LIZJ = false;
    public final /* synthetic */ PSH LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[Catch: all -> 0x00e2, TryCatch #0 {, blocks: (B:16:0x0046, B:18:0x004a, B:20:0x0054, B:21:0x005e, B:23:0x0061, B:24:0x006d, B:26:0x0073, B:44:0x0088, B:46:0x0092, B:48:0x009c, B:51:0x00a3, B:40:0x00bf, B:31:0x00ab, B:38:0x00b6, B:59:0x00c4, B:61:0x00cd, B:62:0x00d6, B:63:0x00da), top: B:15:0x0046, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PSL LIZ() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PSG.LIZ():X.PSL");
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        List emptyList;
        try {
            emptyList = new ArrayList(((HashMap) this.LIZIZ).keySet());
        } catch (Exception unused) {
            emptyList = Collections.emptyList();
        }
        PSL LIZ = LIZ();
        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(LIZ, 131);
        synchronized (PSJ.LIZ) {
            PSJ.LIZJ.add(aRunnableS47S0100000_11);
        }
        this.LIZLLL.LIZJ(LIZ, new ARunnableS47S0100000_11(aRunnableS47S0100000_11, 132), emptyList);
        LIZIZ(LIZ);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        synchronized (this.LIZ) {
            this.LIZJ = true;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        PSL LIZ = LIZ();
        this.LIZLLL.LIZJ(LIZ, null, null);
        try {
            LIZ.LJ.await();
            LIZIZ(LIZ);
            return LIZ.LJFF;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public PSG(PSH psh) {
        this.LIZLLL = psh;
    }

    public final void LIZIZ(PSL psl) {
        List<String> list;
        if (psl.LIZJ == null || (list = psl.LIZIZ) == null || list.size() == 0) {
            return;
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            for (int size = psl.LIZIZ.size() - 1; size >= 0; size--) {
                String str = (String) ListProtector.get(psl.LIZIZ, size);
                for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : psl.LIZJ) {
                    if (onSharedPreferenceChangeListener != null) {
                        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.LIZLLL, str);
                    }
                }
            }
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS30S0200000_11(this, psl, 64));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.LIZ) {
            ((HashMap) this.LIZIZ).put(str, this);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.LIZ) {
            ((HashMap) this.LIZIZ).put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.LIZ) {
            ((HashMap) this.LIZIZ).put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.LIZ) {
            ((HashMap) this.LIZIZ).put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.LIZ) {
            ((HashMap) this.LIZIZ).put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.LIZ) {
            ((HashMap) this.LIZIZ).put(str, str2);
            if (str2 != null && str2.length() > 500) {
                String str3 = this.LIZLLL.LIZIZ;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sp_value_size", str2.length());
                    jSONObject.put("sp_file_name", str3);
                    jSONObject.put("sp_key", str);
                    FUA.LIZIZ("sp_put_big_size_value", "sp_put_big_size_value", jSONObject);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, java.util.Set<String> set) {
        HashSet hashSet;
        synchronized (this.LIZ) {
            java.util.Map<String, Object> map = this.LIZIZ;
            if (set == null) {
                hashSet = null;
            } else {
                hashSet = new HashSet(set);
            }
            ((HashMap) map).put(str, hashSet);
        }
        return this;
    }
}
