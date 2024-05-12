package X;

import android.os.SystemClock;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Eyr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38193Eyr implements InterfaceC37120EhY {
    public final /* synthetic */ CallableC38194Eys LIZ;
    public final /* synthetic */ VNS LIZIZ;
    public final /* synthetic */ long LIZJ;

    @Override // X.InterfaceC37120EhY
    public final void LIZ(JSONObject data) {
        o.LJIIJ(data, "data");
        C38184Eyi.LIZIZ(this.LIZ.LJLILLLLZI);
        try {
            Callback callback = this.LIZ.LJLJJL;
            C38378F4k.LIZ.getClass();
            callback.invoke(C38378F4k.LIZIZ(data));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38184Eyi c38184Eyi = this.LIZ.LJLILLLLZI;
        C38184Eyi.LIZJ(c38184Eyi);
        c38184Eyi.LJI = System.currentTimeMillis();
        CallableC38194Eys callableC38194Eys = this.LIZ;
        callableC38194Eys.LJLIL.onReady(c38184Eyi, callableC38194Eys.LJLJI);
        VNS vns = this.LIZIZ;
        if (vns != null) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
            C38162EyM c38162EyM = new C38162EyM();
            c38162EyM.LJLILLLLZI = this.LIZ.LJLJI;
            c38162EyM.LJLJI = 0;
            c38162EyM.LJLJJL = SystemClock.elapsedRealtime() - this.LIZJ;
            lynxViewMonitor.reportJsbInfo(vns, c38162EyM);
        }
    }

    @Override // X.InterfaceC37120EhY
    public final void onError(int i, String str) {
        C38184Eyi.LIZIZ(this.LIZ.LJLILLLLZI);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("code", i);
        javaOnlyMap.putString("message", str);
        this.LIZ.LJLJJL.invoke(javaOnlyMap);
        C38184Eyi c38184Eyi = this.LIZ.LJLILLLLZI;
        C38184Eyi.LIZJ(c38184Eyi);
        c38184Eyi.LJI = System.currentTimeMillis();
        CallableC38194Eys callableC38194Eys = this.LIZ;
        callableC38194Eys.LJLIL.onReady(c38184Eyi, callableC38194Eys.LJLJI);
        VNS vns = this.LIZIZ;
        if (vns != null) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
            C38164EyO c38164EyO = new C38164EyO();
            CallableC38194Eys callableC38194Eys2 = this.LIZ;
            c38164EyO.LJLJJI = callableC38194Eys2.LJLJI;
            c38164EyO.LJLILLLLZI = 4;
            c38164EyO.LJLJI = callableC38194Eys2.LJLIL.composeErrorMessage(str, i);
            lynxViewMonitor.reportJsbError(vns, c38164EyO);
        }
    }

    public C38193Eyr(CallableC38194Eys callableC38194Eys, VNS vns, long j) {
        this.LIZ = callableC38194Eys;
        this.LIZIZ = vns;
        this.LIZJ = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.3C4, java.lang.Object] */
    @Override // X.InterfaceC37120EhY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r6, java.lang.String r7, org.json.JSONObject r8) {
        /*
            r5 = this;
            java.lang.String r1 = "data"
            X.Eys r0 = r5.LIZ
            X.Eyi r0 = r0.LJLILLLLZI
            X.C38184Eyi.LIZIZ(r0)
            com.lynx.react.bridge.JavaOnlyMap r3 = new com.lynx.react.bridge.JavaOnlyMap
            r3.<init>()
            java.lang.String r0 = "code"
            r3.putInt(r0, r6)
            java.lang.String r0 = "msg"
            r3.putString(r0, r7)
            java.lang.String r0 = "message"
            r3.putString(r0, r7)
            X.F4k r0 = X.C38378F4k.LIZ     // Catch: org.json.JSONException -> L2a
            r0.getClass()     // Catch: org.json.JSONException -> L2a
            com.lynx.react.bridge.JavaOnlyMap r0 = X.C38378F4k.LIZIZ(r8)     // Catch: org.json.JSONException -> L2a
            r3.putMap(r1, r0)     // Catch: org.json.JSONException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L2e:
            X.Eys r0 = r5.LIZ
            com.lynx.react.bridge.Callback r2 = r0.LJLJJL
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r3
            r2.invoke(r1)
            X.Eys r0 = r5.LIZ
            X.Eyi r2 = r0.LJLILLLLZI
            X.C38184Eyi.LIZJ(r2)
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJI = r0
            X.Eys r0 = r5.LIZ
            com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule r1 = r0.LJLIL
            java.lang.String r0 = r0.LJLJI
            r1.onReady(r2, r0)
            X.VNS r4 = r5.LIZIZ
            if (r4 == 0) goto Lb3
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L83
            if (r0 <= 0) goto L79
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L83
            r1.append(r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = " with ["
            r1.append(r0)     // Catch: java.lang.Throwable -> L83
            r1.append(r8)     // Catch: java.lang.Throwable -> L83
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L79
        L75:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L83
            goto L8b
        L79:
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = "data.toString()"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L83
            goto L75
        L83:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L8b:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto Lb4
        L91:
            java.lang.String r7 = (java.lang.String) r7
            X.UHB r0 = com.bytedance.android.monitorV2.lynx.LynxViewMonitor.Companion
            r0.getClass()
            com.bytedance.android.monitorV2.lynx.LynxViewMonitor r3 = com.bytedance.android.monitorV2.lynx.LynxViewMonitor.INSTANCE
            X.EyO r2 = new X.EyO
            r2.<init>()
            X.Eys r1 = r5.LIZ
            java.lang.String r0 = r1.LJLJI
            r2.LJLJJI = r0
            r0 = 4
            r2.LJLILLLLZI = r0
            com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule r0 = r1.LJLIL
            java.lang.String r0 = r0.composeErrorMessage(r7, r6)
            r2.LJLJI = r0
            r3.reportJsbError(r4, r2)
        Lb3:
            return
        Lb4:
            r7 = r1
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38193Eyr.LIZIZ(int, java.lang.String, org.json.JSONObject):void");
    }
}
