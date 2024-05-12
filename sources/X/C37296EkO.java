package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import defpackage.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EkO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37296EkO extends AbstractC37295EkN {
    public final IAVPublishService LIZ = AVExternalServiceImpl.LIZ().publishService();
    public final int LIZIZ = 86400000;

    @Override // X.AbstractC37295EkN
    public final List<File> LJI() {
        List<File> cacheFileListWithOutPublishing = this.LIZ.getCacheFileListWithOutPublishing();
        ArrayList LIZIZ = s1.LIZIZ(cacheFileListWithOutPublishing, "publishService.cacheFileListWithOutPublishing");
        for (File file : cacheFileListWithOutPublishing) {
            if (file.lastModified() < System.currentTimeMillis() - (this.LIZIZ * 7)) {
                LIZIZ.add(file);
            }
        }
        return LIZIZ;
    }

    @Override // X.AbstractC37295EkN
    public final List<File> LJIIIZ() {
        List<File> notCleanableFileList = this.LIZ.getNotCleanableFileList();
        o.LJIIIIZZ(notCleanableFileList, "publishService.notCleanableFileList");
        return notCleanableFileList;
    }

    @Override // X.AbstractC37295EkN
    public final List<File> LJIIJ() {
        List<File> cacheFileListWithOutPublishing = this.LIZ.getCacheFileListWithOutPublishing();
        ArrayList LIZIZ = s1.LIZIZ(cacheFileListWithOutPublishing, "publishService.cacheFileListWithOutPublishing");
        for (File file : cacheFileListWithOutPublishing) {
            if (file.lastModified() >= System.currentTimeMillis() - (this.LIZIZ * 7)) {
                LIZIZ.add(file);
            }
        }
        return LIZIZ;
    }

    @Override // X.AbstractC37295EkN
    public final EnumC37294EkM LJII() {
        return EnumC37294EkM.CACHE;
    }

    @Override // X.AbstractC37295EkN
    public final C61878OQg LJIIIIZZ() {
        return C61878OQg.INSTANCE;
    }
}
