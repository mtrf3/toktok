package X;

import Y.IDComparatorS39S0000000_11;
import android.content.Context;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* loaded from: classes12.dex */
public final class PTM implements Q79 {
    public static volatile PTM LJ;
    public final ArrayList<PTK> LIZ = new ArrayList<>();
    public final File LIZIZ;
    public final File LIZJ;
    public final File LIZLLL;

    @Override // X.Q79
    public final void LIZIZ() {
    }

    @Override // X.Q79
    public final boolean LJ() {
        return false;
    }

    @Override // X.Q79
    public final void getName() {
    }

    public static void LJII() {
        try {
            try {
                new PTJ().walk(LJ.LIZIZ, LJ.LIZ);
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                LJIIIIZZ(e);
            }
            PSY.LJFF("SettingAndABRecorder", C16880lQ.LLLZ("loadConf from %s", new Object[]{LJ.LIZIZ.getAbsolutePath()}));
            Collections.sort(LJ.LIZ, new IDComparatorS39S0000000_11(28));
            PSY.LJFF("SettingAndABRecorder", C16880lQ.LLLZ("loadConf items len %d", new Object[]{Integer.valueOf(LJ.LIZ.size())}));
        } catch (IllegalStateException e2) {
            LJIIIIZZ(e2);
            LJFF(LJ.LIZIZ);
        }
    }

    @Override // X.Q79
    public final List<PTL> LIZ() {
        Collections.sort(this.LIZ, new IDComparatorS39S0000000_11(29));
        return this.LIZ;
    }

    public final void LJIIIZ() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZIZ.getAbsolutePath());
            LIZ.append("-tmp");
            File file = new File(X1D.LIZIZ(LIZ));
            FileUtils.forceMkdir(file);
            ArrayList<PTK> arrayList = this.LIZ;
            if (arrayList != null) {
                Iterator<PTK> it = arrayList.iterator();
                while (it.hasNext()) {
                    PTK next = it.next();
                    FileUtils.writeStringToFile(new File(file, String.valueOf(next.LIZ)), next.LIZIZ, Charset.forName("UTF-8"));
                }
            }
            LJFF(this.LIZIZ);
            file.renameTo(this.LIZIZ);
            PSY.LIZIZ("SettingAndABRecorder", C16880lQ.LLLZ("save path: %s", new Object[]{this.LIZIZ.getAbsolutePath()}));
        } catch (IOException e) {
            LJIIIIZZ(e);
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.Q79
    public final void clearAll() {
        try {
            this.LIZ.clear();
            File file = this.LIZIZ;
            if (file != null) {
                C36980EfI.LJ(file.getAbsolutePath());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public PTM(Context context) {
        new Gson();
        File file = new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), "SettingsRecorder");
        this.LIZLLL = file;
        try {
            FileUtils.forceMkdir(file);
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZIZ = new File(this.LIZLLL, "content");
        this.LIZJ = new File(this.LIZLLL, "stable.json");
    }

    public static void LJFF(File file) {
        try {
            if (file.isFile()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete file ");
                LIZ.append(file.getAbsolutePath());
                PSY.LJFF("SettingAndABRecorder", X1D.LIZIZ(LIZ));
                C38891fp.LJIILJJIL(file.getAbsolutePath());
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("delete dir ");
                LIZ2.append(file.getAbsolutePath());
                PSY.LJFF("SettingAndABRecorder", X1D.LIZIZ(LIZ2));
                C36980EfI.LJ(file.getAbsolutePath());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static PTM LJI(Context context) {
        if (LJ == null) {
            synchronized (PTM.class) {
                if (LJ == null) {
                    LJ = new PTM(context);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LJ.LIZIZ.getAbsolutePath());
                    LIZ.append("-tmp");
                    File file = new File(X1D.LIZIZ(LIZ));
                    if (LJ.LIZIZ.exists()) {
                        PSY.LJFF("SettingAndABRecorder", "load contentDir exists");
                        LJFF(file);
                        LJII();
                    } else if (file.exists()) {
                        PSY.LJFF("SettingAndABRecorder", "renameTo contentDir");
                        file.renameTo(LJ.LIZIZ);
                        LJII();
                    }
                }
            }
        }
        return LJ;
    }

    public static void LJIIIIZZ(Throwable th) {
        if (C66465Q6r.LJIILLIIL.LIZIZ != null) {
            PJZ.LIZLLL("LaunchProtectException", C16880lQ.LLLZ("LaunchProtect stage: %d", new Object[]{-1}), th);
        }
    }

    @Override // X.Q79
    public final boolean LIZJ(PTL ptl) {
        if (!(ptl instanceof PTK)) {
            return false;
        }
        PSY.LJFF("SettingAndABRecorder", "begin rollBack: snapshot");
        try {
            PTK ptk = (PTK) ptl;
            C66460Q6m.LIZIZ().getClass();
            PPA ppa = C66465Q6r.LJIILLIIL.LIZIZ;
            System.currentTimeMillis();
            ppa.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZJ.getAbsolutePath());
            LIZ.append("-tmp");
            File file = new File(X1D.LIZIZ(LIZ));
            FileUtils.writeStringToFile(file, ptk.LIZIZ, Charset.forName("UTF-8"));
            LJFF(this.LIZJ);
            file.renameTo(this.LIZJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("rollBack md5: ");
            LIZ2.append(PP9.LIZIZ(ptk.LIZIZ));
            PSY.LIZIZ("SettingAndABRecorder", X1D.LIZIZ(LIZ2));
            PSY.LJFF("SettingAndABRecorder", "end rollBack: snapshot");
            return true;
        } catch (Exception e) {
            LJIIIIZZ(e);
            PSY.LIZJ("write stable file error", e);
            return false;
        }
    }

    @Override // X.Q79
    public final boolean LIZLLL(PTL ptl) {
        if (this.LIZ == null || ptl == null) {
            return false;
        }
        PSY.LJFF("SettingAndABRecorder", C16880lQ.LLLZ("clearSnapshot %d", new Object[]{Long.valueOf(ptl.LIZ)}));
        boolean remove = this.LIZ.remove(ptl);
        PSY.LJFF("SettingAndABRecorder", C16880lQ.LLLZ("clearSnapshot items count %d", new Object[]{Integer.valueOf(this.LIZ.size())}));
        if (remove) {
            LJIIIZ();
        }
        return remove;
    }
}
