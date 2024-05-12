package com.ss.android.ugc.aweme.net.corenet;

import X.C16880lQ;
import X.C38652FEy;
import X.C45243HpH;
import X.C66952QPk;
import X.C66953QPl;
import X.C76L;
import X.C87656Yai;
import X.E8L;
import X.EF7;
import X.FCD;
import X.FUA;
import X.FX7;
import X.FXF;
import X.FXG;
import X.InterfaceC195747mE;
import X.InterfaceC64741Paz;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.util.MultiProcessSharedProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class IESNetDepend extends FXG implements InterfaceC64741Paz {
    public static volatile IESNetDepend LIZ;

    /* loaded from: classes7.dex */
    public interface IESNetDependApi {
        @E8L
        C76L<String> doGet(@InterfaceC195747mE String str);
    }

    @Override // X.InterfaceC64741Paz
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC64741Paz
    public final void LIZJ() {
    }

    @Override // X.InterfaceC64741Paz
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC64741Paz
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC64741Paz
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC64741Paz
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC64741Paz
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC64741Paz
    public final void onColdStartFinish() {
    }

    static {
        new HashMap();
    }

    @Override // X.InterfaceC64741Paz
    public final String[] LJFF() {
        if (C38652FEy.LIZ == null) {
            C38652FEy.LIZ = C38652FEy.LJ;
        }
        return C38652FEy.LIZ;
    }

    @Override // X.InterfaceC64741Paz
    public final Map<String, String> LJIIL() {
        HashMap LIZ2 = C45243HpH.LIZ("httpdns", "34.102.215.99", TTNetInit.DOMAIN_NETLOG_KEY, "ttnet.tiktokv.com");
        LIZ2.put("boe", "xxx");
        return LIZ2;
    }

    @Override // X.FXG
    public final boolean LJIILJJIL() {
        return ((Boolean) C87656Yai.LJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC64741Paz
    public final Context getContext() {
        return EF7.LIZIZ();
    }

    @Override // X.InterfaceC64741Paz
    public final int getAppId() {
        return EF7.LJIIIZ;
    }

    @Override // X.InterfaceC64741Paz
    public final void LJII(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            String[] split = str.split(",");
            if (split.length > 0) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.length() > 1 && str2.startsWith(".")) {
                            str2 = str2.substring(1);
                        }
                        arrayList.add(str2);
                    }
                }
            }
            if (C66952QPk.LIZ) {
                FX7 fx7 = C66953QPl.LJZL.LJLJJLL;
                if (fx7 != null && arrayList.size() > 0) {
                    ((CopyOnWriteArraySet) fx7.LIZIZ).addAll(arrayList);
                    return;
                }
                return;
            }
            Set<String> set = C66952QPk.LIZJ;
            if (set == null) {
                return;
            }
            set.addAll(arrayList);
        }
    }

    @Override // X.InterfaceC64741Paz
    public final String LIZ(Context context, String str) {
        return MultiProcessSharedProvider.LIZJ(context).LIZIZ(str);
    }

    @Override // X.InterfaceC64741Paz
    public final void LJ(Context context, Map<String, ?> map) {
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses().iterator();
            while (it.hasNext()) {
                String str = it.next().processName;
                if (str != null && str.equals(context.getPackageName())) {
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        o.LJIIIZ(context, "context");
        String LIZ2 = FCD.LIZ(context);
        Objects.requireNonNull(LIZ2);
        if (LIZ2.endsWith(":widgetProvider")) {
            return;
        }
        try {
            FXF fxf = new FXF(context);
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        fxf.LIZIZ.put(entry.getKey(), Integer.valueOf(((Integer) value).intValue()));
                    } else if (value instanceof Long) {
                        fxf.LIZIZ.put(entry.getKey(), Long.valueOf(((Long) value).longValue()));
                    } else if (value instanceof Float) {
                        fxf.LIZIZ.put(entry.getKey(), Float.valueOf(((Float) value).floatValue()));
                    } else if (value instanceof Boolean) {
                        fxf.LIZIZ.put(entry.getKey(), Boolean.valueOf(((Boolean) value).booleanValue()));
                    } else if (value instanceof String) {
                        fxf.LIZIZ.put(entry.getKey(), (String) value);
                    }
                }
                synchronized (fxf) {
                    fxf.LIZ();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC64741Paz
    public final void LJIIJJI(String str, JSONObject jSONObject) {
        FUA.LIZJ(str, jSONObject);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:8|9)|(5:11|12|13|14|15)|19|12|13|14|15) */
    @Override // X.InterfaceC64741Paz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(android.content.Context r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            X.FK5 r1 = com.ss.android.common.util.MultiProcessSharedProvider.LIZJ(r4)
            r1.getClass()
            android.content.Context r0 = r1.LIZ     // Catch: java.lang.Throwable -> L2d
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r1 = r1.LIZ     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "integer"
            android.net.Uri r0 = com.ss.android.common.util.MultiProcessSharedProvider.LIZ(r1, r6, r0)     // Catch: java.lang.Throwable -> L2d
            android.database.Cursor r1 = X.FK5.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L1c
            goto L2d
        L1c:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r0 = r5
        L29:
            r1.close()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2d
        L2c:
            r5 = r0
        L2d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.corenet.IESNetDepend.LJI(android.content.Context, int, java.lang.String):int");
    }
}
