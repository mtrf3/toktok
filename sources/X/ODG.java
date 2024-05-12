package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;
import java.util.List;

/* loaded from: classes11.dex */
public final class ODG extends AbstractC61551ODr<List<UpdatePackage>, List<UpdatePackage>> {
    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        List<UpdatePackage> list = (List) obj;
        OC6.LIZ("gecko-debug-tag", "clean channel old resources before update");
        for (UpdatePackage updatePackage : list) {
            if (updatePackage.getContent() != null && updatePackage.getContent().getStrategy() != null && updatePackage.getContent().getStrategy().getDeleteOldPackageBeforeDownload() == 1) {
                String accessKey = updatePackage.getAccessKey();
                String channel = updatePackage.getChannel();
                C61532OCy c61532OCy = EBC.LIZ;
                c61532OCy.LIZIZ();
                OAY.LIZ().execute(new RunnableC59164NJw(new File(new File(c61532OCy.LJ.getRootDirectory(), accessKey), channel), System.currentTimeMillis(), updatePackage.getVersion(), channel, updatePackage));
            }
        }
        return c61548ODo.LJ(list);
    }
}
