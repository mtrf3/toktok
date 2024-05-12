package X;

import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GvQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43076GvQ {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;

    static {
        String str;
        try {
            str = C44687HgJ.LJIIIZ(EF7.LIZIZ()) + "/";
        } catch (Exception unused) {
            str = "/aweme/";
        }
        if (TextUtils.isEmpty(str)) {
            str = C16880lQ.LLIIJLIL(EF7.LIZIZ()) + "/";
        }
        LIZ = str;
        LIZIZ = i0.LJFF(str, "tmp/");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("draft/");
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append("import/");
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(str);
        LIZ4.append("background_video/tmp/");
        LIZJ = X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(str);
        LIZ5.append("background_video/draft/");
        X1D.LIZIZ(LIZ5);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(str);
        LIZ6.append("origin_sound/");
        LIZLLL = X1D.LIZIZ(LIZ6);
        LJ = i0.LJFF(str, "tmp_video/");
        LJFF = i0.LJFF(str, "parallel_upload/");
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append(str);
        LIZ7.append("record_work_space");
        X1D.LIZIZ(LIZ7);
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append(str);
        LIZ8.append("shortvideo/videoedit/audiorecord/");
        X1D.LIZIZ(LIZ8);
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append(str);
        LIZ9.append("cache/");
        X1D.LIZIZ(LIZ9);
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append(str);
        LIZ10.append("filters/");
        X1D.LIZIZ(LIZ10);
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append(str);
        LIZ11.append("audio-effect/");
        X1D.LIZIZ(LIZ11);
        StringBuilder LIZ12 = X1D.LIZ();
        LIZ12.append(str);
        LIZ12.append("music/");
        X1D.LIZIZ(LIZ12);
        StringBuilder LIZ13 = X1D.LIZ();
        LIZ13.append(str);
        LIZ13.append("noCopyDraft/");
        X1D.LIZIZ(LIZ13);
        StringBuilder LIZ14 = X1D.LIZ();
        LIZ14.append(str);
        LIZ14.append("effect/download/");
        X1D.LIZIZ(LIZ14);
        StringBuilder LIZ15 = X1D.LIZ();
        LIZ15.append(str);
        LIZ15.append("compat_draft_track/");
        X1D.LIZIZ(LIZ15);
        C44687HgJ.LJI(new File(str));
    }

    public static String LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append(LIZIZ(str));
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(simpleDateFormat.format(time));
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }
}
