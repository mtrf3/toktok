package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl;
import com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;
import java.io.File;

/* loaded from: classes16.dex */
public final class XPS {
    public static XPS LJ;
    public static final long LJFF;
    public XPT LIZ;
    public XPT LIZIZ;
    public Context LIZJ;
    public boolean LIZLLL;

    static {
        int i = 30000;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("music_media_player_time", 30000);
        } catch (Throwable unused) {
        }
        LJFF = i;
    }

    public static XPS LIZLLL() {
        if (LJ == null) {
            synchronized (XPS.class) {
                if (LJ == null) {
                    LJ = new XPS();
                }
            }
        }
        return LJ;
    }

    public final String LIZ() {
        if (this.LIZ == null) {
            LJ();
        }
        String path = this.LIZ.getPath();
        if (path.endsWith("/")) {
            return path;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(path);
        LIZ.append(File.separator);
        return X1D.LIZIZ(LIZ);
    }

    public final void LJ() {
        if (!this.LIZLLL) {
            synchronized (this) {
                if (!this.LIZLLL) {
                    IProviderConfigOut LIZJ = ProviderConfigOutImpl.LIZJ();
                    if (LIZJ != null) {
                        this.LIZJ = LIZJ.getContext();
                        LIZJ.LIZ();
                        this.LIZ = XPR.LJLIL;
                        LIZJ.LIZIZ();
                        this.LIZIZ = C79156V4u.LJLJL;
                    }
                    this.LIZLLL = true;
                }
            }
        }
    }

    public final String LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        if (this.LIZ == null) {
            LJ();
        }
        LIZ.append(this.LIZ.getPath());
        LIZ.append(C30581Hy.LJIILL(str));
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ());
        LIZ.append(C30581Hy.LJIILL(str));
        return X1D.LIZIZ(LIZ);
    }
}
