package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y8K {
    public final /* synthetic */ Y8J LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZ() {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, "hostContextDepend depend is null", 8);
    }

    public Y8K(Y8J y8j, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = y8j;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZIZ(Y8L y8l, String msg) {
        Boolean bool;
        Boolean bool2;
        o.LJIIJ(msg, "msg");
        if (y8l.LIZ != null && y8l.LIZIZ != null && y8l.LIZJ != null && y8l.LIZLLL != null && y8l.LJ != null && (bool = y8l.LJII) != null) {
            bool.booleanValue();
            if (y8l.LJIIIZ != null && y8l.LJIIJJI != null && y8l.LJIIL != null && y8l.LJIILIIL != null && y8l.LJIILJJIL != null && (bool2 = y8l.LJIILL) != null) {
                bool2.booleanValue();
                if (y8l.LJIILLIIL != null && y8l.LJIIZILJ != null && y8l.LJIJ != null && y8l.LJIJI != null && y8l.LJIJJ != null && y8l.LJIJJLI != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        String str = y8l.LJIJ;
                        if (str != null) {
                            B8M.valueOf(str);
                            String str2 = y8l.LJIJ;
                            if (str2 != null) {
                                linkedHashMap.put("screenOrientation", str2);
                            }
                            String str3 = y8l.LJIILLIIL;
                            if (str3 != null) {
                                linkedHashMap.put("deviceID", str3);
                            }
                            String str4 = y8l.LJIIZILJ;
                            if (str4 != null) {
                                linkedHashMap.put("networkType", str4);
                            }
                            String str5 = y8l.LJIJI;
                            if (str5 != null) {
                                linkedHashMap.put("updateVersionCode", str5);
                            }
                            Number number = y8l.LJIJJ;
                            if (number != null) {
                                linkedHashMap.put("screenWidth", number);
                            }
                            Number number2 = y8l.LJIJJLI;
                            if (number2 != null) {
                                linkedHashMap.put("screenHeight", number2);
                            }
                            Y8T y8t = y8l.LJIL;
                            if (y8t != null) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put("marginTop", y8t.LIZ);
                                linkedHashMap2.put("marginBottom", y8t.LIZIZ);
                                linkedHashMap2.put("marginLeft", y8t.LIZJ);
                                linkedHashMap2.put("marginRight", y8t.LIZLLL);
                                linkedHashMap.put("safeArea", linkedHashMap2);
                            }
                            String str6 = y8l.LIZ;
                            if (str6 != null) {
                                linkedHashMap.put("appID", str6);
                            }
                            String str7 = y8l.LIZIZ;
                            if (str7 != null) {
                                linkedHashMap.put("installID", str7);
                            }
                            String str8 = y8l.LIZJ;
                            if (str8 != null) {
                                linkedHashMap.put("appName", str8);
                            }
                            String str9 = y8l.LIZLLL;
                            if (str9 != null) {
                                linkedHashMap.put("appVersion", str9);
                            }
                            String str10 = y8l.LJ;
                            if (str10 != null) {
                                linkedHashMap.put("channel", str10);
                            }
                            String str11 = y8l.LJFF;
                            if (str11 != null) {
                                linkedHashMap.put("language", str11);
                            }
                            String str12 = y8l.LJI;
                            if (str12 != null) {
                                linkedHashMap.put("fullLanguage", str12);
                            }
                            Boolean bool3 = y8l.LJII;
                            if (bool3 != null) {
                                linkedHashMap.put("isTeenMode", Boolean.valueOf(bool3.booleanValue()));
                            }
                            String str13 = y8l.LJIIIZ;
                            if (str13 != null) {
                                linkedHashMap.put("osVersion", str13);
                            }
                            Integer num = y8l.LJIIJ;
                            if (num != null) {
                                C61845OOz.LIZLLL(num, linkedHashMap, "statusBarHeight");
                            }
                            String str14 = y8l.LJIIJJI;
                            if (str14 != null) {
                                linkedHashMap.put("devicePlatform", str14);
                            }
                            String str15 = y8l.LJIIL;
                            if (str15 != null) {
                                linkedHashMap.put("deviceModel", str15);
                            }
                            String str16 = y8l.LJIILIIL;
                            if (str16 != null) {
                                linkedHashMap.put("netType", str16);
                            }
                            String str17 = y8l.LJIILJJIL;
                            if (str17 != null) {
                                linkedHashMap.put("carrier", str17);
                            }
                            String str18 = y8l.LJIIIIZZ;
                            if (str18 != null) {
                                linkedHashMap.put("appTheme", str18);
                            }
                            Boolean bool4 = y8l.LJIILL;
                            if (bool4 != null) {
                                linkedHashMap.put("is32Bit", Boolean.valueOf(bool4.booleanValue()));
                            }
                            Y8J y8j = this.LIZ;
                            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
                            y8j.getClass();
                            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
                            return;
                        }
                        o.LJIIZILJ();
                        throw null;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
