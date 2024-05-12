package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.6qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172976qb {
    public static Context LIZJ;
    public static boolean LIZLLL;
    public static final C172976qb LIZ = new C172976qb();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("CutSameJni", "DavinciResourceJni", "NLEResourcesDAVJni", "NLETemplateModelJni");
    public static final C172996qd LJ = C172996qd.LJLIL;

    public final synchronized void LIZ() {
        if (LIZLLL) {
            return;
        }
        for (String str : LIZIZ) {
            LJ.getClass();
            new C172986qc().LIZ(str);
        }
        LIZLLL = true;
    }
}
