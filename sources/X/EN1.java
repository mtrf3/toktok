package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourcePreloadConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EN1 implements InterfaceC65104Pgq {
    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        o.LJIIIZ(request, "request");
        String path = request.getPath();
        o.LJIIIIZZ(path, "request.path");
        EcomResourcePreloadConfig.LIZ.getClass();
        if (((LinkedHashMap) EcomResourcePreloadConfig.LIZIZ).keySet().contains(path) && c64797Pbt != null && c64797Pbt.LIZIZ()) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C78756UvY(this, c64797Pbt, request, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.util.ArrayList] */
    public static void LJIIJ(int i, Object obj, List list, List list2) {
        Object obj2;
        List LJLJJL;
        boolean z;
        Object obj3;
        java.util.Map map;
        List list3;
        String str;
        if (obj == null) {
            return;
        }
        if (i == list.size()) {
            if (!(obj instanceof String)) {
                return;
            }
            ((ArrayList) list2).add(obj);
            return;
        }
        String str2 = (String) ListProtector.get(list, i);
        if (!(obj instanceof java.util.Map)) {
            return;
        }
        if (s.LJJJLZIJ(str2, ".", false)) {
            List LJLJJL2 = s.LJLJJL(str2, new String[]{"."}, 0, 6);
            if (LJLJJL2.size() < 2) {
                return;
            }
            ?? r1 = ((java.util.Map) obj).get(ListProtector.get(LJLJJL2, 0));
            List<String> subList = LJLJJL2.subList(1, LJLJJL2.size());
            T t = 0;
            if (r1 != 0) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = r1;
                for (String str3 : subList) {
                    if (c68322mC.element != 0) {
                        if (o.LJ(str3, "jsonify")) {
                            T t2 = c68322mC.element;
                            if (t2 instanceof String) {
                                str = (String) t2;
                            } else {
                                str = t;
                            }
                            c68322mC.element = C27739Aud.LJII(str);
                        } else if (o.LJ(str3, "all")) {
                            T t3 = c68322mC.element;
                            boolean z2 = t3 instanceof List;
                            T t4 = t3;
                            if (!z2) {
                                t4 = t;
                            }
                            c68322mC.element = t4;
                        } else if (TextUtils.isDigitsOnly(str3)) {
                            T t5 = c68322mC.element;
                            if ((t5 instanceof List) && (list3 = (List) t5) != null) {
                                try {
                                    t = ListProtector.get(list3, CastIntegerProtector.parseInt(str3));
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable unused) {
                                }
                            }
                            c68322mC.element = t;
                        } else if (ujb.o.LJJJLIIL(str3, "if(", false) && ujb.o.LJJJJ(str3, ")", false)) {
                            String LJLLI = s.LJLLI(str3, "if(", str3);
                            String LJLLL = s.LJLLL(LJLLI, ")", LJLLI);
                            if (s.LJJJLZIJ(LJLLL, "==", false)) {
                                LJLJJL = s.LJLJJL(LJLLL, new String[]{"=="}, 0, 6);
                                z = true;
                            } else if (s.LJJJLZIJ(LJLLL, "!=", false)) {
                                LJLJJL = s.LJLJJL(LJLLL, new String[]{"!="}, 0, 6);
                                z = false;
                            }
                            if (LJLJJL.size() >= 2) {
                                T t6 = c68322mC.element;
                                if (t6 instanceof java.util.Map) {
                                    o.LJII(t6, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                    String valueOf = String.valueOf(((java.util.Map) t6).get(ListProtector.get(LJLJJL, 0)));
                                    Object obj4 = ListProtector.get(LJLJJL, 1);
                                    if (z) {
                                        if (o.LJ(valueOf, obj4)) {
                                        }
                                        c68322mC.element = t;
                                    } else {
                                        if (!o.LJ(valueOf, obj4)) {
                                        }
                                        c68322mC.element = t;
                                    }
                                } else if (t6 instanceof List) {
                                    o.LJII(t6, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                    ?? arrayList = new ArrayList();
                                    for (Object obj5 : (List) t6) {
                                        if ((obj5 instanceof java.util.Map) && (map = (java.util.Map) obj5) != null) {
                                            obj3 = map.get(ListProtector.get(LJLJJL, 0));
                                        } else {
                                            obj3 = null;
                                        }
                                        String valueOf2 = String.valueOf(obj3);
                                        Object obj6 = ListProtector.get(LJLJJL, 1);
                                        if (z) {
                                            if (o.LJ(valueOf2, obj6)) {
                                                arrayList.add(obj5);
                                            }
                                        } else if (!o.LJ(valueOf2, obj6)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                    c68322mC.element = arrayList;
                                }
                            }
                        }
                    }
                    t = 0;
                }
                obj2 = c68322mC.element;
            }
            obj2 = null;
            break;
        }
        obj2 = ((java.util.Map) obj).get(str2);
        if (obj2 instanceof String) {
            LJIIJ(i + 1, obj2, list, list2);
            return;
        }
        if (obj2 instanceof java.util.Map) {
            LJIIJ(i + 1, obj2, list, list2);
        } else {
            if (!(obj2 instanceof List)) {
                return;
            }
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                LJIIJ(i + 1, it.next(), list, list2);
            }
        }
    }
}
