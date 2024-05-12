package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class ODU extends OE9 {
    public final /* synthetic */ AbstractC61537ODd LIZ;

    public ODU(AbstractC61537ODd abstractC61537ODd) {
        this.LIZ = abstractC61537ODd;
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        UpdatePackage updatePackage = (UpdatePackage) c61546ODm.LIZIZ(C61540ODg.class);
        OC6.LIZ("gecko-debug-tag", "getRetryDownloadListener onStart", updatePackage.toString());
        AbstractC61537ODd abstractC61537ODd = this.LIZ;
        if (abstractC61537ODd != null) {
            abstractC61537ODd.LJIILIIL(updatePackage);
        }
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        if (!(th instanceof C61564OEe) && !(th instanceof C61565OEf)) {
            return;
        }
        UpdatePackage updatePackage = (UpdatePackage) c61546ODm.LIZIZ(C61540ODg.class);
        OC6.LIZ("gecko-debug-tag", "getRetryDownloadListener onException", updatePackage.toString(), th.getMessage());
        AbstractC61537ODd abstractC61537ODd = this.LIZ;
        if (abstractC61537ODd != null) {
            abstractC61537ODd.LJI(updatePackage, th);
        }
        if (updatePackage.getContent() != null && updatePackage.getContent().getStrategy() != null && updatePackage.getContent().getStrategy().getDeleteIfFail() == 1) {
            OC6.LIZ("gecko-debug-tag", "del_if_download_failed");
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            C61532OCy c61532OCy = EBC.LIZ;
            c61532OCy.LIZIZ();
            File rootDirectory = c61532OCy.LJ.getRootDirectory();
            if (rootDirectory != null) {
                OAH.LIZ(new File(new File(rootDirectory, accessKey), channel));
            }
        }
    }
}
