package X;

import android.content.ContentProviderOperation;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Px9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66115Px9 {
    public static Field LJIIJJI;
    public static Field LJIIL;
    public static Field LJIILIIL;
    public static final C66186PyI LJIILJJIL = new C66186PyI();
    public final transient Object LIZ;
    public final transient Object LIZIZ;
    public final transient Object[] LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66115Px9)) {
            return false;
        }
        C66115Px9 c66115Px9 = (C66115Px9) obj;
        return o.LJ(this.LIZ, c66115Px9.LIZ) && o.LJ(this.LIZIZ, c66115Px9.LIZIZ) && o.LJ(this.LIZJ, c66115Px9.LIZJ) && this.LIZLLL == c66115Px9.LIZLLL && this.LJ == c66115Px9.LJ && this.LJFF == c66115Px9.LJFF && this.LJI == c66115Px9.LJI && o.LJ(this.LJII, c66115Px9.LJII) && o.LJ(this.LJIIIIZZ, c66115Px9.LJIIIIZZ) && o.LJ(this.LJIIIZ, c66115Px9.LJIIIZ) && o.LJ(this.LJIIJ, c66115Px9.LJIIJ);
    }

    static {
        C221108m2.LIZIZ(C66174Py6.LJLIL);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x01ba. Please report as an issue. */
    public final C66120PxE LIZIZ() {
        String str;
        Object[] objArr;
        String str2;
        long j;
        Object obj;
        Object[] objArr2;
        Field field;
        Field field2;
        Field field3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str3;
        String[] strArr;
        Bundle bundle;
        Integer num;
        String str4;
        String str5;
        String str6;
        Integer num2;
        C66120PxE LIZ = C66127PxL.LIZ("bytex");
        int i = this.LIZLLL;
        LIZ.LJLJI = i;
        InterfaceC35988EAm interfaceC35988EAm = null;
        if (i != 102900) {
            if (i == 240004 || i == 240015) {
                Object[] objArr3 = this.LIZJ;
                if (objArr3 == null || objArr3.length < 1) {
                    return null;
                }
                if (objArr3 != null) {
                    obj = objArr3[0];
                } else {
                    obj = null;
                }
                if (obj instanceof android.net.Uri) {
                    obj = ((android.net.Uri) obj).getAuthority();
                }
                java.util.Map<String, C66153Pxl> map = C66146Pxe.LIZIZ;
                if (map != null) {
                    if (map.containsKey(obj)) {
                        int i2 = this.LIZLLL;
                        if (i2 == 240004) {
                            C66153Pxl c66153Pxl = map.get(obj);
                            if (c66153Pxl != null) {
                                num2 = Integer.valueOf(c66153Pxl.LIZIZ);
                            } else {
                                num2 = null;
                            }
                            o.LJI(num2);
                            LIZ.LJLJI = num2.intValue();
                        } else if (i2 == 240015) {
                            C66153Pxl c66153Pxl2 = map.get(obj);
                            if (c66153Pxl2 != null) {
                                num = Integer.valueOf(c66153Pxl2.LIZJ);
                            } else {
                                num = null;
                            }
                            o.LJI(num);
                            LIZ.LJLJI = num.intValue();
                        }
                        java.util.Map<String, Object> extra = LIZ.LLI.getExtra();
                        C66153Pxl c66153Pxl3 = map.get(obj);
                        if (c66153Pxl3 != null) {
                            str4 = c66153Pxl3.LIZ;
                        } else {
                            str4 = null;
                        }
                        extra.put("permissionType", str4);
                        C66153Pxl c66153Pxl4 = map.get(obj);
                        if (c66153Pxl4 != null) {
                            str5 = c66153Pxl4.LIZ;
                        } else {
                            str5 = null;
                        }
                        o.LJI(str5);
                        LIZ.LJLJJL = str5;
                        LIZ.LLIIIL = str5;
                        C66153Pxl c66153Pxl5 = map.get(obj);
                        if (c66153Pxl5 != null) {
                            str6 = c66153Pxl5.LIZ;
                        } else {
                            str6 = null;
                        }
                        o.LJI(str6);
                        String lowerCase = str6.toLowerCase();
                        o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase()");
                        LIZ.LJLILLLLZI = lowerCase;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i3 = this.LIZLLL;
                    if (i3 == 240004) {
                        Object[] objArr4 = this.LIZJ;
                        if (objArr4 != null && objArr4.length >= 4) {
                            if (objArr4 != null && (obj5 = objArr4[0]) != null) {
                                android.net.Uri uri = (android.net.Uri) obj5;
                                String[] strArr2 = (String[]) objArr4[1];
                                if (objArr4.length == 4) {
                                    Object obj6 = objArr4[2];
                                    if (obj6 instanceof Bundle) {
                                        if (obj6 != null) {
                                            bundle = (Bundle) obj6;
                                            str3 = null;
                                            strArr = null;
                                            LIZ(linkedHashSet, uri, strArr2, str3, strArr, bundle);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
                                        }
                                    }
                                }
                                if (objArr4.length >= 5) {
                                    str3 = (String) objArr4[2];
                                    strArr = (String[]) objArr4[3];
                                    bundle = null;
                                } else {
                                    str3 = null;
                                    strArr = null;
                                    bundle = null;
                                }
                                LIZ(linkedHashSet, uri, strArr2, str3, strArr, bundle);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.net.Uri");
                            }
                        }
                    } else if (i3 == 240015 && (objArr2 = this.LIZJ) != null && objArr2.length == 2) {
                        LJIILJJIL.getClass();
                        if (LJIIJJI == null) {
                            try {
                                field = ContentProviderOperation.class.getDeclaredField("mSelection");
                                o.LJIIIIZZ(field, "this");
                                field.setAccessible(true);
                            } catch (Throwable th) {
                                C66059PwF.LIZIZ(new C65852Psu((Thread) null, th, "label_content_provider_operation_reflection", (java.util.Map) null, 25));
                                field = null;
                            }
                            LJIIJJI = field;
                        }
                        if (LJIIL == null) {
                            try {
                                field2 = ContentProviderOperation.class.getDeclaredField("mSelectionArgs");
                                o.LJIIIIZZ(field2, "this");
                                field2.setAccessible(true);
                            } catch (Throwable th2) {
                                C66059PwF.LIZIZ(new C65852Psu((Thread) null, th2, "label_content_provider_operation_reflection", (java.util.Map) null, 25));
                                field2 = null;
                            }
                            LJIIL = field2;
                        }
                        if (LJIILIIL == null) {
                            try {
                                field3 = ContentProviderOperation.class.getDeclaredField("mValues");
                                o.LJIIIIZZ(field3, "this");
                                field3.setAccessible(true);
                            } catch (Throwable th3) {
                                C66059PwF.LIZIZ(new C65852Psu((Thread) null, th3, "label_content_provider_operation_reflection", (java.util.Map) null, 25));
                                field3 = null;
                            }
                            LJIILIIL = field3;
                        }
                        Object obj7 = this.LIZJ[1];
                        if (obj7 != null) {
                            Iterator it = ((ArrayList) obj7).iterator();
                            while (it.hasNext()) {
                                ContentProviderOperation contentProviderOperation = (ContentProviderOperation) it.next();
                                if (contentProviderOperation.isReadOperation()) {
                                    try {
                                        android.net.Uri uri2 = contentProviderOperation.getUri();
                                        o.LJIIIIZZ(uri2, "operation.uri");
                                        Field field4 = LJIIJJI;
                                        if (field4 != null) {
                                            obj2 = field4.get(contentProviderOperation);
                                        } else {
                                            obj2 = null;
                                        }
                                        String str7 = (String) obj2;
                                        Field field5 = LJIIL;
                                        if (field5 != null) {
                                            obj3 = field5.get(contentProviderOperation);
                                        } else {
                                            obj3 = null;
                                        }
                                        String[] strArr3 = (String[]) obj3;
                                        Bundle bundle2 = new Bundle();
                                        Field field6 = LJIILIIL;
                                        if (field6 != null) {
                                            obj4 = field6.get(contentProviderOperation);
                                        } else {
                                            obj4 = null;
                                        }
                                        ArrayMap arrayMap = (ArrayMap) obj4;
                                        if (arrayMap != null) {
                                            for (Map.Entry entry : arrayMap.entrySet()) {
                                                bundle2.putString((String) entry.getKey(), entry.getValue().toString());
                                            }
                                        }
                                        LIZ(linkedHashSet, uri2, null, str7, strArr3, bundle2);
                                    } catch (Throwable th4) {
                                        C66059PwF.LIZIZ(new C65852Psu((Thread) null, th4, "label_content_provider_param_check", (java.util.Map) null, 25));
                                    }
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.content.ContentProviderOperation> /* = java.util.ArrayList<android.content.ContentProviderOperation> */");
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        LIZ.LJLLLL.put("api_sub_type", linkedHashSet.toString());
                        java.util.Map<String, C66153Pxl> map2 = C66146Pxe.LIZIZ;
                        android.net.Uri uri3 = ContactsContract.Contacts.CONTENT_URI;
                        o.LJIIIIZZ(uri3, "ContactsContract.Contacts.CONTENT_URI");
                        C66153Pxl c66153Pxl6 = map2.get(uri3.getAuthority());
                        if (c66153Pxl6 != null) {
                            int i4 = this.LIZLLL;
                            if (i4 == 240004) {
                                LIZ.LJLJI = c66153Pxl6.LIZIZ;
                            } else if (i4 == 240015) {
                                LIZ.LJLJI = c66153Pxl6.LIZJ;
                            }
                            LIZ.LLI.getExtra().put("permissionType", c66153Pxl6.LIZ);
                            String str8 = c66153Pxl6.LIZ;
                            o.LJIIIZ(str8, "<set-?>");
                            LIZ.LJLJJL = str8;
                            LIZ.LLIIIL = str8;
                            String str9 = c66153Pxl6.LIZ;
                            if (str9 != null) {
                                String lowerCase2 = str9.toLowerCase();
                                o.LJIIIIZZ(lowerCase2, "(this as java.lang.String).toLowerCase()");
                                LIZ.LJLILLLLZI = lowerCase2;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                }
            }
        } else {
            LIZ.LJLJI = i;
            Object[] objArr5 = this.LIZJ;
            if (objArr5 != null && objArr5.length != 0) {
                LIZ.LJLLLL.put("params", objArr5[0]);
            }
        }
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        boolean z = !PQ0.LJ();
        if (z) {
            str = "FORE_SENSITIVE_CALL";
        } else {
            str = "BACK_SENSITIVE_CALL";
        }
        LIZ.LJLL = str;
        if (!z) {
            C64331PMp LIZIZ = C64329PMn.LIZIZ();
            if (!LIZIZ.LIZIZ) {
                j = SystemClock.elapsedRealtime() - LIZIZ.LIZJ;
            } else {
                j = -1;
            }
            LIZ.LLIIZ = j;
        }
        LIZ.LJLLJ = this.LJ;
        LIZ.LJZI = this.LJFF;
        LIZ.LJZL = this.LJI;
        LIZ.LLD = 2;
        C66152Pxk LIZ2 = C66129PxN.LIZLLL.LIZ(LIZ.LJLJI);
        if (LIZ2 != null) {
            LIZ.LJLZ = "SensitiveApiException";
            if (!o.LJ(LIZ2.LIZLLL, "ContentProvider")) {
                String str10 = LIZ2.LIZLLL;
                o.LJIIIIZZ(str10, "config.resourceName");
                LIZ.LJLJJL = str10;
                LIZ.LLIIIL = str10;
                String str11 = LIZ2.LIZ;
                o.LJIIIIZZ(str11, "config.resourceId");
                LIZ.LJLILLLLZI = str11;
            }
        }
        C65955PuZ LIZ3 = C65986Pv4.LIZ(LIZ.LJLJI);
        if (LIZ3 != null) {
            LIZ.LLIIJLIL.addAll(LIZ3.LJII);
        }
        LIZ.LLI.setResult(this.LIZ);
        LIZ.LLI.setThisOrClass(this.LIZIZ);
        LIZ.LLI.setParameters(this.LIZJ);
        LIZ.LLI.setReturnType(this.LJII);
        String str12 = this.LJIIIZ;
        o.LJIIIZ(str12, "<set-?>");
        LIZ.LLIIL = str12;
        String str13 = this.LJIIJ;
        o.LJIIIZ(str13, "<set-?>");
        LIZ.LLIILII = str13;
        StringBuilder LIZ4 = X1D.LIZ();
        String str14 = this.LJIIIZ;
        String substring = str14.substring(s.LJJLIIIJLLLLLLLZ(str14, '/', 0, 6) + 1, this.LJIIIZ.length());
        o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        LIZ4.append(substring);
        LIZ4.append("_");
        LIZ4.append(this.LJIIJ);
        LIZ4.append("_Detected");
        String LIZIZ2 = X1D.LIZIZ(LIZ4);
        o.LJIIIZ(LIZIZ2, "<set-?>");
        LIZ.LJLJJI = LIZIZ2;
        Iterator<InterfaceC35988EAm> it2 = C66112Px6.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC35988EAm next = it2.next();
            if (next.LIZ().contains(Integer.valueOf(LIZ.LJLJI))) {
                interfaceC35988EAm = next;
                break;
            }
        }
        InterfaceC35988EAm interfaceC35988EAm2 = interfaceC35988EAm;
        if (interfaceC35988EAm2 != null) {
            LIZ.LLI.setParameters(this.LIZJ);
            LIZ.LJLLLL.putAll(interfaceC35988EAm2.LJ(this.LIZJ));
        }
        int i5 = this.LIZLLL;
        if ((i5 == 102600 || i5 == 102601) && (objArr = this.LIZJ) != null && objArr.length != 0) {
            LIZ.LLI.setThisOrClass(this.LIZIZ);
            Object obj8 = this.LIZJ[0];
            if (obj8 != null) {
                String[] strArr4 = (String[]) obj8;
                LIZ.LJLLLL.put(OHQ.LIZIZ, C39536FfQ.LIZ(strArr4));
                for (String originPermission : strArr4) {
                    o.LJIIIZ(originPermission, "originPermission");
                    C65942PuM c65942PuM = C65942PuM.LIZJ;
                    try {
                        C0M6<String, String> c0m6 = C65942PuM.LIZIZ;
                        str2 = c0m6.LIZIZ(originPermission);
                        if (str2 == null) {
                            synchronized (c65942PuM) {
                                str2 = c0m6.LIZIZ(originPermission);
                                if (str2 == null) {
                                    MessageDigest messageDigest = MessageDigest.getInstance("md5");
                                    Charset defaultCharset = Charset.defaultCharset();
                                    o.LJIIIIZZ(defaultCharset, "Charset.defaultCharset()");
                                    byte[] bytes = originPermission.getBytes(defaultCharset);
                                    o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                                    byte[] digest = messageDigest.digest(bytes);
                                    o.LJIIIIZZ(digest, "digest.digest(data.toByt…harset.defaultCharset()))");
                                    str2 = ORY.LJJJJJL(digest, "", OTC.INSTANCE);
                                    c0m6.LIZJ(originPermission, str2);
                                }
                            }
                        }
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = "";
                    }
                    switch (str2.hashCode()) {
                        case -2118140810:
                            if (!str2.equals("66f0aebb774cea738e6f707d892605a5")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("location");
                            break;
                        case -2066725663:
                            if (!str2.equals("86b86f8c8ff4a69a1fd91f11d7291ac3")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("calendar");
                            break;
                        case -2037619135:
                            if (!str2.equals("d298f70dfa679aee00a2de07ae77575a")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("location");
                            break;
                        case -1955706221:
                            if (!str2.equals("31b141a3319115ca1358b75589185af7")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("sms");
                            break;
                        case -1503742501:
                            if (!str2.equals("16132a0d463f27d2069a564a5e508428")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("bluetooth");
                            break;
                        case -1303236682:
                            if (!str2.equals("104fb0d96bf32172c48086b78893da51")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("calendar");
                            break;
                        case -1043285428:
                            if (!str2.equals("a8765ff6fb1dfb2bc248e026928ecb1d")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("location");
                            break;
                        case -931823071:
                            if (!str2.equals("3b766e788b3e3486a80598ec303b2ca3")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("bluetooth");
                            break;
                        case -851088674:
                            if (!str2.equals("8263b33aa5fd84802c85a006855ec8fc")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("storage");
                            break;
                        case -714473553:
                            if (!str2.equals("cf3468c3fd6b79611aaf86f8313c5ba3")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("storage");
                            break;
                        case -517574562:
                            if (!str2.equals("04a8767c1ac5d9b2c5286bfc18040e3c")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("bluetooth");
                            break;
                        case -345081542:
                            if (str2.equals("98300b5173b1f3407cba79a88b94f603")) {
                                LIZ.LLIIJLIL.add("network");
                                LIZ.LLIIJLIL.add("device");
                                break;
                            } else {
                                break;
                            }
                        case -211685407:
                            if (!str2.equals("858379245ed3034c2239ada46dc66b6a")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("contact");
                            break;
                        case -82543443:
                            if (!str2.equals("859f122d36c475beec40eecf7cab64d7")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("call_log");
                            break;
                        case 26156478:
                            if (!str2.equals("c734d97f67f7b592e9015d3e93a8fa38")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("bluetooth");
                            break;
                        case 141341447:
                            if (!str2.equals("bba87da58e6b6c802a8757cb7f0027f4")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("storage");
                            break;
                        case 147401765:
                            if (str2.equals("e79cefbb583328547c47e920876cc149")) {
                                LIZ.LLIIJLIL.add("video");
                                break;
                            } else {
                                break;
                            }
                        case 278124842:
                            if (!str2.equals("6f618b0c8c1b61d0c5e63ec7dba83213")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("sms");
                            break;
                        case 434099523:
                            if (!str2.equals("8baa0a8390b3a1dbc69c5505f39ad7c0")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("storage");
                            break;
                        case 442860545:
                            if (!str2.equals("526ff9a97ff14cd945ad246fd3f460ca")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("sms");
                            break;
                        case 482588423:
                            if (!str2.equals("30545a033007365acb32c88d27bb6b92")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("motion");
                            break;
                        case 583271466:
                            if (!str2.equals("b32a4d201dad126eb117a2235bab2531")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("location");
                            break;
                        case 611782979:
                            if (!str2.equals("e4b77dcdf926ceca389ca3ab402afa3e")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("storage");
                            break;
                        case 1001685706:
                            if (!str2.equals("cd8e46576f13ea29f1d95364317bbcda")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("call_log");
                            break;
                        case 1728303164:
                            if (!str2.equals("7878e4219a690ad7b38bd1337e046944")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("bluetooth");
                            break;
                        case 1734528625:
                            if (!str2.equals("ff39945a555adde5cf5a472271cb18c9")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("sms");
                            break;
                        case 1849323778:
                            if (str2.equals("8fea172e6c711b5b2676386f7c05b993")) {
                                LIZ.LLIIJLIL.add("network");
                                break;
                            } else {
                                break;
                            }
                        case 1928229070:
                            if (!str2.equals("a9ea1f1520196431c9a1f5c30c91a330")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("contact");
                            break;
                        case 1970477562:
                            if (!str2.equals("6b0bde4118a0a3c72a9096d1e19806ef")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("sms");
                            break;
                        case 2029456205:
                            if (!str2.equals("ab871890dcf999699ab4c1f801a5ee9d")) {
                                break;
                            }
                            LIZ.LLIIJLIL.add("motion");
                            break;
                        case 2107270694:
                            if (str2.equals("b0f9b366f8a8e959ddf125bdc41ffa68")) {
                                LIZ.LLIIJLIL.add("account");
                                break;
                            } else {
                                break;
                            }
                        case 2112474258:
                            if (str2.equals("406a893ad6569b4d752de2c5079d10f6")) {
                                LIZ.LLIIJLIL.add("audio");
                                break;
                            } else {
                                break;
                            }
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
        }
        return LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj = this.LIZ;
        int i7 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        Object obj2 = this.LIZIZ;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        Object[] objArr = this.LIZJ;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        } else {
            i3 = 0;
        }
        int LIZJ = JBR.LIZJ(this.LJ, (((i9 + i3) * 31) + this.LIZLLL) * 31, 31);
        boolean z = this.LJFF;
        int i10 = 1;
        int i11 = z;
        if (z != 0) {
            i11 = 1;
        }
        int i12 = (LIZJ + i11) * 31;
        if (!this.LJI) {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str = this.LJII;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        String str3 = this.LJIIIZ;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        String str4 = this.LJIIJ;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i16 + i7;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionParam{, id=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", calledTime=");
        LIZ.append(this.LJ);
        LIZ.append(", reflection=");
        LIZ.append(this.LJFF);
        LIZ.append(", returnType=");
        String str = this.LJII;
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(", eventUuid=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", className=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", memberName=");
        return JBR.LJFF(LIZ, this.LJIIJ, "}", LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ae, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "vnd.android.cursor.item/organization") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0060, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "vnd.android.cursor.item/name") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "vnd.android.cursor.item/postal-address_v2") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "vnd.android.cursor.item/email_v2") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "vnd.android.cursor.item/phone_v2") != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        if (ujb.s.LJJJLZIJ(r1, "data2=3", false) != false) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.Set r9, android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66115Px9.LIZ(java.util.Set, android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], android.os.Bundle):void");
    }

    public C66115Px9(Object obj, Object obj2, Object[] objArr, int i, long j, boolean z, boolean z2, String str, String str2, String className, String memberName) {
        o.LJIIIZ(className, "className");
        o.LJIIIZ(memberName, "memberName");
        this.LIZ = obj;
        this.LIZIZ = obj2;
        this.LIZJ = objArr;
        this.LIZLLL = i;
        this.LJ = j;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = className;
        this.LJIIJ = memberName;
    }
}
