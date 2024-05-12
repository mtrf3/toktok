package X;

import com.bytedance.ies.smartmovie.jni.CompressMetaCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieConfig;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.librarian.Librarian;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Hnq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45154Hnq {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C45154Hnq LIZJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C45154Hnq.class), "smartMovieApiImpl", "getSmartMovieApiImpl()Lcom/bytedance/ies/smartmovie/core/SmartMovieApiImpl;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
        LIZJ = new C45154Hnq();
        LIZIZ = C221108m2.LIZIZ(C45158Hnu.LJLIL);
    }

    public static C45155Hnr LIZJ() {
        return (C45155Hnr) LIZIZ.getValue();
    }

    public static void LIZ(String str) {
        C45155Hnr LIZJ2 = LIZJ();
        LIZJ2.getClass();
        SmartMovie smartMovie = LIZJ2.LIZ;
        if (smartMovie != null) {
            SmartMovieJniJNI.SmartMovie_cancelCompressMeta(smartMovie.LIZ, smartMovie, str);
            Long l = LIZJ2.LIZ().get(str);
            if (l != null) {
                Object value = LIZJ2.LIZJ.getValue();
                long longValue = l.longValue();
                value.getClass();
                C45137HnZ.LIZ(longValue);
                return;
            }
            return;
        }
        o.LJIJI("smartMovie");
        throw null;
    }

    public static void LIZLLL(C45162Hny config) {
        Object LIZ2;
        o.LJIIJ(config, "config");
        C45155Hnr LIZJ2 = LIZJ();
        LIZJ2.getClass();
        if (LIZJ2.LIZ == null) {
            synchronized (C45159Hnv.LIZIZ) {
                if (!C45159Hnv.LIZ) {
                    C45159Hnv.LIZ = true;
                    try {
                        Librarian.LJ("NLEEditorJni");
                        Librarian.LJ("DavinciResourceJni");
                        Librarian.LJ("NLEResourcesDAVJni");
                        Librarian.LJ("SmartMovieJni");
                        LIZ2 = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    C3C5.m10exceptionOrNullimpl(LIZ2);
                }
            }
            SmartMovieConfig smartMovieConfig = (SmartMovieConfig) config.invoke();
            LIZJ2.LIZIZ = smartMovieConfig;
            LIZJ2.LIZ = new SmartMovie(smartMovieConfig);
        }
    }

    public static String LIZIZ(VecMeta vecMeta, String extra, CompressMetaCallback compressMetaCallback) {
        o.LJIIJ(extra, "extra");
        C45155Hnr LIZJ2 = LIZJ();
        LIZJ2.getClass();
        C45153Hnp c45153Hnp = new C45153Hnp(compressMetaCallback, new Object[0]);
        SmartMovie smartMovie = LIZJ2.LIZ;
        if (smartMovie != null) {
            String execId = SmartMovieJniJNI.SmartMovie_compressMeta(smartMovie.LIZ, smartMovie, VecMeta.LJFF(vecMeta), vecMeta, extra, CompressMetaCallback.getCPtr(compressMetaCallback), compressMetaCallback);
            HashMap<String, Long> LIZ2 = LIZJ2.LIZ();
            o.LJFF(execId, "execId");
            LIZ2.put(execId, Long.valueOf(c45153Hnp.LIZIZ));
            return execId;
        }
        o.LJIJI("smartMovie");
        throw null;
    }
}
