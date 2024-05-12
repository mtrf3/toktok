package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes7.dex */
public final class FNK {
    public static void LIZ(Context context, boolean z) {
        boolean z2;
        boolean z3;
        if (Build.VERSION.SDK_INT >= 28) {
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(context.getDataDir().getAbsolutePath());
                LIZ.append("/app_webview/webview_data.lock");
                File file = new File(X1D.LIZIZ(LIZ));
                if (!file.exists()) {
                    return;
                }
                boolean z4 = false;
                try {
                    FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                    if (tryLock != null) {
                        tryLock.close();
                        return;
                    }
                    boolean LLLZZIL = C16880lQ.LLLZZIL(file);
                    if (LLLZZIL && !file.exists()) {
                        try {
                            z3 = file.createNewFile();
                        } catch (IOException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        C198517qh c198517qh = new C198517qh();
                        c198517qh.LIZ.put("errorCode", 4005);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("web_view.lock locked, need delete:");
                        LIZ2.append(LLLZZIL);
                        LIZ2.append(" isCreateNew:");
                        LIZ2.append(z3);
                        c198517qh.LIZ.put("errorDesc", X1D.LIZIZ(LIZ2));
                        FUA.LIZJ("web_view_set_directory_error", c198517qh.LJ());
                        return;
                    }
                    z3 = false;
                    C198517qh c198517qh2 = new C198517qh();
                    c198517qh2.LIZ.put("errorCode", 4005);
                    StringBuilder LIZ22 = X1D.LIZ();
                    LIZ22.append("web_view.lock locked, need delete:");
                    LIZ22.append(LLLZZIL);
                    LIZ22.append(" isCreateNew:");
                    LIZ22.append(z3);
                    c198517qh2.LIZ.put("errorDesc", X1D.LIZIZ(LIZ22));
                    FUA.LIZJ("web_view_set_directory_error", c198517qh2.LJ());
                    return;
                } catch (Exception e2) {
                    if (file.exists()) {
                        z2 = C16880lQ.LLLZZIL(file);
                        if (z2 && !file.exists()) {
                            try {
                                z4 = file.createNewFile();
                            } catch (IOException e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    C198517qh c198517qh3 = new C198517qh();
                    c198517qh3.LIZ.put("errorCode", 4004);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("web_view.lock locked, need delete:");
                    LIZ3.append(z2);
                    LIZ3.append(" isCreateNew:");
                    LIZ3.append(z4);
                    LIZ3.append(" e:");
                    LIZ3.append(e2.getMessage());
                    c198517qh3.LIZ.put("errorDesc", X1D.LIZIZ(LIZ3));
                    FUA.LIZJ("web_view_set_directory_error", c198517qh3.LJ());
                    return;
                }
            }
            String LIZ4 = FCD.LIZ(context);
            if (LIZ4 == null) {
                C198517qh c198517qh4 = new C198517qh();
                c198517qh4.LIZ.put("errorCode", 4002);
                c198517qh4.LIZ.put("errorDesc", "processName == null");
                FUA.LIZJ("web_view_set_directory_error", c198517qh4.LJ());
            }
            if (TextUtils.equals("", LIZ4)) {
                C198517qh c198517qh5 = new C198517qh();
                c198517qh5.LIZ.put("errorCode", 4003);
                c198517qh5.LIZ.put("errorDesc", "processName is empty");
                FUA.LIZJ("web_view_set_directory_error", c198517qh5.LJ());
            }
            try {
                WebView.setDataDirectorySuffix(LIZ4);
            } catch (Exception e4) {
                C198517qh c198517qh6 = new C198517qh();
                c198517qh6.LIZ.put("errorCode", 4001);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("setDataDirectorySuffix error:");
                LIZ5.append(e4.getMessage());
                c198517qh6.LIZ.put("errorDesc", X1D.LIZIZ(LIZ5));
                c198517qh6.LIZ.put("processName", LIZ4);
                FUA.LIZJ("web_view_set_directory_error", c198517qh6.LJ());
            }
        }
    }
}
