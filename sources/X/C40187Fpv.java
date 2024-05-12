package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fpv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40187Fpv {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C40190Fpy.LJLIL);
    public final java.util.Map<Object, C40188Fpw> LIZ = new LinkedHashMap();

    public final void LIZ(int i, String str, InterfaceC60761Nsz interfaceC60761Nsz) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                if (parse != null && o.LJ(UriProtector.getQueryParameter(parse, "_enable_stay_time_report"), "1") && UriProtector.getQueryParameter(parse, "_enter_from") != null) {
                    HashMap hashMap = new HashMap();
                    String queryParameter = UriProtector.getQueryParameter(parse, "_extra_query");
                    if (queryParameter != null) {
                        try {
                            if (TextUtils.isEmpty(queryParameter)) {
                                jSONObject = new JSONObject();
                            } else {
                                jSONObject = new JSONObject(queryParameter);
                            }
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                        Iterator<String> keys = jSONObject.keys();
                        o.LJIIIIZZ(keys, "jsonObject.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj = jSONObject.get(next);
                            o.LJII(obj, "null cannot be cast to non-null type java.lang.Object");
                            hashMap.put(next, obj);
                        }
                    }
                    UriProtector.getQueryParameter(parse, "_project_name");
                    if (interfaceC60761Nsz != null && this.LIZ.containsKey(interfaceC60761Nsz)) {
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            this.LIZ.remove(interfaceC60761Nsz);
                        } else {
                            C40188Fpw c40188Fpw = (C40188Fpw) ((LinkedHashMap) this.LIZ).get(interfaceC60761Nsz);
                            if (c40188Fpw == null) {
                                return;
                            }
                            c40188Fpw.LIZJ = true;
                            c40188Fpw.LIZ();
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final void LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz, String str, EnumC39924Flg enumC39924Flg, int i) {
        String queryParameter;
        JSONObject jSONObject;
        C40188Fpw c40188Fpw;
        if (str != null) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                if (parse != null && o.LJ(UriProtector.getQueryParameter(parse, "_enable_stay_time_report"), "1") && (queryParameter = UriProtector.getQueryParameter(parse, "_enter_from")) != null) {
                    HashMap hashMap = new HashMap();
                    String queryParameter2 = UriProtector.getQueryParameter(parse, "_extra_query");
                    if (queryParameter2 != null) {
                        try {
                            if (TextUtils.isEmpty(queryParameter2)) {
                                jSONObject = new JSONObject();
                            } else {
                                jSONObject = new JSONObject(queryParameter2);
                            }
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                        Iterator<String> keys = jSONObject.keys();
                        o.LJIIIIZZ(keys, "jsonObject.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj = jSONObject.get(next);
                            o.LJII(obj, "null cannot be cast to non-null type java.lang.Object");
                            hashMap.put(next, obj);
                        }
                    }
                    String queryParameter3 = UriProtector.getQueryParameter(parse, "_project_name");
                    if (queryParameter3 == null) {
                        queryParameter3 = "unknown";
                    }
                    if (interfaceC60761Nsz != null) {
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            if (this.LIZ.containsKey(interfaceC60761Nsz)) {
                                C40188Fpw c40188Fpw2 = (C40188Fpw) ((LinkedHashMap) this.LIZ).get(interfaceC60761Nsz);
                                if (c40188Fpw2 == null) {
                                    return;
                                }
                                if (o.LJ(c40188Fpw2.LIZ.LIZ, queryParameter3) && o.LJ(c40188Fpw2.LIZ.LIZIZ, queryParameter)) {
                                    return;
                                }
                                c40188Fpw2.LIZ();
                                this.LIZ.remove(interfaceC60761Nsz);
                                java.util.Map<Object, C40188Fpw> map = this.LIZ;
                                C40188Fpw c40188Fpw3 = new C40188Fpw(new C40184Fps(queryParameter3, queryParameter, hashMap, enumC39924Flg));
                                c40188Fpw3.LIZIZ();
                                map.put(interfaceC60761Nsz, c40188Fpw3);
                                return;
                            }
                            java.util.Map<Object, C40188Fpw> map2 = this.LIZ;
                            C40188Fpw c40188Fpw4 = new C40188Fpw(new C40184Fps(queryParameter3, queryParameter, hashMap, enumC39924Flg));
                            c40188Fpw4.LIZIZ();
                            map2.put(interfaceC60761Nsz, c40188Fpw4);
                            return;
                        }
                        if (!this.LIZ.containsKey(interfaceC60761Nsz) || (c40188Fpw = (C40188Fpw) ((LinkedHashMap) this.LIZ).get(interfaceC60761Nsz)) == null || !c40188Fpw.LIZJ) {
                            return;
                        }
                        c40188Fpw.LIZJ = false;
                        c40188Fpw.LIZIZ();
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
