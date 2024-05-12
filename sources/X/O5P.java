package X;

import com.bytedance.geckox.AppSettingsManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class O5P {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public volatile File LIZLLL;
    public volatile Long LJ;
    public volatile O5Q LJFF;
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicBoolean LJII = new AtomicBoolean(false);

    public final void LIZJ() {
        if (this.LJFF != null) {
            this.LJFF.getClass();
        }
        if (AppSettingsManager.LIZ()) {
            if (this.LJII.getAndSet(true)) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZIZ);
            String str = File.separator;
            LIZ.append(str);
            LIZ.append(this.LIZJ);
            LIZ.append(str);
            LIZ.append("select.lock");
            C61456OAa LIZ2 = C61456OAa.LIZ(X1D.LIZIZ(LIZ));
            OC6.LIZ("gecko-file-lock", "channel version loader clean");
            try {
                if (this.LIZLLL == null) {
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this.LIZLLL.getAbsolutePath());
                LIZ3.append(str);
                LIZ3.append("using.lock");
                C61458OAc.LIZJ(X1D.LIZIZ(LIZ3));
                LIZ2.LIZIZ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(this.LIZIZ);
                LIZ4.append(str);
                LIZ4.append(this.LIZJ);
                OAH.LIZIZ(0L, X1D.LIZIZ(LIZ4), false);
                return;
            } finally {
                LIZ2.LIZIZ();
            }
        }
        if (this.LJI.compareAndSet(true, false)) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(this.LIZIZ);
            LIZ5.append(File.separator);
            LIZ5.append(this.LIZJ);
            String LIZIZ = X1D.LIZIZ(LIZ5);
            O5R.LIZLLL(LIZIZ);
            OAH.LIZIZ(0L, LIZIZ, true);
        }
    }

    public final void finalize() {
        super.finalize();
        OC6.LIZ("gecko-debug-tag", "channel loader finalize lock");
        try {
            LIZJ();
        } catch (Throwable th) {
            C45804HyK.LJJLIIIJJIZ(th);
        }
    }

    public final synchronized File LIZ(String str) {
        if (this.LIZLLL != null) {
            return this.LIZLLL;
        }
        if (AppSettingsManager.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZIZ);
            String str2 = File.separator;
            LIZ.append(str2);
            LIZ.append(str);
            LIZ.append(str2);
            LIZ.append("select.lock");
            C61456OAa LIZ2 = C61456OAa.LIZ(X1D.LIZIZ(LIZ));
            try {
                if (this.LJ == null) {
                    this.LJ = OAS.LIZJ(new File(this.LIZIZ, str));
                }
                if (this.LJ == null) {
                    return null;
                }
                String str3 = this.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str2);
                LIZ3.append(str);
                LIZ3.append(str2);
                LIZ3.append(this.LJ);
                LIZ3.append(str2);
                LIZ3.append("using.lock");
                File file = new File(str3, X1D.LIZIZ(LIZ3));
                this.LIZLLL = file.getParentFile();
                C61458OAc.LIZIZ(file.getAbsolutePath());
                return this.LIZLLL;
            } finally {
                LIZ2.LIZIZ();
            }
        }
        if (this.LJ == null) {
            this.LJ = OAS.LIZJ(new File(this.LIZIZ, str));
        }
        if (this.LJ == null) {
            return null;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(this.LIZIZ);
        LIZ4.append(File.separator);
        LIZ4.append(this.LIZJ);
        String LIZIZ = X1D.LIZIZ(LIZ4);
        this.LJI.set(O5R.LIZJ(LIZIZ));
        if (!this.LJI.get()) {
            return null;
        }
        this.LIZLLL = new File(LIZIZ, String.valueOf(this.LJ));
        return this.LIZLLL;
    }

    public final synchronized O5Q LIZIZ(String str) {
        if (this.LJFF != null) {
            return this.LJFF;
        }
        File LIZ = LIZ(str);
        if (LIZ != null) {
            C61511OCd.LJIIJ(System.currentTimeMillis(), this.LIZ, str, LIZ.getName(), "1", "true");
            File file = new File(LIZ, "res");
            if (file.exists() && file.isDirectory()) {
                this.LJFF = new O5Q(LIZ);
                this.LJFF.LIZIZ = this.LIZ;
                this.LJFF.LIZJ = str;
                return this.LJFF;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("can not find res, dir:");
            LIZ2.append(LIZ.getAbsolutePath());
            throw new RuntimeException(X1D.LIZIZ(LIZ2));
        }
        C61511OCd.LJIIJ(System.currentTimeMillis(), this.LIZ, str, "null", "1", "false");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("channel no exist，channel:");
        LIZ3.append(str);
        throw new FileNotFoundException(X1D.LIZIZ(LIZ3));
    }

    public O5P(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
