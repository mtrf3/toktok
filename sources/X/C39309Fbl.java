package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fbl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39309Fbl implements InterfaceC39320Fbw {
    public final String[] LIZ;

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    public C39309Fbl(String[] strArr) {
        this.LIZ = strArr;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        String[] strArr;
        String[] strArr2;
        o.LJIIIZ(preInstallResult, "preInstallResult");
        C39310Fbm c39310Fbm = preInstallResult.LIZ;
        if (c39310Fbm.LJLIL.length() <= 0 && (strArr = this.LIZ) != null && strArr.length != 0) {
            String str = preInstallResult.LIZJ.LJLILLLLZI;
            HashMap hashMap = new HashMap();
            for (String str2 : s.LJLJJL(str, new String[]{"&"}, 0, 6)) {
                if (s.LJJJLZIJ(str2, "=", false)) {
                    List LJLJJL = s.LJLJJL(str2, new String[]{"="}, 0, 6);
                    if (LJLJJL.size() > 1) {
                        hashMap.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
                    }
                }
            }
            Object obj = hashMap.get("utm_source");
            if (obj == null) {
                obj = "";
            }
            Object obj2 = hashMap.get("utm_medium");
            if (obj2 == null) {
                obj2 = "";
            }
            if (o.LJ("play-auto-installs", obj) && o.LJ("preload", obj2)) {
                c39310Fbm.LJLLILLLL = 3;
                c39310Fbm.LJLLI = false;
            }
            if (!hashMap.containsKey("utm_campaign")) {
                return preInstallResult;
            }
            String str3 = (String) hashMap.get("utm_campaign");
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() != 0 && (strArr2 = this.LIZ) != null && strArr2.length != 0) {
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String LJLLI = s.LJLLI(str3, strArr2[i], "");
                    if (!TextUtils.isEmpty(LJLLI)) {
                        c39310Fbm.LJLLILLLL = 2;
                        c39310Fbm.LJLIL = LJLLI;
                        c39310Fbm.LJLILLLLZI = "TT PAI";
                        c39310Fbm.LJLLI = false;
                        preInstallResult.LJ = true;
                        break;
                    }
                    i++;
                }
            }
        }
        return preInstallResult;
    }
}
