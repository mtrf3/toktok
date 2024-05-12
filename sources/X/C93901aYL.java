package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.aYL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93901aYL {
    public static Context LIZ;

    public static void LIZ(Context context) {
        long j;
        PackageInfo LLLLLLZ;
        if (LIZ == null) {
            LIZ = context;
            ImageLoaderService.INSTANCE.init(context);
            File LLIIJLIL = C16880lQ.LLIIJLIL(context);
            o.LJIIIIZZ(LLIIJLIL, "context.filesDir");
            String path = LLIIJLIL.getPath();
            o.LJIIIIZZ(path, "context.filesDir.path");
            String LIZIZ = C93965aZN.LIZIZ(path, "EffectEditorMobile");
            C93965aZN.LJI = LIZIZ;
            if (LIZIZ != null) {
                String LIZIZ2 = C93965aZN.LIZIZ(LIZIZ, "ResourceWorkspace");
                if (LIZIZ2 != null) {
                    C93965aZN.LIZIZ(LIZIZ2, "model");
                    String str = C93965aZN.LJI;
                    if (str != null) {
                        String[] strArr = {"cache", "image"};
                        String str2 = "";
                        int i = 0;
                        String str3 = "";
                        do {
                            String str4 = strArr[i];
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str3);
                            LIZ2.append(str4);
                            LIZ2.append(File.separator);
                            str3 = X1D.LIZIZ(LIZ2);
                            i++;
                        } while (i < 2);
                        C93965aZN.LIZ = C93965aZN.LIZIZ(str, str3);
                        String str5 = C93965aZN.LJI;
                        if (str5 != null) {
                            C93965aZN.LIZIZ = C93965aZN.LIZIZ(str5, "drafts");
                            String str6 = C93965aZN.LJI;
                            if (str6 != null) {
                                C93965aZN.LIZJ = C93965aZN.LIZIZ(str6, "draft_path");
                                String str7 = C93965aZN.LJI;
                                if (str7 != null) {
                                    C93965aZN.LIZLLL = C93965aZN.LIZIZ(str7, "drafts_temp");
                                    String str8 = C93965aZN.LJI;
                                    if (str8 != null) {
                                        C93965aZN.LIZIZ(str8, "EffectPackageExport");
                                        String str9 = C93965aZN.LJI;
                                        if (str9 != null) {
                                            C93965aZN.LJ = C93965aZN.LIZIZ(str9, "ProjectWorkingPath");
                                            String str10 = C93965aZN.LJI;
                                            if (str10 != null) {
                                                C93965aZN.LJFF = C93965aZN.LIZIZ(str10, "draft_file");
                                                try {
                                                    LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0);
                                                } catch (Exception e) {
                                                    C16880lQ.LLLLIIL(e);
                                                }
                                                if (LLLLLLZ != null) {
                                                    str2 = LLLLLLZ.versionName;
                                                    o.LJIIIIZZ(str2, "packageInfo.versionName");
                                                    j = LLLLLLZ.versionCode;
                                                    C93728aVY.LIZ = new C94239adn(j, str2);
                                                    return;
                                                }
                                                j = -1;
                                                C93728aVY.LIZ = new C94239adn(j, str2);
                                                return;
                                            }
                                            o.LJIJI("baseDir");
                                            throw null;
                                        }
                                        o.LJIJI("baseDir");
                                        throw null;
                                    }
                                    o.LJIJI("baseDir");
                                    throw null;
                                }
                                o.LJIJI("baseDir");
                                throw null;
                            }
                            o.LJIJI("baseDir");
                            throw null;
                        }
                        o.LJIJI("baseDir");
                        throw null;
                    }
                    o.LJIJI("baseDir");
                    throw null;
                }
                o.LJIJI("RESOURCE_WORKSPACE");
                throw null;
            }
            o.LJIJI("baseDir");
            throw null;
        }
    }
}
