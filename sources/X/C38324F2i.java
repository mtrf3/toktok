package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.F2i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38324F2i {
    public final SharedPreferences LIZ;

    public final synchronized void LIZ() {
        long j = this.LIZ.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                for (String str3 : (java.util.Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.LIZ.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.LIZ.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    public final synchronized void LIZIZ() {
        SharedPreferences.Editor edit = this.LIZ.edit();
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    public final synchronized List<AbstractC38326F2k> LIZJ() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                arrayList.add(new C38325F2j(entry.getKey(), new ArrayList((java.util.Set) entry.getValue())));
            }
        }
        LJIIJJI(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized void LJI() {
        String LIZLLL = LIZLLL(System.currentTimeMillis());
        this.LIZ.edit().putString("last-used-date", LIZLLL).commit();
        LJII(LIZLLL);
    }

    public final synchronized String LIZLLL(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized String LJ(String str) {
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                Iterator it = ((java.util.Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void LJII(String str) {
        String LJ = LJ(str);
        if (LJ == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.LIZ.getStringSet(LJ, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.LIZ.edit().remove(LJ).commit();
        } else {
            this.LIZ.edit().putStringSet(LJ, hashSet).commit();
        }
    }

    public final synchronized boolean LJIIIIZZ(long j) {
        return LJIIIZ(j);
    }

    public final synchronized boolean LJIIIZ(long j) {
        if (this.LIZ.contains("fire-global")) {
            if (!LJFF(this.LIZ.getLong("fire-global", -1L), j)) {
                this.LIZ.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.LIZ.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void LJIIJJI(long j) {
        this.LIZ.edit().putLong("fire-global", j).commit();
    }

    public C38324F2i(Context context, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirebaseHeartBeat");
        LIZ.append(str);
        this.LIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
    }

    public final synchronized boolean LJFF(long j, long j2) {
        return LIZLLL(j).equals(LIZLLL(j2));
    }

    public final synchronized void LJIIJ(long j, String str) {
        String LIZLLL = LIZLLL(j);
        if (this.LIZ.getString("last-used-date", "").equals(LIZLLL)) {
            return;
        }
        long j2 = this.LIZ.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            LIZ();
            j2 = this.LIZ.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.LIZ.getStringSet(str, new HashSet()));
        hashSet.add(LIZLLL);
        this.LIZ.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", LIZLLL).commit();
    }
}
