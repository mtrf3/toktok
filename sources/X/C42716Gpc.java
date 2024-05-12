package X;

import defpackage.q;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42716Gpc implements InterfaceC43105Gvt {
    @Override // X.InterfaceC43105Gvt
    public final String cacheDir() {
        return LJ(EnumC42718Gpe.CACHE, null);
    }

    @Override // X.InterfaceC43105Gvt
    public final String LIZ() {
        String str;
        EnumC42719Gpf stage = EnumC42719Gpf.VIDEOEDIT;
        o.LJIIIZ(stage, "stage");
        int i = C42717Gpd.LIZ[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "publish";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str = "videocut";
                }
            } else {
                str = "videoedit";
            }
        } else {
            str = "shoot";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43075GvP.LIZ);
        LIZ.append("shortvideo/");
        LIZ.append(str);
        LIZ.append('/');
        return q.LIZIZ(LIZ, "advanced_edit", '/', LIZ);
    }

    @Override // X.InterfaceC43105Gvt
    public final File LIZJ(String path) {
        o.LJIIIZ(path, "path");
        File file = new File(path);
        GXW.LIZJ();
        return file;
    }

    @Override // X.InterfaceC43105Gvt
    public final String LIZLLL(String str) {
        return LJ(EnumC42718Gpe.RESOURCE, str);
    }

    public static String LJ(EnumC42718Gpe type, String str) {
        String str2;
        o.LJIIIZ(type, "type");
        int i = C42717Gpd.LIZIZ[type.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str2 = "image";
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        str2 = "story";
                    }
                } else {
                    str2 = "draft";
                }
            } else {
                str2 = "resources";
            }
        } else {
            str2 = "cache";
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C43075GvP.LIZ);
            LIZ.append("shortvideo/");
            LIZ.append(str2);
            LIZ.append('/');
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C43075GvP.LIZ);
        LIZ2.append("shortvideo/");
        LIZ2.append(str2);
        LIZ2.append('/');
        return q.LIZIZ(LIZ2, str, '/', LIZ2);
    }

    @Override // X.InterfaceC43105Gvt
    public final File LIZIZ(File parent, String child) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        File file = new File(parent, child);
        GXW.LIZJ();
        return file;
    }
}
