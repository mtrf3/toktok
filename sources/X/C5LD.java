package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.experiment.EPCapCutUIMaterial;
import com.ss.android.ugc.aweme.experiment.VideoResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.experiment.EditorProCapCutUIMaterialsSetting$downloadRes$2", f = "EditorProToCapCutExperiment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5LD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C5LD(InterfaceC67352kd<? super C5LD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5LD(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJIILJJIL;
        C141335gf.LIZJ(obj);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EPCapCutUIMaterial ePCapCutUIMaterial = C5H2.LIZ;
        EPCapCutUIMaterial ePCapCutUIMaterial2 = (EPCapCutUIMaterial) LIZLLL.LJIIIIZZ("capcut_edit_pro_materials", EPCapCutUIMaterial.class, ePCapCutUIMaterial);
        if (ePCapCutUIMaterial2 != null) {
            ePCapCutUIMaterial = ePCapCutUIMaterial2;
        }
        List<VideoResource> list = ePCapCutUIMaterial.videoRes;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (VideoResource videoResource : list) {
                VideoResource videoResource2 = videoResource;
                if (C78685UuP.LJJJZ(videoResource2.name) && C78685UuP.LJJJZ(videoResource2.uri)) {
                    arrayList.add(videoResource);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final VideoResource videoResource3 = (VideoResource) it.next();
                DownloadTask with = C84261X5d.with(C60903NvH.LJ);
                with.url(videoResource3.uri);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(videoResource3.uri.hashCode());
                LIZ.append('_');
                LIZ.append(videoResource3.name);
                with.name(X1D.LIZIZ(LIZ));
                LJIILJJIL = C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.EDIT_CAP_CUT_RES, "");
                with.savePath(LJIILJJIL);
                with.retryCount(2);
                with.subThreadListener(new AbsDownloadListener() { // from class: X.6X3
                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onStart(DownloadInfo downloadInfo) {
                        super.onStart(downloadInfo);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("EditorProCapCut ; downloadStart : uri : ");
                        LIZ2.append(VideoResource.this.uri);
                        LIZ2.append(" ; name : ");
                        LIZ2.append(VideoResource.this.name);
                        C5Z2.LIZJ(X1D.LIZIZ(LIZ2));
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        super.onSuccessed(downloadInfo);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("EditorProCapCut ; downloadSuc : uri : ");
                        LIZ2.append(VideoResource.this.uri);
                        LIZ2.append(" ; name : ");
                        LIZ2.append(VideoResource.this.name);
                        C5Z2.LIZJ(X1D.LIZIZ(LIZ2));
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        super.onFailed(downloadInfo, baseException);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("EditorProCapCut ; downloadFailed : uri : ");
                        LIZ2.append(VideoResource.this.uri);
                        LIZ2.append(" ; name : ");
                        LIZ2.append(VideoResource.this.name);
                        C5Z2.LIZJ(X1D.LIZIZ(LIZ2));
                    }
                });
                with.download();
            }
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C5LD(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
