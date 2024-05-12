package X;

import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NaB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59595NaB {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C59598NaE.LJLIL);
    public final java.util.Map<Object, C59596NaC> LIZ = new LinkedHashMap();

    public final void LIZ(int i, String str, Object obj) {
        if (str != null) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                if (parse != null && o.LJ(UriProtector.getQueryParameter(parse, "_enable_stay_time_report"), "1") && UriProtector.getQueryParameter(parse, "_enter_from") != null) {
                    UriProtector.getQueryParameter(parse, "_project_name");
                    if (obj != null && this.LIZ.containsKey(obj)) {
                        if (i != 1) {
                            if (i == 2) {
                                this.LIZ.remove(obj);
                            }
                        } else {
                            Object obj2 = ((LinkedHashMap) this.LIZ).get(obj);
                            o.LJI(obj2);
                            C59596NaC c59596NaC = (C59596NaC) obj2;
                            c59596NaC.LIZJ = true;
                            c59596NaC.LIZ();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZJ(int i, String str, Object obj) {
        String queryParameter;
        String str2;
        if (str != null) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                if (parse != null && o.LJ(UriProtector.getQueryParameter(parse, "_enable_stay_time_report"), "1") && (queryParameter = UriProtector.getQueryParameter(parse, "_enter_from")) != null) {
                    String queryParameter2 = UriProtector.getQueryParameter(parse, "_project_name");
                    if (queryParameter2 == null) {
                        queryParameter2 = "unknown";
                    }
                    if (obj != null) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && this.LIZ.containsKey(obj)) {
                                    LIZIZ(obj, obj, queryParameter2, queryParameter);
                                }
                            } else if (this.LIZ.containsKey(obj)) {
                                LIZIZ(obj, obj, queryParameter2, queryParameter);
                            } else {
                                if (obj instanceof WebView) {
                                    str2 = "h5";
                                } else {
                                    str2 = "";
                                }
                                java.util.Map<Object, C59596NaC> map = this.LIZ;
                                C59596NaC c59596NaC = new C59596NaC(new C59597NaD(queryParameter2, queryParameter, str2));
                                c59596NaC.LIZIZ = System.currentTimeMillis();
                                map.put(obj, c59596NaC);
                            }
                        } else if (this.LIZ.containsKey(obj)) {
                            Object obj2 = ((LinkedHashMap) this.LIZ).get(obj);
                            o.LJI(obj2);
                            C59596NaC c59596NaC2 = (C59596NaC) obj2;
                            if (c59596NaC2.LIZJ) {
                                c59596NaC2.LIZJ = false;
                                c59596NaC2.LIZIZ = System.currentTimeMillis();
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZIZ(Object obj, Object obj2, String str, String str2) {
        String str3;
        Object obj3 = ((LinkedHashMap) this.LIZ).get(obj);
        o.LJI(obj3);
        C59596NaC c59596NaC = (C59596NaC) obj3;
        if (o.LJ(c59596NaC.LIZ.LJLIL, str) && o.LJ(c59596NaC.LIZ.LJLILLLLZI, str2)) {
            obj3 = null;
        }
        C59596NaC c59596NaC2 = (C59596NaC) obj3;
        if (c59596NaC2 != null) {
            c59596NaC2.LIZ();
            this.LIZ.remove(obj);
            if (obj2 != null && (obj2 instanceof WebView)) {
                str3 = "h5";
            } else {
                str3 = "";
            }
            java.util.Map<Object, C59596NaC> map = this.LIZ;
            C59596NaC c59596NaC3 = new C59596NaC(new C59597NaD(str, str2, str3));
            c59596NaC3.LIZIZ = System.currentTimeMillis();
            map.put(obj, c59596NaC3);
        }
    }
}
