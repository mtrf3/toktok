package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CeH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31821CeH {
    public static final /* synthetic */ int LIZ = 0;

    public static C31820CeG LIZ(AbstractC31822CeI fileConfig) {
        Boolean bool;
        o.LJIIIZ(fileConfig, "fileConfig");
        if (fileConfig.LJII != null) {
            bool = fileConfig.LJII;
        } else {
            boolean z = true;
            if (fileConfig.LJ.length() <= 0 || o.LJ(fileConfig.LJ, "") || !fileConfig.LJFF || Math.floor(Math.random() * 100) > fileConfig.LIZIZ()) {
                z = false;
            }
            fileConfig.LJII = Boolean.valueOf(z);
            bool = fileConfig.LJII;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            C31820CeG c31820CeG = new C31820CeG();
            c31820CeG.LIZIZ.put("file_scene", fileConfig.LJ);
            c31820CeG.LIZIZ.put("file_dir", fileConfig.LIZIZ.getSimpleString$livebase_release());
            c31820CeG.LIZLLL.put("file_name", fileConfig.LIZ);
            c31820CeG.LIZLLL.put("file_path", C78983UzD.LJJIIJ(fileConfig));
            fileConfig.LIZ(c31820CeG.LIZ, c31820CeG.LIZIZ, c31820CeG.LIZJ, c31820CeG.LIZLLL);
            return c31820CeG;
        }
        return null;
    }
}
