package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P8H {
    public static volatile P8I<P8K> LIZ;
    public static final List<InterfaceC37286EkE> LIZIZ = new ArrayList();
    public static P8J LIZJ;

    public static List<InterfaceC37286EkE> LJIIJ() {
        if (LIZJ == null) {
            return LIZIZ;
        }
        List<InterfaceC37286EkE> list = LIZIZ;
        synchronized (list) {
            if (!list.containsAll(LIZJ.LIZ())) {
                ((ArrayList) list).addAll(LIZJ.LIZ());
            }
        }
        return list;
    }

    public static boolean LJIIJJI() {
        if (LIZ != null && LIZ.get() != null) {
            return true;
        }
        return false;
    }

    public static File LIZ(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(parentFile.getFreeSpace());
        LIZ2.append(" ");
        LIZ2.append(1024L);
        X1D.LIZIZ(LIZ2);
        if (parentFile.getFreeSpace() < 1024) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return file;
    }

    public static File LIZJ(Context context) {
        File LLIIIZ;
        try {
            if ("mounted".equals(C16880lQ.LLLLLLLZIL()) && (LLIIIZ = C16880lQ.LLIIIZ(context)) != null) {
                if (LLIIIZ.getFreeSpace() >= LIZ.get().LIZIZ) {
                    return LLIIIZ;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static File LIZLLL(Context context) {
        File LLIIJI;
        try {
            if ("mounted".equals(C16880lQ.LLLLLLLZIL()) && (LLIIJI = C16880lQ.LLIIJI(context, null)) != null && LLIIJI.exists()) {
                if (LLIIJI.getFreeSpace() >= LIZ.get().LIZIZ) {
                    return LLIIJI;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return null;
    }

    public static File LJ(Context context) {
        File LJIIIIZZ = LJIIIIZZ(context);
        if (LJIIIIZZ != null && LJIIIIZZ.exists() && LJIIIIZZ.getFreeSpace() >= LIZ.get().LIZJ) {
            return LJIIIIZZ;
        }
        return null;
    }

    public static File LJFF(Context context) {
        File LJIIIZ = LJIIIZ(context);
        if (LJIIIZ != null && LJIIIZ.exists() && LJIIIZ.getFreeSpace() >= LIZ.get().LIZJ) {
            return LJIIIZ;
        }
        return null;
    }

    public static File LJIIIIZZ(Context context) {
        File[] fileArr;
        P8G LIZ2 = P8G.LIZ(context);
        if (LIZ2 != null && LIZ2.LIZJ()) {
            try {
                fileArr = context.getExternalCacheDirs();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                fileArr = null;
            }
            File LIZIZ2 = LIZIZ(fileArr, context);
            if (LIZIZ2 != null) {
                return LIZIZ2;
            }
            try {
                C16880lQ.LLIIIZ(context);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZ2.LIZLLL);
                LIZ3.append("/Android/data/");
                LIZ3.append(context.getPackageName());
                LIZ3.append("/cache");
                File file = new File(X1D.LIZIZ(LIZ3));
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file.exists()) {
                    return null;
                }
                return file;
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return null;
    }

    public static File LJIIIZ(Context context) {
        File[] fileArr;
        P8G LIZ2 = P8G.LIZ(context);
        if (LIZ2 != null && LIZ2.LIZJ() && !TextUtils.isEmpty(LIZ2.LIZLLL)) {
            try {
                fileArr = context.getExternalFilesDirs(null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                fileArr = null;
            }
            File LIZIZ2 = LIZIZ(fileArr, context);
            if (LIZIZ2 != null) {
                return LIZIZ2;
            }
            try {
                C16880lQ.LLIIJI(context, null);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZ2.LIZLLL);
                LIZ3.append("/Android/data/");
                LIZ3.append(context.getPackageName());
                LIZ3.append("/files");
                File file = new File(X1D.LIZIZ(LIZ3));
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file.exists()) {
                    return null;
                }
                return file;
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return null;
    }

    public static void LJIIL(InterfaceC37286EkE interfaceC37286EkE) {
        List<InterfaceC37286EkE> list = LIZIZ;
        synchronized (list) {
            ((ArrayList) list).add(interfaceC37286EkE);
        }
    }

    public static File LIZIZ(File[] fileArr, Context context) {
        P8G LIZ2;
        if (fileArr != null && (LIZ2 = P8G.LIZ(context)) != null && LIZ2.LIZJ() && !TextUtils.isEmpty(LIZ2.LIZLLL)) {
            for (File file : fileArr) {
                if (file != null && file.getPath() != null && file.getPath().contains(LIZ2.LIZLLL)) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static File LJI(Context context, EnumC47429IjR enumC47429IjR) {
        File file = null;
        if (!LJIIJJI()) {
            return null;
        }
        int i = C47430IjS.LIZ[enumC47429IjR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LIZJ(context);
                        }
                    } else {
                        File LIZJ2 = LIZJ(context);
                        if (LIZJ2 != null) {
                            return LIZJ2;
                        }
                    }
                } else {
                    try {
                        File LLIIIL = C16880lQ.LLIIIL(context);
                        if (LLIIIL != null) {
                            if (LLIIIL.getFreeSpace() >= LIZ.get().LIZ) {
                                file = LLIIIL;
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    if (file == null) {
                        file = LIZJ(context);
                    }
                    if (file != null) {
                        return file;
                    }
                }
            } else {
                File LIZJ3 = LIZJ(context);
                if (LIZJ3 == null) {
                    LIZJ3 = LJ(context);
                }
                if (LIZJ3 != null) {
                    return LIZJ3;
                }
            }
        } else {
            File LJ = LJ(context);
            if (LJ == null) {
                LJ = LIZJ(context);
            }
            if (LJ != null) {
                return LJ;
            }
        }
        return C16880lQ.LLIIIL(context);
    }

    public static File LJII(Context context, EnumC47429IjR enumC47429IjR) {
        File file = null;
        if (!LJIIJJI()) {
            return null;
        }
        int i = C47430IjS.LIZ[enumC47429IjR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LIZLLL(context);
                        }
                    } else {
                        File LIZLLL = LIZLLL(context);
                        if (LIZLLL != null) {
                            return LIZLLL;
                        }
                    }
                } else {
                    try {
                        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
                        if (LLIIJLIL != null && LLIIJLIL.exists()) {
                            if (LLIIJLIL.getFreeSpace() >= LIZ.get().LIZ) {
                                file = LLIIJLIL;
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    if (file == null) {
                        file = LIZLLL(context);
                    }
                    if (file != null) {
                        return file;
                    }
                }
            } else {
                File LIZLLL2 = LIZLLL(context);
                if (LIZLLL2 == null) {
                    LIZLLL2 = LJFF(context);
                }
                if (LIZLLL2 != null) {
                    return LIZLLL2;
                }
            }
        } else {
            File LJFF = LJFF(context);
            if (LJFF == null) {
                LJFF = LIZLLL(context);
            }
            if (LJFF != null) {
                return LJFF;
            }
        }
        return C16880lQ.LLIIJLIL(context);
    }
}
