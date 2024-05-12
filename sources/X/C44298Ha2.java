package X;

import Y.ARunnableS11S0201000_8;
import Y.ARunnableS16S0201000_13;
import Y.IDRunnableS0S0201000;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ha2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44298Ha2 implements Handler.Callback, IAVPerformance {
    public final Handler LJLJI;
    public final HashMap<String, C44300Ha4> LJLIL = new HashMap<>();
    public final HashMap<String, Boolean> LJLILLLLZI = new HashMap<>();
    public final SimpleDateFormat LJLJJI = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public boolean LJLJJL = false;

    public C44298Ha2() {
        Looper looper = IH6.LIZ.getLooper();
        o.LJIIIIZZ(looper, "thread.looper");
        this.LJLJI = new Handler(looper, this);
    }

    public static boolean LIZ() {
        File externalFilesDir;
        if (!C45623HvP.LIZ() || (externalFilesDir = C60903NvH.LJ.getExternalFilesDir("koopa_save_log.conf")) == null) {
            return false;
        }
        return C44687HgJ.LIZIZ(externalFilesDir.getPath());
    }

    public final void LIZIZ(Message message) {
        C44299Ha3 c44299Ha3 = (C44299Ha3) message.obj;
        C44300Ha4 remove = this.LJLIL.remove(c44299Ha3.LIZIZ);
        if (remove == null) {
            return;
        }
        remove.LIZ.add(c44299Ha3);
        int size = remove.LIZ.size();
        if (size <= 1) {
            return;
        }
        C6BK c6bk = new C6BK();
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            Long valueOf = Long.valueOf(((C44299Ha3) ListProtector.get(remove.LIZ, i2)).LIZ - ((C44299Ha3) ListProtector.get(remove.LIZ, i)).LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("step");
            LIZ.append(i2);
            c6bk.LIZJ(valueOf, X1D.LIZIZ(LIZ));
            i = i2;
        }
        List<C44299Ha3> list = remove.LIZ;
        c6bk.LIZJ(Long.valueOf(((C44299Ha3) DIX.LIZJ(list, 1, list)).LIZ - ((C44299Ha3) ListProtector.get(remove.LIZ, 0)).LIZ), "totaltime");
        c6bk.LIZIZ(Integer.valueOf(size), "totalstep");
        PerformanceMonitor performanceMonitor = c44299Ha3.LIZLLL;
        if (performanceMonitor != null && !TextUtils.equals(performanceMonitor.getEnterFrom(), "")) {
            c6bk.LIZLLL("enter_from", c44299Ha3.LIZLLL.getEnterFrom());
        }
        c6bk.LIZLLL("type", c44299Ha3.LIZIZ);
        Boolean bool = this.LJLILLLLZI.get(c44299Ha3.LIZIZ);
        if (bool != null && !bool.booleanValue()) {
            c6bk.LIZ(Boolean.FALSE, "cold_start");
        } else {
            c6bk.LIZ(Boolean.TRUE, "cold_start");
            this.LJLILLLLZI.put(c44299Ha3.LIZIZ, Boolean.FALSE);
        }
        JSONObject LJ = c6bk.LJ();
        C43882HKc.LIZIZ(c44299Ha3.LIZIZ, LJ);
        GXR.LIZIZ("tool_performance_operation_cost_time", LJ);
        if (C45623HvP.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("av-performance: type = ");
            LIZ2.append(c44299Ha3.LIZIZ);
            StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ2));
            sb.append("\n");
            int size2 = remove.LIZ.size();
            int i3 = 0;
            while (i3 < size2 - 1) {
                C44299Ha3 c44299Ha32 = (C44299Ha3) ListProtector.get(remove.LIZ, i3);
                int i4 = i3 + 1;
                C44299Ha3 c44299Ha33 = (C44299Ha3) ListProtector.get(remove.LIZ, i4);
                if (c44299Ha32 != null && c44299Ha32.LIZJ != null && c44299Ha33 != null && c44299Ha33.LIZJ != null) {
                    Long valueOf2 = Long.valueOf(c44299Ha33.LIZ - c44299Ha32.LIZ);
                    sb.append("step");
                    sb.append(C16880lQ.LLLZI(Locale.getDefault(), "%2s", new Object[]{Integer.valueOf(i4)}));
                    sb.append(": ");
                    sb.append(C16880lQ.LLLZI(Locale.getDefault(), "%-30s", new Object[]{c44299Ha32.LIZJ}));
                    sb.append(" => ");
                    sb.append(C16880lQ.LLLZI(Locale.getDefault(), "%-30s", new Object[]{c44299Ha33.LIZJ}));
                    sb.append(" cost time = ");
                    sb.append(valueOf2);
                    sb.append(" \n");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("step");
                    LIZ3.append(i4);
                    LIZ3.append("_");
                    LIZ3.append(((C44299Ha3) ListProtector.get(remove.LIZ, i3)).LIZJ.replace(" ", "_"));
                    LIZ3.append("_2_");
                    LIZ3.append(c44299Ha33.LIZJ.replace(" ", "_"));
                    linkedHashMap.put(X1D.LIZIZ(LIZ3), valueOf2);
                }
                i3 = i4;
            }
            List<C44299Ha3> list2 = remove.LIZ;
            Long valueOf3 = Long.valueOf(((C44299Ha3) DIX.LIZJ(list2, 1, list2)).LIZ - ((C44299Ha3) ListProtector.get(remove.LIZ, 0)).LIZ);
            HashMap hashMap = new HashMap();
            hashMap.put(c44299Ha3.LIZIZ, linkedHashMap);
            if (LIZ()) {
                this.LJLJI.post(new ARunnableS16S0201000_13(1, this, hashMap, 12));
            }
            sb.append("totaltime = ");
            sb.append(valueOf3);
            sb.append(" \n");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("\n");
            LIZ4.append((Object) sb);
            H7B.LJ(X1D.LIZIZ(LIZ4));
        }
        remove.LIZ.clear();
    }

    public final void LJFF(Message message) {
        C44299Ha3 c44299Ha3 = (C44299Ha3) message.obj;
        C44300Ha4 c44300Ha4 = this.LJLIL.get(c44299Ha3.LIZIZ);
        if (c44300Ha4 != null) {
            List<C44299Ha3> list = c44300Ha4.LIZ;
            if (list != null && !list.isEmpty()) {
                ListProtector.set(c44300Ha4.LIZ, r1.size() - 1, c44299Ha3);
                return;
            }
            return;
        }
        C44300Ha4 c44300Ha42 = new C44300Ha4();
        c44300Ha42.LIZ.add(c44299Ha3);
        this.LJLIL.put(c44299Ha3.LIZIZ, c44300Ha42);
    }

    public final void LJI(Message message) {
        String str;
        C44299Ha3 c44299Ha3 = (C44299Ha3) message.obj;
        C44300Ha4 c44300Ha4 = this.LJLIL.get(c44299Ha3.LIZIZ);
        if (c44300Ha4 != null) {
            for (C44299Ha3 c44299Ha32 : c44300Ha4.LIZ) {
                if (c44299Ha32 != null && (str = c44299Ha32.LIZJ) != null && str.equals(c44299Ha3.LIZJ)) {
                    return;
                }
            }
            c44300Ha4.LIZ.add(c44299Ha3);
        }
    }

    public final void LJII(String str) {
        if (!C45623HvP.LIZ()) {
            return;
        }
        File file = new File(C60903NvH.LJ.getExternalCacheDir(), "tools_perf.log");
        String LIZIZ = UPJ.LIZIZ(this.LJLJJI.format(new Date(System.currentTimeMillis())), "  ", "KoopaPerformanceLog", " ", str);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, this.LJLJJL)));
            try {
                bufferedWriter.write(LIZIZ);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                if (!this.LJLJJL) {
                    this.LJLJJL = true;
                }
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                LJFF(message);
                return false;
            case 2:
                LJI(message);
                return false;
            case 3:
                LIZIZ(message);
                return false;
            case 4:
                LJFF(message);
                return false;
            case 5:
                LJI(message);
                return false;
            case 6:
                C44299Ha3 c44299Ha3 = (C44299Ha3) message.obj;
                PerformanceMonitor performanceMonitor = c44299Ha3.LIZLLL;
                String str = c44299Ha3.LIZJ;
                if (performanceMonitor == null) {
                    LIZIZ(message);
                    return false;
                }
                ArrayList arrayList = new ArrayList(performanceMonitor.LLJJJJ());
                arrayList.remove(str);
                C44300Ha4 c44300Ha4 = this.LJLIL.get(c44299Ha3.LIZIZ);
                if (c44300Ha4 == null) {
                    return false;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<C44299Ha3> it = c44300Ha4.LIZ.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().LIZJ);
                }
                if (arrayList2.containsAll(arrayList)) {
                    LIZIZ(message);
                    return false;
                }
                LJI(message);
                return false;
            default:
                return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void stopPerformanceMonitor(String str) {
        C42315Gj9.LIZJ(str);
    }

    public final void LIZJ(String str, InterfaceC65784Pro<? extends java.util.Map<String, String>> interfaceC65784Pro) {
        if (!C45623HvP.LIZ()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, interfaceC65784Pro.invoke());
        if (LIZ()) {
            this.LJLJI.post(new IDRunnableS0S0201000(4, this, hashMap, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(PerformanceMonitor performanceMonitor, String str) {
        end(performanceMonitor, str, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void enter(Context context, String str) {
        this.LJLJI.post(new IDRunnableS0S0201000(3, context, str, 4));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void leave(Context context, String str) {
        this.LJLJI.post(new ARunnableS11S0201000_8(0, context, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void recordPerformanceLog(String str, InterfaceC65784Pro<? extends java.util.Map<String, String>> interfaceC65784Pro) {
        if (!C45623HvP.LIZ()) {
            return;
        }
        new C145995oB().LIZJ(interfaceC65784Pro.invoke(), str);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(String str, String str2) {
        LJ(str, str2, null, 1, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(String str, String str2) {
        LJ(str, str2, null, 2, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(String str, String str2) {
        end(str, str2, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(PerformanceMonitor performanceMonitor, String str) {
        LIZLLL(performanceMonitor.getType(), str, performanceMonitor, 4);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(PerformanceMonitor performanceMonitor, String str) {
        LIZLLL(performanceMonitor.getType(), str, performanceMonitor, 5);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(PerformanceMonitor performanceMonitor, String str, long j) {
        LJ(performanceMonitor.getType(), str, performanceMonitor, 6, j);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void startPerformanceMonitor(String str, int i, long j) {
        C42315Gj9.LIZIZ(str, i, j);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(String str, String str2, long j) {
        LJ(str, str2, null, 3, j);
    }

    public final void LIZLLL(String str, String str2, PerformanceMonitor performanceMonitor, int i) {
        LJ(str, str2, performanceMonitor, i, 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void pause(final Context context, final String str, final String str2, final String str3) {
        this.LJLJI.post(new Runnable() { // from class: X.Iy5
            @Override // java.lang.Runnable
            public final void run() {
                C48338Iy6 c48338Iy6;
                Context context2 = context;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                C48334Iy2 LIZ = C48334Iy2.LIZ(context2, str4);
                C48338Iy6 LIZIZ = LIZ.LIZIZ(LIZ.LIZ, "leaving");
                if (LIZIZ == null || (c48338Iy6 = LIZ.LIZJ) == null) {
                    return;
                }
                C48335Iy3.LIZ(LIZ.LIZIZ, c48338Iy6, LIZIZ);
                String scene = LIZ.LIZIZ;
                int i = LIZ.LIZLLL;
                long j = c48338Iy6.LIZ;
                long j2 = LIZIZ.LIZ;
                long j3 = c48338Iy6.LIZJ;
                long j4 = LIZIZ.LIZJ;
                long j5 = c48338Iy6.LIZIZ;
                long j6 = LIZIZ.LIZIZ;
                o.LJIIIZ(scene, "scene");
                C43912HLg.LIZ("scene_memory_usage", scene, i, str6, str5, j, j2, j3, j4, j5, j6, null);
            }
        });
    }

    public final void LJ(String str, String str2, PerformanceMonitor performanceMonitor, int i, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        C44299Ha3 c44299Ha3 = new C44299Ha3();
        if (j > 0) {
            c44299Ha3.LIZ = j;
        } else {
            c44299Ha3.LIZ = System.currentTimeMillis();
        }
        c44299Ha3.LIZIZ = str;
        c44299Ha3.LIZJ = str2;
        c44299Ha3.LIZLLL = performanceMonitor;
        obtain.obj = c44299Ha3;
        this.LJLJI.sendMessage(obtain);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void pause(final Context context, final String str, final String str2, final String str3, final String str4, final java.util.Map<String, String> map) {
        this.LJLJI.post(new Runnable() { // from class: X.Iy4
            @Override // java.lang.Runnable
            public final void run() {
                C48338Iy6 c48338Iy6;
                Context context2 = context;
                String str5 = str2;
                String eventName = str;
                String str6 = str3;
                String str7 = str4;
                java.util.Map map2 = map;
                C48334Iy2 LIZ = C48334Iy2.LIZ(context2, str5);
                o.LJIIIZ(eventName, "eventName");
                C48338Iy6 LIZIZ = LIZ.LIZIZ(LIZ.LIZ, "leaving");
                if (LIZIZ == null || (c48338Iy6 = LIZ.LIZJ) == null) {
                    return;
                }
                C48335Iy3.LIZ(LIZ.LIZIZ, c48338Iy6, LIZIZ);
                C43912HLg.LIZ(eventName, LIZ.LIZIZ, LIZ.LIZLLL, str7, str6, c48338Iy6.LIZ, LIZIZ.LIZ, c48338Iy6.LIZJ, LIZIZ.LIZJ, c48338Iy6.LIZIZ, LIZIZ.LIZIZ, map2);
            }
        });
    }
}
