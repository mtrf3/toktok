package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IoP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47737IoP {
    public final int LJ;
    public final String LJI;
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public JSONObject LIZIZ = null;
    public Context LIZJ = null;
    public int LIZLLL = 0;
    public SharedPreferences LJFF = null;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject;
        LJI(this.LIZJ);
        this.LIZ.readLock().lock();
        try {
            try {
            } catch (JSONException e) {
                e.toString();
            }
            if (this.LIZIZ != null) {
                jSONObject = new JSONObject(this.LIZIZ.toString());
                return jSONObject;
            }
            jSONObject = null;
            return jSONObject;
        } finally {
            this.LIZ.readLock().unlock();
        }
    }

    public final void LJFF() {
        SharedPreferences sharedPreferences;
        this.LIZ.writeLock().lock();
        if (this.LIZIZ != null) {
            this.LIZIZ = new JSONObject();
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
        }
        this.LIZ.writeLock().unlock();
    }

    public final long LIZJ(String str) {
        long j;
        SharedPreferences sharedPreferences;
        int i;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        LJI(this.LIZJ);
        if ((this.LJ & 1) > 0) {
            this.LIZ.readLock().lock();
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null && !jSONObject.isNull(str)) {
                j = this.LIZIZ.optLong(str);
                i = this.LIZIZ.length();
            } else {
                j = 0;
                i = 0;
            }
            this.LIZ.readLock().unlock();
            if (i != 0 || j != 0) {
                return j;
            }
        } else {
            j = 0;
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            long j2 = sharedPreferences.getLong(str, 0L);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get long from SP, key = ");
            LIZ.append(str);
            LIZ.append(", retValue = ");
            LIZ.append(j2);
            X1D.LIZIZ(LIZ);
            return j2;
        }
        return j;
    }

    public final synchronized boolean LJI(Context context) {
        if (this.LIZLLL == 2) {
            return true;
        }
        this.LIZJ = context;
        if (context == null) {
            return false;
        }
        this.LIZLLL = 1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loading local settings, name = ");
        LIZ.append(this.LJI);
        X1D.LIZIZ(LIZ);
        if ((this.LJ & 2) > 0) {
            Context context2 = this.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("com.bd.vod.ST.settings.");
            LIZ2.append(this.LJI);
            SharedPreferences LIZIZ = F9J.LIZIZ(context2, 0, X1D.LIZIZ(LIZ2));
            this.LJFF = LIZIZ;
            if ((this.LJ & 1) > 0 && LIZIZ != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this.LJI);
                LIZ3.append("_whole");
                String string = LIZIZ.getString(X1D.LIZIZ(LIZ3), "");
                if (!TextUtils.isEmpty(string)) {
                    this.LIZ.writeLock().lock();
                    try {
                        this.LIZIZ = new JSONObject(string);
                        this.LIZ.writeLock().unlock();
                    } catch (JSONException e) {
                        e.toString();
                        this.LIZLLL = 0;
                        return false;
                    } finally {
                        this.LIZ.writeLock().unlock();
                    }
                }
            } else {
                this.LIZ.writeLock().lock();
                if (this.LIZIZ == null) {
                    this.LIZIZ = new JSONObject();
                }
            }
        } else {
            this.LIZ.writeLock().lock();
            if (this.LIZIZ == null) {
                this.LIZIZ = new JSONObject();
            }
            this.LIZ.writeLock().unlock();
        }
        this.LIZLLL = 2;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("load local settings, name = ");
        LIZ4.append(this.LJI);
        X1D.LIZIZ(LIZ4);
        return true;
    }

    public C47737IoP(String str, int i) {
        this.LJI = str;
        this.LJ = i;
    }

    public final int LIZ(String str, int i) {
        int i2;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        LJI(this.LIZJ);
        int i3 = 0;
        if ((this.LJ & 1) > 0) {
            this.LIZ.readLock().lock();
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null && !jSONObject.isNull(str)) {
                i2 = this.LIZIZ.optInt(str);
                i3 = this.LIZIZ.length();
            } else {
                i2 = i;
            }
            this.LIZ.readLock().unlock();
            if (i3 != 0) {
                return i2;
            }
        } else {
            i2 = i;
        }
        if ((this.LJ & 2) > 0 && i2 == i && (sharedPreferences = this.LJFF) != null) {
            int i4 = sharedPreferences.getInt(str, i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get int from SP, key = ");
            LIZ.append(str);
            LIZ.append(", retValue = ");
            LIZ.append(i4);
            X1D.LIZIZ(LIZ);
            return i4;
        }
        return i2;
    }

    public final void LIZLLL(String str, int i) {
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJI(this.LIZJ);
        if ((this.LJ & 1) > 0) {
            this.LIZ.writeLock().lock();
            try {
                try {
                    JSONObject jSONObject = this.LIZIZ;
                    if (jSONObject != null) {
                        jSONObject.put(str, i);
                    }
                } catch (JSONException e) {
                    e.toString();
                }
            } finally {
                this.LIZ.writeLock().unlock();
            }
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
    }

    public final void LJ(String str, long j) {
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJI(this.LIZJ);
        if ((this.LJ & 1) > 0) {
            this.LIZ.writeLock().lock();
            try {
                try {
                    JSONObject jSONObject = this.LIZIZ;
                    if (jSONObject != null) {
                        jSONObject.put(str, j);
                    }
                } catch (JSONException e) {
                    e.toString();
                }
            } finally {
                this.LIZ.writeLock().unlock();
            }
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }
}
