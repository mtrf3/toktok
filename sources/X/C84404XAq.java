package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.XAq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84404XAq {
    public static final C84407XAt Companion = new C84407XAt();
    public final C84389XAb algorithmModelCache;
    public final C84376X9o buildInAssetsManager;
    public final InterfaceC84406XAs eventListener;

    public long getEffectHandle() {
        return 0L;
    }

    public void onModelFound(String modelName) {
        o.LJIIJ(modelName, "modelName");
    }

    private final String findTransResUri(String str) {
        List<C32621Pu> LJIILJJIL;
        String str2;
        String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(str, "resource/trans?effectPath=", "", false), "\"", "", false);
        if (ujb.o.LJJJJ(LJJJJZ, "/", false)) {
            LJJJJZ = LJJJJZ.substring(0, LJJJJZ.length() - 1);
            o.LJFF(LJJJJZ, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        String substring = LJJJJZ.substring(0, s.LJJLIIJ(LJJJJZ, "/", 6));
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = LJJJJZ.substring(s.LJJLIIJ(LJJJJZ, "/", 6) + 1, LJJJJZ.length());
        o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(substring);
        LIZ.append(C10820be.LIZ);
        LIZ.append(substring2);
        LIZ.append("_trans_");
        String prefix = X1D.LIZIZ(LIZ);
        o.LJIIJ(prefix, "prefix");
        if (!C84405XAr.LIZ.contains(prefix) && (LJIILJJIL = C10820be.LJIILJJIL(substring)) != null) {
            for (C32621Pu c32621Pu : LJIILJJIL) {
                String str3 = c32621Pu.LJLIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(substring2);
                LIZ2.append("_trans_");
                if (ujb.o.LJJJLIIL(str3, X1D.LIZIZ(LIZ2), false) && (str2 = c32621Pu.LJLILLLLZI.LIZIZ) != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("file://");
                    LIZ3.append(str2);
                    String filePath = X1D.LIZIZ(LIZ3);
                    o.LJIIJ(filePath, "filePath");
                    String uri = UriProtector.parse(filePath).toString();
                    o.LJFF(uri, "Uri.parse(filePath).toString()");
                    return uri;
                }
            }
        }
        return "asset://not_found";
    }

    private final boolean isTransRes(String str) {
        return ujb.o.LJJJLIIL(str, "resource/trans?effectPath=", false);
    }

    public String findResourceUri(String nameStr) {
        boolean z;
        o.LJIIJ(nameStr, "nameStr");
        XAO LJII = this.algorithmModelCache.LJII(XAN.LIZJ(nameStr));
        if (LJII != null) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            if (LJII != null) {
                str = LJII.LJFF;
            }
            LIZ.append(str);
            String filePath = X1D.LIZIZ(LIZ);
            o.LJIIJ(filePath, "filePath");
            String uri = UriProtector.parse(filePath).toString();
            o.LJFF(uri, "Uri.parse(filePath).toString()");
            return uri;
        }
        if (!isExactBuiltInResource(nameStr)) {
            return null;
        }
        return getBuiltInResourceUrl(nameStr);
    }

    public String getBuiltInResourceUrl(String nameStr) {
        o.LJIIJ(nameStr, "nameStr");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("asset://model/");
        LIZ.append(nameStr);
        return X1D.LIZIZ(LIZ);
    }

    public boolean isExactBuiltInResource(String nameStr) {
        o.LJIIJ(nameStr, "nameStr");
        C84376X9o c84376X9o = this.buildInAssetsManager;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("model/");
        LIZ.append(nameStr);
        return c84376X9o.LIZ(X1D.LIZIZ(LIZ));
    }

    public final boolean isResourceAvailable(String nameStr) {
        o.LJIIJ(nameStr, "nameStr");
        if (findResourceUri(nameStr) != null && (!o.LJ(r2, "asset://md5_error")) && (!o.LJ(r2, "asset://not_found"))) {
            return true;
        }
        return false;
    }

    public final void markModelUsed(String nameStr) {
        o.LJIIJ(nameStr, "nameStr");
        this.algorithmModelCache.LIZIZ(XAN.LIZJ(nameStr));
    }

    public final String readAssetFileAsString(String filePath) {
        o.LJIIJ(filePath, "filePath");
        return this.buildInAssetsManager.LIZLLL(filePath);
    }

    public void onModelNotFound(String modelName, String errorMessage) {
        o.LJIIJ(modelName, "modelName");
        o.LJIIJ(errorMessage, "errorMessage");
        RuntimeException runtimeException = new RuntimeException(i0.LJFF("model not found neither in asset nor disk ", errorMessage));
        InterfaceC84406XAs interfaceC84406XAs = this.eventListener;
        if (interfaceC84406XAs != null) {
            interfaceC84406XAs.onModelNotFound(null, runtimeException);
        }
    }

    public C84404XAq(C84389XAb algorithmModelCache, C84376X9o buildInAssetsManager, InterfaceC84406XAs interfaceC84406XAs) {
        o.LJIIJ(algorithmModelCache, "algorithmModelCache");
        o.LJIIJ(buildInAssetsManager, "buildInAssetsManager");
        this.algorithmModelCache = algorithmModelCache;
        this.buildInAssetsManager = buildInAssetsManager;
        this.eventListener = interfaceC84406XAs;
    }

    private final boolean checkModelMd5(String str, int i, String str2) {
        ExtendedUrlModel file_url;
        if (str2 != null && !isExactBuiltInResource(str)) {
            String LIZJ = XAN.LIZJ(str);
            String LIZIZ = XAN.LIZIZ(str2);
            C84397XAj.LJIIJJI.getClass();
            XAS LIZIZ2 = C84397XAj.LIZIZ(C84398XAk.LIZ(), i);
            if (LIZIZ2 != null) {
                try {
                    file_url = LIZIZ2.LIZ(LIZJ);
                } catch (IllegalArgumentException e) {
                    C12310e3.LIZIZ.getClass();
                    C12310e3.LIZIZ("AlgorithmResourceFinder", "model info not found in model list", e);
                    C84397XAj.LJIIJJI.getClass();
                    ModelInfo LIZLLL = C84398XAk.LIZ().LIZLLL(i, LIZJ, true);
                    if (LIZLLL != null) {
                        file_url = LIZLLL.getFile_url();
                    }
                }
                if (file_url != null) {
                    String uri = file_url.getUri();
                    if (!C107244Iu.LIZ(LIZIZ, uri)) {
                        String str3 = str + " md5 = " + LIZIZ + " expectedMd5 = " + uri;
                        C12310e3 c12310e3 = C12310e3.LIZIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("findResourceUri called with nameStr = [");
                        LIZ.append(str);
                        LIZ.append("], asset://md5_error\n");
                        LIZ.append(str3);
                        String LIZIZ3 = X1D.LIZIZ(LIZ);
                        c12310e3.getClass();
                        C12310e3.LIZ("AlgorithmResourceFinder", LIZIZ3);
                        onModelNotFound(LIZJ, str3);
                        return true;
                    }
                }
            }
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("AlgorithmResourceFinder", "expected model info not found in model list", null);
            return false;
        }
        return false;
    }

    public final String realFindResourceUri(int i, String str, String nameStr) {
        o.LJIIJ(nameStr, "nameStr");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("findResourceUri() called with nameStr = [");
        LIZ.append(nameStr);
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("AlgorithmResourceFinder", LIZIZ);
        if (isTransRes(nameStr)) {
            return findTransResUri(nameStr);
        }
        String findResourceUri = findResourceUri(nameStr);
        try {
            if (checkModelMd5(nameStr, i, findResourceUri)) {
                return "asset://md5_error";
            }
        } catch (RuntimeException e) {
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("findResourceUri called with nameStr = [");
            LIZ2.append(nameStr);
            LIZ2.append("], exception hanppens");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            c12310e32.getClass();
            C12310e3.LIZIZ("AlgorithmResourceFinder", LIZIZ2, e);
        }
        if (findResourceUri == null) {
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + nameStr + "], returned result: [asset://not_found]", null);
            return "asset://not_found";
        }
        C12310e3.LIZIZ.getClass();
        C12310e3.LIZ("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + nameStr + "], returned result: [" + findResourceUri + ']');
        onModelFound(nameStr);
        return findResourceUri;
    }
}
