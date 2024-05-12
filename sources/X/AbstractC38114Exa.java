package X;

import Y.ARunnableS17S0300000_6;
import Y.ARunnableS5S1200000_6;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Exa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38114Exa {
    public static final Pattern LJIIJ = PatternProtector.compile("^[0-9a-zA-Z.]+$");
    public Context LIZ;
    public java.util.Set<InterfaceC38140Ey0> LIZIZ;
    public C38126Exm LIZJ;
    public final InterfaceExecutorC38087Ex9 LIZLLL;
    public String LJ;
    public volatile boolean LJFF;
    public AbstractC38143Ey3 LJI;
    public C38112ExY LJII;
    public final java.util.Map<String, C38112ExY> LJIIIIZZ = new HashMap();
    public List<TimeLineEvent> LJIIIZ;

    public abstract Context LJ(C38116Exc c38116Exc);

    public abstract String LJI();

    public abstract void LJIIIIZZ(C38116Exc c38116Exc);

    public abstract void LJIIIZ(String str);

    public abstract void LJIIJ(String str, C38117Exd c38117Exd);

    public void LJIILJJIL(C38117Exd c38117Exd) {
    }

    public View LJFF() {
        return this.LJI.LIZ();
    }

    public void LJIILIIL() {
        this.LJII.LJFF();
        Iterator it = ((HashMap) this.LJIIIIZZ).values().iterator();
        while (it.hasNext()) {
            ((C38112ExY) it.next()).LJFF();
        }
        this.LIZLLL.release();
        this.LJFF = true;
    }

    public AbstractC38114Exa() {
        InterfaceExecutorC38087Ex9 interfaceExecutorC38087Ex9 = C38113ExZ.LJII;
        if (interfaceExecutorC38087Ex9 != null) {
            this.LIZLLL = interfaceExecutorC38087Ex9;
        } else {
            this.LIZLLL = new C38130Exq();
        }
    }

    public final C38117Exd LIZIZ(JSONObject jSONObject) {
        if (this.LJFF) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        String LJI = LJI();
        if (LJI == null) {
            LIZ(3, null, null, "url_empty", null);
            return null;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "params");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "JSSDK");
            String optString3 = jSONObject.optString("namespace");
            String optString4 = jSONObject.optString("__iframe_url");
            Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("shouldHook", false));
            String optString5 = jSONObject.optString("token");
            C38128Exo c38128Exo = new C38128Exo();
            c38128Exo.LIZ = string3;
            c38128Exo.LIZIZ = string;
            c38128Exo.LIZJ = optString2;
            c38128Exo.LIZLLL = string2;
            c38128Exo.LJ = optString;
            c38128Exo.LJFF = optString3;
            c38128Exo.LJI = optString4;
            c38128Exo.LJIIIIZZ = valueOf;
            c38128Exo.LJII = optString5;
            return new C38117Exd(c38128Exo);
        } catch (JSONException unused) {
            LIZ(3, LJI, optString2, "params_invalid", null);
            return new C38117Exd(optString);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:3:0x0005, B:5:0x000c, B:7:0x0010, B:9:0x0029, B:11:0x002d, B:12:0x0038, B:85:0x001b, B:87:0x001f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C38117Exd r15) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38114Exa.LJII(X.Exd):void");
    }

    public final void LJIIL(C38117Exd c38117Exd) {
        if (this.LJFF) {
            return;
        }
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZLLL();
        c38185Eyj.LIZ = "label_pre_call_origin_url";
        this.LIZLLL.execute(new ARunnableS17S0300000_6(c38117Exd, c38185Eyj.LIZIZ(), this, 1));
    }

    public void invokeMethod(String str) {
        if (this.LJFF) {
            return;
        }
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZLLL();
        c38185Eyj.LIZ = "label_pre_call_origin_url";
        TimeLineEvent LIZIZ = c38185Eyj.LIZIZ();
        C1JX.LJIIIIZZ("Received call: ", str);
        this.LIZLLL.execute(new ARunnableS5S1200000_6(this, str, LIZIZ, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:15|(2:37|(1:39))|19|(2:21|(5:25|26|(1:28)(1:31)|29|30))|32|33|34|26|(0)(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r3 = new org.json.JSONObject();
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r5, X.C38117Exd r6) {
        /*
            r4 = this;
            boolean r0 = r4.LJFF
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = r6.LJFF
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "By passing js callback due to empty callback: "
            X.C1JX.LJIIIIZZ(r0, r5)
            return
        L13:
            java.lang.Boolean r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L31
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "hook by BDXBridge: "
            r1.append(r0)
            java.lang.String r0 = r6.toString()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            return
        L31:
            X.Eyj r2 = new X.Eyj
            r2.<init>()
            java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r1 = r6.LJIIL
            java.lang.String r0 = "label_pre_callback_origin_url"
            r2.LIZ(r0, r1)
            java.lang.String r0 = "{"
            boolean r0 = r5.startsWith(r0)
            java.lang.String r3 = "}"
            if (r0 == 0) goto L4d
            boolean r0 = r5.endsWith(r3)
            if (r0 != 0) goto L5c
        L4d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal callback data: "
            java.lang.String r0 = defpackage.i0.LJFF(r0, r5)
            r1.<init>(r0)
            boolean r0 = X.C1A7.LJLIL
            if (r0 != 0) goto Le5
        L5c:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Invoking js callback: "
            r1.append(r0)
            java.lang.String r0 = r6.LJFF
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            java.util.regex.Pattern r1 = X.AbstractC38114Exa.LJIIJ
            java.lang.String r0 = r6.LJFF
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L91
            X.Ewj r1 = X.C38113ExZ.LJIIJ
            java.lang.Object r0 = r1.LIZ()
            if (r0 == 0) goto Lb9
            java.lang.Object r1 = r1.LIZ()
            X.Eh0 r1 = (X.InterfaceC37086Eh0) r1
            X.Dxm r0 = X.EnumC35578Dxm.XSS_CALLBACK_ID_SWITCH
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto Lb9
        L91:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L97
            r3.<init>(r5)     // Catch: java.lang.Exception -> L97
            goto L9c
        L97:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L9c:
            X.2f7 r2 = new X.2f7
            r2.<init>()
            java.lang.String r1 = "__msg_type"
            java.lang.String r0 = "callback"
            r2.LIZ(r0, r1)
            java.lang.String r1 = "__callback_id"
            java.lang.String r0 = r6.LJFF
            r2.LIZ(r0, r1)
            java.lang.String r0 = "__params"
            r2.LIZ(r3, r0)
            java.lang.String r1 = r2.LIZIZ()
            goto Lcd
        Lb9:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "{\"__msg_type\":\"callback\",\"__callback_id\":\""
            r2.append(r0)
            java.lang.String r1 = r6.LJFF
            java.lang.String r0 = "\",\"__params\":"
            X.YE1.LIZLLL(r2, r1, r0, r5, r3)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
        Lcd:
            X.Ey9 r0 = r6.LJIILIIL
            if (r0 == 0) goto Le1
            r0.LIZ(r1)
        Ld4:
            X.Eyj r2 = new X.Eyj
            r2.<init>()
            java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r1 = r6.LJIIL
            java.lang.String r0 = "label_post_callback_origin_url"
            r2.LIZ(r0, r1)
            return
        Le1:
            r4.LJIIJ(r1, r6)
            goto Ld4
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38114Exa.LIZJ(java.lang.String, X.Exd):void");
    }

    public final void LIZLLL(JSONObject jSONObject, C38117Exd c38117Exd) {
        if (this.LJFF) {
            return;
        }
        if (TextUtils.isEmpty(c38117Exd.LJFF)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("By passing js callback due to empty callback: ");
            LIZ.append(jSONObject);
            X1D.LIZIZ(LIZ);
            return;
        }
        Boolean bool = c38117Exd.LJIIIIZZ;
        if (bool != null && bool.booleanValue()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("hook by BDXBridge: ");
            LIZ2.append(c38117Exd.toString());
            X1D.LIZIZ(LIZ2);
            return;
        }
        new C38185Eyj().LIZ("label_pre_callback_origin_url", c38117Exd.LJIIL);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Invoking js callback: ");
        LIZ3.append(c38117Exd.LJFF);
        X1D.LIZIZ(LIZ3);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", c38117Exd.LJFF);
            jSONObject2.put("__params", jSONObject);
            LJIIJJI(jSONObject2, c38117Exd);
            new C38185Eyj().LIZ("label_post_callback_origin_url", c38117Exd.LJIIL);
        } catch (JSONException unused) {
            LIZJ(jSONObject.toString(), c38117Exd);
        }
    }

    public void LJIIJJI(JSONObject jSONObject, C38117Exd c38117Exd) {
        LJIIJ(jSONObject.toString(), c38117Exd);
    }

    public final void LJIILL(Object obj, String str) {
        String str2;
        JSONObject jSONObject;
        if (this.LJFF) {
            return;
        }
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                jSONObject2.put("__params", obj);
                LJIIIZ(jSONObject2.toString());
                return;
            } catch (JSONException unused) {
            }
        }
        String LIZIZ = this.LIZJ.LIZIZ(obj);
        C38061Ewj c38061Ewj = C38113ExZ.LJIIJ;
        if (c38061Ewj.LIZ() != null && c38061Ewj.LIZ().LIZ(EnumC35578Dxm.XSS_CALLBACK_ID_SWITCH)) {
            try {
                jSONObject = new JSONObject(LIZIZ);
            } catch (Exception unused2) {
                jSONObject = new JSONObject();
            }
            C63932f7 c63932f7 = new C63932f7();
            c63932f7.LIZ("event", "__msg_type");
            c63932f7.LIZ(str, "__event_id");
            c63932f7.LIZ(jSONObject, "__params");
            str2 = c63932f7.LIZIZ();
        } else {
            str2 = "{\"__msg_type\":\"event\",\"__event_id\":\"" + str + "\",\"__params\":" + LIZIZ + "}";
        }
        LJIIIZ(str2);
    }

    public final void LIZ(int i, String str, String str2, String str3, List list) {
        Iterator<InterfaceC38140Ey0> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(str, str2, i, str3, new C17230lz(C38113ExZ.LJIIIZ, this.LJIIIZ, list));
        }
    }
}
