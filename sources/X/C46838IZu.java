package X;

import android.app.Application;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.IZu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46838IZu implements InterfaceC46857IaD {
    public final /* synthetic */ C46837IZt LIZ;

    public final String LIZ() {
        EnumC46736IVw LIZJ;
        String absolutePath;
        if (!TextUtils.isEmpty(this.LIZ.LJLJI) && (LIZJ = C46734IVu.LIZJ(this.LIZ.LJLJI)) != null) {
            C46837IZt c46837IZt = this.LIZ;
            c46837IZt.getClass();
            if (!TextUtils.isEmpty(LIZJ.getCacheDir())) {
                if (!TextUtils.isEmpty(c46837IZt.LJLJJI)) {
                    absolutePath = c46837IZt.LJLJJI;
                } else {
                    Application application = C46982IcE.LIZ;
                    if (application != null) {
                        File LLIIIL = C16880lQ.LLIIIL(application);
                        if (IZ8.LJJIJIL()) {
                            if (C46982IcE.LIZIZ().isDebug()) {
                                LLIIIL = C77413UZt.LJIIL(application);
                            }
                            if (TextUtils.equals("playback_simulator_test", C46982IcE.LIZIZ().getChannel())) {
                                LLIIIL = C77413UZt.LJIIL(application);
                            }
                        }
                        if (LLIIIL != null) {
                            absolutePath = LLIIIL.getAbsolutePath();
                            c46837IZt.LJLJJI = absolutePath;
                        }
                    }
                    absolutePath = null;
                }
                File file = new File(absolutePath, LIZJ.getCacheDir());
                if (!file.isDirectory()) {
                    C16880lQ.LLLZZIL(file);
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                return file.getAbsolutePath();
            }
        }
        return "";
    }

    public C46838IZu(C46837IZt c46837IZt) {
        this.LIZ = c46837IZt;
    }
}
