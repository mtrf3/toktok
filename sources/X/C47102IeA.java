package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.model.CDNLog;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IeA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47102IeA implements InterfaceC47574Ilm {
    public final /* synthetic */ EnginePreloader LIZ;

    @Override // X.InterfaceC47574Ilm
    public final String LIZLLL(String str, EnumC47176IfM enumC47176IfM) {
        return null;
    }

    @Override // X.InterfaceC47574Ilm
    public final String LJI(java.util.Map<String, String> map, String str, EnumC47176IfM enumC47176IfM) {
        return null;
    }

    @Override // X.InterfaceC47574Ilm
    public final /* synthetic */ void onStartComplete() {
    }

    public C47102IeA(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
    }

    @Override // X.InterfaceC47574Ilm
    public final void LIZIZ(JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNotifyCDNLog log:");
        LIZ.append(jSONObject);
        X1D.LIZIZ(LIZ);
        EnginePreloader.LJIJJ();
        String jSONObject2 = jSONObject.toString();
        if (C78866UxK.LJLILLLLZI == null) {
            C78866UxK.LJLILLLLZI = new Gson();
        }
        CDNLog cDNLog = (CDNLog) GsonProtectorUtils.fromJson(C78866UxK.LJLILLLLZI, jSONObject2, CDNLog.class);
        cDNLog.LIZ = 1;
        C87748YcC c87748YcC = new C87748YcC(cDNLog);
        if (!TextUtils.isEmpty(c87748YcC.LIZJ)) {
            String str = this.LIZ.LJIIJJI.get(c87748YcC.LIZJ);
            StringBuilder LIZIZ = C25620zW.LIZIZ("onNotifyCDNLog sourceId:", str, ", key:");
            LIZIZ.append(c87748YcC.LIZJ);
            X1D.LIZIZ(LIZIZ);
            EnginePreloader.LJIJJ();
            if (!TextUtils.isEmpty(str)) {
                new VideoInfo().setUrl(c87748YcC.LJJIJIL);
                this.LIZ.LJIJJLI.getPlayerEventReportService().LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onNotifyCDNLog sourceId:");
                LIZ2.append(str);
                LIZ2.append(", url:");
                LIZ2.append(c87748YcC.LJJIJIL);
                LIZ2.append(", ip:");
                LIZ2.append(c87748YcC.LJJIJLIJ);
                X1D.LIZIZ(LIZ2);
                EnginePreloader.LJIJJ();
                this.LIZ.LJIJJLI.getPlayerEventReportService().LIZIZ();
            }
            List<C87748YcC> list = this.LIZ.LJIIJ.get(c87748YcC.LIZJ);
            if (list == null) {
                if (!TextUtils.isEmpty(c87748YcC.LIZJ)) {
                    list = new ArrayList<>();
                    this.LIZ.LJIIJ.put(c87748YcC.LIZJ, list);
                }
                this.LIZ.LJIJJLI.getPlayerEventReportService().LIZJ();
            }
            list.add(c87748YcC);
            this.LIZ.LJIJJLI.getPlayerEventReportService().LIZJ();
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final void LJ(C47709Inx c47709Inx) {
        String str;
        List<C47713Io1> list = c47709Inx.LIZIZ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C47713Io1 c47713Io1 = (C47713Io1) it.next();
                C46900Iau.LJFF(c47713Io1.LIZIZ, c47713Io1.LIZIZ(), c47713Io1.LIZ);
            }
            C47713Io1 c47713Io12 = (C47713Io1) ListProtector.get(list, 0);
            if (c47713Io12 == null) {
                return;
            }
            String str2 = c47713Io12.LIZ;
            long j = c47713Io12.LIZIZ;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] split = str2.split("_");
            if (split != null && split.length > 1) {
                str = split[0];
            } else {
                str = str2;
            }
            C46828IZk.LIZ.LIZ(j, c47709Inx.LIZIZ(), str, str2);
        }
    }

    @Override // X.InterfaceC47574Ilm
    public final HashMap<String, String> LJII(String str) {
        java.util.Map<String, String> requestHeader;
        Object value = IZ8.LLLLLZ.getValue();
        o.LJIIIIZZ(value, "<get-isGetRequestHeaderByNewWay>(...)");
        if (((Boolean) value).booleanValue()) {
            java.util.Map<String, String> requestHeader2 = this.LIZ.LJIJJLI.getRequestHeader(str);
            if (requestHeader2.isEmpty()) {
                return null;
            }
            return new HashMap<>(requestHeader2);
        }
        Object value2 = IZ8.LLLLIL.getValue();
        o.LJIIIIZZ(value2, "<get-PLAY_AUTH_VERIFY_RESTORE_FOR_TEST>(...)");
        if (((Boolean) value2).booleanValue() || (requestHeader = this.LIZ.LJIJJLI.getNetClient().getRequestHeader(str)) == null || requestHeader.isEmpty()) {
            return null;
        }
        return new HashMap<>(requestHeader);
    }

    @Override // X.InterfaceC47574Ilm
    public final void LJIIIIZZ(final C47106IeE c47106IeE) {
        Object obj;
        String str;
        SimVideoUrlModel simVideoUrlModel;
        boolean z;
        String str2;
        C46900Iau.LJFF(c47106IeE.LIZLLL, c47106IeE.LJ, c47106IeE.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("wrg_test_task onTaskProgress: type ");
        LIZ.append(c47106IeE.LJIIIIZZ);
        LIZ.append(", key ");
        LIZ.append(c47106IeE.LIZ);
        LIZ.append(", videoId ");
        LIZ.append(c47106IeE.LIZIZ);
        LIZ.append(", resolution ");
        LIZ.append(c47106IeE.LJFF);
        LIZ.append(", media size:");
        LIZ.append(c47106IeE.LIZLLL);
        LIZ.append(", cacheSize:");
        LIZ.append(c47106IeE.LJ);
        LIZ.append(", mLocalFilePath:");
        LIZ.append(c47106IeE.LIZJ);
        LIZ.append(", mDecryptionKey:");
        LIZ.append(c47106IeE.LJI);
        LIZ.append(", mUsingVideoInfo media info :");
        C47160If6 c47160If6 = c47106IeE.LJII;
        Object obj2 = "null";
        if (c47160If6 == null) {
            obj = "null";
        } else {
            obj = c47160If6.LJIIL();
        }
        LIZ.append(obj);
        LIZ.append(", mUsingVideoInfo bash info :");
        C47160If6 c47160If62 = c47106IeE.LJII;
        if (c47160If62 != null) {
            obj2 = c47160If62.LJIIJJI();
        }
        LIZ.append(obj2);
        X1D.LIZIZ(LIZ);
        EnginePreloader.LJIJJ();
        String str3 = c47106IeE.LIZ;
        final long j = c47106IeE.LIZLLL;
        final long j2 = c47106IeE.LJ;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str3)) {
            String[] split = str3.split("_");
            if (split != null && split.length > 1) {
                str2 = split[0];
            } else {
                str2 = str3;
            }
            C46828IZk.LIZ.LIZ(j, j2, str2, str3);
        }
        String str4 = c47106IeE.LIZ;
        String str5 = null;
        if ((str4 == null || ((ConcurrentHashMap) this.LIZ.LJIILLIIL).get(str4) == null) && (str = c47106IeE.LIZIZ) != null && ((ConcurrentHashMap) this.LIZ.LJIILLIIL).get(str) != null) {
            str4 = c47106IeE.LIZIZ;
        }
        if (str4 != null && (simVideoUrlModel = (SimVideoUrlModel) ((ConcurrentHashMap) this.LIZ.LJIJ).get(str4)) != null) {
            str5 = simVideoUrlModel.getSourceId();
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = str4;
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("wrg_test_task onTaskProgress:", str5, ", ", str4, ", media size:");
        LIZLLL.append(j);
        LIZLLL.append(", cacheSize:");
        LIZLLL.append(j2);
        X1D.LIZIZ(LIZLLL);
        EnginePreloader.LJIJJ();
        if (str4 == null) {
            return;
        }
        EnginePreloader enginePreloader = this.LIZ;
        if (enginePreloader.LJIL) {
            C47076Idk c47076Idk = (C47076Idk) ((ConcurrentHashMap) enginePreloader.LJIIZILJ).get(c47106IeE.LIZ);
            if (c47076Idk != null && c47076Idk.LJLILLLLZI == j2 && c47076Idk.LJLIL == j) {
                return;
            }
        }
        StringBuilder LIZLLL2 = C06540Nm.LIZLLL("execute taskProgress:", str5, ", ", str4, ", media size:");
        LIZLLL2.append(j);
        LIZLLL2.append(", cacheSize:");
        LIZLLL2.append(j2);
        X1D.LIZIZ(LIZLLL2);
        EnginePreloader.LJIJJ();
        ((ConcurrentHashMap) this.LIZ.LJIIZILJ).put(c47106IeE.LIZ, new C47076Idk(j, j2));
        Integer num = (Integer) ((ConcurrentHashMap) this.LIZ.LJIILLIIL).get(str4);
        if (C46982IcE.LIZIZ().isDebug()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("wrg_test_task onTaskProgress needPreloadSize: ");
            LIZ2.append(num);
            LIZ2.append(", key: ");
            LIZ2.append(str4);
            LIZ2.append(", preloadingSizeCache: ");
            LIZ2.append(this.LIZ.LJIILLIIL.toString());
            X1D.LIZIZ(LIZ2);
            EnginePreloader.LJIJJ();
        }
        if (j == j2 && j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            if (num.intValue() <= j2) {
                z2 = true;
            }
            if (z || z2) {
                EnginePreloader enginePreloader2 = this.LIZ;
                ((ConcurrentHashMap) enginePreloader2.LJIILLIIL).remove(str4);
                Object remove = ((ConcurrentHashMap) enginePreloader2.LJIJ).remove(str4);
                if (remove != null) {
                    Iterator it = ((CopyOnWriteArrayList) enginePreloader2.LJIILJJIL).iterator();
                    while (it.hasNext()) {
                        IFW ifw = (IFW) it.next();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(enginePreloader2.LJIILL);
                        LIZ3.append(File.separator);
                        LIZ3.append(str4);
                        ifw.LIZ(Pair.create(remove, X1D.LIZIZ(LIZ3)));
                    }
                }
            } else {
                EnginePreloader enginePreloader3 = this.LIZ;
                ((ConcurrentHashMap) enginePreloader3.LJIILLIIL).remove(str4);
                SimVideoUrlModel simVideoUrlModel2 = (SimVideoUrlModel) ((ConcurrentHashMap) enginePreloader3.LJIJ).remove(str4);
                if (simVideoUrlModel2 != null) {
                    Iterator it2 = ((CopyOnWriteArrayList) enginePreloader3.LJIILJJIL).iterator();
                    while (it2.hasNext()) {
                        ((IFW) it2.next()).LIZIZ(simVideoUrlModel2);
                    }
                }
            }
        }
        C46982IcE.LJ.post(new Runnable() { // from class: X.IeD
            @Override // java.lang.Runnable
            public final void run() {
                C47102IeA c47102IeA = C47102IeA.this;
                C47106IeE c47106IeE2 = c47106IeE;
                long j3 = j;
                long j4 = j2;
                Iterator it3 = ((CopyOnWriteArrayList) c47102IeA.LIZ.LJ).iterator();
                while (it3.hasNext()) {
                    InterfaceC47101Ie9 interfaceC47101Ie9 = (InterfaceC47101Ie9) ((Reference) it3.next()).get();
                    if (interfaceC47101Ie9 != null) {
                        interfaceC47101Ie9.p3(j3, j4, c47106IeE2.LIZ);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC47574Ilm
    public final String getCheckSumInfo(String str) {
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        c46664ITc.getClass();
        if (!TextUtils.isEmpty(str)) {
            return c46664ITc.LIZJ.get(str);
        }
        return "";
    }

    @Override // X.InterfaceC47574Ilm
    public final boolean loadLibrary(String str) {
        this.LIZ.LJIJJLI.getVideoCachePlugin().LIZIZ();
        return false;
    }

    @Override // X.InterfaceC47574Ilm
    public final void LIZ(String str, JSONObject jSONObject) {
        if (!IZ8.LJIIIZ()) {
            return;
        }
        C46982IcE.LJI().monitorCommonLog(str, jSONObject);
    }

    @Override // X.InterfaceC47574Ilm
    public final void LJFF(int i, String str, JSONObject jSONObject) {
        StringBuilder LIZ = C06830Op.LIZ("onLogInfo what:", i, ", logType:", str, ", log:");
        LIZ.append(jSONObject);
        C46474ILu.LIZ("EnginePreloader", X1D.LIZIZ(LIZ));
        try {
            String LIZLLL = this.LIZ.LJIJJLI.getAppLog().LIZLLL();
            if (jSONObject != null && !TextUtils.isEmpty(LIZLLL)) {
                jSONObject.put("session_id", LIZLLL);
            }
            if (C46982IcE.LIZ().isEnabled() && jSONObject != null) {
                C46982IcE.LIZ().e(str, jSONObject.toString());
            }
            this.LIZ.LJIJJLI.getAppLog().recordMiscLog(C46982IcE.LIZ, str, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (jSONObject != null && i == 0) {
            try {
                long optLong = jSONObject.optLong("loader_download_size", 0L);
                String str2 = "";
                int optInt = jSONObject.optInt("task_type");
                if (optInt == 1) {
                    str2 = "play";
                } else if (optInt == 2) {
                    str2 = "preload";
                }
                if (!TextUtils.isEmpty(str2) && optLong > 0) {
                    C09900aA.LJIIZILJ(optLong, str2, "video", str2);
                    if (EB7.LIZ()) {
                        PN9.LJ(optLong, str2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r17 == 0) goto L25;
     */
    @Override // X.InterfaceC47574Ilm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r20, long r21, long r23, java.lang.String r25) {
        /*
            r19 = this;
            java.lang.String r3 = "EnginePreloader"
            java.lang.String r1 = "onNotify what:"
            java.lang.String r0 = ", code:"
            r7 = r20
            r8 = r21
            java.lang.StringBuilder r2 = X.C1FJ.LIZLLL(r1, r7, r0, r8)
            java.lang.String r1 = ", param:"
            java.lang.String r0 = ", info:"
            r10 = r23
            X.C0MT.LIZLLL(r2, r1, r10, r0)
            r5 = r25
            r2.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            X.C46474ILu.LIZ(r3, r0)
            r0 = 30
            r6 = r19
            if (r7 != r0) goto L3f
            java.util.concurrent.ExecutorService r2 = X.C46982IcE.LIZLLL
            Y.ARunnableS9S1100000_8 r1 = new Y.ARunnableS9S1100000_8
            r0 = 1
            r1.<init>(r6, r5, r0)
            r2.submit(r1)
        L34:
            X.IWv r0 = X.C46982IcE.LJ
            X.IeB r5 = new X.IeB
            r5.<init>(r6, r7, r8, r10)
            r0.post(r5)
            return
        L3f:
            r0 = 2
            if (r7 != r0) goto L34
            boolean r0 = X.IZ8.LJIIJ()
            if (r0 == 0) goto L34
            X.IeC r4 = X.C47104IeC.LIZJ
            r4.getClass()
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L57
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L79
        L57:
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader r0 = r6.LIZ
            java.util.List<java.lang.ref.WeakReference<X.Ie9>> r0 = r0.LJ
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.Ie9 r0 = (X.InterfaceC47101Ie9) r0
            if (r0 == 0) goto L61
            r0.N2()
            goto L61
        L79:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L8e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8e
            r1.<init>(r5)     // Catch: org.json.JSONException -> L8e
            java.lang.String r0 = "start_timestamp"
            long r17 = r1.optLong(r0)     // Catch: org.json.JSONException -> L8e
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 != 0) goto L94
        L8e:
            long r17 = java.lang.System.currentTimeMillis()
            long r17 = r17 - r10
        L94:
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 > 0) goto L99
            goto L57
        L99:
            X.IeG r12 = new X.IeG
            r13 = r10
            r15 = r8
            r12.<init>(r13, r15, r17)
            java.lang.Object r3 = r4.LIZ
            monitor-enter(r3)
            java.util.LinkedList<X.IeG> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> Lc5
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lc5
            X.5H3 r0 = X.IZ8.LLIIIJ     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "<get-addSpeedInfoIntoPlayEndSize>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> Lc5
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> Lc5
            if (r2 <= r0) goto Lbe
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc5
            goto L57
        Lbe:
            java.util.LinkedList<X.IeG> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> Lc5
            r0.add(r12)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc5
            goto L57
        Lc5:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47102IeA.LIZJ(int, long, long, java.lang.String):void");
    }
}
