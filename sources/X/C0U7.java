package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0U7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U7 {
    public static final C31731Mj LIZLLL = new C0YM<Context>() { // from class: X.1Mj
        @Override // X.C0YM
        public final Context LIZIZ() {
            if (C01H.LIZIZ != null) {
                C0YN.LIZ(4);
                C01H.LIZIZ.getClass();
                return FKM.LIZ();
            }
            return null;
        }
    };
    public static boolean LJ = true;
    public static final java.util.Map<String, Boolean> LJFF;
    public final C0U4 LIZ;
    public final C31761Mm LIZIZ;
    public final C31741Mk LIZJ = new C0YM<List<C01F>>() { // from class: X.1Mk
        @Override // X.C0YM
        public final List<C01F> LIZIZ() {
            ArrayList arrayList = new ArrayList();
            C01I c01i = C01H.LIZIZ;
            if (c01i != null) {
                c01i.getClass();
                arrayList.add(new C01F() { // from class: X.2K1
                    @Override // X.C01F
                    public final void LIZ(Bundle bundle) {
                    }
                });
            }
            return arrayList;
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Mj] */
    static {
        HashMap hashMap = new HashMap();
        String name = C0YO.b.name();
        Boolean bool = Boolean.TRUE;
        hashMap.put(name, bool);
        hashMap.put(C0YO.c.name(), bool);
        hashMap.put(C0YO.e.name(), bool);
        hashMap.put(C0YO.f.name(), bool);
        hashMap.put(C0YO.d.name(), bool);
        LJFF = Collections.unmodifiableMap(hashMap);
    }

    public final void LIZ(int i, Bundle bundle) {
        Iterator<C01F> it = LIZ().iterator();
        while (it.hasNext()) {
            it.next().LIZ(bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0U4, X.0UC] */
    public final Object LIZIZ(C0X3 c0x3) {
        ?? r2;
        C0UD LIZLLL2 = c0x3.LJLJJL ? c0x3.LJLLL : LIZLLL(c0x3);
        if (LIZLLL2 == null || (r2 = LIZLLL2.LIZIZ) == 0) {
            return null;
        }
        C0UE c0ue = LIZLLL2.LIZLLL;
        if (c0ue != null) {
            c0ue.LIZIZ = C0NW.END;
        }
        return r2.LIZIZ(LIZLLL2);
    }

    public static C0U7 LIZJ() {
        if (LIZLLL.LIZ() == null) {
            C0YN.LIZ(5);
            return null;
        }
        return C0U6.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Mk] */
    public C0U7() {
        C0YO c0yo;
        java.util.Map<String, Boolean> map;
        C0YO c0yo2;
        C0U4 c31771Mn;
        StringBuilder LIZ;
        String str;
        boolean z = LJ;
        C31731Mj c31731Mj = LIZLLL;
        if (z) {
            if (this.LIZ == null) {
                String str2 = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str2) && str2.contains("samsung")) {
                    c0yo = C0YO.b;
                } else {
                    String LIZ2 = C0YP.LIZ("ro.product.brand");
                    if (!TextUtils.isEmpty(LIZ2) && LIZ2.toLowerCase().contains("oppo")) {
                        c0yo = C0YO.e;
                    } else {
                        String LIZ3 = C0YP.LIZ("ro.vivo.os.name");
                        if (!TextUtils.isEmpty(LIZ3) && LIZ3.toLowerCase().contains("funtouch")) {
                            c0yo = C0YO.f;
                        } else {
                            c0yo = C0YO.a;
                        }
                    }
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("create ");
                LIZ4.append(c0yo);
                LIZ4.append(" provider.");
                X1D.LIZIZ(LIZ4);
                C0YN.LIZ(3);
                if (C0YR.LIZIZ()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vendor", c0yo.name());
                        C0YR.LIZ("vboost_event_launch", jSONObject);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                int i = C0U5.LIZ[c0yo.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("Not implement provider of this device ");
                                LIZ5.append(c0yo);
                                LIZ5.append("!");
                                X1D.LIZIZ(LIZ5);
                                C0YN.LIZ(5);
                            } else {
                                map = LJFF;
                                c0yo2 = C0YO.f;
                                if (map.containsKey(c0yo2.name())) {
                                    if (map.get(c0yo2.name()).booleanValue()) {
                                        c31771Mn = new C31791Mp(c31731Mj.LIZ());
                                    } else {
                                        LIZ = X1D.LIZ();
                                        str = "Not allow to create vo provider, enableVendorMap[vo] = ";
                                        LIZ.append(str);
                                        LIZ.append(map.get(c0yo2.name()));
                                        X1D.LIZIZ(LIZ);
                                    }
                                } else {
                                    c31771Mn = new C31791Mp(c31731Mj.LIZ());
                                }
                                this.LIZ = c31771Mn;
                            }
                        } else {
                            map = LJFF;
                            c0yo2 = C0YO.e;
                            if (map.containsKey(c0yo2.name())) {
                                if (map.get(c0yo2.name()).booleanValue()) {
                                    c31771Mn = new C31751Ml(c31731Mj.LIZ());
                                } else {
                                    LIZ = X1D.LIZ();
                                    str = "Not allow to create op provider, enableVendorMap[op] = ";
                                    LIZ.append(str);
                                    LIZ.append(map.get(c0yo2.name()));
                                    X1D.LIZIZ(LIZ);
                                }
                            } else {
                                c31771Mn = new C31751Ml(c31731Mj.LIZ());
                            }
                            this.LIZ = c31771Mn;
                        }
                    } else {
                        map = LJFF;
                        c0yo2 = C0YO.c;
                        if (map.containsKey(c0yo2.name())) {
                            if (!map.get(c0yo2.name()).booleanValue()) {
                                LIZ = X1D.LIZ();
                                str = "Not allow to create chry provider, enableVendorMap[chry] = ";
                                LIZ.append(str);
                                LIZ.append(map.get(c0yo2.name()));
                                X1D.LIZIZ(LIZ);
                            } else {
                                c31731Mj.LIZ();
                                c31771Mn = new C31721Mi();
                            }
                        } else {
                            c31771Mn = new C31771Mn(c31731Mj.LIZ());
                        }
                        this.LIZ = c31771Mn;
                    }
                } else {
                    map = LJFF;
                    c0yo2 = C0YO.b;
                    if (map.containsKey(c0yo2.name())) {
                        if (map.get(c0yo2.name()).booleanValue()) {
                            c31771Mn = new C31771Mn(c31731Mj.LIZ());
                        } else {
                            LIZ = X1D.LIZ();
                            str = "Not allow to create ss provider, enableVendorMap[ss] = ";
                            LIZ.append(str);
                            LIZ.append(map.get(c0yo2.name()));
                            X1D.LIZIZ(LIZ);
                        }
                    } else {
                        c31771Mn = new C31771Mn(c31731Mj.LIZ());
                    }
                    this.LIZ = c31771Mn;
                }
            }
            this.LIZIZ = new C31761Mm(c31731Mj.LIZ());
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("Not allow to create vendor provider, enableVendorProvider = ");
        LIZ6.append(LJ);
        X1D.LIZIZ(LIZ6);
        C0YN.LIZ(4);
        this.LIZIZ = new C31761Mm(c31731Mj.LIZ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0185, code lost:
    
        if (r4 > r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        if (r2.LIZIZ == X.C0UB.PLATFORM) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a3, code lost:
    
        r0 = r13.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        r0 = r13.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019c, code lost:
    
        if (r6.LIZIZ == X.C0UB.PLATFORM) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0127, code lost:
    
        if (r6.LIZIZ == X.C0UB.PLATFORM) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0157, code lost:
    
        if (r4 > r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0188, code lost:
    
        r3.LJ = r4;
        r3.LIZJ = r7.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0187, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0U4, X.0UC] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.0U4, X.0UC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0UD LIZLLL(X.C0X3 r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U7.LIZLLL(X.0X3):X.0UD");
    }
}
