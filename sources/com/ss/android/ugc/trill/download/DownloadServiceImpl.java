package com.ss.android.ugc.trill.download;

import X.AbstractC44957Hkf;
import X.AbstractC45383HrX;
import X.C44923Hk7;
import X.C45380HrU;
import X.C45385HrZ;
import X.C45387Hrb;
import X.C58096Mr6;
import X.C78688UuS;
import X.EnumC44955Hkd;
import com.ss.android.ugc.aweme.share.downloadv2.IDownloadService;

/* loaded from: classes8.dex */
public final class DownloadServiceImpl implements IDownloadService {
    public static IDownloadService LJ() {
        Object LIZ = C58096Mr6.LIZ(IDownloadService.class, false);
        if (LIZ != null) {
            return (IDownloadService) LIZ;
        }
        if (C58096Mr6.U8 == null) {
            synchronized (IDownloadService.class) {
                if (C58096Mr6.U8 == null) {
                    C58096Mr6.U8 = new DownloadServiceImpl();
                }
            }
        }
        return C58096Mr6.U8;
    }

    @Override // com.ss.android.ugc.aweme.share.downloadv2.IDownloadService
    public final boolean LIZJ() {
        return C78688UuS.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.share.downloadv2.IDownloadService
    public final C45380HrU LIZ(AbstractC44957Hkf abstractC44957Hkf) {
        if (abstractC44957Hkf.LIZLLL == EnumC44955Hkd.AWEME_VIDEO.getType()) {
            return new C45380HrU(abstractC44957Hkf);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.downloadv2.IDownloadService
    public final AbstractC45383HrX LIZIZ(AbstractC44957Hkf abstractC44957Hkf) {
        int i = abstractC44957Hkf.LIZLLL;
        if (i == EnumC44955Hkd.AWEME_VIDEO.getType()) {
            return new C45387Hrb(abstractC44957Hkf);
        }
        if (i == EnumC44955Hkd.AWEME_STORY_PHOTO.getType()) {
            return new C45385HrZ(abstractC44957Hkf);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.downloadv2.IDownloadService
    public final C44923Hk7 LIZLLL(AbstractC44957Hkf abstractC44957Hkf) {
        if (abstractC44957Hkf.LIZLLL == EnumC44955Hkd.AWEME_VIDEO.getType()) {
            return new C44923Hk7(abstractC44957Hkf);
        }
        return null;
    }
}
