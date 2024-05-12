package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ewu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38072Ewu {
    public final LruCache<String, C38076Ewy> LIZIZ;
    public final InterfaceC38068Ewq LIZJ;
    public final String LIZLLL;
    public java.util.Map<String, List<C38075Ewx>> LIZ = new ConcurrentHashMap();
    public volatile boolean LJ = false;

    public static String LIZJ(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("[.]")).length) < 2) {
            return null;
        }
        if (length == 2) {
            return str;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(split[length - 2]);
        LIZ.append(".");
        LIZ.append(split[length - 1]);
        return X1D.LIZIZ(LIZ);
    }

    public static C38075Ewx LJ(JSONObject jSONObject) {
        C38075Ewx c38075Ewx = new C38075Ewx();
        c38075Ewx.LIZ = PatternProtector.compile(JSONObjectProtectorUtils.getString(jSONObject, "pattern"));
        c38075Ewx.LIZIZ = EnumC38078Ex0.from(JSONObjectProtectorUtils.getString(jSONObject, "group"));
        c38075Ewx.LIZJ = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                c38075Ewx.LIZJ.add(JSONArrayProtectorUtils.getString(optJSONArray, i));
            }
        }
        c38075Ewx.LIZLLL = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                c38075Ewx.LIZLLL.add(JSONArrayProtectorUtils.getString(optJSONArray2, i2));
            }
        }
        return c38075Ewx;
    }

    public final List<C38075Ewx> LIZ(String str) {
        if (this.LJ) {
            return this.LIZ.get(str);
        }
        throw new C38077Ewz("Permission config is outdated!");
    }

    public final void LIZLLL(List list, JSONObject jSONObject) {
        try {
            C38185Eyj c38185Eyj = new C38185Eyj();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "content");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, next);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    copyOnWriteArrayList.add(LJ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i)));
                }
                concurrentHashMap.put(next, copyOnWriteArrayList);
                c38185Eyj.LIZJ(Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "package_version")), JSONObjectProtectorUtils.getString(jSONObject, "channel"));
            }
            this.LIZ = concurrentHashMap;
            c38185Eyj.LIZ("label_parse_config", list);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Parse configurations failed, response: ");
            LIZ.append(jSONObject.toString());
            X1D.LIZIZ(LIZ);
            if (list != null) {
                C38185Eyj c38185Eyj2 = new C38185Eyj();
                c38185Eyj2.LIZJ(C16880lQ.LJLLJ(e.getClass()), "exception_name");
                c38185Eyj2.LIZJ(e.getMessage(), "exception_message");
                c38185Eyj2.LIZJ(jSONObject.toString(), "value");
                c38185Eyj2.LIZ("label_parse_config_exception", list);
            }
        }
        this.LIZIZ.evictAll();
        this.LJ = true;
    }

    public final C38076Ewy LIZIZ(String str, List<TimeLineEvent> list, C37960Ev6 c37960Ev6) {
        android.net.Uri parse = UriProtector.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        C38076Ewy c38076Ewy = new C38076Ewy();
        Object obj = "null";
        if (authority == null || authority.isEmpty()) {
            C38185Eyj c38185Eyj = new C38185Eyj();
            c38185Eyj.LIZJ("null", "host");
            c38185Eyj.LIZ("label_permission_checker_null_host", list);
            c38076Ewy.LIZ = EnumC38078Ex0.PUBLIC;
            if (c37960Ev6 != null) {
                c37960Ev6.LIZJ(3);
            }
            return c38076Ewy;
        }
        C38076Ewy c38076Ewy2 = this.LIZIZ.get(builder);
        if (c38076Ewy2 != null) {
            C38185Eyj c38185Eyj2 = new C38185Eyj();
            c38185Eyj2.LIZJ("from_cache", "from");
            c38185Eyj2.LIZJ(c38076Ewy2.LIZ.toString(), "rule_permission_group");
            c38185Eyj2.LIZJ(c38076Ewy2.LIZIZ.toString(), "rule_included_method");
            c38185Eyj2.LIZJ(c38076Ewy2.LIZJ.toString(), "rule_excluded_method");
            c38185Eyj2.LIZ("label_permission_checker_cache_rule", list);
            return c38076Ewy2;
        }
        C38076Ewy c38076Ewy3 = new C38076Ewy();
        android.net.Uri parse2 = UriProtector.parse(builder);
        String scheme2 = parse2.getScheme();
        String authority2 = parse2.getAuthority();
        String LIZJ = LIZJ(authority2);
        if (TextUtils.isEmpty(scheme2) || TextUtils.isEmpty(authority2) || LIZJ == null) {
            this.LIZIZ.put(builder, c38076Ewy3);
            if (c37960Ev6 != null) {
                c37960Ev6.LIZJ(3);
            }
        } else {
            List<C38075Ewx> LIZ = LIZ(LIZJ);
            C38185Eyj c38185Eyj3 = new C38185Eyj();
            c38185Eyj3.LIZJ(LIZJ, "shortened_host");
            if (LIZ != null) {
                obj = Integer.valueOf(LIZ.size());
            }
            c38185Eyj3.LIZJ(obj, "config_size");
            c38185Eyj3.LIZ("label_permission_checker_remote_config", list);
            if (LIZ == null) {
                c38076Ewy3.LIZ = EnumC38078Ex0.PUBLIC;
                this.LIZIZ.put(builder, c38076Ewy3);
                if (c37960Ev6 != null) {
                    c37960Ev6.LIZJ(4);
                }
            } else {
                for (C38075Ewx c38075Ewx : LIZ) {
                    if (c38075Ewx.LIZ.matcher(builder).find()) {
                        if (c38075Ewx.LIZIZ.compareTo(c38076Ewy3.LIZ) >= 0) {
                            c38076Ewy3.LIZ = c38075Ewx.LIZIZ;
                        }
                        c38076Ewy3.LIZIZ.addAll(c38075Ewx.LIZJ);
                        c38076Ewy3.LIZJ.addAll(c38075Ewx.LIZLLL);
                    } else if (c37960Ev6 != null) {
                        c37960Ev6.LIZJ(0);
                    }
                }
                this.LIZIZ.put(builder, c38076Ewy3);
                C38185Eyj c38185Eyj4 = new C38185Eyj();
                c38185Eyj4.LIZJ("from_merge", "from");
                c38185Eyj4.LIZJ(c38076Ewy3.LIZ.toString(), "rule_permission_group");
                c38185Eyj4.LIZJ(c38076Ewy3.LIZIZ.toString(), "rule_included_method");
                c38185Eyj4.LIZJ(c38076Ewy3.LIZJ.toString(), "rule_excluded_method");
                c38185Eyj4.LIZ("label_permission_checker_merge_remote_config", list);
            }
        }
        C38185Eyj c38185Eyj5 = new C38185Eyj();
        c38185Eyj5.LIZJ("from_create", "from");
        c38185Eyj5.LIZ("label_permission_checker", list);
        return c38076Ewy3;
    }

    public C38072Ewu(String str, int i, InterfaceC38068Ewq interfaceC38068Ewq, Executor executor, JSONObject jSONObject, List list, C38062Ewk c38062Ewk) {
        this.LIZLLL = str;
        if (i <= 0) {
            this.LIZIZ = new LruCache<>(16);
        } else {
            this.LIZIZ = new LruCache<>(i);
        }
        this.LIZJ = interfaceC38068Ewq;
        if (jSONObject == null) {
            interfaceC38068Ewq.LIZIZ(i0.LJFF("com.bytedance.ies.web.jsbridge2.PermissionConfig.", str), new C38074Eww(this, list, c38062Ewk, str, executor));
            return;
        }
        LIZLLL(list, jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("com.bytedance.ies.web.jsbridge2.PermissionConfig.");
        LIZ.append(str);
        interfaceC38068Ewq.LIZ(X1D.LIZIZ(LIZ), jSONObject.toString());
    }
}
