package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* loaded from: classes15.dex */
public class WE1 implements WEL {
    public final String LIZ;
    public final File LIZIZ;
    public final /* synthetic */ WEA LIZJ;

    public final WEK LIZ() {
        File LJIILJJIL = this.LIZJ.LJIILJJIL(this.LIZ);
        try {
            WEC.LIZIZ(this.LIZIZ, LJIILJJIL);
            if (LJIILJJIL.exists()) {
                this.LIZJ.LJII.getClass();
                LJIILJJIL.setLastModified(System.currentTimeMillis());
            }
            return new WEK(LJIILJJIL);
        } catch (C42298Gis e) {
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof WEJ)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            this.LIZJ.LJI.getClass();
            throw e;
        }
    }

    public final void LIZIZ(InterfaceC78787Uw3 interfaceC78787Uw3) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.LIZIZ);
            try {
                C79565VKn c79565VKn = new C79565VKn(fileOutputStream);
                interfaceC78787Uw3.LIZ(c79565VKn);
                c79565VKn.flush();
                long j = c79565VKn.LJLIL;
                fileOutputStream.close();
                if (this.LIZIZ.length() == j) {
                } else {
                    throw new C79563VKl(j, this.LIZIZ.length());
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.LIZJ.LJI.getClass();
            throw e;
        }
    }

    public WE1(WEA wea, String str, File file) {
        this.LIZJ = wea;
        this.LIZ = str;
        this.LIZIZ = file;
    }
}
