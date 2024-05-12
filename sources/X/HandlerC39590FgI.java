package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.crash.Npth;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FgI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC39590FgI extends Handler {
    public HandlerC39590FgI(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        File LIZ;
        boolean z;
        boolean z2;
        if (!C39591FgJ.LJFF && C39592FgK.LIZ() > 0.8f) {
            if ("local_test".equals(MemoryConfig.getMemoryConfig().channel)) {
                C39594FgM c39594FgM = C39594FgM.LIZ;
                ArrayList arrayList = new ArrayList();
                File[] listFiles = C39591FgJ.LIZ().listFiles(c39594FgM);
                if (listFiles != null) {
                    ORS.LJJLIIIJJIZ(arrayList, listFiles);
                }
                Context context = C39591FgJ.LIZLLL;
                if (context != null) {
                    File[] listFiles2 = new File(C16880lQ.LLIIJLIL(context), "leakcanary").listFiles(c39594FgM);
                    if (listFiles2 != null) {
                        ORS.LJJLIIIJJIZ(arrayList, listFiles2);
                    }
                    int size = arrayList.size() - 7;
                    if (size > 0) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Removing ");
                        LIZ2.append(size);
                        LIZ2.append(" heap dumps");
                        C39596FgO.LIZ(X1D.LIZIZ(LIZ2));
                        C40675Fxn.LJJLIIIJ(arrayList, C39593FgL.LJLIL);
                        int i = 0;
                        do {
                            String absolutePath = ((File) ListProtector.get(arrayList, i)).getAbsolutePath();
                            if (C16880lQ.LLLZZIL((File) ListProtector.get(arrayList, i))) {
                                ((ArrayList) C39591FgJ.LJI).add(absolutePath);
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Could not delete old hprof file ");
                                LIZ3.append(((File) ListProtector.get(arrayList, i)).getPath());
                                C39596FgO.LIZ(X1D.LIZIZ(LIZ3));
                            }
                            i++;
                        } while (i < size);
                    }
                    File LIZ4 = C39591FgJ.LIZ();
                    if ((!LIZ4.mkdirs() && !LIZ4.exists()) || !LIZ4.canWrite()) {
                        if (Build.VERSION.SDK_INT < 23 || C39591FgJ.LIZ) {
                            z2 = true;
                        } else {
                            Context context2 = C39591FgJ.LIZLLL;
                            if (context2 != null) {
                                if (context2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C39591FgJ.LIZ = z;
                                z2 = C39591FgJ.LIZ;
                            } else {
                                o.LJIJI("context");
                                throw null;
                            }
                        }
                        if (z2) {
                            String LLLLLLLZIL = C16880lQ.LLLLLLLZIL();
                            if (!o.LJ("mounted", LLLLLLLZIL)) {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("External storage not mounted, state: ");
                                LIZ5.append(LLLLLLLZIL);
                                C39596FgO.LIZ(X1D.LIZIZ(LIZ5));
                            } else {
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("Could not create heap dump directory in external storage: [");
                                LIZ6.append(LIZ4.getAbsolutePath());
                                LIZ6.append(']');
                                C39596FgO.LIZ(X1D.LIZIZ(LIZ6));
                            }
                        }
                        Context context3 = C39591FgJ.LIZLLL;
                        if (context3 != null) {
                            LIZ4 = new File(C16880lQ.LLIIJLIL(context3), "leakcanary");
                            if ((!LIZ4.mkdirs() && !LIZ4.exists()) || !LIZ4.canWrite()) {
                                C39596FgO.LIZ("Could not create heap dump directory in app storage: [" + LIZ4.getAbsolutePath() + ']');
                                return;
                            }
                        } else {
                            o.LJIJI("context");
                            throw null;
                        }
                    }
                    LIZ = new File(LIZ4, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            } else {
                boolean z3 = MemoryConfig.getMemoryConfig().oversea;
                Context context4 = C39591FgJ.LIZLLL;
                if (context4 != null) {
                    LIZ = F95.LIZ(context4, z3);
                    if (LIZ == null) {
                        return;
                    }
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            }
            try {
                Context context5 = C39591FgJ.LIZLLL;
                if (context5 != null) {
                    F9T.LIZ(context5, LIZ.getAbsolutePath());
                    Npth.dumpHprof(LIZ.getAbsolutePath());
                    return;
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            } catch (Exception unused) {
                return;
            }
        }
        HandlerC39590FgI handlerC39590FgI = C39591FgJ.LIZJ;
        if (handlerC39590FgI != null) {
            handlerC39590FgI.sendEmptyMessageDelayed(0, 180000L);
        }
    }
}
