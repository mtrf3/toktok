package X;

import android.content.Context;
import android.content.res.AssetManager;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.X9o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84376X9o {
    public final ArrayList<String> LIZ = C47261Igj.LJII("tt_face_extra");
    public final Object LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean LIZ(String fileName) {
        o.LJIIJ(fileName, "fileName");
        boolean z = false;
        if (LJ(fileName)) {
            return false;
        }
        try {
            C32611Pt LIZJ = LIZJ(fileName);
            if (LIZJ != null) {
                z = true;
                try {
                    LIZJ.close();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public final List<String> LIZIZ(String filePath) {
        o.LJIIJ(filePath, "filePath");
        Object obj = this.LIZIZ;
        List<String> list = null;
        if (!(obj instanceof Context)) {
            return null;
        }
        try {
            Context LLLLL = C16880lQ.LLLLL((Context) obj);
            o.LJFF(LLLLL, "appContext.applicationContext");
            String[] list2 = LLLLL.getAssets().list(filePath);
            if (list2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String it : list2) {
                o.LJFF(it, "it");
                if (!LJ(it)) {
                    arrayList.add(it);
                }
            }
            list = ORZ.LLJI(arrayList);
            return list;
        } catch (Exception e) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error in list file: ");
            LIZ.append(filePath);
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("effect_platform", LIZIZ, e);
            return list;
        }
    }

    public final C32611Pt LIZJ(String str) {
        if (!(this.LIZIZ instanceof Context) || LJ(str)) {
            return null;
        }
        Object obj = this.LIZIZ;
        if (obj != null) {
            Context LLLLL = C16880lQ.LLLLL((Context) obj);
            o.LJFF(LLLLL, "(appContext as Context).applicationContext");
            AssetManager assets = LLLLL.getAssets();
            String LIZJ = XAN.LIZJ(str);
            if (this.LIZJ == null || !new OJD(this.LIZJ).matches(LIZJ)) {
                C32611Pt c32611Pt = new C32611Pt();
                InputStream open = assets.open(str, 2);
                o.LJFF(open, "assetManager.open(fileNa…Manager.ACCESS_STREAMING)");
                c32611Pt.LIZ = open;
                return c32611Pt;
            }
            throw new RuntimeException(i0.LJFF(str, " manually excluded by DownloadableModelSupport.exclusionPattern"));
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.content.Context");
    }

    public final String LIZLLL(String filePath) {
        o.LJIIJ(filePath, "filePath");
        if (!(this.LIZIZ instanceof Context) || LJ(filePath)) {
            return null;
        }
        try {
            Context LLLLL = C16880lQ.LLLLL((Context) this.LIZIZ);
            o.LJFF(LLLLL, "appContext.applicationContext");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(LLLLL.getAssets().open(filePath)));
            try {
                StringBuilder sb = new StringBuilder();
                new C68322mC();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        AnonymousClass636.LJFF(bufferedReader, null);
                        return sb2;
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AssetUtils#loadJson::jsonFilePath=");
            LIZ.append(filePath);
            LIZ.append(", file not exists");
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("effect_platform", LIZIZ);
            return null;
        }
    }

    public final boolean LJ(String str) {
        int LJJLIIIJLLLLLLLZ;
        if (this.LIZLLL && (LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(str, '/', 0, 6) + 1) < str.length()) {
            String substring = str.substring(LJJLIIIJLLLLLLLZ);
            o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
            String LIZJ = XAN.LIZJ(substring);
            if (this.LIZ.contains(LIZJ)) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ignore built in model: ");
                LIZ.append(LIZJ);
                String LIZIZ = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZ("JKL", LIZIZ);
                return true;
            }
        }
        return false;
    }

    public C84376X9o(String str, boolean z, Object obj) {
        this.LIZIZ = obj;
        this.LIZJ = str;
        this.LIZLLL = z;
    }
}
