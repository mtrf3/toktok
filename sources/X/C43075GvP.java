package X;

import Y.ACallableS83S0101000_12;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import defpackage.i0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GvP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43075GvP {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;
    public static final String LJIIIZ;
    public static final String LJIIJ;
    public static final String LJIIJJI;
    public static final String LJIIL;
    public static final String LJIILIIL;
    public static final String LJIILJJIL;
    public static final String LJIILL;
    public static final String LJIILLIIL;

    static {
        String creativeToolRootDir;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        int i = 0;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C44687HgJ.LJIIIZ(C60903NvH.LJ));
            LIZ2.append("/");
            creativeToolRootDir = X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getCreativeToolRootDir error exception:");
            LIZ3.append(e.getMessage());
            H78.LIZJ(X1D.LIZIZ(LIZ3));
            creativeToolRootDir = ((IVideoRecordPreferences) new C44350Has(i).LIZ(C60903NvH.LJ, IVideoRecordPreferences.class)).getCreativeToolRootDir("");
        }
        if (TextUtils.isEmpty(creativeToolRootDir)) {
            creativeToolRootDir = C60903NvH.LJ.getFilesDir() + "/";
        }
        C10K.LIZJ(new ACallableS83S0101000_12(0, creativeToolRootDir, 1));
        LIZ = creativeToolRootDir;
        LIZIZ = i0.LJFF(creativeToolRootDir, "tmp/");
        LIZJ = i0.LJFF(creativeToolRootDir, "draft/");
        LIZLLL = i0.LJFF(creativeToolRootDir, "import/");
        LJ = i0.LJFF(creativeToolRootDir, "background_video/tmp/");
        LJFF = i0.LJFF(creativeToolRootDir, "background_video/draft/");
        LJI = i0.LJFF(creativeToolRootDir, "origin_sound/");
        LJII = i0.LJFF(creativeToolRootDir, "tmp_video/");
        LJIIIIZZ = i0.LJFF(creativeToolRootDir, "parallel_upload/");
        LJIIIZ = i0.LJFF(creativeToolRootDir, "record_work_space");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(creativeToolRootDir);
        LIZ4.append("shortvideo/videoedit/audiorecord/");
        X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(creativeToolRootDir);
        LIZ5.append("cache/");
        LJIIJ = X1D.LIZIZ(LIZ5);
        LJIIJJI = i0.LJFF(creativeToolRootDir, "filters/");
        LJIIL = i0.LJFF(creativeToolRootDir, "audio-effect/");
        LJIILIIL = i0.LJFF(creativeToolRootDir, "music/");
        LJIILJJIL = i0.LJFF(creativeToolRootDir, "noCopyDraft/");
        LJIILL = i0.LJFF(creativeToolRootDir, "effect/download/");
        LJIILLIIL = i0.LJFF(creativeToolRootDir, "compat_draft_track/");
        C44687HgJ.LJI(new File(creativeToolRootDir));
    }

    public static String LIZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(simpleDateFormat.format(time));
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }
}
