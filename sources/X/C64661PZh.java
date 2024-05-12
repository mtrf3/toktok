package X;

import Y.ARunnableS47S0100000_11;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.retrofit2.client.Request;
import ee1.e;
import ee1.l;
import ee1.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.PZh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64661PZh implements InterfaceC64803Pbz, InterfaceC64703PaN, InterfaceC48115IuV, WeakHandler.IHandler {
    public final C64600PWy LJLIL;
    public final C64668PZo LJLILLLLZI;
    public final long LJLJI;
    public String LJLJJI;
    public final Request LJLJJL;
    public okhttp3.Request LJLJJLL;
    public C64598PWw LJLJL;
    public C64587PWl LJLJLJ;
    public final C64738Paw LJLJLLL;
    public volatile C64608PXg LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public final WeakHandler LJLLL;

    @Override // X.InterfaceC64803Pbz
    public final boolean LIZIZ(long j) {
        return false;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final void LJI() {
        C64668PZo c64668PZo = this.LJLILLLLZI;
        C64598PWw c64598PWw = this.LJLJL;
        C64687Pa7 LJI = C64735Pat.LJI(c64668PZo, c64598PWw.LJLJI, new LD6(this), c64598PWw.LJLJJLL.LJIIIZ());
        if (LJI.LIZ) {
            LJFF(LJI.LIZJ);
        } else if (!C38354F3m.LJ(this.LJLILLLLZI.LJJIIZ) && LJI.LIZIZ) {
            this.LJLLJ = this.LJLILLLLZI.LJJIIZ;
        }
        C64668PZo c64668PZo2 = this.LJLILLLLZI;
        c64668PZo2.LJJ = C64667PZn.LIZIZ(this.LJLJJLL, c64668PZo2);
    }

    public final void LJII() {
        String str;
        java.util.Map<String, List<String>> LJIIIZ = this.LJLJL.LJLJJLL.LJIIIZ();
        TreeMap treeMap = (TreeMap) LJIIIZ;
        if (!treeMap.containsKey("bdturing-verify")) {
            return;
        }
        okhttp3.Request request = this.LJLJJLL;
        if (request != null) {
            str = request.header("x-tt-bypass-bdturing");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("1")) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C64687Pa7 LJII = C64735Pat.LJII(this.LJLJL.LJLJI, LJIIIZ);
        this.LJLILLLLZI.LJJIIJ = SystemClock.uptimeMillis() - uptimeMillis;
        if (LJII.LIZ) {
            C64668PZo c64668PZo = this.LJLILLLLZI;
            c64668PZo.LJJIII = true;
            c64668PZo.LJJIIJZLJL = true;
            java.util.Map<String, String> map = LJII.LIZJ;
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("x-tt-bdturing-retry", "1");
            LJFF(map);
        } else if (!treeMap.containsKey("bdturing-verify")) {
            this.LJLILLLLZI.LJJIII = true;
            this.LJLLILLLL = true;
        }
        C64668PZo c64668PZo2 = this.LJLILLLLZI;
        c64668PZo2.LJJ = C64667PZn.LIZIZ(this.LJLJJLL, c64668PZo2);
    }

    @Override // X.InterfaceC64803Pbz
    public final void cancel() {
        C64587PWl c64587PWl = this.LJLJLJ;
        if (c64587PWl != null) {
            c64587PWl.LIZ(-1);
            if (this.LJLJJL.isResponseStreaming() && !this.LJLLI) {
                this.LJLILLLLZI.LJII = System.currentTimeMillis();
                if (this.LJLL.LJIILJJIL.get() != -1) {
                    LIZJ(true);
                } else {
                    this.LJLLL.postDelayed(new ARunnableS47S0100000_11(this, 4), 500L);
                }
            }
            this.LJLLI = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02b6  */
    @Override // X.InterfaceC64803Pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C36910EeA execute() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64661PZh.execute():X.EeA");
    }

    @Override // X.InterfaceC48115IuV
    public final Object getRequestInfo() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0154, code lost:
    
        if (r7.LJ <= 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C64661PZh(com.bytedance.retrofit2.client.Request r19) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64661PZh.<init>(com.bytedance.retrofit2.client.Request):void");
    }

    public final void LIZJ(boolean z) {
        if (z) {
            C64667PZn.LJI(this.LJLILLLLZI, this.LJLJLLL, this.LJLL);
        } else {
            C64667PZn.LJI(this.LJLILLLLZI, this.LJLJLLL, null);
        }
        C64668PZo c64668PZo = this.LJLILLLLZI;
        T t = c64668PZo.LIZIZ;
        if (t == 0 || t.LJIILL) {
            long j = c64668PZo.LJII;
            long j2 = this.LJLJI;
            C64735Pat.LIZLLL(j - j2, j2, this.LJLJJL.getUrl(), this.LJLJJI, this.LJLILLLLZI);
        }
    }

    public final List<EJ6> LIZLLL(C64606PXe c64606PXe) {
        boolean z;
        int length = c64606PXe.LIZ.length / 2;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            String LJ = c64606PXe.LJ(i);
            if (LJ != null) {
                boolean z2 = true;
                if (this.LJLLILLLL && LJ.equalsIgnoreCase("bdturing-verify")) {
                    z = true;
                } else {
                    z = false;
                }
                String str = this.LJLLJ;
                if (str == null || !LJ.equalsIgnoreCase(str)) {
                    z2 = false;
                }
                if (z | z2) {
                }
            }
            arrayList.add(new EJ6(c64606PXe.LJ(i), c64606PXe.LJIIJ(i)));
        }
        return arrayList;
    }

    public final void LJFF(java.util.Map<String, String> map) {
        C64598PWw c64598PWw;
        C64587PWl c64587PWl = this.LJLJLJ;
        if (c64587PWl != null) {
            c64587PWl.LIZ(-1);
        }
        PVM pvm = this.LJLJL.LJLJL;
        if (pvm != null) {
            C64718Pac.LJ(pvm);
        }
        C64618PXq newBuilder = this.LJLJJLL.newBuilder();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    newBuilder.LIZ(key, value);
                }
            }
        }
        okhttp3.Request LIZIZ = newBuilder.LIZIZ();
        this.LJLJJLL = LIZIZ;
        C64600PWy c64600PWy = this.LJLIL;
        c64600PWy.getClass();
        C64587PWl LIZJ = C64587PWl.LIZJ(c64600PWy, LIZIZ, false);
        this.LJLJLJ = LIZJ;
        this.LJLILLLLZI.LJJIFFI = C64667PZn.LIZJ(LIZJ.LJLJJL.headers());
        C64600PWy c64600PWy2 = this.LJLIL;
        C64587PWl c64587PWl2 = this.LJLJLJ;
        if (c64600PWy2 == null || c64587PWl2 == null) {
            c64598PWw = null;
        } else {
            c64598PWw = c64587PWl2.execute();
        }
        this.LJLJL = c64598PWw;
    }

    @Override // X.InterfaceC64703PaN
    public final void LIZ(Throwable th, boolean z) {
        C64587PWl c64587PWl = this.LJLJLJ;
        if (c64587PWl == null) {
            return;
        }
        c64587PWl.LIZ(-1);
        if (this.LJLLI) {
            return;
        }
        this.LJLILLLLZI.LJII = System.currentTimeMillis();
        C64668PZo c64668PZo = this.LJLILLLLZI;
        T t = c64668PZo.LIZIZ;
        if (t == 0 || t.LJIILL) {
            C64735Pat.LJ(th, this.LJLJJI, this.LJLJI, this.LJLJJL, c64668PZo, Boolean.valueOf(z));
        }
        this.LJLLI = true;
    }

    public final String LJ(String str, String str2, List<EJ6> list) {
        if (!((ArrayList) l.LJ().LIZLLL).isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            e LIZ = l.LJ().LIZ(new m(str, str2, list));
            long currentTimeMillis2 = System.currentTimeMillis();
            if (LIZ != null) {
                this.LJLL.LJI(this.LJLJJL.getMethod(), LIZ.LIZ, currentTimeMillis2 - currentTimeMillis, false, LIZ.LIZJ);
                if (!str.equals(LIZ.LIZ)) {
                    if (!LIZ.LIZ.isEmpty() || ((ArrayList) LIZ.LIZIZ).isEmpty()) {
                        if (EZX.LIZ(LIZ.LIZ)) {
                            return LIZ.LIZ;
                        }
                        return str;
                    }
                    this.LJLL.LJJIJLIJ = -555;
                    throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555");
                }
                return str;
            }
            return str;
        }
        Logger.debug();
        long currentTimeMillis3 = System.currentTimeMillis();
        String LIZLLL = l.LJ().LIZLLL(str);
        long currentTimeMillis4 = System.currentTimeMillis();
        if (str.equals(LIZLLL) || !EZX.LIZ(LIZLLL)) {
            return str;
        }
        this.LJLL.LJI(this.LJLJJL.getMethod(), LIZLLL, currentTimeMillis4 - currentTimeMillis3, true, null);
        return LIZLLL;
    }
}
