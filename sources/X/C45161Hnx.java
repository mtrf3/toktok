package X;

import android.content.Context;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.database.DBManagerFactory;
import com.ss.ugc.android.davinciresource.jni.DavinciResourceJniJNI;
import kotlin.jvm.internal.o;

/* renamed from: X.Hnx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45161Hnx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C172686q8.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C45130HnS.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C45143Hnf.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C45148Hnk.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C45166Ho2.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C45173Ho9.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C45260HpY.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C45165Ho1.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C45167Ho3.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C144165lE.LJLIL);
    public static boolean LJIIJ;

    public static TemplateSourceConfig LIZ() {
        return (TemplateSourceConfig) LJI.getValue();
    }

    public static final synchronized void LIZIZ(InterfaceC45141Hnd interfaceC45141Hnd) {
        synchronized (C45161Hnx.class) {
            C45154Hnq c45154Hnq = C45154Hnq.LIZJ;
            C45162Hny c45162Hny = C45162Hny.LJLIL;
            c45154Hnq.getClass();
            C45154Hnq.LIZLLL(c45162Hny);
            if (interfaceC45141Hnd != null) {
                ((C45125HnN) LIZIZ.getValue()).LIZLLL = interfaceC45141Hnd;
                ((C45139Hnb) LIZJ.getValue()).LIZLLL = interfaceC45141Hnd;
                ((C45146Hni) LIZLLL.getValue()).LIZJ = interfaceC45141Hnd;
            }
            String str = LIZ().templateCacheDir;
            o.LJIIIZ(str, "<set-?>");
            C45244HpI.LIZIZ = str;
            String str2 = LIZ().mediaCacheDir;
            o.LJIIIZ(str2, "<set-?>");
            C45244HpI.LIZJ = str2;
            DavinciResourceJniJNI.DAVGcmCrypt_enable(C44181HVp.LIZ());
            DavinciResource.INSTANCE.setDbManagerFactory(new DBManagerFactory(C5L7.LIZ()));
            if (G3R.LIZ()) {
                C68M LJIIJ2 = C68M.LJIIJ();
                Context LIZ2 = C5L7.LIZ();
                if (C77413UZt.LJIILL(LJIIJ2.LJIIIZ())) {
                    LJIIJ2.LJIJ(LIZ2);
                }
            }
        }
    }

    public static final void LIZJ(String str) {
        if (LJIIJ) {
            C45171Ho7 c45171Ho7 = (C45171Ho7) LJ.getValue();
            c45171Ho7.getClass();
            if (str == null || str.length() == 0) {
                return;
            }
            C45180HoG LIZIZ2 = c45171Ho7.LIZIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("_isMix=0");
            if (C78685UuP.LJJJZ(LIZIZ2.LIZ(X1D.LIZIZ(LIZ2)))) {
                C45180HoG LIZIZ3 = c45171Ho7.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append("_isMix=0");
                LIZIZ3.LIZLLL(X1D.LIZIZ(LIZ3));
                return;
            }
            C45180HoG LIZIZ4 = c45171Ho7.LIZIZ();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append("_isMix=1");
            if (!C78685UuP.LJJJZ(LIZIZ4.LIZ(X1D.LIZIZ(LIZ4)))) {
                return;
            }
            C45180HoG LIZIZ5 = c45171Ho7.LIZIZ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(str);
            LIZ5.append("_isMix=1");
            LIZIZ5.LIZLLL(X1D.LIZIZ(LIZ5));
        }
    }
}
