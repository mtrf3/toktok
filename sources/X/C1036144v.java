package X;

import com.ss.android.ugc.aweme.im.service.appsettings.DMTakoConfig;
import java.util.List;

/* renamed from: X.44v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1036144v {
    public static final List<Long> LIZ;
    public static final DMTakoConfig LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        List<Long> LJJIJIIJI = C47261Igj.LJJIJIIJI(5000L, 10000L);
        LIZ = LJJIJIIJI;
        List LJJIJIIJI2 = C47261Igj.LJJIJIIJI(4000L, 8000L, 12000L, 16000L);
        Boolean bool = Boolean.TRUE;
        LIZIZ = new DMTakoConfig(20000L, LJJIJIIJI2, bool, bool, bool, LJJIJIIJI, 0, 1000L, 5000L);
        LIZJ = C221108m2.LIZIZ(C1036344x.LJLIL);
    }

    public static DMTakoConfig LIZ() {
        return (DMTakoConfig) LIZJ.getValue();
    }
}
