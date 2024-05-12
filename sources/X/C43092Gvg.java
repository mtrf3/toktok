package X;

import com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService;
import com.ss.android.ugc.aweme.storage.MusicStorageCleanServiceImpl;
import java.io.File;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.Gvg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43092Gvg extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-music";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "music-res";
    }

    @Override // X.AbstractC43051Gv1, X.InterfaceC37286EkE
    public final boolean LIZ() {
        IMusicStorageCleanService iMusicStorageCleanService;
        Object LIZ = C58096Mr6.LIZ(IMusicStorageCleanService.class, false);
        if (LIZ != null) {
            iMusicStorageCleanService = (IMusicStorageCleanService) LIZ;
        } else {
            if (C58096Mr6.o7 == null) {
                synchronized (IMusicStorageCleanService.class) {
                    if (C58096Mr6.o7 == null) {
                        C58096Mr6.o7 = new MusicStorageCleanServiceImpl();
                    }
                }
            }
            iMusicStorageCleanService = C58096Mr6.o7;
        }
        iMusicStorageCleanService.LIZ(new AqS173S0100000_7(this, 292));
        return true;
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(C60903NvH.LJIIJJI().LJJIJ().getDownloadDir());
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        if (!LIZLLL().exists()) {
            return true;
        }
        C43098Gvm c43098Gvm = new C43098Gvm(GXW.LIZIZ(), 2);
        C39532FfM c39532FfM = new C39532FfM(3);
        c39532FfM.LIZ(c43098Gvm);
        c39532FfM.LIZLLL(LIZLLL());
        c43098Gvm.LIZIZ();
        return true;
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        C43099Gvn c43099Gvn = new C43099Gvn(GXW.LIZIZ(), null, 2);
        if (LIZLLL().exists()) {
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43099Gvn);
            c39532FfM.LIZLLL(LIZLLL());
        }
        return c43099Gvn.LIZJ + 0;
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.RESOURCE;
    }
}
