package X;

import com.bytedance.crash.CrashType;
import java.io.File;

/* loaded from: classes12.dex */
public class PLI {
    public final File LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public final CrashType LJ;
    public final String LJFF;

    public PLI(File file, CrashType crashType) {
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZ = file;
        this.LJ = crashType;
        this.LJFF = file.getName();
    }

    public PLI(File file, long j, CrashType crashType) {
        this.LIZJ = -1L;
        this.LIZ = file;
        this.LIZIZ = j;
        this.LJ = crashType;
        this.LJFF = file.getName();
    }
}
