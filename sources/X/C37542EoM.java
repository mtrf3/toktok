package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.google.gson.g;
import com.google.gson.m;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.EoM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37542EoM {
    public static Keva LIZ;
    public static C37543EoN LIZIZ;
    public static String LIZJ;
    public static android.net.Uri LIZLLL;
    public static long LJ;
    public static String LJIIIZ;
    public static final C37542EoM LJIIJJI = new C37542EoM();
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final boolean LJII = true;
    public static final java.util.Set<String> LJIIIIZZ = new LinkedHashSet();
    public static final ArrayList<String> LJIIJ = new ArrayList<>();

    public static void LIZLLL() {
        InterfaceC37599EpH defaultResourceLoader;
        if (LIZIZ == null || !LJFF.compareAndSet(false, true)) {
            return;
        }
        if (LIZIZ != null) {
            if (LJI.get()) {
                C37543EoN c37543EoN = LIZIZ;
                if (c37543EoN != null) {
                    long j = c37543EoN.LIZIZ;
                    if (j <= 0 || System.currentTimeMillis() - LJ < j * 60 * 1000) {
                        return;
                    }
                } else {
                    o.LJIJI("appInfo");
                    throw null;
                }
            }
            if (LIZIZ != null) {
                android.net.Uri it = LIZLLL;
                if (it == null) {
                    if (LIZJ == null) {
                        return;
                    }
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme("https");
                    String str = LIZJ;
                    if (str != null) {
                        builder.authority(str);
                        builder.appendPath("common");
                        builder.appendQueryParameter("app_id", "349653");
                        C37543EoN c37543EoN2 = LIZIZ;
                        if (c37543EoN2 != null) {
                            builder.appendQueryParameter("device_id", c37543EoN2.LIZJ);
                            if (LIZIZ != null) {
                                builder.appendQueryParameter("user_id", "");
                                C37543EoN c37543EoN3 = LIZIZ;
                                if (c37543EoN3 != null) {
                                    builder.appendQueryParameter("channel", c37543EoN3.LJ);
                                    C37543EoN c37543EoN4 = LIZIZ;
                                    if (c37543EoN4 != null) {
                                        builder.appendQueryParameter("device_type", c37543EoN4.LJFF);
                                        builder.appendQueryParameter("device_platform", "Android");
                                        C37543EoN c37543EoN5 = LIZIZ;
                                        if (c37543EoN5 != null) {
                                            builder.appendQueryParameter("os_version", c37543EoN5.LJI);
                                            C37543EoN c37543EoN6 = LIZIZ;
                                            if (c37543EoN6 != null) {
                                                builder.appendQueryParameter("host_app_id", String.valueOf(c37543EoN6.LIZ));
                                                C37543EoN c37543EoN7 = LIZIZ;
                                                if (c37543EoN7 != null) {
                                                    builder.appendQueryParameter("host_app_name", c37543EoN7.LIZLLL);
                                                    C37543EoN c37543EoN8 = LIZIZ;
                                                    if (c37543EoN8 != null) {
                                                        builder.appendQueryParameter("host_version", c37543EoN8.LJII);
                                                        builder.appendQueryParameter("sdk_version", "2.3.0");
                                                        it = builder.build();
                                                        StringBuilder LIZ2 = X1D.LIZ();
                                                        LIZ2.append("PIA Settings Url: ");
                                                        LIZ2.append(it);
                                                        C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
                                                        o.LJFF(it, "it");
                                                        LIZLLL = it;
                                                        if (it == null) {
                                                            return;
                                                        }
                                                    } else {
                                                        o.LJIJI("appInfo");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("appInfo");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("appInfo");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("appInfo");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("appInfo");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("appInfo");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("appInfo");
                                throw null;
                            }
                        } else {
                            o.LJIJI("appInfo");
                            throw null;
                        }
                    } else {
                        o.LJIJI("apiHost");
                        throw null;
                    }
                }
                InterfaceC37408EmC<InterfaceC37599EpH> interfaceC37408EmC = C37509Enp.LJ;
                if (interfaceC37408EmC == null || (defaultResourceLoader = interfaceC37408EmC.create()) == null) {
                    defaultResourceLoader = new DefaultResourceLoader(null);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[PIASettings] start fetching settings, URL: ");
                LIZ3.append(it);
                C37238EjS.LJI(6, X1D.LIZIZ(LIZ3), null);
                defaultResourceLoader.LIZ(EnumC37644Eq0.Online, new C37546EoQ(it), new C37494Ena(), new C37423EmR());
                return;
            }
            o.LJIJI("appInfo");
            throw null;
        }
        o.LJIJI("appInfo");
        throw null;
    }

    public static void LIZ(C65385PlN c65385PlN) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.BEGIN_OBJECT) {
            c65385PlN.LIZIZ();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (c65385PlN.LJIIJJI()) {
                String name = c65385PlN.LJJ();
                o.LJFF(name, "name");
                if (ujb.o.LJJJLIIL(name, "page/", false)) {
                    try {
                        LJIIJJI.getClass();
                        LIZIZ(name, c65385PlN, linkedHashSet);
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                } else {
                    c65385PlN.LJJJJ();
                }
            }
            c65385PlN.LJFF();
            java.util.Set<String> set = LJIIIIZZ;
            set.clear();
            set.addAll(linkedHashSet);
            return;
        }
        c65385PlN.LJJJJ();
    }

    public static void LIZJ(InputStream inputStream) {
        C65385PlN c65385PlN = new C65385PlN(new InputStreamReader(inputStream));
        try {
            c65385PlN.LIZIZ();
            while (c65385PlN.LJIIJJI()) {
                if (o.LJ(c65385PlN.LJJ(), "data")) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("");
                    LIZ2.append(c65385PlN.hashCode());
                    LIZ2.append(LJIIJJI.hashCode());
                    LJIIIZ = X1D.LIZIZ(LIZ2);
                    LIZ(c65385PlN);
                } else {
                    c65385PlN.LJJJJ();
                }
            }
            c65385PlN.LJFF();
            AnonymousClass636.LJFF(c65385PlN, null);
        } finally {
        }
    }

    public static void LIZIZ(String str, C65385PlN c65385PlN, java.util.Set set) {
        Object LIZ2;
        if (c65385PlN.LJJIJIL() != EnumC65386PlO.BEGIN_OBJECT) {
            c65385PlN.LJJJJ();
            return;
        }
        c65385PlN.LIZIZ();
        while (c65385PlN.LJIIJJI()) {
            if (o.LJ(c65385PlN.LJJ(), "val")) {
                if (ujb.o.LJJJLIIL(str, "page/", false)) {
                    if (c65385PlN.LJJIJIL() == EnumC65386PlO.BEGIN_OBJECT) {
                        c65385PlN.LIZIZ();
                        g gVar = new g();
                        String str2 = null;
                        String str3 = null;
                        while (c65385PlN.LJIIJJI()) {
                            String LJJ = c65385PlN.LJJ();
                            if (LJJ != null) {
                                int hashCode = LJJ.hashCode();
                                if (hashCode != -290659267) {
                                    if (hashCode != 116079) {
                                        if (hashCode == 351608024 && LJJ.equals("version")) {
                                            if (c65385PlN.LJJIJIL() == EnumC65386PlO.STRING) {
                                                str3 = c65385PlN.LJJIIZI();
                                            } else {
                                                c65385PlN.LJJJJ();
                                            }
                                        }
                                    } else if (LJJ.equals("url")) {
                                        if (c65385PlN.LJJIJIL() == EnumC65386PlO.STRING) {
                                            str2 = c65385PlN.LJJIIZI();
                                        } else {
                                            c65385PlN.LJJJJ();
                                        }
                                    }
                                } else if (LJJ.equals("features")) {
                                    if (c65385PlN.LJJIJIL() == EnumC65386PlO.BEGIN_ARRAY) {
                                        c65385PlN.LIZ();
                                        while (c65385PlN.LJIIJJI()) {
                                            if (c65385PlN.LJJIJIL() == EnumC65386PlO.STRING) {
                                                gVar.LJJIIJ(c65385PlN.LJJIIZI());
                                            } else {
                                                c65385PlN.LJJJJ();
                                            }
                                        }
                                        c65385PlN.LJ();
                                    } else {
                                        c65385PlN.LJJJJ();
                                    }
                                }
                            }
                            c65385PlN.LJJJJ();
                        }
                        c65385PlN.LJFF();
                        if (str2 != null && str2.length() != 0) {
                            try {
                                LIZ2 = C85693Xx.LIZJ(UriProtector.parse(str2), null);
                                C3C5.m7constructorimpl(LIZ2);
                            } catch (Throwable th) {
                                LIZ2 = C141335gf.LIZ(th);
                                C3C5.m7constructorimpl(LIZ2);
                            }
                            if (C3C5.m12isFailureimpl(LIZ2)) {
                                LIZ2 = null;
                            }
                            String str4 = (String) LIZ2;
                            if (str4 != null && str4.length() != 0) {
                                m mVar = new m();
                                String str5 = LJIIIZ;
                                if (str5 != null) {
                                    mVar.LJJIIZ("version", str5);
                                    mVar.LJJIIZ("url", str2);
                                    mVar.LJJIIZ("manifestVersion", str3);
                                    mVar.LJJII("features", gVar);
                                    Keva keva = LIZ;
                                    if (keva != null) {
                                        keva.storeString(str4, mVar.toString());
                                        set.add(str4);
                                    } else {
                                        o.LJIJI("settings");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("version");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        c65385PlN.LJJJJ();
                    }
                } else {
                    c65385PlN.LJJJJ();
                }
            } else {
                c65385PlN.LJJJJ();
            }
        }
        c65385PlN.LJFF();
    }
}
