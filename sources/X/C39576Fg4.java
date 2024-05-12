package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Fg4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39576Fg4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(int i) {
        Keva repoFromSp = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "InitialChooseLanguagePreferences", 0);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(AppContext…ants.MODE_SINGLE_PROCESS)");
        repoFromSp.storeInt("languageDialogShowState", i);
    }
}
