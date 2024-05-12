package X;

import X.C37433Emb;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.setting.Settings;
import defpackage.i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.EmZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37431EmZ {
    public static OSZ<String, Config> LIZIZ;
    public static final C37431EmZ LIZJ = new C37431EmZ();
    public static final Config LIZ = new Config(null, null, null, false, 15, null);

    public static String LIZ(android.net.Uri uri) {
        Object obj;
        boolean z;
        C37433Emb.b bVar;
        if (!C85693Xx.LIZIZ(uri)) {
            return null;
        }
        C37434Emc c37434Emc = (C37434Emc) C37413EmH.LIZ(Settings.LJIIIZ).LJ.getValue();
        String str = c37434Emc.LIZIZ.get(uri);
        boolean z2 = true;
        if (TextUtils.isEmpty(str)) {
            C770230o LIZ2 = C770230o.LIZ(uri);
            if (LIZ2 != null) {
                C37433Emb<String, C770230o> c37433Emb = c37434Emc.LIZ;
                List<String> list = LIZ2.LIZ;
                c37433Emb.getClass();
                if (!list.isEmpty()) {
                    Stack stack = new Stack();
                    stack.push(new C37435Emd(c37433Emb.LIZ, 0));
                    while (!stack.isEmpty()) {
                        C37435Emd c37435Emd = (C37435Emd) stack.pop();
                        int i = c37435Emd.LIZIZ;
                        if (i == list.size()) {
                            obj = c37435Emd.LIZ.LIZIZ;
                            if (obj != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                break;
                            }
                        } else {
                            Object obj2 = ListProtector.get(list, i);
                            String str2 = c37433Emb.LIZIZ;
                            if (str2 != null && (bVar = (C37433Emb.b) ((HashMap) c37435Emd.LIZ.LIZ).get(str2)) != null) {
                                stack.push(new C37435Emd(bVar, i + 1));
                            }
                            C37433Emb.b bVar2 = (C37433Emb.b) ((HashMap) c37435Emd.LIZ.LIZ).get(obj2);
                            if (bVar2 != null) {
                                stack.push(new C37435Emd(bVar2, i + 1));
                            }
                        }
                    }
                }
                obj = null;
                C770230o c770230o = (C770230o) obj;
                if (c770230o != null) {
                    try {
                        StringBuilder sb = new StringBuilder("pia_page");
                        for (int i2 = 0; i2 < LIZ2.LIZ.size(); i2++) {
                            if (((String) ListProtector.get(c770230o.LIZ, i2)).startsWith("^")) {
                                sb.append("/");
                                sb.append((String) ListProtector.get(LIZ2.LIZ, i2));
                            }
                        }
                        List<String> list2 = c770230o.LIZIZ;
                        if (list2 != null) {
                            Iterator<String> it = list2.iterator();
                            while (it.hasNext()) {
                                String queryParameter = UriProtector.getQueryParameter(uri, it.next());
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    sb.append("/");
                                    sb.append(queryParameter);
                                }
                            }
                        }
                        str = sb.toString();
                        if (!str.equals("pia_page")) {
                            c37434Emc.LIZIZ.put(uri, str);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            str = null;
        }
        if (str != null && str.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            return str;
        }
        String authority = uri.getAuthority();
        String path = uri.getPath();
        if (TextUtils.isEmpty(authority) || TextUtils.isEmpty(path)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("pia_page/");
        String LJFF = i0.LJFF(authority, path);
        for (int i3 = 0; i3 < LJFF.length(); i3++) {
            char charAt = LJFF.charAt(i3);
            if (charAt != '-') {
                if (charAt != '.') {
                    sb2.append(charAt);
                } else {
                    sb2.append('-');
                }
            } else {
                sb2.append("--");
            }
        }
        return sb2.toString();
    }

    public final synchronized Config LIZIZ(android.net.Uri uri) {
        Config config;
        if (uri == null) {
            return null;
        }
        String LIZ2 = LIZ(uri);
        if (LIZ2 != null && LIZ2.length() != 0) {
            OSZ<String, Config> osz = LIZIZ;
            if (osz != null && o.LJ(osz.getFirst(), LIZ2)) {
                return osz.getSecond();
            }
            InterfaceC37417EmL interfaceC37417EmL = C37509Enp.LIZJ;
            if (interfaceC37417EmL != null && (config = (Config) interfaceC37417EmL.LIZ(LIZ2, LIZ, Config.class)) != null && !o.LJ(config, LIZ)) {
                if (config.LIZIZ().isEmpty()) {
                    return null;
                }
                LIZIZ = new OSZ<>(LIZ2, config);
                return config;
            }
            return null;
        }
        return null;
    }
}
