package X;

import Y.ARunnableS25S0200000_6;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;
import defpackage.a1;
import defpackage.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ewn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38065Ewn {
    public final Collection<String> LIZ;
    public final InterfaceC38033EwH LIZJ;
    public final String LJ;
    public final Executor LJFF;
    public final java.util.Map<String, C38072Ewu> LIZIZ = new ConcurrentHashMap();
    public final java.util.Set<InterfaceC38070Ews> LIZLLL = new CopyOnWriteArraySet();
    public final Handler LJI = new Handler(C16880lQ.LLJJJJ());
    public volatile boolean LJII = false;
    public final C38062Ewk LJIIIIZZ = new C38062Ewk();
    public final AtomicInteger LJIIIZ = new AtomicInteger(0);

    public C38065Ewn(InterfaceC38033EwH interfaceC38033EwH) {
        this.LIZJ = interfaceC38033EwH;
        if (TextUtils.isEmpty("https://jsb-va.tiktokv.com/src/server/v2/package")) {
            this.LJ = ((JsBridge2PermissionConfigurator) interfaceC38033EwH).LJ().url;
        } else {
            this.LJ = "https://jsb-va.tiktokv.com/src/server/v2/package";
        }
        this.LJFF = C38995FSd.LIZJ();
        this.LIZ = new LinkedList(((JsBridge2PermissionConfigurator) interfaceC38033EwH).LIZJ());
    }

    public final void LIZIZ(InterfaceC38069Ewr interfaceC38069Ewr, String str) {
        ((JsBridge2PermissionConfigurator) this.LIZJ).LIZ(this.LJ, str.getBytes(), new C38066Ewo(this, interfaceC38069Ewr, str));
    }

    public final C38072Ewu LIZJ(String str, List<TimeLineEvent> list) {
        if (((LinkedList) this.LIZ).contains(str) || TextUtils.equals(str, "host")) {
            return LIZ(str, list, null);
        }
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(str, "namespace");
        c38185Eyj.LIZJ(str, "list");
        c38185Eyj.LIZ("label_illegal_namespace", list);
        throw new IllegalArgumentException(a1.LJ("Namespace: ", str, " not registered."));
    }

    public static void LJ(String str, String str2, String str3) {
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZLLL();
        c38185Eyj.LIZJ(str2, "from");
        c38185Eyj.LIZ = "label_parse_package_version";
        if (!TextUtils.isEmpty(str3)) {
            c38185Eyj.LIZJ(str3, "url");
        }
        if (TextUtils.isEmpty(str)) {
            c38185Eyj.LIZJ("null", "response");
            ((CopyOnWriteArrayList) C38113ExZ.LJIIIZ).add(c38185Eyj.LIZIZ());
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject == null) {
                c38185Eyj.LIZJ(str, "response");
                ((CopyOnWriteArrayList) C38113ExZ.LJIIIZ).add(c38185Eyj.LIZIZ());
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("packages");
            if (optJSONObject2 == null) {
                c38185Eyj.LIZJ(str, "response");
                ((CopyOnWriteArrayList) C38113ExZ.LJIIIZ).add(c38185Eyj.LIZIZ());
                return;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(optJSONObject2, next);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "channel");
                    Long valueOf = Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "package_version"));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(next);
                    LIZ.append("_");
                    LIZ.append(string);
                    c38185Eyj.LIZJ(valueOf, X1D.LIZIZ(LIZ));
                }
                if (str2 == "from_network" || str2 == "from_merge") {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str2);
                    LIZ2.append("_");
                    LIZ2.append("Internet");
                    C37985EvV.LIZ("JSBridge2", X1D.LIZIZ(LIZ2), jSONArray);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    LIZ3.append("_");
                    LIZ3.append("Internet");
                    C37985EvV.LIZ("BDXBridge", X1D.LIZIZ(LIZ3), jSONArray);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str2);
                    LIZ4.append("_");
                    LIZ4.append("build_in");
                    C37985EvV.LIZ("JSBridge2", X1D.LIZIZ(LIZ4), jSONArray);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(str2);
                    LIZ5.append("_");
                    LIZ5.append("build_in");
                    C37985EvV.LIZ("BDXBridge", X1D.LIZIZ(LIZ5), jSONArray);
                }
            }
            ((CopyOnWriteArrayList) C38113ExZ.LJIIIZ).add(c38185Eyj.LIZIZ());
        } catch (JSONException e) {
            c38185Eyj.LIZJ(str, "response");
            c38185Eyj.LIZJ(C16880lQ.LJLLJ(e.getClass()), "exception_name");
            c38185Eyj.LIZJ(e.getMessage(), "exception_message");
            ((CopyOnWriteArrayList) C38113ExZ.LJIIIZ).add(c38185Eyj.LIZIZ());
        }
    }

    public final C38072Ewu LIZ(String str, List list, JSONObject jSONObject) {
        if (this.LJIIIIZZ.LIZ() != null) {
            this.LJIIIIZZ.LIZ().LIZ(str, jSONObject);
        }
        C38072Ewu c38072Ewu = (C38072Ewu) ((ConcurrentHashMap) this.LIZIZ).get(str);
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(str, "namespace");
        if (c38072Ewu == null) {
            this.LIZJ.getClass();
            this.LIZJ.getClass();
            C38031EwF c38031EwF = new C38031EwF();
            this.LIZJ.getClass();
            C38072Ewu c38072Ewu2 = new C38072Ewu(str, 128, c38031EwF, C38995FSd.LIZJ(), jSONObject, list, this.LJIIIIZZ);
            ((ConcurrentHashMap) this.LIZIZ).put(str, c38072Ewu2);
            c38185Eyj.LIZ("label_repository_create_config", list);
            return c38072Ewu2;
        }
        if (jSONObject == null) {
            return c38072Ewu;
        }
        c38072Ewu.LIZLLL(list, jSONObject);
        c38072Ewu.LIZJ.LIZ(i0.LJFF("com.bytedance.ies.web.jsbridge2.PermissionConfig.", c38072Ewu.LIZLLL), jSONObject.toString());
        c38185Eyj.LIZ("label_repository_update_config", list);
        return c38072Ewu;
    }

    public final void LIZLLL(boolean z, final String str, InterfaceC38069Ewr interfaceC38069Ewr) {
        if (!TextUtils.isEmpty(str)) {
            if (!z) {
                this.LIZJ.getClass();
                new C38031EwF().LIZIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new InterfaceC38034EwI() { // from class: X.Ewp
                    @Override // X.InterfaceC38034EwI
                    public final void LIZ(String str2) {
                        JSONObject optJSONObject;
                        JSONObject optJSONObject2;
                        C38065Ewn c38065Ewn = C38065Ewn.this;
                        String str3 = str;
                        c38065Ewn.getClass();
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            if (jSONObject.optInt("status") == 0) {
                                JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                                if (optJSONObject3 == null) {
                                    optJSONObject = null;
                                } else {
                                    optJSONObject = optJSONObject3.optJSONObject("packages");
                                }
                                if (optJSONObject == null || TextUtils.isEmpty(str2)) {
                                    c38065Ewn.LIZJ.getClass();
                                    new C38031EwF().LIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str3);
                                    return;
                                }
                                JSONObject jSONObject2 = new JSONObject(str2);
                                JSONObject optJSONObject4 = jSONObject2.optJSONObject("data");
                                if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("packages")) != null) {
                                    Iterator<String> keys = optJSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        optJSONObject2.put(next, JSONObjectProtectorUtils.getJSONArray(optJSONObject, next));
                                    }
                                    String jSONObject3 = jSONObject2.toString();
                                    c38065Ewn.LIZJ.getClass();
                                    new C38031EwF().LIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", jSONObject3);
                                    C38065Ewn.LJ(jSONObject3, "from_merge", null);
                                    return;
                                }
                                c38065Ewn.LIZJ.getClass();
                                new C38031EwF().LIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str3);
                            }
                        } catch (JSONException e) {
                            C38185Eyj c38185Eyj = new C38185Eyj();
                            c38185Eyj.LIZJ(C16880lQ.LJLLJ(e.getClass()), "exception_name");
                            c38185Eyj.LIZJ(e.getMessage(), "exception_message");
                            c38185Eyj.LIZJ(str3, "response");
                            c38185Eyj.LIZJ(str2, "value");
                            c38185Eyj.LIZ("label_repository_merge_config_exception", C38113ExZ.LJIIIZ);
                        }
                    }
                });
            }
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data"), "packages"), ((JsBridge2PermissionConfigurator) this.LIZJ).LIZIZ());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    String optString = jSONObject.optString("channel");
                    if (TextUtils.equals(optString, "_jsb_auth")) {
                        LIZ("host", C38113ExZ.LJIIIZ, jSONObject);
                    } else if (optString.startsWith("_jsb_auth.")) {
                        LIZ(optString.replace("_jsb_auth.", ""), C38113ExZ.LJIIIZ, jSONObject);
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Malformed config: ");
                        LIZ.append(jSONObject.toString());
                        X1D.LIZIZ(LIZ);
                    }
                }
                C38185Eyj c38185Eyj = new C38185Eyj();
                c38185Eyj.LIZJ(((JsBridge2PermissionConfigurator) this.LIZJ).LIZIZ(), "key");
                c38185Eyj.LIZ("label_repository_parse_config", C38113ExZ.LJIIIZ);
            } catch (JSONException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Parse configurations failed, url: ");
                LIZ2.append(this.LJ);
                LIZ2.append(", response: ");
                LIZ2.append(str);
                X1D.LIZIZ(LIZ2);
                C38185Eyj c38185Eyj2 = new C38185Eyj();
                c38185Eyj2.LIZJ(C16880lQ.LJLLJ(e.getClass()), "exception_name");
                c38185Eyj2.LIZJ(e.getMessage(), "exception_message");
                if (TextUtils.isEmpty(str)) {
                    str = "null";
                }
                c38185Eyj2.LIZJ(str, "response");
                c38185Eyj2.LIZ("label_repository_parse_config_exception", C38113ExZ.LJIIIZ);
            }
            this.LJII = true;
            C38185Eyj c38185Eyj3 = new C38185Eyj();
            c38185Eyj3.LIZJ("true", "config_repository_fetched");
            c38185Eyj3.LIZ("label_permission_checker_fetch", C38113ExZ.LJIIIZ);
            this.LJI.post(new ARunnableS25S0200000_6(this, interfaceC38069Ewr, 5));
        }
    }
}
