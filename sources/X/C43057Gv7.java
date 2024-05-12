package X;

import android.app.Application;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.storage.StorageServiceImpl;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Gv7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43057Gv7 implements ICacheService {
    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final ArrayList<String> draftMusicList() {
        if (!GXY.LIZ) {
            GXY.LIZIZ();
        }
        ArrayList<String> arrayList = GXY.LIZLLL;
        o.LJIIIIZZ(arrayList, "getDraftMusicList()");
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final void preloadDraftEffectList() {
        EffectPlatform.LJJJLIIL(false);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final Collection<String> allowList() {
        return new StorageServiceImpl().getPrefixAllowList();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String autoCleanMarkDir() {
        String absolutePath = EffectPlatform.LJLJJI.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getEffectCacheDir()");
        return absolutePath;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String cacheDir() {
        String sCacheDir = C43075GvP.LJIIJ;
        o.LJIIIIZZ(sCacheDir, "sCacheDir");
        return sCacheDir;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final void clearCreativeCacheFiles() {
        if (!C41743GZv.LIZ) {
            long currentTimeMillis = System.currentTimeMillis();
            C62822Ol8 c62822Ol8 = C43064GvE.LIZ;
            if (currentTimeMillis - ((Keva) c62822Ol8.getValue()).getLong("key_last_clean_cache_time", 0L) >= 86400000) {
                ((Keva) c62822Ol8.getValue()).storeLong("key_last_clean_cache_time", currentTimeMillis);
                new C43085GvZ().LIZJ();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C62822Ol8 c62822Ol82 = C5WN.LIZ;
        if (currentTimeMillis2 - ((Keva) c62822Ol82.getValue()).getLong("key_last_process_data_time", System.currentTimeMillis()) < 86400000) {
            return;
        }
        C78688UuS.LJFF();
        ((Keva) c62822Ol82.getValue()).storeLong("key_last_process_data_time", currentTimeMillis2);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final void clearDraftEffectCache() {
        try {
            C62822Ol8 c62822Ol8 = C43064GvE.LIZ;
            int i = ((Keva) c62822Ol8.getValue()).getInt("key_invoke_clean_effect_num", 0) + 1;
            C43066GvG.LIZ.getClass();
            FFL.LJIIIZ().getClass();
            if (i < FFL.LJIIJ(31744, 1, "creative_file_standardization_clean_frequency", true)) {
                ((Keva) c62822Ol8.getValue()).storeInt("key_invoke_clean_effect_num", i);
            } else {
                ((Keva) c62822Ol8.getValue()).storeInt("key_invoke_clean_effect_num", 0);
                new C43094Gvi().LIZJ();
                new C43088Gvc().LIZJ();
                new C43086Gva().LIZJ();
                new C43087Gvb().LIZJ();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final void clearEffectCache() {
        String LJJIJ;
        ((Keva) H9H.LIZ.getValue()).clear();
        LJJIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJ("");
        OR7.LLLIIL(new File(LJJIJ));
        OR7.LLLIIL(new File(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJL("")));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final void clearFilterCache() {
        C44172HVg.LJJ.LJIILL().LJI().LJIIL();
        C44172HVg.LJJ.LJIILL().LIZLLL();
        C43731HEh.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String compatMusDraftDir() {
        String sCompatMusDraftDir = C43075GvP.LJIILLIIL;
        o.LJIIIIZZ(sCompatMusDraftDir, "sCompatMusDraftDir");
        return sCompatMusDraftDir;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final Collection<String> draftAllowList() {
        HashSet hashSet = new HashSet();
        for (AwemeDraft awemeDraft : C1DG.LJFF().queryDraftList(new GPJ(false, false, GPH.ALL, null, 23))) {
            if (awemeDraft != null) {
                hashSet.addAll(C60903NvH.LJIIJJI().LJJJI().LIZJ().LIZIZ(awemeDraft));
            }
        }
        hashSet.addAll(C60903NvH.LJIIJJI().LJJJI().LIZJ().LIZLLL());
        return hashSet;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String effectCacheDir() {
        String absolutePath = EffectPlatform.LJLJJI.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getEffectCacheDir()");
        return absolutePath;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String effectModelDir() {
        String absolutePath = EffectPlatform.LJLJJL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getEffectModelCacheDir()");
        return absolutePath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isHasEffectCache() {
        /*
            r2 = this;
            java.io.File r1 = new java.io.File
            java.io.File r0 = com.ss.android.ugc.aweme.effectplatform.EffectPlatform.LJLJJI
            java.lang.String r0 = r0.getAbsolutePath()
            r1.<init>(r0)
            java.lang.String[] r0 = r1.list()
            if (r0 == 0) goto L15
            int r1 = r0.length
            r0 = 0
            if (r1 != 0) goto L16
        L15:
            r0 = 1
        L16:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43057Gv7.isHasEffectCache():boolean");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final Collection<String> originSoundFile() {
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        ArrayList<OriginalSoundUploadTask> LIZIZ = HGH.LIZ(application).LIZIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
        Iterator<OriginalSoundUploadTask> it = LIZIZ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().originalSoundPath);
        }
        return C61898ORa.LJIILL(arrayList.toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final File[] outputFile() {
        File[] listFiles = new File(cacheDir()).listFiles(C43062GvC.LIZ);
        o.LJIIIIZZ(listFiles, "file.listFiles { pathnam…X_MIX))\n                }");
        return listFiles;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final File[] rawDuetFile() {
        File[] listFiles = new File(C43075GvP.LJIIJ).listFiles(C43058Gv8.LIZ);
        o.LJIIIIZZ(listFiles, "file.listFiles { pathnam…X_MP4))\n                }");
        return listFiles;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final File[] rawVideoFile() {
        File[] listFiles = new File(C43075GvP.LJIIJ).listFiles(C43059Gv9.LIZ);
        o.LJIIIIZZ(listFiles, "file.listFiles { pathnam…UFFIX))\n                }");
        return listFiles;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String rootDir() {
        String sDir = C43075GvP.LIZ;
        o.LJIIIIZZ(sDir, "sDir");
        return sDir;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String stickerDir() {
        String sStickerDir = C44529Hdl.LJIIZILJ;
        o.LJIIIIZZ(sStickerDir, "sStickerDir");
        return sStickerDir;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final File[] synthesisFile() {
        File[] listFiles = new File(C43075GvP.LJIIJ).listFiles(C43060GvA.LIZ);
        o.LJIIIIZZ(listFiles, "file.listFiles { pathnam…RAIL)))\n                }");
        return listFiles;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final File[] tempDuetFile() {
        File[] listFiles = new File(C43075GvP.LJIIJ).listFiles(C43061GvB.LIZ);
        o.LJIIIIZZ(listFiles, "file.listFiles { pathnam…UFFIX))\n                }");
        return listFiles;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final Collection<String> tempVideoFile() {
        HashSet hashSet = new HashSet();
        new File(C43075GvP.LIZIZ).getAbsolutePath();
        return hashSet;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final File[] voiceFile() {
        File[] listFiles = new File(cacheDir()).listFiles(C43063GvD.LIZ);
        o.LJIIIIZZ(listFiles, "file.listFiles { pathnam…X_MIX))\n                }");
        return listFiles;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final void clearExpiredDrafts() {
        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new GLP(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String duetPublicDir() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJJLI("");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String musicDir() {
        String LJIIIIZZ;
        LJIIIIZZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIIIZZ("");
        return LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String mvRootDir() {
        StringBuilder LIZ = X1D.LIZ();
        String absolutePath = C60903NvH.LJ.getFilesDir().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getApplication().filesDir.absolutePath");
        LIZ.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ.append("mvtheme");
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String shareDir() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJI("");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String stitchPublicDir() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String duetCacheDir(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIFFI(new CreativeInfo(creationId, 0, null, 6, null));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String duetCreativeDir(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIJZLJL(new CreativeInfo(creationId, 0, null, 6, null), "");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICacheService
    public final String shareCreativeDir(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(creativeInfo));
        return JBR.LJFF(LIZ, File.separator, "record", LIZ);
    }
}
