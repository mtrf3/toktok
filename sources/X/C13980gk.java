package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* renamed from: X.0gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13980gk {
    public static java.util.Map<String, String> LIZ(String str, boolean z) {
        boolean z2;
        C1NT c1nt;
        String str2;
        List<String> list;
        java.util.Set<String> hashSet;
        java.util.Map<String, String> map;
        String str3;
        String str4;
        if (C35191Zr.LIZIZ().LIZ) {
            C35191Zr LIZIZ = C35191Zr.LIZIZ();
            if (LIZIZ.LIZ && LIZIZ.LIZJ.LIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return Collections.emptyMap();
            }
            AbstractC004800e abstractC004800e = (AbstractC004800e) ((ConcurrentHashMap) C35191Zr.LIZIZ().LIZLLL.LIZ).get("c2s");
            if ((abstractC004800e instanceof C30371Hd) && (c1nt = ((C30371Hd) abstractC004800e).LIZIZ) != null) {
                try {
                    str2 = UriProtector.parse(str).getHost();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2) && c1nt.LIZ) {
                    if (c1nt.LJFF == null) {
                        c1nt.LJFF = new ArrayList();
                    }
                    if (!((ArrayList) c1nt.LJFF).contains(str2)) {
                        QXX qxx = c1nt.LJI;
                        ArrayList arrayList = new ArrayList();
                        if (z) {
                            list = c1nt.LIZLLL;
                        } else {
                            list = c1nt.LJ;
                        }
                        if (list != null) {
                            hashSet = new HashSet(list);
                        } else {
                            hashSet = new HashSet();
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            hashSet = (java.util.Set) hashSet.stream().filter(new Predicate<String>() { // from class: X.0Vo
                                @Override // java.util.function.Predicate
                                public final boolean test(String str5) {
                                    return !TextUtils.isEmpty(str5);
                                }
                            }).collect(Collectors.toSet());
                        }
                        for (String str5 : hashSet) {
                            if (str.contains(str5)) {
                                arrayList.add(str5);
                            }
                        }
                        if (qxx != null) {
                            String valueOf = String.valueOf(System.currentTimeMillis());
                            HashMap hashMap = new HashMap();
                            if (arrayList.isEmpty()) {
                                hashMap.put("[ss_random]", String.valueOf(new Random().nextLong()));
                                hashMap.put("[ss_timestamp]", valueOf);
                                map = hashMap;
                            } else {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    String str6 = (String) it.next();
                                    try {
                                        if (TextUtils.equals("__TS__", str6) || TextUtils.equals("{TS}", str6)) {
                                            hashMap.put(str6, valueOf);
                                        } else if ((TextUtils.equals("__ANDROIDID__", str6) || TextUtils.equals("{ANDROIDID}", str6)) && !TextUtils.isEmpty("")) {
                                            String LJJIIZI = C78555UsJ.LJJIIZI();
                                            if (!TextUtils.isEmpty(LJJIIZI)) {
                                                hashMap.put(str6, LJJIIZI);
                                            }
                                        } else if ((TextUtils.equals("__ANDROIDID1__", str6) || TextUtils.equals("{ANDROIDID1}", str6)) && !TextUtils.isEmpty("")) {
                                            hashMap.put(str6, "");
                                        } else if ((TextUtils.equals("__AAID__", str6) || TextUtils.equals("{AAID}", str6)) && !TextUtils.isEmpty("")) {
                                            hashMap.put(str6, "");
                                        } else if ((TextUtils.equals("__OPENUDID__", str6) || TextUtils.equals("{OPENUDID}", str6)) && !TextUtils.isEmpty("")) {
                                            hashMap.put(str6, "");
                                        } else if ((TextUtils.equals("__OS__", str6) || TextUtils.equals("{OS}", str6)) && !TextUtils.isEmpty(CardStruct.IStatusCode.DEFAULT)) {
                                            hashMap.put(str6, CardStruct.IStatusCode.DEFAULT);
                                        } else if ((TextUtils.equals("__IP__", str6) || TextUtils.equals("{IP}", str6)) && !TextUtils.isEmpty("")) {
                                            hashMap.put(str6, "");
                                        } else {
                                            if (TextUtils.equals("__UA__", str6) || TextUtils.equals("{UA}", str6)) {
                                                AbstractC38911fr abstractC38911fr = C35191Zr.LIZIZ().LJII;
                                                if (abstractC38911fr == null) {
                                                    str3 = "";
                                                } else {
                                                    str3 = abstractC38911fr.LJIJJLI();
                                                }
                                                if (!TextUtils.isEmpty(str3)) {
                                                    AbstractC38911fr abstractC38911fr2 = C35191Zr.LIZIZ().LJII;
                                                    if (abstractC38911fr2 == null) {
                                                        str4 = "";
                                                    } else {
                                                        str4 = abstractC38911fr2.LJIJJLI();
                                                    }
                                                    String LJJIFFI = C78555UsJ.LJJIFFI(str4);
                                                    if (!TextUtils.isEmpty(LJJIFFI)) {
                                                        try {
                                                            LJJIFFI = URLEncoder.encode(LJJIFFI, "UTF-8");
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(LJJIFFI)) {
                                                        hashMap.put(str6, LJJIFFI);
                                                    }
                                                }
                                            }
                                            if ((TextUtils.equals("__UOO__", str6) || TextUtils.equals("{UOO}", str6)) && !TextUtils.isEmpty("")) {
                                                hashMap.put(str6, "");
                                            } else if ((TextUtils.equals("__DEVICE_ID__", str6) || TextUtils.equals("{DEVICE_ID}", str6)) && !TextUtils.isEmpty("")) {
                                                hashMap.put(str6, "");
                                            } else if (TextUtils.equals("__OS_STR__", str6) || TextUtils.equals("{OS_STR}", str6)) {
                                                if (!TextUtils.isEmpty("Android")) {
                                                    hashMap.put(str6, "Android");
                                                }
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                                hashMap.put("[ss_random]", String.valueOf(new Random().nextLong()));
                                hashMap.put("[ss_timestamp]", valueOf);
                                map = hashMap;
                            }
                        } else {
                            map = Collections.emptyMap();
                        }
                        arrayList.removeAll(map.keySet());
                        return map;
                    }
                }
                Object[] objArr = new Object[1];
                if (str2 == null) {
                    str2 = "";
                }
                objArr[0] = str2;
                C16880lQ.LLLZ("host is empty or c2s tracker disabled or host[%s]'s macro replacement is forbidden", objArr);
                return Collections.emptyMap();
            }
            IllegalStateException illegalStateException = new IllegalStateException("c2s Tracker has not finished initializing yet");
            illegalStateException.getMessage();
            throw illegalStateException;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("SDK has not been initialized");
        illegalStateException2.getMessage();
        throw illegalStateException2;
    }
}
