package X;

import Y.IDRunnableS0S0201000;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.09b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C027909b {
    public final AssetManager LIZ;
    public final Executor LIZIZ;
    public final InterfaceC028009c LIZJ;
    public final byte[] LIZLLL;
    public final File LJ;
    public final String LJFF;
    public boolean LJI;
    public C22460uQ[] LJII;
    public byte[] LJIIIIZZ;

    public final InputStream LIZ(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.LIZJ.LIZLLL();
            }
            return null;
        }
    }

    public final void LIZIZ(int i, Object obj) {
        this.LIZIZ.execute(new IDRunnableS0S0201000(i, this, obj, 15));
    }

    public C027909b(AssetManager assetManager, Executor executor, InterfaceC028009c interfaceC028009c, String str, File file) {
        byte[] bArr;
        this.LIZ = assetManager;
        this.LIZIZ = executor;
        this.LIZJ = interfaceC028009c;
        this.LJFF = str;
        this.LJ = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 33) {
            bArr = null;
        } else {
            switch (i) {
                case 24:
                case 25:
                    bArr = C22530uX.LJ;
                    break;
                case 26:
                    bArr = C22530uX.LIZLLL;
                    break;
                case 27:
                    bArr = C22530uX.LIZJ;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C22530uX.LIZIZ;
                    break;
                default:
                    bArr = C22530uX.LIZ;
                    break;
            }
        }
        this.LIZLLL = bArr;
    }
}
