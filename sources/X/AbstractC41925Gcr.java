package X;

import Y.AfS59S0100000_7;
import android.graphics.Bitmap;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gcr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41925Gcr {
    public static final /* synthetic */ int LJII = 0;
    public final int LIZ = 256;
    public long LIZIZ;
    public final C73318Sq2 LIZJ;
    public long LIZLLL;
    public XKQ LJ;
    public final C62822Ol8 LJFF;
    public final C73849Syb<String> LJI;

    public abstract Object LIZ(InterfaceC67352kd interfaceC67352kd);

    public abstract String LJFF();

    public static int LJ() {
        if (C00F.LIZ(31744, 0, "enable_music_new_format", true) != 0) {
            return 10;
        }
        return 5;
    }

    public void LIZIZ() {
        XKQ xkq = this.LJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJ = null;
        this.LIZJ.dispose();
        C44687HgJ.LJIIL(new File(LIZLLL()));
    }

    public final String LIZLLL() {
        Object value = this.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-cacheDir>(...)");
        return (String) value;
    }

    public AbstractC41925Gcr() {
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LIZJ = c73318Sq2;
        this.LJFF = C221108m2.LIZIZ(C41926Gcs.LJLIL);
        C73849Syb<String> c73849Syb = new C73849Syb<>();
        this.LJI = c73849Syb;
        c73318Sq2.LIZ(new C73426Srm(c73849Syb).LJJJLIIL(new AfS59S0100000_7(this, 25), C73674Svm.LIZLLL));
    }

    public void LJIIJ() {
        if (!C1B8.LIZJ()) {
            this.LJI.onNext("");
            return;
        }
        String LJJZZIII = this.LJI.LJJZZIII();
        if (LJJZZIII != null) {
            this.LJI.onNext(LJJZZIII);
        } else {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C41924Gcq(this, null), 3);
        }
    }

    public static void LJII(C145995oB c145995oB) {
        c145995oB.LIZ(LJ(), "photo_to_video_assets_count");
        FMX.LJIIL("monitor_ies_ai_recommend_video_frames_upload_monitor", c145995oB.LIZ);
    }

    public final void LIZJ(String str) {
        this.LJI.onNext(str);
    }

    public static void LJI(long j, long j2) {
        C145995oB LIZ = UFE.LIZ(j, "extraction_time");
        LIZ.LIZIZ(j2, "video_length");
        LJII(LIZ);
    }

    public static String LJIIIIZZ(String str, List resultFileList) {
        boolean z;
        File file;
        long j;
        o.LJIIIZ(resultFileList, "resultFileList");
        long currentTimeMillis = System.currentTimeMillis();
        String LIZ = C38978FRm.LIZ(str, resultFileList);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (LIZ == null || LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                file = new File(LIZ);
            } catch (SecurityException unused) {
            }
            if (file.exists()) {
                long length = file.length();
                if (length > 0) {
                    j = length / 1024;
                    C145995oB LIZ2 = UFE.LIZ(currentTimeMillis2, "zip_time");
                    LIZ2.LIZIZ(j, "total_size");
                    LJII(LIZ2);
                    return LIZ;
                }
            }
        }
        j = -1;
        C145995oB LIZ22 = UFE.LIZ(currentTimeMillis2, "zip_time");
        LIZ22.LIZIZ(j, "total_size");
        LJII(LIZ22);
        return LIZ;
    }

    public final File LJIIIZ(int i, Bitmap bitmap) {
        String str;
        if (C41920Gcm.LIZ()) {
            str = ".webp";
        } else {
            str = ".jpg";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZLLL());
        LIZ.append(File.separator);
        LIZ.append(i);
        LIZ.append(str);
        File file = new File(X1D.LIZIZ(LIZ));
        String LIZLLL = LIZLLL();
        String name = file.getName();
        o.LJIIIIZZ(name, "file.name");
        C86793Y4n.LJJIJL(bitmap, LIZLLL, name, C41920Gcm.LIZ());
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return file;
    }
}
