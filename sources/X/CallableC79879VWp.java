package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;
import java.io.File;
import java.util.concurrent.Callable;
import ujb.o;

/* renamed from: X.VWp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC79879VWp<V> implements Callable<C79877VWn<String>> {
    public final /* synthetic */ LynxAlphaVideo LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public CallableC79879VWp(LynxAlphaVideo lynxAlphaVideo, String str, String str2) {
        this.LJLIL = lynxAlphaVideo;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // java.util.concurrent.Callable
    public final C79877VWn<String> call() {
        String LIZIZ;
        try {
            File file = new File(this.LJLILLLLZI);
            if (file.isDirectory()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("try to load resource which is already unzip, directUrl is ");
                LIZ.append(this.LJLJI);
                LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
                LynxAlphaVideo lynxAlphaVideo = this.LJLIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(file.getAbsolutePath());
                LIZ2.append(File.separator);
                lynxAlphaVideo.LJLJI = lynxAlphaVideo.LJIJJLI(X1D.LIZIZ(LIZ2));
                return new C79877VWn<>("success");
            }
            if (o.LJJJJ(this.LJLILLLLZI, ".zip", false)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("try to load .zip resource, directUrl is ");
                LIZ3.append(this.LJLJI);
                LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                VNU lynxContext = this.LJLIL.mContext;
                kotlin.jvm.internal.o.LJFF(lynxContext, "lynxContext");
                File cacheDir = lynxContext.getCacheDir();
                kotlin.jvm.internal.o.LJFF(cacheDir, "lynxContext.cacheDir");
                LIZ4.append(cacheDir.getAbsolutePath());
                String str = File.separator;
                LIZ4.append(str);
                LIZ4.append("x_alpha-video");
                String LIZIZ2 = X1D.LIZIZ(LIZ4);
                File file2 = new File(LIZIZ2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ2);
                LIZ5.append(str);
                LynxAlphaVideo lynxAlphaVideo2 = this.LJLIL;
                String str2 = this.LJLJI;
                lynxAlphaVideo2.getClass();
                LIZ5.append(LynxAlphaVideo.LJIL(str2));
                String LIZIZ3 = X1D.LIZIZ(LIZ5);
                try {
                    String LIZ6 = C31972Cgi.LIZ(file, LIZIZ3);
                    kotlin.jvm.internal.o.LJFF(LIZ6, "unZipper.unzip(resource, cacheDir)");
                    if (kotlin.jvm.internal.o.LJ(LIZ6, "")) {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append(LIZIZ3);
                        LIZ7.append(str);
                        LIZIZ = X1D.LIZIZ(LIZ7);
                    } else {
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append(LIZIZ3);
                        LIZ8.append(str);
                        LIZ8.append(LIZ6);
                        LIZIZ = X1D.LIZIZ(LIZ8);
                    }
                    LynxAlphaVideo lynxAlphaVideo3 = this.LJLIL;
                    lynxAlphaVideo3.LJLJI = lynxAlphaVideo3.LJIJJLI(LIZIZ);
                    return new C79877VWn<>("success");
                } catch (Exception e) {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("unzip resource failed, error msg is ");
                    LIZ9.append(e.getMessage());
                    return new C79877VWn<>(X1D.LIZIZ(LIZ9));
                }
            }
            return new C79877VWn<>("fail, resource type is not support");
        } catch (Exception e2) {
            return new C79877VWn<>(C1DD.LJ("fail, error msg is ", e2));
        }
    }
}
