package X;

import android.app.Activity;
import android.app.Fragment;
import android.webkit.PermissionRequest;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Px6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66112Px6 implements InterfaceC66094Pwo {
    public static final C66112Px6 LIZIZ = new C66112Px6();
    public static final List<InterfaceC35988EAm> LIZ = C47261Igj.LJJIJIL(C35985EAj.LIZ, new InterfaceC35988EAm() { // from class: X.2aP
        @Override // X.InterfaceC35988EAm
        public final boolean LIZIZ(Object[] objArr, m mVar) {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final List<Integer> LIZ() {
            return C47261Igj.LJJIJ(100003);
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZLLL(List<? extends Object> list) {
            Object obj;
            String str;
            if (list != null && list.size() == 3 && !(!o.LJ(String.valueOf(ListProtector.get(list, 0)), "geo_location_show_prompt")) && (obj = ListProtector.get(list, 1)) != null && (obj instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 0) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        str = obj2.toString();
                    } else {
                        str = null;
                    }
                    if (ListProtector.get(list, 2) != null) {
                        return !ORZ.LJLJJI(str, (Iterable) r0);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
            }
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final java.util.Map<String, Object> LJ(Object[] objArr) {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (objArr != null && objArr.length != 0) {
                Object obj = objArr[0];
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                linkedHashMap.put("origin", str);
            }
            return linkedHashMap;
        }
    }, new InterfaceC35988EAm() { // from class: X.2aQ
        @Override // X.InterfaceC35988EAm
        public final boolean LIZIZ(Object[] objArr, m mVar) {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final List<Integer> LIZ() {
            return C47261Igj.LJJIJ(100012);
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZLLL(List<? extends Object> list) {
            Object obj;
            String str;
            if (list != null && list.size() == 3 && !(!o.LJ(String.valueOf(ListProtector.get(list, 0)), "geo_location_invoke")) && (obj = ListProtector.get(list, 1)) != null && (obj instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 0) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof Boolean) {
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            Object obj3 = objArr[0];
                            if (obj3 != null) {
                                str = obj3.toString();
                            } else {
                                str = null;
                            }
                            Object obj4 = ListProtector.get(list, 2);
                            if (obj4 != null) {
                                Iterable iterable = (Iterable) obj4;
                                if (!bool.booleanValue() || ORZ.LJLJJI(str, iterable)) {
                                    return false;
                                }
                                return true;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        }
                    }
                }
            }
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final java.util.Map<String, Object> LJ(Object[] objArr) {
            String str;
            String str2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (objArr != null && objArr.length == 3) {
                Object obj = objArr[0];
                String str3 = null;
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                linkedHashMap.put("origin", str);
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    str2 = obj2.toString();
                } else {
                    str2 = null;
                }
                linkedHashMap.put("allow", str2);
                Object obj3 = objArr[2];
                if (obj3 != null) {
                    str3 = obj3.toString();
                }
                linkedHashMap.put("retain", str3);
            }
            return linkedHashMap;
        }
    }, new InterfaceC35988EAm() { // from class: X.35J
        @Override // X.InterfaceC35988EAm
        public final boolean LIZIZ(Object[] objArr, m mVar) {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final List<Integer> LIZ() {
            return C47261Igj.LJJIJ(102604);
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZLLL(List<? extends Object> list) {
            Object obj;
            if (list != null && list.size() == 4 && !(!o.LJ(String.valueOf(ListProtector.get(list, 0)), "on_permission_request")) && (obj = ListProtector.get(list, 1)) != null && (obj instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 0) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        PermissionRequest permissionRequest = (PermissionRequest) obj2;
                        Object obj3 = ListProtector.get(list, 2);
                        if (obj3 != null) {
                            List list2 = (List) obj3;
                            Object obj4 = ListProtector.get(list, 3);
                            if (obj4 != null) {
                                Iterable iterable = (Iterable) obj4;
                                if (list2.contains(permissionRequest.getOrigin().toString())) {
                                    return false;
                                }
                                String[] resources = permissionRequest.getResources();
                                o.LJIIIIZZ(resources, "request.resources");
                                if (ORZ.LJZI(iterable, ORY.LJLIL(resources)).isEmpty()) {
                                    return false;
                                }
                                return true;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.webkit.PermissionRequest");
                }
            }
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final java.util.Map<String, Object> LJ(Object[] objArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (objArr != null && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof PermissionRequest) {
                    if (obj != null) {
                        PermissionRequest permissionRequest = (PermissionRequest) obj;
                        linkedHashMap.put("origin", permissionRequest.getOrigin().toString());
                        linkedHashMap.put("resources", permissionRequest.getResources());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.webkit.PermissionRequest");
                    }
                }
            }
            return linkedHashMap;
        }
    }, new InterfaceC35988EAm() { // from class: X.2aO
        @Override // X.InterfaceC35988EAm
        public final boolean LIZIZ(Object[] objArr, m mVar) {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZJ() {
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final List<Integer> LIZ() {
            return C47261Igj.LJJIJ(10300);
        }

        @Override // X.InterfaceC35988EAm
        public final boolean LIZLLL(List<? extends Object> list) {
            Object obj;
            Object obj2;
            String obj3;
            if (list != null && list.size() == 4 && !(!o.LJ(String.valueOf(ListProtector.get(list, 0)), "settings_or_ab")) && (obj = ListProtector.get(list, 1)) != null && (obj instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 0 && (obj2 = objArr[0]) != null && (obj3 = obj2.toString()) != null && !ujb.o.LJJJJJL(obj3)) {
                    Object obj4 = ListProtector.get(list, 2);
                    if (obj4 != null) {
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        Object obj5 = ListProtector.get(list, 3);
                        if (obj5 != null) {
                            boolean contains = ((List) obj5).contains(obj3);
                            if (booleanValue) {
                                return contains;
                            }
                            if (contains) {
                                return false;
                            }
                            return true;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            return false;
        }

        @Override // X.InterfaceC35988EAm
        public final java.util.Map<String, Object> LJ(Object[] objArr) {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (objArr != null && objArr.length == 2) {
                Object obj = objArr[0];
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                linkedHashMap.put("key", str);
            }
            return linkedHashMap;
        }
    });

    @Override // X.InterfaceC66094Pwo
    public final String type() {
        return "rule_engine";
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        o.LJIIIZ(newSettings, "newSettings");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ = heliosEnvImpl.LJIIIZ();
        if (LJIIIZ != null) {
            ((C66143Pxb) LJIIIZ).LIZ(new PQ3());
        }
        HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ2 = heliosEnvImpl2.LJIIIZ();
        if (LJIIIZ2 != null) {
            ((C66143Pxb) LJIIIZ2).LIZ(new C66151Pxj());
        }
        HeliosEnvImpl heliosEnvImpl3 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl3, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ3 = heliosEnvImpl3.LJIIIZ();
        if (LJIIIZ3 != null) {
            ((C66143Pxb) LJIIIZ3).LIZ(new C65898Pte());
        }
        HeliosEnvImpl heliosEnvImpl4 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl4, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ4 = heliosEnvImpl4.LJIIIZ();
        if (LJIIIZ4 != null) {
            ((C66143Pxb) LJIIIZ4).LIZJ(new C66160Pxs());
        }
        HeliosEnvImpl heliosEnvImpl5 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl5, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ5 = heliosEnvImpl5.LJIIIZ();
        if (LJIIIZ5 != null) {
            ((C66143Pxb) LJIIIZ5).LIZJ(new C66167Pxz());
        }
        HeliosEnvImpl heliosEnvImpl6 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl6, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ6 = heliosEnvImpl6.LJIIIZ();
        if (LJIIIZ6 != null) {
            ((C66143Pxb) LJIIIZ6).LIZJ(new C66161Pxt());
        }
        HeliosEnvImpl heliosEnvImpl7 = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl7, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ7 = heliosEnvImpl7.LJIIIZ();
        if (LJIIIZ7 != null) {
            ((C66143Pxb) LJIIIZ7).LIZJ(new C66165Pxx());
        }
    }

    public static java.util.Map LIZIZ(C66120PxE event, boolean z) {
        String str;
        Object obj;
        o.LJIIIZ(event, "event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "guard_fuse";
        } else {
            str = "guard";
        }
        linkedHashMap.put("source", str);
        linkedHashMap.put("api_id", Integer.valueOf(event.LJLJI));
        linkedHashMap.put("permission_type", event.LJLJJL);
        linkedHashMap.put("data_types", event.LLIIJLIL);
        linkedHashMap.put("is_pair_not_close", Boolean.valueOf(event.LLF.contains("pair_not_close")));
        linkedHashMap.put("is_pair_delay_close", Boolean.valueOf(event.LLF.contains("pair_delay_close")));
        List<InterfaceC35988EAm> list = LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC35988EAm> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().LIZ().contains(Integer.valueOf(event.LJLJI))) {
                    linkedHashMap.put("api_params", event.LLI.getParameters());
                    break;
                }
            }
        }
        String str2 = null;
        if (C35985EAj.LIZ.LIZ().contains(Integer.valueOf(event.LJLJI))) {
            Object[] parameters = event.LLI.getParameters();
            if (parameters != null) {
                obj = parameters[0];
            } else {
                obj = null;
            }
            linkedHashMap.put("request_permissions", obj);
        }
        Object thisOrClass = event.LLI.getThisOrClass();
        int i = event.LJLJI;
        if (i == 102600) {
            if (thisOrClass instanceof Activity) {
                linkedHashMap.put("context_page", thisOrClass.getClass().getName());
            }
        } else if (i == 102601 && (thisOrClass instanceof Fragment)) {
            Activity activity = ((Fragment) thisOrClass).getActivity();
            if (activity != null) {
                str2 = activity.getClass().getName();
            }
            linkedHashMap.put("context_page", str2);
        }
        Object obj2 = linkedHashMap.get("context_page");
        if (obj2 != null) {
            event.LJLLLL.put("context_page", obj2.toString());
        }
        if (event.LJLJI == 104000) {
            linkedHashMap.put("user_input", String.valueOf(event.LLI.getResult()));
            linkedHashMap.put("top_page", event.LJLLI);
        }
        Object obj3 = event.LJLLLL.get("api_sub_type");
        if (obj3 != null) {
            linkedHashMap.put("api_sub_type", obj3);
        }
        linkedHashMap.put("has_bpea_cert", Boolean.valueOf(event.LJLLLL.containsKey("certToken")));
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    @Override // X.InterfaceC66094Pwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C66120PxE r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66112Px6.LIZ(X.PxE, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04aa, code lost:
    
        if (r8.equals("java.lang.Integer") != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x058d, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0510, code lost:
    
        if (r8.equals("double") != false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0651, code lost:
    
        r11 = java.lang.Double.valueOf(-1.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x056c, code lost:
    
        if (r8.equals("java.lang.Float") != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05cb, code lost:
    
        r11 = java.lang.Float.valueOf(-1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0575, code lost:
    
        if (r8.equals("java.lang.Short") != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05e8, code lost:
    
        r11 = java.lang.Short.valueOf((short) (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x058b, code lost:
    
        if (r8.equals("int") != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0599, code lost:
    
        if (r8.equals("byte") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0613, code lost:
    
        r11 = java.lang.Byte.valueOf(com.bytedance.mt.protector.impl.string2number.CastByteProtector.parseByte("-1"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05a2, code lost:
    
        if (r8.equals("char") != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05f7, code lost:
    
        r11 = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05ab, code lost:
    
        if (r8.equals("long") != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0627, code lost:
    
        r11 = -1L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x05b4, code lost:
    
        if (r8.equals("boolean") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0607, code lost:
    
        r11 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05c9, code lost:
    
        if (r8.equals("float") != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05e6, code lost:
    
        if (r8.equals("short") != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x05f5, code lost:
    
        if (r8.equals("java.lang.Character") != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0605, code lost:
    
        if (r8.equals("java.lang.Boolean") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0611, code lost:
    
        if (r8.equals("java.lang.Byte") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0625, code lost:
    
        if (r8.equals("java.lang.Long") != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x064f, code lost:
    
        if (r8.equals("java.lang.Double") != false) goto L298;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.C66120PxE r24, boolean r25, X.Q11 r26) {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66112Px6.LIZJ(X.PxE, boolean, X.Q11):boolean");
    }
}
