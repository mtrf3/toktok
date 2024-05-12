package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NtU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60792NtU {
    public static final C60792NtU LIZ = new C60792NtU();

    public static int LIZ(WebView webView) {
        int i;
        WebBackForwardList copyBackForwardList;
        if (webView != null && (copyBackForwardList = webView.copyBackForwardList()) != null) {
            i = copyBackForwardList.getCurrentIndex();
        } else {
            i = 0;
        }
        return i + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        X.FD5.LIZLLL(r6, "schema", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (r14 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        r0 = r14.containerId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        X.FD5.LIZLLL(r7, "container_version", "1.4.2.6-bugfix");
        r1 = new X.C60728NsS();
        r1.LIZIZ = java.lang.Long.valueOf(r4);
        r1.LIZJ = java.lang.Long.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        if (r14 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        r14.LJII(X.C60728NsS.class, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        if (r14 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.hybrid.spark.SparkContext r14) {
        /*
            if (r14 == 0) goto Ld2
            java.lang.String r3 = r14.containerId
        L4:
            X.VMb r2 = new X.VMb
            java.lang.String r1 = "hybrid_monitor_spark_start"
            r2.<init>(r1)
            java.lang.String r0 = "hybridkit_default_bid"
            r2.LIZIZ = r0
            X.VMa r0 = r2.LIZ()
            X.FD5.LJ(r3, r0)
            X.OSZ r0 = new X.OSZ
            java.lang.String r6 = "scene"
            r0.<init>(r6, r1)
            java.util.Map r0 = X.C51029K0z.LJJIIZI(r0)
            java.lang.String r8 = "hybrid_log_report"
            X.FD5.LJII(r8, r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r12 = android.os.SystemClock.uptimeMillis()
            java.lang.String r7 = ""
            if (r14 == 0) goto Lcf
            java.lang.String r1 = r14.containerId
            if (r1 == 0) goto Lcf
        L36:
            java.lang.String r0 = "open_time"
            X.FD5.LIZJ(r4, r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r10 = android.os.SystemClock.uptimeMillis()
            if (r14 == 0) goto Lcc
            java.lang.String r1 = r14.containerId
            if (r1 == 0) goto Lcc
        L49:
            java.lang.String r0 = "container_init_start"
            X.FD5.LIZJ(r2, r1, r0)
            r0 = 3
            X.OSZ[] r9 = new X.OSZ[r0]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "container_init_time_view"
            r1.<init>(r6, r0)
            r0 = 0
            r9[r0] = r1
            long r0 = r2 - r4
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "system_duration"
            r1.<init>(r0, r6)
            r0 = 1
            r9[r0] = r1
            long r10 = r10 - r12
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "systemclock_duration"
            r1.<init>(r0, r6)
            r0 = 2
            r9[r0] = r1
            java.util.Map r0 = X.C113554cx.LJJL(r9)
            X.FD5.LJII(r8, r0)
            if (r14 == 0) goto Lca
            java.lang.String r6 = r14.containerId
            if (r6 == 0) goto Lca
        L87:
            java.lang.String r1 = "container_name"
            java.lang.String r0 = "Spark"
            X.FD5.LIZLLL(r6, r1, r0)
            if (r14 == 0) goto Lc4
            java.lang.String r6 = r14.containerId
            if (r6 == 0) goto Lc4
        L94:
            java.lang.String r1 = r14.url
            if (r1 == 0) goto Lc8
        L98:
            java.lang.String r0 = "schema"
            X.FD5.LIZLLL(r6, r0, r1)
            if (r14 == 0) goto La4
            java.lang.String r0 = r14.containerId
            if (r0 == 0) goto La4
            r7 = r0
        La4:
            java.lang.String r1 = "container_version"
            java.lang.String r0 = "1.4.2.6-bugfix"
            X.FD5.LIZLLL(r7, r1, r0)
            X.NsS r1 = new X.NsS
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.LIZIZ = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.LIZJ = r0
            if (r14 == 0) goto Lc3
            java.lang.Class<X.NsS> r0 = X.C60728NsS.class
            r14.LJII(r0, r1)
        Lc3:
            return
        Lc4:
            r6 = r7
            if (r14 == 0) goto Lc8
            goto L94
        Lc8:
            r1 = r7
            goto L98
        Lca:
            r6 = r7
            goto L87
        Lcc:
            r1 = r7
            goto L49
        Lcf:
            r1 = r7
            goto L36
        Ld2:
            r3 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60792NtU.LIZLLL(com.bytedance.hybrid.spark.SparkContext):void");
    }

    public static void LJ(View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                C16880lQ.LJLLL(view, (ViewGroup) parent);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public static String LIZIZ(SparkContext sparkContext, SparkSchemaParam sparkSchemaParam) {
        String str;
        String str2;
        List<String> list;
        String str3;
        String str4;
        String str5 = null;
        if (sparkSchemaParam != null) {
            str = sparkSchemaParam.getSparkPerfBiz();
        } else {
            str = null;
        }
        if (C96Q.LIZ(str)) {
            if (sparkSchemaParam == null) {
                return null;
            }
            return sparkSchemaParam.getSparkPerfBiz();
        }
        if (sparkSchemaParam != null) {
            str2 = sparkSchemaParam.getSparkPerfBid();
        } else {
            str2 = null;
        }
        if (C96Q.LIZ(str2)) {
            if (sparkSchemaParam == null) {
                return null;
            }
            return sparkSchemaParam.getSparkPerfBid();
        }
        C37724ErI.LIZIZ.getClass();
        java.util.Map LIZJ = C60828Nu4.LIZJ();
        synchronized (LIZJ) {
            for (Map.Entry entry : LIZJ.entrySet()) {
                List<String> list2 = ((C25570A1u) entry.getValue()).LJIIIIZZ;
                boolean z = false;
                if (list2 != null) {
                    for (String str6 : list2) {
                        C60792NtU c60792NtU = LIZ;
                        if (sparkContext == null || (str4 = sparkContext.url) == null) {
                            str4 = "";
                        }
                        c60792NtU.getClass();
                        if (LIZJ(str4, str6)) {
                            z = true;
                        }
                    }
                }
                if (!z && (list = ((C25570A1u) entry.getValue()).LJII) != null) {
                    for (String str7 : list) {
                        C60792NtU c60792NtU2 = LIZ;
                        if (sparkContext == null || (str3 = sparkContext.url) == null) {
                            str3 = "";
                        }
                        c60792NtU2.getClass();
                        if (LIZJ(str3, str7)) {
                            str5 = (String) entry.getKey();
                        }
                    }
                }
            }
        }
        return str5;
    }

    public static boolean LIZJ(String str, String keyword) {
        o.LJIIJ(keyword, "keyword");
        android.net.Uri uri = UriProtector.parse(str);
        o.LJFF(uri, "uri");
        String LJJJJI = C78926UyI.LJJJJI(uri, "url");
        String str2 = "";
        if (LJJJJI == null) {
            LJJJJI = "";
        }
        String LJJJJI2 = C78926UyI.LJJJJI(uri, "surl");
        if (LJJJJI2 != null) {
            str2 = LJJJJI2;
        }
        if (!s.LJJJLZIJ(str, keyword, false) && !s.LJJJLZIJ(LJJJJI, keyword, false) && !s.LJJJLZIJ(str2, keyword, false)) {
            return false;
        }
        return true;
    }

    public static void LJFF(Window window, SparkSchemaParam schemaParams, View view, boolean z) {
        boolean z2;
        o.LJIIJ(schemaParams, "schemaParams");
        EnumC39924Flg engineType = schemaParams.getEngineType();
        int keyboardAdjust = schemaParams.getKeyboardAdjust();
        boolean z3 = false;
        if (keyboardAdjust != 0) {
            if (keyboardAdjust != 1) {
                if (keyboardAdjust != 2) {
                    if (window != null) {
                        window.setSoftInputMode(32);
                        return;
                    }
                    return;
                }
                if (window != null) {
                    window.setSoftInputMode(16);
                }
                if (schemaParams instanceof AbsSparkPageSchemaParam) {
                    z2 = ((AbsSparkPageSchemaParam) schemaParams).getTransStatusBar();
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    return;
                }
            } else {
                if (window != null) {
                    window.setSoftInputMode(32);
                }
                if (engineType != EnumC39924Flg.WEB) {
                    return;
                }
            }
            if (view == null || z) {
                return;
            }
            if (!(schemaParams instanceof SparkPageSchemaParam)) {
                schemaParams = null;
            }
            AbsSparkPageSchemaParam absSparkPageSchemaParam = (AbsSparkPageSchemaParam) schemaParams;
            if (absSparkPageSchemaParam != null) {
                z3 = absSparkPageSchemaParam.getTransNavigationBar();
            }
            new ViewTreeObserverOnGlobalLayoutListenerC45807HyN(view, z3);
            return;
        }
        if (window == null) {
            return;
        }
        window.setSoftInputMode(48);
    }
}
