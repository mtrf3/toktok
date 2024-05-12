package com.ss.videoarch.strategy.strategy.nodeOptimizer;

import X.C0TS;
import X.C16880lQ;
import X.C79346VCc;
import X.C79348VCe;
import X.C79356VCm;
import X.C79358VCo;
import X.C79362VCs;
import X.C79367VCx;
import X.InterfaceC63814P2s;
import X.PMX;
import X.R2K;
import X.ThreadFactoryC38892FOe;
import X.ThreadFactoryC38893FOf;
import X.VDD;
import X.VDE;
import X.X1D;
import Y.ARunnableS15S1100000_14;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS5S1400000_14;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.strategy.smartStrategy.TopNHostStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class DnsOptimizer {
    public static volatile DnsOptimizer LJJJ;
    public static final Map<String, R2K> LJJJI = new ConcurrentHashMap();
    public static final List<String> LJJJIL = new ArrayList();
    public static final List<String> LJJJJ = new ArrayList();
    public static HashMap<String, JSONObject> LJJJJI = new HashMap<>();
    public volatile VDE LIZ;
    public volatile VDD LIZIZ;
    public final PThreadPoolExecutor LIZJ;
    public final PThreadPoolExecutor LIZLLL;
    public final C79356VCm LJFF;
    public final C79358VCo LJI;
    public final C79348VCe LJII;
    public final C79362VCs LJIIIIZZ;
    public Handler LJIIJ;
    public InterfaceC63814P2s LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public Set<String> LJIILLIIL;
    public Set<String> LJIIZILJ;
    public Set<String> LJIJ;
    public Map<String, Integer> LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public int LJJIJL;
    public boolean LJJIJLIJ;
    public long LJJIL;
    public String LJJIZ;
    public final ReentrantLock LJ = new ReentrantLock();
    public Handler LJIIIZ = new Handler(C16880lQ.LLJJJJ());
    public final List<C0TS> LJIIL = new LinkedList();

    private native String nativeGetPreferedIP(String str);

    public native void nativeStartIPRace(String str);

    public DnsOptimizer() {
        new ArrayList();
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = false;
        this.LJJIFFI = false;
        this.LJJII = -1;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = -1;
        this.LJJIIZ = -1;
        this.LJJIIZI = -1;
        this.LJJIJ = false;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = 0L;
        this.LJJIJIL = 0L;
        this.LJJIJL = LiveStrategyManager.inst().getNetworkType();
        this.LJJIJLIJ = true;
        this.LJJIL = 0L;
        this.LJJIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        PMX.LIZIZ().getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 2, 60L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC38893FOf());
        this.LIZJ = pThreadPoolExecutor;
        if (C79346VCc.LIZLLL().LJIJJLI == 1) {
            pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        PThreadPoolExecutor pThreadPoolExecutor2 = new PThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC38892FOe());
        this.LIZLLL = pThreadPoolExecutor2;
        if (C79346VCc.LIZLLL().LJIJJLI == 1) {
            pThreadPoolExecutor2.allowCoreThreadTimeOut(true);
        }
        this.LJFF = new C79356VCm();
        this.LJII = new C79348VCe();
        this.LJI = new C79358VCo();
        this.LJIIIIZZ = new C79362VCs();
    }

    public static DnsOptimizer LJFF() {
        if (LJJJ == null) {
            synchronized (DnsOptimizer.class) {
                if (LJJJ == null) {
                    LJJJ = new DnsOptimizer();
                }
            }
        }
        return LJJJ;
    }

    public final void LJI() {
        Set<String> set = this.LJIILLIIL;
        if (set == null || ((HashSet) set).size() == 0) {
            ((ConcurrentHashMap) LJJJI).clear();
            return;
        }
        Iterator it = ((HashSet) this.LJIILLIIL).iterator();
        while (it.hasNext()) {
            R2K r2k = (R2K) ((ConcurrentHashMap) LJJJI).get(it.next());
            if (r2k != null) {
                r2k.LJIIIIZZ.lock();
                r2k.LJ = null;
                r2k.LJIIIIZZ.unlock();
                r2k.LJII(null);
                r2k.LJIIIIZZ.lock();
                r2k.LIZJ = null;
                r2k.LJIIIIZZ.unlock();
            }
        }
    }

    public final boolean LJIIIIZZ() {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUseIpv6 == 1 && (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableIPV6Probe == 0 || this.LJJII == 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.List r9) {
        /*
            X.VCc r3 = X.C79346VCc.LIZLLL()
            java.lang.String r2 = "push_day_7d"
            java.lang.String r1 = "AnchorFeatureParam"
            org.json.JSONObject r0 = r3.LJIIJJI
            if (r0 != 0) goto L14
        Lc:
            r1 = 0
        Ld:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L30
            return
        L14:
            boolean r0 = r0.has(r1)     // Catch: org.json.JSONException -> L2b
            if (r0 == 0) goto Lc
            org.json.JSONObject r0 = r3.LJIIJJI     // Catch: org.json.JSONException -> L2b
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: org.json.JSONException -> L2b
            boolean r0 = r1.has(r2)     // Catch: org.json.JSONException -> L2b
            if (r0 == 0) goto Lc
            java.lang.String r1 = r1.optString(r2)     // Catch: org.json.JSONException -> L2b
            goto Ld
        L2b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto Lc
        L30:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r4 = r0.mPreferParsingPushNodeByPushDaysIn7Days
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r8 = r0.mPreferParsingPullNodeByPushDaysIn7Days
            int r7 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L64
        L49:
            r3 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Failed to parse integer: "
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.println(r0)
            r7 = -1
        L64:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mEnablePreferParsingPushNode
            java.lang.String r5 = "push"
            r6 = 1
            if (r0 != r6) goto La3
            if (r7 < r4) goto La3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r2 = r9.iterator()
        L85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.startsWith(r5)
            if (r0 == 0) goto L9b
            r3.add(r1)
            goto L85
        L9b:
            r4.add(r1)
            goto L85
        L9f:
            r3.addAll(r4)
            r9 = r3
        La3:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mEnablePreferParsingPullNode
            if (r0 != r6) goto Ldc
            if (r7 >= r8) goto Ldc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r9.iterator()
        Lbf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld9
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.startsWith(r5)
            if (r0 == 0) goto Ld5
            r3.add(r1)
            goto Lbf
        Ld5:
            r4.add(r1)
            goto Lbf
        Ld9:
            r4.addAll(r3)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LIZ(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (android.text.TextUtils.equals(r1, r0) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = 0
            java.lang.String r3 = "\""
            if (r7 != 0) goto L71
            java.lang.String r0 = "\"HTTPDNSRequest\":{\"Enabled\":true,\"DomainNames\":["
            r2.append(r0)
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJ
            r0.lock()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<java.lang.String> r0 = com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LJJJIL
            r1.<init>(r0)
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJ
            r0.unlock()
            java.util.Iterator r4 = r1.iterator()
        L24:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r5 == 0) goto L37
            java.lang.String r0 = ","
            r2.append(r0)
        L37:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L51
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r3)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r2.append(r0)
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "],\"IsNeedIPV6\":"
            r1.append(r0)
            boolean r0 = r6.LJIIIIZZ()
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.append(r0)
            goto Le4
        L71:
            java.util.Map<java.lang.String, X.R2K> r1 = com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LJJJI
            r0 = r1
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto Le4
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.get(r7)
            X.R2K r0 = (X.R2K) r0
            int r0 = r0.LIZIZ
            r4 = 1
            if (r0 != r4) goto Le4
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r1 = r0.mEnableDomainType
            r0 = 2
            if (r1 == r0) goto Laf
            r0 = 4
            java.lang.String r1 = r7.substring(r5, r0)
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VD3 r0 = r0.LJIIL
            com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings r0 = r0.LIZLLL
            int r0 = r0.mEnableDomainType
            if (r0 != r4) goto Le9
            java.lang.String r0 = "pull"
        La9:
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Le4
        Laf:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "\"HTTPDNSRequest\":{\"Enabled\":true,\"IsNeedIPV6\":"
            r1.append(r0)
            boolean r0 = r6.LJIIIIZZ()
            r1.append(r0)
            java.lang.String r0 = ",\"DomainNames\":["
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.append(r0)
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r3)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r2.append(r0)
            java.lang.String r0 = "]}"
            r2.append(r0)
        Le4:
            java.lang.String r0 = r2.toString()
            return r0
        Le9:
            java.lang.String r0 = "push"
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LIZIZ(java.lang.String):java.lang.String");
    }

    public final String LIZJ(String str) {
        R2K r2k;
        List<String> list;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            Set<String> set = this.LJIIZILJ;
            if (set != null && set.size() != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("\"SelectNodeRequest\":{\"Enabled\":true,\"IsNeedIPV6\":");
                LIZ.append(LJIIIIZZ());
                LIZ.append(",\"IPs\":{");
                sb.append(X1D.LIZIZ(LIZ));
                int i = 0;
                for (String str2 : this.LJIIZILJ) {
                    Map<String, R2K> map = LJJJI;
                    if (map != null && ((ConcurrentHashMap) map).containsKey(str2) && (r2k = (R2K) ((ConcurrentHashMap) map).get(str2)) != null && (list = r2k.LIZLLL) != null && list.size() != 0) {
                        if (i != 0) {
                            sb.append(",");
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("\"");
                        LIZ2.append(r2k.LIZ);
                        LIZ2.append("\":[");
                        sb.append(X1D.LIZIZ(LIZ2));
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            if (i2 != 0) {
                                sb.append(",");
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("\"");
                            LIZ3.append((String) ListProtector.get(list, i2));
                            LIZ3.append("\"");
                            sb.append(X1D.LIZIZ(LIZ3));
                        }
                        sb.append("]");
                        i++;
                    }
                }
                sb.append("}}");
            }
        } else {
            Map<String, R2K> map2 = LJJJI;
            if (map2 != null && ((ConcurrentHashMap) map2).size() != 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("\"SelectNodeRequest\":{\"Enabled\":true,\"IsNeedIPV6\":");
                LIZ4.append(LJIIIIZZ());
                LIZ4.append(",\"IPs\":{");
                sb.append(X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("\"");
                LIZ5.append(str);
                LIZ5.append("\":[");
                sb.append(X1D.LIZIZ(LIZ5));
                R2K r2k2 = (R2K) ((ConcurrentHashMap) map2).get(str);
                List arrayList = new ArrayList();
                if ((r2k2 == null || (arrayList = r2k2.LIZLLL) != null) && arrayList.size() != 0) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (i3 != 0) {
                            sb.append(",");
                        }
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("\"");
                        LIZ6.append((String) ListProtector.get(arrayList, i3));
                        LIZ6.append("\"");
                        sb.append(X1D.LIZIZ(LIZ6));
                    }
                }
                sb.append("]}}");
            }
        }
        return sb.toString();
    }

    public final void LIZLLL(JSONObject jSONObject) {
        JSONArray optJSONArray;
        this.LJIJJ = 0;
        this.LJJIJIL = System.currentTimeMillis();
        if (jSONObject == null || !jSONObject.has("host_name") || (optJSONArray = jSONObject.optJSONArray("host_name")) == null || optJSONArray.length() <= 0) {
            return;
        }
        this.LJIJJLI = optJSONArray.length();
        this.LJIJ = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            ((HashSet) this.LJIJ).add(optString);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJJJI;
            R2K r2k = (R2K) concurrentHashMap.get(optString);
            if (r2k == null) {
                r2k = new R2K(optString, 0);
            }
            concurrentHashMap.put(optString, r2k);
            this.LIZJ.submit(new ARunnableS25S0300000_14(this, new C0TS(r2k.LIZ), r2k, 13));
        }
        Iterator it = ((HashSet) this.LJIJ).iterator();
        while (it.hasNext()) {
            LJIIIZ((String) it.next());
        }
    }

    public final void LJIIIZ(String str) {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableIpRace != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        this.LIZJ.execute(new ARunnableS15S1100000_14(this, str, 14));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:39|(2:41|(1:43)(2:54|51))(1:55)|44|45|46|(1:48)|49|50|51|37) */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04ba, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r5) < r10.LJ) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ed A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103 A[Catch: Exception -> 0x0092, TryCatch #6 {Exception -> 0x0092, blocks: (B:34:0x00f8, B:36:0x0103, B:37:0x010c, B:39:0x0112, B:41:0x0138, B:44:0x0141, B:49:0x016b), top: B:33:0x00f8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LJIIJJI(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x036a, code lost:
    
        if (r11 != null) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJ(org.json.JSONObject r25, X.InterfaceC63814P2s r26) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer.LJ(org.json.JSONObject, X.P2s):org.json.JSONObject");
    }

    public final void LJIIJ(VDE vde, String str) {
        Set<String> set;
        String str2;
        if (vde == null) {
            return;
        }
        if (str == null) {
            Map<String, R2K> map = LJJJI;
            if (map != null && ((ConcurrentHashMap) map).size() != 0 && (set = this.LJIILLIIL) != null && ((HashSet) set).size() != 0 && this.LJIIZILJ != null) {
                this.LJJ = 0;
                this.LJIL = 0;
                this.LJJIJIIJIL = System.currentTimeMillis();
                C79356VCm c79356VCm = this.LJFF;
                c79356VCm.LJII++;
                c79356VCm.LJ = C79346VCc.LIZLLL().LJIIL.LIZLLL.mSendHttpDnsByLocalDnsTimeout;
                this.LJFF.LIZLLL = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableRefresh;
                this.LJFF.LJFF = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableHttpDns;
                this.LJFF.LJI = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDomainType;
                this.LJFF.LJIIIZ = TopNHostStrategy.LIZJ().LJ;
                this.LJFF.LJIIJJI = this.LJIIZILJ;
                this.LJI.LIZIZ = C79346VCc.LIZLLL().LJIIL.LIZLLL.mSendHttpDnsByLocalDnsTimeout;
                this.LJI.LIZ = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableRefresh;
                this.LJI.LIZJ = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableHttpDns;
                this.LJI.LIZLLL = C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDomainType;
                this.LJ.lock();
                if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mSendHttpDnsByLocalDnsTimeout == 1) {
                    ((ArrayList) LJJJJ).clear();
                }
                ((ArrayList) LJJJIL).clear();
                this.LJ.unlock();
                Set<String> set2 = this.LJIILLIIL;
                if (set2 != null) {
                    Iterator it = ((HashSet) set2).iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        R2K r2k = (R2K) ((ConcurrentHashMap) LJJJI).get(str3);
                        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableHttpDns == 1 && r2k != null && r2k.LIZIZ == 1) {
                            if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDomainType != 2) {
                                if (str3.length() >= 4) {
                                    String substring = str3.substring(0, 4);
                                    if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDomainType == 1) {
                                        str2 = "pull";
                                    } else {
                                        str2 = "push";
                                    }
                                    if (TextUtils.equals(substring, str2)) {
                                    }
                                }
                            }
                            this.LJ.lock();
                            ((ArrayList) LJJJIL).add(r2k.LIZ);
                            this.LJ.unlock();
                        }
                    }
                }
                this.LJJIIJ = false;
                if (this.LJIIZILJ != null) {
                    ArrayList arrayList = new ArrayList(this.LJIIZILJ);
                    if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnablePreferParsingPushNode == 1) {
                        LIZ(arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        R2K r2k2 = (R2K) ((ConcurrentHashMap) LJJJI).get(it2.next());
                        if (r2k2 != null) {
                            LJII(r2k2, vde, str);
                        }
                    }
                }
                this.LJJIJ = false;
                return;
            }
            ((C79367VCx) vde).LIZ(str);
            return;
        }
        LJII((R2K) ((ConcurrentHashMap) LJJJI).get(str), vde, str);
    }

    public final void LJII(R2K r2k, VDE vde, String str) {
        if (!this.LJIILJJIL) {
            return;
        }
        C0TS c0ts = new C0TS(r2k.LIZ);
        synchronized (this.LJIIL) {
            ((LinkedList) this.LJIIL).add(c0ts);
        }
        Future<?> submit = this.LIZJ.submit(new ARunnableS5S1400000_14(this, str, c0ts, r2k, vde, 1));
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableHttpDns == 1 && C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableListenerThread == 1) {
            this.LIZLLL.submit(new ARunnableS5S1400000_14(this, str, submit, r2k, vde, 2));
        }
    }
}
