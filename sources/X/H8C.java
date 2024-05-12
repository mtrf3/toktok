package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8C implements InterfaceC43072GvM {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C168826ju.LJLIL);
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC43072GvM
    public final List<File> LJIIL() {
        List<File> LJJZZIII;
        File file = new File(this.LJ);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || (LJJZZIII = ORY.LJJZZIII(listFiles)) == null) {
                return C61878OQg.INSTANCE;
            }
            return LJJZZIII;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC43072GvM
    public final String getRoot() {
        return (String) this.LIZ.getValue();
    }

    public H8C() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getRoot());
        LIZ.append("creative");
        String str = File.separator;
        LIZ.append(str);
        this.LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(getRoot());
        LIZ2.append("public");
        LIZ2.append(str);
        this.LIZJ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(getRoot());
        LIZ3.append("persistent");
        LIZ3.append(str);
        this.LIZLLL = X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(getRoot());
        LIZ4.append("cache");
        LIZ4.append(str);
        this.LJ = X1D.LIZIZ(LIZ4);
    }

    @Override // X.InterfaceC43072GvM
    public final String LJIILIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC43072GvM
    public final String getCacheRoot() {
        return this.LJ;
    }

    @Override // X.InterfaceC43072GvM
    public final String getCreativeRoot() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC43072GvM
    public final String getPersistentRoot() {
        return this.LIZLLL;
    }

    public static String LJIJ(CreativeInfo creativeInfo) {
        String sessionId = creativeInfo.getSessionId();
        if (sessionId == null || sessionId.length() == 0) {
            return creativeInfo.getCreationId();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(creativeInfo.getCreationId());
        LIZ.append(File.separator);
        LIZ.append(creativeInfo.getSessionId());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC43072GvM
    public final String LIZIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LJIJ = LJIJ(creativeInfo);
        StringBuilder sb = new StringBuilder(this.LIZIZ);
        if (creativeInfo.getVersion() < 0) {
            sb.append(LJIJ);
            return C0EH.LIZJ(sb, File.separator, "{\n            pathBuilde…    .toString()\n        }");
        }
        sb.append(LJIJ);
        String str = File.separator;
        sb.append(str);
        sb.append(creativeInfo.getVersion());
        sb.append(str);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "{\n            pathBuilde…    .toString()\n        }");
        return sb2;
    }

    @Override // X.InterfaceC43072GvM
    public final String LIZLLL(CreativeInfo creativeInfo) {
        StringBuilder sb = new StringBuilder(this.LJ);
        sb.append(LJIJ(creativeInfo));
        return C0EH.LIZJ(sb, File.separator, "StringBuilder(cacheRoot)…)\n            .toString()");
    }

    @Override // X.InterfaceC43072GvM
    public final String LJFF(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        StringBuilder sb = new StringBuilder(this.LIZLLL);
        sb.append(LJIJ(creativeInfo));
        return C0EH.LIZJ(sb, File.separator, "StringBuilder(persistent…)\n            .toString()");
    }

    @Override // X.InterfaceC43072GvM
    public final String LJIILLIIL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LJIJ = LJIJ(creativeInfo);
        StringBuilder sb = new StringBuilder(this.LIZIZ);
        sb.append(LJIJ);
        return C0EH.LIZJ(sb, File.separator, "pathBuilder.append(uniqu…)\n            .toString()");
    }

    @Override // X.InterfaceC43072GvM
    public final String LJIILJJIL(EnumC43651HBf resourceType, String subPath) {
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        String str = this.LIZJ + resourceType.getNameSpace() + File.separator + subPath;
        o.LJIIIIZZ(str, "StringBuilder(publicRoot…)\n            .toString()");
        return str;
    }

    @Override // X.InterfaceC43072GvM
    public final File LIZ(EnumC43651HBf resourceType, String subPath, boolean z) {
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        File file = new File(LJIILJJIL(resourceType, subPath));
        if (z) {
            C78966Uyw.LJJJJLL(file);
        }
        return file;
    }

    @Override // X.InterfaceC43072GvM
    public final File LIZJ(EnumC43650HBe resourceType, String subPath, boolean z) {
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        StringBuilder sb = new StringBuilder(this.LJ);
        String str = File.separator;
        sb.append(str);
        sb.append(resourceType.getNameSpace());
        if (subPath.length() > 0) {
            sb.append(str);
            sb.append(subPath);
        }
        File file = new File(sb.toString());
        if (z) {
            C78966Uyw.LJJJJLL(file);
        }
        return file;
    }

    @Override // X.InterfaceC43072GvM
    public final File LJI(CreativeInfo creativeInfo, EnumC43652HBg resourceType, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        if ("tt_creative_data.json".length() > 0) {
            File file = new File(C43073GvN.LJ(this, creativeInfo, resourceType, "tt_creative_data.json", 8));
            if (z) {
                C78966Uyw.LJJJJZ(file);
            }
            return file;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC43072GvM
    public final String LJ(CreativeInfo creativeInfo, EnumC43650HBe resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        String creationId = creativeInfo.getCreationId();
        if (creationId == null || creationId.length() == 0 || creativeInfo.getVersion() < 0) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        StringBuilder sb = new StringBuilder(this.LJ);
        sb.append(LJIJ(creativeInfo));
        String str = File.separator;
        sb.append(str);
        sb.append(resourceType.getNameSpace());
        if (z) {
            C78966Uyw.LJJJJLL(new File(sb.toString()));
        }
        sb.append(str);
        sb.append(subPath);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "resourceDirBuilder\n     …)\n            .toString()");
        return sb2;
    }

    @Override // X.InterfaceC43072GvM
    public final File LJII(CreativeInfo creativeInfo, EnumC43652HBg resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        File file = new File(C43073GvN.LJ(this, creativeInfo, resourceType, subPath, 8));
        if (z) {
            C78966Uyw.LJJJJLL(file);
        }
        return file;
    }

    @Override // X.InterfaceC43072GvM
    public final String LJIIIIZZ(CreativeInfo creativeInfo, EnumC43649HBd resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        String creationId = creativeInfo.getCreationId();
        if (creationId == null || creationId.length() == 0 || creativeInfo.getVersion() < 0) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        StringBuilder sb = new StringBuilder(this.LIZIZ);
        sb.append(LJIJ(creativeInfo));
        String str = File.separator;
        sb.append(str);
        sb.append(creativeInfo.getVersion());
        sb.append(str);
        sb.append(resourceType.getNameSpace());
        if (z) {
            C78966Uyw.LJJJJLL(new File(sb.toString()));
        }
        sb.append(str);
        sb.append(subPath);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "resourceDirBuilder\n     …)\n            .toString()");
        return sb2;
    }

    @Override // X.InterfaceC43072GvM
    public final File LJIIIZ(CreativeInfo creativeInfo, EnumC43649HBd resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        File file = new File(C43073GvN.LIZLLL(this, creativeInfo, resourceType, subPath, false, 8));
        if (z) {
            C78966Uyw.LJJJJLL(file);
        }
        return file;
    }

    @Override // X.InterfaceC43072GvM
    public final File LJIIJ(CreativeInfo creativeInfo, EnumC43650HBe resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        File file = new File(C43073GvN.LIZIZ(this, creativeInfo, resourceType, subPath, 8));
        if (z) {
            C78966Uyw.LJJJJLL(file);
        }
        return file;
    }

    @Override // X.InterfaceC43072GvM
    public final String LJIIJJI(CreativeInfo creativeInfo, EnumC43652HBg resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        String creationId = creativeInfo.getCreationId();
        if (creationId == null || creationId.length() == 0 || creativeInfo.getVersion() < 0) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        StringBuilder sb = new StringBuilder(this.LIZLLL);
        sb.append(LJIJ(creativeInfo));
        String str = File.separator;
        sb.append(str);
        sb.append(resourceType.getNameSpace());
        if (z) {
            C78966Uyw.LJJJJLL(new File(sb.toString()));
        }
        sb.append(str);
        sb.append(subPath);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "resourceDirBuilder\n     …)\n            .toString()");
        return sb2;
    }

    @Override // X.InterfaceC43072GvM
    public final File LJIILL(CreativeInfo creativeInfo, EnumC43649HBd resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        if (subPath.length() > 0) {
            File file = new File(C43073GvN.LIZLLL(this, creativeInfo, resourceType, subPath, false, 8));
            if (z) {
                C78966Uyw.LJJJJZ(file);
            }
            return file;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // X.InterfaceC43072GvM
    public final File LJIIZILJ(CreativeInfo creativeInfo, EnumC43650HBe resourceType, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        if (subPath.length() > 0) {
            File file = new File(C43073GvN.LIZIZ(this, creativeInfo, resourceType, subPath, 8));
            if (z) {
                C78966Uyw.LJJJJZ(file);
            }
            return file;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
