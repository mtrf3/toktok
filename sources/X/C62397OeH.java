package X;

import Y.ACallableS8S1101000_10;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.OeH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62397OeH {
    public static volatile C62397OeH LJ;
    public List<SharePlatform> LIZ;
    public List<ShareItemOrderBean> LIZIZ;
    public final ShareDatabase LIZJ;
    public Integer LIZLLL;

    public static C62397OeH LIZJ() {
        if (LJ == null) {
            synchronized (C62397OeH.class) {
                if (LJ == null) {
                    LJ = new C62397OeH();
                }
            }
        }
        return LJ;
    }

    public final String[] LIZIZ() {
        String[] strArr;
        List<SharePlatform> list = this.LIZ;
        if (list != null && !list.isEmpty()) {
            strArr = new String[this.LIZ.size()];
            for (int i = 0; i < this.LIZ.size(); i++) {
                strArr[i] = ((SharePlatform) ListProtector.get(this.LIZ, i)).platformId;
            }
        } else {
            strArr = (String[]) C62759Ok7.LJJJ.getValue();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public C62397OeH() {
        boolean z;
        C43252GyG.LIZ("Util", "Instantiating I18nShareOrderUtil");
        ShareDatabase LJIJ = ShareDatabase.LJIJ(EF7.LIZIZ());
        this.LIZJ = LJIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("I18nShareOrderUtil instantiated, ShareDatabase ready: ");
        if (LJIJ != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C43252GyG.LIZ("Util", X1D.LIZIZ(LIZ));
    }

    public final void LIZ(int i, String str) {
        C10K.LIZJ(new ACallableS8S1101000_10(i, this, str, 1));
    }

    public final void LIZLLL(int i, String[] strArr) {
        int intValue;
        try {
            if (this.LIZJ != null) {
                final HashMap hashMap = new HashMap();
                for (String str : strArr) {
                    hashMap.put(str, 0);
                }
                final List<C62707OjH> LIZJ = this.LIZJ.LJIJI().LIZJ(0, 100);
                if (LIZJ.size() >= 100) {
                    this.LIZLLL = Integer.valueOf(((C62707OjH) ListProtector.get(LIZJ, LIZJ.size() - 1)).LIZ);
                }
                if (LIZJ.size() > i && i <= 100) {
                    LIZJ = LIZJ.subList(0, i);
                }
                for (C62707OjH c62707OjH : LIZJ) {
                    Integer num = (Integer) hashMap.get(c62707OjH.LIZJ);
                    String str2 = c62707OjH.LIZJ;
                    if (num == null) {
                        intValue = 1;
                    } else {
                        intValue = num.intValue() + 1;
                    }
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
                Arrays.sort(strArr, new Comparator() { // from class: X.IVe
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        java.util.Map map = hashMap;
                        List<C62707OjH> list = LIZJ;
                        String str3 = (String) obj;
                        String str4 = (String) obj2;
                        int intValue2 = ((Integer) map.get(str4)).intValue() - ((Integer) map.get(str3)).intValue();
                        if (intValue2 == 0) {
                            long j = 0;
                            long j2 = 0;
                            for (C62707OjH c62707OjH2 : list) {
                                if (TextUtils.equals(c62707OjH2.LIZJ, str3) && j2 <= 0) {
                                    j2 = c62707OjH2.LIZIZ.longValue();
                                } else if (TextUtils.equals(c62707OjH2.LIZJ, str4) && j <= 0) {
                                    j = c62707OjH2.LIZIZ.longValue();
                                }
                            }
                            return (int) (j - j2);
                        }
                        return intValue2;
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
