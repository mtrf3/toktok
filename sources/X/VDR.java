package X;

import X.C0M9;
import Y.ARunnableS25S0300000_14;
import Y.IDBReceiverS8S0100000_8;
import Y.IDHandlerS24S0100000_14;
import android.content.Context;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VDR implements InterfaceC63833P3l {
    public static final C1HQ LJIILLIIL;
    public O6R LIZ;
    public final PThreadPoolExecutor LIZIZ;
    public final Context LIZLLL;
    public java.util.Set<String> LJIIIZ;
    public final boolean LJIILJJIL;
    public final IDHandlerS24S0100000_14 LIZJ = new IDHandlerS24S0100000_14(this, C16880lQ.LLJJJJ(), 5);
    public final IDBReceiverS8S0100000_8 LJ = new IDBReceiverS8S0100000_8(this, 5);
    public final C1HQ LJFF = new C1HQ();
    public final List<Callable<?>> LJI = new LinkedList();
    public final List<String> LJII = new ArrayList();
    public boolean LJIIIIZZ = false;
    public long LJIIJ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public boolean LJIIJJI = true;
    public boolean LJIIL = true;
    public int LJIILIIL = 0;
    public int LJIILL = -1;

    static {
        C73343SqR.LJLJJL = false;
        LJIILLIIL = new C1HQ();
    }

    @Override // X.InterfaceC63833P3l
    public final Object LIZIZ() {
        O6R o6r = this.LIZ;
        if (o6r == null) {
            return LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        o6r.getClass();
        return O6R.LJIJJLI("TTNet_NQE_INFO", LiveGiftNewGifterBadgeSetting.DEFAULT);
    }

    @Override // X.InterfaceC63833P3l
    public final boolean LJ() {
        if (!this.LJIIIIZZ) {
            return false;
        }
        return this.LJIIJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ() {
        java.util.Set<String> set = this.LJIIIZ;
        if (set == null || ((HashSet) set).size() == 0) {
            LJIILLIIL.clear();
            return;
        }
        Iterator it = ((HashSet) this.LJIIIZ).iterator();
        while (it.hasNext()) {
            VDT vdt = (VDT) LJIILLIIL.getOrDefault(it.next(), null);
            if (vdt != null) {
                vdt.LJ.lock();
                vdt.LIZLLL = null;
                vdt.LJ.unlock();
                vdt.LIZ();
                vdt.LJ.lock();
                vdt.LIZJ = null;
                vdt.LJ.unlock();
                vdt.LIZ();
            }
        }
    }

    public final void LJIIJ() {
        C1HQ c1hq;
        if (this.LJIIL && (c1hq = LJIILLIIL) != null) {
            if (c1hq.LJLJI == 0) {
                LJIIJJI(new VDS(), new VDY(this));
                return;
            }
            this.LJIILIIL = 0;
            Iterator it = ((C0M9.e) c1hq.values()).iterator();
            while (it.hasNext()) {
                VDT vdt = (VDT) it.next();
                LJIIJJI(new F9W(vdt.LIZ), new VDU(this, vdt));
            }
        }
    }

    @Override // X.InterfaceC63833P3l
    public final int LJIIIIZZ() {
        return this.LJIILL;
    }

    public VDR(Context context) {
        this.LJIILJJIL = false;
        this.LIZLLL = context;
        ((HashSet) VDN.LIZIZ().LIZJ.LIZ).add(new VDZ(this));
        VDN.LIZIZ().getClass();
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38894FOg());
        this.LIZIZ = pThreadPoolExecutor;
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        boolean z = VDN.LIZIZ().LIZLLL;
        this.LJIILJJIL = z;
        if (z) {
            C16880lQ.LLJJJIL("vctfo");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // X.InterfaceC63833P3l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.LJIIIIZZ
            r1 = 0
            if (r0 == 0) goto L9
            boolean r0 = r3.LJIIJJI
            if (r0 != 0) goto La
        L9:
            return r1
        La:
            X.1HQ r0 = X.VDR.LJIILLIIL
            java.lang.Object r0 = r0.getOrDefault(r4, r1)
            X.VDT r0 = (X.VDT) r0
            if (r0 == 0) goto L4c
            java.lang.String r2 = r0.LIZLLL()
            if (r2 != 0) goto L4a
        L1a:
            X.1HQ r0 = r3.LJFF
            java.lang.Object r0 = r0.getOrDefault(r4, r1)
            X.VDT r0 = (X.VDT) r0
            if (r0 == 0) goto L4a
            java.lang.String r1 = r0.LIZLLL()
        L28:
            boolean r0 = r3.LJIILJJIL
            if (r0 == 0) goto L9
            java.util.List<java.lang.String> r0 = r3.LJII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4e
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4e
            java.util.List<java.lang.String> r0 = r3.LJII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L4e
            r0 = 1
            r3.LJIILL = r0
            goto L9
        L4a:
            r1 = r2
            goto L28
        L4c:
            r2 = r1
            goto L1a
        L4e:
            r0 = 0
            r3.LJIILL = r0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VDR.LIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC63833P3l
    public final List<String> LJFF(String str) {
        if (!this.LJIIIIZZ) {
            return null;
        }
        VDT vdt = (VDT) LJIILLIIL.getOrDefault(str, null);
        if (vdt != null) {
            return vdt.LIZIZ();
        }
        VDT vdt2 = (VDT) this.LJFF.getOrDefault(str, null);
        if (vdt2 == null) {
            return null;
        }
        return vdt2.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC63833P3l
    public final List<String> LJI(String str) {
        if (!this.LJIIIIZZ) {
            return null;
        }
        VDT vdt = (VDT) LJIILLIIL.getOrDefault(str, null);
        if (vdt != null) {
            return vdt.LIZJ();
        }
        VDT vdt2 = (VDT) this.LJFF.getOrDefault(str, null);
        if (vdt2 == null) {
            return null;
        }
        return vdt2.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(VDW vdw) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (vdw == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        if (vdw.LIZ == 0 && (jSONObject2 = vdw.LIZIZ) != null && jSONObject2.length() > 0) {
            Iterator<String> keys = vdw.LIZIZ.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !next.equals("")) {
                    hashSet.add(next);
                }
            }
        }
        this.LJIIIZ = hashSet;
        long j = vdw.LIZLLL * 1000;
        if (j < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            j = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        }
        this.LJIIJ = j;
        this.LJIIJJI = vdw.LJ;
        this.LJIIL = vdw.LJFF;
        if (hashSet.size() == 0) {
            LJIILLIIL.clear();
            return;
        }
        Iterator it = ((HashSet) this.LJIIIZ).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList = null;
            VDT vdt = (VDT) LJIILLIIL.getOrDefault(str, null);
            if (vdt == null) {
                vdt = new VDT(str);
            }
            if (vdw.LIZ == 0 && (jSONObject = vdw.LIZIZ) != null && jSONObject.length() > 0) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    if (vdw.LIZIZ.has(str)) {
                        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(vdw.LIZIZ, str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList2.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                        }
                        arrayList = arrayList2;
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            C36783Ec7 c36783Ec7 = new C36783Ec7(str, arrayList);
            vdt.LJ.lock();
            vdt.LIZJ = c36783Ec7;
            vdt.LJ.unlock();
            vdt.LIZ();
            vdt.LJII = vdw.LIZJ;
            LJIILLIIL.put(str, vdt);
            if (this.LJIILJJIL && arrayList != null && !arrayList.isEmpty()) {
                LJIIJJI(new F9X(arrayList, this.LJII), new C79370VDa(this));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC63833P3l
    public final String LJII(String str, String str2) {
        C36783Ec7 c36783Ec7;
        List<String> list;
        List<String> list2;
        if (!this.LJIIIIZZ) {
            return null;
        }
        VDT vdt = (VDT) LJIILLIIL.getOrDefault(str, null);
        if (vdt != null) {
            C36783Ec7 c36783Ec72 = vdt.LIZJ;
            if (c36783Ec72 == null || (list2 = c36783Ec72.LIZIZ) == null) {
                return null;
            }
            if (!((ArrayList) list2).contains(str2)) {
                return "local_dns";
            }
            return vdt.LJII;
        }
        VDT vdt2 = (VDT) this.LJFF.getOrDefault(str, null);
        if (vdt2 == null || (c36783Ec7 = vdt2.LIZJ) == null || (list = c36783Ec7.LIZIZ) == null) {
            return null;
        }
        if (!((ArrayList) list).contains(str2)) {
            return "local_dns";
        }
        return vdt2.LJII;
    }

    public final <T> void LJIIJJI(Callable<T> callable, InterfaceC79371VDb<T> interfaceC79371VDb) {
        if (!this.LJIIIIZZ) {
            return;
        }
        synchronized (this.LJI) {
            ((LinkedList) this.LJI).add(callable);
        }
        this.LIZIZ.submit(new ARunnableS25S0300000_14(this, callable, interfaceC79371VDb, 23));
    }

    @Override // X.InterfaceC63833P3l
    public final void LIZJ(int i, int i2, String str) {
        VDK LIZ = VDK.LIZ();
        LIZ.getClass();
        C79373VDd c79373VDd = new C79373VDd();
        c79373VDd.LIZ = i;
        c79373VDd.LIZIZ = i2;
        c79373VDd.LIZJ = System.currentTimeMillis();
        LIZ.LIZIZ = str;
        LIZ.LIZJ.put(str, c79373VDd);
    }

    @Override // X.InterfaceC63833P3l
    public final Object LIZLLL(Object obj, int i, int i2, String str) {
        JSONObject jSONObject;
        double d;
        String str2;
        C79373VDd c79373VDd;
        VDK LIZ = VDK.LIZ();
        LIZ.getClass();
        int i3 = 7;
        JSONObject jSONObject2 = null;
        if (!str.equals("net_effective_connection_type_strategy")) {
            if (!str.equals("live_start_play_buffer_thres") || obj.getClass() != Long.class) {
                return obj;
            }
            long longValue = ((Long) obj).longValue();
            if (LIZ.LIZ != null) {
                String str3 = (String) O6R.LJIJJLI("TTNet_NQE_INFO", "");
                if (str3.length() != 0) {
                    try {
                        jSONObject2 = new JSONObject(str3);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    if (jSONObject2 != null) {
                        int optInt = jSONObject2.optInt("net_effective_connection_type");
                        if (optInt != 1) {
                            i3 = optInt;
                        }
                        Pair pair = LIZ.LJ.get(Integer.valueOf(i3));
                        if (pair != null) {
                            if (i2 == 0 && (str2 = LIZ.LIZIZ) != null && (c79373VDd = LIZ.LIZJ.get(str2)) != null) {
                                i = c79373VDd.LIZ;
                                i2 = c79373VDd.LIZIZ;
                                d = 1.0d / Math.exp((LIZ.LJII * (System.currentTimeMillis() - c79373VDd.LIZJ)) / LIZ.LJIIIIZZ);
                            } else {
                                d = 1.0d;
                            }
                            int i4 = (int) ((i * 0.5806451612903226d) + (i2 * 0.41935483870967744d));
                            int intValue = ((Integer) pair.second).intValue() - ((Integer) pair.first).intValue();
                            if (i4 < 20) {
                                intValue = (int) (((1.0d / (Math.exp(-i4) + 1.0d)) - 0.5d) * 2.0d * intValue);
                            }
                            longValue = ((Integer) pair.first).intValue() + ((int) (d * intValue));
                        }
                    }
                }
            }
            return Long.valueOf(longValue);
        }
        if (obj.getClass() != JSONObject.class) {
            return obj;
        }
        JSONObject jSONObject3 = (JSONObject) obj;
        if (LIZ.LIZ != null) {
            String str4 = (String) O6R.LJIJJLI("TTNet_NQE_INFO", "");
            if (str4.length() != 0) {
                try {
                    jSONObject = new JSONObject(str4);
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    int optInt2 = jSONObject.optInt("net_effective_connection_type");
                    if (optInt2 != 1) {
                        i3 = optInt2;
                    }
                    if (jSONObject3.has(String.valueOf(i3))) {
                        try {
                            return JSONObjectProtectorUtils.getJSONObject(jSONObject3, String.valueOf(i3));
                        } catch (JSONException e3) {
                            C16880lQ.LLLLIIL(e3);
                        }
                    }
                }
            }
        }
        return null;
    }
}
