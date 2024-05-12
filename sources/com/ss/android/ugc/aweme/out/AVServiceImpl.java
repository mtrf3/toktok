package com.ss.android.ugc.aweme.out;

import X.C16880lQ;
import X.C41981Gdl;
import X.C44172HVg;
import X.C46104I7o;
import X.C58096Mr6;
import X.C60903NvH;
import X.GUH;
import X.HLU;
import X.HLV;
import X.HMY;
import X.InterfaceC171126nc;
import X.R39;
import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.librarian.Librarian;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVServiceImpl implements IInternalAVService {
    public final C41981Gdl LIZ = new C41981Gdl();
    public SDKServiceImpl LIZIZ;
    public VideoCoverServiceImpl LIZJ;

    static {
        TENativeLibsLoader.setLibraryHooker(R39.LJLIL);
    }

    public static IInternalAVService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IInternalAVService.class, false);
        if (LIZ != null) {
            return (IInternalAVService) LIZ;
        }
        if (C58096Mr6.K3 == null) {
            synchronized (IInternalAVService.class) {
                if (C58096Mr6.K3 == null) {
                    C58096Mr6.K3 = new AVServiceImpl();
                }
            }
        }
        return C58096Mr6.K3;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IEffectService effectService() {
        return EffectService.Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final ISDKService getSDKService() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new SDKServiceImpl();
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void tryCopyDuetDefaultLayout() {
        if (Keva.getRepo("duet_layout").getInt("duet_layout_version", 0) < 1) {
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", false);
            Keva.getRepo("duet_layout").storeInt("duet_layout_version", 1);
        }
        if (HLU.LIZIZ()) {
            return;
        }
        File file = new File(HLU.LIZ());
        try {
            InputStream open = C60903NvH.LJ.getAssets().open("duet_default_layout.zip");
            o.LJIIIIZZ(open, "assetManager.open(DUET_LAYOUT_NAME)");
            String absolutePath = file.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "file.absolutePath");
            C16880lQ.LJJLL(open, absolutePath);
            Keva.getRepo("duet_layout").storeBoolean("duet_layout_file_copied", true);
        } catch (IOException unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IVideoCoverService videoCoverService() {
        if (this.LIZJ == null) {
            this.LIZJ = new VideoCoverServiceImpl();
        }
        VideoCoverServiceImpl videoCoverServiceImpl = this.LIZJ;
        o.LJI(videoCoverServiceImpl);
        return videoCoverServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IAVSettingsService avSettingsService() {
        AVSettingsServiceImpl aVSettingsServiceImpl = AVSettingsServiceImpl.getInstance();
        o.LJIIIIZZ(aVSettingsServiceImpl, "getInstance()");
        return aVSettingsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IFilterService getFilterService() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final VideoExposureData convertToExposureData(Object obj) {
        o.LJI(obj);
        VideoExposureData asExposureData = VideoPublishEditModel.asExposureData(obj);
        o.LJIIIIZZ(asExposureData, "asExposureData(`object`!!)");
        return asExposureData;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        o.LJI(context);
        return new HMY(context);
    }

    @Override // com.ss.android.ugc.aweme.services.IInternalAVService
    public final boolean isPublishing(Context context) {
        return GUH.LJIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final String photoDir(CreativeInfo creativeInfo) {
        InterfaceC171126nc pathAdapter = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter();
        o.LJI(creativeInfo);
        return pathAdapter.LJJJIL(creativeInfo);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void fetchResourcesNeededByRequirements(String[] requirements, IFoundationAVService.IFetchResourcesListener listener) {
        o.LJIIIZ(requirements, "requirements");
        o.LJIIIZ(listener, "listener");
        C44172HVg.LIZJ();
        DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(requirements, new HLV(listener));
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void loadLibrary(String str, Application application) {
        Librarian.LJFF(application, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService
    public final void setLastStickerId(String str, int i) {
        C46104I7o.LJJJI(str, i);
    }
}
