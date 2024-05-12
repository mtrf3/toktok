package Y;

import X.C16880lQ;
import X.C34195DbT;
import X.C34K;
import X.C36075EDv;
import X.C36093EEn;
import X.C37477EnJ;
import X.C37613EpV;
import X.C38816FLg;
import X.C68322mC;
import X.C72242sW;
import X.E27;
import X.EE1;
import X.EEE;
import X.EZJ;
import X.EZK;
import X.EnumC35839E4t;
import X.EnumC37476EnI;
import X.InterfaceC36076EDw;
import X.InterfaceC37474EnG;
import X.Z8A;
import android.webkit.WebView;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ProductListRequestBody;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS10S0400000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS10S0400000_6.LIZ$0():void");
    }

    public final void LIZ$4() {
        int i;
        int i2;
        int i3 = 63;
        int i4 = 0;
        try {
            String string = JSONObjectProtectorUtils.getString((JSONObject) this.l0, "user_id");
            String optString = ((JSONObject) this.l0).optString("sec_user_id");
            Z8A z8a = Z8A.LIZIZ;
            long j = z8a.queryUser(z8a.userUrl(optString, string, null, 0), false, null).roomId;
            if (j == 0) {
                i = 0;
                i2 = 47;
            } else {
                i = 1;
                i2 = 31;
            }
            ((JSONObject) this.l0).put("room_id", String.valueOf(j));
            i4 = i;
            i3 = i2;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C38816FLg.LIZJ(new ARunnableS1S0102000_6(i4, i3, this, 1));
    }

    public final void LIZ$5() {
        g LJJIJIIJI;
        int i;
        HashMap<String, EZJ> hashMap = EZJ.LIZJ;
        String str = ((ProductListRequestBody) this.l0).sellerId;
        EZJ ezj = hashMap.get(str);
        if (ezj == null) {
            ezj = new EZJ();
            hashMap.put(str, ezj);
        }
        EZJ ezj2 = ezj;
        String str2 = ((ProductListRequestBody) this.l0).sessionId;
        ezj2.LIZIZ = str2;
        EZK ezk = ezj2.LIZ.get(str2);
        Integer num = null;
        if (ezk == null) {
            HashMap<String, EZK> hashMap2 = ezj2.LIZ;
            ProductListRequestBody productListRequestBody = (ProductListRequestBody) this.l0;
            String str3 = productListRequestBody.sessionId;
            try {
                num = Integer.valueOf(CastIntegerProtector.parseInt(productListRequestBody.scrollParam));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            hashMap2.put(str3, new EZK(i, (Response) this.l1));
            return;
        }
        m mVar = ezk.LIZIZ.data;
        if (mVar != null && (LJJIJIIJI = mVar.LJJIJIIJI("product_list")) != null && LJJIJIIJI.size() > 0) {
            m mVar2 = (m) this.l2;
            ((ArrayList) LJJIJIIJI.LJLIL).addAll(((g) this.l3).LJLIL);
            mVar2.LJJII("product_list", LJJIJIIJI);
        }
        Response<m> response = (Response) this.l1;
        o.LJIIIZ(response, "<set-?>");
        ezk.LIZIZ = response;
    }

    public final void LIZ$1() {
        long currentTimeMillis = System.currentTimeMillis();
        EEE.LIZ();
        int priority = C16880lQ.LLLLIIIILLL().getPriority();
        if (C34195DbT.LIZ()) {
            if (((InterfaceC36076EDw) ((EE1) this.l0)).priority() <= 1) {
                if (((Boolean) C34195DbT.LIZJ.getValue()).booleanValue()) {
                    C16880lQ.LLLLIIIILLL().setPriority(((InterfaceC36076EDw) ((EE1) this.l0)).priority());
                } else if (((Boolean) C34195DbT.LIZLLL.getValue()).booleanValue()) {
                    C16880lQ.LLLLIIIILLL().setPriority(((InterfaceC36076EDw) ((EE1) this.l0)).priority() + 1);
                } else if (((Boolean) C34195DbT.LJ.getValue()).booleanValue()) {
                    C16880lQ.LLLLIIIILLL().setPriority(((InterfaceC36076EDw) ((EE1) this.l0)).priority() + 2);
                }
            }
        } else if (((InterfaceC36076EDw) ((EE1) this.l0)).priority() > 1) {
            C16880lQ.LLLLIIIILLL().setPriority(((InterfaceC36076EDw) ((EE1) this.l0)).priority() + 4);
        }
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZIZ.LJFF((EE1) this.l0);
        C16880lQ.LLLLIIIILLL().setPriority(priority);
        ((C72242sW) this.l1).element = System.currentTimeMillis() - currentTimeMillis;
        ((C36075EDv) this.l2).LJI(((C72242sW) this.l1).element, ((C34K) this.l3).element);
    }

    public final void LIZ$2() {
        long currentTimeMillis = System.currentTimeMillis();
        EEE.LIZ();
        if (C34195DbT.LIZ()) {
            int priority = C16880lQ.LLLLIIIILLL().getPriority();
            if (((Boolean) C34195DbT.LIZJ.getValue()).booleanValue()) {
                C16880lQ.LLLLIIIILLL().setPriority(1);
            } else if (((Boolean) C34195DbT.LIZLLL.getValue()).booleanValue()) {
                C16880lQ.LLLLIIIILLL().setPriority(2);
            } else if (((Boolean) C34195DbT.LJ.getValue()).booleanValue()) {
                C16880lQ.LLLLIIIILLL().setPriority(3);
            }
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZIZ.LJFF((EE1) this.l0);
            C16880lQ.LLLLIIIILLL().setPriority(priority);
        } else {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZIZ.LJFF((EE1) this.l0);
        }
        ((C72242sW) this.l1).element = System.currentTimeMillis() - currentTimeMillis;
        ((C36075EDv) this.l2).LJI(((C72242sW) this.l1).element, ((C34K) this.l3).element);
    }

    public final void LIZ$3() {
        long currentTimeMillis = System.currentTimeMillis();
        EEE.LIZ();
        if (C34195DbT.LIZ()) {
            int priority = C16880lQ.LLLLIIIILLL().getPriority();
            C16880lQ.LLLLIIIILLL().setPriority(1);
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZIZ.LJFF((EE1) this.l0);
            C16880lQ.LLLLIIIILLL().setPriority(priority);
        } else {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZIZ.LJFF((EE1) this.l0);
        }
        ((C72242sW) this.l1).element = System.currentTimeMillis() - currentTimeMillis;
        ((C36075EDv) this.l2).LJI(((C72242sW) this.l1).element, ((C34K) this.l3).element);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.Observer, T, Y.AObserverS70S0200000_6] */
    public static final void run$0(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            C68322mC c68322mC = (C68322mC) aRunnableS10S0400000_6.l0;
            ?? aObserverS70S0200000_6 = new AObserverS70S0200000_6((EnumC35839E4t) aRunnableS10S0400000_6.l1, (Observer) aRunnableS10S0400000_6.l2, 2);
            c68322mC.element = aObserverS70S0200000_6;
            ((PluginService) aRunnableS10S0400000_6.l3).plugins.observeForever(aObserverS70S0200000_6);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.Observer, T, Y.AObserverS70S0200000_6] */
    public static final void run$1(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            C68322mC c68322mC = (C68322mC) aRunnableS10S0400000_6.l0;
            ?? aObserverS70S0200000_6 = new AObserverS70S0200000_6((EnumC35839E4t) aRunnableS10S0400000_6.l1, (Observer) aRunnableS10S0400000_6.l2, 3);
            c68322mC.element = aObserverS70S0200000_6;
            ((PluginService) aRunnableS10S0400000_6.l3).plugins.observeForever(aObserverS70S0200000_6);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        final WebView webView;
        C37477EnJ c37477EnJ = (C37477EnJ) aRunnableS10S0400000_6.l0;
        final EnumC37476EnI enumC37476EnI = (EnumC37476EnI) aRunnableS10S0400000_6.l1;
        final Map map = (Map) aRunnableS10S0400000_6.l2;
        final Map map2 = (Map) aRunnableS10S0400000_6.l3;
        Iterator it = ((HashSet) c37477EnJ.LIZIZ).iterator();
        while (it.hasNext()) {
            final InterfaceC37474EnG interfaceC37474EnG = (InterfaceC37474EnG) it.next();
            if (interfaceC37474EnG != null) {
                WeakReference<WebView> weakReference = c37477EnJ.LJ;
                if (weakReference == null) {
                    webView = null;
                } else {
                    webView = weakReference.get();
                }
                C37613EpV.LIZIZ(new Runnable() { // from class: X.EnH
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC37474EnG interfaceC37474EnG2 = InterfaceC37474EnG.this;
                        EnumC37476EnI enumC37476EnI2 = enumC37476EnI;
                        interfaceC37474EnG2.LIZ(enumC37476EnI2.getValue(), webView, map, map2);
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.Observer, T, Y.AObserverS70S0200000_6] */
    public static final void run$2(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            C68322mC c68322mC = (C68322mC) aRunnableS10S0400000_6.l0;
            ?? aObserverS70S0200000_6 = new AObserverS70S0200000_6((EnumC35839E4t) aRunnableS10S0400000_6.l1, (Observer) aRunnableS10S0400000_6.l2, 4);
            c68322mC.element = aObserverS70S0200000_6;
            ((PluginService) aRunnableS10S0400000_6.l3).plugins.observeForever(aObserverS70S0200000_6);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.Observer, T, Y.AObserverS70S0200000_6] */
    public static final void run$3(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            C68322mC c68322mC = (C68322mC) aRunnableS10S0400000_6.l0;
            ?? aObserverS70S0200000_6 = new AObserverS70S0200000_6((EnumC35839E4t) aRunnableS10S0400000_6.l1, (Observer) aRunnableS10S0400000_6.l2, 5);
            c68322mC.element = aObserverS70S0200000_6;
            ((PluginService) aRunnableS10S0400000_6.l3).plugins.observeForever(aObserverS70S0200000_6);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0400000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0400000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0400000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0400000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0400000_6.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS10S0400000_6 aRunnableS10S0400000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0400000_6.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S0400000_6(C37477EnJ c37477EnJ, EnumC37476EnI enumC37476EnI, Map map, int i) {
        this.$t = i;
        this.l0 = c37477EnJ;
        this.l1 = enumC37476EnI;
        this.l2 = map;
        this.l3 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS10S0400000_6(Object obj, E27 e27, FetchABTestCommonRequest fetchABTestCommonRequest, String[] strArr, C68322mC<m> c68322mC) {
        this.$t = c68322mC;
        this.l0 = obj;
        this.l1 = e27;
        this.l2 = fetchABTestCommonRequest;
        this.l3 = strArr;
    }
}
