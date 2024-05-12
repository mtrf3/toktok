package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Zbo, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90272Zbo {
    public static final C90469Zez LJIIIIZZ = new C90469Zez("FeatureUsageAnalytics");
    public static final String LJIIIZ = "20.1.0";
    public static C90272Zbo LJIIJ;
    public final C90307ZcN LIZ;
    public final SharedPreferences LIZIZ;
    public final String LIZJ;
    public final Runnable LIZLLL;
    public final Handler LJ;
    public final java.util.Set<EnumC90770Zjq> LJFF;
    public final java.util.Set<EnumC90770Zjq> LJI;
    public long LJII;

    public static void LIZ(EnumC90770Zjq enumC90770Zjq) {
        C90272Zbo c90272Zbo = LJIIJ;
        if (c90272Zbo == null) {
            return;
        }
        String num = Integer.toString(enumC90770Zjq.zza());
        SharedPreferences.Editor edit = c90272Zbo.LIZIZ.edit();
        String LLLZ = C16880lQ.LLLZ("%s%s", new Object[]{"feature_usage_timestamp_reported_feature_", num});
        if (!c90272Zbo.LIZIZ.contains(LLLZ)) {
            LLLZ = C16880lQ.LLLZ("%s%s", new Object[]{"feature_usage_timestamp_detected_feature_", num});
        }
        edit.putLong(LLLZ, System.currentTimeMillis()).apply();
        ((HashSet) c90272Zbo.LJFF).add(enumC90770Zjq);
        c90272Zbo.LJ.post(c90272Zbo.LIZLLL);
    }

    public final void LIZIZ(java.util.Set<String> set) {
        HashSet hashSet = (HashSet) set;
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.LIZIZ.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    public C90272Zbo(SharedPreferences sharedPreferences, C90307ZcN c90307ZcN, String str) {
        EnumC90770Zjq enumC90770Zjq;
        EnumC90770Zjq enumC90770Zjq2;
        this.LIZIZ = sharedPreferences;
        this.LIZ = c90307ZcN;
        this.LIZJ = str;
        HashSet hashSet = new HashSet();
        this.LJFF = hashSet;
        HashSet hashSet2 = new HashSet();
        this.LJI = hashSet2;
        this.LJ = new HandlerC90301ZcH(C16880lQ.LLJJJJ());
        this.LIZLLL = new Runnable() { // from class: X.Zbd
            public final void LIZ() {
                long j;
                C90272Zbo c90272Zbo = C90272Zbo.this;
                if (((HashSet) c90272Zbo.LJFF).isEmpty()) {
                    return;
                }
                if (true != c90272Zbo.LJI.equals(c90272Zbo.LJFF)) {
                    j = 86400000;
                } else {
                    j = 172800000;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = c90272Zbo.LJII;
                if (j2 != 0 && currentTimeMillis - j2 < j) {
                    return;
                }
                C90272Zbo.LJIIIIZZ.getClass();
                C90960Zmu LJIIJ2 = C91010Zni.LJIIJ();
                String str2 = C90272Zbo.LJIIIZ;
                if (LJIIJ2.LJLJI) {
                    LJIIJ2.LJ();
                    LJIIJ2.LJLJI = false;
                }
                C91010Zni.LJIILL((C91010Zni) LJIIJ2.LJLILLLLZI, str2);
                String str3 = c90272Zbo.LIZJ;
                if (LJIIJ2.LJLJI) {
                    LJIIJ2.LJ();
                    LJIIJ2.LJLJI = false;
                }
                C91010Zni.LJIIL((C91010Zni) LJIIJ2.LJLILLLLZI, str3);
                C91010Zni LIZJ = LJIIJ2.LIZJ();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c90272Zbo.LJFF);
                C90946Zmg LJIIJ3 = C90997ZnV.LJIIJ();
                if (LJIIJ3.LJLJI) {
                    LJIIJ3.LJ();
                    LJIIJ3.LJLJI = false;
                }
                C90997ZnV.LJIILL((C90997ZnV) LJIIJ3.LJLILLLLZI, arrayList);
                if (LJIIJ3.LJLJI) {
                    LJIIJ3.LJ();
                    LJIIJ3.LJLJI = false;
                }
                C90997ZnV.LJIIL((C90997ZnV) LJIIJ3.LJLILLLLZI, LIZJ);
                C90997ZnV LIZJ2 = LJIIJ3.LIZJ();
                C90979ZnD LJIIJJI = C91028Zo0.LJIIJJI();
                if (LJIIJJI.LJLJI) {
                    LJIIJJI.LJ();
                    LJIIJJI.LJLJI = false;
                }
                C91028Zo0.LJIJI((C91028Zo0) LJIIJJI.LJLILLLLZI, LIZJ2);
                c90272Zbo.LIZ.LIZ(LJIIJJI.LIZJ(), 243);
                SharedPreferences.Editor edit = c90272Zbo.LIZIZ.edit();
                if (!c90272Zbo.LJI.equals(c90272Zbo.LJFF)) {
                    ((HashSet) c90272Zbo.LJI).clear();
                    c90272Zbo.LJI.addAll(c90272Zbo.LJFF);
                    Iterator it = ((HashSet) c90272Zbo.LJI).iterator();
                    while (it.hasNext()) {
                        String num = Integer.toString(((EnumC90770Zjq) it.next()).zza());
                        String LLLZ = C16880lQ.LLLZ("%s%s", new Object[]{"feature_usage_timestamp_reported_feature_", num});
                        if (!c90272Zbo.LIZIZ.contains(LLLZ)) {
                            LLLZ = C16880lQ.LLLZ("%s%s", new Object[]{"feature_usage_timestamp_detected_feature_", num});
                        }
                        String LLLZ2 = C16880lQ.LLLZ("%s%s", new Object[]{"feature_usage_timestamp_reported_feature_", num});
                        if (!TextUtils.equals(LLLZ, LLLZ2)) {
                            long j3 = c90272Zbo.LIZIZ.getLong(LLLZ, 0L);
                            edit.remove(LLLZ);
                            if (j3 != 0) {
                                edit.putLong(LLLZ2, j3);
                            }
                        }
                    }
                }
                c90272Zbo.LJII = currentTimeMillis;
                edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.LJII = 0L;
        if (!LJIIIZ.equals(string) || !str.equals(string2)) {
            HashSet hashSet3 = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet3.add(str2);
                }
            }
            hashSet3.add("feature_usage_last_report_time");
            LIZIZ(hashSet3);
            this.LIZIZ.edit().putString("feature_usage_sdk_version", LJIIIZ).putString("feature_usage_package_name", this.LIZJ).apply();
            return;
        }
        this.LJII = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet4 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j = this.LIZIZ.getLong(str3, 0L);
                if (j != 0 && currentTimeMillis - j > 1209600000) {
                    hashSet4.add(str3);
                } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                    try {
                        enumC90770Zjq = EnumC90770Zjq.zzb(CastIntegerProtector.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused) {
                        enumC90770Zjq = EnumC90770Zjq.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                    }
                    ((HashSet) this.LJI).add(enumC90770Zjq);
                    ((HashSet) this.LJFF).add(enumC90770Zjq);
                } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                    try {
                        enumC90770Zjq2 = EnumC90770Zjq.zzb(CastIntegerProtector.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused2) {
                        enumC90770Zjq2 = EnumC90770Zjq.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                    }
                    ((HashSet) this.LJFF).add(enumC90770Zjq2);
                }
            }
        }
        LIZIZ(hashSet4);
        QH7.LJIIIIZZ(this.LJ);
        QH7.LJIIIIZZ(this.LIZLLL);
        this.LJ.post(this.LIZLLL);
    }
}
