package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OFe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61590OFe {
    public static final java.util.Map<String, Typeface[]> LIZ = new HashMap();
    public static final java.util.Map<Typeface, Typeface[]> LIZIZ = new HashMap();
    public static final String[] LIZJ = {"", "_bold", "_italic", "_bold_italic"};
    public static final String[] LIZLLL = {".ttf", ".otf"};
    public static final ConcurrentHashMap<String, C61591OFf> LJ = new ConcurrentHashMap<>();
    public static final List<InterfaceC40021FnF> LJFF = new ArrayList();

    public static void LIZ(InterfaceC40021FnF interfaceC40021FnF) {
        ((ArrayList) LJFF).add(interfaceC40021FnF);
    }

    public static synchronized void LIZIZ(String str, int i, Typeface typeface) {
        synchronized (C61590OFe.class) {
            java.util.Map<String, Typeface[]> map = LIZ;
            Typeface[] typefaceArr = (Typeface[]) ((HashMap) map).get(str);
            if (typefaceArr == null) {
                typefaceArr = new Typeface[4];
                ((HashMap) map).put(str, typefaceArr);
            }
            typefaceArr[i] = typeface;
            ((HashMap) LIZIZ).put(typeface, typefaceArr);
        }
    }

    public static synchronized Typeface LIZJ(int i, VNU vnu, String str) {
        Typeface typeface;
        synchronized (C61590OFe.class) {
            Typeface[] typefaceArr = (Typeface[]) ((HashMap) LIZ).get(str);
            if (typefaceArr != null && (typeface = typefaceArr[i]) != null) {
                return typeface;
            }
            Iterator it = ((ArrayList) LJFF).iterator();
            while (it.hasNext()) {
                Typeface LIZ2 = ((InterfaceC40021FnF) it.next()).LIZ(i, str);
                if (LIZ2 != null) {
                    LIZIZ(str, i, LIZ2);
                    return LIZ2;
                }
            }
            Typeface LIZJ2 = C61592OFg.LIZ.LIZJ(vnu, str, i, null);
            if (LIZJ2 != null) {
                return LIZJ2;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Can't not find typeface for fontFamily: ");
            LIZ3.append(str);
            LIZ3.append(" in lynx.");
            LLog.LIZLLL(0, "TypefaceCache", X1D.LIZIZ(LIZ3));
            return null;
        }
    }

    public static Typeface LIZLLL(AssetManager assetManager, String str, int i) {
        String LIZIZ2 = YE1.LIZIZ(str, "font/", i);
        ConcurrentHashMap<String, C61591OFf> concurrentHashMap = LJ;
        if (concurrentHashMap.containsKey(LIZIZ2)) {
            return concurrentHashMap.get(LIZIZ2).LIZ;
        }
        String str2 = LIZJ[i];
        StringBuilder sb = new StringBuilder(32);
        sb.append("font/");
        sb.append("");
        sb.append(str);
        sb.append(str2);
        int length = sb.length();
        for (String str3 : LIZLLL) {
            String sb2 = sb.toString();
            if (!sb2.endsWith(str3)) {
                sb.append(str3);
                sb2 = sb.toString();
            }
            try {
                Typeface createFromAsset = Typeface.createFromAsset(assetManager, sb2);
                LJ.put(LIZIZ2, new C61591OFf(createFromAsset));
                return createFromAsset;
            } catch (RuntimeException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Exception happens whe cacheTypefaceFromAssets with message ");
                LIZ2.append(e.getMessage());
                LLog.LIZLLL(3, "TypefaceCache", X1D.LIZIZ(LIZ2));
                sb.setLength(length);
            }
        }
        LJ.put(LIZIZ2, new C61591OFf(null));
        return null;
    }
}
