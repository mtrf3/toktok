package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0TY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TY {
    public static final String LIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static String LJFF;
    public static final List<String> LJI;
    public static final List<String> LJII;
    public static final List<String> LJIIIIZZ;
    public static final String LJIIJ;
    public static final String LJIIIZ = C15380j0.LJIILJJIL(R.string.kzl);
    public static final String LIZIZ = C15380j0.LJIILJJIL(R.string.ssm);

    public static String LIZ() {
        LiveComposerFilterSetting liveComposerFilterSetting = LiveComposerFilterSetting.INSTANCE;
        if (liveComposerFilterSetting.isComposerSupported()) {
            if (liveComposerFilterSetting.isNewEngineExperiment()) {
                return "livefiltercomposerexperiment";
            }
            return "livefiltercomposer";
        }
        return "livefilter";
    }

    static {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ssn);
        LIZ = LJIILJJIL;
        LIZJ = C15380j0.LJIILJJIL(R.string.sso);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.ssk);
        LIZLLL = LJIILJJIL2;
        LJ = C15380j0.LJIILJJIL(R.string.ssl);
        LJI = Arrays.asList(LJIILJJIL, LIZ(), LJIILJJIL2, "beauty");
        LJII = Arrays.asList(LIZ());
        LJIIIIZZ = Arrays.asList(LJIILJJIL, "liveguestbeauty", "beauty");
        LJIIJ = C15380j0.LJIILJJIL(R.string.kyy);
    }
}
