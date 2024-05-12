package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAH implements Runnable {
    public String LJLIL;
    public VBI LJLILLLLZI;
    public C79300VAi LJLJI;
    public C79307VAp LJLJJI;
    public VAD LJLJJLL;
    public R2G LJLJLLL;
    public VAK LJLLLLLL;
    public VAN LJLJJL = new VAN();
    public String LJLJL = "tcp";
    public List<String> LJLJLJ = null;
    public InterfaceC63833P3l LJLL = null;
    public List<String> LJLLI = null;
    public String LJLLILLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLJ = null;
    public String LJLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLZ = null;
    public String LJZ = "";
    public boolean LJZI = false;
    public JSONObject LJZL = null;
    public final Handler LL = new Handler(Looper.myLooper());

    /* JADX WARN: Removed duplicated region for block: B:133:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAH.LIZIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final String LIZ(String str, boolean z) {
        List<String> list;
        String str2;
        if (this.LJLJJI.LJFF == 1) {
            if ((TextUtils.equals(this.LJLJL, "quic") || TextUtils.equals(this.LJLJL, "quicu") || TextUtils.equals(this.LJLJL, "h2q") || TextUtils.equals(this.LJLJL, "h2qu")) && !R2G.LJI(str)) {
                if (z) {
                    list = this.LJLJLJ;
                } else {
                    list = this.LJLLI;
                }
                if (list != null && !list.isEmpty()) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        str2 = it.next();
                        if (R2G.LJI(str2)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("quic not support ipv6: ");
                            LIZ.append(str);
                            LIZ.append(", fallback ipv4: ");
                            LIZ.append(str2);
                            X1D.LIZIZ(LIZ);
                            C46496IMq.LIZJ();
                            break;
                        }
                        it.remove();
                    }
                }
                str2 = str;
                if (TextUtils.equals(str2, str)) {
                    return "";
                }
                return str2;
            }
            return str;
        }
        return str;
    }

    public final void LIZJ(String str, String str2, String str3, String str4) {
        if (this.LJLILLLLZI != null) {
            C0AX.LIZIZ("3. callback: ", str3);
            C79300VAi c79300VAi = this.LJLJI;
            c79300VAi.LIZ = this.LJLJJL;
            c79300VAi.LIZIZ = this.LJLJJLL;
            c79300VAi.LIZJ = this.LJLJL;
            c79300VAi.LIZLLL = this.LJLJLJ;
            c79300VAi.LJ = this.LJLJLLL;
            c79300VAi.LJFF = this.LJLL;
            c79300VAi.LJI = this.LJLLI;
            c79300VAi.LJII = this.LJLLILLLL;
            c79300VAi.LJIIIIZZ = this.LJLLJ;
            c79300VAi.LJIIIZ = this.LJLLL;
            c79300VAi.LJIIJ = this.LJLLLL;
            c79300VAi.LJIIJJI = this.LJLLLLLL;
            c79300VAi.LJIIL = this.LJLZ;
            c79300VAi.LJIILIIL = this.LJZ;
            c79300VAi.LJIILJJIL = this.LJZI;
            VB9 vb9 = (VB9) this.LJLILLLLZI;
            if (!vb9.LIZ.LIZJ.containsKey(str4)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No host record: ");
                LIZ.append(str4);
                X1D.LIZIZ(LIZ);
                C46496IMq.LIZIZ();
                return;
            }
            List<VB8> list = vb9.LIZ.LIZJ.get(str4).LIZIZ;
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) list;
                if (i >= arrayList.size()) {
                    break;
                }
                VB8 vb8 = (VB8) ListProtector.get(arrayList, i);
                if (vb8 != null) {
                    vb8.LIZ(str, str2, str3, str4, c79300VAi);
                }
                i++;
            }
            C79313VAv c79313VAv = vb9.LIZ;
            if (!c79313VAv.LIZJ.containsKey(str4)) {
                return;
            }
            ((ArrayList) c79313VAv.LIZJ.get(str4).LIZIZ).clear();
        }
    }
}
