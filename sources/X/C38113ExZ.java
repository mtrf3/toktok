package X;

import Y.IDRunnableS0S0201000;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ExZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38113ExZ {
    public static final C38060Ewi LJI = new C38060Ewi();
    public static InterfaceExecutorC38087Ex9 LJII = null;
    public static final Object LJIIIIZZ = new Object();
    public static final List<TimeLineEvent> LJIIIZ = new CopyOnWriteArrayList();
    public static final C38061Ewj LJIIJ = new C38061Ewj();
    public final AbstractC38114Exa LIZ;
    public final WebView LIZIZ;
    public final C38116Exc LIZJ;
    public final List<InterfaceC38147Ey7> LIZLLL;
    public C38118Exe LJ;
    public volatile boolean LJFF;

    public final void LJ() {
        if (this.LJFF) {
            return;
        }
        this.LIZ.LJIILIIL();
        this.LJFF = true;
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            InterfaceC38147Ey7 interfaceC38147Ey7 = (InterfaceC38147Ey7) it.next();
            if (interfaceC38147Ey7 != null) {
                interfaceC38147Ey7.LIZ();
            }
        }
    }

    public C38113ExZ(C38116Exc c38116Exc) {
        C38072Ewu c38072Ewu;
        AbstractC38143Ey3 abstractC38143Ey3;
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        this.LJFF = false;
        this.LIZJ = c38116Exc;
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(Boolean.valueOf(c38116Exc.LJIIIIZZ), "enable_permission_check");
        C38060Ewi c38060Ewi = LJI;
        c38185Eyj.LIZJ(Boolean.valueOf(c38060Ewi.LIZ() != null), "permission_config_repository");
        c38185Eyj.LIZ("label_create_jsb_instance", c38116Exc.LJIILLIIL);
        if (c38116Exc.LJIIIIZZ && c38060Ewi.LIZ() != null) {
            c38072Ewu = c38060Ewi.LIZ().LIZJ(c38116Exc.LJIIJJI, c38116Exc.LJIILLIIL);
        } else {
            c38072Ewu = null;
        }
        if (c38116Exc.LIZ != null) {
            this.LIZ = new C38115Exb();
        } else {
            this.LIZ = c38116Exc.LIZJ;
        }
        AbstractC38114Exa abstractC38114Exa = this.LIZ;
        abstractC38114Exa.LIZ = abstractC38114Exa.LJ(c38116Exc);
        abstractC38114Exa.LIZJ = c38116Exc.LJ;
        abstractC38114Exa.LIZIZ = c38116Exc.LJIIIZ;
        abstractC38114Exa.LJII = new C38112ExY(c38116Exc, abstractC38114Exa, c38072Ewu);
        abstractC38114Exa.LJ = c38116Exc.LJIIJJI;
        abstractC38114Exa.LJIIIZ = c38116Exc.LJIILLIIL;
        WebView webView = c38116Exc.LIZ;
        if (webView != null) {
            abstractC38143Ey3 = new C38142Ey2(webView);
        } else {
            abstractC38143Ey3 = c38116Exc.LIZIZ;
        }
        abstractC38114Exa.LJI = abstractC38143Ey3;
        abstractC38114Exa.LJIIIIZZ(c38116Exc);
        this.LIZIZ = c38116Exc.LIZ;
        arrayList.add(c38116Exc.LJIIJ);
        C1A7.LJLIL = c38116Exc.LJI;
        C79081V1x.LJLIL = c38116Exc.LJII;
    }

    public final void LIZIZ(C38113ExZ c38113ExZ) {
        C38118Exe c38118Exe;
        ((HashMap) this.LIZ.LJIIIIZZ).put("host", c38113ExZ.LIZ.LJII);
        C38118Exe c38118Exe2 = this.LJ;
        if (c38118Exe2 != null && (c38118Exe = c38113ExZ.LJ) != null) {
            c38118Exe2.LIZLLL.putAll(c38118Exe.LIZLLL);
            ((CopyOnWriteArraySet) c38118Exe2.LJ).addAll(c38118Exe.LJ);
        }
        ((ArrayList) this.LIZLLL).add(new C38144Ey4(c38113ExZ));
    }

    public static void LIZ(boolean z, C38064Ewm c38064Ewm) {
        C38060Ewi c38060Ewi = LJI;
        if (c38060Ewi.LIZ() != null) {
            if (z) {
                C38065Ewn LIZ = c38060Ewi.LIZ();
                LIZ.getClass();
                C38185Eyj c38185Eyj = new C38185Eyj();
                c38185Eyj.LIZJ(Boolean.TRUE, "fetch_permission_config");
                c38185Eyj.LIZ("label_enable_permission_check", LJIIIZ);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    LIZ.LIZJ.getClass();
                    jSONObject2.put("aid", EF7.LJIIIZ);
                    LIZ.LIZJ.getClass();
                    jSONObject2.put("app_version", EF7.LIZLLL());
                    jSONObject2.put("os", 0);
                    LIZ.LIZJ.getClass();
                    jSONObject2.put("device_id", AppLog.getServerDeviceId());
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("channel", "_jsb_auth");
                    jSONObject3.put("local_version", 0);
                    jSONArray.put(jSONObject3);
                    for (String str : LIZ.LIZ) {
                        JSONObject jSONObject4 = new JSONObject();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("_jsb_auth.");
                        LIZ2.append(str);
                        jSONObject4.put("channel", X1D.LIZIZ(LIZ2));
                        jSONObject4.put("local_version", 0);
                        jSONArray.put(jSONObject4);
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(((JsBridge2PermissionConfigurator) LIZ.LIZJ).LIZIZ(), jSONArray);
                    jSONObject.put("common", jSONObject2);
                    jSONObject.put("deployment", jSONObject5);
                } catch (JSONException e) {
                    C38185Eyj c38185Eyj2 = new C38185Eyj();
                    c38185Eyj2.LIZJ(C16880lQ.LJLLJ(e.getClass()), "exception_name");
                    c38185Eyj2.LIZJ(e.getMessage(), "exception_message");
                    c38185Eyj2.LIZJ(jSONObject.toString(), "param");
                    c38185Eyj2.LIZ("label_create_fetch_param_exception", LJIIIZ);
                }
                LIZ.LIZIZ(c38064Ewm, jSONObject.toString());
                return;
            }
            C38065Ewn LIZ3 = c38060Ewi.LIZ();
            LIZ3.LJFF.execute(new IDRunnableS0S0201000(1, LIZ3, c38064Ewm, 6));
        }
    }

    public final void LIZJ(String str, InterfaceC31920Cfs interfaceC31920Cfs) {
        if (this.LJFF) {
            IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
            if (C1A7.LJLIL) {
                throw illegalStateException;
            }
        }
        ((HashMap) this.LIZ.LJII.LIZLLL).put(str, interfaceC31920Cfs);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsBridge stateful method registered: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C38118Exe c38118Exe = this.LJ;
        if (c38118Exe != null) {
            ((CopyOnWriteArraySet) c38118Exe.LJ).remove(str);
            C38120Exg c38120Exg = c38118Exe.LIZJ;
            if (c38120Exg != null) {
                c38118Exe.LIZIZ.LJI(str, c38120Exg);
            }
        }
    }

    public final void LIZLLL(String str, AbstractC38127Exn abstractC38127Exn) {
        if (this.LJFF) {
            IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
            if (C1A7.LJLIL) {
                throw illegalStateException;
            }
        }
        C38112ExY c38112ExY = this.LIZ.LJII;
        c38112ExY.getClass();
        abstractC38127Exn.name = str;
        ((HashMap) c38112ExY.LIZJ).put(str, abstractC38127Exn);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsBridge stateless method registered: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C38118Exe c38118Exe = this.LJ;
        if (c38118Exe != null) {
            ((CopyOnWriteArraySet) c38118Exe.LJ).remove(str);
            C38120Exg c38120Exg = c38118Exe.LIZJ;
            if (c38120Exg != null) {
                c38118Exe.LIZIZ.LJI(str, c38120Exg);
            }
        }
    }
}
